//! Main library entry point for openapi_client implementation.

#![allow(unused_imports)]

use async_trait::async_trait;
use futures::{future, Stream, StreamExt, TryFutureExt, TryStreamExt};
use hyper::server::conn::Http;
use hyper::service::Service;
use log::info;
use std::future::Future;
use std::marker::PhantomData;
use std::net::SocketAddr;
use std::sync::{Arc, Mutex};
use std::task::{Context, Poll};
use swagger::{Has, XSpanIdString};
use swagger::auth::MakeAllowAllAuthenticator;
use swagger::EmptyContext;
use tokio::net::TcpListener;

#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
use openssl::ssl::{Ssl, SslAcceptor, SslAcceptorBuilder, SslFiletype, SslMethod};

use openapi_client::models;

/// Builds an SSL implementation for Simple HTTPS from some hard-coded file names
pub async fn create(addr: &str, https: bool) {
    let addr = addr.parse().expect("Failed to parse bind address");

    let server = Server::new();

    let service = MakeService::new(server);

    let service = MakeAllowAllAuthenticator::new(service, "cosmo");

    #[allow(unused_mut)]
    let mut service =
        openapi_client::server::context::MakeAddContext::<_, EmptyContext>::new(
            service
        );

    if https {
        #[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
        {
            unimplemented!("SSL is not implemented for the examples on MacOS, Windows or iOS");
        }

        #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
        {
            let mut ssl = SslAcceptor::mozilla_intermediate_v5(SslMethod::tls()).expect("Failed to create SSL Acceptor");

            // Server authentication
            ssl.set_private_key_file("examples/server-key.pem", SslFiletype::PEM).expect("Failed to set private key");
            ssl.set_certificate_chain_file("examples/server-chain.pem").expect("Failed to set certificate chain");
            ssl.check_private_key().expect("Failed to check private key");

            let tls_acceptor = ssl.build();
            let tcp_listener = TcpListener::bind(&addr).await.unwrap();

            loop {
                if let Ok((tcp, _)) = tcp_listener.accept().await {
                    let ssl = Ssl::new(tls_acceptor.context()).unwrap();
                    let addr = tcp.peer_addr().expect("Unable to get remote address");
                    let service = service.call(addr);

                    tokio::spawn(async move {
                        let tls = tokio_openssl::SslStream::new(ssl, tcp).map_err(|_| ())?;
                        let service = service.await.map_err(|_| ())?;

                        Http::new()
                            .serve_connection(tls, service)
                            .await
                            .map_err(|_| ())
                    });
                }
            }
        }
    } else {
        // Using HTTP
        hyper::server::Server::bind(&addr).serve(service).await.unwrap()
    }
}

#[derive(Copy, Clone)]
pub struct Server<C> {
    marker: PhantomData<C>,
}

impl<C> Server<C> {
    pub fn new() -> Self {
        Server{marker: PhantomData}
    }
}


use openapi_client::{
    Api,
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
    WebsiteVerificationSlashGetResponse,
};
use openapi_client::server::MakeService;
use std::error::Error;
use swagger::ApiError;

#[async_trait]
impl<C> Api<C> for Server<C> where C: Has<XSpanIdString> + Send + Sync
{
    /// Get ad account analytics
    async fn ad_account_slash_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        context: &C) -> Result<AdAccountSlashAnalyticsResponse, ApiError>
    {
        info!("ad_account_slash_analytics(\"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, start_date, end_date, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get targeting analytics for an ad account
    async fn ad_account_targeting_analytics_slash_get(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &Vec<models::AdsAnalyticsTargetingType>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        attribution_types: Option<models::ConversionReportAttributionType>,
        context: &C) -> Result<AdAccountTargetingAnalyticsSlashGetResponse, ApiError>
    {
        info!("ad_account_targeting_analytics_slash_get(\"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create ad account
    async fn ad_accounts_slash_create(
        &self,
        ad_account_create_request: models::AdAccountCreateRequest,
        context: &C) -> Result<AdAccountsSlashCreateResponse, ApiError>
    {
        info!("ad_accounts_slash_create({:?}) - X-Span-ID: {:?}", ad_account_create_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get ad account
    async fn ad_accounts_slash_get(
        &self,
        ad_account_id: String,
        context: &C) -> Result<AdAccountsSlashGetResponse, ApiError>
    {
        info!("ad_accounts_slash_get(\"{}\") - X-Span-ID: {:?}", ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List ad accounts
    async fn ad_accounts_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        include_shared_accounts: Option<bool>,
        context: &C) -> Result<AdAccountsSlashListResponse, ApiError>
    {
        info!("ad_accounts_slash_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", bookmark, page_size, include_shared_accounts, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create a request for a Marketing Mix Modeling (MMM) report
    async fn analytics_slash_create_mmm_report(
        &self,
        ad_account_id: String,
        create_mmm_report_request: models::CreateMmmReportRequest,
        context: &C) -> Result<AnalyticsSlashCreateMmmReportResponse, ApiError>
    {
        info!("analytics_slash_create_mmm_report(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, create_mmm_report_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create async request for an account analytics report
    async fn analytics_slash_create_report(
        &self,
        ad_account_id: String,
        ads_analytics_create_async_request: models::AdsAnalyticsCreateAsyncRequest,
        context: &C) -> Result<AnalyticsSlashCreateReportResponse, ApiError>
    {
        info!("analytics_slash_create_report(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ads_analytics_create_async_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create async request for an analytics report using a template
    async fn analytics_slash_create_template_report(
        &self,
        ad_account_id: String,
        template_id: String,
        start_date: Option<chrono::naive::NaiveDate>,
        end_date: Option<chrono::naive::NaiveDate>,
        granularity: Option<models::Granularity>,
        context: &C) -> Result<AnalyticsSlashCreateTemplateReportResponse, ApiError>
    {
        info!("analytics_slash_create_template_report(\"{}\", \"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, template_id, start_date, end_date, granularity, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get advertiser Marketing Mix Modeling (MMM) report.
    async fn analytics_slash_get_mmm_report(
        &self,
        ad_account_id: String,
        token: String,
        context: &C) -> Result<AnalyticsSlashGetMmmReportResponse, ApiError>
    {
        info!("analytics_slash_get_mmm_report(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, token, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get the account analytics report created by the async call
    async fn analytics_slash_get_report(
        &self,
        ad_account_id: String,
        token: String,
        context: &C) -> Result<AnalyticsSlashGetReportResponse, ApiError>
    {
        info!("analytics_slash_get_report(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, token, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Delete ads data for ad account in API Sandbox
    async fn sandbox_slash_delete(
        &self,
        ad_account_id: String,
        context: &C) -> Result<SandboxSlashDeleteResponse, ApiError>
    {
        info!("sandbox_slash_delete(\"{}\") - X-Span-ID: {:?}", ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List templates
    async fn templates_slash_list(
        &self,
        ad_account_id: String,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<TemplatesSlashListResponse, ApiError>
    {
        info!("templates_slash_list(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, page_size, order, bookmark, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get bid floors
    async fn ad_groups_bid_floor_slash_get(
        &self,
        ad_account_id: String,
        bid_floor_request: models::BidFloorRequest,
        context: &C) -> Result<AdGroupsBidFloorSlashGetResponse, ApiError>
    {
        info!("ad_groups_bid_floor_slash_get(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, bid_floor_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get ad group analytics
    async fn ad_groups_slash_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        ad_group_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        context: &C) -> Result<AdGroupsSlashAnalyticsResponse, ApiError>
    {
        info!("ad_groups_slash_analytics(\"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, start_date, end_date, ad_group_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get audience sizing
    async fn ad_groups_slash_audience_sizing(
        &self,
        ad_account_id: String,
        ad_group_audience_sizing_request: Option<models::AdGroupAudienceSizingRequest>,
        context: &C) -> Result<AdGroupsSlashAudienceSizingResponse, ApiError>
    {
        info!("ad_groups_slash_audience_sizing(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ad_group_audience_sizing_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create ad groups
    async fn ad_groups_slash_create(
        &self,
        ad_account_id: String,
        ad_group_create_request: &Vec<models::AdGroupCreateRequest>,
        context: &C) -> Result<AdGroupsSlashCreateResponse, ApiError>
    {
        info!("ad_groups_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ad_group_create_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get ad group
    async fn ad_groups_slash_get(
        &self,
        ad_account_id: String,
        ad_group_id: String,
        context: &C) -> Result<AdGroupsSlashGetResponse, ApiError>
    {
        info!("ad_groups_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, ad_group_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List ad groups
    async fn ad_groups_slash_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        ad_group_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        translate_interests_to_names: Option<bool>,
        context: &C) -> Result<AdGroupsSlashListResponse, ApiError>
    {
        info!("ad_groups_slash_list(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, campaign_ids, ad_group_ids, entity_statuses, page_size, order, bookmark, translate_interests_to_names, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Update ad groups
    async fn ad_groups_slash_update(
        &self,
        ad_account_id: String,
        ad_group_update_request: &Vec<models::AdGroupUpdateRequest>,
        context: &C) -> Result<AdGroupsSlashUpdateResponse, ApiError>
    {
        info!("ad_groups_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ad_group_update_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get targeting analytics for ad groups
    async fn ad_groups_targeting_analytics_slash_get(
        &self,
        ad_account_id: String,
        ad_group_ids: &Vec<String>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &Vec<models::AdsAnalyticsTargetingType>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        attribution_types: Option<models::ConversionReportAttributionType>,
        context: &C) -> Result<AdGroupsTargetingAnalyticsSlashGetResponse, ApiError>
    {
        info!("ad_groups_targeting_analytics_slash_get(\"{}\", {:?}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, ad_group_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create ad preview with pin or image
    async fn ad_previews_slash_create(
        &self,
        ad_account_id: String,
        ad_preview_request: models::AdPreviewRequest,
        context: &C) -> Result<AdPreviewsSlashCreateResponse, ApiError>
    {
        info!("ad_previews_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ad_preview_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get targeting analytics for ads
    async fn ad_targeting_analytics_slash_get(
        &self,
        ad_account_id: String,
        ad_ids: &Vec<String>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &Vec<models::AdsAnalyticsTargetingType>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        attribution_types: Option<models::ConversionReportAttributionType>,
        context: &C) -> Result<AdTargetingAnalyticsSlashGetResponse, ApiError>
    {
        info!("ad_targeting_analytics_slash_get(\"{}\", {:?}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, ad_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get ad analytics
    async fn ads_slash_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        ad_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        context: &C) -> Result<AdsSlashAnalyticsResponse, ApiError>
    {
        info!("ads_slash_analytics(\"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, start_date, end_date, ad_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create ads
    async fn ads_slash_create(
        &self,
        ad_account_id: String,
        ad_create_request: &Vec<models::AdCreateRequest>,
        context: &C) -> Result<AdsSlashCreateResponse, ApiError>
    {
        info!("ads_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ad_create_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get ad
    async fn ads_slash_get(
        &self,
        ad_account_id: String,
        ad_id: String,
        context: &C) -> Result<AdsSlashGetResponse, ApiError>
    {
        info!("ads_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, ad_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List ads
    async fn ads_slash_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        ad_group_ids: Option<&Vec<String>>,
        ad_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<AdsSlashListResponse, ApiError>
    {
        info!("ads_slash_list(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, campaign_ids, ad_group_ids, ad_ids, entity_statuses, page_size, order, bookmark, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Update ads
    async fn ads_slash_update(
        &self,
        ad_account_id: String,
        ad_update_request: &Vec<models::AdUpdateRequest>,
        context: &C) -> Result<AdsSlashUpdateResponse, ApiError>
    {
        info!("ads_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ad_update_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get audience insights scope and type
    async fn audience_insights_scope_and_type_slash_get(
        &self,
        ad_account_id: String,
        context: &C) -> Result<AudienceInsightsScopeAndTypeSlashGetResponse, ApiError>
    {
        info!("audience_insights_scope_and_type_slash_get(\"{}\") - X-Span-ID: {:?}", ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get audience insights
    async fn audience_insights_slash_get(
        &self,
        ad_account_id: String,
        audience_insight_type: models::AudienceInsightType,
        context: &C) -> Result<AudienceInsightsSlashGetResponse, ApiError>
    {
        info!("audience_insights_slash_get(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, audience_insight_type, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create audience
    async fn audiences_slash_create(
        &self,
        ad_account_id: String,
        audience_create_request: models::AudienceCreateRequest,
        context: &C) -> Result<AudiencesSlashCreateResponse, ApiError>
    {
        info!("audiences_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, audience_create_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create custom audience
    async fn audiences_slash_create_custom(
        &self,
        ad_account_id: String,
        audience_create_custom_request: models::AudienceCreateCustomRequest,
        context: &C) -> Result<AudiencesSlashCreateCustomResponse, ApiError>
    {
        info!("audiences_slash_create_custom(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, audience_create_custom_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get audience
    async fn audiences_slash_get(
        &self,
        ad_account_id: String,
        audience_id: String,
        context: &C) -> Result<AudiencesSlashGetResponse, ApiError>
    {
        info!("audiences_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, audience_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List audiences
    async fn audiences_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        order: Option<String>,
        page_size: Option<i32>,
        ownership_type: Option<String>,
        context: &C) -> Result<AudiencesSlashListResponse, ApiError>
    {
        info!("audiences_slash_list(\"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, order, page_size, ownership_type, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Update audience
    async fn audiences_slash_update(
        &self,
        ad_account_id: String,
        audience_id: String,
        audience_update_request: Option<models::AudienceUpdateRequest>,
        context: &C) -> Result<AudiencesSlashUpdateResponse, ApiError>
    {
        info!("audiences_slash_update(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, audience_id, audience_update_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Redeem ad credits
    async fn ads_credit_slash_redeem(
        &self,
        ad_account_id: String,
        ads_credit_redeem_request: models::AdsCreditRedeemRequest,
        context: &C) -> Result<AdsCreditSlashRedeemResponse, ApiError>
    {
        info!("ads_credit_slash_redeem(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ads_credit_redeem_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get ads credit discounts
    async fn ads_credits_discounts_slash_get(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<AdsCreditsDiscountsSlashGetResponse, ApiError>
    {
        info!("ads_credits_discounts_slash_get(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get billing profiles
    async fn billing_profiles_slash_get(
        &self,
        ad_account_id: String,
        is_active: bool,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BillingProfilesSlashGetResponse, ApiError>
    {
        info!("billing_profiles_slash_get(\"{}\", {}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, is_active, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get Salesforce account details including bill-to information.
    async fn ssio_accounts_slash_get(
        &self,
        ad_account_id: String,
        context: &C) -> Result<SsioAccountsSlashGetResponse, ApiError>
    {
        info!("ssio_accounts_slash_get(\"{}\") - X-Span-ID: {:?}", ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create insertion order through SSIO.
    async fn ssio_insertion_order_slash_create(
        &self,
        ad_account_id: String,
        ssio_create_insertion_order_request: models::SsioCreateInsertionOrderRequest,
        context: &C) -> Result<SsioInsertionOrderSlashCreateResponse, ApiError>
    {
        info!("ssio_insertion_order_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ssio_create_insertion_order_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Edit insertion order through SSIO.
    async fn ssio_insertion_order_slash_edit(
        &self,
        ad_account_id: String,
        ssio_edit_insertion_order_request: models::SsioEditInsertionOrderRequest,
        context: &C) -> Result<SsioInsertionOrderSlashEditResponse, ApiError>
    {
        info!("ssio_insertion_order_slash_edit(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ssio_edit_insertion_order_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get insertion order status by ad account id.
    async fn ssio_insertion_orders_status_slash_get_by_ad_account(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<SsioInsertionOrdersStatusSlashGetByAdAccountResponse, ApiError>
    {
        info!("ssio_insertion_orders_status_slash_get_by_ad_account(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get insertion order status by pin order id.
    async fn ssio_insertion_orders_status_slash_get_by_pin_order_id(
        &self,
        ad_account_id: String,
        pin_order_id: String,
        context: &C) -> Result<SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse, ApiError>
    {
        info!("ssio_insertion_orders_status_slash_get_by_pin_order_id(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, pin_order_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get Salesforce order lines by ad account id.
    async fn ssio_order_lines_slash_get_by_ad_account(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        pin_order_id: Option<String>,
        context: &C) -> Result<SsioOrderLinesSlashGetByAdAccountResponse, ApiError>
    {
        info!("ssio_order_lines_slash_get_by_ad_account(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, pin_order_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create board section
    async fn board_sections_slash_create(
        &self,
        board_id: String,
        board_section: models::BoardSection,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardSectionsSlashCreateResponse, ApiError>
    {
        info!("board_sections_slash_create(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", board_id, board_section, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Delete board section
    async fn board_sections_slash_delete(
        &self,
        board_id: String,
        section_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardSectionsSlashDeleteResponse, ApiError>
    {
        info!("board_sections_slash_delete(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", board_id, section_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List board sections
    async fn board_sections_slash_list(
        &self,
        board_id: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BoardSectionsSlashListResponse, ApiError>
    {
        info!("board_sections_slash_list(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", board_id, ad_account_id, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List Pins on board section
    async fn board_sections_slash_list_pins(
        &self,
        board_id: String,
        section_id: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BoardSectionsSlashListPinsResponse, ApiError>
    {
        info!("board_sections_slash_list_pins(\"{}\", \"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", board_id, section_id, ad_account_id, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Update board section
    async fn board_sections_slash_update(
        &self,
        board_id: String,
        section_id: String,
        board_section: models::BoardSection,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardSectionsSlashUpdateResponse, ApiError>
    {
        info!("board_sections_slash_update(\"{}\", \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", board_id, section_id, board_section, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create board
    async fn boards_slash_create(
        &self,
        board: models::Board,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardsSlashCreateResponse, ApiError>
    {
        info!("boards_slash_create({:?}, {:?}) - X-Span-ID: {:?}", board, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Delete board
    async fn boards_slash_delete(
        &self,
        board_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardsSlashDeleteResponse, ApiError>
    {
        info!("boards_slash_delete(\"{}\", {:?}) - X-Span-ID: {:?}", board_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get board
    async fn boards_slash_get(
        &self,
        board_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardsSlashGetResponse, ApiError>
    {
        info!("boards_slash_get(\"{}\", {:?}) - X-Span-ID: {:?}", board_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List boards
    async fn boards_slash_list(
        &self,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        privacy: Option<String>,
        context: &C) -> Result<BoardsSlashListResponse, ApiError>
    {
        info!("boards_slash_list({:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, privacy, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List Pins on board
    async fn boards_slash_list_pins(
        &self,
        board_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        creative_types: Option<&Vec<String>>,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        context: &C) -> Result<BoardsSlashListPinsResponse, ApiError>
    {
        info!("boards_slash_list_pins(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", board_id, bookmark, page_size, creative_types, ad_account_id, pin_metrics, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Update board
    async fn boards_slash_update(
        &self,
        board_id: String,
        board_update: models::BoardUpdate,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardsSlashUpdateResponse, ApiError>
    {
        info!("boards_slash_update(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", board_id, board_update, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get advertiser entities in bulk
    async fn bulk_download_slash_create(
        &self,
        ad_account_id: String,
        bulk_download_request: models::BulkDownloadRequest,
        context: &C) -> Result<BulkDownloadSlashCreateResponse, ApiError>
    {
        info!("bulk_download_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, bulk_download_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Download advertiser entities in bulk
    async fn bulk_request_slash_get(
        &self,
        ad_account_id: String,
        bulk_request_id: String,
        include_details: Option<bool>,
        context: &C) -> Result<BulkRequestSlashGetResponse, ApiError>
    {
        info!("bulk_request_slash_get(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, bulk_request_id, include_details, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create/update ad entities in bulk
    async fn bulk_upsert_slash_create(
        &self,
        ad_account_id: String,
        bulk_upsert_request: models::BulkUpsertRequest,
        context: &C) -> Result<BulkUpsertSlashCreateResponse, ApiError>
    {
        info!("bulk_upsert_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, bulk_upsert_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get targeting analytics for campaigns
    async fn campaign_targeting_analytics_slash_get(
        &self,
        ad_account_id: String,
        campaign_ids: &Vec<String>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &Vec<models::AdsAnalyticsTargetingType>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        attribution_types: Option<models::ConversionReportAttributionType>,
        context: &C) -> Result<CampaignTargetingAnalyticsSlashGetResponse, ApiError>
    {
        info!("campaign_targeting_analytics_slash_get(\"{}\", {:?}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, campaign_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get campaign analytics
    async fn campaigns_slash_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        campaign_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        context: &C) -> Result<CampaignsSlashAnalyticsResponse, ApiError>
    {
        info!("campaigns_slash_analytics(\"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, start_date, end_date, campaign_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create campaigns
    async fn campaigns_slash_create(
        &self,
        ad_account_id: String,
        campaign_create_request: &Vec<models::CampaignCreateRequest>,
        context: &C) -> Result<CampaignsSlashCreateResponse, ApiError>
    {
        info!("campaigns_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, campaign_create_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get campaign
    async fn campaigns_slash_get(
        &self,
        ad_account_id: String,
        campaign_id: String,
        context: &C) -> Result<CampaignsSlashGetResponse, ApiError>
    {
        info!("campaigns_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, campaign_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List campaigns
    async fn campaigns_slash_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<CampaignsSlashListResponse, ApiError>
    {
        info!("campaigns_slash_list(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, campaign_ids, entity_statuses, page_size, order, bookmark, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Update campaigns
    async fn campaigns_slash_update(
        &self,
        ad_account_id: String,
        campaign_update_request: &Vec<models::CampaignUpdateRequest>,
        context: &C) -> Result<CampaignsSlashUpdateResponse, ApiError>
    {
        info!("campaigns_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, campaign_update_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List products for a Product Group
    async fn catalogs_product_group_pins_slash_list(
        &self,
        product_group_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupPinsSlashListResponse, ApiError>
    {
        info!("catalogs_product_group_pins_slash_list(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", product_group_id, bookmark, page_size, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create product group
    async fn catalogs_product_groups_slash_create(
        &self,
        catalogs_product_groups_create_request: models::CatalogsProductGroupsCreateRequest,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashCreateResponse, ApiError>
    {
        info!("catalogs_product_groups_slash_create({:?}, {:?}) - X-Span-ID: {:?}", catalogs_product_groups_create_request, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Delete product group
    async fn catalogs_product_groups_slash_delete(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashDeleteResponse, ApiError>
    {
        info!("catalogs_product_groups_slash_delete(\"{}\", {:?}) - X-Span-ID: {:?}", product_group_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get product group
    async fn catalogs_product_groups_slash_get(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashGetResponse, ApiError>
    {
        info!("catalogs_product_groups_slash_get(\"{}\", {:?}) - X-Span-ID: {:?}", product_group_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List product groups
    async fn catalogs_product_groups_slash_list(
        &self,
        feed_id: Option<String>,
        catalog_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashListResponse, ApiError>
    {
        info!("catalogs_product_groups_slash_list({:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", feed_id, catalog_id, bookmark, page_size, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get product counts for a Product Group
    async fn catalogs_product_groups_slash_product_counts_get(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashProductCountsGetResponse, ApiError>
    {
        info!("catalogs_product_groups_slash_product_counts_get(\"{}\", {:?}) - X-Span-ID: {:?}", product_group_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Update product group
    async fn catalogs_product_groups_slash_update(
        &self,
        product_group_id: String,
        catalogs_product_groups_update_request: models::CatalogsProductGroupsUpdateRequest,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashUpdateResponse, ApiError>
    {
        info!("catalogs_product_groups_slash_update(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", product_group_id, catalogs_product_groups_update_request, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List catalogs
    async fn catalogs_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsSlashListResponse, ApiError>
    {
        info!("catalogs_slash_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", bookmark, page_size, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List processing results for a given feed
    async fn feed_processing_results_slash_list(
        &self,
        feed_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        context: &C) -> Result<FeedProcessingResultsSlashListResponse, ApiError>
    {
        info!("feed_processing_results_slash_list(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", feed_id, bookmark, page_size, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create feed
    async fn feeds_slash_create(
        &self,
        feeds_create_request: models::FeedsCreateRequest,
        ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashCreateResponse, ApiError>
    {
        info!("feeds_slash_create({:?}, {:?}) - X-Span-ID: {:?}", feeds_create_request, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Delete feed
    async fn feeds_slash_delete(
        &self,
        feed_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashDeleteResponse, ApiError>
    {
        info!("feeds_slash_delete(\"{}\", {:?}) - X-Span-ID: {:?}", feed_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get feed
    async fn feeds_slash_get(
        &self,
        feed_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashGetResponse, ApiError>
    {
        info!("feeds_slash_get(\"{}\", {:?}) - X-Span-ID: {:?}", feed_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List feeds
    async fn feeds_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        catalog_id: Option<String>,
        ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashListResponse, ApiError>
    {
        info!("feeds_slash_list({:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", bookmark, page_size, catalog_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Update feed
    async fn feeds_slash_update(
        &self,
        feed_id: String,
        feeds_update_request: models::FeedsUpdateRequest,
        ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashUpdateResponse, ApiError>
    {
        info!("feeds_slash_update(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", feed_id, feeds_update_request, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get catalogs item batch status
    async fn items_batch_slash_get(
        &self,
        batch_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<ItemsBatchSlashGetResponse, ApiError>
    {
        info!("items_batch_slash_get(\"{}\", {:?}) - X-Span-ID: {:?}", batch_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Operate on item batch
    async fn items_batch_slash_post(
        &self,
        items_batch_post_request: models::ItemsBatchPostRequest,
        ad_account_id: Option<String>,
        context: &C) -> Result<ItemsBatchSlashPostResponse, ApiError>
    {
        info!("items_batch_slash_post({:?}, {:?}) - X-Span-ID: {:?}", items_batch_post_request, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List item issues for a given processing result
    async fn items_issues_slash_list(
        &self,
        processing_result_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        item_numbers: Option<&Vec<i32>>,
        item_validation_issue: Option<models::CatalogsItemValidationIssue>,
        ad_account_id: Option<String>,
        context: &C) -> Result<ItemsIssuesSlashListResponse, ApiError>
    {
        info!("items_issues_slash_list(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", processing_result_id, bookmark, page_size, item_numbers, item_validation_issue, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get catalogs items
    async fn items_slash_get(
        &self,
        country: String,
        language: String,
        ad_account_id: Option<String>,
        item_ids: Option<&Vec<String>>,
        filters: Option<models::CatalogsItemsFilters>,
        context: &C) -> Result<ItemsSlashGetResponse, ApiError>
    {
        info!("items_slash_get(\"{}\", \"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", country, language, ad_account_id, item_ids, filters, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List filtered products
    async fn products_by_product_group_filter_slash_list(
        &self,
        catalogs_list_products_by_filter_request: models::CatalogsListProductsByFilterRequest,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        context: &C) -> Result<ProductsByProductGroupFilterSlashListResponse, ApiError>
    {
        info!("products_by_product_group_filter_slash_list({:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", catalogs_list_products_by_filter_request, bookmark, page_size, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Send conversions
    async fn events_slash_create(
        &self,
        ad_account_id: String,
        conversion_events: models::ConversionEvents,
        test: Option<bool>,
        context: &C) -> Result<EventsSlashCreateResponse, ApiError>
    {
        info!("events_slash_create(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, conversion_events, test, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create conversion tag
    async fn conversion_tags_slash_create(
        &self,
        ad_account_id: String,
        conversion_tag_create: models::ConversionTagCreate,
        context: &C) -> Result<ConversionTagsSlashCreateResponse, ApiError>
    {
        info!("conversion_tags_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, conversion_tag_create, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get conversion tag
    async fn conversion_tags_slash_get(
        &self,
        ad_account_id: String,
        conversion_tag_id: String,
        context: &C) -> Result<ConversionTagsSlashGetResponse, ApiError>
    {
        info!("conversion_tags_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, conversion_tag_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get conversion tags
    async fn conversion_tags_slash_list(
        &self,
        ad_account_id: String,
        filter_deleted: Option<bool>,
        context: &C) -> Result<ConversionTagsSlashListResponse, ApiError>
    {
        info!("conversion_tags_slash_list(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, filter_deleted, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get Ocpm eligible conversion tags
    async fn ocpm_eligible_conversion_tags_slash_get(
        &self,
        ad_account_id: String,
        context: &C) -> Result<OcpmEligibleConversionTagsSlashGetResponse, ApiError>
    {
        info!("ocpm_eligible_conversion_tags_slash_get(\"{}\") - X-Span-ID: {:?}", ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get page visit conversion tags
    async fn page_visit_conversion_tags_slash_get(
        &self,
        ad_account_id: String,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<PageVisitConversionTagsSlashGetResponse, ApiError>
    {
        info!("page_visit_conversion_tags_slash_get(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, page_size, order, bookmark, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create customer lists
    async fn customer_lists_slash_create(
        &self,
        ad_account_id: String,
        customer_list_request: models::CustomerListRequest,
        context: &C) -> Result<CustomerListsSlashCreateResponse, ApiError>
    {
        info!("customer_lists_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, customer_list_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get customer list
    async fn customer_lists_slash_get(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        context: &C) -> Result<CustomerListsSlashGetResponse, ApiError>
    {
        info!("customer_lists_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, customer_list_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get customer lists
    async fn customer_lists_slash_list(
        &self,
        ad_account_id: String,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<CustomerListsSlashListResponse, ApiError>
    {
        info!("customer_lists_slash_list(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, page_size, order, bookmark, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Update customer list
    async fn customer_lists_slash_update(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        customer_list_update_request: models::CustomerListUpdateRequest,
        context: &C) -> Result<CustomerListsSlashUpdateResponse, ApiError>
    {
        info!("customer_lists_slash_update(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, customer_list_id, customer_list_update_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Delete commerce integration
    async fn integrations_commerce_slash_del(
        &self,
        external_business_id: String,
        context: &C) -> Result<IntegrationsCommerceSlashDelResponse, ApiError>
    {
        info!("integrations_commerce_slash_del(\"{}\") - X-Span-ID: {:?}", external_business_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get commerce integration
    async fn integrations_commerce_slash_get(
        &self,
        external_business_id: String,
        context: &C) -> Result<IntegrationsCommerceSlashGetResponse, ApiError>
    {
        info!("integrations_commerce_slash_get(\"{}\") - X-Span-ID: {:?}", external_business_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Update commerce integration
    async fn integrations_commerce_slash_patch(
        &self,
        external_business_id: String,
        integration_request_patch: Option<models::IntegrationRequestPatch>,
        context: &C) -> Result<IntegrationsCommerceSlashPatchResponse, ApiError>
    {
        info!("integrations_commerce_slash_patch(\"{}\", {:?}) - X-Span-ID: {:?}", external_business_id, integration_request_patch, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create commerce integration
    async fn integrations_commerce_slash_post(
        &self,
        integration_request: Option<models::IntegrationRequest>,
        context: &C) -> Result<IntegrationsCommerceSlashPostResponse, ApiError>
    {
        info!("integrations_commerce_slash_post({:?}) - X-Span-ID: {:?}", integration_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Receives batched logs from integration applications.
    async fn integrations_logs_slash_post(
        &self,
        integration_logs_request: models::IntegrationLogsRequest,
        context: &C) -> Result<IntegrationsLogsSlashPostResponse, ApiError>
    {
        info!("integrations_logs_slash_post({:?}) - X-Span-ID: {:?}", integration_logs_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get integration metadata
    async fn integrations_slash_get_by_id(
        &self,
        id: String,
        context: &C) -> Result<IntegrationsSlashGetByIdResponse, ApiError>
    {
        info!("integrations_slash_get_by_id(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get integration metadata list
    async fn integrations_slash_get_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<IntegrationsSlashGetListResponse, ApiError>
    {
        info!("integrations_slash_get_list({:?}, {:?}) - X-Span-ID: {:?}", bookmark, page_size, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get country's keyword metrics
    async fn country_keywords_metrics_slash_get(
        &self,
        ad_account_id: String,
        country_code: String,
        keywords: &Vec<String>,
        context: &C) -> Result<CountryKeywordsMetricsSlashGetResponse, ApiError>
    {
        info!("country_keywords_metrics_slash_get(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, country_code, keywords, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create keywords
    async fn keywords_slash_create(
        &self,
        ad_account_id: String,
        keywords_request: models::KeywordsRequest,
        context: &C) -> Result<KeywordsSlashCreateResponse, ApiError>
    {
        info!("keywords_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, keywords_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get keywords
    async fn keywords_slash_get(
        &self,
        ad_account_id: String,
        campaign_id: Option<String>,
        ad_group_id: Option<String>,
        match_types: Option<&Vec<models::MatchType>>,
        page_size: Option<i32>,
        bookmark: Option<String>,
        context: &C) -> Result<KeywordsSlashGetResponse, ApiError>
    {
        info!("keywords_slash_get(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, campaign_id, ad_group_id, match_types, page_size, bookmark, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Update keywords
    async fn keywords_slash_update(
        &self,
        ad_account_id: String,
        keyword_update_body: models::KeywordUpdateBody,
        context: &C) -> Result<KeywordsSlashUpdateResponse, ApiError>
    {
        info!("keywords_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, keyword_update_body, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List trending keywords
    async fn trending_keywords_slash_list(
        &self,
        region: models::TrendsSupportedRegion,
        trend_type: models::TrendType,
        interests: Option<&Vec<String>>,
        genders: Option<&Vec<String>>,
        ages: Option<&Vec<String>>,
        normalize_against_group: Option<bool>,
        limit: Option<i32>,
        context: &C) -> Result<TrendingKeywordsSlashListResponse, ApiError>
    {
        info!("trending_keywords_slash_list({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", region, trend_type, interests, genders, ages, normalize_against_group, limit, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Delete lead ads subscription
    async fn ad_accounts_subscriptions_slash_del_by_id(
        &self,
        ad_account_id: String,
        subscription_id: String,
        context: &C) -> Result<AdAccountsSubscriptionsSlashDelByIdResponse, ApiError>
    {
        info!("ad_accounts_subscriptions_slash_del_by_id(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, subscription_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get lead ads subscription
    async fn ad_accounts_subscriptions_slash_get_by_id(
        &self,
        ad_account_id: String,
        subscription_id: String,
        context: &C) -> Result<AdAccountsSubscriptionsSlashGetByIdResponse, ApiError>
    {
        info!("ad_accounts_subscriptions_slash_get_by_id(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, subscription_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get lead ads subscriptions
    async fn ad_accounts_subscriptions_slash_get_list(
        &self,
        ad_account_id: String,
        page_size: Option<i32>,
        bookmark: Option<String>,
        context: &C) -> Result<AdAccountsSubscriptionsSlashGetListResponse, ApiError>
    {
        info!("ad_accounts_subscriptions_slash_get_list(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, page_size, bookmark, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create lead ads subscription
    async fn ad_accounts_subscriptions_slash_post(
        &self,
        ad_account_id: String,
        ad_account_create_subscription_request: models::AdAccountCreateSubscriptionRequest,
        context: &C) -> Result<AdAccountsSubscriptionsSlashPostResponse, ApiError>
    {
        info!("ad_accounts_subscriptions_slash_post(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ad_account_create_subscription_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get lead form by id
    async fn lead_form_slash_get(
        &self,
        ad_account_id: String,
        lead_form_id: String,
        context: &C) -> Result<LeadFormSlashGetResponse, ApiError>
    {
        info!("lead_form_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, lead_form_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create lead form test data
    async fn lead_form_test_slash_create(
        &self,
        ad_account_id: String,
        lead_form_id: String,
        lead_form_test_request: models::LeadFormTestRequest,
        context: &C) -> Result<LeadFormTestSlashCreateResponse, ApiError>
    {
        info!("lead_form_test_slash_create(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, lead_form_id, lead_form_test_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get lead forms
    async fn lead_forms_slash_list(
        &self,
        ad_account_id: String,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<LeadFormsSlashListResponse, ApiError>
    {
        info!("lead_forms_slash_list(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, page_size, order, bookmark, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Register media upload
    async fn media_slash_create(
        &self,
        media_upload_request: models::MediaUploadRequest,
        context: &C) -> Result<MediaSlashCreateResponse, ApiError>
    {
        info!("media_slash_create({:?}) - X-Span-ID: {:?}", media_upload_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get media upload details
    async fn media_slash_get(
        &self,
        media_id: String,
        context: &C) -> Result<MediaSlashGetResponse, ApiError>
    {
        info!("media_slash_get(\"{}\") - X-Span-ID: {:?}", media_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List media uploads
    async fn media_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<MediaSlashListResponse, ApiError>
    {
        info!("media_slash_list({:?}, {:?}) - X-Span-ID: {:?}", bookmark, page_size, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Generate OAuth access token
    async fn oauth_slash_token(
        &self,
        grant_type: String,
        context: &C) -> Result<OauthSlashTokenResponse, ApiError>
    {
        info!("oauth_slash_token(\"{}\") - X-Span-ID: {:?}", grant_type, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get order line
    async fn order_lines_slash_get(
        &self,
        ad_account_id: String,
        order_line_id: String,
        context: &C) -> Result<OrderLinesSlashGetResponse, ApiError>
    {
        info!("order_lines_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, order_line_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get order lines
    async fn order_lines_slash_list(
        &self,
        ad_account_id: String,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<OrderLinesSlashListResponse, ApiError>
    {
        info!("order_lines_slash_list(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, page_size, order, bookmark, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get Pin analytics
    async fn pins_slash_analytics(
        &self,
        pin_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        metric_types: &Vec<models::PinsAnalyticsMetricTypesParameterInner>,
        app_types: Option<String>,
        split_field: Option<String>,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashAnalyticsResponse, ApiError>
    {
        info!("pins_slash_analytics(\"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", pin_id, start_date, end_date, metric_types, app_types, split_field, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create Pin
    async fn pins_slash_create(
        &self,
        pin_create: models::PinCreate,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashCreateResponse, ApiError>
    {
        info!("pins_slash_create({:?}, {:?}) - X-Span-ID: {:?}", pin_create, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Delete Pin
    async fn pins_slash_delete(
        &self,
        pin_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashDeleteResponse, ApiError>
    {
        info!("pins_slash_delete(\"{}\", {:?}) - X-Span-ID: {:?}", pin_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get Pin
    async fn pins_slash_get(
        &self,
        pin_id: String,
        pin_metrics: Option<bool>,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashGetResponse, ApiError>
    {
        info!("pins_slash_get(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", pin_id, pin_metrics, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List Pins
    async fn pins_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        pin_filter: Option<String>,
        include_protected_pins: Option<bool>,
        pin_type: Option<String>,
        creative_types: Option<&Vec<String>>,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        context: &C) -> Result<PinsSlashListResponse, ApiError>
    {
        info!("pins_slash_list({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", bookmark, page_size, pin_filter, include_protected_pins, pin_type, creative_types, ad_account_id, pin_metrics, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Save Pin
    async fn pins_slash_save(
        &self,
        pin_id: String,
        pins_save_request: models::PinsSaveRequest,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashSaveResponse, ApiError>
    {
        info!("pins_slash_save(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", pin_id, pins_save_request, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Update Pin
    async fn pins_slash_update(
        &self,
        pin_id: String,
        pin_update: models::PinUpdate,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashUpdateResponse, ApiError>
    {
        info!("pins_slash_update(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", pin_id, pin_update, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Create product group promotions
    async fn product_group_promotions_slash_create(
        &self,
        ad_account_id: String,
        product_group_promotion_create_request: models::ProductGroupPromotionCreateRequest,
        context: &C) -> Result<ProductGroupPromotionsSlashCreateResponse, ApiError>
    {
        info!("product_group_promotions_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, product_group_promotion_create_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get a product group promotion by id
    async fn product_group_promotions_slash_get(
        &self,
        ad_account_id: String,
        product_group_promotion_id: String,
        context: &C) -> Result<ProductGroupPromotionsSlashGetResponse, ApiError>
    {
        info!("product_group_promotions_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, product_group_promotion_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get product group promotions
    async fn product_group_promotions_slash_list(
        &self,
        ad_account_id: String,
        product_group_promotion_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        ad_group_id: Option<String>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<ProductGroupPromotionsSlashListResponse, ApiError>
    {
        info!("product_group_promotions_slash_list(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, product_group_promotion_ids, entity_statuses, ad_group_id, page_size, order, bookmark, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Update product group promotions
    async fn product_group_promotions_slash_update(
        &self,
        ad_account_id: String,
        product_group_promotion_update_request: models::ProductGroupPromotionUpdateRequest,
        context: &C) -> Result<ProductGroupPromotionsSlashUpdateResponse, ApiError>
    {
        info!("product_group_promotions_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, product_group_promotion_update_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get product group analytics
    async fn product_groups_slash_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        product_group_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        context: &C) -> Result<ProductGroupsSlashAnalyticsResponse, ApiError>
    {
        info!("product_groups_slash_analytics(\"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, start_date, end_date, product_group_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get catalog product groups
    async fn ad_accounts_catalogs_product_groups_slash_list(
        &self,
        ad_account_id: String,
        feed_profile_id: Option<String>,
        context: &C) -> Result<AdAccountsCatalogsProductGroupsSlashListResponse, ApiError>
    {
        info!("ad_accounts_catalogs_product_groups_slash_list(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, feed_profile_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get ad accounts countries
    async fn ad_account_countries_slash_get(
        &self,
        context: &C) -> Result<AdAccountCountriesSlashGetResponse, ApiError>
    {
        info!("ad_account_countries_slash_get() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get available metrics' definitions
    async fn delivery_metrics_slash_get(
        &self,
        report_type: Option<String>,
        context: &C) -> Result<DeliveryMetricsSlashGetResponse, ApiError>
    {
        info!("delivery_metrics_slash_get({:?}) - X-Span-ID: {:?}", report_type, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get interest details
    async fn interest_targeting_options_slash_get(
        &self,
        interest_id: String,
        context: &C) -> Result<InterestTargetingOptionsSlashGetResponse, ApiError>
    {
        info!("interest_targeting_options_slash_get(\"{}\") - X-Span-ID: {:?}", interest_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get lead form questions
    async fn lead_form_questions_slash_get(
        &self,
        context: &C) -> Result<LeadFormQuestionsSlashGetResponse, ApiError>
    {
        info!("lead_form_questions_slash_get() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get metrics ready state
    async fn metrics_ready_state_slash_get(
        &self,
        date: String,
        context: &C) -> Result<MetricsReadyStateSlashGetResponse, ApiError>
    {
        info!("metrics_ready_state_slash_get(\"{}\") - X-Span-ID: {:?}", date, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get targeting options
    async fn targeting_options_slash_get(
        &self,
        targeting_type: String,
        client_id: Option<String>,
        oauth_signature: Option<String>,
        timestamp: Option<String>,
        context: &C) -> Result<TargetingOptionsSlashGetResponse, ApiError>
    {
        info!("targeting_options_slash_get(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", targeting_type, client_id, oauth_signature, timestamp, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Search pins by a given search term
    async fn search_partner_pins(
        &self,
        term: String,
        country_code: String,
        bookmark: Option<String>,
        locale: Option<String>,
        limit: Option<i32>,
        context: &C) -> Result<SearchPartnerPinsResponse, ApiError>
    {
        info!("search_partner_pins(\"{}\", \"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", term, country_code, bookmark, locale, limit, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Search user's boards
    async fn search_user_boards_slash_get(
        &self,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        query: Option<String>,
        context: &C) -> Result<SearchUserBoardsSlashGetResponse, ApiError>
    {
        info!("search_user_boards_slash_get({:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, query, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Search user's Pins
    async fn search_user_pins_slash_list(
        &self,
        query: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<SearchUserPinsSlashListResponse, ApiError>
    {
        info!("search_user_pins_slash_list(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", query, ad_account_id, bookmark, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List related terms
    async fn terms_related_slash_list(
        &self,
        terms: &Vec<String>,
        context: &C) -> Result<TermsRelatedSlashListResponse, ApiError>
    {
        info!("terms_related_slash_list({:?}) - X-Span-ID: {:?}", terms, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List suggested terms
    async fn terms_suggested_slash_list(
        &self,
        term: String,
        limit: Option<i32>,
        context: &C) -> Result<TermsSuggestedSlashListResponse, ApiError>
    {
        info!("terms_suggested_slash_list(\"{}\", {:?}) - X-Span-ID: {:?}", term, limit, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get terms of service
    async fn terms_of_service_slash_get(
        &self,
        ad_account_id: String,
        include_html: Option<bool>,
        tos_type: Option<String>,
        context: &C) -> Result<TermsOfServiceSlashGetResponse, ApiError>
    {
        info!("terms_of_service_slash_get(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, include_html, tos_type, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List following boards
    async fn boards_user_follows_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        explicit_following: Option<bool>,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardsUserFollowsSlashListResponse, ApiError>
    {
        info!("boards_user_follows_slash_list({:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", bookmark, page_size, explicit_following, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Follow user
    async fn follow_user_slash_update(
        &self,
        username: String,
        follow_user_request: models::FollowUserRequest,
        context: &C) -> Result<FollowUserSlashUpdateResponse, ApiError>
    {
        info!("follow_user_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", username, follow_user_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List followers
    async fn followers_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<FollowersSlashListResponse, ApiError>
    {
        info!("followers_slash_list({:?}, {:?}) - X-Span-ID: {:?}", bookmark, page_size, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List linked businesses
    async fn linked_business_accounts_slash_get(
        &self,
        context: &C) -> Result<LinkedBusinessAccountsSlashGetResponse, ApiError>
    {
        info!("linked_business_accounts_slash_get() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Unverify website
    async fn unverify_website_slash_delete(
        &self,
        website: String,
        context: &C) -> Result<UnverifyWebsiteSlashDeleteResponse, ApiError>
    {
        info!("unverify_website_slash_delete(\"{}\") - X-Span-ID: {:?}", website, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get user account analytics
    async fn user_account_slash_analytics(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        from_claimed_content: Option<String>,
        pin_format: Option<String>,
        app_types: Option<String>,
        content_type: Option<String>,
        source: Option<String>,
        metric_types: Option<&Vec<String>>,
        split_field: Option<String>,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountSlashAnalyticsResponse, ApiError>
    {
        info!("user_account_slash_analytics({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_date, end_date, from_claimed_content, pin_format, app_types, content_type, source, metric_types, split_field, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get user account top pins analytics
    async fn user_account_slash_analytics_slash_top_pins(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        sort_by: String,
        from_claimed_content: Option<String>,
        pin_format: Option<String>,
        app_types: Option<String>,
        content_type: Option<String>,
        source: Option<String>,
        metric_types: Option<&Vec<String>>,
        num_of_pins: Option<i32>,
        created_in_last_n_days: Option<i32>,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountSlashAnalyticsSlashTopPinsResponse, ApiError>
    {
        info!("user_account_slash_analytics_slash_top_pins({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_date, end_date, sort_by, from_claimed_content, pin_format, app_types, content_type, source, metric_types, num_of_pins, created_in_last_n_days, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get user account top video pins analytics
    async fn user_account_slash_analytics_slash_top_video_pins(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        sort_by: String,
        from_claimed_content: Option<String>,
        pin_format: Option<String>,
        app_types: Option<String>,
        content_type: Option<String>,
        source: Option<String>,
        metric_types: Option<&Vec<String>>,
        num_of_pins: Option<i32>,
        created_in_last_n_days: Option<i32>,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountSlashAnalyticsSlashTopVideoPinsResponse, ApiError>
    {
        info!("user_account_slash_analytics_slash_top_video_pins({}, {}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_date, end_date, sort_by, from_claimed_content, pin_format, app_types, content_type, source, metric_types, num_of_pins, created_in_last_n_days, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List following interests
    async fn user_account_slash_followed_interests(
        &self,
        username: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<UserAccountSlashFollowedInterestsResponse, ApiError>
    {
        info!("user_account_slash_followed_interests(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", username, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get user account
    async fn user_account_slash_get(
        &self,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountSlashGetResponse, ApiError>
    {
        info!("user_account_slash_get({:?}) - X-Span-ID: {:?}", ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// List following
    async fn user_following_slash_get(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        feed_type: Option<models::UserFollowingFeedType>,
        explicit_following: Option<bool>,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserFollowingSlashGetResponse, ApiError>
    {
        info!("user_following_slash_get({:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", bookmark, page_size, feed_type, explicit_following, ad_account_id, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get user websites
    async fn user_websites_slash_get(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<UserWebsitesSlashGetResponse, ApiError>
    {
        info!("user_websites_slash_get({:?}, {:?}) - X-Span-ID: {:?}", bookmark, page_size, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Verify website
    async fn verify_website_slash_update(
        &self,
        user_website_verify_request: models::UserWebsiteVerifyRequest,
        context: &C) -> Result<VerifyWebsiteSlashUpdateResponse, ApiError>
    {
        info!("verify_website_slash_update({:?}) - X-Span-ID: {:?}", user_website_verify_request, context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

    /// Get user verification code for website claiming
    async fn website_verification_slash_get(
        &self,
        context: &C) -> Result<WebsiteVerificationSlashGetResponse, ApiError>
    {
        info!("website_verification_slash_get() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Generic failure".into()))
    }

}
