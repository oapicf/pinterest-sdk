use async_trait::async_trait;
use futures::{Stream, future, future::BoxFuture, stream, future::TryFutureExt, future::FutureExt, stream::StreamExt};
use hyper::header::{HeaderName, HeaderValue, CONTENT_TYPE};
use hyper::{Body, Request, Response, service::Service, Uri};
use percent_encoding::{utf8_percent_encode, AsciiSet};
use std::borrow::Cow;
use std::convert::TryInto;
use std::io::{ErrorKind, Read};
use std::error::Error;
use std::future::Future;
use std::fmt;
use std::marker::PhantomData;
use std::path::Path;
use std::sync::{Arc, Mutex};
use std::str;
use std::str::FromStr;
use std::string::ToString;
use std::task::{Context, Poll};
use swagger::{ApiError, AuthData, BodyExt, Connector, DropContextService, Has, XSpanIdString};
use url::form_urlencoded;


use crate::models;
use crate::header;

/// https://url.spec.whatwg.org/#fragment-percent-encode-set
#[allow(dead_code)]
const FRAGMENT_ENCODE_SET: &AsciiSet = &percent_encoding::CONTROLS
    .add(b' ').add(b'"').add(b'<').add(b'>').add(b'`');

/// This encode set is used for object IDs
///
/// Aside from the special characters defined in the `PATH_SEGMENT_ENCODE_SET`,
/// the vertical bar (|) is encoded.
#[allow(dead_code)]
const ID_ENCODE_SET: &AsciiSet = &FRAGMENT_ENCODE_SET.add(b'|');

use crate::{Api,
     AdAccountAnalyticsResponse,
     AdAccountsListResponse,
     AdGroupsAnalyticsResponse,
     AdGroupsListResponse,
     AdsAnalyticsResponse,
     AdsListResponse,
     AnalyticsCreateReportResponse,
     AnalyticsGetReportResponse,
     CampaignsAnalyticsResponse,
     CampaignsListResponse,
     ProductGroupsAnalyticsResponse,
     BoardSectionsCreateResponse,
     BoardSectionsDeleteResponse,
     BoardSectionsListResponse,
     BoardSectionsListPinsResponse,
     BoardSectionsUpdateResponse,
     BoardsCreateResponse,
     BoardsDeleteResponse,
     BoardsGetResponse,
     BoardsListResponse,
     BoardsListPinsResponse,
     BoardsUpdateResponse,
     CatalogsProductGroupsCreateResponse,
     CatalogsProductGroupsDeleteResponse,
     CatalogsProductGroupsListResponse,
     CatalogsProductGroupsUpdateResponse,
     FeedProcessingResultsListResponse,
     FeedsCreateResponse,
     FeedsDeleteResponse,
     FeedsGetResponse,
     FeedsListResponse,
     FeedsUpdateResponse,
     ItemsBatchGetResponse,
     ItemsBatchPostResponse,
     ItemsGetResponse,
     MediaCreateResponse,
     MediaGetResponse,
     MediaListResponse,
     OauthTokenResponse,
     PinsAnalyticsResponse,
     PinsCreateResponse,
     PinsDeleteResponse,
     PinsGetResponse,
     UserAccountAnalyticsResponse,
     UserAccountGetResponse
     };

/// Convert input into a base path, e.g. "http://example:123". Also checks the scheme as it goes.
fn into_base_path(input: impl TryInto<Uri, Error=hyper::http::uri::InvalidUri>, correct_scheme: Option<&'static str>) -> Result<String, ClientInitError> {
    // First convert to Uri, since a base path is a subset of Uri.
    let uri = input.try_into()?;

    let scheme = uri.scheme_str().ok_or(ClientInitError::InvalidScheme)?;

    // Check the scheme if necessary
    if let Some(correct_scheme) = correct_scheme {
        if scheme != correct_scheme {
            return Err(ClientInitError::InvalidScheme);
        }
    }

    let host = uri.host().ok_or_else(|| ClientInitError::MissingHost)?;
    let port = uri.port_u16().map(|x| format!(":{}", x)).unwrap_or_default();
    Ok(format!("{}://{}{}{}", scheme, host, port, uri.path().trim_end_matches('/')))
}

/// A client that implements the API by making HTTP calls out to a server.
pub struct Client<S, C> where
    S: Service<
           (Request<Body>, C),
           Response=Response<Body>> + Clone + Sync + Send + 'static,
    S::Future: Send + 'static,
    S::Error: Into<crate::ServiceError> + fmt::Display,
    C: Clone + Send + Sync + 'static
{
    /// Inner service
    client_service: S,

    /// Base path of the API
    base_path: String,

    /// Marker
    marker: PhantomData<fn(C)>,
}

impl<S, C> fmt::Debug for Client<S, C> where
    S: Service<
           (Request<Body>, C),
           Response=Response<Body>> + Clone + Sync + Send + 'static,
    S::Future: Send + 'static,
    S::Error: Into<crate::ServiceError> + fmt::Display,
    C: Clone + Send + Sync + 'static
{
    fn fmt(&self, f: &mut fmt::Formatter<'_>) -> fmt::Result {
        write!(f, "Client {{ base_path: {} }}", self.base_path)
    }
}

impl<S, C> Clone for Client<S, C> where
    S: Service<
           (Request<Body>, C),
           Response=Response<Body>> + Clone + Sync + Send + 'static,
    S::Future: Send + 'static,
    S::Error: Into<crate::ServiceError> + fmt::Display,
    C: Clone + Send + Sync + 'static
{
    fn clone(&self) -> Self {
        Self {
            client_service: self.client_service.clone(),
            base_path: self.base_path.clone(),
            marker: PhantomData,
        }
    }
}

impl<Connector, C> Client<DropContextService<hyper::client::Client<Connector, Body>, C>, C> where
    Connector: hyper::client::connect::Connect + Clone + Send + Sync + 'static,
    C: Clone + Send + Sync + 'static,
{
    /// Create a client with a custom implementation of hyper::client::Connect.
    ///
    /// Intended for use with custom implementations of connect for e.g. protocol logging
    /// or similar functionality which requires wrapping the transport layer. When wrapping a TCP connection,
    /// this function should be used in conjunction with `swagger::Connector::builder()`.
    ///
    /// For ordinary tcp connections, prefer the use of `try_new_http`, `try_new_https`
    /// and `try_new_https_mutual`, to avoid introducing a dependency on the underlying transport layer.
    ///
    /// # Arguments
    ///
    /// * `base_path` - base path of the client API, i.e. "http://www.my-api-implementation.com"
    /// * `protocol` - Which protocol to use when constructing the request url, e.g. `Some("http")`
    /// * `connector` - Implementation of `hyper::client::Connect` to use for the client
    pub fn try_new_with_connector(
        base_path: &str,
        protocol: Option<&'static str>,
        connector: Connector,
    ) -> Result<Self, ClientInitError>
    {
        let client_service = hyper::client::Client::builder().build(connector);
        let client_service = DropContextService::new(client_service);

        Ok(Self {
            client_service,
            base_path: into_base_path(base_path, protocol)?,
            marker: PhantomData,
        })
    }
}

#[derive(Debug, Clone)]
pub enum HyperClient {
    Http(hyper::client::Client<hyper::client::HttpConnector, Body>),
    Https(hyper::client::Client<HttpsConnector, Body>),
}

impl Service<Request<Body>> for HyperClient {
    type Response = Response<Body>;
    type Error = hyper::Error;
    type Future = hyper::client::ResponseFuture;

    fn poll_ready(&mut self, cx: &mut Context) -> Poll<Result<(), Self::Error>> {
       match self {
          HyperClient::Http(client) => client.poll_ready(cx),
          HyperClient::Https(client) => client.poll_ready(cx),
       }
    }

    fn call(&mut self, req: Request<Body>) -> Self::Future {
       match self {
          HyperClient::Http(client) => client.call(req),
          HyperClient::Https(client) => client.call(req)
       }
    }
}

impl<C> Client<DropContextService<HyperClient, C>, C> where
    C: Clone + Send + Sync + 'static,
{
    /// Create an HTTP client.
    ///
    /// # Arguments
    /// * `base_path` - base path of the client API, i.e. "http://www.my-api-implementation.com"
    pub fn try_new(
        base_path: &str,
    ) -> Result<Self, ClientInitError> {
        let uri = Uri::from_str(base_path)?;

        let scheme = uri.scheme_str().ok_or(ClientInitError::InvalidScheme)?;
        let scheme = scheme.to_ascii_lowercase();

        let connector = Connector::builder();

        let client_service = match scheme.as_str() {
            "http" => {
                HyperClient::Http(hyper::client::Client::builder().build(connector.build()))
            },
            "https" => {
                let connector = connector.https()
                   .build()
                   .map_err(|e| ClientInitError::SslError(e))?;
                HyperClient::Https(hyper::client::Client::builder().build(connector))
            },
            _ => {
                return Err(ClientInitError::InvalidScheme);
            }
        };

        let client_service = DropContextService::new(client_service);

        Ok(Self {
            client_service,
            base_path: into_base_path(base_path, None)?,
            marker: PhantomData,
        })
    }
}

impl<C> Client<DropContextService<hyper::client::Client<hyper::client::HttpConnector, Body>, C>, C> where
    C: Clone + Send + Sync + 'static
{
    /// Create an HTTP client.
    ///
    /// # Arguments
    /// * `base_path` - base path of the client API, i.e. "http://www.my-api-implementation.com"
    pub fn try_new_http(
        base_path: &str,
    ) -> Result<Self, ClientInitError> {
        let http_connector = Connector::builder().build();

        Self::try_new_with_connector(base_path, Some("http"), http_connector)
    }
}

#[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
type HttpsConnector = hyper_tls::HttpsConnector<hyper::client::HttpConnector>;

#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
type HttpsConnector = hyper_openssl::HttpsConnector<hyper::client::HttpConnector>;

impl<C> Client<DropContextService<hyper::client::Client<HttpsConnector, Body>, C>, C> where
    C: Clone + Send + Sync + 'static
{
    /// Create a client with a TLS connection to the server
    ///
    /// # Arguments
    /// * `base_path` - base path of the client API, i.e. "https://www.my-api-implementation.com"
    pub fn try_new_https(base_path: &str) -> Result<Self, ClientInitError>
    {
        let https_connector = Connector::builder()
            .https()
            .build()
            .map_err(|e| ClientInitError::SslError(e))?;
        Self::try_new_with_connector(base_path, Some("https"), https_connector)
    }

    /// Create a client with a TLS connection to the server using a pinned certificate
    ///
    /// # Arguments
    /// * `base_path` - base path of the client API, i.e. "https://www.my-api-implementation.com"
    /// * `ca_certificate` - Path to CA certificate used to authenticate the server
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    pub fn try_new_https_pinned<CA>(
        base_path: &str,
        ca_certificate: CA,
    ) -> Result<Self, ClientInitError>
    where
        CA: AsRef<Path>,
    {
        let https_connector = Connector::builder()
            .https()
            .pin_server_certificate(ca_certificate)
            .build()
            .map_err(|e| ClientInitError::SslError(e))?;
        Self::try_new_with_connector(base_path, Some("https"), https_connector)
    }

    /// Create a client with a mutually authenticated TLS connection to the server.
    ///
    /// # Arguments
    /// * `base_path` - base path of the client API, i.e. "https://www.my-api-implementation.com"
    /// * `ca_certificate` - Path to CA certificate used to authenticate the server
    /// * `client_key` - Path to the client private key
    /// * `client_certificate` - Path to the client's public certificate associated with the private key
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    pub fn try_new_https_mutual<CA, K, D>(
        base_path: &str,
        ca_certificate: CA,
        client_key: K,
        client_certificate: D,
    ) -> Result<Self, ClientInitError>
    where
        CA: AsRef<Path>,
        K: AsRef<Path>,
        D: AsRef<Path>,
    {
        let https_connector = Connector::builder()
            .https()
            .pin_server_certificate(ca_certificate)
            .client_authentication(client_key, client_certificate)
            .build()
            .map_err(|e| ClientInitError::SslError(e))?;
        Self::try_new_with_connector(base_path, Some("https"), https_connector)
    }
}

impl<S, C> Client<S, C> where
    S: Service<
           (Request<Body>, C),
           Response=Response<Body>> + Clone + Sync + Send + 'static,
    S::Future: Send + 'static,
    S::Error: Into<crate::ServiceError> + fmt::Display,
    C: Clone + Send + Sync + 'static
{
    /// Constructor for creating a `Client` by passing in a pre-made `hyper::service::Service` /
    /// `tower::Service`
    ///
    /// This allows adding custom wrappers around the underlying transport, for example for logging.
    pub fn try_new_with_client_service(
        client_service: S,
        base_path: &str,
    ) -> Result<Self, ClientInitError>
    {
        Ok(Self {
            client_service,
            base_path: into_base_path(base_path, None)?,
            marker: PhantomData,
        })
    }
}

/// Error type failing to create a Client
#[derive(Debug)]
pub enum ClientInitError {
    /// Invalid URL Scheme
    InvalidScheme,

    /// Invalid URI
    InvalidUri(hyper::http::uri::InvalidUri),

    /// Missing Hostname
    MissingHost,

    /// SSL Connection Error
    #[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
    SslError(native_tls::Error),

    /// SSL Connection Error
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    SslError(openssl::error::ErrorStack),
}

impl From<hyper::http::uri::InvalidUri> for ClientInitError {
    fn from(err: hyper::http::uri::InvalidUri) -> ClientInitError {
        ClientInitError::InvalidUri(err)
    }
}

impl fmt::Display for ClientInitError {
    fn fmt(&self, f: &mut fmt::Formatter<'_>) -> fmt::Result {
        let s: &dyn fmt::Debug = self;
        s.fmt(f)
    }
}

impl Error for ClientInitError {
    fn description(&self) -> &str {
        "Failed to produce a hyper client."
    }
}

#[async_trait]
impl<S, C> Api<C> for Client<S, C> where
    S: Service<
       (Request<Body>, C),
       Response=Response<Body>> + Clone + Sync + Send + 'static,
    S::Future: Send + 'static,
    S::Error: Into<crate::ServiceError> + fmt::Display,
    C: Has<XSpanIdString> + Has<Option<AuthData>> + Clone + Send + Sync + 'static,
{
    fn poll_ready(&self, cx: &mut Context) -> Poll<Result<(), crate::ServiceError>> {
        match self.client_service.clone().poll_ready(cx) {
            Poll::Ready(Err(e)) => Poll::Ready(Err(e.into())),
            Poll::Ready(Ok(o)) => Poll::Ready(Ok(o)),
            Poll::Pending => Poll::Pending,
        }
    }

    async fn ad_account_analytics(
        &self,
        param_ad_account_id: String,
        param_start_date: chrono::DateTime::<chrono::Utc>,
        param_end_date: chrono::DateTime::<chrono::Utc>,
        param_columns: &Vec<String>,
        param_granularity: models::Granularity,
        param_click_window_days: Option<i32>,
        param_engagement_window_days: Option<i32>,
        param_view_window_days: Option<i32>,
        param_conversion_report_time: Option<String>,
        context: &C) -> Result<AdAccountAnalyticsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/analytics",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("start_date",
                    &param_start_date.to_string());
                query_string.append_pair("end_date",
                    &param_end_date.to_string());
                query_string.append_pair("columns",
                    &param_columns.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
                query_string.append_pair("granularity",
                    &param_granularity.to_string());
            if let Some(param_click_window_days) = param_click_window_days {
                query_string.append_pair("click_window_days",
                    &param_click_window_days.to_string());
            }
            if let Some(param_engagement_window_days) = param_engagement_window_days {
                query_string.append_pair("engagement_window_days",
                    &param_engagement_window_days.to_string());
            }
            if let Some(param_view_window_days) = param_view_window_days {
                query_string.append_pair("view_window_days",
                    &param_view_window_days.to_string());
            }
            if let Some(param_conversion_report_time) = param_conversion_report_time {
                query_string.append_pair("conversion_report_time",
                    &param_conversion_report_time.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Vec<std::collections::HashMap<String, serde_json::Value>>>(body)?;
                Ok(AdAccountAnalyticsResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(AdAccountAnalyticsResponse::InvalidAdAccountAnalyticsParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(AdAccountAnalyticsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn ad_accounts_list(
        &self,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        param_include_shared_accounts: Option<bool>,
        context: &C) -> Result<AdAccountsListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark.to_string());
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_include_shared_accounts) = param_include_shared_accounts {
                query_string.append_pair("include_shared_accounts",
                    &param_include_shared_accounts.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Paginated>(body)?;
                Ok(AdAccountsListResponse::Response
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(AdAccountsListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn ad_groups_analytics(
        &self,
        param_ad_account_id: String,
        param_start_date: chrono::DateTime::<chrono::Utc>,
        param_end_date: chrono::DateTime::<chrono::Utc>,
        param_ad_group_ids: &Vec<String>,
        param_columns: &Vec<String>,
        param_granularity: models::Granularity,
        param_click_window_days: Option<i32>,
        param_engagement_window_days: Option<i32>,
        param_view_window_days: Option<i32>,
        param_conversion_report_time: Option<String>,
        context: &C) -> Result<AdGroupsAnalyticsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/ad_groups/analytics",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("start_date",
                    &param_start_date.to_string());
                query_string.append_pair("end_date",
                    &param_end_date.to_string());
                query_string.append_pair("ad_group_ids",
                    &param_ad_group_ids.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
                query_string.append_pair("columns",
                    &param_columns.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
                query_string.append_pair("granularity",
                    &param_granularity.to_string());
            if let Some(param_click_window_days) = param_click_window_days {
                query_string.append_pair("click_window_days",
                    &param_click_window_days.to_string());
            }
            if let Some(param_engagement_window_days) = param_engagement_window_days {
                query_string.append_pair("engagement_window_days",
                    &param_engagement_window_days.to_string());
            }
            if let Some(param_view_window_days) = param_view_window_days {
                query_string.append_pair("view_window_days",
                    &param_view_window_days.to_string());
            }
            if let Some(param_conversion_report_time) = param_conversion_report_time {
                query_string.append_pair("conversion_report_time",
                    &param_conversion_report_time.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Vec<std::collections::HashMap<String, serde_json::Value>>>(body)?;
                Ok(AdGroupsAnalyticsResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(AdGroupsAnalyticsResponse::InvalidAdAccountGroupAnalyticsParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(AdGroupsAnalyticsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn ad_groups_list(
        &self,
        param_ad_account_id: String,
        param_campaign_ids: Option<&Vec<String>>,
        param_ad_group_ids: Option<&Vec<String>>,
        param_entity_statuses: Option<&Vec<String>>,
        param_page_size: Option<i32>,
        param_order: Option<String>,
        param_bookmark: Option<String>,
        param_translate_interests_to_names: Option<bool>,
        context: &C) -> Result<AdGroupsListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/ad_groups",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_campaign_ids) = param_campaign_ids {
                query_string.append_pair("campaign_ids",
                    &param_campaign_ids.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_ad_group_ids) = param_ad_group_ids {
                query_string.append_pair("ad_group_ids",
                    &param_ad_group_ids.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_entity_statuses) = param_entity_statuses {
                query_string.append_pair("entity_statuses",
                    &param_entity_statuses.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_order) = param_order {
                query_string.append_pair("order",
                    &param_order.to_string());
            }
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark.to_string());
            }
            if let Some(param_translate_interests_to_names) = param_translate_interests_to_names {
                query_string.append_pair("translate_interests_to_names",
                    &param_translate_interests_to_names.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Paginated>(body)?;
                Ok(AdGroupsListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(AdGroupsListResponse::InvalidAdAccountGroupParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(AdGroupsListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn ads_analytics(
        &self,
        param_ad_account_id: String,
        param_start_date: chrono::DateTime::<chrono::Utc>,
        param_end_date: chrono::DateTime::<chrono::Utc>,
        param_ad_ids: &Vec<String>,
        param_columns: &Vec<String>,
        param_granularity: models::Granularity,
        param_click_window_days: Option<i32>,
        param_engagement_window_days: Option<i32>,
        param_view_window_days: Option<i32>,
        param_conversion_report_time: Option<String>,
        context: &C) -> Result<AdsAnalyticsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/ads/analytics",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("start_date",
                    &param_start_date.to_string());
                query_string.append_pair("end_date",
                    &param_end_date.to_string());
                query_string.append_pair("ad_ids",
                    &param_ad_ids.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
                query_string.append_pair("columns",
                    &param_columns.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
                query_string.append_pair("granularity",
                    &param_granularity.to_string());
            if let Some(param_click_window_days) = param_click_window_days {
                query_string.append_pair("click_window_days",
                    &param_click_window_days.to_string());
            }
            if let Some(param_engagement_window_days) = param_engagement_window_days {
                query_string.append_pair("engagement_window_days",
                    &param_engagement_window_days.to_string());
            }
            if let Some(param_view_window_days) = param_view_window_days {
                query_string.append_pair("view_window_days",
                    &param_view_window_days.to_string());
            }
            if let Some(param_conversion_report_time) = param_conversion_report_time {
                query_string.append_pair("conversion_report_time",
                    &param_conversion_report_time.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Vec<std::collections::HashMap<String, serde_json::Value>>>(body)?;
                Ok(AdsAnalyticsResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(AdsAnalyticsResponse::InvalidAdAccountAdsAnalyticsParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(AdsAnalyticsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn ads_list(
        &self,
        param_ad_account_id: String,
        param_campaign_ids: Option<&Vec<String>>,
        param_ad_group_ids: Option<&Vec<String>>,
        param_ad_ids: Option<&Vec<String>>,
        param_entity_statuses: Option<&Vec<String>>,
        param_page_size: Option<i32>,
        param_order: Option<String>,
        param_bookmark: Option<String>,
        context: &C) -> Result<AdsListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/ads",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_campaign_ids) = param_campaign_ids {
                query_string.append_pair("campaign_ids",
                    &param_campaign_ids.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_ad_group_ids) = param_ad_group_ids {
                query_string.append_pair("ad_group_ids",
                    &param_ad_group_ids.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_ad_ids) = param_ad_ids {
                query_string.append_pair("ad_ids",
                    &param_ad_ids.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_entity_statuses) = param_entity_statuses {
                query_string.append_pair("entity_statuses",
                    &param_entity_statuses.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_order) = param_order {
                query_string.append_pair("order",
                    &param_order.to_string());
            }
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Paginated>(body)?;
                Ok(AdsListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(AdsListResponse::InvalidAdAccountAdsParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(AdsListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn analytics_create_report(
        &self,
        param_ad_account_id: String,
        param_ads_analytics_create_async_request: models::AdsAnalyticsCreateAsyncRequest,
        context: &C) -> Result<AnalyticsCreateReportResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/reports",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_ads_analytics_create_async_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdsAnalyticsCreateAsyncResponse>(body)?;
                Ok(AnalyticsCreateReportResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(AnalyticsCreateReportResponse::InvalidAdAccountAdsAnalyticsParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(AnalyticsCreateReportResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn analytics_get_report(
        &self,
        param_ad_account_id: String,
        param_token: String,
        context: &C) -> Result<AnalyticsGetReportResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/reports",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("token",
                    &param_token.to_string());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdsAnalyticsGetAsyncResponse>(body)?;
                Ok(AnalyticsGetReportResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(AnalyticsGetReportResponse::InvalidAdAccountAdsAnalyticsParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(AnalyticsGetReportResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn campaigns_analytics(
        &self,
        param_ad_account_id: String,
        param_start_date: chrono::DateTime::<chrono::Utc>,
        param_end_date: chrono::DateTime::<chrono::Utc>,
        param_campaign_ids: &Vec<String>,
        param_columns: &Vec<String>,
        param_granularity: models::Granularity,
        param_click_window_days: Option<i32>,
        param_engagement_window_days: Option<i32>,
        param_view_window_days: Option<i32>,
        param_conversion_report_time: Option<String>,
        context: &C) -> Result<CampaignsAnalyticsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/campaigns/analytics",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("start_date",
                    &param_start_date.to_string());
                query_string.append_pair("end_date",
                    &param_end_date.to_string());
                query_string.append_pair("campaign_ids",
                    &param_campaign_ids.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
                query_string.append_pair("columns",
                    &param_columns.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
                query_string.append_pair("granularity",
                    &param_granularity.to_string());
            if let Some(param_click_window_days) = param_click_window_days {
                query_string.append_pair("click_window_days",
                    &param_click_window_days.to_string());
            }
            if let Some(param_engagement_window_days) = param_engagement_window_days {
                query_string.append_pair("engagement_window_days",
                    &param_engagement_window_days.to_string());
            }
            if let Some(param_view_window_days) = param_view_window_days {
                query_string.append_pair("view_window_days",
                    &param_view_window_days.to_string());
            }
            if let Some(param_conversion_report_time) = param_conversion_report_time {
                query_string.append_pair("conversion_report_time",
                    &param_conversion_report_time.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Vec<std::collections::HashMap<String, serde_json::Value>>>(body)?;
                Ok(CampaignsAnalyticsResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CampaignsAnalyticsResponse::InvalidAdAccountCampaignAnalyticsParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CampaignsAnalyticsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn campaigns_list(
        &self,
        param_ad_account_id: String,
        param_campaign_ids: Option<&Vec<String>>,
        param_entity_statuses: Option<&Vec<String>>,
        param_page_size: Option<i32>,
        param_order: Option<String>,
        param_bookmark: Option<String>,
        context: &C) -> Result<CampaignsListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/campaigns",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_campaign_ids) = param_campaign_ids {
                query_string.append_pair("campaign_ids",
                    &param_campaign_ids.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_entity_statuses) = param_entity_statuses {
                query_string.append_pair("entity_statuses",
                    &param_entity_statuses.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_order) = param_order {
                query_string.append_pair("order",
                    &param_order.to_string());
            }
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Paginated>(body)?;
                Ok(CampaignsListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CampaignsListResponse::InvalidAdAccountCampaignParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CampaignsListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn product_groups_analytics(
        &self,
        param_ad_account_id: String,
        param_start_date: chrono::DateTime::<chrono::Utc>,
        param_end_date: chrono::DateTime::<chrono::Utc>,
        param_product_group_ids: &Vec<String>,
        param_columns: &Vec<String>,
        param_granularity: models::Granularity,
        param_click_window_days: Option<i32>,
        param_engagement_window_days: Option<i32>,
        param_view_window_days: Option<i32>,
        param_conversion_report_time: Option<String>,
        context: &C) -> Result<ProductGroupsAnalyticsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/product_groups/analytics",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("start_date",
                    &param_start_date.to_string());
                query_string.append_pair("end_date",
                    &param_end_date.to_string());
                query_string.append_pair("product_group_ids",
                    &param_product_group_ids.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
                query_string.append_pair("columns",
                    &param_columns.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
                query_string.append_pair("granularity",
                    &param_granularity.to_string());
            if let Some(param_click_window_days) = param_click_window_days {
                query_string.append_pair("click_window_days",
                    &param_click_window_days.to_string());
            }
            if let Some(param_engagement_window_days) = param_engagement_window_days {
                query_string.append_pair("engagement_window_days",
                    &param_engagement_window_days.to_string());
            }
            if let Some(param_view_window_days) = param_view_window_days {
                query_string.append_pair("view_window_days",
                    &param_view_window_days.to_string());
            }
            if let Some(param_conversion_report_time) = param_conversion_report_time {
                query_string.append_pair("conversion_report_time",
                    &param_conversion_report_time.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Vec<std::collections::HashMap<String, serde_json::Value>>>(body)?;
                Ok(ProductGroupsAnalyticsResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(ProductGroupsAnalyticsResponse::InvalidAdAccountAdsAnalyticsParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(ProductGroupsAnalyticsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn board_sections_create(
        &self,
        param_board_id: String,
        param_board_section: models::BoardSection,
        context: &C) -> Result<BoardSectionsCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/boards/{board_id}/sections",
            self.base_path
            ,board_id=utf8_percent_encode(&param_board_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        // Body parameter
        let body = serde_json::to_string(&param_board_section).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            201 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::BoardSection>(body)?;
                Ok(BoardSectionsCreateResponse::Response
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardSectionsCreateResponse::InvalidBoardSectionParameters
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardSectionsCreateResponse::NotAuthorizedToCreateBoardSections
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardSectionsCreateResponse::CouldNotGetExclusiveAccessToTheBoardToCreateANewSection
                    (body)
                )
            }
            500 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardSectionsCreateResponse::CouldNotCreateANewBoardSection
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardSectionsCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn board_sections_delete(
        &self,
        param_board_id: String,
        param_section_id: String,
        context: &C) -> Result<BoardSectionsDeleteResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/boards/{board_id}/sections/{section_id}",
            self.base_path
            ,board_id=utf8_percent_encode(&param_board_id.to_string(), ID_ENCODE_SET)
            ,section_id=utf8_percent_encode(&param_section_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("DELETE")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            204 => {
                let body = response.into_body();
                Ok(
                    BoardSectionsDeleteResponse::BoardSectionDeletedSuccessfully
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardSectionsDeleteResponse::NotAuthorizedToDeleteBoardSection
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardSectionsDeleteResponse::BoardSectionNotFound
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardSectionsDeleteResponse::BoardSectionConflict
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardSectionsDeleteResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn board_sections_list(
        &self,
        param_board_id: String,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        context: &C) -> Result<BoardSectionsListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/boards/{board_id}/sections",
            self.base_path
            ,board_id=utf8_percent_encode(&param_board_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark.to_string());
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Paginated>(body)?;
                Ok(BoardSectionsListResponse::Response
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardSectionsListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn board_sections_list_pins(
        &self,
        param_board_id: String,
        param_section_id: String,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        context: &C) -> Result<BoardSectionsListPinsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/boards/{board_id}/sections/{section_id}/pins",
            self.base_path
            ,board_id=utf8_percent_encode(&param_board_id.to_string(), ID_ENCODE_SET)
            ,section_id=utf8_percent_encode(&param_section_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark.to_string());
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Paginated>(body)?;
                Ok(BoardSectionsListPinsResponse::Response
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardSectionsListPinsResponse::NotAuthorizedToAccessPinsOnBoardSection
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardSectionsListPinsResponse::BoardOrSectionNotFound
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardSectionsListPinsResponse::BoardSectionConflict
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardSectionsListPinsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn board_sections_update(
        &self,
        param_board_id: String,
        param_section_id: String,
        param_board_section: models::BoardSection,
        context: &C) -> Result<BoardSectionsUpdateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/boards/{board_id}/sections/{section_id}",
            self.base_path
            ,board_id=utf8_percent_encode(&param_board_id.to_string(), ID_ENCODE_SET)
            ,section_id=utf8_percent_encode(&param_section_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("PATCH")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_board_section).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::BoardSection>(body)?;
                Ok(BoardSectionsUpdateResponse::Response
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardSectionsUpdateResponse::InvalidBoardSectionParameters
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardSectionsUpdateResponse::NotAuthorizedToUpdateBoardSection
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardSectionsUpdateResponse::BoardSectionConflict
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardSectionsUpdateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn boards_create(
        &self,
        param_board: models::Board,
        context: &C) -> Result<BoardsCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/boards",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_board).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            201 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Board>(body)?;
                Ok(BoardsCreateResponse::Response
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardsCreateResponse::TheBoardNameIsInvalidOrDuplicated
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardsCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn boards_delete(
        &self,
        param_board_id: String,
        context: &C) -> Result<BoardsDeleteResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/boards/{board_id}",
            self.base_path
            ,board_id=utf8_percent_encode(&param_board_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("DELETE")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            204 => {
                let body = response.into_body();
                Ok(
                    BoardsDeleteResponse::BoardDeletedSuccessfully
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardsDeleteResponse::NotAuthorizedToDeleteTheBoard
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardsDeleteResponse::BoardNotFound
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardsDeleteResponse::CouldNotGetExclusiveAccessToDeleteTheBoard
                    (body)
                )
            }
            429 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardsDeleteResponse::ThisRequestExceededARateLimit
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardsDeleteResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn boards_get(
        &self,
        param_board_id: String,
        context: &C) -> Result<BoardsGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/boards/{board_id}",
            self.base_path
            ,board_id=utf8_percent_encode(&param_board_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Board>(body)?;
                Ok(BoardsGetResponse::Response
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardsGetResponse::BoardNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardsGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn boards_list(
        &self,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        param_privacy: Option<String>,
        context: &C) -> Result<BoardsListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/boards",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark.to_string());
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_privacy) = param_privacy {
                query_string.append_pair("privacy",
                    &param_privacy.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Paginated>(body)?;
                Ok(BoardsListResponse::Response
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardsListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn boards_list_pins(
        &self,
        param_board_id: String,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        context: &C) -> Result<BoardsListPinsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/boards/{board_id}/pins",
            self.base_path
            ,board_id=utf8_percent_encode(&param_board_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark.to_string());
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Paginated>(body)?;
                Ok(BoardsListPinsResponse::Response
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardsListPinsResponse::BoardNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardsListPinsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn boards_update(
        &self,
        param_board_id: String,
        param_board_update: models::BoardUpdate,
        context: &C) -> Result<BoardsUpdateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/boards/{board_id}",
            self.base_path
            ,board_id=utf8_percent_encode(&param_board_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("PATCH")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_board_update).expect("impossible to fail to serialize");

                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Board>(body)?;
                Ok(BoardsUpdateResponse::Response
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardsUpdateResponse::InvalidBoardParameters
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardsUpdateResponse::NotAuthorizedToUpdateTheBoard
                    (body)
                )
            }
            429 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardsUpdateResponse::ThisRequestExceededARateLimit
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(BoardsUpdateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn catalogs_product_groups_create(
        &self,
        param_catalogs_product_group_create_request: models::CatalogsProductGroupCreateRequest,
        context: &C) -> Result<CatalogsProductGroupsCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/product_groups",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        // Body parameter
        let body = serde_json::to_string(&param_catalogs_product_group_create_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            201 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<serde_json::Value>(body)?;
                Ok(CatalogsProductGroupsCreateResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsCreateResponse::InvalidBody
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsCreateResponse::UnauthorizedAccess
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsCreateResponse::Forbidden
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsCreateResponse::Conflict
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn catalogs_product_groups_delete(
        &self,
        param_product_group_id: String,
        context: &C) -> Result<CatalogsProductGroupsDeleteResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/product_groups/{product_group_id}",
            self.base_path
            ,product_group_id=utf8_percent_encode(&param_product_group_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("DELETE")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            204 => {
                let body = response.into_body();
                Ok(
                    CatalogsProductGroupsDeleteResponse::CatalogsProductGroupDeletedSuccessfully
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsDeleteResponse::InvalidCatalogsProductGroupIdParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsDeleteResponse::UnauthorizedAccess
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsDeleteResponse::Forbidden
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsDeleteResponse::CatalogsProductGroupNotFound
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsDeleteResponse::Conflict
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsDeleteResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn catalogs_product_groups_list(
        &self,
        param_feed_id: String,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        context: &C) -> Result<CatalogsProductGroupsListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/product_groups",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("feed_id",
                    &param_feed_id.to_string());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark.to_string());
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Paginated>(body)?;
                Ok(CatalogsProductGroupsListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsListResponse::InvalidFeedParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsListResponse::UnauthorizedAccess
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsListResponse::Forbidden
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsListResponse::DataFeedNotFound
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsListResponse::Conflict
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn catalogs_product_groups_update(
        &self,
        param_product_group_id: String,
        param_catalogs_product_group_update_request: models::CatalogsProductGroupUpdateRequest,
        context: &C) -> Result<CatalogsProductGroupsUpdateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/product_groups/{product_group_id}",
            self.base_path
            ,product_group_id=utf8_percent_encode(&param_product_group_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("PATCH")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_catalogs_product_group_update_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsProductGroup>(body)?;
                Ok(CatalogsProductGroupsUpdateResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsUpdateResponse::InvalidParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsUpdateResponse::UnauthorizedAccess
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsUpdateResponse::CatalogsProductGroupNotFound
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsUpdateResponse::Conflict
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(CatalogsProductGroupsUpdateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn feed_processing_results_list(
        &self,
        param_feed_id: String,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        context: &C) -> Result<FeedProcessingResultsListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/feeds/{feed_id}/processing_results",
            self.base_path
            ,feed_id=utf8_percent_encode(&param_feed_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark.to_string());
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Paginated>(body)?;
                Ok(FeedProcessingResultsListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedProcessingResultsListResponse::InvalidParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedProcessingResultsListResponse::UnauthorizedAccess
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedProcessingResultsListResponse::FeedNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedProcessingResultsListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn feeds_create(
        &self,
        param_catalogs_feeds_create_request: models::CatalogsFeedsCreateRequest,
        context: &C) -> Result<FeedsCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/feeds",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_catalogs_feeds_create_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            201 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsFeed>(body)?;
                Ok(FeedsCreateResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsCreateResponse::InvalidFeedParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsCreateResponse::UnauthorizedAccess
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsCreateResponse::BusinessAccountRequired
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsCreateResponse::UserWebsiteRequired
                    (body)
                )
            }
            422 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsCreateResponse::UniqueFeedNameIsRequired
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn feeds_delete(
        &self,
        param_feed_id: String,
        context: &C) -> Result<FeedsDeleteResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/feeds/{feed_id}",
            self.base_path
            ,feed_id=utf8_percent_encode(&param_feed_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("DELETE")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            204 => {
                let body = response.into_body();
                Ok(
                    FeedsDeleteResponse::FeedDeletedSuccessfully
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsDeleteResponse::InvalidFeedParameters
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsDeleteResponse::Forbidden
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsDeleteResponse::DataFeedNotFound
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsDeleteResponse::Conflict
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsDeleteResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn feeds_get(
        &self,
        param_feed_id: String,
        context: &C) -> Result<FeedsGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/feeds/{feed_id}",
            self.base_path
            ,feed_id=utf8_percent_encode(&param_feed_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsFeed>(body)?;
                Ok(FeedsGetResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsGetResponse::InvalidFeedParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsGetResponse::UnauthorizedAccess
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsGetResponse::DataFeedNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn feeds_list(
        &self,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        context: &C) -> Result<FeedsListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/feeds",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark.to_string());
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Paginated>(body)?;
                Ok(FeedsListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsListResponse::InvalidParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsListResponse::UnauthorizedAccess
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn feeds_update(
        &self,
        param_feed_id: String,
        param_catalogs_feeds_update_request: models::CatalogsFeedsUpdateRequest,
        context: &C) -> Result<FeedsUpdateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/feeds/{feed_id}",
            self.base_path
            ,feed_id=utf8_percent_encode(&param_feed_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("PATCH")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_catalogs_feeds_update_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsFeed>(body)?;
                Ok(FeedsUpdateResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsUpdateResponse::InvalidFeedParameters
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsUpdateResponse::Forbidden
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsUpdateResponse::DataFeedNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(FeedsUpdateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn items_batch_get(
        &self,
        param_batch_id: String,
        context: &C) -> Result<ItemsBatchGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/items/batch/{batch_id}",
            self.base_path
            ,batch_id=utf8_percent_encode(&param_batch_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsItemsBatch>(body)?;
                Ok(ItemsBatchGetResponse::ResponseContainingTheRequestedCatalogsItemsBatch
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(ItemsBatchGetResponse::NotAuthorizedToAccessCatalogsItemsBatch
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(ItemsBatchGetResponse::NotAuthorizedToAccessCatalogsItemsBatch_2
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(ItemsBatchGetResponse::CatalogsItemsBatchNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(ItemsBatchGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn items_batch_post(
        &self,
        param_catalogs_items_batch_request: models::CatalogsItemsBatchRequest,
        context: &C) -> Result<ItemsBatchPostResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/items/batch",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_catalogs_items_batch_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsItemsBatch>(body)?;
                Ok(ItemsBatchPostResponse::ResponseContainingTheRequestedCatalogsItemsBatch
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(ItemsBatchPostResponse::NotAuthorizedToPostCatalogsItems
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(ItemsBatchPostResponse::NotAuthorizedToPostCatalogsItems_2
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(ItemsBatchPostResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn items_get(
        &self,
        param_country: String,
        param_item_ids: &Vec<String>,
        param_language: String,
        context: &C) -> Result<ItemsGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/items",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("country",
                    &param_country.to_string());
                query_string.append_pair("item_ids",
                    &param_item_ids.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
                query_string.append_pair("language",
                    &param_language.to_string());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsItems>(body)?;
                Ok(ItemsGetResponse::ResponseContainingTheRequestedCatalogsItems
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(ItemsGetResponse::NotAuthorizedToAccessCatalogsItems
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(ItemsGetResponse::NotAuthorizedToAccessCatalogsItems_2
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(ItemsGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn media_create(
        &self,
        param_media_upload_request: models::MediaUploadRequest,
        context: &C) -> Result<MediaCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/media",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        // Body parameter
        let body = serde_json::to_string(&param_media_upload_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            201 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::MediaUpload>(body)?;
                Ok(MediaCreateResponse::Response
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(MediaCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn media_get(
        &self,
        param_media_id: String,
        context: &C) -> Result<MediaGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/media/{media_id}",
            self.base_path
            ,media_id=utf8_percent_encode(&param_media_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::MediaUploadDetails>(body)?;
                Ok(MediaGetResponse::Response
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(MediaGetResponse::MediaUploadNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(MediaGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn media_list(
        &self,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        context: &C) -> Result<MediaListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/media",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark.to_string());
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Paginated>(body)?;
                Ok(MediaListResponse::Response
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(MediaListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn oauth_token(
        &self,
        param_grant_type: String,
        context: &C) -> Result<OauthTokenResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/oauth/token",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let params = &[
            ("grant_type", Some(param_grant_type)),
        ];
        let body = serde_urlencoded::to_string(params).expect("impossible to fail to serialize");

        let header = "application/x-www-form-urlencoded";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        *request.body_mut() = Body::from(body.into_bytes());
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::OauthAccessTokenResponse>(body)?;
                Ok(OauthTokenResponse::Response
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(OauthTokenResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn pins_analytics(
        &self,
        param_pin_id: String,
        param_start_date: chrono::DateTime::<chrono::Utc>,
        param_end_date: chrono::DateTime::<chrono::Utc>,
        param_metric_types: &Vec<String>,
        param_app_types: Option<String>,
        param_split_field: Option<String>,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<PinsAnalyticsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/pins/{pin_id}/analytics",
            self.base_path
            ,pin_id=utf8_percent_encode(&param_pin_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("start_date",
                    &param_start_date.to_string());
                query_string.append_pair("end_date",
                    &param_end_date.to_string());
            if let Some(param_app_types) = param_app_types {
                query_string.append_pair("app_types",
                    &param_app_types.to_string());
            }
                query_string.append_pair("metric_types",
                    &param_metric_types.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            if let Some(param_split_field) = param_split_field {
                query_string.append_pair("split_field",
                    &param_split_field.to_string());
            }
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<std::collections::HashMap<String, models::AnalyticsMetricsResponse>>(body)?;
                Ok(PinsAnalyticsResponse::Response
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(PinsAnalyticsResponse::NotAuthorizedToAccessBoardOrPin
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(PinsAnalyticsResponse::PinNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(PinsAnalyticsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn pins_create(
        &self,
        param_pin: models::Pin,
        context: &C) -> Result<PinsCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/pins",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_pin).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            201 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Pin>(body)?;
                Ok(PinsCreateResponse::SuccessfulPinCreation
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(PinsCreateResponse::InvalidPinParametersResponse
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(PinsCreateResponse::ThePin
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(PinsCreateResponse::BoardOrSectionNotFound
                    (body)
                )
            }
            429 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(PinsCreateResponse::ThisRequestExceededARateLimit
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(PinsCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn pins_delete(
        &self,
        param_pin_id: String,
        context: &C) -> Result<PinsDeleteResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/pins/{pin_id}",
            self.base_path
            ,pin_id=utf8_percent_encode(&param_pin_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("DELETE")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            204 => {
                let body = response.into_body();
                Ok(
                    PinsDeleteResponse::SuccessfullyDeletedPin
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(PinsDeleteResponse::NotAuthorizedToAccessBoardOrPin
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(PinsDeleteResponse::PinNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(PinsDeleteResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn pins_get(
        &self,
        param_pin_id: String,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<PinsGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/pins/{pin_id}",
            self.base_path
            ,pin_id=utf8_percent_encode(&param_pin_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Pin>(body)?;
                Ok(PinsGetResponse::Response
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(PinsGetResponse::NotAuthorizedToAccessBoardOrPin
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(PinsGetResponse::PinNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(PinsGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn user_account_analytics(
        &self,
        param_start_date: chrono::DateTime::<chrono::Utc>,
        param_end_date: chrono::DateTime::<chrono::Utc>,
        param_from_claimed_content: Option<String>,
        param_pin_format: Option<String>,
        param_app_types: Option<String>,
        param_metric_types: Option<&Vec<String>>,
        param_split_field: Option<String>,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountAnalyticsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/user_account/analytics",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("start_date",
                    &param_start_date.to_string());
                query_string.append_pair("end_date",
                    &param_end_date.to_string());
            if let Some(param_from_claimed_content) = param_from_claimed_content {
                query_string.append_pair("from_claimed_content",
                    &param_from_claimed_content.to_string());
            }
            if let Some(param_pin_format) = param_pin_format {
                query_string.append_pair("pin_format",
                    &param_pin_format.to_string());
            }
            if let Some(param_app_types) = param_app_types {
                query_string.append_pair("app_types",
                    &param_app_types.to_string());
            }
            if let Some(param_metric_types) = param_metric_types {
                query_string.append_pair("metric_types",
                    &param_metric_types.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_split_field) = param_split_field {
                query_string.append_pair("split_field",
                    &param_split_field.to_string());
            }
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<std::collections::HashMap<String, models::AnalyticsMetricsResponse>>(body)?;
                Ok(UserAccountAnalyticsResponse::Success
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(UserAccountAnalyticsResponse::NotAuthorizedToAccessTheUserAccountAnalytics
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(UserAccountAnalyticsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

    async fn user_account_get(
        &self,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/user_account",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id.to_string());
            }
            query_string.finish()
        };
        if !query_string.is_empty() {
            uri += "?";
            uri += &query_string;
        }

        let uri = match Uri::from_str(&uri) {
            Ok(uri) => uri,
            Err(err) => return Err(ApiError(format!("Unable to build URI: {}", err))),
        };

        let mut request = match Request::builder()
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.clone().to_string().as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            match auth_data {
                &AuthData::Bearer(ref bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                _ => {}
            }
        }

        let mut response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Account>(body)?;
                Ok(UserAccountGetResponse::Response
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(UserAccountGetResponse::NotAuthorizedToAccessTheUserAccount
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .to_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body)?;
                Ok(UserAccountGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .to_raw().await;
                Err(ApiError(format!("Unexpected response code {}:\n{:?}\n\n{}",
                    code,
                    headers,
                    match body {
                        Ok(body) => match String::from_utf8(body) {
                            Ok(body) => body,
                            Err(e) => format!("<Body was not UTF8: {:?}>", e),
                        },
                        Err(e) => format!("<Failed to read body: {}>", e),
                    }
                )))
            }
        }
    }

}
