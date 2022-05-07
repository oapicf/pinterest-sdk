use futures::{future, future::BoxFuture, Stream, stream, future::FutureExt, stream::TryStreamExt};
use hyper::{Request, Response, StatusCode, Body, HeaderMap};
use hyper::header::{HeaderName, HeaderValue, CONTENT_TYPE};
use log::warn;
#[allow(unused_imports)]
use std::convert::{TryFrom, TryInto};
use std::error::Error;
use std::future::Future;
use std::marker::PhantomData;
use std::task::{Context, Poll};
use swagger::{ApiError, BodyExt, Has, RequestParser, XSpanIdString};
pub use swagger::auth::Authorization;
use swagger::auth::Scopes;
use url::form_urlencoded;

#[allow(unused_imports)]
use crate::models;
use crate::header;

pub use crate::context;

type ServiceFuture = BoxFuture<'static, Result<Response<Body>, crate::ServiceError>>;

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

mod paths {
    use lazy_static::lazy_static;

    lazy_static! {
        pub static ref GLOBAL_REGEX_SET: regex::RegexSet = regex::RegexSet::new(vec![
            r"^/v5/ad_accounts$",
            r"^/v5/ad_accounts/(?P<ad_account_id>[^/?#]*)/ad_groups$",
            r"^/v5/ad_accounts/(?P<ad_account_id>[^/?#]*)/ad_groups/analytics$",
            r"^/v5/ad_accounts/(?P<ad_account_id>[^/?#]*)/ads$",
            r"^/v5/ad_accounts/(?P<ad_account_id>[^/?#]*)/ads/analytics$",
            r"^/v5/ad_accounts/(?P<ad_account_id>[^/?#]*)/analytics$",
            r"^/v5/ad_accounts/(?P<ad_account_id>[^/?#]*)/campaigns$",
            r"^/v5/ad_accounts/(?P<ad_account_id>[^/?#]*)/campaigns/analytics$",
            r"^/v5/ad_accounts/(?P<ad_account_id>[^/?#]*)/product_groups/analytics$",
            r"^/v5/ad_accounts/(?P<ad_account_id>[^/?#]*)/reports$",
            r"^/v5/boards$",
            r"^/v5/boards/(?P<board_id>[^/?#]*)$",
            r"^/v5/boards/(?P<board_id>[^/?#]*)/pins$",
            r"^/v5/boards/(?P<board_id>[^/?#]*)/sections$",
            r"^/v5/boards/(?P<board_id>[^/?#]*)/sections/(?P<section_id>[^/?#]*)$",
            r"^/v5/boards/(?P<board_id>[^/?#]*)/sections/(?P<section_id>[^/?#]*)/pins$",
            r"^/v5/catalogs/feeds$",
            r"^/v5/catalogs/feeds/(?P<feed_id>[^/?#]*)$",
            r"^/v5/catalogs/feeds/(?P<feed_id>[^/?#]*)/processing_results$",
            r"^/v5/catalogs/items$",
            r"^/v5/catalogs/items/batch$",
            r"^/v5/catalogs/items/batch/(?P<batch_id>[^/?#]*)$",
            r"^/v5/catalogs/product_groups$",
            r"^/v5/catalogs/product_groups/(?P<product_group_id>[^/?#]*)$",
            r"^/v5/media$",
            r"^/v5/media/(?P<media_id>[^/?#]*)$",
            r"^/v5/oauth/token$",
            r"^/v5/pins$",
            r"^/v5/pins/(?P<pin_id>[^/?#]*)$",
            r"^/v5/pins/(?P<pin_id>[^/?#]*)/analytics$",
            r"^/v5/user_account$",
            r"^/v5/user_account/analytics$"
        ])
        .expect("Unable to create global regex set");
    }
    pub(crate) static ID_AD_ACCOUNTS: usize = 0;
    pub(crate) static ID_AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS: usize = 1;
    lazy_static! {
        pub static ref REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS: regex::Regex =
            regex::Regex::new(r"^/v5/ad_accounts/(?P<ad_account_id>[^/?#]*)/ad_groups$")
                .expect("Unable to create regex for AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS");
    }
    pub(crate) static ID_AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS_ANALYTICS: usize = 2;
    lazy_static! {
        pub static ref REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS_ANALYTICS: regex::Regex =
            regex::Regex::new(r"^/v5/ad_accounts/(?P<ad_account_id>[^/?#]*)/ad_groups/analytics$")
                .expect("Unable to create regex for AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS_ANALYTICS");
    }
    pub(crate) static ID_AD_ACCOUNTS_AD_ACCOUNT_ID_ADS: usize = 3;
    lazy_static! {
        pub static ref REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_ADS: regex::Regex =
            regex::Regex::new(r"^/v5/ad_accounts/(?P<ad_account_id>[^/?#]*)/ads$")
                .expect("Unable to create regex for AD_ACCOUNTS_AD_ACCOUNT_ID_ADS");
    }
    pub(crate) static ID_AD_ACCOUNTS_AD_ACCOUNT_ID_ADS_ANALYTICS: usize = 4;
    lazy_static! {
        pub static ref REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_ADS_ANALYTICS: regex::Regex =
            regex::Regex::new(r"^/v5/ad_accounts/(?P<ad_account_id>[^/?#]*)/ads/analytics$")
                .expect("Unable to create regex for AD_ACCOUNTS_AD_ACCOUNT_ID_ADS_ANALYTICS");
    }
    pub(crate) static ID_AD_ACCOUNTS_AD_ACCOUNT_ID_ANALYTICS: usize = 5;
    lazy_static! {
        pub static ref REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_ANALYTICS: regex::Regex =
            regex::Regex::new(r"^/v5/ad_accounts/(?P<ad_account_id>[^/?#]*)/analytics$")
                .expect("Unable to create regex for AD_ACCOUNTS_AD_ACCOUNT_ID_ANALYTICS");
    }
    pub(crate) static ID_AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS: usize = 6;
    lazy_static! {
        pub static ref REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS: regex::Regex =
            regex::Regex::new(r"^/v5/ad_accounts/(?P<ad_account_id>[^/?#]*)/campaigns$")
                .expect("Unable to create regex for AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS");
    }
    pub(crate) static ID_AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS_ANALYTICS: usize = 7;
    lazy_static! {
        pub static ref REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS_ANALYTICS: regex::Regex =
            regex::Regex::new(r"^/v5/ad_accounts/(?P<ad_account_id>[^/?#]*)/campaigns/analytics$")
                .expect("Unable to create regex for AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS_ANALYTICS");
    }
    pub(crate) static ID_AD_ACCOUNTS_AD_ACCOUNT_ID_PRODUCT_GROUPS_ANALYTICS: usize = 8;
    lazy_static! {
        pub static ref REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_PRODUCT_GROUPS_ANALYTICS: regex::Regex =
            regex::Regex::new(r"^/v5/ad_accounts/(?P<ad_account_id>[^/?#]*)/product_groups/analytics$")
                .expect("Unable to create regex for AD_ACCOUNTS_AD_ACCOUNT_ID_PRODUCT_GROUPS_ANALYTICS");
    }
    pub(crate) static ID_AD_ACCOUNTS_AD_ACCOUNT_ID_REPORTS: usize = 9;
    lazy_static! {
        pub static ref REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_REPORTS: regex::Regex =
            regex::Regex::new(r"^/v5/ad_accounts/(?P<ad_account_id>[^/?#]*)/reports$")
                .expect("Unable to create regex for AD_ACCOUNTS_AD_ACCOUNT_ID_REPORTS");
    }
    pub(crate) static ID_BOARDS: usize = 10;
    pub(crate) static ID_BOARDS_BOARD_ID: usize = 11;
    lazy_static! {
        pub static ref REGEX_BOARDS_BOARD_ID: regex::Regex =
            regex::Regex::new(r"^/v5/boards/(?P<board_id>[^/?#]*)$")
                .expect("Unable to create regex for BOARDS_BOARD_ID");
    }
    pub(crate) static ID_BOARDS_BOARD_ID_PINS: usize = 12;
    lazy_static! {
        pub static ref REGEX_BOARDS_BOARD_ID_PINS: regex::Regex =
            regex::Regex::new(r"^/v5/boards/(?P<board_id>[^/?#]*)/pins$")
                .expect("Unable to create regex for BOARDS_BOARD_ID_PINS");
    }
    pub(crate) static ID_BOARDS_BOARD_ID_SECTIONS: usize = 13;
    lazy_static! {
        pub static ref REGEX_BOARDS_BOARD_ID_SECTIONS: regex::Regex =
            regex::Regex::new(r"^/v5/boards/(?P<board_id>[^/?#]*)/sections$")
                .expect("Unable to create regex for BOARDS_BOARD_ID_SECTIONS");
    }
    pub(crate) static ID_BOARDS_BOARD_ID_SECTIONS_SECTION_ID: usize = 14;
    lazy_static! {
        pub static ref REGEX_BOARDS_BOARD_ID_SECTIONS_SECTION_ID: regex::Regex =
            regex::Regex::new(r"^/v5/boards/(?P<board_id>[^/?#]*)/sections/(?P<section_id>[^/?#]*)$")
                .expect("Unable to create regex for BOARDS_BOARD_ID_SECTIONS_SECTION_ID");
    }
    pub(crate) static ID_BOARDS_BOARD_ID_SECTIONS_SECTION_ID_PINS: usize = 15;
    lazy_static! {
        pub static ref REGEX_BOARDS_BOARD_ID_SECTIONS_SECTION_ID_PINS: regex::Regex =
            regex::Regex::new(r"^/v5/boards/(?P<board_id>[^/?#]*)/sections/(?P<section_id>[^/?#]*)/pins$")
                .expect("Unable to create regex for BOARDS_BOARD_ID_SECTIONS_SECTION_ID_PINS");
    }
    pub(crate) static ID_CATALOGS_FEEDS: usize = 16;
    pub(crate) static ID_CATALOGS_FEEDS_FEED_ID: usize = 17;
    lazy_static! {
        pub static ref REGEX_CATALOGS_FEEDS_FEED_ID: regex::Regex =
            regex::Regex::new(r"^/v5/catalogs/feeds/(?P<feed_id>[^/?#]*)$")
                .expect("Unable to create regex for CATALOGS_FEEDS_FEED_ID");
    }
    pub(crate) static ID_CATALOGS_FEEDS_FEED_ID_PROCESSING_RESULTS: usize = 18;
    lazy_static! {
        pub static ref REGEX_CATALOGS_FEEDS_FEED_ID_PROCESSING_RESULTS: regex::Regex =
            regex::Regex::new(r"^/v5/catalogs/feeds/(?P<feed_id>[^/?#]*)/processing_results$")
                .expect("Unable to create regex for CATALOGS_FEEDS_FEED_ID_PROCESSING_RESULTS");
    }
    pub(crate) static ID_CATALOGS_ITEMS: usize = 19;
    pub(crate) static ID_CATALOGS_ITEMS_BATCH: usize = 20;
    pub(crate) static ID_CATALOGS_ITEMS_BATCH_BATCH_ID: usize = 21;
    lazy_static! {
        pub static ref REGEX_CATALOGS_ITEMS_BATCH_BATCH_ID: regex::Regex =
            regex::Regex::new(r"^/v5/catalogs/items/batch/(?P<batch_id>[^/?#]*)$")
                .expect("Unable to create regex for CATALOGS_ITEMS_BATCH_BATCH_ID");
    }
    pub(crate) static ID_CATALOGS_PRODUCT_GROUPS: usize = 22;
    pub(crate) static ID_CATALOGS_PRODUCT_GROUPS_PRODUCT_GROUP_ID: usize = 23;
    lazy_static! {
        pub static ref REGEX_CATALOGS_PRODUCT_GROUPS_PRODUCT_GROUP_ID: regex::Regex =
            regex::Regex::new(r"^/v5/catalogs/product_groups/(?P<product_group_id>[^/?#]*)$")
                .expect("Unable to create regex for CATALOGS_PRODUCT_GROUPS_PRODUCT_GROUP_ID");
    }
    pub(crate) static ID_MEDIA: usize = 24;
    pub(crate) static ID_MEDIA_MEDIA_ID: usize = 25;
    lazy_static! {
        pub static ref REGEX_MEDIA_MEDIA_ID: regex::Regex =
            regex::Regex::new(r"^/v5/media/(?P<media_id>[^/?#]*)$")
                .expect("Unable to create regex for MEDIA_MEDIA_ID");
    }
    pub(crate) static ID_OAUTH_TOKEN: usize = 26;
    pub(crate) static ID_PINS: usize = 27;
    pub(crate) static ID_PINS_PIN_ID: usize = 28;
    lazy_static! {
        pub static ref REGEX_PINS_PIN_ID: regex::Regex =
            regex::Regex::new(r"^/v5/pins/(?P<pin_id>[^/?#]*)$")
                .expect("Unable to create regex for PINS_PIN_ID");
    }
    pub(crate) static ID_PINS_PIN_ID_ANALYTICS: usize = 29;
    lazy_static! {
        pub static ref REGEX_PINS_PIN_ID_ANALYTICS: regex::Regex =
            regex::Regex::new(r"^/v5/pins/(?P<pin_id>[^/?#]*)/analytics$")
                .expect("Unable to create regex for PINS_PIN_ID_ANALYTICS");
    }
    pub(crate) static ID_USER_ACCOUNT: usize = 30;
    pub(crate) static ID_USER_ACCOUNT_ANALYTICS: usize = 31;
}

pub struct MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    api_impl: T,
    marker: PhantomData<C>,
}

impl<T, C> MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    pub fn new(api_impl: T) -> Self {
        MakeService {
            api_impl,
            marker: PhantomData
        }
    }
}

impl<T, C, Target> hyper::service::Service<Target> for MakeService<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    type Response = Service<T, C>;
    type Error = crate::ServiceError;
    type Future = future::Ready<Result<Self::Response, Self::Error>>;

    fn poll_ready(&mut self, cx: &mut Context<'_>) -> Poll<Result<(), Self::Error>> {
        Poll::Ready(Ok(()))
    }

    fn call(&mut self, target: Target) -> Self::Future {
        futures::future::ok(Service::new(
            self.api_impl.clone(),
        ))
    }
}

fn method_not_allowed() -> Result<Response<Body>, crate::ServiceError> {
    Ok(
        Response::builder().status(StatusCode::METHOD_NOT_ALLOWED)
            .body(Body::empty())
            .expect("Unable to create Method Not Allowed response")
    )
}

pub struct Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    api_impl: T,
    marker: PhantomData<C>,
}

impl<T, C> Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    pub fn new(api_impl: T) -> Self {
        Service {
            api_impl: api_impl,
            marker: PhantomData
        }
    }
}

impl<T, C> Clone for Service<T, C> where
    T: Api<C> + Clone + Send + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    fn clone(&self) -> Self {
        Service {
            api_impl: self.api_impl.clone(),
            marker: self.marker.clone(),
        }
    }
}

impl<T, C> hyper::service::Service<(Request<Body>, C)> for Service<T, C> where
    T: Api<C> + Clone + Send + Sync + 'static,
    C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
{
    type Response = Response<Body>;
    type Error = crate::ServiceError;
    type Future = ServiceFuture;

    fn poll_ready(&mut self, cx: &mut Context) -> Poll<Result<(), Self::Error>> {
        self.api_impl.poll_ready(cx)
    }

    fn call(&mut self, req: (Request<Body>, C)) -> Self::Future { async fn run<T, C>(mut api_impl: T, req: (Request<Body>, C)) -> Result<Response<Body>, crate::ServiceError> where
        T: Api<C> + Clone + Send + 'static,
        C: Has<XSpanIdString> + Has<Option<Authorization>> + Send + Sync + 'static
    {
        let (request, context) = req;
        let (parts, body) = request.into_parts();
        let (method, uri, headers) = (parts.method, parts.uri, parts.headers);
        let path = paths::GLOBAL_REGEX_SET.matches(uri.path());

        match &method {

            // AdAccountAnalytics - GET /ad_accounts/{ad_account_id}/analytics
            &hyper::Method::GET if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_ANALYTICS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "ads:read".to_string(), // See all of your advertising data, including ads, ad groups, campaigns etc.
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_ANALYTICS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE AD_ACCOUNTS_AD_ACCOUNT_ID_ANALYTICS in set but failed match against \"{}\"", path, paths::REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_ANALYTICS.as_str())
                    );

                let param_ad_account_id = match percent_encoding::percent_decode(path_params["ad_account_id"].as_bytes()).decode_utf8() {
                    Ok(param_ad_account_id) => match param_ad_account_id.parse::<String>() {
                        Ok(param_ad_account_id) => param_ad_account_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter ad_account_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["ad_account_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_start_date = query_params.iter().filter(|e| e.0 == "start_date").map(|e| e.1.to_owned())
                    .nth(0);
                let param_start_date = match param_start_date {
                    Some(param_start_date) => {
                        let param_start_date =
                            <chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str
                                (&param_start_date);
                        match param_start_date {
                            Ok(param_start_date) => Some(param_start_date),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter start_date - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter start_date")),
                        }
                    },
                    None => None,
                };
                let param_start_date = match param_start_date {
                    Some(param_start_date) => param_start_date,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter start_date"))
                        .expect("Unable to create Bad Request response for missing query parameter start_date")),
                };
                let param_end_date = query_params.iter().filter(|e| e.0 == "end_date").map(|e| e.1.to_owned())
                    .nth(0);
                let param_end_date = match param_end_date {
                    Some(param_end_date) => {
                        let param_end_date =
                            <chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str
                                (&param_end_date);
                        match param_end_date {
                            Ok(param_end_date) => Some(param_end_date),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter end_date - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter end_date")),
                        }
                    },
                    None => None,
                };
                let param_end_date = match param_end_date {
                    Some(param_end_date) => param_end_date,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter end_date"))
                        .expect("Unable to create Bad Request response for missing query parameter end_date")),
                };
                let param_columns = query_params.iter().filter(|e| e.0 == "columns").map(|e| e.1.to_owned())
                    .filter_map(|param_columns| param_columns.parse().ok())
                    .collect::<Vec<_>>();
                let param_granularity = query_params.iter().filter(|e| e.0 == "granularity").map(|e| e.1.to_owned())
                    .nth(0);
                let param_granularity = match param_granularity {
                    Some(param_granularity) => {
                        let param_granularity =
                            <models::Granularity as std::str::FromStr>::from_str
                                (&param_granularity);
                        match param_granularity {
                            Ok(param_granularity) => Some(param_granularity),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter granularity - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter granularity")),
                        }
                    },
                    None => None,
                };
                let param_granularity = match param_granularity {
                    Some(param_granularity) => param_granularity,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter granularity"))
                        .expect("Unable to create Bad Request response for missing query parameter granularity")),
                };
                let param_click_window_days = query_params.iter().filter(|e| e.0 == "click_window_days").map(|e| e.1.to_owned())
                    .nth(0);
                let param_click_window_days = match param_click_window_days {
                    Some(param_click_window_days) => {
                        let param_click_window_days =
                            <i32 as std::str::FromStr>::from_str
                                (&param_click_window_days);
                        match param_click_window_days {
                            Ok(param_click_window_days) => Some(param_click_window_days),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter click_window_days - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter click_window_days")),
                        }
                    },
                    None => None,
                };
                let param_engagement_window_days = query_params.iter().filter(|e| e.0 == "engagement_window_days").map(|e| e.1.to_owned())
                    .nth(0);
                let param_engagement_window_days = match param_engagement_window_days {
                    Some(param_engagement_window_days) => {
                        let param_engagement_window_days =
                            <i32 as std::str::FromStr>::from_str
                                (&param_engagement_window_days);
                        match param_engagement_window_days {
                            Ok(param_engagement_window_days) => Some(param_engagement_window_days),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter engagement_window_days - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter engagement_window_days")),
                        }
                    },
                    None => None,
                };
                let param_view_window_days = query_params.iter().filter(|e| e.0 == "view_window_days").map(|e| e.1.to_owned())
                    .nth(0);
                let param_view_window_days = match param_view_window_days {
                    Some(param_view_window_days) => {
                        let param_view_window_days =
                            <i32 as std::str::FromStr>::from_str
                                (&param_view_window_days);
                        match param_view_window_days {
                            Ok(param_view_window_days) => Some(param_view_window_days),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter view_window_days - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter view_window_days")),
                        }
                    },
                    None => None,
                };
                let param_conversion_report_time = query_params.iter().filter(|e| e.0 == "conversion_report_time").map(|e| e.1.to_owned())
                    .nth(0);
                let param_conversion_report_time = match param_conversion_report_time {
                    Some(param_conversion_report_time) => {
                        let param_conversion_report_time =
                            <String as std::str::FromStr>::from_str
                                (&param_conversion_report_time);
                        match param_conversion_report_time {
                            Ok(param_conversion_report_time) => Some(param_conversion_report_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter conversion_report_time - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter conversion_report_time")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.ad_account_analytics(
                                            param_ad_account_id,
                                            param_start_date,
                                            param_end_date,
                                            param_columns.as_ref(),
                                            param_granularity,
                                            param_click_window_days,
                                            param_engagement_window_days,
                                            param_view_window_days,
                                            param_conversion_report_time,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                AdAccountAnalyticsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for AD_ACCOUNT_ANALYTICS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                AdAccountAnalyticsResponse::InvalidAdAccountAnalyticsParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for AD_ACCOUNT_ANALYTICS_INVALID_AD_ACCOUNT_ANALYTICS_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                AdAccountAnalyticsResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for AD_ACCOUNT_ANALYTICS_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // AdAccountsList - GET /ad_accounts
            &hyper::Method::GET if path.matched(paths::ID_AD_ACCOUNTS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "ads:read".to_string(), // See all of your advertising data, including ads, ad groups, campaigns etc.
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_bookmark = query_params.iter().filter(|e| e.0 == "bookmark").map(|e| e.1.to_owned())
                    .nth(0);
                let param_bookmark = match param_bookmark {
                    Some(param_bookmark) => {
                        let param_bookmark =
                            <String as std::str::FromStr>::from_str
                                (&param_bookmark);
                        match param_bookmark {
                            Ok(param_bookmark) => Some(param_bookmark),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter bookmark - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter bookmark")),
                        }
                    },
                    None => None,
                };
                let param_page_size = query_params.iter().filter(|e| e.0 == "page_size").map(|e| e.1.to_owned())
                    .nth(0);
                let param_page_size = match param_page_size {
                    Some(param_page_size) => {
                        let param_page_size =
                            <i32 as std::str::FromStr>::from_str
                                (&param_page_size);
                        match param_page_size {
                            Ok(param_page_size) => Some(param_page_size),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter page_size - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter page_size")),
                        }
                    },
                    None => None,
                };
                let param_include_shared_accounts = query_params.iter().filter(|e| e.0 == "include_shared_accounts").map(|e| e.1.to_owned())
                    .nth(0);
                let param_include_shared_accounts = match param_include_shared_accounts {
                    Some(param_include_shared_accounts) => {
                        let param_include_shared_accounts =
                            <bool as std::str::FromStr>::from_str
                                (&param_include_shared_accounts);
                        match param_include_shared_accounts {
                            Ok(param_include_shared_accounts) => Some(param_include_shared_accounts),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter include_shared_accounts - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter include_shared_accounts")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.ad_accounts_list(
                                            param_bookmark,
                                            param_page_size,
                                            param_include_shared_accounts,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                AdAccountsListResponse::Response
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for AD_ACCOUNTS_LIST_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                AdAccountsListResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for AD_ACCOUNTS_LIST_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // AdGroupsAnalytics - GET /ad_accounts/{ad_account_id}/ad_groups/analytics
            &hyper::Method::GET if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS_ANALYTICS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "ads:read".to_string(), // See all of your advertising data, including ads, ad groups, campaigns etc.
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS_ANALYTICS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS_ANALYTICS in set but failed match against \"{}\"", path, paths::REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS_ANALYTICS.as_str())
                    );

                let param_ad_account_id = match percent_encoding::percent_decode(path_params["ad_account_id"].as_bytes()).decode_utf8() {
                    Ok(param_ad_account_id) => match param_ad_account_id.parse::<String>() {
                        Ok(param_ad_account_id) => param_ad_account_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter ad_account_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["ad_account_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_start_date = query_params.iter().filter(|e| e.0 == "start_date").map(|e| e.1.to_owned())
                    .nth(0);
                let param_start_date = match param_start_date {
                    Some(param_start_date) => {
                        let param_start_date =
                            <chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str
                                (&param_start_date);
                        match param_start_date {
                            Ok(param_start_date) => Some(param_start_date),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter start_date - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter start_date")),
                        }
                    },
                    None => None,
                };
                let param_start_date = match param_start_date {
                    Some(param_start_date) => param_start_date,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter start_date"))
                        .expect("Unable to create Bad Request response for missing query parameter start_date")),
                };
                let param_end_date = query_params.iter().filter(|e| e.0 == "end_date").map(|e| e.1.to_owned())
                    .nth(0);
                let param_end_date = match param_end_date {
                    Some(param_end_date) => {
                        let param_end_date =
                            <chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str
                                (&param_end_date);
                        match param_end_date {
                            Ok(param_end_date) => Some(param_end_date),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter end_date - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter end_date")),
                        }
                    },
                    None => None,
                };
                let param_end_date = match param_end_date {
                    Some(param_end_date) => param_end_date,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter end_date"))
                        .expect("Unable to create Bad Request response for missing query parameter end_date")),
                };
                let param_ad_group_ids = query_params.iter().filter(|e| e.0 == "ad_group_ids").map(|e| e.1.to_owned())
                    .filter_map(|param_ad_group_ids| param_ad_group_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_columns = query_params.iter().filter(|e| e.0 == "columns").map(|e| e.1.to_owned())
                    .filter_map(|param_columns| param_columns.parse().ok())
                    .collect::<Vec<_>>();
                let param_granularity = query_params.iter().filter(|e| e.0 == "granularity").map(|e| e.1.to_owned())
                    .nth(0);
                let param_granularity = match param_granularity {
                    Some(param_granularity) => {
                        let param_granularity =
                            <models::Granularity as std::str::FromStr>::from_str
                                (&param_granularity);
                        match param_granularity {
                            Ok(param_granularity) => Some(param_granularity),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter granularity - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter granularity")),
                        }
                    },
                    None => None,
                };
                let param_granularity = match param_granularity {
                    Some(param_granularity) => param_granularity,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter granularity"))
                        .expect("Unable to create Bad Request response for missing query parameter granularity")),
                };
                let param_click_window_days = query_params.iter().filter(|e| e.0 == "click_window_days").map(|e| e.1.to_owned())
                    .nth(0);
                let param_click_window_days = match param_click_window_days {
                    Some(param_click_window_days) => {
                        let param_click_window_days =
                            <i32 as std::str::FromStr>::from_str
                                (&param_click_window_days);
                        match param_click_window_days {
                            Ok(param_click_window_days) => Some(param_click_window_days),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter click_window_days - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter click_window_days")),
                        }
                    },
                    None => None,
                };
                let param_engagement_window_days = query_params.iter().filter(|e| e.0 == "engagement_window_days").map(|e| e.1.to_owned())
                    .nth(0);
                let param_engagement_window_days = match param_engagement_window_days {
                    Some(param_engagement_window_days) => {
                        let param_engagement_window_days =
                            <i32 as std::str::FromStr>::from_str
                                (&param_engagement_window_days);
                        match param_engagement_window_days {
                            Ok(param_engagement_window_days) => Some(param_engagement_window_days),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter engagement_window_days - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter engagement_window_days")),
                        }
                    },
                    None => None,
                };
                let param_view_window_days = query_params.iter().filter(|e| e.0 == "view_window_days").map(|e| e.1.to_owned())
                    .nth(0);
                let param_view_window_days = match param_view_window_days {
                    Some(param_view_window_days) => {
                        let param_view_window_days =
                            <i32 as std::str::FromStr>::from_str
                                (&param_view_window_days);
                        match param_view_window_days {
                            Ok(param_view_window_days) => Some(param_view_window_days),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter view_window_days - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter view_window_days")),
                        }
                    },
                    None => None,
                };
                let param_conversion_report_time = query_params.iter().filter(|e| e.0 == "conversion_report_time").map(|e| e.1.to_owned())
                    .nth(0);
                let param_conversion_report_time = match param_conversion_report_time {
                    Some(param_conversion_report_time) => {
                        let param_conversion_report_time =
                            <String as std::str::FromStr>::from_str
                                (&param_conversion_report_time);
                        match param_conversion_report_time {
                            Ok(param_conversion_report_time) => Some(param_conversion_report_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter conversion_report_time - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter conversion_report_time")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.ad_groups_analytics(
                                            param_ad_account_id,
                                            param_start_date,
                                            param_end_date,
                                            param_ad_group_ids.as_ref(),
                                            param_columns.as_ref(),
                                            param_granularity,
                                            param_click_window_days,
                                            param_engagement_window_days,
                                            param_view_window_days,
                                            param_conversion_report_time,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                AdGroupsAnalyticsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for AD_GROUPS_ANALYTICS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                AdGroupsAnalyticsResponse::InvalidAdAccountGroupAnalyticsParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for AD_GROUPS_ANALYTICS_INVALID_AD_ACCOUNT_GROUP_ANALYTICS_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                AdGroupsAnalyticsResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for AD_GROUPS_ANALYTICS_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // AdGroupsList - GET /ad_accounts/{ad_account_id}/ad_groups
            &hyper::Method::GET if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "ads:read".to_string(), // See all of your advertising data, including ads, ad groups, campaigns etc.
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS in set but failed match against \"{}\"", path, paths::REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS.as_str())
                    );

                let param_ad_account_id = match percent_encoding::percent_decode(path_params["ad_account_id"].as_bytes()).decode_utf8() {
                    Ok(param_ad_account_id) => match param_ad_account_id.parse::<String>() {
                        Ok(param_ad_account_id) => param_ad_account_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter ad_account_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["ad_account_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_campaign_ids = query_params.iter().filter(|e| e.0 == "campaign_ids").map(|e| e.1.to_owned())
                    .filter_map(|param_campaign_ids| param_campaign_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_campaign_ids = if !param_campaign_ids.is_empty() {
                    Some(param_campaign_ids)
                } else {
                    None
                };
                let param_ad_group_ids = query_params.iter().filter(|e| e.0 == "ad_group_ids").map(|e| e.1.to_owned())
                    .filter_map(|param_ad_group_ids| param_ad_group_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_ad_group_ids = if !param_ad_group_ids.is_empty() {
                    Some(param_ad_group_ids)
                } else {
                    None
                };
                let param_entity_statuses = query_params.iter().filter(|e| e.0 == "entity_statuses").map(|e| e.1.to_owned())
                    .filter_map(|param_entity_statuses| param_entity_statuses.parse().ok())
                    .collect::<Vec<_>>();
                let param_entity_statuses = if !param_entity_statuses.is_empty() {
                    Some(param_entity_statuses)
                } else {
                    None
                };
                let param_page_size = query_params.iter().filter(|e| e.0 == "page_size").map(|e| e.1.to_owned())
                    .nth(0);
                let param_page_size = match param_page_size {
                    Some(param_page_size) => {
                        let param_page_size =
                            <i32 as std::str::FromStr>::from_str
                                (&param_page_size);
                        match param_page_size {
                            Ok(param_page_size) => Some(param_page_size),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter page_size - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter page_size")),
                        }
                    },
                    None => None,
                };
                let param_order = query_params.iter().filter(|e| e.0 == "order").map(|e| e.1.to_owned())
                    .nth(0);
                let param_order = match param_order {
                    Some(param_order) => {
                        let param_order =
                            <String as std::str::FromStr>::from_str
                                (&param_order);
                        match param_order {
                            Ok(param_order) => Some(param_order),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter order - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter order")),
                        }
                    },
                    None => None,
                };
                let param_bookmark = query_params.iter().filter(|e| e.0 == "bookmark").map(|e| e.1.to_owned())
                    .nth(0);
                let param_bookmark = match param_bookmark {
                    Some(param_bookmark) => {
                        let param_bookmark =
                            <String as std::str::FromStr>::from_str
                                (&param_bookmark);
                        match param_bookmark {
                            Ok(param_bookmark) => Some(param_bookmark),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter bookmark - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter bookmark")),
                        }
                    },
                    None => None,
                };
                let param_translate_interests_to_names = query_params.iter().filter(|e| e.0 == "translate_interests_to_names").map(|e| e.1.to_owned())
                    .nth(0);
                let param_translate_interests_to_names = match param_translate_interests_to_names {
                    Some(param_translate_interests_to_names) => {
                        let param_translate_interests_to_names =
                            <bool as std::str::FromStr>::from_str
                                (&param_translate_interests_to_names);
                        match param_translate_interests_to_names {
                            Ok(param_translate_interests_to_names) => Some(param_translate_interests_to_names),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter translate_interests_to_names - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter translate_interests_to_names")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.ad_groups_list(
                                            param_ad_account_id,
                                            param_campaign_ids.as_ref(),
                                            param_ad_group_ids.as_ref(),
                                            param_entity_statuses.as_ref(),
                                            param_page_size,
                                            param_order,
                                            param_bookmark,
                                            param_translate_interests_to_names,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                AdGroupsListResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for AD_GROUPS_LIST_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                AdGroupsListResponse::InvalidAdAccountGroupParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for AD_GROUPS_LIST_INVALID_AD_ACCOUNT_GROUP_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                AdGroupsListResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for AD_GROUPS_LIST_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // AdsAnalytics - GET /ad_accounts/{ad_account_id}/ads/analytics
            &hyper::Method::GET if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_ADS_ANALYTICS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "ads:read".to_string(), // See all of your advertising data, including ads, ad groups, campaigns etc.
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_ADS_ANALYTICS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE AD_ACCOUNTS_AD_ACCOUNT_ID_ADS_ANALYTICS in set but failed match against \"{}\"", path, paths::REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_ADS_ANALYTICS.as_str())
                    );

                let param_ad_account_id = match percent_encoding::percent_decode(path_params["ad_account_id"].as_bytes()).decode_utf8() {
                    Ok(param_ad_account_id) => match param_ad_account_id.parse::<String>() {
                        Ok(param_ad_account_id) => param_ad_account_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter ad_account_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["ad_account_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_start_date = query_params.iter().filter(|e| e.0 == "start_date").map(|e| e.1.to_owned())
                    .nth(0);
                let param_start_date = match param_start_date {
                    Some(param_start_date) => {
                        let param_start_date =
                            <chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str
                                (&param_start_date);
                        match param_start_date {
                            Ok(param_start_date) => Some(param_start_date),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter start_date - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter start_date")),
                        }
                    },
                    None => None,
                };
                let param_start_date = match param_start_date {
                    Some(param_start_date) => param_start_date,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter start_date"))
                        .expect("Unable to create Bad Request response for missing query parameter start_date")),
                };
                let param_end_date = query_params.iter().filter(|e| e.0 == "end_date").map(|e| e.1.to_owned())
                    .nth(0);
                let param_end_date = match param_end_date {
                    Some(param_end_date) => {
                        let param_end_date =
                            <chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str
                                (&param_end_date);
                        match param_end_date {
                            Ok(param_end_date) => Some(param_end_date),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter end_date - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter end_date")),
                        }
                    },
                    None => None,
                };
                let param_end_date = match param_end_date {
                    Some(param_end_date) => param_end_date,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter end_date"))
                        .expect("Unable to create Bad Request response for missing query parameter end_date")),
                };
                let param_ad_ids = query_params.iter().filter(|e| e.0 == "ad_ids").map(|e| e.1.to_owned())
                    .filter_map(|param_ad_ids| param_ad_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_columns = query_params.iter().filter(|e| e.0 == "columns").map(|e| e.1.to_owned())
                    .filter_map(|param_columns| param_columns.parse().ok())
                    .collect::<Vec<_>>();
                let param_granularity = query_params.iter().filter(|e| e.0 == "granularity").map(|e| e.1.to_owned())
                    .nth(0);
                let param_granularity = match param_granularity {
                    Some(param_granularity) => {
                        let param_granularity =
                            <models::Granularity as std::str::FromStr>::from_str
                                (&param_granularity);
                        match param_granularity {
                            Ok(param_granularity) => Some(param_granularity),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter granularity - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter granularity")),
                        }
                    },
                    None => None,
                };
                let param_granularity = match param_granularity {
                    Some(param_granularity) => param_granularity,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter granularity"))
                        .expect("Unable to create Bad Request response for missing query parameter granularity")),
                };
                let param_click_window_days = query_params.iter().filter(|e| e.0 == "click_window_days").map(|e| e.1.to_owned())
                    .nth(0);
                let param_click_window_days = match param_click_window_days {
                    Some(param_click_window_days) => {
                        let param_click_window_days =
                            <i32 as std::str::FromStr>::from_str
                                (&param_click_window_days);
                        match param_click_window_days {
                            Ok(param_click_window_days) => Some(param_click_window_days),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter click_window_days - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter click_window_days")),
                        }
                    },
                    None => None,
                };
                let param_engagement_window_days = query_params.iter().filter(|e| e.0 == "engagement_window_days").map(|e| e.1.to_owned())
                    .nth(0);
                let param_engagement_window_days = match param_engagement_window_days {
                    Some(param_engagement_window_days) => {
                        let param_engagement_window_days =
                            <i32 as std::str::FromStr>::from_str
                                (&param_engagement_window_days);
                        match param_engagement_window_days {
                            Ok(param_engagement_window_days) => Some(param_engagement_window_days),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter engagement_window_days - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter engagement_window_days")),
                        }
                    },
                    None => None,
                };
                let param_view_window_days = query_params.iter().filter(|e| e.0 == "view_window_days").map(|e| e.1.to_owned())
                    .nth(0);
                let param_view_window_days = match param_view_window_days {
                    Some(param_view_window_days) => {
                        let param_view_window_days =
                            <i32 as std::str::FromStr>::from_str
                                (&param_view_window_days);
                        match param_view_window_days {
                            Ok(param_view_window_days) => Some(param_view_window_days),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter view_window_days - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter view_window_days")),
                        }
                    },
                    None => None,
                };
                let param_conversion_report_time = query_params.iter().filter(|e| e.0 == "conversion_report_time").map(|e| e.1.to_owned())
                    .nth(0);
                let param_conversion_report_time = match param_conversion_report_time {
                    Some(param_conversion_report_time) => {
                        let param_conversion_report_time =
                            <String as std::str::FromStr>::from_str
                                (&param_conversion_report_time);
                        match param_conversion_report_time {
                            Ok(param_conversion_report_time) => Some(param_conversion_report_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter conversion_report_time - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter conversion_report_time")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.ads_analytics(
                                            param_ad_account_id,
                                            param_start_date,
                                            param_end_date,
                                            param_ad_ids.as_ref(),
                                            param_columns.as_ref(),
                                            param_granularity,
                                            param_click_window_days,
                                            param_engagement_window_days,
                                            param_view_window_days,
                                            param_conversion_report_time,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                AdsAnalyticsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ADS_ANALYTICS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                AdsAnalyticsResponse::InvalidAdAccountAdsAnalyticsParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ADS_ANALYTICS_INVALID_AD_ACCOUNT_ADS_ANALYTICS_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                AdsAnalyticsResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ADS_ANALYTICS_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // AdsList - GET /ad_accounts/{ad_account_id}/ads
            &hyper::Method::GET if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_ADS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "ads:read".to_string(), // See all of your advertising data, including ads, ad groups, campaigns etc.
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_ADS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE AD_ACCOUNTS_AD_ACCOUNT_ID_ADS in set but failed match against \"{}\"", path, paths::REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_ADS.as_str())
                    );

                let param_ad_account_id = match percent_encoding::percent_decode(path_params["ad_account_id"].as_bytes()).decode_utf8() {
                    Ok(param_ad_account_id) => match param_ad_account_id.parse::<String>() {
                        Ok(param_ad_account_id) => param_ad_account_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter ad_account_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["ad_account_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_campaign_ids = query_params.iter().filter(|e| e.0 == "campaign_ids").map(|e| e.1.to_owned())
                    .filter_map(|param_campaign_ids| param_campaign_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_campaign_ids = if !param_campaign_ids.is_empty() {
                    Some(param_campaign_ids)
                } else {
                    None
                };
                let param_ad_group_ids = query_params.iter().filter(|e| e.0 == "ad_group_ids").map(|e| e.1.to_owned())
                    .filter_map(|param_ad_group_ids| param_ad_group_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_ad_group_ids = if !param_ad_group_ids.is_empty() {
                    Some(param_ad_group_ids)
                } else {
                    None
                };
                let param_ad_ids = query_params.iter().filter(|e| e.0 == "ad_ids").map(|e| e.1.to_owned())
                    .filter_map(|param_ad_ids| param_ad_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_ad_ids = if !param_ad_ids.is_empty() {
                    Some(param_ad_ids)
                } else {
                    None
                };
                let param_entity_statuses = query_params.iter().filter(|e| e.0 == "entity_statuses").map(|e| e.1.to_owned())
                    .filter_map(|param_entity_statuses| param_entity_statuses.parse().ok())
                    .collect::<Vec<_>>();
                let param_entity_statuses = if !param_entity_statuses.is_empty() {
                    Some(param_entity_statuses)
                } else {
                    None
                };
                let param_page_size = query_params.iter().filter(|e| e.0 == "page_size").map(|e| e.1.to_owned())
                    .nth(0);
                let param_page_size = match param_page_size {
                    Some(param_page_size) => {
                        let param_page_size =
                            <i32 as std::str::FromStr>::from_str
                                (&param_page_size);
                        match param_page_size {
                            Ok(param_page_size) => Some(param_page_size),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter page_size - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter page_size")),
                        }
                    },
                    None => None,
                };
                let param_order = query_params.iter().filter(|e| e.0 == "order").map(|e| e.1.to_owned())
                    .nth(0);
                let param_order = match param_order {
                    Some(param_order) => {
                        let param_order =
                            <String as std::str::FromStr>::from_str
                                (&param_order);
                        match param_order {
                            Ok(param_order) => Some(param_order),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter order - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter order")),
                        }
                    },
                    None => None,
                };
                let param_bookmark = query_params.iter().filter(|e| e.0 == "bookmark").map(|e| e.1.to_owned())
                    .nth(0);
                let param_bookmark = match param_bookmark {
                    Some(param_bookmark) => {
                        let param_bookmark =
                            <String as std::str::FromStr>::from_str
                                (&param_bookmark);
                        match param_bookmark {
                            Ok(param_bookmark) => Some(param_bookmark),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter bookmark - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter bookmark")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.ads_list(
                                            param_ad_account_id,
                                            param_campaign_ids.as_ref(),
                                            param_ad_group_ids.as_ref(),
                                            param_ad_ids.as_ref(),
                                            param_entity_statuses.as_ref(),
                                            param_page_size,
                                            param_order,
                                            param_bookmark,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                AdsListResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ADS_LIST_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                AdsListResponse::InvalidAdAccountAdsParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ADS_LIST_INVALID_AD_ACCOUNT_ADS_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                AdsListResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ADS_LIST_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // AnalyticsCreateReport - POST /ad_accounts/{ad_account_id}/reports
            &hyper::Method::POST if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_REPORTS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "ads:read".to_string(), // See all of your advertising data, including ads, ad groups, campaigns etc.
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_REPORTS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE AD_ACCOUNTS_AD_ACCOUNT_ID_REPORTS in set but failed match against \"{}\"", path, paths::REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_REPORTS.as_str())
                    );

                let param_ad_account_id = match percent_encoding::percent_decode(path_params["ad_account_id"].as_bytes()).decode_utf8() {
                    Ok(param_ad_account_id) => match param_ad_account_id.parse::<String>() {
                        Ok(param_ad_account_id) => param_ad_account_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter ad_account_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["ad_account_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.to_raw().await;
                match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_ads_analytics_create_async_request: Option<models::AdsAnalyticsCreateAsyncRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_ads_analytics_create_async_request) => param_ads_analytics_create_async_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter AdsAnalyticsCreateAsyncRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter AdsAnalyticsCreateAsyncRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_ads_analytics_create_async_request = match param_ads_analytics_create_async_request {
                                    Some(param_ads_analytics_create_async_request) => param_ads_analytics_create_async_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter AdsAnalyticsCreateAsyncRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter AdsAnalyticsCreateAsyncRequest")),
                                };

                                let result = api_impl.analytics_create_report(
                                            param_ad_account_id,
                                            param_ads_analytics_create_async_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {:?}", unused_elements).as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                AnalyticsCreateReportResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ANALYTICS_CREATE_REPORT_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                AnalyticsCreateReportResponse::InvalidAdAccountAdsAnalyticsParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ANALYTICS_CREATE_REPORT_INVALID_AD_ACCOUNT_ADS_ANALYTICS_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                AnalyticsCreateReportResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ANALYTICS_CREATE_REPORT_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read body parameter AdsAnalyticsCreateAsyncRequest: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body parameter AdsAnalyticsCreateAsyncRequest")),
                        }
            },

            // AnalyticsGetReport - GET /ad_accounts/{ad_account_id}/reports
            &hyper::Method::GET if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_REPORTS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "ads:read".to_string(), // See all of your advertising data, including ads, ad groups, campaigns etc.
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_REPORTS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE AD_ACCOUNTS_AD_ACCOUNT_ID_REPORTS in set but failed match against \"{}\"", path, paths::REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_REPORTS.as_str())
                    );

                let param_ad_account_id = match percent_encoding::percent_decode(path_params["ad_account_id"].as_bytes()).decode_utf8() {
                    Ok(param_ad_account_id) => match param_ad_account_id.parse::<String>() {
                        Ok(param_ad_account_id) => param_ad_account_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter ad_account_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["ad_account_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_token = query_params.iter().filter(|e| e.0 == "token").map(|e| e.1.to_owned())
                    .nth(0);
                let param_token = match param_token {
                    Some(param_token) => {
                        let param_token =
                            <String as std::str::FromStr>::from_str
                                (&param_token);
                        match param_token {
                            Ok(param_token) => Some(param_token),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter token - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter token")),
                        }
                    },
                    None => None,
                };
                let param_token = match param_token {
                    Some(param_token) => param_token,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter token"))
                        .expect("Unable to create Bad Request response for missing query parameter token")),
                };

                                let result = api_impl.analytics_get_report(
                                            param_ad_account_id,
                                            param_token,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                AnalyticsGetReportResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ANALYTICS_GET_REPORT_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                AnalyticsGetReportResponse::InvalidAdAccountAdsAnalyticsParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ANALYTICS_GET_REPORT_INVALID_AD_ACCOUNT_ADS_ANALYTICS_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                AnalyticsGetReportResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ANALYTICS_GET_REPORT_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CampaignsAnalytics - GET /ad_accounts/{ad_account_id}/campaigns/analytics
            &hyper::Method::GET if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS_ANALYTICS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "ads:read".to_string(), // See all of your advertising data, including ads, ad groups, campaigns etc.
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS_ANALYTICS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS_ANALYTICS in set but failed match against \"{}\"", path, paths::REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS_ANALYTICS.as_str())
                    );

                let param_ad_account_id = match percent_encoding::percent_decode(path_params["ad_account_id"].as_bytes()).decode_utf8() {
                    Ok(param_ad_account_id) => match param_ad_account_id.parse::<String>() {
                        Ok(param_ad_account_id) => param_ad_account_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter ad_account_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["ad_account_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_start_date = query_params.iter().filter(|e| e.0 == "start_date").map(|e| e.1.to_owned())
                    .nth(0);
                let param_start_date = match param_start_date {
                    Some(param_start_date) => {
                        let param_start_date =
                            <chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str
                                (&param_start_date);
                        match param_start_date {
                            Ok(param_start_date) => Some(param_start_date),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter start_date - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter start_date")),
                        }
                    },
                    None => None,
                };
                let param_start_date = match param_start_date {
                    Some(param_start_date) => param_start_date,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter start_date"))
                        .expect("Unable to create Bad Request response for missing query parameter start_date")),
                };
                let param_end_date = query_params.iter().filter(|e| e.0 == "end_date").map(|e| e.1.to_owned())
                    .nth(0);
                let param_end_date = match param_end_date {
                    Some(param_end_date) => {
                        let param_end_date =
                            <chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str
                                (&param_end_date);
                        match param_end_date {
                            Ok(param_end_date) => Some(param_end_date),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter end_date - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter end_date")),
                        }
                    },
                    None => None,
                };
                let param_end_date = match param_end_date {
                    Some(param_end_date) => param_end_date,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter end_date"))
                        .expect("Unable to create Bad Request response for missing query parameter end_date")),
                };
                let param_campaign_ids = query_params.iter().filter(|e| e.0 == "campaign_ids").map(|e| e.1.to_owned())
                    .filter_map(|param_campaign_ids| param_campaign_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_columns = query_params.iter().filter(|e| e.0 == "columns").map(|e| e.1.to_owned())
                    .filter_map(|param_columns| param_columns.parse().ok())
                    .collect::<Vec<_>>();
                let param_granularity = query_params.iter().filter(|e| e.0 == "granularity").map(|e| e.1.to_owned())
                    .nth(0);
                let param_granularity = match param_granularity {
                    Some(param_granularity) => {
                        let param_granularity =
                            <models::Granularity as std::str::FromStr>::from_str
                                (&param_granularity);
                        match param_granularity {
                            Ok(param_granularity) => Some(param_granularity),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter granularity - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter granularity")),
                        }
                    },
                    None => None,
                };
                let param_granularity = match param_granularity {
                    Some(param_granularity) => param_granularity,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter granularity"))
                        .expect("Unable to create Bad Request response for missing query parameter granularity")),
                };
                let param_click_window_days = query_params.iter().filter(|e| e.0 == "click_window_days").map(|e| e.1.to_owned())
                    .nth(0);
                let param_click_window_days = match param_click_window_days {
                    Some(param_click_window_days) => {
                        let param_click_window_days =
                            <i32 as std::str::FromStr>::from_str
                                (&param_click_window_days);
                        match param_click_window_days {
                            Ok(param_click_window_days) => Some(param_click_window_days),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter click_window_days - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter click_window_days")),
                        }
                    },
                    None => None,
                };
                let param_engagement_window_days = query_params.iter().filter(|e| e.0 == "engagement_window_days").map(|e| e.1.to_owned())
                    .nth(0);
                let param_engagement_window_days = match param_engagement_window_days {
                    Some(param_engagement_window_days) => {
                        let param_engagement_window_days =
                            <i32 as std::str::FromStr>::from_str
                                (&param_engagement_window_days);
                        match param_engagement_window_days {
                            Ok(param_engagement_window_days) => Some(param_engagement_window_days),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter engagement_window_days - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter engagement_window_days")),
                        }
                    },
                    None => None,
                };
                let param_view_window_days = query_params.iter().filter(|e| e.0 == "view_window_days").map(|e| e.1.to_owned())
                    .nth(0);
                let param_view_window_days = match param_view_window_days {
                    Some(param_view_window_days) => {
                        let param_view_window_days =
                            <i32 as std::str::FromStr>::from_str
                                (&param_view_window_days);
                        match param_view_window_days {
                            Ok(param_view_window_days) => Some(param_view_window_days),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter view_window_days - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter view_window_days")),
                        }
                    },
                    None => None,
                };
                let param_conversion_report_time = query_params.iter().filter(|e| e.0 == "conversion_report_time").map(|e| e.1.to_owned())
                    .nth(0);
                let param_conversion_report_time = match param_conversion_report_time {
                    Some(param_conversion_report_time) => {
                        let param_conversion_report_time =
                            <String as std::str::FromStr>::from_str
                                (&param_conversion_report_time);
                        match param_conversion_report_time {
                            Ok(param_conversion_report_time) => Some(param_conversion_report_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter conversion_report_time - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter conversion_report_time")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.campaigns_analytics(
                                            param_ad_account_id,
                                            param_start_date,
                                            param_end_date,
                                            param_campaign_ids.as_ref(),
                                            param_columns.as_ref(),
                                            param_granularity,
                                            param_click_window_days,
                                            param_engagement_window_days,
                                            param_view_window_days,
                                            param_conversion_report_time,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CampaignsAnalyticsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CAMPAIGNS_ANALYTICS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CampaignsAnalyticsResponse::InvalidAdAccountCampaignAnalyticsParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CAMPAIGNS_ANALYTICS_INVALID_AD_ACCOUNT_CAMPAIGN_ANALYTICS_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CampaignsAnalyticsResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CAMPAIGNS_ANALYTICS_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CampaignsList - GET /ad_accounts/{ad_account_id}/campaigns
            &hyper::Method::GET if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "ads:read".to_string(), // See all of your advertising data, including ads, ad groups, campaigns etc.
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS in set but failed match against \"{}\"", path, paths::REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS.as_str())
                    );

                let param_ad_account_id = match percent_encoding::percent_decode(path_params["ad_account_id"].as_bytes()).decode_utf8() {
                    Ok(param_ad_account_id) => match param_ad_account_id.parse::<String>() {
                        Ok(param_ad_account_id) => param_ad_account_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter ad_account_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["ad_account_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_campaign_ids = query_params.iter().filter(|e| e.0 == "campaign_ids").map(|e| e.1.to_owned())
                    .filter_map(|param_campaign_ids| param_campaign_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_campaign_ids = if !param_campaign_ids.is_empty() {
                    Some(param_campaign_ids)
                } else {
                    None
                };
                let param_entity_statuses = query_params.iter().filter(|e| e.0 == "entity_statuses").map(|e| e.1.to_owned())
                    .filter_map(|param_entity_statuses| param_entity_statuses.parse().ok())
                    .collect::<Vec<_>>();
                let param_entity_statuses = if !param_entity_statuses.is_empty() {
                    Some(param_entity_statuses)
                } else {
                    None
                };
                let param_page_size = query_params.iter().filter(|e| e.0 == "page_size").map(|e| e.1.to_owned())
                    .nth(0);
                let param_page_size = match param_page_size {
                    Some(param_page_size) => {
                        let param_page_size =
                            <i32 as std::str::FromStr>::from_str
                                (&param_page_size);
                        match param_page_size {
                            Ok(param_page_size) => Some(param_page_size),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter page_size - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter page_size")),
                        }
                    },
                    None => None,
                };
                let param_order = query_params.iter().filter(|e| e.0 == "order").map(|e| e.1.to_owned())
                    .nth(0);
                let param_order = match param_order {
                    Some(param_order) => {
                        let param_order =
                            <String as std::str::FromStr>::from_str
                                (&param_order);
                        match param_order {
                            Ok(param_order) => Some(param_order),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter order - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter order")),
                        }
                    },
                    None => None,
                };
                let param_bookmark = query_params.iter().filter(|e| e.0 == "bookmark").map(|e| e.1.to_owned())
                    .nth(0);
                let param_bookmark = match param_bookmark {
                    Some(param_bookmark) => {
                        let param_bookmark =
                            <String as std::str::FromStr>::from_str
                                (&param_bookmark);
                        match param_bookmark {
                            Ok(param_bookmark) => Some(param_bookmark),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter bookmark - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter bookmark")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.campaigns_list(
                                            param_ad_account_id,
                                            param_campaign_ids.as_ref(),
                                            param_entity_statuses.as_ref(),
                                            param_page_size,
                                            param_order,
                                            param_bookmark,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CampaignsListResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CAMPAIGNS_LIST_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CampaignsListResponse::InvalidAdAccountCampaignParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CAMPAIGNS_LIST_INVALID_AD_ACCOUNT_CAMPAIGN_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CampaignsListResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CAMPAIGNS_LIST_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ProductGroupsAnalytics - GET /ad_accounts/{ad_account_id}/product_groups/analytics
            &hyper::Method::GET if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_PRODUCT_GROUPS_ANALYTICS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "ads:read".to_string(), // See all of your advertising data, including ads, ad groups, campaigns etc.
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_PRODUCT_GROUPS_ANALYTICS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE AD_ACCOUNTS_AD_ACCOUNT_ID_PRODUCT_GROUPS_ANALYTICS in set but failed match against \"{}\"", path, paths::REGEX_AD_ACCOUNTS_AD_ACCOUNT_ID_PRODUCT_GROUPS_ANALYTICS.as_str())
                    );

                let param_ad_account_id = match percent_encoding::percent_decode(path_params["ad_account_id"].as_bytes()).decode_utf8() {
                    Ok(param_ad_account_id) => match param_ad_account_id.parse::<String>() {
                        Ok(param_ad_account_id) => param_ad_account_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter ad_account_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["ad_account_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_start_date = query_params.iter().filter(|e| e.0 == "start_date").map(|e| e.1.to_owned())
                    .nth(0);
                let param_start_date = match param_start_date {
                    Some(param_start_date) => {
                        let param_start_date =
                            <chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str
                                (&param_start_date);
                        match param_start_date {
                            Ok(param_start_date) => Some(param_start_date),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter start_date - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter start_date")),
                        }
                    },
                    None => None,
                };
                let param_start_date = match param_start_date {
                    Some(param_start_date) => param_start_date,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter start_date"))
                        .expect("Unable to create Bad Request response for missing query parameter start_date")),
                };
                let param_end_date = query_params.iter().filter(|e| e.0 == "end_date").map(|e| e.1.to_owned())
                    .nth(0);
                let param_end_date = match param_end_date {
                    Some(param_end_date) => {
                        let param_end_date =
                            <chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str
                                (&param_end_date);
                        match param_end_date {
                            Ok(param_end_date) => Some(param_end_date),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter end_date - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter end_date")),
                        }
                    },
                    None => None,
                };
                let param_end_date = match param_end_date {
                    Some(param_end_date) => param_end_date,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter end_date"))
                        .expect("Unable to create Bad Request response for missing query parameter end_date")),
                };
                let param_product_group_ids = query_params.iter().filter(|e| e.0 == "product_group_ids").map(|e| e.1.to_owned())
                    .filter_map(|param_product_group_ids| param_product_group_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_columns = query_params.iter().filter(|e| e.0 == "columns").map(|e| e.1.to_owned())
                    .filter_map(|param_columns| param_columns.parse().ok())
                    .collect::<Vec<_>>();
                let param_granularity = query_params.iter().filter(|e| e.0 == "granularity").map(|e| e.1.to_owned())
                    .nth(0);
                let param_granularity = match param_granularity {
                    Some(param_granularity) => {
                        let param_granularity =
                            <models::Granularity as std::str::FromStr>::from_str
                                (&param_granularity);
                        match param_granularity {
                            Ok(param_granularity) => Some(param_granularity),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter granularity - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter granularity")),
                        }
                    },
                    None => None,
                };
                let param_granularity = match param_granularity {
                    Some(param_granularity) => param_granularity,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter granularity"))
                        .expect("Unable to create Bad Request response for missing query parameter granularity")),
                };
                let param_click_window_days = query_params.iter().filter(|e| e.0 == "click_window_days").map(|e| e.1.to_owned())
                    .nth(0);
                let param_click_window_days = match param_click_window_days {
                    Some(param_click_window_days) => {
                        let param_click_window_days =
                            <i32 as std::str::FromStr>::from_str
                                (&param_click_window_days);
                        match param_click_window_days {
                            Ok(param_click_window_days) => Some(param_click_window_days),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter click_window_days - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter click_window_days")),
                        }
                    },
                    None => None,
                };
                let param_engagement_window_days = query_params.iter().filter(|e| e.0 == "engagement_window_days").map(|e| e.1.to_owned())
                    .nth(0);
                let param_engagement_window_days = match param_engagement_window_days {
                    Some(param_engagement_window_days) => {
                        let param_engagement_window_days =
                            <i32 as std::str::FromStr>::from_str
                                (&param_engagement_window_days);
                        match param_engagement_window_days {
                            Ok(param_engagement_window_days) => Some(param_engagement_window_days),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter engagement_window_days - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter engagement_window_days")),
                        }
                    },
                    None => None,
                };
                let param_view_window_days = query_params.iter().filter(|e| e.0 == "view_window_days").map(|e| e.1.to_owned())
                    .nth(0);
                let param_view_window_days = match param_view_window_days {
                    Some(param_view_window_days) => {
                        let param_view_window_days =
                            <i32 as std::str::FromStr>::from_str
                                (&param_view_window_days);
                        match param_view_window_days {
                            Ok(param_view_window_days) => Some(param_view_window_days),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter view_window_days - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter view_window_days")),
                        }
                    },
                    None => None,
                };
                let param_conversion_report_time = query_params.iter().filter(|e| e.0 == "conversion_report_time").map(|e| e.1.to_owned())
                    .nth(0);
                let param_conversion_report_time = match param_conversion_report_time {
                    Some(param_conversion_report_time) => {
                        let param_conversion_report_time =
                            <String as std::str::FromStr>::from_str
                                (&param_conversion_report_time);
                        match param_conversion_report_time {
                            Ok(param_conversion_report_time) => Some(param_conversion_report_time),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter conversion_report_time - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter conversion_report_time")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.product_groups_analytics(
                                            param_ad_account_id,
                                            param_start_date,
                                            param_end_date,
                                            param_product_group_ids.as_ref(),
                                            param_columns.as_ref(),
                                            param_granularity,
                                            param_click_window_days,
                                            param_engagement_window_days,
                                            param_view_window_days,
                                            param_conversion_report_time,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ProductGroupsAnalyticsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for PRODUCT_GROUPS_ANALYTICS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                ProductGroupsAnalyticsResponse::InvalidAdAccountAdsAnalyticsParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for PRODUCT_GROUPS_ANALYTICS_INVALID_AD_ACCOUNT_ADS_ANALYTICS_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                ProductGroupsAnalyticsResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for PRODUCT_GROUPS_ANALYTICS_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // BoardSectionsCreate - POST /boards/{board_id}/sections
            &hyper::Method::POST if path.matched(paths::ID_BOARDS_BOARD_ID_SECTIONS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "boards:read".to_string(), // See your public boards, including group boards you join
                            "boards:write".to_string(), // Create, update, or delete your public boards
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_BOARDS_BOARD_ID_SECTIONS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE BOARDS_BOARD_ID_SECTIONS in set but failed match against \"{}\"", path, paths::REGEX_BOARDS_BOARD_ID_SECTIONS.as_str())
                    );

                let param_board_id = match percent_encoding::percent_decode(path_params["board_id"].as_bytes()).decode_utf8() {
                    Ok(param_board_id) => match param_board_id.parse::<String>() {
                        Ok(param_board_id) => param_board_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter board_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["board_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.to_raw().await;
                match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_board_section: Option<models::BoardSection> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_board_section) => param_board_section,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter BoardSection - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter BoardSection due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_board_section = match param_board_section {
                                    Some(param_board_section) => param_board_section,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter BoardSection"))
                                                        .expect("Unable to create Bad Request response for missing body parameter BoardSection")),
                                };

                                let result = api_impl.board_sections_create(
                                            param_board_id,
                                            param_board_section,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {:?}", unused_elements).as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                BoardSectionsCreateResponse::Response
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(201).expect("Unable to turn 201 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_CREATE_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardSectionsCreateResponse::InvalidBoardSectionParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_CREATE_INVALID_BOARD_SECTION_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardSectionsCreateResponse::NotAuthorizedToCreateBoardSections
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_CREATE_NOT_AUTHORIZED_TO_CREATE_BOARD_SECTIONS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardSectionsCreateResponse::CouldNotGetExclusiveAccessToTheBoardToCreateANewSection
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(409).expect("Unable to turn 409 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_CREATE_COULD_NOT_GET_EXCLUSIVE_ACCESS_TO_THE_BOARD_TO_CREATE_A_NEW_SECTION"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardSectionsCreateResponse::CouldNotCreateANewBoardSection
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(500).expect("Unable to turn 500 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_CREATE_COULD_NOT_CREATE_A_NEW_BOARD_SECTION"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardSectionsCreateResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_CREATE_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read body parameter BoardSection: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body parameter BoardSection")),
                        }
            },

            // BoardSectionsDelete - DELETE /boards/{board_id}/sections/{section_id}
            &hyper::Method::DELETE if path.matched(paths::ID_BOARDS_BOARD_ID_SECTIONS_SECTION_ID) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "boards:read".to_string(), // See your public boards, including group boards you join
                            "boards:write".to_string(), // Create, update, or delete your public boards
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_BOARDS_BOARD_ID_SECTIONS_SECTION_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE BOARDS_BOARD_ID_SECTIONS_SECTION_ID in set but failed match against \"{}\"", path, paths::REGEX_BOARDS_BOARD_ID_SECTIONS_SECTION_ID.as_str())
                    );

                let param_board_id = match percent_encoding::percent_decode(path_params["board_id"].as_bytes()).decode_utf8() {
                    Ok(param_board_id) => match param_board_id.parse::<String>() {
                        Ok(param_board_id) => param_board_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter board_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["board_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_section_id = match percent_encoding::percent_decode(path_params["section_id"].as_bytes()).decode_utf8() {
                    Ok(param_section_id) => match param_section_id.parse::<String>() {
                        Ok(param_section_id) => param_section_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter section_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["section_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.board_sections_delete(
                                            param_board_id,
                                            param_section_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                BoardSectionsDeleteResponse::BoardSectionDeletedSuccessfully
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(204).expect("Unable to turn 204 into a StatusCode");
                                                },
                                                BoardSectionsDeleteResponse::NotAuthorizedToDeleteBoardSection
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_DELETE_NOT_AUTHORIZED_TO_DELETE_BOARD_SECTION"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardSectionsDeleteResponse::BoardSectionNotFound
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_DELETE_BOARD_SECTION_NOT_FOUND"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardSectionsDeleteResponse::BoardSectionConflict
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(409).expect("Unable to turn 409 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_DELETE_BOARD_SECTION_CONFLICT"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardSectionsDeleteResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_DELETE_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // BoardSectionsList - GET /boards/{board_id}/sections
            &hyper::Method::GET if path.matched(paths::ID_BOARDS_BOARD_ID_SECTIONS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "boards:read".to_string(), // See your public boards, including group boards you join
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_BOARDS_BOARD_ID_SECTIONS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE BOARDS_BOARD_ID_SECTIONS in set but failed match against \"{}\"", path, paths::REGEX_BOARDS_BOARD_ID_SECTIONS.as_str())
                    );

                let param_board_id = match percent_encoding::percent_decode(path_params["board_id"].as_bytes()).decode_utf8() {
                    Ok(param_board_id) => match param_board_id.parse::<String>() {
                        Ok(param_board_id) => param_board_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter board_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["board_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_bookmark = query_params.iter().filter(|e| e.0 == "bookmark").map(|e| e.1.to_owned())
                    .nth(0);
                let param_bookmark = match param_bookmark {
                    Some(param_bookmark) => {
                        let param_bookmark =
                            <String as std::str::FromStr>::from_str
                                (&param_bookmark);
                        match param_bookmark {
                            Ok(param_bookmark) => Some(param_bookmark),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter bookmark - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter bookmark")),
                        }
                    },
                    None => None,
                };
                let param_page_size = query_params.iter().filter(|e| e.0 == "page_size").map(|e| e.1.to_owned())
                    .nth(0);
                let param_page_size = match param_page_size {
                    Some(param_page_size) => {
                        let param_page_size =
                            <i32 as std::str::FromStr>::from_str
                                (&param_page_size);
                        match param_page_size {
                            Ok(param_page_size) => Some(param_page_size),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter page_size - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter page_size")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.board_sections_list(
                                            param_board_id,
                                            param_bookmark,
                                            param_page_size,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                BoardSectionsListResponse::Response
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_LIST_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardSectionsListResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_LIST_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // BoardSectionsListPins - GET /boards/{board_id}/sections/{section_id}/pins
            &hyper::Method::GET if path.matched(paths::ID_BOARDS_BOARD_ID_SECTIONS_SECTION_ID_PINS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "boards:read".to_string(), // See your public boards, including group boards you join
                            "pins:read".to_string(), // See your public Pins
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_BOARDS_BOARD_ID_SECTIONS_SECTION_ID_PINS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE BOARDS_BOARD_ID_SECTIONS_SECTION_ID_PINS in set but failed match against \"{}\"", path, paths::REGEX_BOARDS_BOARD_ID_SECTIONS_SECTION_ID_PINS.as_str())
                    );

                let param_board_id = match percent_encoding::percent_decode(path_params["board_id"].as_bytes()).decode_utf8() {
                    Ok(param_board_id) => match param_board_id.parse::<String>() {
                        Ok(param_board_id) => param_board_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter board_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["board_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_section_id = match percent_encoding::percent_decode(path_params["section_id"].as_bytes()).decode_utf8() {
                    Ok(param_section_id) => match param_section_id.parse::<String>() {
                        Ok(param_section_id) => param_section_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter section_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["section_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_bookmark = query_params.iter().filter(|e| e.0 == "bookmark").map(|e| e.1.to_owned())
                    .nth(0);
                let param_bookmark = match param_bookmark {
                    Some(param_bookmark) => {
                        let param_bookmark =
                            <String as std::str::FromStr>::from_str
                                (&param_bookmark);
                        match param_bookmark {
                            Ok(param_bookmark) => Some(param_bookmark),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter bookmark - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter bookmark")),
                        }
                    },
                    None => None,
                };
                let param_page_size = query_params.iter().filter(|e| e.0 == "page_size").map(|e| e.1.to_owned())
                    .nth(0);
                let param_page_size = match param_page_size {
                    Some(param_page_size) => {
                        let param_page_size =
                            <i32 as std::str::FromStr>::from_str
                                (&param_page_size);
                        match param_page_size {
                            Ok(param_page_size) => Some(param_page_size),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter page_size - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter page_size")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.board_sections_list_pins(
                                            param_board_id,
                                            param_section_id,
                                            param_bookmark,
                                            param_page_size,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                BoardSectionsListPinsResponse::Response
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_LIST_PINS_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardSectionsListPinsResponse::NotAuthorizedToAccessPinsOnBoardSection
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_LIST_PINS_NOT_AUTHORIZED_TO_ACCESS_PINS_ON_BOARD_SECTION"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardSectionsListPinsResponse::BoardOrSectionNotFound
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_LIST_PINS_BOARD_OR_SECTION_NOT_FOUND"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardSectionsListPinsResponse::BoardSectionConflict
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(409).expect("Unable to turn 409 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_LIST_PINS_BOARD_SECTION_CONFLICT"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardSectionsListPinsResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_LIST_PINS_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // BoardSectionsUpdate - PATCH /boards/{board_id}/sections/{section_id}
            &hyper::Method::PATCH if path.matched(paths::ID_BOARDS_BOARD_ID_SECTIONS_SECTION_ID) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "boards:read".to_string(), // See your public boards, including group boards you join
                            "boards:write".to_string(), // Create, update, or delete your public boards
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_BOARDS_BOARD_ID_SECTIONS_SECTION_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE BOARDS_BOARD_ID_SECTIONS_SECTION_ID in set but failed match against \"{}\"", path, paths::REGEX_BOARDS_BOARD_ID_SECTIONS_SECTION_ID.as_str())
                    );

                let param_board_id = match percent_encoding::percent_decode(path_params["board_id"].as_bytes()).decode_utf8() {
                    Ok(param_board_id) => match param_board_id.parse::<String>() {
                        Ok(param_board_id) => param_board_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter board_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["board_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                let param_section_id = match percent_encoding::percent_decode(path_params["section_id"].as_bytes()).decode_utf8() {
                    Ok(param_section_id) => match param_section_id.parse::<String>() {
                        Ok(param_section_id) => param_section_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter section_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["section_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.to_raw().await;
                match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_board_section: Option<models::BoardSection> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_board_section) => param_board_section,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter BoardSection - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter BoardSection due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_board_section = match param_board_section {
                                    Some(param_board_section) => param_board_section,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter BoardSection"))
                                                        .expect("Unable to create Bad Request response for missing body parameter BoardSection")),
                                };

                                let result = api_impl.board_sections_update(
                                            param_board_id,
                                            param_section_id,
                                            param_board_section,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {:?}", unused_elements).as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                BoardSectionsUpdateResponse::Response
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_UPDATE_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardSectionsUpdateResponse::InvalidBoardSectionParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_UPDATE_INVALID_BOARD_SECTION_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardSectionsUpdateResponse::NotAuthorizedToUpdateBoardSection
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_UPDATE_NOT_AUTHORIZED_TO_UPDATE_BOARD_SECTION"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardSectionsUpdateResponse::BoardSectionConflict
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(409).expect("Unable to turn 409 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_UPDATE_BOARD_SECTION_CONFLICT"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardSectionsUpdateResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARD_SECTIONS_UPDATE_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read body parameter BoardSection: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body parameter BoardSection")),
                        }
            },

            // BoardsCreate - POST /boards
            &hyper::Method::POST if path.matched(paths::ID_BOARDS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "boards:read".to_string(), // See your public boards, including group boards you join
                            "boards:write".to_string(), // Create, update, or delete your public boards
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.to_raw().await;
                match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_board: Option<models::Board> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_board) => param_board,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter Board - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter Board due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_board = match param_board {
                                    Some(param_board) => param_board,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter Board"))
                                                        .expect("Unable to create Bad Request response for missing body parameter Board")),
                                };

                                let result = api_impl.boards_create(
                                            param_board,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {:?}", unused_elements).as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                BoardsCreateResponse::Response
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(201).expect("Unable to turn 201 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_CREATE_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardsCreateResponse::TheBoardNameIsInvalidOrDuplicated
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_CREATE_THE_BOARD_NAME_IS_INVALID_OR_DUPLICATED"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardsCreateResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_CREATE_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read body parameter Board: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body parameter Board")),
                        }
            },

            // BoardsDelete - DELETE /boards/{board_id}
            &hyper::Method::DELETE if path.matched(paths::ID_BOARDS_BOARD_ID) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "boards:read".to_string(), // See your public boards, including group boards you join
                            "boards:write".to_string(), // Create, update, or delete your public boards
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_BOARDS_BOARD_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE BOARDS_BOARD_ID in set but failed match against \"{}\"", path, paths::REGEX_BOARDS_BOARD_ID.as_str())
                    );

                let param_board_id = match percent_encoding::percent_decode(path_params["board_id"].as_bytes()).decode_utf8() {
                    Ok(param_board_id) => match param_board_id.parse::<String>() {
                        Ok(param_board_id) => param_board_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter board_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["board_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.boards_delete(
                                            param_board_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                BoardsDeleteResponse::BoardDeletedSuccessfully
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(204).expect("Unable to turn 204 into a StatusCode");
                                                },
                                                BoardsDeleteResponse::NotAuthorizedToDeleteTheBoard
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_DELETE_NOT_AUTHORIZED_TO_DELETE_THE_BOARD"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardsDeleteResponse::BoardNotFound
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_DELETE_BOARD_NOT_FOUND"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardsDeleteResponse::CouldNotGetExclusiveAccessToDeleteTheBoard
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(409).expect("Unable to turn 409 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_DELETE_COULD_NOT_GET_EXCLUSIVE_ACCESS_TO_DELETE_THE_BOARD"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardsDeleteResponse::ThisRequestExceededARateLimit
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(429).expect("Unable to turn 429 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_DELETE_THIS_REQUEST_EXCEEDED_A_RATE_LIMIT"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardsDeleteResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_DELETE_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // BoardsGet - GET /boards/{board_id}
            &hyper::Method::GET if path.matched(paths::ID_BOARDS_BOARD_ID) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "boards:read".to_string(), // See your public boards, including group boards you join
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_BOARDS_BOARD_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE BOARDS_BOARD_ID in set but failed match against \"{}\"", path, paths::REGEX_BOARDS_BOARD_ID.as_str())
                    );

                let param_board_id = match percent_encoding::percent_decode(path_params["board_id"].as_bytes()).decode_utf8() {
                    Ok(param_board_id) => match param_board_id.parse::<String>() {
                        Ok(param_board_id) => param_board_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter board_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["board_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.boards_get(
                                            param_board_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                BoardsGetResponse::Response
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_GET_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardsGetResponse::BoardNotFound
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_GET_BOARD_NOT_FOUND"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardsGetResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_GET_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // BoardsList - GET /boards
            &hyper::Method::GET if path.matched(paths::ID_BOARDS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "boards:read".to_string(), // See your public boards, including group boards you join
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_bookmark = query_params.iter().filter(|e| e.0 == "bookmark").map(|e| e.1.to_owned())
                    .nth(0);
                let param_bookmark = match param_bookmark {
                    Some(param_bookmark) => {
                        let param_bookmark =
                            <String as std::str::FromStr>::from_str
                                (&param_bookmark);
                        match param_bookmark {
                            Ok(param_bookmark) => Some(param_bookmark),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter bookmark - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter bookmark")),
                        }
                    },
                    None => None,
                };
                let param_page_size = query_params.iter().filter(|e| e.0 == "page_size").map(|e| e.1.to_owned())
                    .nth(0);
                let param_page_size = match param_page_size {
                    Some(param_page_size) => {
                        let param_page_size =
                            <i32 as std::str::FromStr>::from_str
                                (&param_page_size);
                        match param_page_size {
                            Ok(param_page_size) => Some(param_page_size),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter page_size - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter page_size")),
                        }
                    },
                    None => None,
                };
                let param_privacy = query_params.iter().filter(|e| e.0 == "privacy").map(|e| e.1.to_owned())
                    .nth(0);
                let param_privacy = match param_privacy {
                    Some(param_privacy) => {
                        let param_privacy =
                            <String as std::str::FromStr>::from_str
                                (&param_privacy);
                        match param_privacy {
                            Ok(param_privacy) => Some(param_privacy),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter privacy - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter privacy")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.boards_list(
                                            param_bookmark,
                                            param_page_size,
                                            param_privacy,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                BoardsListResponse::Response
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_LIST_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardsListResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_LIST_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // BoardsListPins - GET /boards/{board_id}/pins
            &hyper::Method::GET if path.matched(paths::ID_BOARDS_BOARD_ID_PINS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "boards:read".to_string(), // See your public boards, including group boards you join
                            "pins:read".to_string(), // See your public Pins
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_BOARDS_BOARD_ID_PINS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE BOARDS_BOARD_ID_PINS in set but failed match against \"{}\"", path, paths::REGEX_BOARDS_BOARD_ID_PINS.as_str())
                    );

                let param_board_id = match percent_encoding::percent_decode(path_params["board_id"].as_bytes()).decode_utf8() {
                    Ok(param_board_id) => match param_board_id.parse::<String>() {
                        Ok(param_board_id) => param_board_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter board_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["board_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_bookmark = query_params.iter().filter(|e| e.0 == "bookmark").map(|e| e.1.to_owned())
                    .nth(0);
                let param_bookmark = match param_bookmark {
                    Some(param_bookmark) => {
                        let param_bookmark =
                            <String as std::str::FromStr>::from_str
                                (&param_bookmark);
                        match param_bookmark {
                            Ok(param_bookmark) => Some(param_bookmark),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter bookmark - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter bookmark")),
                        }
                    },
                    None => None,
                };
                let param_page_size = query_params.iter().filter(|e| e.0 == "page_size").map(|e| e.1.to_owned())
                    .nth(0);
                let param_page_size = match param_page_size {
                    Some(param_page_size) => {
                        let param_page_size =
                            <i32 as std::str::FromStr>::from_str
                                (&param_page_size);
                        match param_page_size {
                            Ok(param_page_size) => Some(param_page_size),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter page_size - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter page_size")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.boards_list_pins(
                                            param_board_id,
                                            param_bookmark,
                                            param_page_size,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                BoardsListPinsResponse::Response
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_LIST_PINS_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardsListPinsResponse::BoardNotFound
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_LIST_PINS_BOARD_NOT_FOUND"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardsListPinsResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_LIST_PINS_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // BoardsUpdate - PATCH /boards/{board_id}
            &hyper::Method::PATCH if path.matched(paths::ID_BOARDS_BOARD_ID) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "boards:read".to_string(), // See your public boards, including group boards you join
                            "boards:write".to_string(), // Create, update, or delete your public boards
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_BOARDS_BOARD_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE BOARDS_BOARD_ID in set but failed match against \"{}\"", path, paths::REGEX_BOARDS_BOARD_ID.as_str())
                    );

                let param_board_id = match percent_encoding::percent_decode(path_params["board_id"].as_bytes()).decode_utf8() {
                    Ok(param_board_id) => match param_board_id.parse::<String>() {
                        Ok(param_board_id) => param_board_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter board_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["board_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.to_raw().await;
                match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_board_update: Option<models::BoardUpdate> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_board_update) => param_board_update,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter BoardUpdate - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter BoardUpdate due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_board_update = match param_board_update {
                                    Some(param_board_update) => param_board_update,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter BoardUpdate"))
                                                        .expect("Unable to create Bad Request response for missing body parameter BoardUpdate")),
                                };

                                let result = api_impl.boards_update(
                                            param_board_id,
                                            param_board_update,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {:?}", unused_elements).as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                BoardsUpdateResponse::Response
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_UPDATE_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardsUpdateResponse::InvalidBoardParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_UPDATE_INVALID_BOARD_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardsUpdateResponse::NotAuthorizedToUpdateTheBoard
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_UPDATE_NOT_AUTHORIZED_TO_UPDATE_THE_BOARD"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardsUpdateResponse::ThisRequestExceededARateLimit
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(429).expect("Unable to turn 429 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_UPDATE_THIS_REQUEST_EXCEEDED_A_RATE_LIMIT"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                BoardsUpdateResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for BOARDS_UPDATE_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read body parameter BoardUpdate: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body parameter BoardUpdate")),
                        }
            },

            // CatalogsProductGroupsCreate - POST /catalogs/product_groups
            &hyper::Method::POST if path.matched(paths::ID_CATALOGS_PRODUCT_GROUPS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "catalogs:write".to_string(), // Create, update, or delete your catalogs data
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.to_raw().await;
                match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_catalogs_product_group_create_request: Option<models::CatalogsProductGroupCreateRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_catalogs_product_group_create_request) => param_catalogs_product_group_create_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter CatalogsProductGroupCreateRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CatalogsProductGroupCreateRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_catalogs_product_group_create_request = match param_catalogs_product_group_create_request {
                                    Some(param_catalogs_product_group_create_request) => param_catalogs_product_group_create_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter CatalogsProductGroupCreateRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter CatalogsProductGroupCreateRequest")),
                                };

                                let result = api_impl.catalogs_product_groups_create(
                                            param_catalogs_product_group_create_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {:?}", unused_elements).as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CatalogsProductGroupsCreateResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(201).expect("Unable to turn 201 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_CREATE_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsCreateResponse::InvalidBody
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_CREATE_INVALID_BODY"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsCreateResponse::UnauthorizedAccess
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(401).expect("Unable to turn 401 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_CREATE_UNAUTHORIZED_ACCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsCreateResponse::Forbidden
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_CREATE_FORBIDDEN"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsCreateResponse::Conflict
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(409).expect("Unable to turn 409 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_CREATE_CONFLICT"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsCreateResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_CREATE_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read body parameter CatalogsProductGroupCreateRequest: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body parameter CatalogsProductGroupCreateRequest")),
                        }
            },

            // CatalogsProductGroupsDelete - DELETE /catalogs/product_groups/{product_group_id}
            &hyper::Method::DELETE if path.matched(paths::ID_CATALOGS_PRODUCT_GROUPS_PRODUCT_GROUP_ID) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "catalogs:write".to_string(), // Create, update, or delete your catalogs data
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_CATALOGS_PRODUCT_GROUPS_PRODUCT_GROUP_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE CATALOGS_PRODUCT_GROUPS_PRODUCT_GROUP_ID in set but failed match against \"{}\"", path, paths::REGEX_CATALOGS_PRODUCT_GROUPS_PRODUCT_GROUP_ID.as_str())
                    );

                let param_product_group_id = match percent_encoding::percent_decode(path_params["product_group_id"].as_bytes()).decode_utf8() {
                    Ok(param_product_group_id) => match param_product_group_id.parse::<String>() {
                        Ok(param_product_group_id) => param_product_group_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter product_group_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["product_group_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.catalogs_product_groups_delete(
                                            param_product_group_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CatalogsProductGroupsDeleteResponse::CatalogsProductGroupDeletedSuccessfully
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(204).expect("Unable to turn 204 into a StatusCode");
                                                },
                                                CatalogsProductGroupsDeleteResponse::InvalidCatalogsProductGroupIdParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_DELETE_INVALID_CATALOGS_PRODUCT_GROUP_ID_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsDeleteResponse::UnauthorizedAccess
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(401).expect("Unable to turn 401 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_DELETE_UNAUTHORIZED_ACCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsDeleteResponse::Forbidden
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_DELETE_FORBIDDEN"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsDeleteResponse::CatalogsProductGroupNotFound
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_DELETE_CATALOGS_PRODUCT_GROUP_NOT_FOUND"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsDeleteResponse::Conflict
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(409).expect("Unable to turn 409 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_DELETE_CONFLICT"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsDeleteResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_DELETE_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CatalogsProductGroupsList - GET /catalogs/product_groups
            &hyper::Method::GET if path.matched(paths::ID_CATALOGS_PRODUCT_GROUPS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "catalogs:read".to_string(), // See all of your catalogs data
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_feed_id = query_params.iter().filter(|e| e.0 == "feed_id").map(|e| e.1.to_owned())
                    .nth(0);
                let param_feed_id = match param_feed_id {
                    Some(param_feed_id) => {
                        let param_feed_id =
                            <String as std::str::FromStr>::from_str
                                (&param_feed_id);
                        match param_feed_id {
                            Ok(param_feed_id) => Some(param_feed_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter feed_id - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter feed_id")),
                        }
                    },
                    None => None,
                };
                let param_feed_id = match param_feed_id {
                    Some(param_feed_id) => param_feed_id,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter feed_id"))
                        .expect("Unable to create Bad Request response for missing query parameter feed_id")),
                };
                let param_bookmark = query_params.iter().filter(|e| e.0 == "bookmark").map(|e| e.1.to_owned())
                    .nth(0);
                let param_bookmark = match param_bookmark {
                    Some(param_bookmark) => {
                        let param_bookmark =
                            <String as std::str::FromStr>::from_str
                                (&param_bookmark);
                        match param_bookmark {
                            Ok(param_bookmark) => Some(param_bookmark),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter bookmark - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter bookmark")),
                        }
                    },
                    None => None,
                };
                let param_page_size = query_params.iter().filter(|e| e.0 == "page_size").map(|e| e.1.to_owned())
                    .nth(0);
                let param_page_size = match param_page_size {
                    Some(param_page_size) => {
                        let param_page_size =
                            <i32 as std::str::FromStr>::from_str
                                (&param_page_size);
                        match param_page_size {
                            Ok(param_page_size) => Some(param_page_size),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter page_size - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter page_size")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.catalogs_product_groups_list(
                                            param_feed_id,
                                            param_bookmark,
                                            param_page_size,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CatalogsProductGroupsListResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_LIST_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsListResponse::InvalidFeedParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_LIST_INVALID_FEED_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsListResponse::UnauthorizedAccess
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(401).expect("Unable to turn 401 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_LIST_UNAUTHORIZED_ACCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsListResponse::Forbidden
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_LIST_FORBIDDEN"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsListResponse::DataFeedNotFound
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_LIST_DATA_FEED_NOT_FOUND"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsListResponse::Conflict
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(409).expect("Unable to turn 409 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_LIST_CONFLICT"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsListResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_LIST_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // CatalogsProductGroupsUpdate - PATCH /catalogs/product_groups/{product_group_id}
            &hyper::Method::PATCH if path.matched(paths::ID_CATALOGS_PRODUCT_GROUPS_PRODUCT_GROUP_ID) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "catalogs:write".to_string(), // Create, update, or delete your catalogs data
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_CATALOGS_PRODUCT_GROUPS_PRODUCT_GROUP_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE CATALOGS_PRODUCT_GROUPS_PRODUCT_GROUP_ID in set but failed match against \"{}\"", path, paths::REGEX_CATALOGS_PRODUCT_GROUPS_PRODUCT_GROUP_ID.as_str())
                    );

                let param_product_group_id = match percent_encoding::percent_decode(path_params["product_group_id"].as_bytes()).decode_utf8() {
                    Ok(param_product_group_id) => match param_product_group_id.parse::<String>() {
                        Ok(param_product_group_id) => param_product_group_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter product_group_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["product_group_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.to_raw().await;
                match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_catalogs_product_group_update_request: Option<models::CatalogsProductGroupUpdateRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_catalogs_product_group_update_request) => param_catalogs_product_group_update_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter CatalogsProductGroupUpdateRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CatalogsProductGroupUpdateRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_catalogs_product_group_update_request = match param_catalogs_product_group_update_request {
                                    Some(param_catalogs_product_group_update_request) => param_catalogs_product_group_update_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter CatalogsProductGroupUpdateRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter CatalogsProductGroupUpdateRequest")),
                                };

                                let result = api_impl.catalogs_product_groups_update(
                                            param_product_group_id,
                                            param_catalogs_product_group_update_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {:?}", unused_elements).as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                CatalogsProductGroupsUpdateResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_UPDATE_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsUpdateResponse::InvalidParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_UPDATE_INVALID_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsUpdateResponse::UnauthorizedAccess
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(401).expect("Unable to turn 401 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_UPDATE_UNAUTHORIZED_ACCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsUpdateResponse::CatalogsProductGroupNotFound
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_UPDATE_CATALOGS_PRODUCT_GROUP_NOT_FOUND"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsUpdateResponse::Conflict
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(409).expect("Unable to turn 409 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_UPDATE_CONFLICT"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                CatalogsProductGroupsUpdateResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for CATALOGS_PRODUCT_GROUPS_UPDATE_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read body parameter CatalogsProductGroupUpdateRequest: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body parameter CatalogsProductGroupUpdateRequest")),
                        }
            },

            // FeedProcessingResultsList - GET /catalogs/feeds/{feed_id}/processing_results
            &hyper::Method::GET if path.matched(paths::ID_CATALOGS_FEEDS_FEED_ID_PROCESSING_RESULTS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "catalogs:read".to_string(), // See all of your catalogs data
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_CATALOGS_FEEDS_FEED_ID_PROCESSING_RESULTS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE CATALOGS_FEEDS_FEED_ID_PROCESSING_RESULTS in set but failed match against \"{}\"", path, paths::REGEX_CATALOGS_FEEDS_FEED_ID_PROCESSING_RESULTS.as_str())
                    );

                let param_feed_id = match percent_encoding::percent_decode(path_params["feed_id"].as_bytes()).decode_utf8() {
                    Ok(param_feed_id) => match param_feed_id.parse::<String>() {
                        Ok(param_feed_id) => param_feed_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter feed_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["feed_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_bookmark = query_params.iter().filter(|e| e.0 == "bookmark").map(|e| e.1.to_owned())
                    .nth(0);
                let param_bookmark = match param_bookmark {
                    Some(param_bookmark) => {
                        let param_bookmark =
                            <String as std::str::FromStr>::from_str
                                (&param_bookmark);
                        match param_bookmark {
                            Ok(param_bookmark) => Some(param_bookmark),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter bookmark - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter bookmark")),
                        }
                    },
                    None => None,
                };
                let param_page_size = query_params.iter().filter(|e| e.0 == "page_size").map(|e| e.1.to_owned())
                    .nth(0);
                let param_page_size = match param_page_size {
                    Some(param_page_size) => {
                        let param_page_size =
                            <i32 as std::str::FromStr>::from_str
                                (&param_page_size);
                        match param_page_size {
                            Ok(param_page_size) => Some(param_page_size),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter page_size - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter page_size")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.feed_processing_results_list(
                                            param_feed_id,
                                            param_bookmark,
                                            param_page_size,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                FeedProcessingResultsListResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEED_PROCESSING_RESULTS_LIST_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedProcessingResultsListResponse::InvalidParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEED_PROCESSING_RESULTS_LIST_INVALID_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedProcessingResultsListResponse::UnauthorizedAccess
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(401).expect("Unable to turn 401 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEED_PROCESSING_RESULTS_LIST_UNAUTHORIZED_ACCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedProcessingResultsListResponse::FeedNotFound
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEED_PROCESSING_RESULTS_LIST_FEED_NOT_FOUND"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedProcessingResultsListResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEED_PROCESSING_RESULTS_LIST_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // FeedsCreate - POST /catalogs/feeds
            &hyper::Method::POST if path.matched(paths::ID_CATALOGS_FEEDS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "catalogs:read".to_string(), // See all of your catalogs data
                            "catalogs:write".to_string(), // Create, update, or delete your catalogs data
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.to_raw().await;
                match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_catalogs_feeds_create_request: Option<models::CatalogsFeedsCreateRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_catalogs_feeds_create_request) => param_catalogs_feeds_create_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter CatalogsFeedsCreateRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CatalogsFeedsCreateRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_catalogs_feeds_create_request = match param_catalogs_feeds_create_request {
                                    Some(param_catalogs_feeds_create_request) => param_catalogs_feeds_create_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter CatalogsFeedsCreateRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter CatalogsFeedsCreateRequest")),
                                };

                                let result = api_impl.feeds_create(
                                            param_catalogs_feeds_create_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {:?}", unused_elements).as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                FeedsCreateResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(201).expect("Unable to turn 201 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_CREATE_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsCreateResponse::InvalidFeedParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_CREATE_INVALID_FEED_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsCreateResponse::UnauthorizedAccess
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(401).expect("Unable to turn 401 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_CREATE_UNAUTHORIZED_ACCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsCreateResponse::BusinessAccountRequired
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_CREATE_BUSINESS_ACCOUNT_REQUIRED"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsCreateResponse::UserWebsiteRequired
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(409).expect("Unable to turn 409 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_CREATE_USER_WEBSITE_REQUIRED"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsCreateResponse::UniqueFeedNameIsRequired
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(422).expect("Unable to turn 422 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_CREATE_UNIQUE_FEED_NAME_IS_REQUIRED"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsCreateResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_CREATE_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read body parameter CatalogsFeedsCreateRequest: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body parameter CatalogsFeedsCreateRequest")),
                        }
            },

            // FeedsDelete - DELETE /catalogs/feeds/{feed_id}
            &hyper::Method::DELETE if path.matched(paths::ID_CATALOGS_FEEDS_FEED_ID) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "catalogs:read".to_string(), // See all of your catalogs data
                            "catalogs:write".to_string(), // Create, update, or delete your catalogs data
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_CATALOGS_FEEDS_FEED_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE CATALOGS_FEEDS_FEED_ID in set but failed match against \"{}\"", path, paths::REGEX_CATALOGS_FEEDS_FEED_ID.as_str())
                    );

                let param_feed_id = match percent_encoding::percent_decode(path_params["feed_id"].as_bytes()).decode_utf8() {
                    Ok(param_feed_id) => match param_feed_id.parse::<String>() {
                        Ok(param_feed_id) => param_feed_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter feed_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["feed_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.feeds_delete(
                                            param_feed_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                FeedsDeleteResponse::FeedDeletedSuccessfully
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(204).expect("Unable to turn 204 into a StatusCode");
                                                },
                                                FeedsDeleteResponse::InvalidFeedParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_DELETE_INVALID_FEED_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsDeleteResponse::Forbidden
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_DELETE_FORBIDDEN"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsDeleteResponse::DataFeedNotFound
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_DELETE_DATA_FEED_NOT_FOUND"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsDeleteResponse::Conflict
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(409).expect("Unable to turn 409 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_DELETE_CONFLICT"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsDeleteResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_DELETE_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // FeedsGet - GET /catalogs/feeds/{feed_id}
            &hyper::Method::GET if path.matched(paths::ID_CATALOGS_FEEDS_FEED_ID) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "catalogs:read".to_string(), // See all of your catalogs data
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_CATALOGS_FEEDS_FEED_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE CATALOGS_FEEDS_FEED_ID in set but failed match against \"{}\"", path, paths::REGEX_CATALOGS_FEEDS_FEED_ID.as_str())
                    );

                let param_feed_id = match percent_encoding::percent_decode(path_params["feed_id"].as_bytes()).decode_utf8() {
                    Ok(param_feed_id) => match param_feed_id.parse::<String>() {
                        Ok(param_feed_id) => param_feed_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter feed_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["feed_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.feeds_get(
                                            param_feed_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                FeedsGetResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_GET_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsGetResponse::InvalidFeedParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_GET_INVALID_FEED_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsGetResponse::UnauthorizedAccess
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(401).expect("Unable to turn 401 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_GET_UNAUTHORIZED_ACCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsGetResponse::DataFeedNotFound
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_GET_DATA_FEED_NOT_FOUND"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsGetResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_GET_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // FeedsList - GET /catalogs/feeds
            &hyper::Method::GET if path.matched(paths::ID_CATALOGS_FEEDS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "catalogs:read".to_string(), // See all of your catalogs data
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_bookmark = query_params.iter().filter(|e| e.0 == "bookmark").map(|e| e.1.to_owned())
                    .nth(0);
                let param_bookmark = match param_bookmark {
                    Some(param_bookmark) => {
                        let param_bookmark =
                            <String as std::str::FromStr>::from_str
                                (&param_bookmark);
                        match param_bookmark {
                            Ok(param_bookmark) => Some(param_bookmark),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter bookmark - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter bookmark")),
                        }
                    },
                    None => None,
                };
                let param_page_size = query_params.iter().filter(|e| e.0 == "page_size").map(|e| e.1.to_owned())
                    .nth(0);
                let param_page_size = match param_page_size {
                    Some(param_page_size) => {
                        let param_page_size =
                            <i32 as std::str::FromStr>::from_str
                                (&param_page_size);
                        match param_page_size {
                            Ok(param_page_size) => Some(param_page_size),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter page_size - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter page_size")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.feeds_list(
                                            param_bookmark,
                                            param_page_size,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                FeedsListResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_LIST_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsListResponse::InvalidParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_LIST_INVALID_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsListResponse::UnauthorizedAccess
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(401).expect("Unable to turn 401 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_LIST_UNAUTHORIZED_ACCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsListResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_LIST_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // FeedsUpdate - PATCH /catalogs/feeds/{feed_id}
            &hyper::Method::PATCH if path.matched(paths::ID_CATALOGS_FEEDS_FEED_ID) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "catalogs:read".to_string(), // See all of your catalogs data
                            "catalogs:write".to_string(), // Create, update, or delete your catalogs data
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_CATALOGS_FEEDS_FEED_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE CATALOGS_FEEDS_FEED_ID in set but failed match against \"{}\"", path, paths::REGEX_CATALOGS_FEEDS_FEED_ID.as_str())
                    );

                let param_feed_id = match percent_encoding::percent_decode(path_params["feed_id"].as_bytes()).decode_utf8() {
                    Ok(param_feed_id) => match param_feed_id.parse::<String>() {
                        Ok(param_feed_id) => param_feed_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter feed_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["feed_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.to_raw().await;
                match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_catalogs_feeds_update_request: Option<models::CatalogsFeedsUpdateRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_catalogs_feeds_update_request) => param_catalogs_feeds_update_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter CatalogsFeedsUpdateRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CatalogsFeedsUpdateRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_catalogs_feeds_update_request = match param_catalogs_feeds_update_request {
                                    Some(param_catalogs_feeds_update_request) => param_catalogs_feeds_update_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter CatalogsFeedsUpdateRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter CatalogsFeedsUpdateRequest")),
                                };

                                let result = api_impl.feeds_update(
                                            param_feed_id,
                                            param_catalogs_feeds_update_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {:?}", unused_elements).as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                FeedsUpdateResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_UPDATE_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsUpdateResponse::InvalidFeedParameters
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_UPDATE_INVALID_FEED_PARAMETERS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsUpdateResponse::Forbidden
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_UPDATE_FORBIDDEN"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsUpdateResponse::DataFeedNotFound
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_UPDATE_DATA_FEED_NOT_FOUND"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                FeedsUpdateResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for FEEDS_UPDATE_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read body parameter CatalogsFeedsUpdateRequest: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body parameter CatalogsFeedsUpdateRequest")),
                        }
            },

            // ItemsBatchGet - GET /catalogs/items/batch/{batch_id}
            &hyper::Method::GET if path.matched(paths::ID_CATALOGS_ITEMS_BATCH_BATCH_ID) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "catalogs:read".to_string(), // See all of your catalogs data
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_CATALOGS_ITEMS_BATCH_BATCH_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE CATALOGS_ITEMS_BATCH_BATCH_ID in set but failed match against \"{}\"", path, paths::REGEX_CATALOGS_ITEMS_BATCH_BATCH_ID.as_str())
                    );

                let param_batch_id = match percent_encoding::percent_decode(path_params["batch_id"].as_bytes()).decode_utf8() {
                    Ok(param_batch_id) => match param_batch_id.parse::<String>() {
                        Ok(param_batch_id) => param_batch_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter batch_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["batch_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.items_batch_get(
                                            param_batch_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ItemsBatchGetResponse::ResponseContainingTheRequestedCatalogsItemsBatch
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ITEMS_BATCH_GET_RESPONSE_CONTAINING_THE_REQUESTED_CATALOGS_ITEMS_BATCH"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                ItemsBatchGetResponse::NotAuthorizedToAccessCatalogsItemsBatch
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(401).expect("Unable to turn 401 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ITEMS_BATCH_GET_NOT_AUTHORIZED_TO_ACCESS_CATALOGS_ITEMS_BATCH"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                ItemsBatchGetResponse::NotAuthorizedToAccessCatalogsItemsBatch_2
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ITEMS_BATCH_GET_NOT_AUTHORIZED_TO_ACCESS_CATALOGS_ITEMS_BATCH_2"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                ItemsBatchGetResponse::CatalogsItemsBatchNotFound
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ITEMS_BATCH_GET_CATALOGS_ITEMS_BATCH_NOT_FOUND"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                ItemsBatchGetResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ITEMS_BATCH_GET_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // ItemsBatchPost - POST /catalogs/items/batch
            &hyper::Method::POST if path.matched(paths::ID_CATALOGS_ITEMS_BATCH) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "catalogs:read".to_string(), // See all of your catalogs data
                            "catalogs:write".to_string(), // Create, update, or delete your catalogs data
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.to_raw().await;
                match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_catalogs_items_batch_request: Option<models::CatalogsItemsBatchRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_catalogs_items_batch_request) => param_catalogs_items_batch_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter CatalogsItemsBatchRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter CatalogsItemsBatchRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_catalogs_items_batch_request = match param_catalogs_items_batch_request {
                                    Some(param_catalogs_items_batch_request) => param_catalogs_items_batch_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter CatalogsItemsBatchRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter CatalogsItemsBatchRequest")),
                                };

                                let result = api_impl.items_batch_post(
                                            param_catalogs_items_batch_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {:?}", unused_elements).as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ItemsBatchPostResponse::ResponseContainingTheRequestedCatalogsItemsBatch
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ITEMS_BATCH_POST_RESPONSE_CONTAINING_THE_REQUESTED_CATALOGS_ITEMS_BATCH"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                ItemsBatchPostResponse::NotAuthorizedToPostCatalogsItems
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(401).expect("Unable to turn 401 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ITEMS_BATCH_POST_NOT_AUTHORIZED_TO_POST_CATALOGS_ITEMS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                ItemsBatchPostResponse::NotAuthorizedToPostCatalogsItems_2
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ITEMS_BATCH_POST_NOT_AUTHORIZED_TO_POST_CATALOGS_ITEMS_2"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                ItemsBatchPostResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ITEMS_BATCH_POST_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read body parameter CatalogsItemsBatchRequest: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body parameter CatalogsItemsBatchRequest")),
                        }
            },

            // ItemsGet - GET /catalogs/items
            &hyper::Method::GET if path.matched(paths::ID_CATALOGS_ITEMS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "catalogs:read".to_string(), // See all of your catalogs data
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_country = query_params.iter().filter(|e| e.0 == "country").map(|e| e.1.to_owned())
                    .nth(0);
                let param_country = match param_country {
                    Some(param_country) => {
                        let param_country =
                            <String as std::str::FromStr>::from_str
                                (&param_country);
                        match param_country {
                            Ok(param_country) => Some(param_country),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter country - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter country")),
                        }
                    },
                    None => None,
                };
                let param_country = match param_country {
                    Some(param_country) => param_country,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter country"))
                        .expect("Unable to create Bad Request response for missing query parameter country")),
                };
                let param_item_ids = query_params.iter().filter(|e| e.0 == "item_ids").map(|e| e.1.to_owned())
                    .filter_map(|param_item_ids| param_item_ids.parse().ok())
                    .collect::<Vec<_>>();
                let param_language = query_params.iter().filter(|e| e.0 == "language").map(|e| e.1.to_owned())
                    .nth(0);
                let param_language = match param_language {
                    Some(param_language) => {
                        let param_language =
                            <String as std::str::FromStr>::from_str
                                (&param_language);
                        match param_language {
                            Ok(param_language) => Some(param_language),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter language - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter language")),
                        }
                    },
                    None => None,
                };
                let param_language = match param_language {
                    Some(param_language) => param_language,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter language"))
                        .expect("Unable to create Bad Request response for missing query parameter language")),
                };

                                let result = api_impl.items_get(
                                            param_country,
                                            param_item_ids.as_ref(),
                                            param_language,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                ItemsGetResponse::ResponseContainingTheRequestedCatalogsItems
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ITEMS_GET_RESPONSE_CONTAINING_THE_REQUESTED_CATALOGS_ITEMS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                ItemsGetResponse::NotAuthorizedToAccessCatalogsItems
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(401).expect("Unable to turn 401 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ITEMS_GET_NOT_AUTHORIZED_TO_ACCESS_CATALOGS_ITEMS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                ItemsGetResponse::NotAuthorizedToAccessCatalogsItems_2
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ITEMS_GET_NOT_AUTHORIZED_TO_ACCESS_CATALOGS_ITEMS_2"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                ItemsGetResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for ITEMS_GET_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MediaCreate - POST /media
            &hyper::Method::POST if path.matched(paths::ID_MEDIA) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "pins:read".to_string(), // See your public Pins
                            "pins:write".to_string(), // Create, update, or delete your public Pins
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.to_raw().await;
                match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_media_upload_request: Option<models::MediaUploadRequest> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_media_upload_request) => param_media_upload_request,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter MediaUploadRequest - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter MediaUploadRequest due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_media_upload_request = match param_media_upload_request {
                                    Some(param_media_upload_request) => param_media_upload_request,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter MediaUploadRequest"))
                                                        .expect("Unable to create Bad Request response for missing body parameter MediaUploadRequest")),
                                };

                                let result = api_impl.media_create(
                                            param_media_upload_request,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {:?}", unused_elements).as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MediaCreateResponse::Response
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(201).expect("Unable to turn 201 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for MEDIA_CREATE_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                MediaCreateResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for MEDIA_CREATE_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read body parameter MediaUploadRequest: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body parameter MediaUploadRequest")),
                        }
            },

            // MediaGet - GET /media/{media_id}
            &hyper::Method::GET if path.matched(paths::ID_MEDIA_MEDIA_ID) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "pins:read".to_string(), // See your public Pins
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_MEDIA_MEDIA_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE MEDIA_MEDIA_ID in set but failed match against \"{}\"", path, paths::REGEX_MEDIA_MEDIA_ID.as_str())
                    );

                let param_media_id = match percent_encoding::percent_decode(path_params["media_id"].as_bytes()).decode_utf8() {
                    Ok(param_media_id) => match param_media_id.parse::<String>() {
                        Ok(param_media_id) => param_media_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter media_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["media_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.media_get(
                                            param_media_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MediaGetResponse::Response
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for MEDIA_GET_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                MediaGetResponse::MediaUploadNotFound
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for MEDIA_GET_MEDIA_UPLOAD_NOT_FOUND"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                MediaGetResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for MEDIA_GET_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // MediaList - GET /media
            &hyper::Method::GET if path.matched(paths::ID_MEDIA) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "pins:read".to_string(), // See your public Pins
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_bookmark = query_params.iter().filter(|e| e.0 == "bookmark").map(|e| e.1.to_owned())
                    .nth(0);
                let param_bookmark = match param_bookmark {
                    Some(param_bookmark) => {
                        let param_bookmark =
                            <String as std::str::FromStr>::from_str
                                (&param_bookmark);
                        match param_bookmark {
                            Ok(param_bookmark) => Some(param_bookmark),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter bookmark - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter bookmark")),
                        }
                    },
                    None => None,
                };
                let param_page_size = query_params.iter().filter(|e| e.0 == "page_size").map(|e| e.1.to_owned())
                    .nth(0);
                let param_page_size = match param_page_size {
                    Some(param_page_size) => {
                        let param_page_size =
                            <i32 as std::str::FromStr>::from_str
                                (&param_page_size);
                        match param_page_size {
                            Ok(param_page_size) => Some(param_page_size),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter page_size - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter page_size")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.media_list(
                                            param_bookmark,
                                            param_page_size,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                MediaListResponse::Response
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for MEDIA_LIST_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                MediaListResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for MEDIA_LIST_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // OauthToken - POST /oauth/token
            &hyper::Method::POST if path.matched(paths::ID_OAUTH_TOKEN) => {
                                // Form parameters
                                let param_grant_type = "grant_type_example".to_string();

                                let result = api_impl.oauth_token(
                                            param_grant_type,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                OauthTokenResponse::Response
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for OAUTH_TOKEN_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                OauthTokenResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for OAUTH_TOKEN_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PinsAnalytics - GET /pins/{pin_id}/analytics
            &hyper::Method::GET if path.matched(paths::ID_PINS_PIN_ID_ANALYTICS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "boards:read".to_string(), // See your public boards, including group boards you join
                            "pins:read".to_string(), // See your public Pins
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_PINS_PIN_ID_ANALYTICS
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE PINS_PIN_ID_ANALYTICS in set but failed match against \"{}\"", path, paths::REGEX_PINS_PIN_ID_ANALYTICS.as_str())
                    );

                let param_pin_id = match percent_encoding::percent_decode(path_params["pin_id"].as_bytes()).decode_utf8() {
                    Ok(param_pin_id) => match param_pin_id.parse::<String>() {
                        Ok(param_pin_id) => param_pin_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter pin_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["pin_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_start_date = query_params.iter().filter(|e| e.0 == "start_date").map(|e| e.1.to_owned())
                    .nth(0);
                let param_start_date = match param_start_date {
                    Some(param_start_date) => {
                        let param_start_date =
                            <chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str
                                (&param_start_date);
                        match param_start_date {
                            Ok(param_start_date) => Some(param_start_date),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter start_date - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter start_date")),
                        }
                    },
                    None => None,
                };
                let param_start_date = match param_start_date {
                    Some(param_start_date) => param_start_date,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter start_date"))
                        .expect("Unable to create Bad Request response for missing query parameter start_date")),
                };
                let param_end_date = query_params.iter().filter(|e| e.0 == "end_date").map(|e| e.1.to_owned())
                    .nth(0);
                let param_end_date = match param_end_date {
                    Some(param_end_date) => {
                        let param_end_date =
                            <chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str
                                (&param_end_date);
                        match param_end_date {
                            Ok(param_end_date) => Some(param_end_date),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter end_date - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter end_date")),
                        }
                    },
                    None => None,
                };
                let param_end_date = match param_end_date {
                    Some(param_end_date) => param_end_date,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter end_date"))
                        .expect("Unable to create Bad Request response for missing query parameter end_date")),
                };
                let param_app_types = query_params.iter().filter(|e| e.0 == "app_types").map(|e| e.1.to_owned())
                    .nth(0);
                let param_app_types = match param_app_types {
                    Some(param_app_types) => {
                        let param_app_types =
                            <String as std::str::FromStr>::from_str
                                (&param_app_types);
                        match param_app_types {
                            Ok(param_app_types) => Some(param_app_types),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter app_types - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter app_types")),
                        }
                    },
                    None => None,
                };
                let param_metric_types = query_params.iter().filter(|e| e.0 == "metric_types").map(|e| e.1.to_owned())
                    .filter_map(|param_metric_types| param_metric_types.parse().ok())
                    .collect::<Vec<_>>();
                let param_split_field = query_params.iter().filter(|e| e.0 == "split_field").map(|e| e.1.to_owned())
                    .nth(0);
                let param_split_field = match param_split_field {
                    Some(param_split_field) => {
                        let param_split_field =
                            <String as std::str::FromStr>::from_str
                                (&param_split_field);
                        match param_split_field {
                            Ok(param_split_field) => Some(param_split_field),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter split_field - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter split_field")),
                        }
                    },
                    None => None,
                };
                let param_ad_account_id = query_params.iter().filter(|e| e.0 == "ad_account_id").map(|e| e.1.to_owned())
                    .nth(0);
                let param_ad_account_id = match param_ad_account_id {
                    Some(param_ad_account_id) => {
                        let param_ad_account_id =
                            <String as std::str::FromStr>::from_str
                                (&param_ad_account_id);
                        match param_ad_account_id {
                            Ok(param_ad_account_id) => Some(param_ad_account_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter ad_account_id - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter ad_account_id")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.pins_analytics(
                                            param_pin_id,
                                            param_start_date,
                                            param_end_date,
                                            param_metric_types.as_ref(),
                                            param_app_types,
                                            param_split_field,
                                            param_ad_account_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PinsAnalyticsResponse::Response
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for PINS_ANALYTICS_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                PinsAnalyticsResponse::NotAuthorizedToAccessBoardOrPin
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for PINS_ANALYTICS_NOT_AUTHORIZED_TO_ACCESS_BOARD_OR_PIN"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                PinsAnalyticsResponse::PinNotFound
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for PINS_ANALYTICS_PIN_NOT_FOUND"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                PinsAnalyticsResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for PINS_ANALYTICS_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PinsCreate - POST /pins
            &hyper::Method::POST if path.matched(paths::ID_PINS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "boards:read".to_string(), // See your public boards, including group boards you join
                            "boards:write".to_string(), // Create, update, or delete your public boards
                            "pins:read".to_string(), // See your public Pins
                            "pins:write".to_string(), // Create, update, or delete your public Pins
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Body parameters (note that non-required body parameters will ignore garbage
                // values, rather than causing a 400 response). Produce warning header and logs for
                // any unused fields.
                let result = body.to_raw().await;
                match result {
                            Ok(body) => {
                                let mut unused_elements = Vec::new();
                                let param_pin: Option<models::Pin> = if !body.is_empty() {
                                    let deserializer = &mut serde_json::Deserializer::from_slice(&*body);
                                    match serde_ignored::deserialize(deserializer, |path| {
                                            warn!("Ignoring unknown field in body: {}", path);
                                            unused_elements.push(path.to_string());
                                    }) {
                                        Ok(param_pin) => param_pin,
                                        Err(e) => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from(format!("Couldn't parse body parameter Pin - doesn't match schema: {}", e)))
                                                        .expect("Unable to create Bad Request response for invalid body parameter Pin due to schema")),
                                    }
                                } else {
                                    None
                                };
                                let param_pin = match param_pin {
                                    Some(param_pin) => param_pin,
                                    None => return Ok(Response::builder()
                                                        .status(StatusCode::BAD_REQUEST)
                                                        .body(Body::from("Missing required body parameter Pin"))
                                                        .expect("Unable to create Bad Request response for missing body parameter Pin")),
                                };

                                let result = api_impl.pins_create(
                                            param_pin,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        if !unused_elements.is_empty() {
                                            response.headers_mut().insert(
                                                HeaderName::from_static("warning"),
                                                HeaderValue::from_str(format!("Ignoring unknown fields in body: {:?}", unused_elements).as_str())
                                                    .expect("Unable to create Warning header value"));
                                        }

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PinsCreateResponse::SuccessfulPinCreation
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(201).expect("Unable to turn 201 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for PINS_CREATE_SUCCESSFUL_PIN_CREATION"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                PinsCreateResponse::InvalidPinParametersResponse
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(400).expect("Unable to turn 400 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for PINS_CREATE_INVALID_PIN_PARAMETERS_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                PinsCreateResponse::ThePin
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for PINS_CREATE_THE_PIN"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                PinsCreateResponse::BoardOrSectionNotFound
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for PINS_CREATE_BOARD_OR_SECTION_NOT_FOUND"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                PinsCreateResponse::ThisRequestExceededARateLimit
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(429).expect("Unable to turn 429 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for PINS_CREATE_THIS_REQUEST_EXCEEDED_A_RATE_LIMIT"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                PinsCreateResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for PINS_CREATE_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
                            },
                            Err(e) => Ok(Response::builder()
                                                .status(StatusCode::BAD_REQUEST)
                                                .body(Body::from(format!("Couldn't read body parameter Pin: {}", e)))
                                                .expect("Unable to create Bad Request response due to unable to read body parameter Pin")),
                        }
            },

            // PinsDelete - DELETE /pins/{pin_id}
            &hyper::Method::DELETE if path.matched(paths::ID_PINS_PIN_ID) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "boards:read".to_string(), // See your public boards, including group boards you join
                            "boards:write".to_string(), // Create, update, or delete your public boards
                            "pins:read".to_string(), // See your public Pins
                            "pins:write".to_string(), // Create, update, or delete your public Pins
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_PINS_PIN_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE PINS_PIN_ID in set but failed match against \"{}\"", path, paths::REGEX_PINS_PIN_ID.as_str())
                    );

                let param_pin_id = match percent_encoding::percent_decode(path_params["pin_id"].as_bytes()).decode_utf8() {
                    Ok(param_pin_id) => match param_pin_id.parse::<String>() {
                        Ok(param_pin_id) => param_pin_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter pin_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["pin_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                                let result = api_impl.pins_delete(
                                            param_pin_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PinsDeleteResponse::SuccessfullyDeletedPin
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(204).expect("Unable to turn 204 into a StatusCode");
                                                },
                                                PinsDeleteResponse::NotAuthorizedToAccessBoardOrPin
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for PINS_DELETE_NOT_AUTHORIZED_TO_ACCESS_BOARD_OR_PIN"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                PinsDeleteResponse::PinNotFound
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for PINS_DELETE_PIN_NOT_FOUND"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                PinsDeleteResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for PINS_DELETE_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // PinsGet - GET /pins/{pin_id}
            &hyper::Method::GET if path.matched(paths::ID_PINS_PIN_ID) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "boards:read".to_string(), // See your public boards, including group boards you join
                            "pins:read".to_string(), // See your public Pins
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Path parameters
                let path: &str = &uri.path().to_string();
                let path_params =
                    paths::REGEX_PINS_PIN_ID
                    .captures(&path)
                    .unwrap_or_else(||
                        panic!("Path {} matched RE PINS_PIN_ID in set but failed match against \"{}\"", path, paths::REGEX_PINS_PIN_ID.as_str())
                    );

                let param_pin_id = match percent_encoding::percent_decode(path_params["pin_id"].as_bytes()).decode_utf8() {
                    Ok(param_pin_id) => match param_pin_id.parse::<String>() {
                        Ok(param_pin_id) => param_pin_id,
                        Err(e) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't parse path parameter pin_id: {}", e)))
                                        .expect("Unable to create Bad Request response for invalid path parameter")),
                    },
                    Err(_) => return Ok(Response::builder()
                                        .status(StatusCode::BAD_REQUEST)
                                        .body(Body::from(format!("Couldn't percent-decode path parameter as UTF-8: {}", &path_params["pin_id"])))
                                        .expect("Unable to create Bad Request response for invalid percent decode"))
                };

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_ad_account_id = query_params.iter().filter(|e| e.0 == "ad_account_id").map(|e| e.1.to_owned())
                    .nth(0);
                let param_ad_account_id = match param_ad_account_id {
                    Some(param_ad_account_id) => {
                        let param_ad_account_id =
                            <String as std::str::FromStr>::from_str
                                (&param_ad_account_id);
                        match param_ad_account_id {
                            Ok(param_ad_account_id) => Some(param_ad_account_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter ad_account_id - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter ad_account_id")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.pins_get(
                                            param_pin_id,
                                            param_ad_account_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                PinsGetResponse::Response
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for PINS_GET_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                PinsGetResponse::NotAuthorizedToAccessBoardOrPin
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for PINS_GET_NOT_AUTHORIZED_TO_ACCESS_BOARD_OR_PIN"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                PinsGetResponse::PinNotFound
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(404).expect("Unable to turn 404 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for PINS_GET_PIN_NOT_FOUND"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                PinsGetResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for PINS_GET_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UserAccountAnalytics - GET /user_account/analytics
            &hyper::Method::GET if path.matched(paths::ID_USER_ACCOUNT_ANALYTICS) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "user_accounts:read".to_string(), // See your user accounts
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_start_date = query_params.iter().filter(|e| e.0 == "start_date").map(|e| e.1.to_owned())
                    .nth(0);
                let param_start_date = match param_start_date {
                    Some(param_start_date) => {
                        let param_start_date =
                            <chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str
                                (&param_start_date);
                        match param_start_date {
                            Ok(param_start_date) => Some(param_start_date),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter start_date - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter start_date")),
                        }
                    },
                    None => None,
                };
                let param_start_date = match param_start_date {
                    Some(param_start_date) => param_start_date,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter start_date"))
                        .expect("Unable to create Bad Request response for missing query parameter start_date")),
                };
                let param_end_date = query_params.iter().filter(|e| e.0 == "end_date").map(|e| e.1.to_owned())
                    .nth(0);
                let param_end_date = match param_end_date {
                    Some(param_end_date) => {
                        let param_end_date =
                            <chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str
                                (&param_end_date);
                        match param_end_date {
                            Ok(param_end_date) => Some(param_end_date),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter end_date - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter end_date")),
                        }
                    },
                    None => None,
                };
                let param_end_date = match param_end_date {
                    Some(param_end_date) => param_end_date,
                    None => return Ok(Response::builder()
                        .status(StatusCode::BAD_REQUEST)
                        .body(Body::from("Missing required query parameter end_date"))
                        .expect("Unable to create Bad Request response for missing query parameter end_date")),
                };
                let param_from_claimed_content = query_params.iter().filter(|e| e.0 == "from_claimed_content").map(|e| e.1.to_owned())
                    .nth(0);
                let param_from_claimed_content = match param_from_claimed_content {
                    Some(param_from_claimed_content) => {
                        let param_from_claimed_content =
                            <String as std::str::FromStr>::from_str
                                (&param_from_claimed_content);
                        match param_from_claimed_content {
                            Ok(param_from_claimed_content) => Some(param_from_claimed_content),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter from_claimed_content - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter from_claimed_content")),
                        }
                    },
                    None => None,
                };
                let param_pin_format = query_params.iter().filter(|e| e.0 == "pin_format").map(|e| e.1.to_owned())
                    .nth(0);
                let param_pin_format = match param_pin_format {
                    Some(param_pin_format) => {
                        let param_pin_format =
                            <String as std::str::FromStr>::from_str
                                (&param_pin_format);
                        match param_pin_format {
                            Ok(param_pin_format) => Some(param_pin_format),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter pin_format - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter pin_format")),
                        }
                    },
                    None => None,
                };
                let param_app_types = query_params.iter().filter(|e| e.0 == "app_types").map(|e| e.1.to_owned())
                    .nth(0);
                let param_app_types = match param_app_types {
                    Some(param_app_types) => {
                        let param_app_types =
                            <String as std::str::FromStr>::from_str
                                (&param_app_types);
                        match param_app_types {
                            Ok(param_app_types) => Some(param_app_types),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter app_types - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter app_types")),
                        }
                    },
                    None => None,
                };
                let param_metric_types = query_params.iter().filter(|e| e.0 == "metric_types").map(|e| e.1.to_owned())
                    .filter_map(|param_metric_types| param_metric_types.parse().ok())
                    .collect::<Vec<_>>();
                let param_metric_types = if !param_metric_types.is_empty() {
                    Some(param_metric_types)
                } else {
                    None
                };
                let param_split_field = query_params.iter().filter(|e| e.0 == "split_field").map(|e| e.1.to_owned())
                    .nth(0);
                let param_split_field = match param_split_field {
                    Some(param_split_field) => {
                        let param_split_field =
                            <String as std::str::FromStr>::from_str
                                (&param_split_field);
                        match param_split_field {
                            Ok(param_split_field) => Some(param_split_field),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter split_field - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter split_field")),
                        }
                    },
                    None => None,
                };
                let param_ad_account_id = query_params.iter().filter(|e| e.0 == "ad_account_id").map(|e| e.1.to_owned())
                    .nth(0);
                let param_ad_account_id = match param_ad_account_id {
                    Some(param_ad_account_id) => {
                        let param_ad_account_id =
                            <String as std::str::FromStr>::from_str
                                (&param_ad_account_id);
                        match param_ad_account_id {
                            Ok(param_ad_account_id) => Some(param_ad_account_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter ad_account_id - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter ad_account_id")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.user_account_analytics(
                                            param_start_date,
                                            param_end_date,
                                            param_from_claimed_content,
                                            param_pin_format,
                                            param_app_types,
                                            param_metric_types.as_ref(),
                                            param_split_field,
                                            param_ad_account_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UserAccountAnalyticsResponse::Success
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for USER_ACCOUNT_ANALYTICS_SUCCESS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                UserAccountAnalyticsResponse::NotAuthorizedToAccessTheUserAccountAnalytics
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for USER_ACCOUNT_ANALYTICS_NOT_AUTHORIZED_TO_ACCESS_THE_USER_ACCOUNT_ANALYTICS"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                UserAccountAnalyticsResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for USER_ACCOUNT_ANALYTICS_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            // UserAccountGet - GET /user_account
            &hyper::Method::GET if path.matched(paths::ID_USER_ACCOUNT) => {
                {
                    let authorization = match (&context as &dyn Has<Option<Authorization>>).get() {
                        &Some(ref authorization) => authorization,
                        &None => return Ok(Response::builder()
                                                .status(StatusCode::FORBIDDEN)
                                                .body(Body::from("Unauthenticated"))
                                                .expect("Unable to create Authentication Forbidden response")),
                    };

                    // Authorization
                    if let Scopes::Some(ref scopes) = authorization.scopes {
                        let required_scopes: std::collections::BTreeSet<String> = vec![
                            "user_accounts:read".to_string(), // See your user accounts
                        ].into_iter().collect();

                        if !required_scopes.is_subset(scopes) {
                            let missing_scopes = required_scopes.difference(scopes);
                            return Ok(Response::builder()
                                .status(StatusCode::FORBIDDEN)
                                .body(Body::from(missing_scopes.fold(
                                    "Insufficient authorization, missing scopes".to_string(),
                                    |s, scope| format!("{} {}", s, scope))
                                ))
                                .expect("Unable to create Authentication Insufficient response")
                            );
                        }
                    }
                }

                // Query parameters (note that non-required or collection query parameters will ignore garbage values, rather than causing a 400 response)
                let query_params = form_urlencoded::parse(uri.query().unwrap_or_default().as_bytes()).collect::<Vec<_>>();
                let param_ad_account_id = query_params.iter().filter(|e| e.0 == "ad_account_id").map(|e| e.1.to_owned())
                    .nth(0);
                let param_ad_account_id = match param_ad_account_id {
                    Some(param_ad_account_id) => {
                        let param_ad_account_id =
                            <String as std::str::FromStr>::from_str
                                (&param_ad_account_id);
                        match param_ad_account_id {
                            Ok(param_ad_account_id) => Some(param_ad_account_id),
                            Err(e) => return Ok(Response::builder()
                                .status(StatusCode::BAD_REQUEST)
                                .body(Body::from(format!("Couldn't parse query parameter ad_account_id - doesn't match schema: {}", e)))
                                .expect("Unable to create Bad Request response for invalid query parameter ad_account_id")),
                        }
                    },
                    None => None,
                };

                                let result = api_impl.user_account_get(
                                            param_ad_account_id,
                                        &context
                                    ).await;
                                let mut response = Response::new(Body::empty());
                                response.headers_mut().insert(
                                            HeaderName::from_static("x-span-id"),
                                            HeaderValue::from_str((&context as &dyn Has<XSpanIdString>).get().0.clone().to_string().as_str())
                                                .expect("Unable to create X-Span-ID header value"));

                                        match result {
                                            Ok(rsp) => match rsp {
                                                UserAccountGetResponse::Response
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(200).expect("Unable to turn 200 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for USER_ACCOUNT_GET_RESPONSE"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                UserAccountGetResponse::NotAuthorizedToAccessTheUserAccount
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(403).expect("Unable to turn 403 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for USER_ACCOUNT_GET_NOT_AUTHORIZED_TO_ACCESS_THE_USER_ACCOUNT"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                                UserAccountGetResponse::UnexpectedError
                                                    (body)
                                                => {
                                                    *response.status_mut() = StatusCode::from_u16(0).expect("Unable to turn 0 into a StatusCode");
                                                    response.headers_mut().insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json")
                                                            .expect("Unable to create Content-Type header for USER_ACCOUNT_GET_UNEXPECTED_ERROR"));
                                                    let body = serde_json::to_string(&body).expect("impossible to fail to serialize");
                                                    *response.body_mut() = Body::from(body);
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                *response.status_mut() = StatusCode::INTERNAL_SERVER_ERROR;
                                                *response.body_mut() = Body::from("An internal error occurred");
                                            },
                                        }

                                        Ok(response)
            },

            _ if path.matched(paths::ID_AD_ACCOUNTS) => method_not_allowed(),
            _ if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS) => method_not_allowed(),
            _ if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS_ANALYTICS) => method_not_allowed(),
            _ if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_ADS) => method_not_allowed(),
            _ if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_ADS_ANALYTICS) => method_not_allowed(),
            _ if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_ANALYTICS) => method_not_allowed(),
            _ if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS) => method_not_allowed(),
            _ if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS_ANALYTICS) => method_not_allowed(),
            _ if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_PRODUCT_GROUPS_ANALYTICS) => method_not_allowed(),
            _ if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_REPORTS) => method_not_allowed(),
            _ if path.matched(paths::ID_BOARDS) => method_not_allowed(),
            _ if path.matched(paths::ID_BOARDS_BOARD_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_BOARDS_BOARD_ID_PINS) => method_not_allowed(),
            _ if path.matched(paths::ID_BOARDS_BOARD_ID_SECTIONS) => method_not_allowed(),
            _ if path.matched(paths::ID_BOARDS_BOARD_ID_SECTIONS_SECTION_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_BOARDS_BOARD_ID_SECTIONS_SECTION_ID_PINS) => method_not_allowed(),
            _ if path.matched(paths::ID_CATALOGS_FEEDS) => method_not_allowed(),
            _ if path.matched(paths::ID_CATALOGS_FEEDS_FEED_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_CATALOGS_FEEDS_FEED_ID_PROCESSING_RESULTS) => method_not_allowed(),
            _ if path.matched(paths::ID_CATALOGS_ITEMS) => method_not_allowed(),
            _ if path.matched(paths::ID_CATALOGS_ITEMS_BATCH) => method_not_allowed(),
            _ if path.matched(paths::ID_CATALOGS_ITEMS_BATCH_BATCH_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_CATALOGS_PRODUCT_GROUPS) => method_not_allowed(),
            _ if path.matched(paths::ID_CATALOGS_PRODUCT_GROUPS_PRODUCT_GROUP_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_MEDIA) => method_not_allowed(),
            _ if path.matched(paths::ID_MEDIA_MEDIA_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_OAUTH_TOKEN) => method_not_allowed(),
            _ if path.matched(paths::ID_PINS) => method_not_allowed(),
            _ if path.matched(paths::ID_PINS_PIN_ID) => method_not_allowed(),
            _ if path.matched(paths::ID_PINS_PIN_ID_ANALYTICS) => method_not_allowed(),
            _ if path.matched(paths::ID_USER_ACCOUNT) => method_not_allowed(),
            _ if path.matched(paths::ID_USER_ACCOUNT_ANALYTICS) => method_not_allowed(),
            _ => Ok(Response::builder().status(StatusCode::NOT_FOUND)
                    .body(Body::empty())
                    .expect("Unable to create Not Found response"))
        }
    } Box::pin(run(self.api_impl.clone(), req)) }
}

/// Request parser for `Api`.
pub struct ApiRequestParser;
impl<T> RequestParser<T> for ApiRequestParser {
    fn parse_operation_id(request: &Request<T>) -> Result<&'static str, ()> {
        let path = paths::GLOBAL_REGEX_SET.matches(request.uri().path());
        match request.method() {
            // AdAccountAnalytics - GET /ad_accounts/{ad_account_id}/analytics
            &hyper::Method::GET if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_ANALYTICS) => Ok("AdAccountAnalytics"),
            // AdAccountsList - GET /ad_accounts
            &hyper::Method::GET if path.matched(paths::ID_AD_ACCOUNTS) => Ok("AdAccountsList"),
            // AdGroupsAnalytics - GET /ad_accounts/{ad_account_id}/ad_groups/analytics
            &hyper::Method::GET if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS_ANALYTICS) => Ok("AdGroupsAnalytics"),
            // AdGroupsList - GET /ad_accounts/{ad_account_id}/ad_groups
            &hyper::Method::GET if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_AD_GROUPS) => Ok("AdGroupsList"),
            // AdsAnalytics - GET /ad_accounts/{ad_account_id}/ads/analytics
            &hyper::Method::GET if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_ADS_ANALYTICS) => Ok("AdsAnalytics"),
            // AdsList - GET /ad_accounts/{ad_account_id}/ads
            &hyper::Method::GET if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_ADS) => Ok("AdsList"),
            // AnalyticsCreateReport - POST /ad_accounts/{ad_account_id}/reports
            &hyper::Method::POST if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_REPORTS) => Ok("AnalyticsCreateReport"),
            // AnalyticsGetReport - GET /ad_accounts/{ad_account_id}/reports
            &hyper::Method::GET if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_REPORTS) => Ok("AnalyticsGetReport"),
            // CampaignsAnalytics - GET /ad_accounts/{ad_account_id}/campaigns/analytics
            &hyper::Method::GET if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS_ANALYTICS) => Ok("CampaignsAnalytics"),
            // CampaignsList - GET /ad_accounts/{ad_account_id}/campaigns
            &hyper::Method::GET if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_CAMPAIGNS) => Ok("CampaignsList"),
            // ProductGroupsAnalytics - GET /ad_accounts/{ad_account_id}/product_groups/analytics
            &hyper::Method::GET if path.matched(paths::ID_AD_ACCOUNTS_AD_ACCOUNT_ID_PRODUCT_GROUPS_ANALYTICS) => Ok("ProductGroupsAnalytics"),
            // BoardSectionsCreate - POST /boards/{board_id}/sections
            &hyper::Method::POST if path.matched(paths::ID_BOARDS_BOARD_ID_SECTIONS) => Ok("BoardSectionsCreate"),
            // BoardSectionsDelete - DELETE /boards/{board_id}/sections/{section_id}
            &hyper::Method::DELETE if path.matched(paths::ID_BOARDS_BOARD_ID_SECTIONS_SECTION_ID) => Ok("BoardSectionsDelete"),
            // BoardSectionsList - GET /boards/{board_id}/sections
            &hyper::Method::GET if path.matched(paths::ID_BOARDS_BOARD_ID_SECTIONS) => Ok("BoardSectionsList"),
            // BoardSectionsListPins - GET /boards/{board_id}/sections/{section_id}/pins
            &hyper::Method::GET if path.matched(paths::ID_BOARDS_BOARD_ID_SECTIONS_SECTION_ID_PINS) => Ok("BoardSectionsListPins"),
            // BoardSectionsUpdate - PATCH /boards/{board_id}/sections/{section_id}
            &hyper::Method::PATCH if path.matched(paths::ID_BOARDS_BOARD_ID_SECTIONS_SECTION_ID) => Ok("BoardSectionsUpdate"),
            // BoardsCreate - POST /boards
            &hyper::Method::POST if path.matched(paths::ID_BOARDS) => Ok("BoardsCreate"),
            // BoardsDelete - DELETE /boards/{board_id}
            &hyper::Method::DELETE if path.matched(paths::ID_BOARDS_BOARD_ID) => Ok("BoardsDelete"),
            // BoardsGet - GET /boards/{board_id}
            &hyper::Method::GET if path.matched(paths::ID_BOARDS_BOARD_ID) => Ok("BoardsGet"),
            // BoardsList - GET /boards
            &hyper::Method::GET if path.matched(paths::ID_BOARDS) => Ok("BoardsList"),
            // BoardsListPins - GET /boards/{board_id}/pins
            &hyper::Method::GET if path.matched(paths::ID_BOARDS_BOARD_ID_PINS) => Ok("BoardsListPins"),
            // BoardsUpdate - PATCH /boards/{board_id}
            &hyper::Method::PATCH if path.matched(paths::ID_BOARDS_BOARD_ID) => Ok("BoardsUpdate"),
            // CatalogsProductGroupsCreate - POST /catalogs/product_groups
            &hyper::Method::POST if path.matched(paths::ID_CATALOGS_PRODUCT_GROUPS) => Ok("CatalogsProductGroupsCreate"),
            // CatalogsProductGroupsDelete - DELETE /catalogs/product_groups/{product_group_id}
            &hyper::Method::DELETE if path.matched(paths::ID_CATALOGS_PRODUCT_GROUPS_PRODUCT_GROUP_ID) => Ok("CatalogsProductGroupsDelete"),
            // CatalogsProductGroupsList - GET /catalogs/product_groups
            &hyper::Method::GET if path.matched(paths::ID_CATALOGS_PRODUCT_GROUPS) => Ok("CatalogsProductGroupsList"),
            // CatalogsProductGroupsUpdate - PATCH /catalogs/product_groups/{product_group_id}
            &hyper::Method::PATCH if path.matched(paths::ID_CATALOGS_PRODUCT_GROUPS_PRODUCT_GROUP_ID) => Ok("CatalogsProductGroupsUpdate"),
            // FeedProcessingResultsList - GET /catalogs/feeds/{feed_id}/processing_results
            &hyper::Method::GET if path.matched(paths::ID_CATALOGS_FEEDS_FEED_ID_PROCESSING_RESULTS) => Ok("FeedProcessingResultsList"),
            // FeedsCreate - POST /catalogs/feeds
            &hyper::Method::POST if path.matched(paths::ID_CATALOGS_FEEDS) => Ok("FeedsCreate"),
            // FeedsDelete - DELETE /catalogs/feeds/{feed_id}
            &hyper::Method::DELETE if path.matched(paths::ID_CATALOGS_FEEDS_FEED_ID) => Ok("FeedsDelete"),
            // FeedsGet - GET /catalogs/feeds/{feed_id}
            &hyper::Method::GET if path.matched(paths::ID_CATALOGS_FEEDS_FEED_ID) => Ok("FeedsGet"),
            // FeedsList - GET /catalogs/feeds
            &hyper::Method::GET if path.matched(paths::ID_CATALOGS_FEEDS) => Ok("FeedsList"),
            // FeedsUpdate - PATCH /catalogs/feeds/{feed_id}
            &hyper::Method::PATCH if path.matched(paths::ID_CATALOGS_FEEDS_FEED_ID) => Ok("FeedsUpdate"),
            // ItemsBatchGet - GET /catalogs/items/batch/{batch_id}
            &hyper::Method::GET if path.matched(paths::ID_CATALOGS_ITEMS_BATCH_BATCH_ID) => Ok("ItemsBatchGet"),
            // ItemsBatchPost - POST /catalogs/items/batch
            &hyper::Method::POST if path.matched(paths::ID_CATALOGS_ITEMS_BATCH) => Ok("ItemsBatchPost"),
            // ItemsGet - GET /catalogs/items
            &hyper::Method::GET if path.matched(paths::ID_CATALOGS_ITEMS) => Ok("ItemsGet"),
            // MediaCreate - POST /media
            &hyper::Method::POST if path.matched(paths::ID_MEDIA) => Ok("MediaCreate"),
            // MediaGet - GET /media/{media_id}
            &hyper::Method::GET if path.matched(paths::ID_MEDIA_MEDIA_ID) => Ok("MediaGet"),
            // MediaList - GET /media
            &hyper::Method::GET if path.matched(paths::ID_MEDIA) => Ok("MediaList"),
            // OauthToken - POST /oauth/token
            &hyper::Method::POST if path.matched(paths::ID_OAUTH_TOKEN) => Ok("OauthToken"),
            // PinsAnalytics - GET /pins/{pin_id}/analytics
            &hyper::Method::GET if path.matched(paths::ID_PINS_PIN_ID_ANALYTICS) => Ok("PinsAnalytics"),
            // PinsCreate - POST /pins
            &hyper::Method::POST if path.matched(paths::ID_PINS) => Ok("PinsCreate"),
            // PinsDelete - DELETE /pins/{pin_id}
            &hyper::Method::DELETE if path.matched(paths::ID_PINS_PIN_ID) => Ok("PinsDelete"),
            // PinsGet - GET /pins/{pin_id}
            &hyper::Method::GET if path.matched(paths::ID_PINS_PIN_ID) => Ok("PinsGet"),
            // UserAccountAnalytics - GET /user_account/analytics
            &hyper::Method::GET if path.matched(paths::ID_USER_ACCOUNT_ANALYTICS) => Ok("UserAccountAnalytics"),
            // UserAccountGet - GET /user_account
            &hyper::Method::GET if path.matched(paths::ID_USER_ACCOUNT) => Ok("UserAccountGet"),
            _ => Err(()),
        }
    }
}
