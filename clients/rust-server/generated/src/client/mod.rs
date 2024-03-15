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
     AdAccountSlashAnalyticsResponse,
     AdAccountTargetingAnalyticsSlashGetResponse,
     AdAccountsSlashCreateResponse,
     AdAccountsSlashGetResponse,
     AdAccountsSlashListResponse,
     AnalyticsSlashCreateMmmReportResponse,
     AnalyticsSlashCreateReportResponse,
     AnalyticsSlashCreateTemplateReportResponse,
     AnalyticsSlashGetMmmReportResponse,
     AnalyticsSlashGetReportResponse,
     SandboxSlashDeleteResponse,
     TemplatesSlashListResponse,
     AdGroupsBidFloorSlashGetResponse,
     AdGroupsSlashAnalyticsResponse,
     AdGroupsSlashAudienceSizingResponse,
     AdGroupsSlashCreateResponse,
     AdGroupsSlashGetResponse,
     AdGroupsSlashListResponse,
     AdGroupsSlashUpdateResponse,
     AdGroupsTargetingAnalyticsSlashGetResponse,
     AdPreviewsSlashCreateResponse,
     AdTargetingAnalyticsSlashGetResponse,
     AdsSlashAnalyticsResponse,
     AdsSlashCreateResponse,
     AdsSlashGetResponse,
     AdsSlashListResponse,
     AdsSlashUpdateResponse,
     AudienceInsightsScopeAndTypeSlashGetResponse,
     AudienceInsightsSlashGetResponse,
     AudiencesSlashCreateResponse,
     AudiencesSlashCreateCustomResponse,
     AudiencesSlashGetResponse,
     AudiencesSlashListResponse,
     AudiencesSlashUpdateResponse,
     AdsCreditSlashRedeemResponse,
     AdsCreditsDiscountsSlashGetResponse,
     BillingProfilesSlashGetResponse,
     SsioAccountsSlashGetResponse,
     SsioInsertionOrderSlashCreateResponse,
     SsioInsertionOrderSlashEditResponse,
     SsioInsertionOrdersStatusSlashGetByAdAccountResponse,
     SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse,
     SsioOrderLinesSlashGetByAdAccountResponse,
     BoardSectionsSlashCreateResponse,
     BoardSectionsSlashDeleteResponse,
     BoardSectionsSlashListResponse,
     BoardSectionsSlashListPinsResponse,
     BoardSectionsSlashUpdateResponse,
     BoardsSlashCreateResponse,
     BoardsSlashDeleteResponse,
     BoardsSlashGetResponse,
     BoardsSlashListResponse,
     BoardsSlashListPinsResponse,
     BoardsSlashUpdateResponse,
     BulkDownloadSlashCreateResponse,
     BulkRequestSlashGetResponse,
     BulkUpsertSlashCreateResponse,
     CampaignTargetingAnalyticsSlashGetResponse,
     CampaignsSlashAnalyticsResponse,
     CampaignsSlashCreateResponse,
     CampaignsSlashGetResponse,
     CampaignsSlashListResponse,
     CampaignsSlashUpdateResponse,
     CatalogsProductGroupPinsSlashListResponse,
     CatalogsProductGroupsSlashCreateResponse,
     CatalogsProductGroupsSlashDeleteResponse,
     CatalogsProductGroupsSlashGetResponse,
     CatalogsProductGroupsSlashListResponse,
     CatalogsProductGroupsSlashProductCountsGetResponse,
     CatalogsProductGroupsSlashUpdateResponse,
     CatalogsSlashListResponse,
     FeedProcessingResultsSlashListResponse,
     FeedsSlashCreateResponse,
     FeedsSlashDeleteResponse,
     FeedsSlashGetResponse,
     FeedsSlashListResponse,
     FeedsSlashUpdateResponse,
     ItemsBatchSlashGetResponse,
     ItemsBatchSlashPostResponse,
     ItemsIssuesSlashListResponse,
     ItemsSlashGetResponse,
     ProductsByProductGroupFilterSlashListResponse,
     EventsSlashCreateResponse,
     ConversionTagsSlashCreateResponse,
     ConversionTagsSlashGetResponse,
     ConversionTagsSlashListResponse,
     OcpmEligibleConversionTagsSlashGetResponse,
     PageVisitConversionTagsSlashGetResponse,
     CustomerListsSlashCreateResponse,
     CustomerListsSlashGetResponse,
     CustomerListsSlashListResponse,
     CustomerListsSlashUpdateResponse,
     IntegrationsCommerceSlashDelResponse,
     IntegrationsCommerceSlashGetResponse,
     IntegrationsCommerceSlashPatchResponse,
     IntegrationsCommerceSlashPostResponse,
     IntegrationsLogsSlashPostResponse,
     IntegrationsSlashGetByIdResponse,
     IntegrationsSlashGetListResponse,
     CountryKeywordsMetricsSlashGetResponse,
     KeywordsSlashCreateResponse,
     KeywordsSlashGetResponse,
     KeywordsSlashUpdateResponse,
     TrendingKeywordsSlashListResponse,
     AdAccountsSubscriptionsSlashDelByIdResponse,
     AdAccountsSubscriptionsSlashGetByIdResponse,
     AdAccountsSubscriptionsSlashGetListResponse,
     AdAccountsSubscriptionsSlashPostResponse,
     LeadFormSlashGetResponse,
     LeadFormTestSlashCreateResponse,
     LeadFormsSlashListResponse,
     MediaSlashCreateResponse,
     MediaSlashGetResponse,
     MediaSlashListResponse,
     OauthSlashTokenResponse,
     OrderLinesSlashGetResponse,
     OrderLinesSlashListResponse,
     PinsSlashAnalyticsResponse,
     PinsSlashCreateResponse,
     PinsSlashDeleteResponse,
     PinsSlashGetResponse,
     PinsSlashListResponse,
     PinsSlashSaveResponse,
     PinsSlashUpdateResponse,
     ProductGroupPromotionsSlashCreateResponse,
     ProductGroupPromotionsSlashGetResponse,
     ProductGroupPromotionsSlashListResponse,
     ProductGroupPromotionsSlashUpdateResponse,
     ProductGroupsSlashAnalyticsResponse,
     AdAccountsCatalogsProductGroupsSlashListResponse,
     AdAccountCountriesSlashGetResponse,
     DeliveryMetricsSlashGetResponse,
     InterestTargetingOptionsSlashGetResponse,
     LeadFormQuestionsSlashGetResponse,
     MetricsReadyStateSlashGetResponse,
     TargetingOptionsSlashGetResponse,
     SearchPartnerPinsResponse,
     SearchUserBoardsSlashGetResponse,
     SearchUserPinsSlashListResponse,
     TermsRelatedSlashListResponse,
     TermsSuggestedSlashListResponse,
     TermsOfServiceSlashGetResponse,
     BoardsUserFollowsSlashListResponse,
     FollowUserSlashUpdateResponse,
     FollowersSlashListResponse,
     LinkedBusinessAccountsSlashGetResponse,
     UnverifyWebsiteSlashDeleteResponse,
     UserAccountSlashAnalyticsResponse,
     UserAccountSlashAnalyticsSlashTopPinsResponse,
     UserAccountSlashAnalyticsSlashTopVideoPinsResponse,
     UserAccountSlashFollowedInterestsResponse,
     UserAccountSlashGetResponse,
     UserFollowingSlashGetResponse,
     UserWebsitesSlashGetResponse,
     VerifyWebsiteSlashUpdateResponse,
     WebsiteVerificationSlashGetResponse
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

    let host = uri.host().ok_or(ClientInitError::MissingHost)?;
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
                   .map_err(ClientInitError::SslError)?;
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
            .map_err(ClientInitError::SslError)?;
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
            .map_err(ClientInitError::SslError)?;
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
            .map_err(ClientInitError::SslError)?;
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

    async fn ad_account_slash_analytics(
        &self,
        param_ad_account_id: String,
        param_start_date: chrono::naive::NaiveDate,
        param_end_date: chrono::naive::NaiveDate,
        param_columns: &Vec<String>,
        param_granularity: models::Granularity,
        param_click_window_days: Option<i32>,
        param_engagement_window_days: Option<i32>,
        param_view_window_days: Option<i32>,
        param_conversion_report_time: Option<String>,
        context: &C) -> Result<AdAccountSlashAnalyticsResponse, ApiError>
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
                    &param_conversion_report_time);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Vec<models::AdAccountAnalyticsResponseInner>>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountSlashAnalyticsResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountSlashAnalyticsResponse::InvalidAdAccountAnalyticsParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountSlashAnalyticsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ad_account_targeting_analytics_slash_get(
        &self,
        param_ad_account_id: String,
        param_start_date: chrono::naive::NaiveDate,
        param_end_date: chrono::naive::NaiveDate,
        param_targeting_types: &Vec<models::AdsAnalyticsTargetingType>,
        param_columns: &Vec<String>,
        param_granularity: models::Granularity,
        param_click_window_days: Option<i32>,
        param_engagement_window_days: Option<i32>,
        param_view_window_days: Option<i32>,
        param_conversion_report_time: Option<String>,
        param_attribution_types: Option<models::ConversionReportAttributionType>,
        context: &C) -> Result<AdAccountTargetingAnalyticsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/targeting_analytics",
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
                query_string.append_pair("targeting_types",
                    &param_targeting_types.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
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
                    &param_conversion_report_time);
            }
            if let Some(param_attribution_types) = param_attribution_types {
                query_string.append_pair("attribution_types",
                    &param_attribution_types.to_string());
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::MetricsResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountTargetingAnalyticsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountTargetingAnalyticsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ad_accounts_slash_create(
        &self,
        param_ad_account_create_request: models::AdAccountCreateRequest,
        context: &C) -> Result<AdAccountsSlashCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts",
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

        let body = serde_json::to_string(&param_ad_account_create_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdAccount>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSlashCreateResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSlashCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ad_accounts_slash_get(
        &self,
        param_ad_account_id: String,
        context: &C) -> Result<AdAccountsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}",
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
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdAccount>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ad_accounts_slash_list(
        &self,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        param_include_shared_accounts: Option<bool>,
        context: &C) -> Result<AdAccountsSlashListResponse, ApiError>
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
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdAccountsList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSlashListResponse::Response
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn analytics_slash_create_mmm_report(
        &self,
        param_ad_account_id: String,
        param_create_mmm_report_request: models::CreateMmmReportRequest,
        context: &C) -> Result<AnalyticsSlashCreateMmmReportResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/mmm_reports",
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

        let body = serde_json::to_string(&param_create_mmm_report_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CreateMmmReportResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AnalyticsSlashCreateMmmReportResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AnalyticsSlashCreateMmmReportResponse::InvalidAdAccountAdsAnalyticsMmmParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AnalyticsSlashCreateMmmReportResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn analytics_slash_create_report(
        &self,
        param_ad_account_id: String,
        param_ads_analytics_create_async_request: models::AdsAnalyticsCreateAsyncRequest,
        context: &C) -> Result<AnalyticsSlashCreateReportResponse, ApiError>
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
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdsAnalyticsCreateAsyncResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AnalyticsSlashCreateReportResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AnalyticsSlashCreateReportResponse::InvalidAdAccountAdsAnalyticsParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AnalyticsSlashCreateReportResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn analytics_slash_create_template_report(
        &self,
        param_ad_account_id: String,
        param_template_id: String,
        param_start_date: Option<chrono::naive::NaiveDate>,
        param_end_date: Option<chrono::naive::NaiveDate>,
        param_granularity: Option<models::Granularity>,
        context: &C) -> Result<AnalyticsSlashCreateTemplateReportResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/templates/{template_id}/reports",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
            ,template_id=utf8_percent_encode(&param_template_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_start_date) = param_start_date {
                query_string.append_pair("start_date",
                    &param_start_date.to_string());
            }
            if let Some(param_end_date) = param_end_date {
                query_string.append_pair("end_date",
                    &param_end_date.to_string());
            }
            if let Some(param_granularity) = param_granularity {
                query_string.append_pair("granularity",
                    &param_granularity.to_string());
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
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdsAnalyticsCreateAsyncResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AnalyticsSlashCreateTemplateReportResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AnalyticsSlashCreateTemplateReportResponse::InvalidAdAccountAdsAnalyticsTemplateParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AnalyticsSlashCreateTemplateReportResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn analytics_slash_get_mmm_report(
        &self,
        param_ad_account_id: String,
        param_token: String,
        context: &C) -> Result<AnalyticsSlashGetMmmReportResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/mmm_reports",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("token",
                    &param_token);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::GetMmmReportResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AnalyticsSlashGetMmmReportResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AnalyticsSlashGetMmmReportResponse::InvalidAdAccountAdsAnalyticsParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AnalyticsSlashGetMmmReportResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn analytics_slash_get_report(
        &self,
        param_ad_account_id: String,
        param_token: String,
        context: &C) -> Result<AnalyticsSlashGetReportResponse, ApiError>
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
                    &param_token);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdsAnalyticsGetAsyncResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AnalyticsSlashGetReportResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AnalyticsSlashGetReportResponse::InvalidAdAccountAdsAnalyticsParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AnalyticsSlashGetReportResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn sandbox_slash_delete(
        &self,
        param_ad_account_id: String,
        context: &C) -> Result<SandboxSlashDeleteResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/sandbox",
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
            .method("DELETE")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<String>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SandboxSlashDeleteResponse::OK
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SandboxSlashDeleteResponse::InvalidAdAccountId
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SandboxSlashDeleteResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn templates_slash_list(
        &self,
        param_ad_account_id: String,
        param_page_size: Option<i32>,
        param_order: Option<String>,
        param_bookmark: Option<String>,
        context: &C) -> Result<TemplatesSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/templates",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_order) = param_order {
                query_string.append_pair("order",
                    &param_order);
            }
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::TemplatesList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(TemplatesSlashListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(TemplatesSlashListResponse::InvalidAdAccountTemplateParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(TemplatesSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ad_groups_bid_floor_slash_get(
        &self,
        param_ad_account_id: String,
        param_bid_floor_request: models::BidFloorRequest,
        context: &C) -> Result<AdGroupsBidFloorSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/bid_floor",
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

        // Body parameter
        let body = serde_json::to_string(&param_bid_floor_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::BidFloor>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdGroupsBidFloorSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdGroupsBidFloorSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ad_groups_slash_analytics(
        &self,
        param_ad_account_id: String,
        param_start_date: chrono::naive::NaiveDate,
        param_end_date: chrono::naive::NaiveDate,
        param_ad_group_ids: &Vec<String>,
        param_columns: &Vec<String>,
        param_granularity: models::Granularity,
        param_click_window_days: Option<i32>,
        param_engagement_window_days: Option<i32>,
        param_view_window_days: Option<i32>,
        param_conversion_report_time: Option<String>,
        context: &C) -> Result<AdGroupsSlashAnalyticsResponse, ApiError>
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
                    &param_conversion_report_time);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Vec<models::AdGroupsAnalyticsResponseInner>>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdGroupsSlashAnalyticsResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdGroupsSlashAnalyticsResponse::InvalidAdAccountGroupAnalyticsParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdGroupsSlashAnalyticsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ad_groups_slash_audience_sizing(
        &self,
        param_ad_account_id: String,
        param_ad_group_audience_sizing_request: Option<models::AdGroupAudienceSizingRequest>,
        context: &C) -> Result<AdGroupsSlashAudienceSizingResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/ad_groups/audience_sizing",
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
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = param_ad_group_audience_sizing_request.map(|ref body| {
            serde_json::to_string(body).expect("impossible to fail to serialize")
        });
        if let Some(body) = body {
                *request.body_mut() = Body::from(body);
        }

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdGroupAudienceSizingResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdGroupsSlashAudienceSizingResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdGroupsSlashAudienceSizingResponse::InvalidAdGroupAudienceSizingParameters
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdGroupsSlashAudienceSizingResponse::NoAccessToRequestedAudienceListOrProductGroup
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdGroupsSlashAudienceSizingResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ad_groups_slash_create(
        &self,
        param_ad_account_id: String,
        param_ad_group_create_request: &Vec<models::AdGroupCreateRequest>,
        context: &C) -> Result<AdGroupsSlashCreateResponse, ApiError>
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

        let body = serde_json::to_string(&param_ad_group_create_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdGroupArrayResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdGroupsSlashCreateResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdGroupsSlashCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ad_groups_slash_get(
        &self,
        param_ad_account_id: String,
        param_ad_group_id: String,
        context: &C) -> Result<AdGroupsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
            ,ad_group_id=utf8_percent_encode(&param_ad_group_id.to_string(), ID_ENCODE_SET)
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdGroupResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdGroupsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdGroupsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ad_groups_slash_list(
        &self,
        param_ad_account_id: String,
        param_campaign_ids: Option<&Vec<String>>,
        param_ad_group_ids: Option<&Vec<String>>,
        param_entity_statuses: Option<&Vec<String>>,
        param_page_size: Option<i32>,
        param_order: Option<String>,
        param_bookmark: Option<String>,
        param_translate_interests_to_names: Option<bool>,
        context: &C) -> Result<AdGroupsSlashListResponse, ApiError>
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
                    &param_order);
            }
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdGroupsList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdGroupsSlashListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdGroupsSlashListResponse::InvalidAdAccountGroupParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdGroupsSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ad_groups_slash_update(
        &self,
        param_ad_account_id: String,
        param_ad_group_update_request: &Vec<models::AdGroupUpdateRequest>,
        context: &C) -> Result<AdGroupsSlashUpdateResponse, ApiError>
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

        let body = serde_json::to_string(&param_ad_group_update_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdGroupArrayResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdGroupsSlashUpdateResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdGroupsSlashUpdateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ad_groups_targeting_analytics_slash_get(
        &self,
        param_ad_account_id: String,
        param_ad_group_ids: &Vec<String>,
        param_start_date: chrono::naive::NaiveDate,
        param_end_date: chrono::naive::NaiveDate,
        param_targeting_types: &Vec<models::AdsAnalyticsTargetingType>,
        param_columns: &Vec<String>,
        param_granularity: models::Granularity,
        param_click_window_days: Option<i32>,
        param_engagement_window_days: Option<i32>,
        param_view_window_days: Option<i32>,
        param_conversion_report_time: Option<String>,
        param_attribution_types: Option<models::ConversionReportAttributionType>,
        context: &C) -> Result<AdGroupsTargetingAnalyticsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("ad_group_ids",
                    &param_ad_group_ids.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
                query_string.append_pair("start_date",
                    &param_start_date.to_string());
                query_string.append_pair("end_date",
                    &param_end_date.to_string());
                query_string.append_pair("targeting_types",
                    &param_targeting_types.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
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
                    &param_conversion_report_time);
            }
            if let Some(param_attribution_types) = param_attribution_types {
                query_string.append_pair("attribution_types",
                    &param_attribution_types.to_string());
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::MetricsResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdGroupsTargetingAnalyticsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdGroupsTargetingAnalyticsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ad_previews_slash_create(
        &self,
        param_ad_account_id: String,
        param_ad_preview_request: models::AdPreviewRequest,
        context: &C) -> Result<AdPreviewsSlashCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/ad_previews",
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

        // Body parameter
        let body = serde_json::to_string(&param_ad_preview_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdPreviewUrlResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdPreviewsSlashCreateResponse::SuccessfulAdPreviewCreation
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdPreviewsSlashCreateResponse::InvalidPinParametersResponse
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdPreviewsSlashCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ad_targeting_analytics_slash_get(
        &self,
        param_ad_account_id: String,
        param_ad_ids: &Vec<String>,
        param_start_date: chrono::naive::NaiveDate,
        param_end_date: chrono::naive::NaiveDate,
        param_targeting_types: &Vec<models::AdsAnalyticsTargetingType>,
        param_columns: &Vec<String>,
        param_granularity: models::Granularity,
        param_click_window_days: Option<i32>,
        param_engagement_window_days: Option<i32>,
        param_view_window_days: Option<i32>,
        param_conversion_report_time: Option<String>,
        param_attribution_types: Option<models::ConversionReportAttributionType>,
        context: &C) -> Result<AdTargetingAnalyticsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/ads/targeting_analytics",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("ad_ids",
                    &param_ad_ids.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
                query_string.append_pair("start_date",
                    &param_start_date.to_string());
                query_string.append_pair("end_date",
                    &param_end_date.to_string());
                query_string.append_pair("targeting_types",
                    &param_targeting_types.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
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
                    &param_conversion_report_time);
            }
            if let Some(param_attribution_types) = param_attribution_types {
                query_string.append_pair("attribution_types",
                    &param_attribution_types.to_string());
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::MetricsResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdTargetingAnalyticsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdTargetingAnalyticsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ads_slash_analytics(
        &self,
        param_ad_account_id: String,
        param_start_date: chrono::naive::NaiveDate,
        param_end_date: chrono::naive::NaiveDate,
        param_ad_ids: &Vec<String>,
        param_columns: &Vec<String>,
        param_granularity: models::Granularity,
        param_click_window_days: Option<i32>,
        param_engagement_window_days: Option<i32>,
        param_view_window_days: Option<i32>,
        param_conversion_report_time: Option<String>,
        context: &C) -> Result<AdsSlashAnalyticsResponse, ApiError>
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
                    &param_conversion_report_time);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Vec<models::AdsAnalyticsResponseInner>>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdsSlashAnalyticsResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdsSlashAnalyticsResponse::InvalidAdAccountAdsAnalyticsParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdsSlashAnalyticsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ads_slash_create(
        &self,
        param_ad_account_id: String,
        param_ad_create_request: &Vec<models::AdCreateRequest>,
        context: &C) -> Result<AdsSlashCreateResponse, ApiError>
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

        let body = serde_json::to_string(&param_ad_create_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdArrayResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdsSlashCreateResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdsSlashCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ads_slash_get(
        &self,
        param_ad_account_id: String,
        param_ad_id: String,
        context: &C) -> Result<AdsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/ads/{ad_id}",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
            ,ad_id=utf8_percent_encode(&param_ad_id.to_string(), ID_ENCODE_SET)
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ads_slash_list(
        &self,
        param_ad_account_id: String,
        param_campaign_ids: Option<&Vec<String>>,
        param_ad_group_ids: Option<&Vec<String>>,
        param_ad_ids: Option<&Vec<String>>,
        param_entity_statuses: Option<&Vec<String>>,
        param_page_size: Option<i32>,
        param_order: Option<String>,
        param_bookmark: Option<String>,
        context: &C) -> Result<AdsSlashListResponse, ApiError>
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
                    &param_order);
            }
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdsList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdsSlashListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdsSlashListResponse::InvalidAdAccountAdsParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdsSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ads_slash_update(
        &self,
        param_ad_account_id: String,
        param_ad_update_request: &Vec<models::AdUpdateRequest>,
        context: &C) -> Result<AdsSlashUpdateResponse, ApiError>
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

        let body = serde_json::to_string(&param_ad_update_request).expect("impossible to fail to serialize");

                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdArrayResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdsSlashUpdateResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdsSlashUpdateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn audience_insights_scope_and_type_slash_get(
        &self,
        param_ad_account_id: String,
        context: &C) -> Result<AudienceInsightsScopeAndTypeSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/insights/audiences",
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
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AudienceDefinitionResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AudienceInsightsScopeAndTypeSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AudienceInsightsScopeAndTypeSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn audience_insights_slash_get(
        &self,
        param_ad_account_id: String,
        param_audience_insight_type: models::AudienceInsightType,
        context: &C) -> Result<AudienceInsightsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/audience_insights",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("audience_insight_type",
                    &param_audience_insight_type.to_string());
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AudienceInsightsResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AudienceInsightsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AudienceInsightsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn audiences_slash_create(
        &self,
        param_ad_account_id: String,
        param_audience_create_request: models::AudienceCreateRequest,
        context: &C) -> Result<AudiencesSlashCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/audiences",
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

        // Body parameter
        let body = serde_json::to_string(&param_audience_create_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Audience>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AudiencesSlashCreateResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AudiencesSlashCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn audiences_slash_create_custom(
        &self,
        param_ad_account_id: String,
        param_audience_create_custom_request: models::AudienceCreateCustomRequest,
        context: &C) -> Result<AudiencesSlashCreateCustomResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/audiences/custom",
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

        let body = serde_json::to_string(&param_audience_create_custom_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Audience>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AudiencesSlashCreateCustomResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AudiencesSlashCreateCustomResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn audiences_slash_get(
        &self,
        param_ad_account_id: String,
        param_audience_id: String,
        context: &C) -> Result<AudiencesSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
            ,audience_id=utf8_percent_encode(&param_audience_id.to_string(), ID_ENCODE_SET)
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Audience>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AudiencesSlashGetResponse::Success
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AudiencesSlashGetResponse::AudienceNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AudiencesSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn audiences_slash_list(
        &self,
        param_ad_account_id: String,
        param_bookmark: Option<String>,
        param_order: Option<String>,
        param_page_size: Option<i32>,
        param_ownership_type: Option<String>,
        context: &C) -> Result<AudiencesSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/audiences",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
            }
            if let Some(param_order) = param_order {
                query_string.append_pair("order",
                    &param_order);
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_ownership_type) = param_ownership_type {
                query_string.append_pair("ownership_type",
                    &param_ownership_type);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AudiencesList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AudiencesSlashListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AudiencesSlashListResponse::InvalidAdAccountAudienceParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AudiencesSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn audiences_slash_update(
        &self,
        param_ad_account_id: String,
        param_audience_id: String,
        param_audience_update_request: Option<models::AudienceUpdateRequest>,
        context: &C) -> Result<AudiencesSlashUpdateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
            ,audience_id=utf8_percent_encode(&param_audience_id.to_string(), ID_ENCODE_SET)
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

        let body = param_audience_update_request.map(|ref body| {
            serde_json::to_string(body).expect("impossible to fail to serialize")
        });

        if let Some(body) = body {
                *request.body_mut() = Body::from(body);
        }

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Audience>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AudiencesSlashUpdateResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AudiencesSlashUpdateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ads_credit_slash_redeem(
        &self,
        param_ad_account_id: String,
        param_ads_credit_redeem_request: models::AdsCreditRedeemRequest,
        context: &C) -> Result<AdsCreditSlashRedeemResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/ads_credit/redeem",
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

        // Body parameter
        let body = serde_json::to_string(&param_ads_credit_redeem_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdsCreditRedeemResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdsCreditSlashRedeemResponse::SuccessfullyRedeemedAdCredits
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdsCreditSlashRedeemResponse::ErrorThrownWhenUnableToRedeemOfferCode
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdsCreditSlashRedeemResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ads_credits_discounts_slash_get(
        &self,
        param_ad_account_id: String,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        context: &C) -> Result<AdsCreditsDiscountsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/ads_credit/discounts",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdsCreditsDiscountsGet200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdsCreditsDiscountsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdsCreditsDiscountsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn billing_profiles_slash_get(
        &self,
        param_ad_account_id: String,
        param_is_active: bool,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        context: &C) -> Result<BillingProfilesSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/billing_profiles",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("is_active",
                    &param_is_active.to_string());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::BillingProfilesGet200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BillingProfilesSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BillingProfilesSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ssio_accounts_slash_get(
        &self,
        param_ad_account_id: String,
        context: &C) -> Result<SsioAccountsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/ssio/accounts",
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
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::SsioAccountResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SsioAccountsSlashGetResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SsioAccountsSlashGetResponse::InvalidRequestParameter
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SsioAccountsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ssio_insertion_order_slash_create(
        &self,
        param_ad_account_id: String,
        param_ssio_create_insertion_order_request: models::SsioCreateInsertionOrderRequest,
        context: &C) -> Result<SsioInsertionOrderSlashCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders",
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

        let body = serde_json::to_string(&param_ssio_create_insertion_order_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::SsioCreateInsertionOrderResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SsioInsertionOrderSlashCreateResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SsioInsertionOrderSlashCreateResponse::InvalidRequest
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SsioInsertionOrderSlashCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ssio_insertion_order_slash_edit(
        &self,
        param_ad_account_id: String,
        param_ssio_edit_insertion_order_request: models::SsioEditInsertionOrderRequest,
        context: &C) -> Result<SsioInsertionOrderSlashEditResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders",
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
            .method("PATCH")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_ssio_edit_insertion_order_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::SsioEditInsertionOrderResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SsioInsertionOrderSlashEditResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SsioInsertionOrderSlashEditResponse::InvalidRequest
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SsioInsertionOrderSlashEditResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ssio_insertion_orders_status_slash_get_by_ad_account(
        &self,
        param_ad_account_id: String,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        context: &C) -> Result<SsioInsertionOrdersStatusSlashGetByAdAccountResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/status",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::SsioInsertionOrdersStatusGetByAdAccount200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SsioInsertionOrdersStatusSlashGetByAdAccountResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SsioInsertionOrdersStatusSlashGetByAdAccountResponse::InvalidRequestParameter
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SsioInsertionOrdersStatusSlashGetByAdAccountResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ssio_insertion_orders_status_slash_get_by_pin_order_id(
        &self,
        param_ad_account_id: String,
        param_pin_order_id: String,
        context: &C) -> Result<SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
            ,pin_order_id=utf8_percent_encode(&param_pin_order_id.to_string(), ID_ENCODE_SET)
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::SsioInsertionOrderStatusResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse::InvalidRequestParameter
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ssio_order_lines_slash_get_by_ad_account(
        &self,
        param_ad_account_id: String,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        param_pin_order_id: Option<String>,
        context: &C) -> Result<SsioOrderLinesSlashGetByAdAccountResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/ssio/order_lines",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_pin_order_id) = param_pin_order_id {
                query_string.append_pair("pin_order_id",
                    &param_pin_order_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::SsioOrderLinesGetByAdAccount200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SsioOrderLinesSlashGetByAdAccountResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SsioOrderLinesSlashGetByAdAccountResponse::InvalidRequestParameter
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SsioOrderLinesSlashGetByAdAccountResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn board_sections_slash_create(
        &self,
        param_board_id: String,
        param_board_section: models::BoardSection,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<BoardSectionsSlashCreateResponse, ApiError>
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
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            201 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::BoardSection>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashCreateResponse::Response
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashCreateResponse::InvalidBoardSectionParameters
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashCreateResponse::NotAuthorizedToCreateBoardSections
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashCreateResponse::CouldNotGetExclusiveAccessToTheBoardToCreateANewSection
                    (body)
                )
            }
            500 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashCreateResponse::CouldNotCreateANewBoardSection
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn board_sections_slash_delete(
        &self,
        param_board_id: String,
        param_section_id: String,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<BoardSectionsSlashDeleteResponse, ApiError>
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
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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
            .method("DELETE")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            204 => {
                Ok(
                    BoardSectionsSlashDeleteResponse::BoardSectionDeletedSuccessfully
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashDeleteResponse::NotAuthorizedToDeleteBoardSection
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashDeleteResponse::BoardSectionNotFound
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashDeleteResponse::BoardSectionConflict
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashDeleteResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn board_sections_slash_list(
        &self,
        param_board_id: String,
        param_ad_account_id: Option<String>,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        context: &C) -> Result<BoardSectionsSlashListResponse, ApiError>
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
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
            }
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::BoardSectionsList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashListResponse::Response
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn board_sections_slash_list_pins(
        &self,
        param_board_id: String,
        param_section_id: String,
        param_ad_account_id: Option<String>,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        context: &C) -> Result<BoardSectionsSlashListPinsResponse, ApiError>
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
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
            }
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::BoardsListPins200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashListPinsResponse::Response
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashListPinsResponse::NotAuthorizedToAccessPinsOnBoardSection
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashListPinsResponse::BoardOrSectionNotFound
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashListPinsResponse::BoardSectionConflict
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashListPinsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn board_sections_slash_update(
        &self,
        param_board_id: String,
        param_section_id: String,
        param_board_section: models::BoardSection,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<BoardSectionsSlashUpdateResponse, ApiError>
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
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::BoardSection>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashUpdateResponse::Response
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashUpdateResponse::InvalidBoardSectionParameters
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashUpdateResponse::NotAuthorizedToUpdateBoardSection
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashUpdateResponse::BoardSectionConflict
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardSectionsSlashUpdateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn boards_slash_create(
        &self,
        param_board: models::Board,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<BoardsSlashCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/boards",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            201 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Board>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashCreateResponse::Response
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashCreateResponse::TheBoardNameIsInvalidOrDuplicated
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn boards_slash_delete(
        &self,
        param_board_id: String,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<BoardsSlashDeleteResponse, ApiError>
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
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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
            .method("DELETE")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            204 => {
                Ok(
                    BoardsSlashDeleteResponse::BoardDeletedSuccessfully
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashDeleteResponse::NotAuthorizedToDeleteTheBoard
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashDeleteResponse::BoardNotFound
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashDeleteResponse::CouldNotGetExclusiveAccessToDeleteTheBoard
                    (body)
                )
            }
            429 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashDeleteResponse::ThisRequestExceededARateLimit
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashDeleteResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn boards_slash_get(
        &self,
        param_board_id: String,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<BoardsSlashGetResponse, ApiError>
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
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Board>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashGetResponse::Response
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashGetResponse::BoardNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn boards_slash_list(
        &self,
        param_ad_account_id: Option<String>,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        param_privacy: Option<String>,
        context: &C) -> Result<BoardsSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/boards",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
            }
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_privacy) = param_privacy {
                query_string.append_pair("privacy",
                    &param_privacy);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::BoardsList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashListResponse::Response
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn boards_slash_list_pins(
        &self,
        param_board_id: String,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        param_creative_types: Option<&Vec<String>>,
        param_ad_account_id: Option<String>,
        param_pin_metrics: Option<bool>,
        context: &C) -> Result<BoardsSlashListPinsResponse, ApiError>
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
                    &param_bookmark);
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_creative_types) = param_creative_types {
                query_string.append_pair("creative_types",
                    &param_creative_types.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
            }
            if let Some(param_pin_metrics) = param_pin_metrics {
                query_string.append_pair("pin_metrics",
                    &param_pin_metrics.to_string());
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::BoardsListPins200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashListPinsResponse::Response
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashListPinsResponse::BoardNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashListPinsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn boards_slash_update(
        &self,
        param_board_id: String,
        param_board_update: models::BoardUpdate,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<BoardsSlashUpdateResponse, ApiError>
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
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Board>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashUpdateResponse::Response
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashUpdateResponse::InvalidBoardParameters
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashUpdateResponse::NotAuthorizedToUpdateTheBoard
                    (body)
                )
            }
            429 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashUpdateResponse::ThisRequestExceededARateLimit
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsSlashUpdateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn bulk_download_slash_create(
        &self,
        param_ad_account_id: String,
        param_bulk_download_request: models::BulkDownloadRequest,
        context: &C) -> Result<BulkDownloadSlashCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/bulk/download",
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

        // Body parameter
        let body = serde_json::to_string(&param_bulk_download_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::BulkDownloadResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BulkDownloadSlashCreateResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BulkDownloadSlashCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn bulk_request_slash_get(
        &self,
        param_ad_account_id: String,
        param_bulk_request_id: String,
        param_include_details: Option<bool>,
        context: &C) -> Result<BulkRequestSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
            ,bulk_request_id=utf8_percent_encode(&param_bulk_request_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_include_details) = param_include_details {
                query_string.append_pair("include_details",
                    &param_include_details.to_string());
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::BulkUpsertStatusResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BulkRequestSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BulkRequestSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn bulk_upsert_slash_create(
        &self,
        param_ad_account_id: String,
        param_bulk_upsert_request: models::BulkUpsertRequest,
        context: &C) -> Result<BulkUpsertSlashCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/bulk/upsert",
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

        let body = serde_json::to_string(&param_bulk_upsert_request).expect("impossible to fail to serialize");

                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::BulkUpsertResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BulkUpsertSlashCreateResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BulkUpsertSlashCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn campaign_targeting_analytics_slash_get(
        &self,
        param_ad_account_id: String,
        param_campaign_ids: &Vec<String>,
        param_start_date: chrono::naive::NaiveDate,
        param_end_date: chrono::naive::NaiveDate,
        param_targeting_types: &Vec<models::AdsAnalyticsTargetingType>,
        param_columns: &Vec<String>,
        param_granularity: models::Granularity,
        param_click_window_days: Option<i32>,
        param_engagement_window_days: Option<i32>,
        param_view_window_days: Option<i32>,
        param_conversion_report_time: Option<String>,
        param_attribution_types: Option<models::ConversionReportAttributionType>,
        context: &C) -> Result<CampaignTargetingAnalyticsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/campaigns/targeting_analytics",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("campaign_ids",
                    &param_campaign_ids.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
                query_string.append_pair("start_date",
                    &param_start_date.to_string());
                query_string.append_pair("end_date",
                    &param_end_date.to_string());
                query_string.append_pair("targeting_types",
                    &param_targeting_types.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
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
                    &param_conversion_report_time);
            }
            if let Some(param_attribution_types) = param_attribution_types {
                query_string.append_pair("attribution_types",
                    &param_attribution_types.to_string());
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::MetricsResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CampaignTargetingAnalyticsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CampaignTargetingAnalyticsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn campaigns_slash_analytics(
        &self,
        param_ad_account_id: String,
        param_start_date: chrono::naive::NaiveDate,
        param_end_date: chrono::naive::NaiveDate,
        param_campaign_ids: &Vec<String>,
        param_columns: &Vec<String>,
        param_granularity: models::Granularity,
        param_click_window_days: Option<i32>,
        param_engagement_window_days: Option<i32>,
        param_view_window_days: Option<i32>,
        param_conversion_report_time: Option<String>,
        context: &C) -> Result<CampaignsSlashAnalyticsResponse, ApiError>
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
                    &param_conversion_report_time);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Vec<models::CampaignsAnalyticsResponseInner>>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CampaignsSlashAnalyticsResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CampaignsSlashAnalyticsResponse::InvalidAdAccountCampaignAnalyticsParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CampaignsSlashAnalyticsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn campaigns_slash_create(
        &self,
        param_ad_account_id: String,
        param_campaign_create_request: &Vec<models::CampaignCreateRequest>,
        context: &C) -> Result<CampaignsSlashCreateResponse, ApiError>
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

        let body = serde_json::to_string(&param_campaign_create_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CampaignCreateResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CampaignsSlashCreateResponse::Response
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CampaignsSlashCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn campaigns_slash_get(
        &self,
        param_ad_account_id: String,
        param_campaign_id: String,
        context: &C) -> Result<CampaignsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/campaigns/{campaign_id}",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
            ,campaign_id=utf8_percent_encode(&param_campaign_id.to_string(), ID_ENCODE_SET)
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CampaignResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CampaignsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CampaignsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn campaigns_slash_list(
        &self,
        param_ad_account_id: String,
        param_campaign_ids: Option<&Vec<String>>,
        param_entity_statuses: Option<&Vec<String>>,
        param_page_size: Option<i32>,
        param_order: Option<String>,
        param_bookmark: Option<String>,
        context: &C) -> Result<CampaignsSlashListResponse, ApiError>
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
                    &param_order);
            }
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CampaignsList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CampaignsSlashListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CampaignsSlashListResponse::InvalidAdAccountCampaignParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CampaignsSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn campaigns_slash_update(
        &self,
        param_ad_account_id: String,
        param_campaign_update_request: &Vec<models::CampaignUpdateRequest>,
        context: &C) -> Result<CampaignsSlashUpdateResponse, ApiError>
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

        let body = serde_json::to_string(&param_campaign_update_request).expect("impossible to fail to serialize");

                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CampaignUpdateResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CampaignsSlashUpdateResponse::Response
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CampaignsSlashUpdateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn catalogs_product_group_pins_slash_list(
        &self,
        param_product_group_id: String,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupPinsSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/product_groups/{product_group_id}/products",
            self.base_path
            ,product_group_id=utf8_percent_encode(&param_product_group_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsProductGroupPinsList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupPinsSlashListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupPinsSlashListResponse::InvalidParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupPinsSlashListResponse::UnauthorizedAccess
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupPinsSlashListResponse::CatalogsProductGroupNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupPinsSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn catalogs_product_groups_slash_create(
        &self,
        param_catalogs_product_groups_create_request: models::CatalogsProductGroupsCreateRequest,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/product_groups",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_catalogs_product_groups_create_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            201 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsProductGroupsCreate201Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashCreateResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashCreateResponse::InvalidBody
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashCreateResponse::UnauthorizedAccess
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashCreateResponse::Forbidden
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashCreateResponse::Conflict
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn catalogs_product_groups_slash_delete(
        &self,
        param_product_group_id: String,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashDeleteResponse, ApiError>
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
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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
            .method("DELETE")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            204 => {
                Ok(
                    CatalogsProductGroupsSlashDeleteResponse::CatalogsProductGroupDeletedSuccessfully
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashDeleteResponse::InvalidCatalogsProductGroupIdParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashDeleteResponse::UnauthorizedAccess
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashDeleteResponse::Forbidden
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashDeleteResponse::CatalogsProductGroupNotFound
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashDeleteResponse::Conflict
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashDeleteResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn catalogs_product_groups_slash_get(
        &self,
        param_product_group_id: String,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashGetResponse, ApiError>
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
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsProductGroupsCreate201Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashGetResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashGetResponse::InvalidCatalogsProductGroupIdParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashGetResponse::UnauthorizedAccess
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashGetResponse::Forbidden
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashGetResponse::CatalogsProductGroupNotFound
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashGetResponse::Conflict
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn catalogs_product_groups_slash_list(
        &self,
        param_feed_id: Option<String>,
        param_catalog_id: Option<String>,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/product_groups",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_feed_id) = param_feed_id {
                query_string.append_pair("feed_id",
                    &param_feed_id);
            }
            if let Some(param_catalog_id) = param_catalog_id {
                query_string.append_pair("catalog_id",
                    &param_catalog_id);
            }
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsProductGroupsList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashListResponse::InvalidFeedParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashListResponse::UnauthorizedAccess
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashListResponse::Forbidden
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashListResponse::DataFeedNotFound
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashListResponse::Conflict
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn catalogs_product_groups_slash_product_counts_get(
        &self,
        param_product_group_id: String,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashProductCountsGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/product_groups/{product_group_id}/product_counts",
            self.base_path
            ,product_group_id=utf8_percent_encode(&param_product_group_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsProductGroupProductCounts>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashProductCountsGetResponse::Success
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashProductCountsGetResponse::ProductGroupNotFound
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashProductCountsGetResponse::Can
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashProductCountsGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn catalogs_product_groups_slash_update(
        &self,
        param_product_group_id: String,
        param_catalogs_product_groups_update_request: models::CatalogsProductGroupsUpdateRequest,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashUpdateResponse, ApiError>
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
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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
            .method("PATCH")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_catalogs_product_groups_update_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsProductGroupsCreate201Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashUpdateResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashUpdateResponse::InvalidParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashUpdateResponse::UnauthorizedAccess
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashUpdateResponse::Forbidden
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashUpdateResponse::CatalogsProductGroupNotFound
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashUpdateResponse::Conflict
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsProductGroupsSlashUpdateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn catalogs_slash_list(
        &self,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsSlashListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsSlashListResponse::InvalidParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsSlashListResponse::UnauthorizedAccess
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CatalogsSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn feed_processing_results_slash_list(
        &self,
        param_feed_id: String,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<FeedProcessingResultsSlashListResponse, ApiError>
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
                    &param_bookmark);
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::FeedProcessingResultsList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedProcessingResultsSlashListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedProcessingResultsSlashListResponse::InvalidParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedProcessingResultsSlashListResponse::UnauthorizedAccess
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedProcessingResultsSlashListResponse::FeedNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedProcessingResultsSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn feeds_slash_create(
        &self,
        param_feeds_create_request: models::FeedsCreateRequest,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/feeds",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_feeds_create_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            201 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsFeed>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashCreateResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashCreateResponse::InvalidFeedParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashCreateResponse::UnauthorizedAccess
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashCreateResponse::BusinessAccountRequired
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashCreateResponse::UserWebsiteRequired
                    (body)
                )
            }
            422 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashCreateResponse::UniqueFeedNameIsRequired
                    (body)
                )
            }
            501 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashCreateResponse::NotImplemented
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn feeds_slash_delete(
        &self,
        param_feed_id: String,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashDeleteResponse, ApiError>
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
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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
            .method("DELETE")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            204 => {
                Ok(
                    FeedsSlashDeleteResponse::FeedDeletedSuccessfully
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashDeleteResponse::InvalidFeedParameters
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashDeleteResponse::Forbidden
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashDeleteResponse::DataFeedNotFound
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashDeleteResponse::Conflict
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashDeleteResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn feeds_slash_get(
        &self,
        param_feed_id: String,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashGetResponse, ApiError>
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
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsFeed>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashGetResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashGetResponse::InvalidFeedParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashGetResponse::UnauthorizedAccess
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashGetResponse::DataFeedNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn feeds_slash_list(
        &self,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        param_catalog_id: Option<String>,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashListResponse, ApiError>
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
                    &param_bookmark);
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_catalog_id) = param_catalog_id {
                query_string.append_pair("catalog_id",
                    &param_catalog_id);
            }
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::FeedsList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashListResponse::InvalidParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashListResponse::UnauthorizedAccess
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn feeds_slash_update(
        &self,
        param_feed_id: String,
        param_feeds_update_request: models::FeedsUpdateRequest,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashUpdateResponse, ApiError>
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
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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
            .method("PATCH")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_feeds_update_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsFeed>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashUpdateResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashUpdateResponse::InvalidFeedParameters
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashUpdateResponse::Forbidden
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashUpdateResponse::DataFeedNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FeedsSlashUpdateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn items_batch_slash_get(
        &self,
        param_batch_id: String,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<ItemsBatchSlashGetResponse, ApiError>
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
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsItemsBatch>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsBatchSlashGetResponse::ResponseContainingTheRequestedCatalogsItemsBatch
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsBatchSlashGetResponse::NotAuthenticatedToAccessCatalogsItemsBatch
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsBatchSlashGetResponse::NotAuthorizedToAccessCatalogsItemsBatch
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsBatchSlashGetResponse::CatalogsItemsBatchNotFound
                    (body)
                )
            }
            405 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsBatchSlashGetResponse::MethodNotAllowed
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsBatchSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn items_batch_slash_post(
        &self,
        param_items_batch_post_request: models::ItemsBatchPostRequest,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<ItemsBatchSlashPostResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/items/batch",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_items_batch_post_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsItemsBatch>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsBatchSlashPostResponse::ResponseContainingTheRequestedCatalogsItemsBatch
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsBatchSlashPostResponse::InvalidRequestParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsBatchSlashPostResponse::NotAuthenticatedToPostCatalogsItems
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsBatchSlashPostResponse::NotAuthorizedToPostCatalogsItems
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsBatchSlashPostResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn items_issues_slash_list(
        &self,
        param_processing_result_id: String,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        param_item_numbers: Option<&Vec<i32>>,
        param_item_validation_issue: Option<models::CatalogsItemValidationIssue>,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<ItemsIssuesSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/processing_results/{processing_result_id}/item_issues",
            self.base_path
            ,processing_result_id=utf8_percent_encode(&param_processing_result_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_item_numbers) = param_item_numbers {
                query_string.append_pair("item_numbers",
                    &param_item_numbers.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_item_validation_issue) = param_item_validation_issue {
                query_string.append_pair("item_validation_issue",
                    &param_item_validation_issue.to_string());
            }
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::ItemsIssuesList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsIssuesSlashListResponse::Success
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsIssuesSlashListResponse::UnauthorizedAccess
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsIssuesSlashListResponse::ProcessingResultNotFound
                    (body)
                )
            }
            501 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsIssuesSlashListResponse::NotImplemented
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsIssuesSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn items_slash_get(
        &self,
        param_country: String,
        param_language: String,
        param_ad_account_id: Option<String>,
        param_item_ids: Option<&Vec<String>>,
        param_filters: Option<models::CatalogsItemsFilters>,
        context: &C) -> Result<ItemsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/items",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
            }
                query_string.append_pair("country",
                    &param_country);
                query_string.append_pair("language",
                    &param_language);
            if let Some(param_item_ids) = param_item_ids {
                query_string.append_pair("item_ids",
                    &param_item_ids.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_filters) = param_filters {
                query_string.append_pair("filters",
                    &param_filters.to_string());
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsItems>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsSlashGetResponse::ResponseContainingTheRequestedCatalogsItems
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsSlashGetResponse::InvalidRequestParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsSlashGetResponse::NotAuthorizedToAccessCatalogsItems
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsSlashGetResponse::NotAuthorizedToAccessCatalogsItems_2
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ItemsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn products_by_product_group_filter_slash_list(
        &self,
        param_catalogs_list_products_by_filter_request: models::CatalogsListProductsByFilterRequest,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<ProductsByProductGroupFilterSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/catalogs/products/get_by_product_group_filters",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_catalogs_list_products_by_filter_request).expect("impossible to fail to serialize");

                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CatalogsProductGroupPinsList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ProductsByProductGroupFilterSlashListResponse::Success
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ProductsByProductGroupFilterSlashListResponse::UnauthorizedAccess
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ProductsByProductGroupFilterSlashListResponse::Conflict
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ProductsByProductGroupFilterSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn events_slash_create(
        &self,
        param_ad_account_id: String,
        param_conversion_events: models::ConversionEvents,
        param_test: Option<bool>,
        context: &C) -> Result<EventsSlashCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/events",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_test) = param_test {
                query_string.append_pair("test",
                    &param_test.to_string());
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
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        // Body parameter
        let body = serde_json::to_string(&param_conversion_events).expect("impossible to fail to serialize");

                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
                    let auth = swagger::auth::Header(bearer_header.clone());
                    let header = match HeaderValue::from_str(&format!("{}", auth)) {
                        Ok(h) => h,
                        Err(e) => return Err(ApiError(format!("Unable to create Authorization header: {}", e)))
                    };
                    request.headers_mut().insert(
                        hyper::header::AUTHORIZATION,
                        header);
                },
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::ConversionApiResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(EventsSlashCreateResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(EventsSlashCreateResponse::TheRequestWasInvalid
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(EventsSlashCreateResponse::NotAuthorizedToSendConversionEvents
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(EventsSlashCreateResponse::UnauthorizedAccess
                    (body)
                )
            }
            422 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::DetailedError>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(EventsSlashCreateResponse::NotAllEventsWereSuccessfullyProcessed
                    (body)
                )
            }
            429 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(EventsSlashCreateResponse::ThisRequestExceededARateLimit
                    (body)
                )
            }
            503 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(EventsSlashCreateResponse::TheEndpointHasBeenRampedDownAndIsCurrentlyNotAcceptingAnyTraffic
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(EventsSlashCreateResponse::UnexpectedErrors
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn conversion_tags_slash_create(
        &self,
        param_ad_account_id: String,
        param_conversion_tag_create: models::ConversionTagCreate,
        context: &C) -> Result<ConversionTagsSlashCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/conversion_tags",
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

        // Body parameter
        let body = serde_json::to_string(&param_conversion_tag_create).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::ConversionTagResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ConversionTagsSlashCreateResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ConversionTagsSlashCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn conversion_tags_slash_get(
        &self,
        param_ad_account_id: String,
        param_conversion_tag_id: String,
        context: &C) -> Result<ConversionTagsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
            ,conversion_tag_id=utf8_percent_encode(&param_conversion_tag_id.to_string(), ID_ENCODE_SET)
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::ConversionTagResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ConversionTagsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ConversionTagsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn conversion_tags_slash_list(
        &self,
        param_ad_account_id: String,
        param_filter_deleted: Option<bool>,
        context: &C) -> Result<ConversionTagsSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/conversion_tags",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_filter_deleted) = param_filter_deleted {
                query_string.append_pair("filter_deleted",
                    &param_filter_deleted.to_string());
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::ConversionTagListResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ConversionTagsSlashListResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ConversionTagsSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ocpm_eligible_conversion_tags_slash_get(
        &self,
        param_ad_account_id: String,
        context: &C) -> Result<OcpmEligibleConversionTagsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible",
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
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<std::collections::HashMap<String, Vec<models::ConversionEventResponse>>>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(OcpmEligibleConversionTagsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(OcpmEligibleConversionTagsSlashGetResponse::UnexpectedErrors
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn page_visit_conversion_tags_slash_get(
        &self,
        param_ad_account_id: String,
        param_page_size: Option<i32>,
        param_order: Option<String>,
        param_bookmark: Option<String>,
        context: &C) -> Result<PageVisitConversionTagsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/conversion_tags/page_visit",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_order) = param_order {
                query_string.append_pair("order",
                    &param_order);
            }
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::PageVisitConversionTagsGet200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PageVisitConversionTagsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PageVisitConversionTagsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn customer_lists_slash_create(
        &self,
        param_ad_account_id: String,
        param_customer_list_request: models::CustomerListRequest,
        context: &C) -> Result<CustomerListsSlashCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/customer_lists",
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

        // Body parameter
        let body = serde_json::to_string(&param_customer_list_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CustomerList>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CustomerListsSlashCreateResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CustomerListsSlashCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn customer_lists_slash_get(
        &self,
        param_ad_account_id: String,
        param_customer_list_id: String,
        context: &C) -> Result<CustomerListsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
            ,customer_list_id=utf8_percent_encode(&param_customer_list_id.to_string(), ID_ENCODE_SET)
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CustomerList>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CustomerListsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CustomerListsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn customer_lists_slash_list(
        &self,
        param_ad_account_id: String,
        param_page_size: Option<i32>,
        param_order: Option<String>,
        param_bookmark: Option<String>,
        context: &C) -> Result<CustomerListsSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/customer_lists",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_order) = param_order {
                query_string.append_pair("order",
                    &param_order);
            }
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CustomerListsList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CustomerListsSlashListResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CustomerListsSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn customer_lists_slash_update(
        &self,
        param_ad_account_id: String,
        param_customer_list_id: String,
        param_customer_list_update_request: models::CustomerListUpdateRequest,
        context: &C) -> Result<CustomerListsSlashUpdateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
            ,customer_list_id=utf8_percent_encode(&param_customer_list_id.to_string(), ID_ENCODE_SET)
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

        let body = serde_json::to_string(&param_customer_list_update_request).expect("impossible to fail to serialize");

                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::CustomerList>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CustomerListsSlashUpdateResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CustomerListsSlashUpdateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn integrations_commerce_slash_del(
        &self,
        param_external_business_id: String,
        context: &C) -> Result<IntegrationsCommerceSlashDelResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/integrations/commerce/{external_business_id}",
            self.base_path
            ,external_business_id=utf8_percent_encode(&param_external_business_id.to_string(), ID_ENCODE_SET)
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            204 => {
                Ok(
                    IntegrationsCommerceSlashDelResponse::CommerceIntegrationDeletedSuccessfully
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsCommerceSlashDelResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn integrations_commerce_slash_get(
        &self,
        param_external_business_id: String,
        context: &C) -> Result<IntegrationsCommerceSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/integrations/commerce/{external_business_id}",
            self.base_path
            ,external_business_id=utf8_percent_encode(&param_external_business_id.to_string(), ID_ENCODE_SET)
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::IntegrationMetadata>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsCommerceSlashGetResponse::Success
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsCommerceSlashGetResponse::IntegrationNotFound
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsCommerceSlashGetResponse::Can
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsCommerceSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn integrations_commerce_slash_patch(
        &self,
        param_external_business_id: String,
        param_integration_request_patch: Option<models::IntegrationRequestPatch>,
        context: &C) -> Result<IntegrationsCommerceSlashPatchResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/integrations/commerce/{external_business_id}",
            self.base_path
            ,external_business_id=utf8_percent_encode(&param_external_business_id.to_string(), ID_ENCODE_SET)
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

        let body = param_integration_request_patch.map(|ref body| {
            serde_json::to_string(body).expect("impossible to fail to serialize")
        });
        if let Some(body) = body {
                *request.body_mut() = Body::from(body);
        }

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::IntegrationMetadata>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsCommerceSlashPatchResponse::Success
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsCommerceSlashPatchResponse::IntegrationNotFound
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsCommerceSlashPatchResponse::Can
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsCommerceSlashPatchResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn integrations_commerce_slash_post(
        &self,
        param_integration_request: Option<models::IntegrationRequest>,
        context: &C) -> Result<IntegrationsCommerceSlashPostResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/integrations/commerce",
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

        let body = param_integration_request.map(|ref body| {
            serde_json::to_string(body).expect("impossible to fail to serialize")
        });
        if let Some(body) = body {
                *request.body_mut() = Body::from(body);
        }

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::IntegrationMetadata>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsCommerceSlashPostResponse::Success
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsCommerceSlashPostResponse::IntegrationNotFound
                    (body)
                )
            }
            409 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsCommerceSlashPostResponse::Can
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsCommerceSlashPostResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn integrations_logs_slash_post(
        &self,
        param_integration_logs_request: models::IntegrationLogsRequest,
        context: &C) -> Result<IntegrationsLogsSlashPostResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/integrations/logs",
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

        let body = serde_json::to_string(&param_integration_logs_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::IntegrationLogsSuccessResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsLogsSlashPostResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::DetailedError>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsLogsSlashPostResponse::BadRequest
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsLogsSlashPostResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn integrations_slash_get_by_id(
        &self,
        param_id: String,
        context: &C) -> Result<IntegrationsSlashGetByIdResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/integrations/{id}",
            self.base_path
            ,id=utf8_percent_encode(&param_id.to_string(), ID_ENCODE_SET)
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::IntegrationRecord>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsSlashGetByIdResponse::Success
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsSlashGetByIdResponse::IntegrationNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsSlashGetByIdResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn integrations_slash_get_list(
        &self,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        context: &C) -> Result<IntegrationsSlashGetListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/integrations",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::IntegrationsGetList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsSlashGetListResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(IntegrationsSlashGetListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn country_keywords_metrics_slash_get(
        &self,
        param_ad_account_id: String,
        param_country_code: String,
        param_keywords: &Vec<String>,
        context: &C) -> Result<CountryKeywordsMetricsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/keywords/metrics",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("country_code",
                    &param_country_code);
                query_string.append_pair("keywords",
                    &param_keywords.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::KeywordsMetricsArrayResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CountryKeywordsMetricsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(CountryKeywordsMetricsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn keywords_slash_create(
        &self,
        param_ad_account_id: String,
        param_keywords_request: models::KeywordsRequest,
        context: &C) -> Result<KeywordsSlashCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/keywords",
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

        let body = serde_json::to_string(&param_keywords_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::KeywordsResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(KeywordsSlashCreateResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(KeywordsSlashCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn keywords_slash_get(
        &self,
        param_ad_account_id: String,
        param_campaign_id: Option<String>,
        param_ad_group_id: Option<String>,
        param_match_types: Option<&Vec<models::MatchType>>,
        param_page_size: Option<i32>,
        param_bookmark: Option<String>,
        context: &C) -> Result<KeywordsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/keywords",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_campaign_id) = param_campaign_id {
                query_string.append_pair("campaign_id",
                    &param_campaign_id);
            }
            if let Some(param_ad_group_id) = param_ad_group_id {
                query_string.append_pair("ad_group_id",
                    &param_ad_group_id);
            }
            if let Some(param_match_types) = param_match_types {
                query_string.append_pair("match_types",
                    &param_match_types.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::KeywordsGet200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(KeywordsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(KeywordsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn keywords_slash_update(
        &self,
        param_ad_account_id: String,
        param_keyword_update_body: models::KeywordUpdateBody,
        context: &C) -> Result<KeywordsSlashUpdateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/keywords",
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
            .method("PATCH")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_keyword_update_body).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::KeywordsResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(KeywordsSlashUpdateResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(KeywordsSlashUpdateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn trending_keywords_slash_list(
        &self,
        param_region: models::TrendsSupportedRegion,
        param_trend_type: models::TrendType,
        param_interests: Option<&Vec<String>>,
        param_genders: Option<&Vec<String>>,
        param_ages: Option<&Vec<String>>,
        param_normalize_against_group: Option<bool>,
        param_limit: Option<i32>,
        context: &C) -> Result<TrendingKeywordsSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/trends/keywords/{region}/top/{trend_type}",
            self.base_path
            ,region=utf8_percent_encode(&param_region.to_string(), ID_ENCODE_SET)
            ,trend_type=utf8_percent_encode(&param_trend_type.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_interests) = param_interests {
                query_string.append_pair("interests",
                    &param_interests.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_genders) = param_genders {
                query_string.append_pair("genders",
                    &param_genders.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_ages) = param_ages {
                query_string.append_pair("ages",
                    &param_ages.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_normalize_against_group) = param_normalize_against_group {
                query_string.append_pair("normalize_against_group",
                    &param_normalize_against_group.to_string());
            }
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::TrendingKeywordsResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(TrendingKeywordsSlashListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(TrendingKeywordsSlashListResponse::InvalidTrendingKeywordsRequestParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(TrendingKeywordsSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ad_accounts_subscriptions_slash_del_by_id(
        &self,
        param_ad_account_id: String,
        param_subscription_id: String,
        context: &C) -> Result<AdAccountsSubscriptionsSlashDelByIdResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
            ,subscription_id=utf8_percent_encode(&param_subscription_id.to_string(), ID_ENCODE_SET)
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            204 => {
                Ok(
                    AdAccountsSubscriptionsSlashDelByIdResponse::SubscriptionDeletedSuccessfully
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSubscriptionsSlashDelByIdResponse::InvalidInputParameters
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSubscriptionsSlashDelByIdResponse::YouAreNotAuthorizedToDeleteThisSubscription
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSubscriptionsSlashDelByIdResponse::SubscriptionNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSubscriptionsSlashDelByIdResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ad_accounts_subscriptions_slash_get_by_id(
        &self,
        param_ad_account_id: String,
        param_subscription_id: String,
        context: &C) -> Result<AdAccountsSubscriptionsSlashGetByIdResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
            ,subscription_id=utf8_percent_encode(&param_subscription_id.to_string(), ID_ENCODE_SET)
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdAccountGetSubscriptionResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSubscriptionsSlashGetByIdResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSubscriptionsSlashGetByIdResponse::InvalidInputParameters
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSubscriptionsSlashGetByIdResponse::Can
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSubscriptionsSlashGetByIdResponse::SubscriptionNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSubscriptionsSlashGetByIdResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ad_accounts_subscriptions_slash_get_list(
        &self,
        param_ad_account_id: String,
        param_page_size: Option<i32>,
        param_bookmark: Option<String>,
        context: &C) -> Result<AdAccountsSubscriptionsSlashGetListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/leads/subscriptions",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdAccountsSubscriptionsGetList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSubscriptionsSlashGetListResponse::Success
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSubscriptionsSlashGetListResponse::Can
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSubscriptionsSlashGetListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ad_accounts_subscriptions_slash_post(
        &self,
        param_ad_account_id: String,
        param_ad_account_create_subscription_request: models::AdAccountCreateSubscriptionRequest,
        context: &C) -> Result<AdAccountsSubscriptionsSlashPostResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/leads/subscriptions",
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

        let body = serde_json::to_string(&param_ad_account_create_subscription_request).expect("impossible to fail to serialize");

                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdAccountCreateSubscriptionResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSubscriptionsSlashPostResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSubscriptionsSlashPostResponse::InvalidInputParameters
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSubscriptionsSlashPostResponse::Can
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsSubscriptionsSlashPostResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn lead_form_slash_get(
        &self,
        param_ad_account_id: String,
        param_lead_form_id: String,
        context: &C) -> Result<LeadFormSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
            ,lead_form_id=utf8_percent_encode(&param_lead_form_id.to_string(), ID_ENCODE_SET)
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::LeadFormResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(LeadFormSlashGetResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(LeadFormSlashGetResponse::InvalidAdAccountLeadFormsParameters
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(LeadFormSlashGetResponse::TheLeadFormIDForTheGivenAdAccountIDDoesNotExist
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(LeadFormSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn lead_form_test_slash_create(
        &self,
        param_ad_account_id: String,
        param_lead_form_id: String,
        param_lead_form_test_request: models::LeadFormTestRequest,
        context: &C) -> Result<LeadFormTestSlashCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
            ,lead_form_id=utf8_percent_encode(&param_lead_form_id.to_string(), ID_ENCODE_SET)
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

        let body = serde_json::to_string(&param_lead_form_test_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::LeadFormTestResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(LeadFormTestSlashCreateResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(LeadFormTestSlashCreateResponse::InvalidParameters
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(LeadFormTestSlashCreateResponse::LeadNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(LeadFormTestSlashCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn lead_forms_slash_list(
        &self,
        param_ad_account_id: String,
        param_page_size: Option<i32>,
        param_order: Option<String>,
        param_bookmark: Option<String>,
        context: &C) -> Result<LeadFormsSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/lead_forms",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_order) = param_order {
                query_string.append_pair("order",
                    &param_order);
            }
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::LeadFormsList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(LeadFormsSlashListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(LeadFormsSlashListResponse::InvalidAdAccountLeadFormsParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(LeadFormsSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn media_slash_create(
        &self,
        param_media_upload_request: models::MediaUploadRequest,
        context: &C) -> Result<MediaSlashCreateResponse, ApiError>
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
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            201 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::MediaUpload>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(MediaSlashCreateResponse::Response
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(MediaSlashCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn media_slash_get(
        &self,
        param_media_id: String,
        context: &C) -> Result<MediaSlashGetResponse, ApiError>
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::MediaUploadDetails>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(MediaSlashGetResponse::Response
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(MediaSlashGetResponse::MediaUploadNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(MediaSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn media_slash_list(
        &self,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        context: &C) -> Result<MediaSlashListResponse, ApiError>
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
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::MediaList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(MediaSlashListResponse::Response
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(MediaSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn oauth_slash_token(
        &self,
        param_grant_type: String,
        context: &C) -> Result<OauthSlashTokenResponse, ApiError>
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
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Basic(basic_header) => {
                    let auth = swagger::auth::Header(basic_header.clone());
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::OauthAccessTokenResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(OauthSlashTokenResponse::Response
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(OauthSlashTokenResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn order_lines_slash_get(
        &self,
        param_ad_account_id: String,
        param_order_line_id: String,
        context: &C) -> Result<OrderLinesSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/order_lines/{order_line_id}",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
            ,order_line_id=utf8_percent_encode(&param_order_line_id.to_string(), ID_ENCODE_SET)
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::OrderLine>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(OrderLinesSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(OrderLinesSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn order_lines_slash_list(
        &self,
        param_ad_account_id: String,
        param_page_size: Option<i32>,
        param_order: Option<String>,
        param_bookmark: Option<String>,
        context: &C) -> Result<OrderLinesSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/order_lines",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_order) = param_order {
                query_string.append_pair("order",
                    &param_order);
            }
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::OrderLinesList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(OrderLinesSlashListResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(OrderLinesSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn pins_slash_analytics(
        &self,
        param_pin_id: String,
        param_start_date: chrono::naive::NaiveDate,
        param_end_date: chrono::naive::NaiveDate,
        param_metric_types: &Vec<models::PinsAnalyticsMetricTypesParameterInner>,
        param_app_types: Option<String>,
        param_split_field: Option<String>,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashAnalyticsResponse, ApiError>
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
                    &param_app_types);
            }
                query_string.append_pair("metric_types",
                    &param_metric_types.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            if let Some(param_split_field) = param_split_field {
                query_string.append_pair("split_field",
                    &param_split_field);
            }
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<std::collections::HashMap<String, models::PinAnalyticsMetricsResponse>>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashAnalyticsResponse::Response
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashAnalyticsResponse::InvalidPinsAnalyticsParameters
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashAnalyticsResponse::NotAuthorizedToAccessBoardOrPin
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashAnalyticsResponse::PinNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashAnalyticsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn pins_slash_create(
        &self,
        param_pin_create: models::PinCreate,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/pins",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_pin_create).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            201 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Pin>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashCreateResponse::SuccessfulPinCreation
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashCreateResponse::InvalidPinParametersResponse
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashCreateResponse::ThePin
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashCreateResponse::BoardOrSectionNotFound
                    (body)
                )
            }
            429 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashCreateResponse::ThisRequestExceededARateLimit
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn pins_slash_delete(
        &self,
        param_pin_id: String,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashDeleteResponse, ApiError>
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
                    &param_ad_account_id);
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
            .method("DELETE")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            204 => {
                Ok(
                    PinsSlashDeleteResponse::SuccessfullyDeletedPin
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashDeleteResponse::NotAuthorizedToAccessBoardOrPin
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashDeleteResponse::PinNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashDeleteResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn pins_slash_get(
        &self,
        param_pin_id: String,
        param_pin_metrics: Option<bool>,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashGetResponse, ApiError>
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
            if let Some(param_pin_metrics) = param_pin_metrics {
                query_string.append_pair("pin_metrics",
                    &param_pin_metrics.to_string());
            }
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Pin>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashGetResponse::Response
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashGetResponse::NotAuthorizedToAccessBoardOrPin
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashGetResponse::PinNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn pins_slash_list(
        &self,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        param_pin_filter: Option<String>,
        param_include_protected_pins: Option<bool>,
        param_pin_type: Option<String>,
        param_creative_types: Option<&Vec<String>>,
        param_ad_account_id: Option<String>,
        param_pin_metrics: Option<bool>,
        context: &C) -> Result<PinsSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/pins",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_pin_filter) = param_pin_filter {
                query_string.append_pair("pin_filter",
                    &param_pin_filter);
            }
            if let Some(param_include_protected_pins) = param_include_protected_pins {
                query_string.append_pair("include_protected_pins",
                    &param_include_protected_pins.to_string());
            }
            if let Some(param_pin_type) = param_pin_type {
                query_string.append_pair("pin_type",
                    &param_pin_type);
            }
            if let Some(param_creative_types) = param_creative_types {
                query_string.append_pair("creative_types",
                    &param_creative_types.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
            }
            if let Some(param_pin_metrics) = param_pin_metrics {
                query_string.append_pair("pin_metrics",
                    &param_pin_metrics.to_string());
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::PinsList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashListResponse::InvalidPinFilterValue
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn pins_slash_save(
        &self,
        param_pin_id: String,
        param_pins_save_request: models::PinsSaveRequest,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashSaveResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/pins/{pin_id}/save",
            self.base_path
            ,pin_id=utf8_percent_encode(&param_pin_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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
            .method("POST")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_pins_save_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            201 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Pin>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashSaveResponse::SuccessfullySavedPin
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashSaveResponse::NotAuthorizedToAccessBoardOrPin
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashSaveResponse::BoardOrPinNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashSaveResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn pins_slash_update(
        &self,
        param_pin_id: String,
        param_pin_update: models::PinUpdate,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashUpdateResponse, ApiError>
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
                    &param_ad_account_id);
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
            .method("PATCH")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_pin_update).expect("impossible to fail to serialize");

                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Pin>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashUpdateResponse::Response
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashUpdateResponse::NotAuthorizedToUpdatePin
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashUpdateResponse::PinNotFound
                    (body)
                )
            }
            429 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashUpdateResponse::ThisRequestExceededARateLimit
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(PinsSlashUpdateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn product_group_promotions_slash_create(
        &self,
        param_ad_account_id: String,
        param_product_group_promotion_create_request: models::ProductGroupPromotionCreateRequest,
        context: &C) -> Result<ProductGroupPromotionsSlashCreateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/product_group_promotions",
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

        // Body parameter
        let body = serde_json::to_string(&param_product_group_promotion_create_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::ProductGroupPromotionResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ProductGroupPromotionsSlashCreateResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ProductGroupPromotionsSlashCreateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn product_group_promotions_slash_get(
        &self,
        param_ad_account_id: String,
        param_product_group_promotion_id: String,
        context: &C) -> Result<ProductGroupPromotionsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
            ,product_group_promotion_id=utf8_percent_encode(&param_product_group_promotion_id.to_string(), ID_ENCODE_SET)
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::ProductGroupPromotionResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ProductGroupPromotionsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ProductGroupPromotionsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn product_group_promotions_slash_list(
        &self,
        param_ad_account_id: String,
        param_product_group_promotion_ids: Option<&Vec<String>>,
        param_entity_statuses: Option<&Vec<String>>,
        param_ad_group_id: Option<String>,
        param_page_size: Option<i32>,
        param_order: Option<String>,
        param_bookmark: Option<String>,
        context: &C) -> Result<ProductGroupPromotionsSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/product_group_promotions",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_product_group_promotion_ids) = param_product_group_promotion_ids {
                query_string.append_pair("product_group_promotion_ids",
                    &param_product_group_promotion_ids.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_entity_statuses) = param_entity_statuses {
                query_string.append_pair("entity_statuses",
                    &param_entity_statuses.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_ad_group_id) = param_ad_group_id {
                query_string.append_pair("ad_group_id",
                    &param_ad_group_id);
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_order) = param_order {
                query_string.append_pair("order",
                    &param_order);
            }
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::ProductGroupPromotionsList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ProductGroupPromotionsSlashListResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ProductGroupPromotionsSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn product_group_promotions_slash_update(
        &self,
        param_ad_account_id: String,
        param_product_group_promotion_update_request: models::ProductGroupPromotionUpdateRequest,
        context: &C) -> Result<ProductGroupPromotionsSlashUpdateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/product_group_promotions",
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
            .method("PATCH")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let body = serde_json::to_string(&param_product_group_promotion_update_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::ProductGroupPromotionResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ProductGroupPromotionsSlashUpdateResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ProductGroupPromotionsSlashUpdateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn product_groups_slash_analytics(
        &self,
        param_ad_account_id: String,
        param_start_date: chrono::naive::NaiveDate,
        param_end_date: chrono::naive::NaiveDate,
        param_product_group_ids: &Vec<String>,
        param_columns: &Vec<String>,
        param_granularity: models::Granularity,
        param_click_window_days: Option<i32>,
        param_engagement_window_days: Option<i32>,
        param_view_window_days: Option<i32>,
        param_conversion_report_time: Option<String>,
        context: &C) -> Result<ProductGroupsSlashAnalyticsResponse, ApiError>
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
                    &param_conversion_report_time);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Vec<models::ProductGroupAnalyticsResponseInner>>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ProductGroupsSlashAnalyticsResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ProductGroupsSlashAnalyticsResponse::InvalidAdAccountAdsAnalyticsParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(ProductGroupsSlashAnalyticsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ad_accounts_catalogs_product_groups_slash_list(
        &self,
        param_ad_account_id: String,
        param_feed_profile_id: Option<String>,
        context: &C) -> Result<AdAccountsCatalogsProductGroupsSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/product_groups/catalogs",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_feed_profile_id) = param_feed_profile_id {
                query_string.append_pair("feed_profile_id",
                    &param_feed_profile_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdAccountsCatalogsProductGroupsList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsCatalogsProductGroupsSlashListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsCatalogsProductGroupsSlashListResponse::InvalidAdAccountAdsParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsCatalogsProductGroupsSlashListResponse::AccessDenied
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsCatalogsProductGroupsSlashListResponse::MerchantDataNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountsCatalogsProductGroupsSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn ad_account_countries_slash_get(
        &self,
        context: &C) -> Result<AdAccountCountriesSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/resources/ad_account_countries",
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
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::AdAccountsCountryResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountCountriesSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(AdAccountCountriesSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn delivery_metrics_slash_get(
        &self,
        param_report_type: Option<String>,
        context: &C) -> Result<DeliveryMetricsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/resources/delivery_metrics",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_report_type) = param_report_type {
                query_string.append_pair("report_type",
                    &param_report_type);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::DeliveryMetricsResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(DeliveryMetricsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(DeliveryMetricsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn interest_targeting_options_slash_get(
        &self,
        param_interest_id: String,
        context: &C) -> Result<InterestTargetingOptionsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/resources/targeting/interests/{interest_id}",
            self.base_path
            ,interest_id=utf8_percent_encode(&param_interest_id.to_string(), ID_ENCODE_SET)
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::SingleInterestTargetingOptionResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(InterestTargetingOptionsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(InterestTargetingOptionsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn lead_form_questions_slash_get(
        &self,
        context: &C) -> Result<LeadFormQuestionsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/resources/lead_form_questions",
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
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                Ok(
                    LeadFormQuestionsSlashGetResponse::Success
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(LeadFormQuestionsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn metrics_ready_state_slash_get(
        &self,
        param_date: String,
        context: &C) -> Result<MetricsReadyStateSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/resources/metrics_ready_state",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("date",
                    &param_date);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::BookClosedResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(MetricsReadyStateSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(MetricsReadyStateSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn targeting_options_slash_get(
        &self,
        param_targeting_type: String,
        param_client_id: Option<String>,
        param_oauth_signature: Option<String>,
        param_timestamp: Option<String>,
        context: &C) -> Result<TargetingOptionsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/resources/targeting/{targeting_type}",
            self.base_path
            ,targeting_type=utf8_percent_encode(&param_targeting_type.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_client_id) = param_client_id {
                query_string.append_pair("client_id",
                    &param_client_id);
            }
            if let Some(param_oauth_signature) = param_oauth_signature {
                query_string.append_pair("oauth_signature",
                    &param_oauth_signature);
            }
            if let Some(param_timestamp) = param_timestamp {
                query_string.append_pair("timestamp",
                    &param_timestamp);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Vec<serde_json::Value>>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(TargetingOptionsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(TargetingOptionsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn search_partner_pins(
        &self,
        param_term: String,
        param_country_code: String,
        param_bookmark: Option<String>,
        param_locale: Option<String>,
        param_limit: Option<i32>,
        context: &C) -> Result<SearchPartnerPinsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/search/partner/pins",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("term",
                    &param_term);
                query_string.append_pair("country_code",
                    &param_country_code);
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
            }
            if let Some(param_locale) = param_locale {
                query_string.append_pair("locale",
                    &param_locale);
            }
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::SearchPartnerPins200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SearchPartnerPinsResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SearchPartnerPinsResponse::InvalidPins
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SearchPartnerPinsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn search_user_boards_slash_get(
        &self,
        param_ad_account_id: Option<String>,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        param_query: Option<String>,
        context: &C) -> Result<SearchUserBoardsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/search/boards",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
            }
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_query) = param_query {
                query_string.append_pair("query",
                    &param_query);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::SearchUserBoardsGet200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SearchUserBoardsSlashGetResponse::Response
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SearchUserBoardsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn search_user_pins_slash_list(
        &self,
        param_query: String,
        param_ad_account_id: Option<String>,
        param_bookmark: Option<String>,
        context: &C) -> Result<SearchUserPinsSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/search/pins",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
            }
                query_string.append_pair("query",
                    &param_query);
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::PinsList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SearchUserPinsSlashListResponse::Success
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SearchUserPinsSlashListResponse::UserNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(SearchUserPinsSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn terms_related_slash_list(
        &self,
        param_terms: &Vec<String>,
        context: &C) -> Result<TermsRelatedSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/terms/related",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("terms",
                    &param_terms.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::RelatedTerms>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(TermsRelatedSlashListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(TermsRelatedSlashListResponse::InvalidTermsRelatedParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(TermsRelatedSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn terms_suggested_slash_list(
        &self,
        param_term: String,
        param_limit: Option<i32>,
        context: &C) -> Result<TermsSuggestedSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/terms/suggested",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("term",
                    &param_term);
            if let Some(param_limit) = param_limit {
                query_string.append_pair("limit",
                    &param_limit.to_string());
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Vec<String>>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(TermsSuggestedSlashListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(TermsSuggestedSlashListResponse::InvalidTermsSuggestedParameters
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(TermsSuggestedSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn terms_of_service_slash_get(
        &self,
        param_ad_account_id: String,
        param_include_html: Option<bool>,
        param_tos_type: Option<String>,
        context: &C) -> Result<TermsOfServiceSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/ad_accounts/{ad_account_id}/terms_of_service",
            self.base_path
            ,ad_account_id=utf8_percent_encode(&param_ad_account_id.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_include_html) = param_include_html {
                query_string.append_pair("include_html",
                    &param_include_html.to_string());
            }
            if let Some(param_tos_type) = param_tos_type {
                query_string.append_pair("tos_type",
                    &param_tos_type);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::TermsOfService>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(TermsOfServiceSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(TermsOfServiceSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn boards_user_follows_slash_list(
        &self,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        param_explicit_following: Option<bool>,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<BoardsUserFollowsSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/user_account/following/boards",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_explicit_following) = param_explicit_following {
                query_string.append_pair("explicit_following",
                    &param_explicit_following.to_string());
            }
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::BoardsUserFollowsList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsUserFollowsSlashListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsUserFollowsSlashListResponse::InvalidUserId
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(BoardsUserFollowsSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn follow_user_slash_update(
        &self,
        param_username: String,
        param_follow_user_request: models::FollowUserRequest,
        context: &C) -> Result<FollowUserSlashUpdateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/user_account/following/{username}",
            self.base_path
            ,username=utf8_percent_encode(&param_username.to_string(), ID_ENCODE_SET)
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

        let body = serde_json::to_string(&param_follow_user_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::UserSummary>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FollowUserSlashUpdateResponse::Success
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FollowUserSlashUpdateResponse::UserNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FollowUserSlashUpdateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn followers_slash_list(
        &self,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        context: &C) -> Result<FollowersSlashListResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/user_account/followers",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::FollowersList200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FollowersSlashListResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FollowersSlashListResponse::InvalidUserId
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(FollowersSlashListResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn linked_business_accounts_slash_get(
        &self,
        context: &C) -> Result<LinkedBusinessAccountsSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/user_account/businesses",
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
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<Vec<models::LinkedBusiness>>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(LinkedBusinessAccountsSlashGetResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(LinkedBusinessAccountsSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn unverify_website_slash_delete(
        &self,
        param_website: String,
        context: &C) -> Result<UnverifyWebsiteSlashDeleteResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/user_account/websites",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("website",
                    &param_website);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            204 => {
                Ok(
                    UnverifyWebsiteSlashDeleteResponse::SuccessfullyUnverifiedWebsite
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UnverifyWebsiteSlashDeleteResponse::WebsiteNotInUserList
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UnverifyWebsiteSlashDeleteResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn user_account_slash_analytics(
        &self,
        param_start_date: chrono::naive::NaiveDate,
        param_end_date: chrono::naive::NaiveDate,
        param_from_claimed_content: Option<String>,
        param_pin_format: Option<String>,
        param_app_types: Option<String>,
        param_content_type: Option<String>,
        param_source: Option<String>,
        param_metric_types: Option<&Vec<String>>,
        param_split_field: Option<String>,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountSlashAnalyticsResponse, ApiError>
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
                    &param_from_claimed_content);
            }
            if let Some(param_pin_format) = param_pin_format {
                query_string.append_pair("pin_format",
                    &param_pin_format);
            }
            if let Some(param_app_types) = param_app_types {
                query_string.append_pair("app_types",
                    &param_app_types);
            }
            if let Some(param_content_type) = param_content_type {
                query_string.append_pair("content_type",
                    &param_content_type);
            }
            if let Some(param_source) = param_source {
                query_string.append_pair("source",
                    &param_source);
            }
            if let Some(param_metric_types) = param_metric_types {
                query_string.append_pair("metric_types",
                    &param_metric_types.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_split_field) = param_split_field {
                query_string.append_pair("split_field",
                    &param_split_field);
            }
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<std::collections::HashMap<String, models::AnalyticsMetricsResponse>>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserAccountSlashAnalyticsResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserAccountSlashAnalyticsResponse::InvalidUserAccountsAnalyticsParameters
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserAccountSlashAnalyticsResponse::NotAuthorizedToAccessTheUserAccountAnalytics
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserAccountSlashAnalyticsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn user_account_slash_analytics_slash_top_pins(
        &self,
        param_start_date: chrono::naive::NaiveDate,
        param_end_date: chrono::naive::NaiveDate,
        param_sort_by: String,
        param_from_claimed_content: Option<String>,
        param_pin_format: Option<String>,
        param_app_types: Option<String>,
        param_content_type: Option<String>,
        param_source: Option<String>,
        param_metric_types: Option<&Vec<String>>,
        param_num_of_pins: Option<i32>,
        param_created_in_last_n_days: Option<i32>,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountSlashAnalyticsSlashTopPinsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/user_account/analytics/top_pins",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("start_date",
                    &param_start_date.to_string());
                query_string.append_pair("end_date",
                    &param_end_date.to_string());
                query_string.append_pair("sort_by",
                    &param_sort_by);
            if let Some(param_from_claimed_content) = param_from_claimed_content {
                query_string.append_pair("from_claimed_content",
                    &param_from_claimed_content);
            }
            if let Some(param_pin_format) = param_pin_format {
                query_string.append_pair("pin_format",
                    &param_pin_format);
            }
            if let Some(param_app_types) = param_app_types {
                query_string.append_pair("app_types",
                    &param_app_types);
            }
            if let Some(param_content_type) = param_content_type {
                query_string.append_pair("content_type",
                    &param_content_type);
            }
            if let Some(param_source) = param_source {
                query_string.append_pair("source",
                    &param_source);
            }
            if let Some(param_metric_types) = param_metric_types {
                query_string.append_pair("metric_types",
                    &param_metric_types.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_num_of_pins) = param_num_of_pins {
                query_string.append_pair("num_of_pins",
                    &param_num_of_pins.to_string());
            }
            if let Some(param_created_in_last_n_days) = param_created_in_last_n_days {
                query_string.append_pair("created_in_last_n_days",
                    &param_created_in_last_n_days.to_string());
            }
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::TopPinsAnalyticsResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserAccountSlashAnalyticsSlashTopPinsResponse::Success
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserAccountSlashAnalyticsSlashTopPinsResponse::NotAuthorizedToAccessTheUserAccountAnalytics
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserAccountSlashAnalyticsSlashTopPinsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn user_account_slash_analytics_slash_top_video_pins(
        &self,
        param_start_date: chrono::naive::NaiveDate,
        param_end_date: chrono::naive::NaiveDate,
        param_sort_by: String,
        param_from_claimed_content: Option<String>,
        param_pin_format: Option<String>,
        param_app_types: Option<String>,
        param_content_type: Option<String>,
        param_source: Option<String>,
        param_metric_types: Option<&Vec<String>>,
        param_num_of_pins: Option<i32>,
        param_created_in_last_n_days: Option<i32>,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountSlashAnalyticsSlashTopVideoPinsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/user_account/analytics/top_video_pins",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
                query_string.append_pair("start_date",
                    &param_start_date.to_string());
                query_string.append_pair("end_date",
                    &param_end_date.to_string());
                query_string.append_pair("sort_by",
                    &param_sort_by);
            if let Some(param_from_claimed_content) = param_from_claimed_content {
                query_string.append_pair("from_claimed_content",
                    &param_from_claimed_content);
            }
            if let Some(param_pin_format) = param_pin_format {
                query_string.append_pair("pin_format",
                    &param_pin_format);
            }
            if let Some(param_app_types) = param_app_types {
                query_string.append_pair("app_types",
                    &param_app_types);
            }
            if let Some(param_content_type) = param_content_type {
                query_string.append_pair("content_type",
                    &param_content_type);
            }
            if let Some(param_source) = param_source {
                query_string.append_pair("source",
                    &param_source);
            }
            if let Some(param_metric_types) = param_metric_types {
                query_string.append_pair("metric_types",
                    &param_metric_types.iter().map(ToString::to_string).collect::<Vec<String>>().join(","));
            }
            if let Some(param_num_of_pins) = param_num_of_pins {
                query_string.append_pair("num_of_pins",
                    &param_num_of_pins.to_string());
            }
            if let Some(param_created_in_last_n_days) = param_created_in_last_n_days {
                query_string.append_pair("created_in_last_n_days",
                    &param_created_in_last_n_days.to_string());
            }
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::TopVideoPinsAnalyticsResponse>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserAccountSlashAnalyticsSlashTopVideoPinsResponse::Success
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserAccountSlashAnalyticsSlashTopVideoPinsResponse::NotAuthorizedToAccessTheUserAccountAnalytics
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserAccountSlashAnalyticsSlashTopVideoPinsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn user_account_slash_followed_interests(
        &self,
        param_username: String,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        context: &C) -> Result<UserAccountSlashFollowedInterestsResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/users/{username}/interests/follow",
            self.base_path
            ,username=utf8_percent_encode(&param_username.to_string(), ID_ENCODE_SET)
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::UserAccountFollowedInterests200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserAccountSlashFollowedInterestsResponse::Success
                    (body)
                )
            }
            400 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserAccountSlashFollowedInterestsResponse::InvalidParameters
                    (body)
                )
            }
            401 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserAccountSlashFollowedInterestsResponse::AuthorizationFailed
                    (body)
                )
            }
            404 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserAccountSlashFollowedInterestsResponse::UserNotFound
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserAccountSlashFollowedInterestsResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn user_account_slash_get(
        &self,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountSlashGetResponse, ApiError>
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
                    &param_ad_account_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Account>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserAccountSlashGetResponse::Response
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserAccountSlashGetResponse::NotAuthorizedToAccessTheUserAccount
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserAccountSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn user_following_slash_get(
        &self,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        param_feed_type: Option<models::UserFollowingFeedType>,
        param_explicit_following: Option<bool>,
        param_ad_account_id: Option<String>,
        context: &C) -> Result<UserFollowingSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/user_account/following",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
            }
            if let Some(param_page_size) = param_page_size {
                query_string.append_pair("page_size",
                    &param_page_size.to_string());
            }
            if let Some(param_feed_type) = param_feed_type {
                query_string.append_pair("feed_type",
                    &param_feed_type);
            }
            if let Some(param_explicit_following) = param_explicit_following {
                query_string.append_pair("explicit_following",
                    &param_explicit_following.to_string());
            }
            if let Some(param_ad_account_id) = param_ad_account_id {
                query_string.append_pair("ad_account_id",
                    &param_ad_account_id);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::UserFollowingGet200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserFollowingSlashGetResponse::Response
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserFollowingSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn user_websites_slash_get(
        &self,
        param_bookmark: Option<String>,
        param_page_size: Option<i32>,
        context: &C) -> Result<UserWebsitesSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/user_account/websites",
            self.base_path
        );

        // Query parameters
        let query_string = {
            let mut query_string = form_urlencoded::Serializer::new("".to_owned());
            if let Some(param_bookmark) = param_bookmark {
                query_string.append_pair("bookmark",
                    &param_bookmark);
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

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::UserWebsitesGet200Response>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserWebsitesSlashGetResponse::Success
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserWebsitesSlashGetResponse::NotAuthorizedToAccessTheUserWebsiteList
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(UserWebsitesSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn verify_website_slash_update(
        &self,
        param_user_website_verify_request: models::UserWebsiteVerifyRequest,
        context: &C) -> Result<VerifyWebsiteSlashUpdateResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/user_account/websites",
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

        let body = serde_json::to_string(&param_user_website_verify_request).expect("impossible to fail to serialize");
                *request.body_mut() = Body::from(body);

        let header = "application/json";
        request.headers_mut().insert(CONTENT_TYPE, match HeaderValue::from_str(header) {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create header: {} - {}", header, e)))
        });
        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::UserWebsiteSummary>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(VerifyWebsiteSlashUpdateResponse::Success
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(VerifyWebsiteSlashUpdateResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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

    async fn website_verification_slash_get(
        &self,
        context: &C) -> Result<WebsiteVerificationSlashGetResponse, ApiError>
    {
        let mut client_service = self.client_service.clone();
        let mut uri = format!(
            "{}/v5/user_account/websites/verification",
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
            .method("GET")
            .uri(uri)
            .body(Body::empty()) {
                Ok(req) => req,
                Err(e) => return Err(ApiError(format!("Unable to create request: {}", e)))
        };

        let header = HeaderValue::from_str(Has::<XSpanIdString>::get(context).0.as_str());
        request.headers_mut().insert(HeaderName::from_static("x-span-id"), match header {
            Ok(h) => h,
            Err(e) => return Err(ApiError(format!("Unable to create X-Span ID header value: {}", e)))
        });

        #[allow(clippy::collapsible_match)]
        if let Some(auth_data) = Has::<Option<AuthData>>::get(context).as_ref() {
            // Currently only authentication with Basic and Bearer are supported
            #[allow(clippy::single_match, clippy::match_single_binding)]
            match auth_data {
                AuthData::Bearer(bearer_header) => {
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

        let response = client_service.call((request, context.clone()))
            .map_err(|e| ApiError(format!("No response received: {}", e))).await?;

        match response.status().as_u16() {
            200 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::UserWebsiteVerificationCode>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(WebsiteVerificationSlashGetResponse::Success
                    (body)
                )
            }
            403 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(WebsiteVerificationSlashGetResponse::NotAuthorizedToAccessTheUserVerificationCodeForWebsiteClaiming
                    (body)
                )
            }
            0 => {
                let body = response.into_body();
                let body = body
                        .into_raw()
                        .map_err(|e| ApiError(format!("Failed to read response: {}", e))).await?;
                let body = str::from_utf8(&body)
                    .map_err(|e| ApiError(format!("Response was not valid UTF8: {}", e)))?;
                let body = serde_json::from_str::<models::Error>(body).map_err(|e| {
                    ApiError(format!("Response body did not match the schema: {}", e))
                })?;
                Ok(WebsiteVerificationSlashGetResponse::UnexpectedError
                    (body)
                )
            }
            code => {
                let headers = response.headers().clone();
                let body = response.into_body()
                       .take(100)
                       .into_raw().await;
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
