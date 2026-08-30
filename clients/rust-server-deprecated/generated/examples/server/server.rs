//! Main library entry point for openapi_client implementation.

#![allow(unused_imports)]

use async_trait::async_trait;
use futures::{future, Stream, StreamExt, TryFutureExt, TryStreamExt};
use hyper::server::conn::http1;
use hyper_util::rt::TokioIo;
use hyper::service::{service_fn, Service};
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
    let addr: SocketAddr = addr.parse().expect("Failed to parse bind address");
    let listener = TcpListener::bind(&addr).await.unwrap();

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

            info!("Starting a server (with https)");
            loop {
                if let Ok((tcp, addr)) = listener.accept().await {
                    let ssl = Ssl::new(tls_acceptor.context()).unwrap();
                    let service = service.call(addr);

                    tokio::spawn(async move {
                        let tls = tokio_openssl::SslStream::new(ssl, tcp).map_err(|_| ())?;
                        let service = service.await.map_err(|_| ())?;

                        http1::Builder::new()
                            .serve_connection(TokioIo::new(tls), service)
                            .await
                            .map_err(|_| ())
                    });
                }
            }
        }
    } else {
        info!("Starting a server (over http, so no TLS)");
        println!("Listening on http://{}", addr);

        loop {
            // When an incoming TCP connection is received grab a TCP stream for
            // client<->server communication.
            //
            // Note, this is a .await point, this loop will loop forever but is not a busy loop. The
            // .await point allows the Tokio runtime to pull the task off of the thread until the task
            // has work to do. In this case, a connection arrives on the port we are listening on and
            // the task is woken up, at which point the task is then put back on a thread, and is
            // driven forward by the runtime, eventually yielding a TCP stream.
            let (tcp_stream, addr) = listener.accept().await.expect("Failed to accept connection");

            let service = service.call(addr).await.unwrap();
            let io = TokioIo::new(tcp_stream);
            // Spin up a new task in Tokio so we can continue to listen for new TCP connection on the
            // current task without waiting for the processing of the HTTP1 connection we just received
            // to finish
            tokio::task::spawn(async move {
                // Handle the connection from the client using HTTP1 and pass any
                // HTTP requests received on that connection to the `hello` function
                let result = http1::Builder::new()
                    .serve_connection(io, service)
                    .await;
                if let Err(err) = result
                {
                    println!("Error serving connection: {err:?}");
                }
            });
        }
    }
}

#[derive(Copy)]
pub struct Server<C> {
    marker: PhantomData<C>,
}

impl<C> Server<C> {
    pub fn new() -> Self {
        Server{marker: PhantomData}
    }
}

impl<C> Clone for Server<C> {
    fn clone(&self) -> Self {
        Self {
            marker: PhantomData,
        }
    }
}


use jsonwebtoken::{decode, encode, errors::Error as JwtError, Algorithm, DecodingKey, EncodingKey, Header, TokenData, Validation};
use serde::{Deserialize, Serialize};
use swagger::auth::Authorization;
use crate::server_auth;


use openapi_client::{
    Api,
    AdAccountsSlashCreateResponse,
    AdAccountsSlashListResponse,
    AdAccountSlashAnalyticsResponse,
    AdAccountTargetingAnalyticsSlashGetResponse,
    AdAccountsSlashGetResponse,
    AnalyticsSlashCreateConversionProductReportResponse,
    AnalyticsSlashCreateMmmReportResponse,
    AnalyticsSlashCreateReportResponse,
    AnalyticsSlashGetConversionProductReportResponse,
    AnalyticsSlashGetMmmReportResponse,
    AnalyticsSlashGetReportResponse,
    SandboxSlashDeleteResponse,
    TemplatesSlashListResponse,
    AnalyticsSlashCreateTemplateReportResponse,
    AdGroupsBidFloorSlashGetResponse,
    AdGroupsSlashAnalyticsResponse,
    AdGroupsSlashAudienceSizingResponse,
    AdGroupsSlashCreateResponse,
    AdGroupsSlashListResponse,
    AdGroupsSlashUpdateResponse,
    AdGroupsTargetingAnalyticsSlashGetResponse,
    GetAdGroupsByPromotionIdsSlashListResponse,
    AdGroupsDynamicTitlesSlashDownloadCsvResponse,
    AdGroupsDynamicTitlesSlashGetStatusResponse,
    AdGroupsDynamicTitlesSlashGetUploadUrlResponse,
    AdGroupsDynamicTitlesSlashProcessCsvResponse,
    AdGroupsSlashGetResponse,
    AdPreviewsSlashCreateResponse,
    AdTargetingAnalyticsSlashGetResponse,
    AdsSlashAnalyticsResponse,
    AdsSlashCreateResponse,
    AdsSlashListResponse,
    AdsSlashUpdateResponse,
    CampaignAdPreviewSlashCreateResponse,
    CampaignAdPreviewSlashDeleteResponse,
    CampaignAdPreviewSlashReadResponse,
    AdsSlashGetResponse,
    AdvancedAuctionItemsGetSlashPostResponse,
    AdvancedAuctionItemsSubmitSlashPostResponse,
    AudienceInsightsScopeAndTypeSlashGetResponse,
    AudienceInsightsSlashGetResponse,
    AdAccountsAudiencesSharedAccountsSlashListResponse,
    BusinessAccountAudiencesSharedAccountsSlashListResponse,
    SharedAudiencesForBusinessSlashListResponse,
    UpdateAdAccountToAdAccountSharedAudienceResponse,
    UpdateAdAccountToBusinessSharedAudienceResponse,
    UpdateBusinessToAdAccountSharedAudienceResponse,
    UpdateBusinessToBusinessSharedAudienceResponse,
    AudiencesSlashCreateResponse,
    AudiencesSlashListResponse,
    AudiencesSlashGetResponse,
    AudiencesSlashUpdateResponse,
    AdsCreditSlashRedeemResponse,
    AdsCreditsDiscountsSlashGetResponse,
    BillingInvoicesSlashGetResponse,
    BillingProfilesSlashGetResponse,
    SsioAccountsSlashGetResponse,
    SsioInsertionOrderSlashCreateResponse,
    SsioInsertionOrderSlashEditResponse,
    SsioInsertionOrdersStatusSlashGetByAdAccountResponse,
    SsioOrderLinesSlashGetByAdAccountResponse,
    BillingInvoiceDownloadSlashGetResponse,
    SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse,
    BoardsSlashCreateResponse,
    BoardsSlashListResponse,
    BoardSectionsSlashCreateResponse,
    BoardSectionsSlashListResponse,
    BoardsSlashDeleteResponse,
    BoardsSlashGetResponse,
    BoardsSlashListPinsResponse,
    BoardsSlashUpdateResponse,
    BoardSectionsSlashDeleteResponse,
    BoardSectionsSlashListPinsResponse,
    BoardSectionsSlashUpdateResponse,
    BulkDownloadSlashCreateResponse,
    BulkUpsertSlashCreateResponse,
    BulkRequestSlashGetResponse,
    AssetGroupSlashCreateResponse,
    AssetGroupSlashDeleteResponse,
    AssetGroupSlashUpdateResponse,
    BusinessAssetsSlashGetResponse,
    BusinessMembersAssetAccessSlashDeleteResponse,
    BusinessMembersAssetAccessSlashUpdateResponse,
    DeletePartnerAssetAccessHandlerImplResponse,
    UpdatePartnerAssetAccessHandlerImplResponse,
    BusinessAssetMembersSlashGetResponse,
    BusinessAssetPartnersSlashGetResponse,
    BusinessMemberAssetsSlashGetResponse,
    BusinessPartnerAssetAccessSlashGetResponse,
    RespondBusinessAccessInvitesResponse,
    AssetAccessRequestsSlashCreateResponse,
    CancelInvitesOrRequestsResponse,
    CreateAssetInvitesResponse,
    CreateMembershipOrPartnershipInvitesResponse,
    GetSlashInvitesResponse,
    GetSlashBusinessEmployersResponse,
    BrandAccountsSlashCreateResponse,
    DeleteBusinessMembershipResponse,
    DeleteBusinessPartnersResponse,
    GetSlashBusinessMembersResponse,
    GetSlashBusinessPartnersResponse,
    UpdateSlashBusinessMembershipsResponse,
    BrandAccountsSlashUpdateResponse,
    SystemUserSlashUpdateResponse,
    AdPinsSlashAnalyticsResponse,
    CampaignTargetingAnalyticsSlashGetResponse,
    CampaignsSlashAnalyticsResponse,
    CampaignsSlashCreateResponse,
    CampaignsSlashListResponse,
    CampaignsSlashUpdateResponse,
    GetCampaignDeliveryEstimatesResponse,
    CampaignsSlashGetResponse,
    FeedsSlashCreateResponse,
    FeedsSlashListResponse,
    FeedProcessingResultsSlashListResponse,
    FeedsSlashDeleteResponse,
    FeedsSlashGetResponse,
    FeedsSlashIngestResponse,
    FeedsSlashUpdateResponse,
    ItemsIssuesSlashListResponse,
    ItemsBatchSlashPostResponse,
    ItemsSlashPostResponse,
    ItemsBatchSlashGetResponse,
    CatalogsProductGroupsSlashCreateResponse,
    CatalogsProductGroupsSlashCreateManyResponse,
    CatalogsProductGroupsSlashDeleteManyResponse,
    CatalogsProductGroupsSlashListResponse,
    ProductsByProductGroupFilterSlashListResponse,
    CatalogsProductGroupPinsSlashListResponse,
    CatalogsProductGroupsSlashDeleteResponse,
    CatalogsProductGroupsSlashGetResponse,
    CatalogsProductGroupsSlashProductCountsGetResponse,
    CatalogsProductGroupsSlashUpdateResponse,
    ReportsSlashCreateResponse,
    ReportsSlashGetResponse,
    ReportsSlashStatsResponse,
    CatalogsLocalInventoryItemsBatchSlashOperateResponse,
    CatalogsLocalInventoryItemsSlashPostResponse,
    CatalogsLocalStoresSlashCreateResponse,
    CatalogsLocalStoresSlashDeleteResponse,
    CatalogsLocalStoresSlashListResponse,
    CatalogsLocalStoresSlashUpdateResponse,
    CatalogsSupplementalItemsBatchSlashGetResponse,
    CatalogsSlashAvailableFilterValuesResponse,
    CatalogsSlashCreateResponse,
    CatalogsSlashListResponse,
    ConversionDeletionRequestSlashCreateResponse,
    ConversionDeletionRequestSlashListResponse,
    ConversionDeletionRequestSlashDeleteResponse,
    ConversionDeletionRequestSlashGetResponse,
    ConversionEqsSlashListResponse,
    EventsSlashCreateResponse,
    ConversionTagsSlashCreateResponse,
    ConversionTagsSlashListResponse,
    OcpmEligibleConversionTagsSlashGetResponse,
    PageVisitConversionTagsSlashGetResponse,
    ConversionTagsSlashGetResponse,
    AdvertiserDefinedEventsSlashCreateResponse,
    AdvertiserDefinedEventsSlashDeleteResponse,
    AdvertiserDefinedEventsSlashGetResponse,
    AdvertiserDefinedEventsSlashUpdateResponse,
    CustomerListUploadsSlashCreateResponse,
    CustomerListUploadsSlashGetResponse,
    CustomerListUploadsSlashRunResponse,
    CustomerListsSlashCreateResponse,
    CustomerListsSlashListResponse,
    CustomerListsSlashGetResponse,
    CustomerListsSlashUpdateResponse,
    CustomerSegmentSlashCreateResponse,
    CustomerSegmentSlashListResponse,
    CustomerSegmentSlashUpdateResponse,
    IntegrationsCommerceSlashPostResponse,
    IntegrationsLogsSlashPostResponse,
    IntegrationsSlashGetListResponse,
    IntegrationsCommerceSlashDelResponse,
    IntegrationsCommerceSlashGetResponse,
    IntegrationsCommerceSlashPatchResponse,
    IntegrationsSlashGetByIdResponse,
    CountryKeywordsMetricsSlashGetResponse,
    KeywordsSlashCreateResponse,
    KeywordsSlashGetResponse,
    KeywordsSlashUpdateResponse,
    TrendingKeywordsSlashListResponse,
    LabelsSlashCreateResponse,
    LabelsSlashListResponse,
    LabelsSlashUpdateResponse,
    LabelsSlashApplyResponse,
    LabelsSlashRemoveResponse,
    AdAccountsSubscriptionsSlashGetListResponse,
    AdAccountsSubscriptionsSlashPostResponse,
    AdAccountsSubscriptionsSlashDelByIdResponse,
    AdAccountsSubscriptionsSlashGetByIdResponse,
    LeadFormsSlashCreateResponse,
    LeadFormsSlashListResponse,
    LeadFormsSlashUpdateResponse,
    LeadFormSlashGetResponse,
    LeadFormTestSlashCreateResponse,
    LeadsExportSlashCreateResponse,
    LeadsExportSlashGetResponse,
    MediaSlashCreateResponse,
    MediaSlashListResponse,
    MediaSlashGetResponse,
    MsotEventsSlashCreateResponse,
    NotificationSlashPostResponse,
    OauthSlashConversionTokenResponse,
    OauthSlashTokenResponse,
    TokenSlashRevokeResponse,
    OrderLinesSlashListResponse,
    OrderLinesSlashGetResponse,
    MultiPinsSlashAnalyticsResponse,
    PinsSlashCreateResponse,
    PinsSlashListResponse,
    PinsSlashAnalyticsResponse,
    PinsSlashDeleteResponse,
    PinsSlashGetResponse,
    PinsSlashSaveResponse,
    PinsSlashUpdateResponse,
    ProductGroupPromotionsSlashCreateResponse,
    ProductGroupPromotionsSlashListResponse,
    ProductGroupPromotionsSlashUpdateResponse,
    ProductGroupsSlashAnalyticsResponse,
    ProductGroupPromotionsSlashGetResponse,
    ProductTagsSlashBulkAddResponse,
    ProductTagsSlashBulkDeleteResponse,
    ProductTagsSlashListResponse,
    PromotionsSlashCreateResponse,
    PromotionsSlashListResponse,
    PromotionsSlashUpdateResponse,
    PromotionsSlashDeleteResponse,
    PromotionsSlashGetResponse,
    AdAccountCountriesSlashGetResponse,
    DeliveryMetricsSlashGetResponse,
    LeadFormQuestionsSlashGetResponse,
    MetricsReadyStateSlashGetResponse,
    InterestTargetingOptionsSlashGetResponse,
    TargetingOptionsSlashGetResponse,
    SchedulesSlashCreateResponse,
    SchedulesSlashListResponse,
    SchedulesSlashUpdateResponse,
    SearchPartnerPinsResponse,
    SearchUserBoardsSlashGetResponse,
    SearchUserPinsSlashListResponse,
    TargetingTemplateSlashCreateResponse,
    TargetingTemplateSlashListResponse,
    TargetingTemplateSlashUpdateResponse,
    TermsRelatedSlashListResponse,
    TermsSuggestedSlashListResponse,
    TermsOfServiceSlashGetResponse,
    TrendsEditorialArticlesSlashListResponse,
    TrendsFeaturedTopicsSlashListResponse,
    TrendsProductCategoriesDetailsSlashListResponse,
    TrendsProductCategoriesTrendingSlashListResponse,
    BoardsUserFollowsSlashListResponse,
    FollowersSlashListResponse,
    LinkedBusinessAccountsSlashGetResponse,
    UnverifyWebsiteSlashDeleteResponse,
    UserAccountSlashAnalyticsResponse,
    UserAccountSlashAnalyticsSlashTopPinsResponse,
    UserAccountSlashAnalyticsSlashTopVideoPinsResponse,
    UserAccountSlashGetResponse,
    UserFollowingSlashGetResponse,
    UserWebsitesSlashGetResponse,
    VerifyWebsiteSlashUpdateResponse,
    WebsiteVerificationSlashGetResponse,
    FollowUserSlashUpdateResponse,
    UserAccountSlashFollowedInterestsResponse,
};
use openapi_client::server::MakeService;
use std::error::Error;
use swagger::ApiError;

#[async_trait]
impl<C> Api<C> for Server<C> where C: Has<XSpanIdString> + Send + Sync
{
    /// Create ad account
    async fn ad_accounts_slash_create(
        &self,
        ad_account_create: models::AdAccountCreate,
        context: &C) -> Result<AdAccountsSlashCreateResponse, ApiError>
    {
        info!("ad_accounts_slash_create({:?}) - X-Span-ID: {:?}", ad_account_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List ad accounts
    async fn ad_accounts_slash_list(
        &self,
        include_shared_accounts: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<AdAccountsSlashListResponse, ApiError>
    {
        info!("ad_accounts_slash_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", include_shared_accounts, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get ad account analytics
    async fn ad_account_slash_analytics(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        columns: &Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        context: &C) -> Result<AdAccountSlashAnalyticsResponse, ApiError>
    {
        info!("ad_account_slash_analytics({}, {}, {:?}, {:?}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_date, end_date, columns, granularity, ad_account_id, click_window_days, engagement_window_days, view_window_days, conversion_report_time, reporting_timezone, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get targeting analytics for an ad account
    async fn ad_account_targeting_analytics_slash_get(
        &self,
        ad_account_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &Vec<models::AdsAnalyticsAccountTargetingType>,
        columns: &Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        attribution_types: Option<&Vec<models::ConversionReportAttributionType>>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        context: &C) -> Result<AdAccountTargetingAnalyticsSlashGetResponse, ApiError>
    {
        info!("ad_account_targeting_analytics_slash_get(\"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get ad account
    async fn ad_accounts_slash_get(
        &self,
        ad_account_id: String,
        context: &C) -> Result<AdAccountsSlashGetResponse, ApiError>
    {
        info!("ad_accounts_slash_get(\"{}\") - X-Span-ID: {:?}", ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create a request for a brand, category, SKU report
    async fn analytics_slash_create_conversion_product_report(
        &self,
        ad_account_id: String,
        conversion_product_report_create: models::ConversionProductReportCreate,
        context: &C) -> Result<AnalyticsSlashCreateConversionProductReportResponse, ApiError>
    {
        info!("analytics_slash_create_conversion_product_report(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, conversion_product_report_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create a request for a Marketing Mix Modeling (MMM) report
    async fn analytics_slash_create_mmm_report(
        &self,
        ad_account_id: String,
        mmm_report_create: models::MmmReportCreate,
        context: &C) -> Result<AnalyticsSlashCreateMmmReportResponse, ApiError>
    {
        info!("analytics_slash_create_mmm_report(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, mmm_report_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create async request for an account analytics report
    async fn analytics_slash_create_report(
        &self,
        ad_account_id: String,
        ads_analytics_create_async_request: models::AdsAnalyticsCreateAsyncRequest,
        context: &C) -> Result<AnalyticsSlashCreateReportResponse, ApiError>
    {
        info!("analytics_slash_create_report(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ads_analytics_create_async_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get advertiser brand, category, SKU report
    async fn analytics_slash_get_conversion_product_report(
        &self,
        ad_account_id: String,
        token: String,
        context: &C) -> Result<AnalyticsSlashGetConversionProductReportResponse, ApiError>
    {
        info!("analytics_slash_get_conversion_product_report(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, token, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get advertiser Marketing Mix Modeling (MMM) report.
    async fn analytics_slash_get_mmm_report(
        &self,
        ad_account_id: String,
        token: String,
        context: &C) -> Result<AnalyticsSlashGetMmmReportResponse, ApiError>
    {
        info!("analytics_slash_get_mmm_report(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, token, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get the account analytics report created by the async call
    async fn analytics_slash_get_report(
        &self,
        ad_account_id: String,
        token: String,
        context: &C) -> Result<AnalyticsSlashGetReportResponse, ApiError>
    {
        info!("analytics_slash_get_report(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, token, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete ads data for ad account in API Sandbox
    async fn sandbox_slash_delete(
        &self,
        ad_account_id: String,
        context: &C) -> Result<SandboxSlashDeleteResponse, ApiError>
    {
        info!("sandbox_slash_delete(\"{}\") - X-Span-ID: {:?}", ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List templates
    async fn templates_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        order: Option<models::PinterestLibPaginationOrder>,
        context: &C) -> Result<TemplatesSlashListResponse, ApiError>
    {
        info!("templates_slash_list(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, order, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
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
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get bid floors
    async fn ad_groups_bid_floor_slash_get(
        &self,
        ad_account_id: String,
        bid_floor_create: models::BidFloorCreate,
        context: &C) -> Result<AdGroupsBidFloorSlashGetResponse, ApiError>
    {
        info!("ad_groups_bid_floor_slash_get(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, bid_floor_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get ad group analytics
    async fn ad_groups_slash_analytics(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        ad_group_ids: &Vec<models::AdGroupIdType>,
        columns: &Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        aggregate_report_rows: Option<bool>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        context: &C) -> Result<AdGroupsSlashAnalyticsResponse, ApiError>
    {
        info!("ad_groups_slash_analytics({}, {}, {:?}, {:?}, {:?}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_date, end_date, ad_group_ids, columns, granularity, ad_account_id, click_window_days, engagement_window_days, view_window_days, conversion_report_time, aggregate_report_rows, reporting_timezone, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get audience sizing
    async fn ad_groups_slash_audience_sizing(
        &self,
        ad_account_id: String,
        ad_group_audience_sizing_create: models::AdGroupAudienceSizingCreate,
        context: &C) -> Result<AdGroupsSlashAudienceSizingResponse, ApiError>
    {
        info!("ad_groups_slash_audience_sizing(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ad_group_audience_sizing_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create ad groups
    async fn ad_groups_slash_create(
        &self,
        ad_account_id: String,
        ad_group_create_create: models::AdGroupBatchCreateRequest,
        context: &C) -> Result<AdGroupsSlashCreateResponse, ApiError>
    {
        info!("ad_groups_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ad_group_create_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List ad groups
    async fn ad_groups_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        order: Option<models::PinterestLibPaginationOrder>,
        campaign_ids: Option<&Vec<models::CampaignIdType>>,
        ad_group_ids: Option<&Vec<models::PinterestLibIntegerFormatType>>,
        entity_statuses: Option<&Vec<models::EntityStatus>>,
        translate_interests_to_names: Option<bool>,
        context: &C) -> Result<AdGroupsSlashListResponse, ApiError>
    {
        info!("ad_groups_slash_list(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, order, campaign_ids, ad_group_ids, entity_statuses, translate_interests_to_names, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update ad groups
    async fn ad_groups_slash_update(
        &self,
        ad_account_id: String,
        ad_group_update_batch_update: models::AdGroupBatchUpdateRequest,
        context: &C) -> Result<AdGroupsSlashUpdateResponse, ApiError>
    {
        info!("ad_groups_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ad_group_update_batch_update, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get targeting analytics for ad groups
    async fn ad_groups_targeting_analytics_slash_get(
        &self,
        ad_account_id: String,
        ad_group_ids: &Vec<models::AdGroupIdType>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &Vec<models::AdsAnalyticsAdGroupTargetingType>,
        columns: &Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        attribution_types: Option<&Vec<models::ConversionReportAttributionType>>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        sort_columns: Option<&Vec<String>>,
        sort_ascending: Option<bool>,
        context: &C) -> Result<AdGroupsTargetingAnalyticsSlashGetResponse, ApiError>
    {
        info!("ad_groups_targeting_analytics_slash_get(\"{}\", {:?}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, ad_group_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone, sort_columns, sort_ascending, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List of ad groups using promotions IDs.
    async fn get_ad_groups_by_promotion_ids_slash_list(
        &self,
        ad_account_id: String,
        promotion_ids: &Vec<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        order: Option<models::PinterestLibPaginationOrder>,
        context: &C) -> Result<GetAdGroupsByPromotionIdsSlashListResponse, ApiError>
    {
        info!("get_ad_groups_by_promotion_ids_slash_list(\"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, promotion_ids, bookmark, page_size, order, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get dynamic titles CSV download URL
    async fn ad_groups_dynamic_titles_slash_download_csv(
        &self,
        ad_account_id: String,
        ad_group_id: String,
        context: &C) -> Result<AdGroupsDynamicTitlesSlashDownloadCsvResponse, ApiError>
    {
        info!("ad_groups_dynamic_titles_slash_download_csv(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, ad_group_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get dynamic titles status
    async fn ad_groups_dynamic_titles_slash_get_status(
        &self,
        ad_account_id: String,
        ad_group_id: String,
        context: &C) -> Result<AdGroupsDynamicTitlesSlashGetStatusResponse, ApiError>
    {
        info!("ad_groups_dynamic_titles_slash_get_status(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, ad_group_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get dynamic titles upload URL
    async fn ad_groups_dynamic_titles_slash_get_upload_url(
        &self,
        ad_account_id: String,
        ad_group_id: String,
        context: &C) -> Result<AdGroupsDynamicTitlesSlashGetUploadUrlResponse, ApiError>
    {
        info!("ad_groups_dynamic_titles_slash_get_upload_url(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, ad_group_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Process dynamic titles CSV
    async fn ad_groups_dynamic_titles_slash_process_csv(
        &self,
        ad_account_id: String,
        ad_group_id: String,
        dynamic_titles_process_csv_create: models::DynamicTitlesProcessCsvCreate,
        context: &C) -> Result<AdGroupsDynamicTitlesSlashProcessCsvResponse, ApiError>
    {
        info!("ad_groups_dynamic_titles_slash_process_csv(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ad_group_id, dynamic_titles_process_csv_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get ad group
    async fn ad_groups_slash_get(
        &self,
        ad_group_id: String,
        ad_account_id: String,
        context: &C) -> Result<AdGroupsSlashGetResponse, ApiError>
    {
        info!("ad_groups_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_group_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create ad preview with pin or image
    async fn ad_previews_slash_create(
        &self,
        ad_account_id: String,
        ad_preview_request: models::AdPreviewRequest,
        context: &C) -> Result<AdPreviewsSlashCreateResponse, ApiError>
    {
        info!("ad_previews_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ad_preview_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get targeting analytics for ads
    async fn ad_targeting_analytics_slash_get(
        &self,
        ad_account_id: String,
        ad_ids: &Vec<models::PinterestLibIntegerFormatType>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &Vec<models::AdsAnalyticsAdTargetingType>,
        columns: &Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        click_window_days: Option<models::ConversionAttributionWindowDays>,
        engagement_window_days: Option<models::ConversionAttributionWindowDays>,
        view_window_days: Option<models::ConversionAttributionWindowDays>,
        conversion_report_time: Option<models::ConversionReportTimeType>,
        attribution_types: Option<&Vec<models::ConversionReportAttributionType>>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        sort_columns: Option<&Vec<String>>,
        sort_ascending: Option<bool>,
        context: &C) -> Result<AdTargetingAnalyticsSlashGetResponse, ApiError>
    {
        info!("ad_targeting_analytics_slash_get(\"{}\", {:?}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, ad_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone, sort_columns, sort_ascending, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get ad analytics
    async fn ads_slash_analytics(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        columns: &Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        pin_ids: Option<&Vec<String>>,
        ad_ids: Option<&Vec<models::PinterestLibIntegerFormatType>>,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        campaign_ids: Option<&Vec<models::CampaignIdType>>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        context: &C) -> Result<AdsSlashAnalyticsResponse, ApiError>
    {
        info!("ads_slash_analytics({}, {}, {:?}, {:?}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_date, end_date, columns, granularity, ad_account_id, pin_ids, ad_ids, click_window_days, engagement_window_days, view_window_days, conversion_report_time, campaign_ids, reporting_timezone, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create ads
    async fn ads_slash_create(
        &self,
        ad_account_id: String,
        ad_create: models::AdBatchCreateRequest,
        context: &C) -> Result<AdsSlashCreateResponse, ApiError>
    {
        info!("ads_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ad_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List ads
    async fn ads_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        order: Option<models::PinterestLibPaginationOrder>,
        campaign_ids: Option<&Vec<models::CampaignIdType>>,
        ad_group_ids: Option<&Vec<models::PinterestLibIntegerFormatType>>,
        ad_ids: Option<&Vec<models::PinterestLibIntegerFormatType>>,
        entity_statuses: Option<&Vec<models::EntityStatus>>,
        context: &C) -> Result<AdsSlashListResponse, ApiError>
    {
        info!("ads_slash_list(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, order, campaign_ids, ad_group_ids, ad_ids, entity_statuses, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update ads
    async fn ads_slash_update(
        &self,
        ad_account_id: String,
        ad_batch_update: models::AdBatchUpdateRequest,
        context: &C) -> Result<AdsSlashUpdateResponse, ApiError>
    {
        info!("ads_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ad_batch_update, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create ad preview records for one or more ad groups
    async fn campaign_ad_preview_slash_create(
        &self,
        ad_account_id: String,
        campaign_ad_preview_create: &Vec<models::CampaignAdPreviewCreate>,
        context: &C) -> Result<CampaignAdPreviewSlashCreateResponse, ApiError>
    {
        info!("campaign_ad_preview_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, campaign_ad_preview_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete ad preview records for one or more ad groups
    async fn campaign_ad_preview_slash_delete(
        &self,
        ad_group_ids: &Vec<models::AdGroupIdType>,
        ad_account_id: String,
        context: &C) -> Result<CampaignAdPreviewSlashDeleteResponse, ApiError>
    {
        info!("campaign_ad_preview_slash_delete({:?}, \"{}\") - X-Span-ID: {:?}", ad_group_ids, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Fetch ad preview records for one or more ad groups
    async fn campaign_ad_preview_slash_read(
        &self,
        ad_group_ids: &Vec<models::AdGroupIdType>,
        ad_account_id: String,
        context: &C) -> Result<CampaignAdPreviewSlashReadResponse, ApiError>
    {
        info!("campaign_ad_preview_slash_read({:?}, \"{}\") - X-Span-ID: {:?}", ad_group_ids, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get ad
    async fn ads_slash_get(
        &self,
        ad_id: String,
        ad_account_id: String,
        context: &C) -> Result<AdsSlashGetResponse, ApiError>
    {
        info!("ads_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get item bid options (POST)
    async fn advanced_auction_items_get_slash_post(
        &self,
        advanced_auction_items_get_request: models::AdvancedAuctionItemsGetRequest,
        ad_account_id: Option<String>,
        context: &C) -> Result<AdvancedAuctionItemsGetSlashPostResponse, ApiError>
    {
        info!("advanced_auction_items_get_slash_post({:?}, {:?}) - X-Span-ID: {:?}", advanced_auction_items_get_request, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Operate on item level bid options
    async fn advanced_auction_items_submit_slash_post(
        &self,
        advanced_auction_items_submit_request: models::AdvancedAuctionItemsSubmitRequest,
        ad_account_id: Option<String>,
        context: &C) -> Result<AdvancedAuctionItemsSubmitSlashPostResponse, ApiError>
    {
        info!("advanced_auction_items_submit_slash_post({:?}, {:?}) - X-Span-ID: {:?}", advanced_auction_items_submit_request, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get audience insights scope and type
    async fn audience_insights_scope_and_type_slash_get(
        &self,
        ad_account_id: String,
        context: &C) -> Result<AudienceInsightsScopeAndTypeSlashGetResponse, ApiError>
    {
        info!("audience_insights_scope_and_type_slash_get(\"{}\") - X-Span-ID: {:?}", ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get audience insights
    async fn audience_insights_slash_get(
        &self,
        ad_account_id: String,
        audience_insight_type: models::AudienceInsightType,
        context: &C) -> Result<AudienceInsightsSlashGetResponse, ApiError>
    {
        info!("audience_insights_slash_get(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, audience_insight_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List accounts with access to an audience owned by an ad account
    async fn ad_accounts_audiences_shared_accounts_slash_list(
        &self,
        audience_id: String,
        account_type: models::AudienceAccountType,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<AdAccountsAudiencesSharedAccountsSlashListResponse, ApiError>
    {
        info!("ad_accounts_audiences_shared_accounts_slash_list(\"{}\", {:?}, \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", audience_id, account_type, ad_account_id, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List accounts with access to an audience owned by a business
    async fn business_account_audiences_shared_accounts_slash_list(
        &self,
        business_id: String,
        audience_id: String,
        account_type: models::AudienceAccountType,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BusinessAccountAudiencesSharedAccountsSlashListResponse, ApiError>
    {
        info!("business_account_audiences_shared_accounts_slash_list(\"{}\", \"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", business_id, audience_id, account_type, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List received audiences for a business
    async fn shared_audiences_for_business_slash_list(
        &self,
        business_id: String,
        order: Option<models::Order>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<SharedAudiencesForBusinessSlashListResponse, ApiError>
    {
        info!("shared_audiences_for_business_slash_list(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", business_id, order, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update audience sharing between ad accounts
    async fn update_ad_account_to_ad_account_shared_audience(
        &self,
        ad_account_id: String,
        ad_account_to_ad_account_shared_audience_update_with_required_body: models::AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody,
        context: &C) -> Result<UpdateAdAccountToAdAccountSharedAudienceResponse, ApiError>
    {
        info!("update_ad_account_to_ad_account_shared_audience(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ad_account_to_ad_account_shared_audience_update_with_required_body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update audience sharing from an ad account to businesses
    async fn update_ad_account_to_business_shared_audience(
        &self,
        ad_account_id: String,
        ad_account_to_business_shared_audience_update_with_required_body: models::AdAccountToBusinessSharedAudienceUpdateWithRequiredBody,
        context: &C) -> Result<UpdateAdAccountToBusinessSharedAudienceResponse, ApiError>
    {
        info!("update_ad_account_to_business_shared_audience(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ad_account_to_business_shared_audience_update_with_required_body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update audience sharing from a business to ad accounts
    async fn update_business_to_ad_account_shared_audience(
        &self,
        business_id: String,
        business_to_ad_account_shared_audience_update_with_required_body: models::BusinessToAdAccountSharedAudienceUpdateWithRequiredBody,
        context: &C) -> Result<UpdateBusinessToAdAccountSharedAudienceResponse, ApiError>
    {
        info!("update_business_to_ad_account_shared_audience(\"{}\", {:?}) - X-Span-ID: {:?}", business_id, business_to_ad_account_shared_audience_update_with_required_body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update audience sharing between businesses
    async fn update_business_to_business_shared_audience(
        &self,
        business_id: String,
        business_to_business_shared_audience_update_with_required_body: models::BusinessToBusinessSharedAudienceUpdateWithRequiredBody,
        context: &C) -> Result<UpdateBusinessToBusinessSharedAudienceResponse, ApiError>
    {
        info!("update_business_to_business_shared_audience(\"{}\", {:?}) - X-Span-ID: {:?}", business_id, business_to_business_shared_audience_update_with_required_body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create audience
    async fn audiences_slash_create(
        &self,
        ad_account_id: String,
        ad_accounts_audience_create: models::AdAccountsAudienceCreate,
        context: &C) -> Result<AudiencesSlashCreateResponse, ApiError>
    {
        info!("audiences_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ad_accounts_audience_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List audiences
    async fn audiences_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        order: Option<models::PinterestLibPaginationOrder>,
        ownership_type: Option<models::AudienceOwnershipType>,
        exclude_nca: Option<bool>,
        context: &C) -> Result<AudiencesSlashListResponse, ApiError>
    {
        info!("audiences_slash_list(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, order, ownership_type, exclude_nca, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get audience
    async fn audiences_slash_get(
        &self,
        audience_id: String,
        ad_account_id: String,
        context: &C) -> Result<AudiencesSlashGetResponse, ApiError>
    {
        info!("audiences_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", audience_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update audience
    async fn audiences_slash_update(
        &self,
        audience_id: String,
        ad_account_id: String,
        ad_accounts_audience_update: models::AdAccountsAudienceUpdate,
        context: &C) -> Result<AudiencesSlashUpdateResponse, ApiError>
    {
        info!("audiences_slash_update(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", audience_id, ad_account_id, ad_accounts_audience_update, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Redeem ad credits
    async fn ads_credit_slash_redeem(
        &self,
        ad_account_id: String,
        ads_credit_redeem_create: models::AdsCreditRedeemCreate,
        context: &C) -> Result<AdsCreditSlashRedeemResponse, ApiError>
    {
        info!("ads_credit_slash_redeem(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ads_credit_redeem_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
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
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get billing invoices
    async fn billing_invoices_slash_get(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        order: Option<models::PinterestLibPaginationOrder>,
        sort: Option<models::BillingInvoiceSortField>,
        status: Option<models::BillingInvoiceStatus>,
        document_type: Option<models::BillingInvoiceDocumentType>,
        start_due_date: Option<chrono::naive::NaiveDate>,
        end_due_date: Option<chrono::naive::NaiveDate>,
        context: &C) -> Result<BillingInvoicesSlashGetResponse, ApiError>
    {
        info!("billing_invoices_slash_get(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, order, sort, status, document_type, start_due_date, end_due_date, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get billing profiles
    async fn billing_profiles_slash_get(
        &self,
        is_active: bool,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BillingProfilesSlashGetResponse, ApiError>
    {
        info!("billing_profiles_slash_get({}, \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", is_active, ad_account_id, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Salesforce account details including bill-to information.
    async fn ssio_accounts_slash_get(
        &self,
        ad_account_id: String,
        context: &C) -> Result<SsioAccountsSlashGetResponse, ApiError>
    {
        info!("ssio_accounts_slash_get(\"{}\") - X-Span-ID: {:?}", ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create insertion order through SSIO.
    async fn ssio_insertion_order_slash_create(
        &self,
        ad_account_id: String,
        ssio_insertion_order_create: models::SsioInsertionOrderCreate,
        context: &C) -> Result<SsioInsertionOrderSlashCreateResponse, ApiError>
    {
        info!("ssio_insertion_order_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ssio_insertion_order_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Edit insertion order through SSIO.
    async fn ssio_insertion_order_slash_edit(
        &self,
        ad_account_id: String,
        ssio_insertion_order_update: models::SsioInsertionOrderUpdate,
        context: &C) -> Result<SsioInsertionOrderSlashEditResponse, ApiError>
    {
        info!("ssio_insertion_order_slash_edit(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ssio_insertion_order_update, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
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
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Salesforce order lines by ad account id.
    async fn ssio_order_lines_slash_get_by_ad_account(
        &self,
        ad_account_id: String,
        pin_order_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<SsioOrderLinesSlashGetByAdAccountResponse, ApiError>
    {
        info!("ssio_order_lines_slash_get_by_ad_account(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, pin_order_id, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get download url for a billing invoice
    async fn billing_invoice_download_slash_get(
        &self,
        ad_account_id: String,
        billing_invoice_id: String,
        context: &C) -> Result<BillingInvoiceDownloadSlashGetResponse, ApiError>
    {
        info!("billing_invoice_download_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, billing_invoice_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get insertion order status by pin order id.
    async fn ssio_insertion_orders_status_slash_get_by_pin_order_id(
        &self,
        ad_account_id: String,
        pin_order_id: String,
        context: &C) -> Result<SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse, ApiError>
    {
        info!("ssio_insertion_orders_status_slash_get_by_pin_order_id(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, pin_order_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create board
    async fn boards_slash_create(
        &self,
        board_create: models::BoardCreate,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardsSlashCreateResponse, ApiError>
    {
        info!("boards_slash_create({:?}, {:?}) - X-Span-ID: {:?}", board_create, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List boards
    async fn boards_slash_list(
        &self,
        ad_account_id: Option<String>,
        privacy: Option<models::BoardPrivacyFilter>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BoardsSlashListResponse, ApiError>
    {
        info!("boards_slash_list({:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, privacy, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create board section
    async fn board_sections_slash_create(
        &self,
        board_id: String,
        board_section_create: models::BoardSectionCreate,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardSectionsSlashCreateResponse, ApiError>
    {
        info!("board_sections_slash_create(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", board_id, board_section_create, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
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
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete board
    async fn boards_slash_delete(
        &self,
        board_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardsSlashDeleteResponse, ApiError>
    {
        info!("boards_slash_delete(\"{}\", {:?}) - X-Span-ID: {:?}", board_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get board
    async fn boards_slash_get(
        &self,
        board_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardsSlashGetResponse, ApiError>
    {
        info!("boards_slash_get(\"{}\", {:?}) - X-Span-ID: {:?}", board_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List Pins on board
    async fn boards_slash_list_pins(
        &self,
        board_id: String,
        creative_types: Option<&Vec<models::CreativeType>>,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BoardsSlashListPinsResponse, ApiError>
    {
        info!("boards_slash_list_pins(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", board_id, creative_types, ad_account_id, pin_metrics, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update board
    async fn boards_slash_update(
        &self,
        board_id: String,
        board_with_update_privacy_update: models::BoardWithUpdatePrivacyUpdate,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardsSlashUpdateResponse, ApiError>
    {
        info!("boards_slash_update(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", board_id, board_with_update_privacy_update, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
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
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
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
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update board section
    async fn board_sections_slash_update(
        &self,
        board_id: String,
        section_id: String,
        board_section_update_with_required_body: models::BoardSectionUpdateWithRequiredBody,
        ad_account_id: Option<String>,
        context: &C) -> Result<BoardSectionsSlashUpdateResponse, ApiError>
    {
        info!("board_sections_slash_update(\"{}\", \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", board_id, section_id, board_section_update_with_required_body, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get advertiser entities in bulk
    async fn bulk_download_slash_create(
        &self,
        ad_account_id: String,
        bulk_download_create: models::BulkDownloadCreate,
        context: &C) -> Result<BulkDownloadSlashCreateResponse, ApiError>
    {
        info!("bulk_download_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, bulk_download_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create/update ad entities in bulk
    async fn bulk_upsert_slash_create(
        &self,
        ad_account_id: String,
        bulk_upsert_request: models::BulkUpsertRequest,
        context: &C) -> Result<BulkUpsertSlashCreateResponse, ApiError>
    {
        info!("bulk_upsert_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, bulk_upsert_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
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
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create a new asset group.
    async fn asset_group_slash_create(
        &self,
        business_id: String,
        asset_group_input_create: models::AssetGroupInputCreate,
        context: &C) -> Result<AssetGroupSlashCreateResponse, ApiError>
    {
        info!("asset_group_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", business_id, asset_group_input_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete asset groups.
    async fn asset_group_slash_delete(
        &self,
        business_id: String,
        asset_group_deletion_delete: models::AssetGroupDeletionDelete,
        context: &C) -> Result<AssetGroupSlashDeleteResponse, ApiError>
    {
        info!("asset_group_slash_delete(\"{}\", {:?}) - X-Span-ID: {:?}", business_id, asset_group_deletion_delete, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update asset groups.
    async fn asset_group_slash_update(
        &self,
        business_id: String,
        asset_group_modification_read_or_update: models::AssetGroupModificationReadOrUpdate,
        context: &C) -> Result<AssetGroupSlashUpdateResponse, ApiError>
    {
        info!("asset_group_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", business_id, asset_group_modification_read_or_update, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List business assets
    async fn business_assets_slash_get(
        &self,
        business_id: String,
        permissions: Option<&Vec<models::PermissionsWithOwner>>,
        child_asset_id: Option<String>,
        asset_group_id: Option<String>,
        asset_type: Option<models::BusinessAssetsGetAssetTypeParameter>,
        start_index: Option<i32>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BusinessAssetsSlashGetResponse, ApiError>
    {
        info!("business_assets_slash_get(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", business_id, permissions, child_asset_id, asset_group_id, asset_type, start_index, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete member access to asset
    async fn business_members_asset_access_slash_delete(
        &self,
        business_id: String,
        business_members_asset_access_delete_body: models::BusinessMembersAssetAccessDeleteBody,
        context: &C) -> Result<BusinessMembersAssetAccessSlashDeleteResponse, ApiError>
    {
        info!("business_members_asset_access_slash_delete(\"{}\", {:?}) - X-Span-ID: {:?}", business_id, business_members_asset_access_delete_body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Assign/Update member asset permissions
    async fn business_members_asset_access_slash_update(
        &self,
        business_id: String,
        update_member_asset_access_body: models::UpdateMemberAssetAccessBody,
        context: &C) -> Result<BusinessMembersAssetAccessSlashUpdateResponse, ApiError>
    {
        info!("business_members_asset_access_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", business_id, update_member_asset_access_body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete partner access to asset
    async fn delete_partner_asset_access_handler_impl(
        &self,
        business_id: String,
        delete_partner_asset_access_body: models::DeletePartnerAssetAccessBody,
        context: &C) -> Result<DeletePartnerAssetAccessHandlerImplResponse, ApiError>
    {
        info!("delete_partner_asset_access_handler_impl(\"{}\", {:?}) - X-Span-ID: {:?}", business_id, delete_partner_asset_access_body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Assign/Update partner asset permissions
    async fn update_partner_asset_access_handler_impl(
        &self,
        business_id: String,
        update_partner_asset_access_body: models::UpdatePartnerAssetAccessBody,
        context: &C) -> Result<UpdatePartnerAssetAccessHandlerImplResponse, ApiError>
    {
        info!("update_partner_asset_access_handler_impl(\"{}\", {:?}) - X-Span-ID: {:?}", business_id, update_partner_asset_access_body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get members with access to asset
    async fn business_asset_members_slash_get(
        &self,
        business_id: String,
        asset_id: String,
        start_index: Option<i32>,
        fetch_system_users: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BusinessAssetMembersSlashGetResponse, ApiError>
    {
        info!("business_asset_members_slash_get(\"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", business_id, asset_id, start_index, fetch_system_users, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get partners with access to asset
    async fn business_asset_partners_slash_get(
        &self,
        business_id: String,
        asset_id: String,
        start_index: Option<i32>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BusinessAssetPartnersSlashGetResponse, ApiError>
    {
        info!("business_asset_partners_slash_get(\"{}\", \"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", business_id, asset_id, start_index, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get assets assigned to a member
    async fn business_member_assets_slash_get(
        &self,
        business_id: String,
        member_id: String,
        asset_type: Option<models::BusinessMemberAssetsGetAssetTypeParameter>,
        start_index: Option<i32>,
        sort_by: Option<models::AssetSortBy>,
        sort_ascending: Option<bool>,
        search_by: Option<models::AssetSearchBy>,
        search_value: Option<String>,
        asset_permission_type: Option<models::AssetPermissionType>,
        ad_account_statuses: Option<&Vec<models::NonDraftEntityStatus>>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BusinessMemberAssetsSlashGetResponse, ApiError>
    {
        info!("business_member_assets_slash_get(\"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", business_id, member_id, asset_type, start_index, sort_by, sort_ascending, search_by, search_value, asset_permission_type, ad_account_statuses, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get assets assigned to a partner or assets assigned by a partner
    async fn business_partner_asset_access_slash_get(
        &self,
        business_id: String,
        partner_id: String,
        partner_type: Option<models::BusinessPartnerAssetAccessGetPartnerTypeParameter>,
        asset_type: Option<models::BusinessPartnerAssetAccessGetAssetTypeParameter>,
        start_index: Option<i32>,
        sort_by: Option<models::AssetSortBy>,
        sort_ascending: Option<bool>,
        search_by: Option<models::AssetSearchBy>,
        search_value: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BusinessPartnerAssetAccessSlashGetResponse, ApiError>
    {
        info!("business_partner_asset_access_slash_get(\"{}\", \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", business_id, partner_id, partner_type, asset_type, start_index, sort_by, sort_ascending, search_by, search_value, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Accept or decline an invite/request
    async fn respond_business_access_invites(
        &self,
        auth_respond_invites_body: models::AuthRespondInvitesBody,
        context: &C) -> Result<RespondBusinessAccessInvitesResponse, ApiError>
    {
        info!("respond_business_access_invites({:?}) - X-Span-ID: {:?}", auth_respond_invites_body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create a request to access an existing partner's assets.
    async fn asset_access_requests_slash_create(
        &self,
        business_id: String,
        create_asset_access_request_body: models::CreateAssetAccessRequestBody,
        context: &C) -> Result<AssetAccessRequestsSlashCreateResponse, ApiError>
    {
        info!("asset_access_requests_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", business_id, create_asset_access_request_body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Cancel invites/requests
    async fn cancel_invites_or_requests(
        &self,
        business_id: String,
        cancel_invites_request: models::CancelInvitesRequest,
        context: &C) -> Result<CancelInvitesOrRequestsResponse, ApiError>
    {
        info!("cancel_invites_or_requests(\"{}\", {:?}) - X-Span-ID: {:?}", business_id, cancel_invites_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update invite/request with an asset permission
    async fn create_asset_invites(
        &self,
        business_id: String,
        create_asset_invites_request: models::CreateAssetInvitesRequest,
        context: &C) -> Result<CreateAssetInvitesResponse, ApiError>
    {
        info!("create_asset_invites(\"{}\", {:?}) - X-Span-ID: {:?}", business_id, create_asset_invites_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create invites or requests
    async fn create_membership_or_partnership_invites(
        &self,
        business_id: String,
        create_membership_or_partnership_invites_body: models::CreateMembershipOrPartnershipInvitesBody,
        context: &C) -> Result<CreateMembershipOrPartnershipInvitesResponse, ApiError>
    {
        info!("create_membership_or_partnership_invites(\"{}\", {:?}) - X-Span-ID: {:?}", business_id, create_membership_or_partnership_invites_body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get invites/requests
    async fn get_slash_invites(
        &self,
        business_id: String,
        is_member: Option<bool>,
        invite_status: Option<&Vec<models::InviteFilterStatus>>,
        invite_type: Option<models::InviteType>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<GetSlashInvitesResponse, ApiError>
    {
        info!("get_slash_invites(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", business_id, is_member, invite_status, invite_type, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List business employers for user
    async fn get_slash_business_employers(
        &self,
        assets_summary: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<GetSlashBusinessEmployersResponse, ApiError>
    {
        info!("get_slash_business_employers({:?}, {:?}, {:?}) - X-Span-ID: {:?}", assets_summary, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create a Brand Account
    async fn brand_accounts_slash_create(
        &self,
        business_hierarchy_id: String,
        brand_account_create: models::BrandAccountCreate,
        context: &C) -> Result<BrandAccountsSlashCreateResponse, ApiError>
    {
        info!("brand_accounts_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", business_hierarchy_id, brand_account_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Terminate business memberships
    async fn delete_business_membership(
        &self,
        business_id: String,
        delete_business_membership_body: models::DeleteBusinessMembershipBody,
        context: &C) -> Result<DeleteBusinessMembershipResponse, ApiError>
    {
        info!("delete_business_membership(\"{}\", {:?}) - X-Span-ID: {:?}", business_id, delete_business_membership_body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Terminate business partnerships
    async fn delete_business_partners(
        &self,
        business_id: String,
        delete_business_partners_delete: models::DeleteBusinessPartnersDelete,
        context: &C) -> Result<DeleteBusinessPartnersResponse, ApiError>
    {
        info!("delete_business_partners(\"{}\", {:?}) - X-Span-ID: {:?}", business_id, delete_business_partners_delete, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get business members
    async fn get_slash_business_members(
        &self,
        business_id: String,
        fetch_system_users: Option<bool>,
        assets_summary: Option<bool>,
        business_roles: Option<&Vec<models::MemberBusinessRole>>,
        member_ids: Option<String>,
        start_index: Option<i32>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<GetSlashBusinessMembersResponse, ApiError>
    {
        info!("get_slash_business_members(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", business_id, fetch_system_users, assets_summary, business_roles, member_ids, start_index, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get business partners
    async fn get_slash_business_partners(
        &self,
        business_id: String,
        assets_summary: Option<bool>,
        partner_type: Option<models::PartnerType>,
        partner_ids: Option<String>,
        start_index: Option<i32>,
        sort_ascending: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<GetSlashBusinessPartnersResponse, ApiError>
    {
        info!("get_slash_business_partners(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", business_id, assets_summary, partner_type, partner_ids, start_index, sort_ascending, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update member's business role
    async fn update_slash_business_memberships(
        &self,
        business_id: String,
        business_membership_member: models::UpdateBusinessMembershipsBody,
        context: &C) -> Result<UpdateSlashBusinessMembershipsResponse, ApiError>
    {
        info!("update_slash_business_memberships(\"{}\", {:?}) - X-Span-ID: {:?}", business_id, business_membership_member, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update a Brand Account
    async fn brand_accounts_slash_update(
        &self,
        brand_account_id: String,
        business_hierarchy_id: String,
        brand_account_update: models::BrandAccountUpdate,
        context: &C) -> Result<BrandAccountsSlashUpdateResponse, ApiError>
    {
        info!("brand_accounts_slash_update(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", brand_account_id, business_hierarchy_id, brand_account_update, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update a system user information.
    async fn system_user_slash_update(
        &self,
        business_id: String,
        system_user_id: String,
        system_user_update_with_required_body: models::SystemUserUpdateWithRequiredBody,
        context: &C) -> Result<SystemUserSlashUpdateResponse, ApiError>
    {
        info!("system_user_slash_update(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", business_id, system_user_id, system_user_update_with_required_body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get pins analytics
    async fn ad_pins_slash_analytics(
        &self,
        campaign_id: String,
        pin_ids: &Vec<models::PinterestLibIntegerFormatType>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        columns: &Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        context: &C) -> Result<AdPinsSlashAnalyticsResponse, ApiError>
    {
        info!("ad_pins_slash_analytics(\"{}\", {:?}, {}, {}, {:?}, {:?}, \"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", campaign_id, pin_ids, start_date, end_date, columns, granularity, ad_account_id, click_window_days, engagement_window_days, view_window_days, conversion_report_time, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get targeting analytics for campaigns
    async fn campaign_targeting_analytics_slash_get(
        &self,
        ad_account_id: String,
        campaign_ids: &Vec<models::CampaignIdRequiredType>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        targeting_types: &Vec<models::AdsAnalyticsCampaignTargetingType>,
        columns: &Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        attribution_types: Option<&Vec<models::ConversionReportAttributionType>>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        context: &C) -> Result<CampaignTargetingAnalyticsSlashGetResponse, ApiError>
    {
        info!("campaign_targeting_analytics_slash_get(\"{}\", {:?}, {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, campaign_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types, reporting_timezone, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get campaign analytics
    async fn campaigns_slash_analytics(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        campaign_ids: &Vec<models::CampaignIdRequiredType>,
        columns: &Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        aggregate_report_rows: Option<bool>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        context: &C) -> Result<CampaignsSlashAnalyticsResponse, ApiError>
    {
        info!("campaigns_slash_analytics({}, {}, {:?}, {:?}, {:?}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_date, end_date, campaign_ids, columns, granularity, ad_account_id, click_window_days, engagement_window_days, view_window_days, conversion_report_time, aggregate_report_rows, reporting_timezone, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create campaigns
    async fn campaigns_slash_create(
        &self,
        ad_account_id: String,
        campaign_create_item: models::CampaignBatchCreateRequest,
        context: &C) -> Result<CampaignsSlashCreateResponse, ApiError>
    {
        info!("campaigns_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, campaign_create_item, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List campaigns
    async fn campaigns_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        order: Option<models::PinterestLibPaginationOrder>,
        campaign_ids: Option<&Vec<models::CampaignIdType>>,
        entity_statuses: Option<&Vec<models::EntityStatus>>,
        context: &C) -> Result<CampaignsSlashListResponse, ApiError>
    {
        info!("campaigns_slash_list(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, order, campaign_ids, entity_statuses, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update campaigns
    async fn campaigns_slash_update(
        &self,
        ad_account_id: String,
        campaign_batch_update_item: models::CampaignBatchUpdateRequest,
        context: &C) -> Result<CampaignsSlashUpdateResponse, ApiError>
    {
        info!("campaigns_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, campaign_batch_update_item, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get campaign delivery estimates
    async fn get_campaign_delivery_estimates(
        &self,
        ad_account_id: String,
        campaign_delivery_estimates_campaign: models::CampaignDeliveryEstimatesCampaignRequest,
        context: &C) -> Result<GetCampaignDeliveryEstimatesResponse, ApiError>
    {
        info!("get_campaign_delivery_estimates(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, campaign_delivery_estimates_campaign, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get campaign
    async fn campaigns_slash_get(
        &self,
        campaign_id: String,
        ad_account_id: String,
        context: &C) -> Result<CampaignsSlashGetResponse, ApiError>
    {
        info!("campaigns_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", campaign_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create feed
    async fn feeds_slash_create(
        &self,
        catalogs_feed_create_request_schema: models::CatalogsFeedCreateRequestSchema,
        ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashCreateResponse, ApiError>
    {
        info!("feeds_slash_create({:?}, {:?}) - X-Span-ID: {:?}", catalogs_feed_create_request_schema, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List feeds
    async fn feeds_slash_list(
        &self,
        catalog_id: Option<String>,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<FeedsSlashListResponse, ApiError>
    {
        info!("feeds_slash_list({:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", catalog_id, ad_account_id, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List feed processing results
    async fn feed_processing_results_slash_list(
        &self,
        feed_id: String,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<FeedProcessingResultsSlashListResponse, ApiError>
    {
        info!("feed_processing_results_slash_list(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", feed_id, ad_account_id, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete feed
    async fn feeds_slash_delete(
        &self,
        feed_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashDeleteResponse, ApiError>
    {
        info!("feeds_slash_delete(\"{}\", {:?}) - X-Span-ID: {:?}", feed_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get feed
    async fn feeds_slash_get(
        &self,
        feed_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashGetResponse, ApiError>
    {
        info!("feeds_slash_get(\"{}\", {:?}) - X-Span-ID: {:?}", feed_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Ingest feed items
    async fn feeds_slash_ingest(
        &self,
        feed_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashIngestResponse, ApiError>
    {
        info!("feeds_slash_ingest(\"{}\", {:?}) - X-Span-ID: {:?}", feed_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update feed
    async fn feeds_slash_update(
        &self,
        feed_id: String,
        catalogs_feed_update_request_schema: models::CatalogsFeedUpdateRequestSchema,
        ad_account_id: Option<String>,
        context: &C) -> Result<FeedsSlashUpdateResponse, ApiError>
    {
        info!("feeds_slash_update(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", feed_id, catalogs_feed_update_request_schema, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List item issues
    async fn items_issues_slash_list(
        &self,
        processing_result_id: String,
        item_numbers: Option<&Vec<i32>>,
        item_validation_issue: Option<models::CatalogsItemValidationIssue>,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<ItemsIssuesSlashListResponse, ApiError>
    {
        info!("items_issues_slash_list(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", processing_result_id, item_numbers, item_validation_issue, ad_account_id, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Operate on item batch
    async fn items_batch_slash_post(
        &self,
        catalogs_items_batch_post_request: models::CatalogsItemsBatchPostRequest,
        ad_account_id: Option<String>,
        context: &C) -> Result<ItemsBatchSlashPostResponse, ApiError>
    {
        info!("items_batch_slash_post({:?}, {:?}) - X-Span-ID: {:?}", catalogs_items_batch_post_request, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get catalogs items (POST)
    async fn items_slash_post(
        &self,
        catalogs_items_request: models::CatalogsItemsRequest,
        ad_account_id: Option<String>,
        context: &C) -> Result<ItemsSlashPostResponse, ApiError>
    {
        info!("items_slash_post({:?}, {:?}) - X-Span-ID: {:?}", catalogs_items_request, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get item batch status
    async fn items_batch_slash_get(
        &self,
        batch_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<ItemsBatchSlashGetResponse, ApiError>
    {
        info!("items_batch_slash_get(\"{}\", {:?}) - X-Span-ID: {:?}", batch_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create product group
    async fn catalogs_product_groups_slash_create(
        &self,
        catalogs_product_groups_create_request_schema: models::CatalogsProductGroupsCreateRequestSchema,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashCreateResponse, ApiError>
    {
        info!("catalogs_product_groups_slash_create({:?}, {:?}) - X-Span-ID: {:?}", catalogs_product_groups_create_request_schema, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create product groups
    async fn catalogs_product_groups_slash_create_many(
        &self,
        catalogs_product_groups_create_many_request_items: models::CatalogsProductGroupsCreateManyRequestSchema,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashCreateManyResponse, ApiError>
    {
        info!("catalogs_product_groups_slash_create_many({:?}, {:?}) - X-Span-ID: {:?}", catalogs_product_groups_create_many_request_items, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete product groups
    async fn catalogs_product_groups_slash_delete_many(
        &self,
        id: &Vec<i32>,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashDeleteManyResponse, ApiError>
    {
        info!("catalogs_product_groups_slash_delete_many({:?}, {:?}) - X-Span-ID: {:?}", id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List product groups
    async fn catalogs_product_groups_slash_list(
        &self,
        id: Option<&Vec<i32>>,
        feed_id: Option<String>,
        catalog_id: Option<String>,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<CatalogsProductGroupsSlashListResponse, ApiError>
    {
        info!("catalogs_product_groups_slash_list({:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", id, feed_id, catalog_id, ad_account_id, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List products by filter
    async fn products_by_product_group_filter_slash_list(
        &self,
        catalogs_list_products_by_filter_request: models::CatalogsListProductsByFilterRequest,
        bookmark: Option<String>,
        page_size: Option<i32>,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        context: &C) -> Result<ProductsByProductGroupFilterSlashListResponse, ApiError>
    {
        info!("products_by_product_group_filter_slash_list({:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", catalogs_list_products_by_filter_request, bookmark, page_size, ad_account_id, pin_metrics, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List products by product group
    async fn catalogs_product_group_pins_slash_list(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<CatalogsProductGroupPinsSlashListResponse, ApiError>
    {
        info!("catalogs_product_group_pins_slash_list(\"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", product_group_id, ad_account_id, pin_metrics, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete product group
    async fn catalogs_product_groups_slash_delete(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashDeleteResponse, ApiError>
    {
        info!("catalogs_product_groups_slash_delete(\"{}\", {:?}) - X-Span-ID: {:?}", product_group_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get product group
    async fn catalogs_product_groups_slash_get(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashGetResponse, ApiError>
    {
        info!("catalogs_product_groups_slash_get(\"{}\", {:?}) - X-Span-ID: {:?}", product_group_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get product counts
    async fn catalogs_product_groups_slash_product_counts_get(
        &self,
        product_group_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashProductCountsGetResponse, ApiError>
    {
        info!("catalogs_product_groups_slash_product_counts_get(\"{}\", {:?}) - X-Span-ID: {:?}", product_group_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update single product group
    async fn catalogs_product_groups_slash_update(
        &self,
        product_group_id: String,
        catalogs_product_groups_update_request_schema: models::CatalogsProductGroupsUpdateRequestSchema,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsProductGroupsSlashUpdateResponse, ApiError>
    {
        info!("catalogs_product_groups_slash_update(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", product_group_id, catalogs_product_groups_update_request_schema, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Build catalogs report
    async fn reports_slash_create(
        &self,
        catalogs_report_parameters: models::CatalogsReportParameters,
        ad_account_id: Option<String>,
        context: &C) -> Result<ReportsSlashCreateResponse, ApiError>
    {
        info!("reports_slash_create({:?}, {:?}) - X-Span-ID: {:?}", catalogs_report_parameters, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get catalogs report
    async fn reports_slash_get(
        &self,
        token: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<ReportsSlashGetResponse, ApiError>
    {
        info!("reports_slash_get(\"{}\", {:?}) - X-Span-ID: {:?}", token, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List report stats
    async fn reports_slash_stats(
        &self,
        parameters: models::SwaggerColonColonOneOf2LessThanModelsColonColonCatalogsRetailReportStatsParametersCommaModelsColonColonCatalogsHotelReportStatsParametersGreaterThan,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<ReportsSlashStatsResponse, ApiError>
    {
        info!("reports_slash_stats({:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", parameters, ad_account_id, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Operate on local inventory item batch
    async fn catalogs_local_inventory_items_batch_slash_operate(
        &self,
        catalog_id: String,
        local_inventory_items_batch_create: models::LocalInventoryItemsBatchCreate,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsLocalInventoryItemsBatchSlashOperateResponse, ApiError>
    {
        info!("catalogs_local_inventory_items_batch_slash_operate(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", catalog_id, local_inventory_items_batch_create, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get local inventory items (POST)
    async fn catalogs_local_inventory_items_slash_post(
        &self,
        catalog_id: String,
        local_inventory_items_get_create: models::LocalInventoryItemsGetCreate,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsLocalInventoryItemsSlashPostResponse, ApiError>
    {
        info!("catalogs_local_inventory_items_slash_post(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", catalog_id, local_inventory_items_get_create, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create local stores
    async fn catalogs_local_stores_slash_create(
        &self,
        catalog_id: String,
        local_store_create: &Vec<models::LocalStoreCreate>,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsLocalStoresSlashCreateResponse, ApiError>
    {
        info!("catalogs_local_stores_slash_create(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", catalog_id, local_store_create, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete local stores
    async fn catalogs_local_stores_slash_delete(
        &self,
        catalog_id: String,
        ids: &Vec<models::LocalStoreId>,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsLocalStoresSlashDeleteResponse, ApiError>
    {
        info!("catalogs_local_stores_slash_delete(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", catalog_id, ids, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List local stores
    async fn catalogs_local_stores_slash_list(
        &self,
        catalog_id: String,
        ids: Option<&Vec<models::LocalStoreId>>,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<CatalogsLocalStoresSlashListResponse, ApiError>
    {
        info!("catalogs_local_stores_slash_list(\"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", catalog_id, ids, ad_account_id, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update local stores
    async fn catalogs_local_stores_slash_update(
        &self,
        catalog_id: String,
        local_store_batch_update: &Vec<models::LocalStoreBatchUpdate>,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsLocalStoresSlashUpdateResponse, ApiError>
    {
        info!("catalogs_local_stores_slash_update(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", catalog_id, local_store_batch_update, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get supplemental items batch status
    async fn catalogs_supplemental_items_batch_slash_get(
        &self,
        catalog_id: String,
        batch_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsSupplementalItemsBatchSlashGetResponse, ApiError>
    {
        info!("catalogs_supplemental_items_batch_slash_get(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", catalog_id, batch_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List available filter values
    async fn catalogs_slash_available_filter_values(
        &self,
        catalog_id: String,
        feed_id: Option<String>,
        country: Option<models::Country>,
        language: Option<models::CatalogsLocale>,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsSlashAvailableFilterValuesResponse, ApiError>
    {
        info!("catalogs_slash_available_filter_values(\"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", catalog_id, feed_id, country, language, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create catalog
    async fn catalogs_slash_create(
        &self,
        catalog_create: models::CatalogCreate,
        ad_account_id: Option<String>,
        context: &C) -> Result<CatalogsSlashCreateResponse, ApiError>
    {
        info!("catalogs_slash_create({:?}, {:?}) - X-Span-ID: {:?}", catalog_create, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List catalogs
    async fn catalogs_slash_list(
        &self,
        ad_account_id: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<CatalogsSlashListResponse, ApiError>
    {
        info!("catalogs_slash_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create a conversion deletion request
    async fn conversion_deletion_request_slash_create(
        &self,
        ad_account_id: String,
        conversion_deletion_request_create: models::ConversionDeletionRequestCreate,
        context: &C) -> Result<ConversionDeletionRequestSlashCreateResponse, ApiError>
    {
        info!("conversion_deletion_request_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, conversion_deletion_request_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List conversion deletion requests
    async fn conversion_deletion_request_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        order: Option<models::PinterestLibPaginationOrder>,
        context: &C) -> Result<ConversionDeletionRequestSlashListResponse, ApiError>
    {
        info!("conversion_deletion_request_slash_list(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, order, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete a conversion deletion request
    async fn conversion_deletion_request_slash_delete(
        &self,
        request_id: String,
        ad_account_id: String,
        context: &C) -> Result<ConversionDeletionRequestSlashDeleteResponse, ApiError>
    {
        info!("conversion_deletion_request_slash_delete(\"{}\", \"{}\") - X-Span-ID: {:?}", request_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get a single conversion deletion request
    async fn conversion_deletion_request_slash_get(
        &self,
        request_id: String,
        ad_account_id: String,
        context: &C) -> Result<ConversionDeletionRequestSlashGetResponse, ApiError>
    {
        info!("conversion_deletion_request_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", request_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get event quality score (EQS)
    async fn conversion_eqs_slash_list(
        &self,
        lookback_period: models::LookbackPeriodOptions,
        ad_account_id: String,
        source_platform: Option<models::SourcePlatformOptions>,
        ingestion_source: Option<models::IngestionSourceOptions>,
        context: &C) -> Result<ConversionEqsSlashListResponse, ApiError>
    {
        info!("conversion_eqs_slash_list({:?}, \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", lookback_period, ad_account_id, source_platform, ingestion_source, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Send conversions
    async fn events_slash_create(
        &self,
        ad_account_id: String,
        conversion_events_create: models::ConversionEventsCreate,
        test: Option<bool>,
        context: &C) -> Result<EventsSlashCreateResponse, ApiError>
    {
        info!("events_slash_create(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, conversion_events_create, test, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create conversion tag
    async fn conversion_tags_slash_create(
        &self,
        ad_account_id: String,
        conversion_tag_create: models::ConversionTagCreate,
        context: &C) -> Result<ConversionTagsSlashCreateResponse, ApiError>
    {
        info!("conversion_tags_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, conversion_tag_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List conversion tags
    async fn conversion_tags_slash_list(
        &self,
        ad_account_id: String,
        filter_deleted: Option<bool>,
        context: &C) -> Result<ConversionTagsSlashListResponse, ApiError>
    {
        info!("conversion_tags_slash_list(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, filter_deleted, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Ocpm eligible conversion tags
    async fn ocpm_eligible_conversion_tags_slash_get(
        &self,
        ad_account_id: String,
        context: &C) -> Result<OcpmEligibleConversionTagsSlashGetResponse, ApiError>
    {
        info!("ocpm_eligible_conversion_tags_slash_get(\"{}\") - X-Span-ID: {:?}", ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get page visit conversion tags
    async fn page_visit_conversion_tags_slash_get(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        order: Option<models::PinterestLibPaginationOrder>,
        context: &C) -> Result<PageVisitConversionTagsSlashGetResponse, ApiError>
    {
        info!("page_visit_conversion_tags_slash_get(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, order, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get conversion tag
    async fn conversion_tags_slash_get(
        &self,
        ad_account_id: String,
        conversion_tag_id: String,
        context: &C) -> Result<ConversionTagsSlashGetResponse, ApiError>
    {
        info!("conversion_tags_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, conversion_tag_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create advertiser defined events
    async fn advertiser_defined_events_slash_create(
        &self,
        ad_account_id: String,
        advertiser_defined_events_create_request: models::AdvertiserDefinedEventsCreateRequest,
        context: &C) -> Result<AdvertiserDefinedEventsSlashCreateResponse, ApiError>
    {
        info!("advertiser_defined_events_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, advertiser_defined_events_create_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete advertiser defined events
    async fn advertiser_defined_events_slash_delete(
        &self,
        ad_account_id: String,
        event_names: &Vec<String>,
        context: &C) -> Result<AdvertiserDefinedEventsSlashDeleteResponse, ApiError>
    {
        info!("advertiser_defined_events_slash_delete(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, event_names, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get advertiser defined events
    async fn advertiser_defined_events_slash_get(
        &self,
        ad_account_id: String,
        context: &C) -> Result<AdvertiserDefinedEventsSlashGetResponse, ApiError>
    {
        info!("advertiser_defined_events_slash_get(\"{}\") - X-Span-ID: {:?}", ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update advertiser defined events
    async fn advertiser_defined_events_slash_update(
        &self,
        ad_account_id: String,
        advertiser_defined_events_create_request: models::AdvertiserDefinedEventsCreateRequest,
        context: &C) -> Result<AdvertiserDefinedEventsSlashUpdateResponse, ApiError>
    {
        info!("advertiser_defined_events_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, advertiser_defined_events_create_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create customer list upload
    async fn customer_list_uploads_slash_create(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        customer_list_upload_create_request: models::CustomerListUploadCreateRequest,
        context: &C) -> Result<CustomerListUploadsSlashCreateResponse, ApiError>
    {
        info!("customer_list_uploads_slash_create(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, customer_list_id, customer_list_upload_create_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get customer list upload
    async fn customer_list_uploads_slash_get(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        customer_list_upload_id: String,
        context: &C) -> Result<CustomerListUploadsSlashGetResponse, ApiError>
    {
        info!("customer_list_uploads_slash_get(\"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, customer_list_id, customer_list_upload_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Run customer list upload
    async fn customer_list_uploads_slash_run(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        customer_list_upload_id: String,
        context: &C) -> Result<CustomerListUploadsSlashRunResponse, ApiError>
    {
        info!("customer_list_uploads_slash_run(\"{}\", \"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, customer_list_id, customer_list_upload_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create customer lists
    async fn customer_lists_slash_create(
        &self,
        ad_account_id: String,
        customer_list_create: models::CustomerListCreate,
        context: &C) -> Result<CustomerListsSlashCreateResponse, ApiError>
    {
        info!("customer_lists_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, customer_list_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get customer lists
    async fn customer_lists_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        order: Option<models::PinterestLibPaginationOrder>,
        exclude_nca: Option<bool>,
        context: &C) -> Result<CustomerListsSlashListResponse, ApiError>
    {
        info!("customer_lists_slash_list(\"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, order, exclude_nca, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get customer list
    async fn customer_lists_slash_get(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        context: &C) -> Result<CustomerListsSlashGetResponse, ApiError>
    {
        info!("customer_lists_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, customer_list_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update customer list
    async fn customer_lists_slash_update(
        &self,
        ad_account_id: String,
        customer_list_id: String,
        customer_list_update_with_required_body: models::CustomerListUpdateWithRequiredBody,
        context: &C) -> Result<CustomerListsSlashUpdateResponse, ApiError>
    {
        info!("customer_lists_slash_update(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, customer_list_id, customer_list_update_with_required_body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create customer segments
    async fn customer_segment_slash_create(
        &self,
        ad_account_id: String,
        customer_segment_create: models::CustomerSegmentCreate,
        context: &C) -> Result<CustomerSegmentSlashCreateResponse, ApiError>
    {
        info!("customer_segment_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, customer_segment_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List customer segments
    async fn customer_segment_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        order: Option<models::PinterestLibPaginationOrder>,
        include_sizing: Option<bool>,
        search_query: Option<String>,
        context: &C) -> Result<CustomerSegmentSlashListResponse, ApiError>
    {
        info!("customer_segment_slash_list(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, order, include_sizing, search_query, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update customer segments
    async fn customer_segment_slash_update(
        &self,
        ad_account_id: String,
        customer_segment_update_request_update_with_required_body: models::CustomerSegmentUpdateRequestUpdateWithRequiredBody,
        context: &C) -> Result<CustomerSegmentSlashUpdateResponse, ApiError>
    {
        info!("customer_segment_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, customer_segment_update_request_update_with_required_body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create commerce integration
    async fn integrations_commerce_slash_post(
        &self,
        integration_metadata_create: models::IntegrationMetadataCreate,
        context: &C) -> Result<IntegrationsCommerceSlashPostResponse, ApiError>
    {
        info!("integrations_commerce_slash_post({:?}) - X-Span-ID: {:?}", integration_metadata_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Receives batched logs from integration applications.
    async fn integrations_logs_slash_post(
        &self,
        integration_logs_request_create: models::IntegrationLogsRequestCreate,
        context: &C) -> Result<IntegrationsLogsSlashPostResponse, ApiError>
    {
        info!("integrations_logs_slash_post({:?}) - X-Span-ID: {:?}", integration_logs_request_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get integration metadata list
    async fn integrations_slash_get_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<IntegrationsSlashGetListResponse, ApiError>
    {
        info!("integrations_slash_get_list({:?}, {:?}) - X-Span-ID: {:?}", bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete commerce integration
    async fn integrations_commerce_slash_del(
        &self,
        external_business_id: String,
        context: &C) -> Result<IntegrationsCommerceSlashDelResponse, ApiError>
    {
        info!("integrations_commerce_slash_del(\"{}\") - X-Span-ID: {:?}", external_business_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get commerce integration
    async fn integrations_commerce_slash_get(
        &self,
        external_business_id: String,
        context: &C) -> Result<IntegrationsCommerceSlashGetResponse, ApiError>
    {
        info!("integrations_commerce_slash_get(\"{}\") - X-Span-ID: {:?}", external_business_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update commerce integration
    async fn integrations_commerce_slash_patch(
        &self,
        external_business_id: String,
        integration_metadata_update: models::IntegrationMetadataUpdate,
        context: &C) -> Result<IntegrationsCommerceSlashPatchResponse, ApiError>
    {
        info!("integrations_commerce_slash_patch(\"{}\", {:?}) - X-Span-ID: {:?}", external_business_id, integration_metadata_update, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get integration metadata
    async fn integrations_slash_get_by_id(
        &self,
        id: String,
        context: &C) -> Result<IntegrationsSlashGetByIdResponse, ApiError>
    {
        info!("integrations_slash_get_by_id(\"{}\") - X-Span-ID: {:?}", id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
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
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create keywords
    async fn keywords_slash_create(
        &self,
        ad_account_id: String,
        keywords_create: models::KeywordsCreate,
        context: &C) -> Result<KeywordsSlashCreateResponse, ApiError>
    {
        info!("keywords_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, keywords_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get keywords
    async fn keywords_slash_get(
        &self,
        ad_account_id: String,
        campaign_id: Option<String>,
        ad_group_id: Option<String>,
        ad_group_ids: Option<&Vec<models::PinterestLibIntegerFormatType>>,
        match_types: Option<&Vec<models::MatchType>>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<KeywordsSlashGetResponse, ApiError>
    {
        info!("keywords_slash_get(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, campaign_id, ad_group_id, ad_group_ids, match_types, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update keywords
    async fn keywords_slash_update(
        &self,
        ad_account_id: String,
        keywords_update: models::KeywordsUpdate,
        context: &C) -> Result<KeywordsSlashUpdateResponse, ApiError>
    {
        info!("keywords_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, keywords_update, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List trending keywords
    async fn trending_keywords_slash_list(
        &self,
        region: models::TrendsSupportedRegion,
        trend_type: models::TrendType,
        interests: Option<&Vec<models::TrendsL1Interest>>,
        genders: Option<&Vec<models::TrendsGenderFilter>>,
        ages: Option<&Vec<models::TrendsAgeBucket>>,
        include_keywords: Option<&Vec<models::KeywordListItems>>,
        normalize_against_group: Option<bool>,
        limit: Option<i32>,
        include_demographics: Option<bool>,
        context: &C) -> Result<TrendingKeywordsSlashListResponse, ApiError>
    {
        info!("trending_keywords_slash_list({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", region, trend_type, interests, genders, ages, include_keywords, normalize_against_group, limit, include_demographics, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create labels
    async fn labels_slash_create(
        &self,
        ad_account_id: String,
        label_create_request: models::LabelCreateRequest,
        context: &C) -> Result<LabelsSlashCreateResponse, ApiError>
    {
        info!("labels_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, label_create_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List labels
    async fn labels_slash_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<models::CampaignIdType>>,
        label_ids: Option<&Vec<models::QueryLabelIdsItems>>,
        entity_statuses: Option<&Vec<models::QueryLabelEntityStatusesItems>>,
        label_types: Option<&Vec<models::QueryLabelTypesItems>>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<LabelsSlashListResponse, ApiError>
    {
        info!("labels_slash_list(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, campaign_ids, label_ids, entity_statuses, label_types, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update labels
    async fn labels_slash_update(
        &self,
        ad_account_id: String,
        label_update_request: models::LabelUpdateRequest,
        context: &C) -> Result<LabelsSlashUpdateResponse, ApiError>
    {
        info!("labels_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, label_update_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Apply label to entity
    async fn labels_slash_apply(
        &self,
        ad_account_id: String,
        label_id: String,
        labeled_entities_create: models::LabeledEntitiesCreate,
        context: &C) -> Result<LabelsSlashApplyResponse, ApiError>
    {
        info!("labels_slash_apply(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, label_id, labeled_entities_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Remove label from entities
    async fn labels_slash_remove(
        &self,
        ad_account_id: String,
        label_id: String,
        labeled_entities_create: models::LabeledEntitiesCreate,
        context: &C) -> Result<LabelsSlashRemoveResponse, ApiError>
    {
        info!("labels_slash_remove(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, label_id, labeled_entities_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get lead ads subscriptions
    async fn ad_accounts_subscriptions_slash_get_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<AdAccountsSubscriptionsSlashGetListResponse, ApiError>
    {
        info!("ad_accounts_subscriptions_slash_get_list(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create lead ads subscription
    async fn ad_accounts_subscriptions_slash_post(
        &self,
        ad_account_id: String,
        lead_subscription_post_params_create: models::LeadSubscriptionPostParamsCreate,
        context: &C) -> Result<AdAccountsSubscriptionsSlashPostResponse, ApiError>
    {
        info!("ad_accounts_subscriptions_slash_post(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, lead_subscription_post_params_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete lead ads subscription
    async fn ad_accounts_subscriptions_slash_del_by_id(
        &self,
        ad_account_id: String,
        subscription_id: String,
        context: &C) -> Result<AdAccountsSubscriptionsSlashDelByIdResponse, ApiError>
    {
        info!("ad_accounts_subscriptions_slash_del_by_id(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, subscription_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get lead ads subscription by ID
    async fn ad_accounts_subscriptions_slash_get_by_id(
        &self,
        ad_account_id: String,
        subscription_id: String,
        context: &C) -> Result<AdAccountsSubscriptionsSlashGetByIdResponse, ApiError>
    {
        info!("ad_accounts_subscriptions_slash_get_by_id(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, subscription_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create lead forms
    async fn lead_forms_slash_create(
        &self,
        ad_account_id: String,
        lead_form_create: models::LeadFormsCreateBody,
        context: &C) -> Result<LeadFormsSlashCreateResponse, ApiError>
    {
        info!("lead_forms_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, lead_form_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List lead forms
    async fn lead_forms_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        order: Option<models::PinterestLibPaginationOrder>,
        context: &C) -> Result<LeadFormsSlashListResponse, ApiError>
    {
        info!("lead_forms_slash_list(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, order, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update lead forms
    async fn lead_forms_slash_update(
        &self,
        ad_account_id: String,
        lead_form_batch_update: models::LeadFormsUpdateBody,
        context: &C) -> Result<LeadFormsSlashUpdateResponse, ApiError>
    {
        info!("lead_forms_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, lead_form_batch_update, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get lead form by id
    async fn lead_form_slash_get(
        &self,
        lead_form_id: String,
        ad_account_id: String,
        context: &C) -> Result<LeadFormSlashGetResponse, ApiError>
    {
        info!("lead_form_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", lead_form_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create lead form test data
    async fn lead_form_test_slash_create(
        &self,
        ad_account_id: String,
        lead_form_id: String,
        lead_form_test_create: models::LeadFormTestCreate,
        context: &C) -> Result<LeadFormTestSlashCreateResponse, ApiError>
    {
        info!("lead_form_test_slash_create(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, lead_form_id, lead_form_test_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create a request to export leads collected from a lead ad
    async fn leads_export_slash_create(
        &self,
        ad_account_id: String,
        leads_exports_create: models::LeadsExportsCreate,
        context: &C) -> Result<LeadsExportSlashCreateResponse, ApiError>
    {
        info!("leads_export_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, leads_exports_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get the lead export from the lead export create call
    async fn leads_export_slash_get(
        &self,
        ad_account_id: String,
        leads_export_id: String,
        context: &C) -> Result<LeadsExportSlashGetResponse, ApiError>
    {
        info!("leads_export_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, leads_export_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Register media upload
    async fn media_slash_create(
        &self,
        media_upload_create: models::MediaUploadCreate,
        context: &C) -> Result<MediaSlashCreateResponse, ApiError>
    {
        info!("media_slash_create({:?}) - X-Span-ID: {:?}", media_upload_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List media uploads
    async fn media_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<MediaSlashListResponse, ApiError>
    {
        info!("media_slash_list({:?}, {:?}) - X-Span-ID: {:?}", bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get media upload details
    async fn media_slash_get(
        &self,
        media_id: String,
        context: &C) -> Result<MediaSlashGetResponse, ApiError>
    {
        info!("media_slash_get(\"{}\") - X-Span-ID: {:?}", media_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Send Measurement Source Of Truth (MSOT) attributed conversion events
    async fn msot_events_slash_create(
        &self,
        ad_account_id: String,
        conversion_msot_events_create: models::ConversionMsotEventsCreate,
        context: &C) -> Result<MsotEventsSlashCreateResponse, ApiError>
    {
        info!("msot_events_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, conversion_msot_events_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Receive notifications from external partners.
    async fn notification_slash_post(
        &self,
        notification_post_request: models::NotificationPostRequest,
        context: &C) -> Result<NotificationSlashPostResponse, ApiError>
    {
        info!("notification_slash_post({:?}) - X-Span-ID: {:?}", notification_post_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Generate OAuth access token for conversion API
    async fn oauth_slash_conversion_token(
        &self,
        context: &C) -> Result<OauthSlashConversionTokenResponse, ApiError>
    {
        info!("oauth_slash_conversion_token() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Generate OAuth access token
    async fn oauth_slash_token(
        &self,
        grant_type: models::TokenGrantType,
        code: Option<String>,
        continuous_refresh: Option<String>,
        redirect_uri: Option<String>,
        refresh_token: Option<String>,
        scope: Option<String>,
        context: &C) -> Result<OauthSlashTokenResponse, ApiError>
    {
        info!("oauth_slash_token({:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", grant_type, code, continuous_refresh, redirect_uri, refresh_token, scope, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Revoke a token
    async fn token_slash_revoke(
        &self,
        token: String,
        token_type_hint: Option<models::TokenTypeHint>,
        context: &C) -> Result<TokenSlashRevokeResponse, ApiError>
    {
        info!("token_slash_revoke(\"{}\", {:?}) - X-Span-ID: {:?}", token, token_type_hint, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get order lines.
    async fn order_lines_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        order: Option<models::PinterestLibPaginationOrder>,
        context: &C) -> Result<OrderLinesSlashListResponse, ApiError>
    {
        info!("order_lines_slash_list(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, order, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get order line
    async fn order_lines_slash_get(
        &self,
        order_line_id: String,
        ad_account_id: String,
        context: &C) -> Result<OrderLinesSlashGetResponse, ApiError>
    {
        info!("order_lines_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", order_line_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get multiple Pin analytics
    async fn multi_pins_slash_analytics(
        &self,
        pin_ids: &Vec<models::PinterestLibIntegerFormatType>,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        metric_types: &Vec<models::MultiPinsAnalyticsMetricTypesItem>,
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        ad_account_id: Option<String>,
        context: &C) -> Result<MultiPinsSlashAnalyticsResponse, ApiError>
    {
        info!("multi_pins_slash_analytics({:?}, {}, {}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", pin_ids, start_date, end_date, metric_types, app_types, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create Pin
    async fn pins_slash_create(
        &self,
        pin_create: models::PinCreate,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashCreateResponse, ApiError>
    {
        info!("pins_slash_create({:?}, {:?}) - X-Span-ID: {:?}", pin_create, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List Pins
    async fn pins_slash_list(
        &self,
        pin_filter: Option<models::PinFilter>,
        pin_metrics: Option<bool>,
        include_protected_pins: Option<bool>,
        pin_type: Option<models::PinType>,
        creative_types: Option<&Vec<models::CreativeType>>,
        ad_account_id: Option<String>,
        domain: Option<String>,
        domains: Option<&Vec<String>>,
        include_product_tag_obj: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<PinsSlashListResponse, ApiError>
    {
        info!("pins_slash_list({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", pin_filter, pin_metrics, include_protected_pins, pin_type, creative_types, ad_account_id, domain, domains, include_product_tag_obj, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Pin analytics
    async fn pins_slash_analytics(
        &self,
        pin_id: String,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        metric_types: &Vec<models::QuerypinanalyticsmetrictypesItems>,
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        split_field: Option<models::PinsAnalyticsSplitFieldParameter>,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashAnalyticsResponse, ApiError>
    {
        info!("pins_slash_analytics(\"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", pin_id, start_date, end_date, metric_types, app_types, split_field, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete Pin
    async fn pins_slash_delete(
        &self,
        pin_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashDeleteResponse, ApiError>
    {
        info!("pins_slash_delete(\"{}\", {:?}) - X-Span-ID: {:?}", pin_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Pin
    async fn pins_slash_get(
        &self,
        pin_id: String,
        ad_account_id: Option<String>,
        pin_metrics: Option<bool>,
        context: &C) -> Result<PinsSlashGetResponse, ApiError>
    {
        info!("pins_slash_get(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", pin_id, ad_account_id, pin_metrics, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Save Pin
    async fn pins_slash_save(
        &self,
        pin_id: String,
        pins_save_request_create: models::PinsSaveRequestCreate,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsSlashSaveResponse, ApiError>
    {
        info!("pins_slash_save(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", pin_id, pins_save_request_create, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
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
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create product group promotions
    async fn product_group_promotions_slash_create(
        &self,
        ad_account_id: String,
        product_group_promotions_create: models::ProductGroupPromotionsCreate,
        context: &C) -> Result<ProductGroupPromotionsSlashCreateResponse, ApiError>
    {
        info!("product_group_promotions_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, product_group_promotions_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get product group promotions
    async fn product_group_promotions_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        order: Option<models::PinterestLibPaginationOrder>,
        product_group_promotion_ids: Option<&Vec<models::PinterestLibIntegerFormatType>>,
        entity_statuses: Option<&Vec<models::EntityStatus>>,
        ad_group_id: Option<String>,
        context: &C) -> Result<ProductGroupPromotionsSlashListResponse, ApiError>
    {
        info!("product_group_promotions_slash_list(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, order, product_group_promotion_ids, entity_statuses, ad_group_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update product group promotions
    async fn product_group_promotions_slash_update(
        &self,
        ad_account_id: String,
        product_group_promotions_update_with_required_body: models::ProductGroupPromotionsUpdateWithRequiredBody,
        context: &C) -> Result<ProductGroupPromotionsSlashUpdateResponse, ApiError>
    {
        info!("product_group_promotions_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, product_group_promotions_update_with_required_body, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get product group analytics
    async fn product_groups_slash_analytics(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        product_group_ids: &Vec<models::ProductGroupIdType>,
        columns: &Vec<models::ReportingColumnSync>,
        granularity: models::Granularity,
        ad_account_id: String,
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        reporting_timezone: Option<models::ReportingTimeZone>,
        context: &C) -> Result<ProductGroupsSlashAnalyticsResponse, ApiError>
    {
        info!("product_groups_slash_analytics({}, {}, {:?}, {:?}, {:?}, \"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_date, end_date, product_group_ids, columns, granularity, ad_account_id, click_window_days, engagement_window_days, view_window_days, conversion_report_time, reporting_timezone, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get a product group promotion by id
    async fn product_group_promotions_slash_get(
        &self,
        ad_account_id: String,
        product_group_promotion_id: String,
        context: &C) -> Result<ProductGroupPromotionsSlashGetResponse, ApiError>
    {
        info!("product_group_promotions_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, product_group_promotion_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Add product tags to pin
    async fn product_tags_slash_bulk_add(
        &self,
        pin_id: String,
        product_tags_bulk_add_request: models::ProductTagsBulkAddRequest,
        context: &C) -> Result<ProductTagsSlashBulkAddResponse, ApiError>
    {
        info!("product_tags_slash_bulk_add(\"{}\", {:?}) - X-Span-ID: {:?}", pin_id, product_tags_bulk_add_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete product tags from pin
    async fn product_tags_slash_bulk_delete(
        &self,
        pin_id: String,
        product_tags_bulk_delete_request: models::ProductTagsBulkDeleteRequest,
        context: &C) -> Result<ProductTagsSlashBulkDeleteResponse, ApiError>
    {
        info!("product_tags_slash_bulk_delete(\"{}\", {:?}) - X-Span-ID: {:?}", pin_id, product_tags_bulk_delete_request, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get product tags for pin
    async fn product_tags_slash_list(
        &self,
        pin_id: String,
        context: &C) -> Result<ProductTagsSlashListResponse, ApiError>
    {
        info!("product_tags_slash_list(\"{}\") - X-Span-ID: {:?}", pin_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create promotions
    async fn promotions_slash_create(
        &self,
        ad_account_id: String,
        promotion_create: models::PromotionCreateBatch,
        context: &C) -> Result<PromotionsSlashCreateResponse, ApiError>
    {
        info!("promotions_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, promotion_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get promotions
    async fn promotions_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        order: Option<models::PinterestLibPaginationOrder>,
        context: &C) -> Result<PromotionsSlashListResponse, ApiError>
    {
        info!("promotions_slash_list(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, order, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update promotions
    async fn promotions_slash_update(
        &self,
        ad_account_id: String,
        promotion_batch_update: models::PromotionUpdateBatch,
        context: &C) -> Result<PromotionsSlashUpdateResponse, ApiError>
    {
        info!("promotions_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, promotion_batch_update, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Delete promotion by id
    async fn promotions_slash_delete(
        &self,
        promotion_id: String,
        ad_account_id: String,
        context: &C) -> Result<PromotionsSlashDeleteResponse, ApiError>
    {
        info!("promotions_slash_delete(\"{}\", \"{}\") - X-Span-ID: {:?}", promotion_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get promotion by id
    async fn promotions_slash_get(
        &self,
        promotion_id: String,
        ad_account_id: String,
        context: &C) -> Result<PromotionsSlashGetResponse, ApiError>
    {
        info!("promotions_slash_get(\"{}\", \"{}\") - X-Span-ID: {:?}", promotion_id, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get ad accounts countries
    async fn ad_account_countries_slash_get(
        &self,
        context: &C) -> Result<AdAccountCountriesSlashGetResponse, ApiError>
    {
        info!("ad_account_countries_slash_get() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get available metrics' definitions
    async fn delivery_metrics_slash_get(
        &self,
        report_type: Option<models::ReportType>,
        context: &C) -> Result<DeliveryMetricsSlashGetResponse, ApiError>
    {
        info!("delivery_metrics_slash_get({:?}) - X-Span-ID: {:?}", report_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get lead form questions
    async fn lead_form_questions_slash_get(
        &self,
        context: &C) -> Result<LeadFormQuestionsSlashGetResponse, ApiError>
    {
        info!("lead_form_questions_slash_get() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get metrics ready state
    async fn metrics_ready_state_slash_get(
        &self,
        date: String,
        context: &C) -> Result<MetricsReadyStateSlashGetResponse, ApiError>
    {
        info!("metrics_ready_state_slash_get(\"{}\") - X-Span-ID: {:?}", date, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get interest details
    async fn interest_targeting_options_slash_get(
        &self,
        interest_id: String,
        context: &C) -> Result<InterestTargetingOptionsSlashGetResponse, ApiError>
    {
        info!("interest_targeting_options_slash_get(\"{}\") - X-Span-ID: {:?}", interest_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get targeting options
    async fn targeting_options_slash_get(
        &self,
        targeting_type: models::PublicTargetingType,
        ad_account_id: Option<String>,
        client_id: Option<String>,
        oauth_signature: Option<String>,
        timestamp: Option<String>,
        context: &C) -> Result<TargetingOptionsSlashGetResponse, ApiError>
    {
        info!("targeting_options_slash_get({:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", targeting_type, ad_account_id, client_id, oauth_signature, timestamp, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create schedules
    async fn schedules_slash_create(
        &self,
        ad_account_id: String,
        schedule_create: &Vec<models::ScheduleCreate>,
        context: &C) -> Result<SchedulesSlashCreateResponse, ApiError>
    {
        info!("schedules_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, schedule_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get Schedules
    async fn schedules_slash_list(
        &self,
        ad_account_id: String,
        entity_ids: &Vec<models::EntityId>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        order: Option<models::PinterestLibPaginationOrder>,
        schedule_statuses: Option<&Vec<models::ScheduleStatus>>,
        schedule_type: Option<models::ScheduleType>,
        context: &C) -> Result<SchedulesSlashListResponse, ApiError>
    {
        info!("schedules_slash_list(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, entity_ids, bookmark, page_size, order, schedule_statuses, schedule_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update schedules
    async fn schedules_slash_update(
        &self,
        ad_account_id: String,
        schedule_batch_update: &Vec<models::ScheduleBatchUpdate>,
        context: &C) -> Result<SchedulesSlashUpdateResponse, ApiError>
    {
        info!("schedules_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, schedule_batch_update, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
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
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Search user's boards
    async fn search_user_boards_slash_get(
        &self,
        ad_account_id: Option<String>,
        query: Option<String>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<SearchUserBoardsSlashGetResponse, ApiError>
    {
        info!("search_user_boards_slash_get({:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, query, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
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
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Create targeting templates
    async fn targeting_template_slash_create(
        &self,
        ad_account_id: String,
        targeting_template_create: models::TargetingTemplateCreate,
        context: &C) -> Result<TargetingTemplateSlashCreateResponse, ApiError>
    {
        info!("targeting_template_slash_create(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, targeting_template_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List targeting templates
    async fn targeting_template_slash_list(
        &self,
        ad_account_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        order: Option<models::PinterestLibPaginationOrder>,
        include_sizing: Option<bool>,
        search_query: Option<String>,
        context: &C) -> Result<TargetingTemplateSlashListResponse, ApiError>
    {
        info!("targeting_template_slash_list(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, bookmark, page_size, order, include_sizing, search_query, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Update targeting templates
    async fn targeting_template_slash_update(
        &self,
        ad_account_id: String,
        targeting_template_update_request_read_or_update: models::TargetingTemplateUpdateRequestReadOrUpdate,
        context: &C) -> Result<TargetingTemplateSlashUpdateResponse, ApiError>
    {
        info!("targeting_template_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, targeting_template_update_request_read_or_update, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List related terms
    async fn terms_related_slash_list(
        &self,
        terms: &Vec<String>,
        context: &C) -> Result<TermsRelatedSlashListResponse, ApiError>
    {
        info!("terms_related_slash_list({:?}) - X-Span-ID: {:?}", terms, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List suggested terms
    async fn terms_suggested_slash_list(
        &self,
        term: String,
        limit: Option<i32>,
        context: &C) -> Result<TermsSuggestedSlashListResponse, ApiError>
    {
        info!("terms_suggested_slash_list(\"{}\", {:?}) - X-Span-ID: {:?}", term, limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
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
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Returns editorial articles for a given region
    async fn trends_editorial_articles_slash_list(
        &self,
        region: models::ProductCategoryRegion,
        context: &C) -> Result<TrendsEditorialArticlesSlashListResponse, ApiError>
    {
        info!("trends_editorial_articles_slash_list({:?}) - X-Span-ID: {:?}", region, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get featured topics
    async fn trends_featured_topics_slash_list(
        &self,
        region: models::ProductCategoryRegion,
        interest: Option<models::InterestsEnum>,
        context: &C) -> Result<TrendsFeaturedTopicsSlashListResponse, ApiError>
    {
        info!("trends_featured_topics_slash_list({:?}, {:?}) - X-Span-ID: {:?}", region, interest, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get product category details
    async fn trends_product_categories_details_slash_list(
        &self,
        product_categories: &Vec<models::ProductCategoryEnum>,
        region: models::ProductCategoryRegion,
        lookback_window: Option<models::ProductCategoryDetailLookbackWindow>,
        engagement_type: Option<models::ProductCategoriesEngagementType>,
        context: &C) -> Result<TrendsProductCategoriesDetailsSlashListResponse, ApiError>
    {
        info!("trends_product_categories_details_slash_list({:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", product_categories, region, lookback_window, engagement_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get a list of growing Shopping Product Categories
    async fn trends_product_categories_trending_slash_list(
        &self,
        region: models::ProductCategoryRegion,
        verticals: Option<&Vec<models::VerticalProductCategory>>,
        ages: Option<&Vec<models::AgeTrendsBucket>>,
        genders: Option<&Vec<models::GenderBucket>>,
        engagement_type: Option<models::ProductCategoriesEngagementType>,
        context: &C) -> Result<TrendsProductCategoriesTrendingSlashListResponse, ApiError>
    {
        info!("trends_product_categories_trending_slash_list({:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", region, verticals, ages, genders, engagement_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List following boards
    async fn boards_user_follows_slash_list(
        &self,
        ad_account_id: Option<String>,
        explicit_following: Option<bool>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BoardsUserFollowsSlashListResponse, ApiError>
    {
        info!("boards_user_follows_slash_list({:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, explicit_following, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List followers
    async fn followers_slash_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<FollowersSlashListResponse, ApiError>
    {
        info!("followers_slash_list({:?}, {:?}) - X-Span-ID: {:?}", bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List linked businesses
    async fn linked_business_accounts_slash_get(
        &self,
        context: &C) -> Result<LinkedBusinessAccountsSlashGetResponse, ApiError>
    {
        info!("linked_business_accounts_slash_get() - X-Span-ID: {:?}", context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Unverify website
    async fn unverify_website_slash_delete(
        &self,
        website: String,
        context: &C) -> Result<UnverifyWebsiteSlashDeleteResponse, ApiError>
    {
        info!("unverify_website_slash_delete(\"{}\") - X-Span-ID: {:?}", website, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get user account analytics
    async fn user_account_slash_analytics(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        from_claimed_content: Option<models::UserAccountAnalyticsFromClaimedContentParameter>,
        pin_format: Option<models::UserAccountAnalyticsPinFormatParameter>,
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        content_type: Option<models::UserAccountAnalyticsContentTypeParameter>,
        source: Option<models::UserAccountAnalyticsSourceParameter>,
        metric_types: Option<&Vec<models::QuerymetrictypesItems>>,
        split_field: Option<models::UserAccountAnalyticsSplitFieldParameter>,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountSlashAnalyticsResponse, ApiError>
    {
        info!("user_account_slash_analytics({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_date, end_date, from_claimed_content, pin_format, app_types, content_type, source, metric_types, split_field, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get user account top pins analytics
    async fn user_account_slash_analytics_slash_top_pins(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        sort_by: models::TopPinsSortBy,
        from_claimed_content: Option<models::UserAccountAnalyticsFromClaimedContentParameter>,
        pin_format: Option<models::UserAccountAnalyticsPinFormatParameter>,
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        content_type: Option<models::UserAccountAnalyticsContentTypeParameter>,
        source: Option<models::UserAccountAnalyticsSourceParameter>,
        metric_types: Option<&Vec<models::QuerymetrictypesItems>>,
        num_of_pins: Option<i32>,
        created_in_last_n_days: Option<models::UserAccountAnalyticsTopPinsCreatedInLastNDaysParameter>,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountSlashAnalyticsSlashTopPinsResponse, ApiError>
    {
        info!("user_account_slash_analytics_slash_top_pins({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_date, end_date, sort_by, from_claimed_content, pin_format, app_types, content_type, source, metric_types, num_of_pins, created_in_last_n_days, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get user account top video pins analytics
    async fn user_account_slash_analytics_slash_top_video_pins(
        &self,
        start_date: chrono::naive::NaiveDate,
        end_date: chrono::naive::NaiveDate,
        sort_by: models::TopVideoPinsSortBy,
        from_claimed_content: Option<models::UserAccountAnalyticsFromClaimedContentParameter>,
        pin_format: Option<models::UserAccountAnalyticsPinFormatParameter>,
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        content_type: Option<models::UserAccountAnalyticsContentTypeParameter>,
        source: Option<models::UserAccountAnalyticsSourceParameter>,
        metric_types: Option<&Vec<models::QueryvideopinmetrictypesItems>>,
        num_of_pins: Option<i32>,
        created_in_last_n_days: Option<models::UserAccountAnalyticsTopPinsCreatedInLastNDaysParameter>,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountSlashAnalyticsSlashTopVideoPinsResponse, ApiError>
    {
        info!("user_account_slash_analytics_slash_top_video_pins({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_date, end_date, sort_by, from_claimed_content, pin_format, app_types, content_type, source, metric_types, num_of_pins, created_in_last_n_days, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get user account
    async fn user_account_slash_get(
        &self,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountSlashGetResponse, ApiError>
    {
        info!("user_account_slash_get({:?}) - X-Span-ID: {:?}", ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// List following
    async fn user_following_slash_get(
        &self,
        ad_account_id: Option<String>,
        explicit_following: Option<bool>,
        feed_type: Option<models::UserFollowingFeedType>,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<UserFollowingSlashGetResponse, ApiError>
    {
        info!("user_following_slash_get({:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, explicit_following, feed_type, bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get user websites
    async fn user_websites_slash_get(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<UserWebsitesSlashGetResponse, ApiError>
    {
        info!("user_websites_slash_get({:?}, {:?}) - X-Span-ID: {:?}", bookmark, page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Verify website
    async fn verify_website_slash_update(
        &self,
        user_website_create: models::UserWebsiteCreate,
        ad_account_id: Option<String>,
        context: &C) -> Result<VerifyWebsiteSlashUpdateResponse, ApiError>
    {
        info!("verify_website_slash_update({:?}, {:?}) - X-Span-ID: {:?}", user_website_create, ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Get user verification code for website claiming
    async fn website_verification_slash_get(
        &self,
        ad_account_id: Option<String>,
        context: &C) -> Result<WebsiteVerificationSlashGetResponse, ApiError>
    {
        info!("website_verification_slash_get({:?}) - X-Span-ID: {:?}", ad_account_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    /// Follow user
    async fn follow_user_slash_update(
        &self,
        username: String,
        follow_user_create: models::FollowUserCreate,
        context: &C) -> Result<FollowUserSlashUpdateResponse, ApiError>
    {
        info!("follow_user_slash_update(\"{}\", {:?}) - X-Span-ID: {:?}", username, follow_user_create, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
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
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

}
