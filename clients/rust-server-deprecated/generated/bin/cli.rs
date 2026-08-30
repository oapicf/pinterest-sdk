//! CLI tool driving the API client
use anyhow::{anyhow, Context, Result};
use clap::Parser;
use dialoguer::Confirm;
use log::{debug, info};
// models may be unused if all inputs are primitive types
#[allow(unused_imports)]
use openapi_client::{
    models, ApiNoContext, Client, ContextWrapperExt,
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
use simple_logger::SimpleLogger;
use swagger::{AuthData, ContextBuilder, EmptyContext, Push, XSpanIdString};

type ClientContext = swagger::make_context_ty!(
    ContextBuilder,
    EmptyContext,
    Option<AuthData>,
    XSpanIdString
);

#[derive(Parser, Debug)]
#[clap(
    name = "Pinterest REST API",
    version = "5.28.0",
    about = "CLI access to Pinterest REST API"
)]
struct Cli {
    #[clap(subcommand)]
    operation: Operation,

    /// Address or hostname of the server hosting this API, including optional port
    #[clap(short = 'a', long, default_value = "http://localhost")]
    server_address: String,

    /// Path to the client private key if using client-side TLS authentication
    #[cfg(all(feature = "client-tls", not(any(target_os = "macos", target_os = "windows", target_os = "ios"))))]
    #[clap(long, requires_all(&["client_certificate", "server_certificate"]))]
    client_key: Option<String>,

    /// Path to the client's public certificate associated with the private key
    #[cfg(all(feature = "client-tls", not(any(target_os = "macos", target_os = "windows", target_os = "ios"))))]
    #[clap(long, requires_all(&["client_key", "server_certificate"]))]
    client_certificate: Option<String>,

    /// Path to CA certificate used to authenticate the server
    #[cfg(all(feature = "client-tls", not(any(target_os = "macos", target_os = "windows", target_os = "ios"))))]
    #[clap(long)]
    server_certificate: Option<String>,

    /// If set, write output to file instead of stdout
    #[clap(short, long)]
    output_file: Option<String>,

    #[command(flatten)]
    verbosity: clap_verbosity_flag::Verbosity,

    /// Don't ask for any confirmation prompts
    #[allow(dead_code)]
    #[clap(short, long)]
    force: bool,

    /// Bearer token if used for authentication
    #[arg(env = "OPENAPI_CLIENT_BEARER_TOKEN", hide_env = true)]
    bearer_token: Option<String>,
}

#[derive(Parser, Debug)]
enum Operation {
    /// Create ad account
    AdAccountsSlashCreate {
        #[clap(value_parser = parse_json::<models::AdAccountCreate>)]
        ad_account_create: models::AdAccountCreate,
    },
    /// List ad accounts
    AdAccountsSlashList {
        /// Include shared ad accounts
        #[clap(short, long)]
        include_shared_accounts: Option<bool>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Get ad account analytics
    AdAccountSlashAnalytics {
        /// Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
        start_date: chrono::naive::NaiveDate,
        /// Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
        end_date: chrono::naive::NaiveDate,
        /// Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
        #[clap(value_parser = parse_json::<Vec<models::ReportingColumnSync>>, long)]
        columns: Vec<models::ReportingColumnSync>,
        ///   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
        #[clap(value_parser = parse_json::<models::Granularity>)]
        granularity: models::Granularity,
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsClickWindowDaysParameter>)]
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        /// Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsClickWindowDaysParameter>)]
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        /// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsViewWindowDaysParameter>)]
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        /// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsConversionReportTimeParameter>)]
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        /// Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
        #[clap(value_parser = parse_json::<models::ReportingTimeZone>)]
        reporting_timezone: Option<models::ReportingTimeZone>,
    },
    /// Get targeting analytics for an ad account
    AdAccountTargetingAnalyticsSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
        start_date: chrono::naive::NaiveDate,
        /// Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
        end_date: chrono::naive::NaiveDate,
        /// Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
        #[clap(value_parser = parse_json::<Vec<models::AdsAnalyticsAccountTargetingType>>, long)]
        targeting_types: Vec<models::AdsAnalyticsAccountTargetingType>,
        /// Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
        #[clap(value_parser = parse_json::<Vec<models::ReportingColumnSync>>, long)]
        columns: Vec<models::ReportingColumnSync>,
        ///   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
        #[clap(value_parser = parse_json::<models::Granularity>)]
        granularity: models::Granularity,
        /// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsClickWindowDaysParameter>)]
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        /// Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsClickWindowDaysParameter>)]
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        /// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsViewWindowDaysParameter>)]
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        /// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsConversionReportTimeParameter>)]
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        /// List of types of attribution for the conversion report
        #[clap(value_parser = parse_json::<Vec<models::ConversionReportAttributionType>>, long)]
        attribution_types: Option<Vec<models::ConversionReportAttributionType>>,
        /// Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
        #[clap(value_parser = parse_json::<models::ReportingTimeZone>)]
        reporting_timezone: Option<models::ReportingTimeZone>,
    },
    /// Get ad account
    AdAccountsSlashGet {
        ad_account_id: String,
    },
    /// Create a request for a brand, category, SKU report
    AnalyticsSlashCreateConversionProductReport {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::ConversionProductReportCreate>)]
        conversion_product_report_create: models::ConversionProductReportCreate,
    },
    /// Create a request for a Marketing Mix Modeling (MMM) report
    AnalyticsSlashCreateMmmReport {
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::MmmReportCreate>)]
        mmm_report_create: models::MmmReportCreate,
    },
    /// Create async request for an account analytics report
    AnalyticsSlashCreateReport {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::AdsAnalyticsCreateAsyncRequest>)]
        ads_analytics_create_async_request: models::AdsAnalyticsCreateAsyncRequest,
    },
    /// Get advertiser brand, category, SKU report
    AnalyticsSlashGetConversionProductReport {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Token returned from the post request creation call
        token: String,
    },
    /// Get advertiser Marketing Mix Modeling (MMM) report.
    AnalyticsSlashGetMmmReport {
        ad_account_id: String,
        /// Token returned from the post request creation call
        token: String,
    },
    /// Get the account analytics report created by the async call
    AnalyticsSlashGetReport {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Token returned from the post request creation call
        token: String,
    },
    /// Delete ads data for ad account in API Sandbox
    SandboxSlashDelete {
        /// Unique identifier of an ad account.
        ad_account_id: String,
    },
    /// List templates
    TemplatesSlashList {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
        /// The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
        #[clap(value_parser = parse_json::<models::PinterestLibPaginationOrder>)]
        order: Option<models::PinterestLibPaginationOrder>,
    },
    /// Create async request for an analytics report using a template
    AnalyticsSlashCreateTemplateReport {
        ad_account_id: String,
        /// Unique identifier of a template.
        template_id: String,
        /// Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.
        start_date: Option<chrono::naive::NaiveDate>,
        /// Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.
        end_date: Option<chrono::naive::NaiveDate>,
        ///   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
        #[clap(value_parser = parse_json::<models::Granularity>)]
        granularity: Option<models::Granularity>,
    },
    /// Get bid floors
    AdGroupsBidFloorSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::BidFloorCreate>)]
        bid_floor_create: models::BidFloorCreate,
    },
    /// Get ad group analytics
    AdGroupsSlashAnalytics {
        /// Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
        start_date: chrono::naive::NaiveDate,
        /// Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
        end_date: chrono::naive::NaiveDate,
        /// List of Ad group Ids to use to filter the results.
        #[clap(value_parser = parse_json::<Vec<models::AdGroupIdType>>, long)]
        ad_group_ids: Vec<models::AdGroupIdType>,
        /// Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
        #[clap(value_parser = parse_json::<Vec<models::ReportingColumnSync>>, long)]
        columns: Vec<models::ReportingColumnSync>,
        ///   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
        #[clap(value_parser = parse_json::<models::Granularity>)]
        granularity: models::Granularity,
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsClickWindowDaysParameter>)]
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        /// Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsClickWindowDaysParameter>)]
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        /// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsViewWindowDaysParameter>)]
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        /// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsConversionReportTimeParameter>)]
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        /// Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.
        #[clap(long)]
        aggregate_report_rows: Option<bool>,
        /// Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
        #[clap(value_parser = parse_json::<models::ReportingTimeZone>)]
        reporting_timezone: Option<models::ReportingTimeZone>,
    },
    /// Get audience sizing
    AdGroupsSlashAudienceSizing {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::AdGroupAudienceSizingCreate>)]
        ad_group_audience_sizing_create: models::AdGroupAudienceSizingCreate,
    },
    /// Create ad groups
    AdGroupsSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::AdGroupBatchCreateRequest>)]
        ad_group_create_create: models::AdGroupBatchCreateRequest,
    },
    /// List ad groups
    AdGroupsSlashList {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
        /// The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
        #[clap(value_parser = parse_json::<models::PinterestLibPaginationOrder>)]
        order: Option<models::PinterestLibPaginationOrder>,
        /// List of Campaign Ids to use to filter the results.
        #[clap(value_parser = parse_json::<Vec<models::CampaignIdType>>, long)]
        campaign_ids: Option<Vec<models::CampaignIdType>>,
        /// List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
        #[clap(value_parser = parse_json::<Vec<models::PinterestLibIntegerFormatType>>, long)]
        ad_group_ids: Option<Vec<models::PinterestLibIntegerFormatType>>,
        /// Entity status
        #[clap(value_parser = parse_json::<Vec<models::EntityStatus>>, long)]
        entity_statuses: Option<Vec<models::EntityStatus>>,
        /// Return interests as text names (if value is true) rather than topic IDs.
        #[clap(short, long)]
        translate_interests_to_names: Option<bool>,
    },
    /// Update ad groups
    AdGroupsSlashUpdate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::AdGroupBatchUpdateRequest>)]
        ad_group_update_batch_update: models::AdGroupBatchUpdateRequest,
    },
    /// Get targeting analytics for ad groups
    AdGroupsTargetingAnalyticsSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// List of Ad group Ids to use to filter the results.
        #[clap(value_parser = parse_json::<Vec<models::AdGroupIdType>>, long)]
        ad_group_ids: Vec<models::AdGroupIdType>,
        /// Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
        start_date: chrono::naive::NaiveDate,
        /// Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
        end_date: chrono::naive::NaiveDate,
        /// Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users.
        #[clap(value_parser = parse_json::<Vec<models::AdsAnalyticsAdGroupTargetingType>>, long)]
        targeting_types: Vec<models::AdsAnalyticsAdGroupTargetingType>,
        /// Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
        #[clap(value_parser = parse_json::<Vec<models::ReportingColumnSync>>, long)]
        columns: Vec<models::ReportingColumnSync>,
        ///   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
        #[clap(value_parser = parse_json::<models::Granularity>)]
        granularity: models::Granularity,
        /// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsClickWindowDaysParameter>)]
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        /// Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsClickWindowDaysParameter>)]
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        /// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsViewWindowDaysParameter>)]
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        /// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsConversionReportTimeParameter>)]
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        /// List of types of attribution for the conversion report
        #[clap(value_parser = parse_json::<Vec<models::ConversionReportAttributionType>>, long)]
        attribution_types: Option<Vec<models::ConversionReportAttributionType>>,
        /// Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
        #[clap(value_parser = parse_json::<models::ReportingTimeZone>)]
        reporting_timezone: Option<models::ReportingTimeZone>,
        /// Sort Columns.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        sort_columns: Option<Vec<String>>,
        /// Sort ascending.
        #[clap(short, long)]
        sort_ascending: Option<bool>,
    },
    /// List of ad groups using promotions IDs.
    GetAdGroupsByPromotionIdsSlashList {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// List of Promotion IDs to use to filter the results.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        promotion_ids: Vec<String>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
        /// The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
        #[clap(value_parser = parse_json::<models::PinterestLibPaginationOrder>)]
        order: Option<models::PinterestLibPaginationOrder>,
    },
    /// Get dynamic titles CSV download URL
    AdGroupsDynamicTitlesSlashDownloadCsv {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Ad group ID.
        ad_group_id: String,
    },
    /// Get dynamic titles status
    AdGroupsDynamicTitlesSlashGetStatus {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Ad group ID.
        ad_group_id: String,
    },
    /// Get dynamic titles upload URL
    AdGroupsDynamicTitlesSlashGetUploadUrl {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Ad group ID.
        ad_group_id: String,
    },
    /// Process dynamic titles CSV
    AdGroupsDynamicTitlesSlashProcessCsv {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Ad group ID.
        ad_group_id: String,
        #[clap(value_parser = parse_json::<models::DynamicTitlesProcessCsvCreate>)]
        dynamic_titles_process_csv_create: models::DynamicTitlesProcessCsvCreate,
    },
    /// Get ad group
    AdGroupsSlashGet {
        /// Ad group ID.
        ad_group_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: String,
    },
    /// Create ad preview with pin or image
    AdPreviewsSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::AdPreviewRequest>)]
        ad_preview_request: models::AdPreviewRequest,
    },
    /// Get targeting analytics for ads
    AdTargetingAnalyticsSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// List of Ad Ids to use to filter the results.
        #[clap(value_parser = parse_json::<Vec<models::PinterestLibIntegerFormatType>>, long)]
        ad_ids: Vec<models::PinterestLibIntegerFormatType>,
        /// Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
        start_date: chrono::naive::NaiveDate,
        /// Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
        end_date: chrono::naive::NaiveDate,
        /// Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
        #[clap(value_parser = parse_json::<Vec<models::AdsAnalyticsAdTargetingType>>, long)]
        targeting_types: Vec<models::AdsAnalyticsAdTargetingType>,
        /// Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
        #[clap(value_parser = parse_json::<Vec<models::ReportingColumnSync>>, long)]
        columns: Vec<models::ReportingColumnSync>,
        ///   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
        #[clap(value_parser = parse_json::<models::Granularity>)]
        granularity: models::Granularity,
        /// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
        #[clap(value_parser = parse_json::<models::ConversionAttributionWindowDays>)]
        click_window_days: Option<models::ConversionAttributionWindowDays>,
        /// Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
        #[clap(value_parser = parse_json::<models::ConversionAttributionWindowDays>)]
        engagement_window_days: Option<models::ConversionAttributionWindowDays>,
        /// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
        #[clap(value_parser = parse_json::<models::ConversionAttributionWindowDays>)]
        view_window_days: Option<models::ConversionAttributionWindowDays>,
        /// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
        #[clap(value_parser = parse_json::<models::ConversionReportTimeType>)]
        conversion_report_time: Option<models::ConversionReportTimeType>,
        /// List of types of attribution for the conversion report
        #[clap(value_parser = parse_json::<Vec<models::ConversionReportAttributionType>>, long)]
        attribution_types: Option<Vec<models::ConversionReportAttributionType>>,
        /// Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
        #[clap(value_parser = parse_json::<models::ReportingTimeZone>)]
        reporting_timezone: Option<models::ReportingTimeZone>,
        /// Sort Columns.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        sort_columns: Option<Vec<String>>,
        /// Sort ascending.
        #[clap(short, long)]
        sort_ascending: Option<bool>,
    },
    /// Get ad analytics
    AdsSlashAnalytics {
        /// Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
        start_date: chrono::naive::NaiveDate,
        /// Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
        end_date: chrono::naive::NaiveDate,
        /// Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
        #[clap(value_parser = parse_json::<Vec<models::ReportingColumnSync>>, long)]
        columns: Vec<models::ReportingColumnSync>,
        ///   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
        #[clap(value_parser = parse_json::<models::Granularity>)]
        granularity: models::Granularity,
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// List of Pin IDs.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        pin_ids: Option<Vec<String>>,
        /// List of Ad Ids to use to filter the results.
        #[clap(value_parser = parse_json::<Vec<models::PinterestLibIntegerFormatType>>, long)]
        ad_ids: Option<Vec<models::PinterestLibIntegerFormatType>>,
        /// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsClickWindowDaysParameter>)]
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        /// Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsClickWindowDaysParameter>)]
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        /// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsViewWindowDaysParameter>)]
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        /// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsConversionReportTimeParameter>)]
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        /// List of Campaign Ids to use to filter the results.
        #[clap(value_parser = parse_json::<Vec<models::CampaignIdType>>, long)]
        campaign_ids: Option<Vec<models::CampaignIdType>>,
        /// Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
        #[clap(value_parser = parse_json::<models::ReportingTimeZone>)]
        reporting_timezone: Option<models::ReportingTimeZone>,
    },
    /// Create ads
    AdsSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::AdBatchCreateRequest>)]
        ad_create: models::AdBatchCreateRequest,
    },
    /// List ads
    AdsSlashList {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
        /// The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
        #[clap(value_parser = parse_json::<models::PinterestLibPaginationOrder>)]
        order: Option<models::PinterestLibPaginationOrder>,
        /// List of Campaign Ids to use to filter the results.
        #[clap(value_parser = parse_json::<Vec<models::CampaignIdType>>, long)]
        campaign_ids: Option<Vec<models::CampaignIdType>>,
        /// List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
        #[clap(value_parser = parse_json::<Vec<models::PinterestLibIntegerFormatType>>, long)]
        ad_group_ids: Option<Vec<models::PinterestLibIntegerFormatType>>,
        /// List of Ad Ids to use to filter the results.
        #[clap(value_parser = parse_json::<Vec<models::PinterestLibIntegerFormatType>>, long)]
        ad_ids: Option<Vec<models::PinterestLibIntegerFormatType>>,
        /// Entity status
        #[clap(value_parser = parse_json::<Vec<models::EntityStatus>>, long)]
        entity_statuses: Option<Vec<models::EntityStatus>>,
    },
    /// Update ads
    AdsSlashUpdate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::AdBatchUpdateRequest>)]
        ad_batch_update: models::AdBatchUpdateRequest,
    },
    /// Create ad preview records for one or more ad groups
    CampaignAdPreviewSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<Vec<models::CampaignAdPreviewCreate>>, long)]
        campaign_ad_preview_create: Vec<models::CampaignAdPreviewCreate>,
    },
    /// Delete ad preview records for one or more ad groups
    CampaignAdPreviewSlashDelete {
        /// List of Ad group Ids to use to filter the results.
        #[clap(value_parser = parse_json::<Vec<models::AdGroupIdType>>, long)]
        ad_group_ids: Vec<models::AdGroupIdType>,
        /// Unique identifier of an ad account.
        ad_account_id: String,
    },
    /// Fetch ad preview records for one or more ad groups
    CampaignAdPreviewSlashRead {
        /// List of Ad group Ids to use to filter the results.
        #[clap(value_parser = parse_json::<Vec<models::AdGroupIdType>>, long)]
        ad_group_ids: Vec<models::AdGroupIdType>,
        /// Unique identifier of an ad account.
        ad_account_id: String,
    },
    /// Get ad
    AdsSlashGet {
        /// The ID of this ad.
        ad_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: String,
    },
    /// Get item bid options (POST)
    AdvancedAuctionItemsGetSlashPost {
        #[clap(value_parser = parse_json::<models::AdvancedAuctionItemsGetRequest>)]
        advanced_auction_items_get_request: models::AdvancedAuctionItemsGetRequest,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Operate on item level bid options
    AdvancedAuctionItemsSubmitSlashPost {
        #[clap(value_parser = parse_json::<models::AdvancedAuctionItemsSubmitRequest>)]
        advanced_auction_items_submit_request: models::AdvancedAuctionItemsSubmitRequest,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Get audience insights scope and type
    AudienceInsightsScopeAndTypeSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
    },
    /// Get audience insights
    AudienceInsightsSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Type of audience insights.
        #[clap(value_parser = parse_json::<models::AudienceInsightType>)]
        audience_insight_type: models::AudienceInsightType,
    },
    /// List accounts with access to an audience owned by an ad account
    AdAccountsAudiencesSharedAccountsSlashList {
        /// Unique identifier of the audience to use to filter the results.
        audience_id: String,
        /// Filter accounts by account type.
        #[clap(value_parser = parse_json::<models::AudienceAccountType>)]
        account_type: models::AudienceAccountType,
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// List accounts with access to an audience owned by a business
    BusinessAccountAudiencesSharedAccountsSlashList {
        /// Unique identifier of the requesting business.
        business_id: String,
        /// Unique identifier of the audience to use to filter the results.
        audience_id: String,
        /// Filter accounts by account type.
        #[clap(value_parser = parse_json::<models::AudienceAccountType>)]
        account_type: models::AudienceAccountType,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// List received audiences for a business
    SharedAudiencesForBusinessSlashList {
        /// Unique identifier of the requesting business.
        business_id: String,
        /// The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
        #[clap(value_parser = parse_json::<models::Order>)]
        order: Option<models::Order>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Update audience sharing between ad accounts
    UpdateAdAccountToAdAccountSharedAudience {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody>)]
        ad_account_to_ad_account_shared_audience_update_with_required_body: models::AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody,
    },
    /// Update audience sharing from an ad account to businesses
    UpdateAdAccountToBusinessSharedAudience {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::AdAccountToBusinessSharedAudienceUpdateWithRequiredBody>)]
        ad_account_to_business_shared_audience_update_with_required_body: models::AdAccountToBusinessSharedAudienceUpdateWithRequiredBody,
    },
    /// Update audience sharing from a business to ad accounts
    UpdateBusinessToAdAccountSharedAudience {
        /// Unique identifier of the requesting business.
        business_id: String,
        #[clap(value_parser = parse_json::<models::BusinessToAdAccountSharedAudienceUpdateWithRequiredBody>)]
        business_to_ad_account_shared_audience_update_with_required_body: models::BusinessToAdAccountSharedAudienceUpdateWithRequiredBody,
    },
    /// Update audience sharing between businesses
    UpdateBusinessToBusinessSharedAudience {
        /// Unique identifier of the requesting business.
        business_id: String,
        #[clap(value_parser = parse_json::<models::BusinessToBusinessSharedAudienceUpdateWithRequiredBody>)]
        business_to_business_shared_audience_update_with_required_body: models::BusinessToBusinessSharedAudienceUpdateWithRequiredBody,
    },
    /// Create audience
    AudiencesSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::AdAccountsAudienceCreate>)]
        ad_accounts_audience_create: models::AdAccountsAudienceCreate,
    },
    /// List audiences
    AudiencesSlashList {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
        /// The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
        #[clap(value_parser = parse_json::<models::PinterestLibPaginationOrder>)]
        order: Option<models::PinterestLibPaginationOrder>,
        #[clap(value_parser = parse_json::<models::AudienceOwnershipType>)]
        ownership_type: Option<models::AudienceOwnershipType>,
        /// When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).
        #[clap(short, long)]
        exclude_nca: Option<bool>,
    },
    /// Get audience
    AudiencesSlashGet {
        /// Audience ID.
        audience_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: String,
    },
    /// Update audience
    AudiencesSlashUpdate {
        /// Audience ID.
        audience_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::AdAccountsAudienceUpdate>)]
        ad_accounts_audience_update: models::AdAccountsAudienceUpdate,
    },
    /// Redeem ad credits
    AdsCreditSlashRedeem {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::AdsCreditRedeemCreate>)]
        ads_credit_redeem_create: models::AdsCreditRedeemCreate,
    },
    /// Get ads credit discounts
    AdsCreditsDiscountsSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Get billing invoices
    BillingInvoicesSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
        /// The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
        #[clap(value_parser = parse_json::<models::PinterestLibPaginationOrder>)]
        order: Option<models::PinterestLibPaginationOrder>,
        /// Field of which to sort billing invoices
        #[clap(value_parser = parse_json::<models::BillingInvoiceSortField>)]
        sort: Option<models::BillingInvoiceSortField>,
        /// Status of billing invoices to filter by
        #[clap(value_parser = parse_json::<models::BillingInvoiceStatus>)]
        status: Option<models::BillingInvoiceStatus>,
        /// Document type of billing invoices to filter by
        #[clap(value_parser = parse_json::<models::BillingInvoiceDocumentType>)]
        document_type: Option<models::BillingInvoiceDocumentType>,
        /// Starting point for due dates when searching for invoices. Format: YYYY-MM-DD
        start_due_date: Option<chrono::naive::NaiveDate>,
        /// Ending point for due dates when searching for invoices. Format: YYYY-MM-DD
        end_due_date: Option<chrono::naive::NaiveDate>,
    },
    /// Get billing profiles
    BillingProfilesSlashGet {
        /// Return active billing profiles, if false return all billing profiles.
        #[clap(short, long)]
        is_active: bool,
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Get Salesforce account details including bill-to information.
    SsioAccountsSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
    },
    /// Create insertion order through SSIO.
    SsioInsertionOrderSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::SsioInsertionOrderCreate>)]
        ssio_insertion_order_create: models::SsioInsertionOrderCreate,
    },
    /// Edit insertion order through SSIO.
    SsioInsertionOrderSlashEdit {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::SsioInsertionOrderUpdate>)]
        ssio_insertion_order_update: models::SsioInsertionOrderUpdate,
    },
    /// Get insertion order status by ad account id.
    SsioInsertionOrdersStatusSlashGetByAdAccount {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Get Salesforce order lines by ad account id.
    SsioOrderLinesSlashGetByAdAccount {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// The pin order id associated with the SSIO insertion order
        pin_order_id: Option<String>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Get download url for a billing invoice
    BillingInvoiceDownloadSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Unique identifier of a billing invoice.
        billing_invoice_id: String,
    },
    /// Get insertion order status by pin order id.
    SsioInsertionOrdersStatusSlashGetByPinOrderId {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// The pin order id associated with the ssio insertion order
        pin_order_id: String,
    },
    /// Create board
    BoardsSlashCreate {
        #[clap(value_parser = parse_json::<models::BoardCreate>)]
        board_create: models::BoardCreate,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// List boards
    BoardsSlashList {
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
        /// The privacy level of the board
        #[clap(value_parser = parse_json::<models::BoardPrivacyFilter>)]
        privacy: Option<models::BoardPrivacyFilter>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Create board section
    BoardSectionsSlashCreate {
        /// Unique identifier of a board.
        board_id: String,
        #[clap(value_parser = parse_json::<models::BoardSectionCreate>)]
        board_section_create: models::BoardSectionCreate,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// List board sections
    BoardSectionsSlashList {
        /// Unique identifier of a board.
        board_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Delete board
    BoardsSlashDelete {
        board_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Get board
    BoardsSlashGet {
        board_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// List Pins on board
    BoardsSlashListPins {
        /// Unique identifier of a board.
        board_id: String,
        /// Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
        #[clap(value_parser = parse_json::<Vec<models::CreativeType>>, long)]
        creative_types: Option<Vec<models::CreativeType>>,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
        /// Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
        #[clap(short, long)]
        pin_metrics: Option<bool>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Update board
    BoardsSlashUpdate {
        board_id: String,
        #[clap(value_parser = parse_json::<models::BoardWithUpdatePrivacyUpdate>)]
        board_with_update_privacy_update: models::BoardWithUpdatePrivacyUpdate,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Delete board section
    BoardSectionsSlashDelete {
        /// Unique identifier of a board.
        board_id: String,
        /// Unique identifier of a board section.
        section_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// List Pins on board section
    BoardSectionsSlashListPins {
        /// Unique identifier of a board.
        board_id: String,
        /// Unique identifier of a board section.
        section_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Update board section
    BoardSectionsSlashUpdate {
        /// Unique identifier of a board.
        board_id: String,
        /// Unique identifier of a board section.
        section_id: String,
        #[clap(value_parser = parse_json::<models::BoardSectionUpdateWithRequiredBody>)]
        board_section_update_with_required_body: models::BoardSectionUpdateWithRequiredBody,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Get advertiser entities in bulk
    BulkDownloadSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::BulkDownloadCreate>)]
        bulk_download_create: models::BulkDownloadCreate,
    },
    /// Create/update ad entities in bulk
    BulkUpsertSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Parameters to get create/update ad entities in bulk
        #[clap(value_parser = parse_json::<models::BulkUpsertRequest>)]
        bulk_upsert_request: models::BulkUpsertRequest,
    },
    /// Download advertiser entities in bulk
    BulkRequestSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Bulk request ID that is from one of the entities bulk endpoints
        bulk_request_id: String,
        /// If set to True then attach the errors/details to all the requests
        #[clap(short, long)]
        include_details: Option<bool>,
    },
    /// Create a new asset group.
    AssetGroupSlashCreate {
        /// Unique identifier of the requesting business.
        business_id: String,
        #[clap(value_parser = parse_json::<models::AssetGroupInputCreate>)]
        asset_group_input_create: models::AssetGroupInputCreate,
    },
    /// Delete asset groups.
    AssetGroupSlashDelete {
        /// Unique identifier of the requesting business.
        business_id: String,
        #[clap(value_parser = parse_json::<models::AssetGroupDeletionDelete>)]
        asset_group_deletion_delete: models::AssetGroupDeletionDelete,
    },
    /// Update asset groups.
    AssetGroupSlashUpdate {
        /// Unique identifier of the requesting business.
        business_id: String,
        #[clap(value_parser = parse_json::<models::AssetGroupModificationReadOrUpdate>)]
        asset_group_modification_read_or_update: models::AssetGroupModificationReadOrUpdate,
    },
    /// List business assets
    BusinessAssetsSlashGet {
        /// Unique identifier of the requesting business.
        business_id: String,
        /// A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.
        #[clap(value_parser = parse_json::<Vec<models::PermissionsWithOwner>>, long)]
        permissions: Option<Vec<models::PermissionsWithOwner>>,
        /// A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.
        child_asset_id: Option<String>,
        /// An asset group unique identifier. Used to fetch assets contained within the specified asset group.
        asset_group_id: Option<String>,
        /// A resource type to filter the assets by. Only assets of the specified type will be returned.
        #[clap(value_parser = parse_json::<models::BusinessAssetsGetAssetTypeParameter>)]
        asset_type: Option<models::BusinessAssetsGetAssetTypeParameter>,
        /// An index to start fetching the results from. Only the results starting from this index will be returned.
        start_index: Option<i32>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Delete member access to asset
    BusinessMembersAssetAccessSlashDelete {
        /// Unique identifier of the requesting business.
        business_id: String,
        #[clap(value_parser = parse_json::<models::BusinessMembersAssetAccessDeleteBody>)]
        business_members_asset_access_delete_body: models::BusinessMembersAssetAccessDeleteBody,
    },
    /// Assign/Update member asset permissions
    BusinessMembersAssetAccessSlashUpdate {
        /// Unique identifier of the requesting business.
        business_id: String,
        #[clap(value_parser = parse_json::<models::UpdateMemberAssetAccessBody>)]
        update_member_asset_access_body: models::UpdateMemberAssetAccessBody,
    },
    /// Delete partner access to asset
    DeletePartnerAssetAccessHandlerImpl {
        /// Unique identifier of the requesting business.
        business_id: String,
        #[clap(value_parser = parse_json::<models::DeletePartnerAssetAccessBody>)]
        delete_partner_asset_access_body: models::DeletePartnerAssetAccessBody,
    },
    /// Assign/Update partner asset permissions
    UpdatePartnerAssetAccessHandlerImpl {
        /// Unique identifier of the requesting business.
        business_id: String,
        #[clap(value_parser = parse_json::<models::UpdatePartnerAssetAccessBody>)]
        update_partner_asset_access_body: models::UpdatePartnerAssetAccessBody,
    },
    /// Get members with access to asset
    BusinessAssetMembersSlashGet {
        /// Unique identifier of the requesting business.
        business_id: String,
        /// Unique identifier of a business asset.
        asset_id: String,
        /// An index to start fetching the results from. Only the results starting from this index will be returned.
        start_index: Option<i32>,
        /// Fetches system users if True. Fetches regular user employees if False.
        #[clap(long)]
        fetch_system_users: Option<bool>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Get partners with access to asset
    BusinessAssetPartnersSlashGet {
        /// Unique identifier of the requesting business.
        business_id: String,
        /// Unique identifier of a business asset.
        asset_id: String,
        /// An index to start fetching the results from. Only the results starting from this index will be returned.
        start_index: Option<i32>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Get assets assigned to a member
    BusinessMemberAssetsSlashGet {
        /// Unique identifier of the requesting business.
        business_id: String,
        /// The member id to fetch assets for.
        member_id: String,
        /// A resource type to filter the assets by. Only assets of the specified type will be returned.
        #[clap(value_parser = parse_json::<models::BusinessMemberAssetsGetAssetTypeParameter>)]
        asset_type: Option<models::BusinessMemberAssetsGetAssetTypeParameter>,
        /// An index to start fetching the results from. Only the results starting from this index will be returned.
        start_index: Option<i32>,
        /// The field to sort member assets by
        #[clap(value_parser = parse_json::<models::AssetSortBy>)]
        sort_by: Option<models::AssetSortBy>,
        /// Sort assets in ascending order
        #[clap(short, long)]
        sort_ascending: Option<bool>,
        /// The field to search member assets by
        #[clap(value_parser = parse_json::<models::AssetSearchBy>)]
        search_by: Option<models::AssetSearchBy>,
        /// The value to search for
        search_value: Option<String>,
        /// The type of asset permission to filter by
        #[clap(value_parser = parse_json::<models::AssetPermissionType>)]
        asset_permission_type: Option<models::AssetPermissionType>,
        /// A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT.
        #[clap(value_parser = parse_json::<Vec<models::NonDraftEntityStatus>>, long)]
        ad_account_statuses: Option<Vec<models::NonDraftEntityStatus>>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Get assets assigned to a partner or assets assigned by a partner
    BusinessPartnerAssetAccessSlashGet {
        /// Unique identifier of the requesting business.
        business_id: String,
        /// The partner id to be bound to the Business
        partner_id: String,
        /// Specifies whether to fetch internal or external (shared) partners.  If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
        #[clap(value_parser = parse_json::<models::BusinessPartnerAssetAccessGetPartnerTypeParameter>)]
        partner_type: Option<models::BusinessPartnerAssetAccessGetPartnerTypeParameter>,
        /// A resource type to filter the assets by. Only assets of the specified type will be returned.
        #[clap(value_parser = parse_json::<models::BusinessPartnerAssetAccessGetAssetTypeParameter>)]
        asset_type: Option<models::BusinessPartnerAssetAccessGetAssetTypeParameter>,
        /// An index to start fetching the results from. Only the results starting from this index will be returned.
        start_index: Option<i32>,
        /// The field to sort member assets by
        #[clap(value_parser = parse_json::<models::AssetSortBy>)]
        sort_by: Option<models::AssetSortBy>,
        /// Sort assets in ascending order
        #[clap(short, long)]
        sort_ascending: Option<bool>,
        /// The field to search member assets by
        #[clap(value_parser = parse_json::<models::AssetSearchBy>)]
        search_by: Option<models::AssetSearchBy>,
        /// The value to search for
        search_value: Option<String>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Accept or decline an invite/request
    RespondBusinessAccessInvites {
        #[clap(value_parser = parse_json::<models::AuthRespondInvitesBody>)]
        auth_respond_invites_body: models::AuthRespondInvitesBody,
    },
    /// Create a request to access an existing partner's assets.
    AssetAccessRequestsSlashCreate {
        /// Unique identifier of the requesting business.
        business_id: String,
        #[clap(value_parser = parse_json::<models::CreateAssetAccessRequestBody>)]
        create_asset_access_request_body: models::CreateAssetAccessRequestBody,
    },
    /// Cancel invites/requests
    CancelInvitesOrRequests {
        /// Unique identifier of the requesting business.
        business_id: String,
        #[clap(value_parser = parse_json::<models::CancelInvitesRequest>)]
        cancel_invites_request: models::CancelInvitesRequest,
    },
    /// Update invite/request with an asset permission
    CreateAssetInvites {
        /// Unique identifier of the requesting business.
        business_id: String,
        #[clap(value_parser = parse_json::<models::CreateAssetInvitesRequest>)]
        create_asset_invites_request: models::CreateAssetInvitesRequest,
    },
    /// Create invites or requests
    CreateMembershipOrPartnershipInvites {
        /// Unique identifier of the requesting business.
        business_id: String,
        #[clap(value_parser = parse_json::<models::CreateMembershipOrPartnershipInvitesBody>)]
        create_membership_or_partnership_invites_body: models::CreateMembershipOrPartnershipInvitesBody,
    },
    /// Get invites/requests
    GetSlashInvites {
        /// Unique identifier of the requesting business.
        business_id: String,
        /// A boolean field to indicate whether the invite is to create a partnership or a membership.
        #[clap(short, long)]
        is_member: Option<bool>,
        /// A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.
        #[clap(value_parser = parse_json::<Vec<models::InviteFilterStatus>>, long)]
        invite_status: Option<Vec<models::InviteFilterStatus>>,
        /// Invite type to filter invites by. Only invites of the specified type will be returned.
        #[clap(value_parser = parse_json::<models::InviteType>)]
        invite_type: Option<models::InviteType>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// List business employers for user
    GetSlashBusinessEmployers {
        /// Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
        #[clap(long)]
        assets_summary: Option<bool>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Create a Brand Account
    BrandAccountsSlashCreate {
        /// business hierarchy node id
        business_hierarchy_id: String,
        #[clap(value_parser = parse_json::<models::BrandAccountCreate>)]
        brand_account_create: models::BrandAccountCreate,
    },
    /// Terminate business memberships
    DeleteBusinessMembership {
        /// Business id
        business_id: String,
        #[clap(value_parser = parse_json::<models::DeleteBusinessMembershipBody>)]
        delete_business_membership_body: models::DeleteBusinessMembershipBody,
    },
    /// Terminate business partnerships
    DeleteBusinessPartners {
        /// Unique identifier of the requesting business.
        business_id: String,
        #[clap(value_parser = parse_json::<models::DeleteBusinessPartnersDelete>)]
        delete_business_partners_delete: models::DeleteBusinessPartnersDelete,
    },
    /// Get business members
    GetSlashBusinessMembers {
        /// Unique identifier of the requesting business.
        business_id: String,
        /// Fetches system users if True. Fetches regular user employees if False.
        #[clap(long)]
        fetch_system_users: Option<bool>,
        /// Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
        #[clap(long)]
        assets_summary: Option<bool>,
        /// A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
        #[clap(value_parser = parse_json::<Vec<models::MemberBusinessRole>>, long)]
        business_roles: Option<Vec<models::MemberBusinessRole>>,
        /// A list of business members ids separated by comma.
        member_ids: Option<String>,
        /// An index to start fetching the results from. Only the results starting from this index will be returned.
        start_index: Option<i32>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Get business partners
    GetSlashBusinessPartners {
        /// Unique identifier of the requesting business.
        business_id: String,
        /// Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
        #[clap(long)]
        assets_summary: Option<bool>,
        /// Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
        #[clap(value_parser = parse_json::<models::PartnerType>)]
        partner_type: Option<models::PartnerType>,
        /// A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
        partner_ids: Option<String>,
        /// An index to start fetching the results from. Only the results starting from this index will be returned.
        start_index: Option<i32>,
        /// Sort ascending.
        #[clap(short, long)]
        sort_ascending: Option<bool>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Update member's business role
    UpdateSlashBusinessMemberships {
        /// Business id
        business_id: String,
        #[clap(value_parser = parse_json::<models::UpdateBusinessMembershipsBody>)]
        business_membership_member: models::UpdateBusinessMembershipsBody,
    },
    /// Update a Brand Account
    BrandAccountsSlashUpdate {
        brand_account_id: String,
        /// business hierarchy node id
        business_hierarchy_id: String,
        #[clap(value_parser = parse_json::<models::BrandAccountUpdate>)]
        brand_account_update: models::BrandAccountUpdate,
    },
    /// Update a system user information.
    SystemUserSlashUpdate {
        /// Unique identifier of the requesting business.
        business_id: String,
        /// Unique identifier of a system user.
        system_user_id: String,
        #[clap(value_parser = parse_json::<models::SystemUserUpdateWithRequiredBody>)]
        system_user_update_with_required_body: models::SystemUserUpdateWithRequiredBody,
    },
    /// Get pins analytics
    AdPinsSlashAnalytics {
        /// Campaign Id to use to filter the results.
        campaign_id: String,
        /// List of Pin IDs.
        #[clap(value_parser = parse_json::<Vec<models::PinterestLibIntegerFormatType>>, long)]
        pin_ids: Vec<models::PinterestLibIntegerFormatType>,
        /// Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
        start_date: chrono::naive::NaiveDate,
        /// Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
        end_date: chrono::naive::NaiveDate,
        /// Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
        #[clap(value_parser = parse_json::<Vec<models::ReportingColumnSync>>, long)]
        columns: Vec<models::ReportingColumnSync>,
        ///   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
        #[clap(value_parser = parse_json::<models::Granularity>)]
        granularity: models::Granularity,
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsClickWindowDaysParameter>)]
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        /// Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsClickWindowDaysParameter>)]
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        /// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsViewWindowDaysParameter>)]
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        /// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsConversionReportTimeParameter>)]
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
    },
    /// Get targeting analytics for campaigns
    CampaignTargetingAnalyticsSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// List of Campaign Ids to use to filter the results.
        #[clap(value_parser = parse_json::<Vec<models::CampaignIdRequiredType>>, long)]
        campaign_ids: Vec<models::CampaignIdRequiredType>,
        /// Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
        start_date: chrono::naive::NaiveDate,
        /// Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
        end_date: chrono::naive::NaiveDate,
        /// Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
        #[clap(value_parser = parse_json::<Vec<models::AdsAnalyticsCampaignTargetingType>>, long)]
        targeting_types: Vec<models::AdsAnalyticsCampaignTargetingType>,
        /// Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
        #[clap(value_parser = parse_json::<Vec<models::ReportingColumnSync>>, long)]
        columns: Vec<models::ReportingColumnSync>,
        ///   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
        #[clap(value_parser = parse_json::<models::Granularity>)]
        granularity: models::Granularity,
        /// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsClickWindowDaysParameter>)]
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        /// Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsClickWindowDaysParameter>)]
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        /// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsViewWindowDaysParameter>)]
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        /// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsConversionReportTimeParameter>)]
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        /// List of types of attribution for the conversion report
        #[clap(value_parser = parse_json::<Vec<models::ConversionReportAttributionType>>, long)]
        attribution_types: Option<Vec<models::ConversionReportAttributionType>>,
        /// Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
        #[clap(value_parser = parse_json::<models::ReportingTimeZone>)]
        reporting_timezone: Option<models::ReportingTimeZone>,
    },
    /// Get campaign analytics
    CampaignsSlashAnalytics {
        /// Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
        start_date: chrono::naive::NaiveDate,
        /// Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
        end_date: chrono::naive::NaiveDate,
        /// List of Campaign Ids to use to filter the results.
        #[clap(value_parser = parse_json::<Vec<models::CampaignIdRequiredType>>, long)]
        campaign_ids: Vec<models::CampaignIdRequiredType>,
        /// Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
        #[clap(value_parser = parse_json::<Vec<models::ReportingColumnSync>>, long)]
        columns: Vec<models::ReportingColumnSync>,
        ///   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
        #[clap(value_parser = parse_json::<models::Granularity>)]
        granularity: models::Granularity,
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsClickWindowDaysParameter>)]
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        /// Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsClickWindowDaysParameter>)]
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        /// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsViewWindowDaysParameter>)]
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        /// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsConversionReportTimeParameter>)]
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        /// Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.
        #[clap(long)]
        aggregate_report_rows: Option<bool>,
        /// Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
        #[clap(value_parser = parse_json::<models::ReportingTimeZone>)]
        reporting_timezone: Option<models::ReportingTimeZone>,
    },
    /// Create campaigns
    CampaignsSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::CampaignBatchCreateRequest>)]
        campaign_create_item: models::CampaignBatchCreateRequest,
    },
    /// List campaigns
    CampaignsSlashList {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
        /// The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
        #[clap(value_parser = parse_json::<models::PinterestLibPaginationOrder>)]
        order: Option<models::PinterestLibPaginationOrder>,
        /// List of Campaign Ids to use to filter the results.
        #[clap(value_parser = parse_json::<Vec<models::CampaignIdType>>, long)]
        campaign_ids: Option<Vec<models::CampaignIdType>>,
        /// Entity status
        #[clap(value_parser = parse_json::<Vec<models::EntityStatus>>, long)]
        entity_statuses: Option<Vec<models::EntityStatus>>,
    },
    /// Update campaigns
    CampaignsSlashUpdate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::CampaignBatchUpdateRequest>)]
        campaign_batch_update_item: models::CampaignBatchUpdateRequest,
    },
    /// Get campaign delivery estimates
    GetCampaignDeliveryEstimates {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::CampaignDeliveryEstimatesCampaignRequest>)]
        campaign_delivery_estimates_campaign: models::CampaignDeliveryEstimatesCampaignRequest,
    },
    /// Get campaign
    CampaignsSlashGet {
        /// Campaign ID, must be associated with the ad account ID provided in the path.
        campaign_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: String,
    },
    /// Create feed
    FeedsSlashCreate {
        #[clap(value_parser = parse_json::<models::CatalogsFeedCreateRequestSchema>)]
        catalogs_feed_create_request_schema: models::CatalogsFeedCreateRequestSchema,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// List feeds
    FeedsSlashList {
        /// Filter entities for a given catalog_id. If not given, all catalogs are considered.
        catalog_id: Option<String>,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// List feed processing results
    FeedProcessingResultsSlashList {
        /// Unique identifier of a feed.
        feed_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Delete feed
    FeedsSlashDelete {
        /// Unique identifier of a feed.
        feed_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Get feed
    FeedsSlashGet {
        /// Unique identifier of a feed.
        feed_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Ingest feed items
    FeedsSlashIngest {
        /// Unique identifier of a feed.
        feed_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Update feed
    FeedsSlashUpdate {
        /// Unique identifier of a feed.
        feed_id: String,
        #[clap(value_parser = parse_json::<models::CatalogsFeedUpdateRequestSchema>)]
        catalogs_feed_update_request_schema: models::CatalogsFeedUpdateRequestSchema,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// List item issues
    ItemsIssuesSlashList {
        /// Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list).
        processing_result_id: String,
        /// Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
        #[clap(value_parser = parse_json::<Vec<i32>>, long)]
        item_numbers: Option<Vec<i32>>,
        /// Filter item validation issues that have a given type of item validation issue.
        #[clap(value_parser = parse_json::<models::CatalogsItemValidationIssue>)]
        item_validation_issue: Option<models::CatalogsItemValidationIssue>,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Operate on item batch
    ItemsBatchSlashPost {
        #[clap(value_parser = parse_json::<models::CatalogsItemsBatchPostRequest>)]
        catalogs_items_batch_post_request: models::CatalogsItemsBatchPostRequest,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Get catalogs items (POST)
    ItemsSlashPost {
        #[clap(value_parser = parse_json::<models::CatalogsItemsRequest>)]
        catalogs_items_request: models::CatalogsItemsRequest,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Get item batch status
    ItemsBatchSlashGet {
        /// Id of a catalogs items batch to fetch
        batch_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Create product group
    CatalogsProductGroupsSlashCreate {
        #[clap(value_parser = parse_json::<models::CatalogsProductGroupsCreateRequestSchema>)]
        catalogs_product_groups_create_request_schema: models::CatalogsProductGroupsCreateRequestSchema,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Create product groups
    CatalogsProductGroupsSlashCreateMany {
        #[clap(value_parser = parse_json::<models::CatalogsProductGroupsCreateManyRequestSchema>)]
        catalogs_product_groups_create_many_request_items: models::CatalogsProductGroupsCreateManyRequestSchema,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Delete product groups
    CatalogsProductGroupsSlashDeleteMany {
        /// Comma-separated list of product group ids
        #[clap(value_parser = parse_json::<Vec<i32>>, long)]
        id: Vec<i32>,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// List product groups
    CatalogsProductGroupsSlashList {
        /// Comma-separated list of product group ids
        #[clap(value_parser = parse_json::<Vec<i32>>, long)]
        id: Option<Vec<i32>>,
        /// Filter entities for a given feed_id. If not given, all feeds are considered.
        feed_id: Option<String>,
        /// Filter entities for a given catalog_id. If not given, all catalogs are considered.
        catalog_id: Option<String>,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// List products by filter
    ProductsByProductGroupFilterSlashList {
        #[clap(value_parser = parse_json::<models::CatalogsListProductsByFilterRequest>)]
        catalogs_list_products_by_filter_request: models::CatalogsListProductsByFilterRequest,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
        /// Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
        #[clap(short, long)]
        pin_metrics: Option<bool>,
    },
    /// List products by product group
    CatalogsProductGroupPinsSlashList {
        /// Unique identifier of a product group
        product_group_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
        /// Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
        #[clap(short, long)]
        pin_metrics: Option<bool>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Delete product group
    CatalogsProductGroupsSlashDelete {
        /// Unique identifier of a product group
        product_group_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Get product group
    CatalogsProductGroupsSlashGet {
        /// Unique identifier of a product group
        product_group_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Get product counts
    CatalogsProductGroupsSlashProductCountsGet {
        /// Unique identifier of a product group
        product_group_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Update single product group
    CatalogsProductGroupsSlashUpdate {
        /// Unique identifier of a product group
        product_group_id: String,
        #[clap(value_parser = parse_json::<models::CatalogsProductGroupsUpdateRequestSchema>)]
        catalogs_product_groups_update_request_schema: models::CatalogsProductGroupsUpdateRequestSchema,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Build catalogs report
    ReportsSlashCreate {
        #[clap(value_parser = parse_json::<models::CatalogsReportParameters>)]
        catalogs_report_parameters: models::CatalogsReportParameters,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Get catalogs report
    ReportsSlashGet {
        /// Token returned from the post request creation call
        token: String,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// List report stats
    ReportsSlashStats {
        /// Contains the parameters for report identification.
        #[clap(value_parser = parse_json::<models::SwaggerColonColonOneOf2LessThanModelsColonColonCatalogsRetailReportStatsParametersCommaModelsColonColonCatalogsHotelReportStatsParametersGreaterThan>)]
        parameters: models::SwaggerColonColonOneOf2LessThanModelsColonColonCatalogsRetailReportStatsParametersCommaModelsColonColonCatalogsHotelReportStatsParametersGreaterThan,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Operate on local inventory item batch
    CatalogsLocalInventoryItemsBatchSlashOperate {
        /// Unique identifier of a catalog.
        catalog_id: String,
        #[clap(value_parser = parse_json::<models::LocalInventoryItemsBatchCreate>)]
        local_inventory_items_batch_create: models::LocalInventoryItemsBatchCreate,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Get local inventory items (POST)
    CatalogsLocalInventoryItemsSlashPost {
        /// Unique identifier of a catalog.
        catalog_id: String,
        #[clap(value_parser = parse_json::<models::LocalInventoryItemsGetCreate>)]
        local_inventory_items_get_create: models::LocalInventoryItemsGetCreate,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Create local stores
    CatalogsLocalStoresSlashCreate {
        /// Unique identifier of a catalog.
        catalog_id: String,
        #[clap(value_parser = parse_json::<Vec<models::LocalStoreCreate>>, long)]
        local_store_create: Vec<models::LocalStoreCreate>,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Delete local stores
    CatalogsLocalStoresSlashDelete {
        /// Unique identifier of a catalog.
        catalog_id: String,
        /// List of local store IDs to filter by.
        #[clap(value_parser = parse_json::<Vec<models::LocalStoreId>>, long)]
        ids: Vec<models::LocalStoreId>,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// List local stores
    CatalogsLocalStoresSlashList {
        /// Unique identifier of a catalog.
        catalog_id: String,
        /// List of local store IDs to filter by.
        #[clap(value_parser = parse_json::<Vec<models::LocalStoreId>>, long)]
        ids: Option<Vec<models::LocalStoreId>>,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Update local stores
    CatalogsLocalStoresSlashUpdate {
        /// Unique identifier of a catalog.
        catalog_id: String,
        #[clap(value_parser = parse_json::<Vec<models::LocalStoreBatchUpdate>>, long)]
        local_store_batch_update: Vec<models::LocalStoreBatchUpdate>,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Get supplemental items batch status
    CatalogsSupplementalItemsBatchSlashGet {
        /// Unique identifier of a catalog.
        catalog_id: String,
        /// Unique identifier of an items batch operation.
        batch_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// List available filter values
    CatalogsSlashAvailableFilterValues {
        /// Filter entities for a given catalog_id.
        catalog_id: String,
        /// Filter entities for a given feed_id. If not given, all feeds are considered.
        feed_id: Option<String>,
        /// Country for the Catalogs Items
        #[clap(value_parser = parse_json::<models::Country>)]
        country: Option<models::Country>,
        /// Language for the Catalogs Items
        #[clap(value_parser = parse_json::<models::CatalogsLocale>)]
        language: Option<models::CatalogsLocale>,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Create catalog
    CatalogsSlashCreate {
        #[clap(value_parser = parse_json::<models::CatalogCreate>)]
        catalog_create: models::CatalogCreate,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// List catalogs
    CatalogsSlashList {
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Create a conversion deletion request
    ConversionDeletionRequestSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::ConversionDeletionRequestCreate>)]
        conversion_deletion_request_create: models::ConversionDeletionRequestCreate,
    },
    /// List conversion deletion requests
    ConversionDeletionRequestSlashList {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
        /// The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
        #[clap(value_parser = parse_json::<models::PinterestLibPaginationOrder>)]
        order: Option<models::PinterestLibPaginationOrder>,
    },
    /// Delete a conversion deletion request
    ConversionDeletionRequestSlashDelete {
        /// Unique identifier of the conversion deletion request
        request_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: String,
    },
    /// Get a single conversion deletion request
    ConversionDeletionRequestSlashGet {
        /// Unique identifier of the conversion deletion request
        request_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: String,
    },
    /// Get event quality score (EQS)
    ConversionEqsSlashList {
        /// Lookback window (number of days).
        #[clap(value_parser = parse_json::<models::LookbackPeriodOptions>)]
        lookback_period: models::LookbackPeriodOptions,
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Source platform of event.
        #[clap(value_parser = parse_json::<models::SourcePlatformOptions>)]
        source_platform: Option<models::SourcePlatformOptions>,
        /// Ingestion source of event.
        #[clap(value_parser = parse_json::<models::IngestionSourceOptions>)]
        ingestion_source: Option<models::IngestionSourceOptions>,
    },
    /// Send conversions
    EventsSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::ConversionEventsCreate>)]
        conversion_events_create: models::ConversionEventsCreate,
        /// Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.
        #[clap(short, long)]
        test: Option<bool>,
    },
    /// Create conversion tag
    ConversionTagsSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::ConversionTagCreate>)]
        conversion_tag_create: models::ConversionTagCreate,
    },
    /// List conversion tags
    ConversionTagsSlashList {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Filter by deleted status
        #[clap(long)]
        filter_deleted: Option<bool>,
    },
    /// Get Ocpm eligible conversion tags
    OcpmEligibleConversionTagsSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
    },
    /// Get page visit conversion tags
    PageVisitConversionTagsSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
        /// The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
        #[clap(value_parser = parse_json::<models::PinterestLibPaginationOrder>)]
        order: Option<models::PinterestLibPaginationOrder>,
    },
    /// Get conversion tag
    ConversionTagsSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Id of the conversion tag.
        conversion_tag_id: String,
    },
    /// Create advertiser defined events
    AdvertiserDefinedEventsSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::AdvertiserDefinedEventsCreateRequest>)]
        advertiser_defined_events_create_request: models::AdvertiserDefinedEventsCreateRequest,
    },
    /// Delete advertiser defined events
    AdvertiserDefinedEventsSlashDelete {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// List of event names to delete
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        event_names: Vec<String>,
    },
    /// Get advertiser defined events
    AdvertiserDefinedEventsSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
    },
    /// Update advertiser defined events
    AdvertiserDefinedEventsSlashUpdate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::AdvertiserDefinedEventsCreateRequest>)]
        advertiser_defined_events_create_request: models::AdvertiserDefinedEventsCreateRequest,
    },
    /// Create customer list upload
    CustomerListUploadsSlashCreate {
        ad_account_id: String,
        /// Customer list ID.
        customer_list_id: String,
        #[clap(value_parser = parse_json::<models::CustomerListUploadCreateRequest>)]
        customer_list_upload_create_request: models::CustomerListUploadCreateRequest,
    },
    /// Get customer list upload
    CustomerListUploadsSlashGet {
        ad_account_id: String,
        /// Customer list ID.
        customer_list_id: String,
        /// Customer List Upload ID.
        customer_list_upload_id: String,
    },
    /// Run customer list upload
    CustomerListUploadsSlashRun {
        ad_account_id: String,
        /// Customer list ID.
        customer_list_id: String,
        /// Customer List Upload ID.
        customer_list_upload_id: String,
    },
    /// Create customer lists
    CustomerListsSlashCreate {
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::CustomerListCreate>)]
        customer_list_create: models::CustomerListCreate,
    },
    /// Get customer lists
    CustomerListsSlashList {
        ad_account_id: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
        /// The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
        #[clap(value_parser = parse_json::<models::PinterestLibPaginationOrder>)]
        order: Option<models::PinterestLibPaginationOrder>,
        /// When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all).
        #[clap(short, long)]
        exclude_nca: Option<bool>,
    },
    /// Get customer list
    CustomerListsSlashGet {
        ad_account_id: String,
        /// Customer list ID.
        customer_list_id: String,
    },
    /// Update customer list
    CustomerListsSlashUpdate {
        ad_account_id: String,
        /// Customer list ID.
        customer_list_id: String,
        #[clap(value_parser = parse_json::<models::CustomerListUpdateWithRequiredBody>)]
        customer_list_update_with_required_body: models::CustomerListUpdateWithRequiredBody,
    },
    /// Create customer segments
    CustomerSegmentSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::CustomerSegmentCreate>)]
        customer_segment_create: models::CustomerSegmentCreate,
    },
    /// List customer segments
    CustomerSegmentSlashList {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
        /// The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
        #[clap(value_parser = parse_json::<models::PinterestLibPaginationOrder>)]
        order: Option<models::PinterestLibPaginationOrder>,
        /// Include audience sizing in result or not
        #[clap(short, long)]
        include_sizing: Option<bool>,
        /// Search query. Can contain pin description keywords or comma-separated pin IDs.
        search_query: Option<String>,
    },
    /// Update customer segments
    CustomerSegmentSlashUpdate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::CustomerSegmentUpdateRequestUpdateWithRequiredBody>)]
        customer_segment_update_request_update_with_required_body: models::CustomerSegmentUpdateRequestUpdateWithRequiredBody,
    },
    /// Create commerce integration
    IntegrationsCommerceSlashPost {
        #[clap(value_parser = parse_json::<models::IntegrationMetadataCreate>)]
        integration_metadata_create: models::IntegrationMetadataCreate,
    },
    /// Receives batched logs from integration applications.
    IntegrationsLogsSlashPost {
        #[clap(value_parser = parse_json::<models::IntegrationLogsRequestCreate>)]
        integration_logs_request_create: models::IntegrationLogsRequestCreate,
    },
    /// Get integration metadata list
    IntegrationsSlashGetList {
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Delete commerce integration
    IntegrationsCommerceSlashDel {
        /// External business ID for the integration.
        external_business_id: String,
    },
    /// Get commerce integration
    IntegrationsCommerceSlashGet {
        /// External business ID for the integration.
        external_business_id: String,
    },
    /// Update commerce integration
    IntegrationsCommerceSlashPatch {
        /// External business ID for the integration.
        external_business_id: String,
        #[clap(value_parser = parse_json::<models::IntegrationMetadataUpdate>)]
        integration_metadata_update: models::IntegrationMetadataUpdate,
    },
    /// Get integration metadata
    IntegrationsSlashGetById {
        /// Integration record ID.
        id: String,
    },
    /// Get country's keyword metrics
    CountryKeywordsMetricsSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Two letter country code (ISO 3166-1 alpha-2)
        country_code: String,
        /// Comma-separated keywords
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        keywords: Vec<String>,
    },
    /// Create keywords
    KeywordsSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::KeywordsCreate>)]
        keywords_create: models::KeywordsCreate,
    },
    /// Get keywords
    KeywordsSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Campaign Id to use to filter the results.
        campaign_id: Option<String>,
        /// Ad group Id.
        ad_group_id: Option<String>,
        /// List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
        #[clap(value_parser = parse_json::<Vec<models::PinterestLibIntegerFormatType>>, long)]
        ad_group_ids: Option<Vec<models::PinterestLibIntegerFormatType>>,
        /// Keyword [match type](/docs/api-features/targeting-overview/)
        #[clap(value_parser = parse_json::<Vec<models::MatchType>>, long)]
        match_types: Option<Vec<models::MatchType>>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Update keywords
    KeywordsSlashUpdate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::KeywordsUpdate>)]
        keywords_update: models::KeywordsUpdate,
    },
    /// List trending keywords
    TrendingKeywordsSlashList {
        ///   The geographic region of interest. Only top trends within the specified region will be returned.    The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas:   - `US` - United States   - `CA` - Canada   - `DE` - Germany   - `FR` - France   - `ES` - Spain   - `IT` - Italy   - `DE+AT+CH` - Germanic countries   - `GB+IE` - Great Britain & Ireland   - `IT+ES+PT+GR+MT` - Southern Europe   - `PL+RO+HU+SK+CZ` - Eastern Europe   - `SE+DK+FI+NO` - Nordic countries   - `NL+BE+LU` - Benelux   - `AR` - Argentina   - `BR` - Brazil   - `CO` - Colombia   - `MX` - Mexico   - `MX+AR+CO+CL` - Hispanic LatAm   - `AU+NZ` - Australasia
        #[clap(value_parser = parse_json::<models::TrendsSupportedRegion>)]
        region: models::TrendsSupportedRegion,
        ///   The methodology used to rank how trendy a keyword is.   - `growing` trends have high upward growth in search volume over the last quarter   - `monthly` trends have high search volume in the last month   - `yearly` trends have high search volume in the last year   - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)
        #[clap(value_parser = parse_json::<models::TrendType>)]
        trend_type: models::TrendType,
        ///   The list of supported interests is:   - `animals` - Animals   - `architecture` - Architecture   - `art` - Art   - `beauty` - Beauty   - `childrens_fashion` - Children's Fashion   - `design` - Design   - `diy_and_crafts` - DIY & Crafts   - `education` - Education   - `electronics` - Electronics   - `entertainment` - Entertainment   - `event_planning` - Event Planning   - `finance` - Finance   - `food_and_drinks` - Food & Drink   - `gardening` - Gardening   - `health` - Health   - `home_decor` - Home Decor   - `mens_fashion` - Men's Fashion   - `parenting` - Parenting   - `quotes` - Quotes   - `sport` - Sports   - `travel` - Travel   - `vehicles` - Vehicles   - `wedding` - Wedding   - `womens_fashion` - Women's Fashion
        #[clap(value_parser = parse_json::<Vec<models::TrendsL1Interest>>, long)]
        interests: Option<Vec<models::TrendsL1Interest>>,
        /// If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The `unknown` group includes users with unspecified or customized gender profile settings.
        #[clap(value_parser = parse_json::<Vec<models::TrendsGenderFilter>>, long)]
        genders: Option<Vec<models::TrendsGenderFilter>>,
        /// If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned.
        #[clap(value_parser = parse_json::<Vec<models::TrendsAgeBucket>>, long)]
        ages: Option<Vec<models::TrendsAgeBucket>>,
        /// If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied.
        #[clap(value_parser = parse_json::<Vec<models::KeywordListItems>>, long)]
        include_keywords: Option<Vec<models::KeywordListItems>>,
        ///  Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.
        #[clap(short, long)]
        normalize_against_group: Option<bool>,
        /// The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends.
        limit: Option<i32>,
        /// Including the age and gender distribution for each keyword. By default (`false`), the response will not include demographics data.
        #[clap(short, long)]
        include_demographics: Option<bool>,
    },
    /// Create labels
    LabelsSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::LabelCreateRequest>)]
        label_create_request: models::LabelCreateRequest,
    },
    /// List labels
    LabelsSlashList {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// List of Campaign Ids to use to filter the results.
        #[clap(value_parser = parse_json::<Vec<models::CampaignIdType>>, long)]
        campaign_ids: Option<Vec<models::CampaignIdType>>,
        /// List of Label Ids to use to filter the results.
        #[clap(value_parser = parse_json::<Vec<models::QueryLabelIdsItems>>, long)]
        label_ids: Option<Vec<models::QueryLabelIdsItems>>,
        /// Label entity status
        #[clap(value_parser = parse_json::<Vec<models::QueryLabelEntityStatusesItems>>, long)]
        entity_statuses: Option<Vec<models::QueryLabelEntityStatusesItems>>,
        /// Label type.
        #[clap(value_parser = parse_json::<Vec<models::QueryLabelTypesItems>>, long)]
        label_types: Option<Vec<models::QueryLabelTypesItems>>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Update labels
    LabelsSlashUpdate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::LabelUpdateRequest>)]
        label_update_request: models::LabelUpdateRequest,
    },
    /// Apply label to entity
    LabelsSlashApply {
        ad_account_id: String,
        /// Label ID.
        label_id: String,
        #[clap(value_parser = parse_json::<models::LabeledEntitiesCreate>)]
        labeled_entities_create: models::LabeledEntitiesCreate,
    },
    /// Remove label from entities
    LabelsSlashRemove {
        ad_account_id: String,
        /// Label ID.
        label_id: String,
        #[clap(value_parser = parse_json::<models::LabeledEntitiesCreate>)]
        labeled_entities_create: models::LabeledEntitiesCreate,
    },
    /// Get lead ads subscriptions
    AdAccountsSubscriptionsSlashGetList {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Create lead ads subscription
    AdAccountsSubscriptionsSlashPost {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::LeadSubscriptionPostParamsCreate>)]
        lead_subscription_post_params_create: models::LeadSubscriptionPostParamsCreate,
    },
    /// Delete lead ads subscription
    AdAccountsSubscriptionsSlashDelById {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Unique identifier of a subscription.
        subscription_id: String,
    },
    /// Get lead ads subscription by ID
    AdAccountsSubscriptionsSlashGetById {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Unique identifier of a subscription.
        subscription_id: String,
    },
    /// Create lead forms
    LeadFormsSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::LeadFormsCreateBody>)]
        lead_form_create: models::LeadFormsCreateBody,
    },
    /// List lead forms
    LeadFormsSlashList {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
        /// The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
        #[clap(value_parser = parse_json::<models::PinterestLibPaginationOrder>)]
        order: Option<models::PinterestLibPaginationOrder>,
    },
    /// Update lead forms
    LeadFormsSlashUpdate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::LeadFormsUpdateBody>)]
        lead_form_batch_update: models::LeadFormsUpdateBody,
    },
    /// Get lead form by id
    LeadFormSlashGet {
        /// The ID of this lead form
        lead_form_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: String,
    },
    /// Create lead form test data
    LeadFormTestSlashCreate {
        ad_account_id: String,
        /// Unique identifier of a lead form.
        lead_form_id: String,
        #[clap(value_parser = parse_json::<models::LeadFormTestCreate>)]
        lead_form_test_create: models::LeadFormTestCreate,
    },
    /// Create a request to export leads collected from a lead ad
    LeadsExportSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::LeadsExportsCreate>)]
        leads_exports_create: models::LeadsExportsCreate,
    },
    /// Get the lead export from the lead export create call
    LeadsExportSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// lead_export_id token returned from the create a lead export endpoint
        leads_export_id: String,
    },
    /// Register media upload
    MediaSlashCreate {
        #[clap(value_parser = parse_json::<models::MediaUploadCreate>)]
        media_upload_create: models::MediaUploadCreate,
    },
    /// List media uploads
    MediaSlashList {
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Get media upload details
    MediaSlashGet {
        /// Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
        media_id: String,
    },
    /// Send Measurement Source Of Truth (MSOT) attributed conversion events
    MsotEventsSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::ConversionMsotEventsCreate>)]
        conversion_msot_events_create: models::ConversionMsotEventsCreate,
    },
    /// Receive notifications from external partners.
    NotificationSlashPost {
        #[clap(value_parser = parse_json::<models::NotificationPostRequest>)]
        notification_post_request: models::NotificationPostRequest,
    },
    /// Generate OAuth access token for conversion API
    OauthSlashConversionToken {
    },
    /// Generate OAuth access token
    OauthSlashToken {
        #[clap(value_parser = parse_json::<models::TokenGrantType>)]
        grant_type: models::TokenGrantType,
        code: Option<String>,
        ///   If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token.
        continuous_refresh: Option<String>,
        redirect_uri: Option<String>,
        refresh_token: Option<String>,
        scope: Option<String>,
    },
    /// Revoke a token
    TokenSlashRevoke {
        /// The token to revoke.
        token: String,
        /// The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.
        #[clap(value_parser = parse_json::<models::TokenTypeHint>)]
        token_type_hint: Option<models::TokenTypeHint>,
    },
    /// Get order lines.
    OrderLinesSlashList {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
        /// The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
        #[clap(value_parser = parse_json::<models::PinterestLibPaginationOrder>)]
        order: Option<models::PinterestLibPaginationOrder>,
    },
    /// Get order line
    OrderLinesSlashGet {
        /// Order line ID.
        order_line_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: String,
    },
    /// Get multiple Pin analytics
    MultiPinsSlashAnalytics {
        /// List of Pin IDs.
        #[clap(value_parser = parse_json::<Vec<models::PinterestLibIntegerFormatType>>, long)]
        pin_ids: Vec<models::PinterestLibIntegerFormatType>,
        /// Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
        start_date: chrono::naive::NaiveDate,
        /// Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
        end_date: chrono::naive::NaiveDate,
        /// Pin metric types to get data for.
        #[clap(value_parser = parse_json::<Vec<models::MultiPinsAnalyticsMetricTypesItem>>, long)]
        metric_types: Vec<models::MultiPinsAnalyticsMetricTypesItem>,
        /// Apps or devices to get data for, default is all.
        #[clap(value_parser = parse_json::<models::MultiPinsAnalyticsAppTypesParameter>)]
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Create Pin
    PinsSlashCreate {
        #[clap(value_parser = parse_json::<models::PinCreate>)]
        pin_create: models::PinCreate,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// List Pins
    PinsSlashList {
        /// The filter to apply to the pins
        #[clap(value_parser = parse_json::<models::PinFilter>)]
        pin_filter: Option<models::PinFilter>,
        /// Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
        #[clap(short, long)]
        pin_metrics: Option<bool>,
        /// Whether to include protected pins in the results
        #[clap(long)]
        include_protected_pins: Option<bool>,
        /// The type of pins to return, currently only enabled for private pins
        #[clap(value_parser = parse_json::<models::PinType>)]
        pin_type: Option<models::PinType>,
        /// Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
        #[clap(value_parser = parse_json::<Vec<models::CreativeType>>, long)]
        creative_types: Option<Vec<models::CreativeType>>,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
        /// Only return pins with links that match the exact domain. Domain should not include 'www.' prefix. For example, 'pinterest.com' is a valid domain, but 'www.pinterest.com' is not (will not match any pins).
        domain: Option<String>,
        /// Only return pins with links whose domain matches any value in the list. Values are joined comma-separated on the wire (e.g. `?domains=instagram.com,jcpenney.com`).
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        domains: Option<Vec<String>>,
        /// Include product tag objects in the response with their associated links.
        #[clap(long)]
        include_product_tag_obj: Option<bool>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Get Pin analytics
    PinsSlashAnalytics {
        /// Unique identifier of a Pin.
        pin_id: String,
        /// Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
        start_date: chrono::naive::NaiveDate,
        /// Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
        end_date: chrono::naive::NaiveDate,
        /// Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before `2023-03-20`, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than `NO_SPLIT`.
        #[clap(value_parser = parse_json::<Vec<models::QuerypinanalyticsmetrictypesItems>>, long)]
        metric_types: Vec<models::QuerypinanalyticsmetrictypesItems>,
        /// Apps or devices to get data for, default is all.
        #[clap(value_parser = parse_json::<models::MultiPinsAnalyticsAppTypesParameter>)]
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        /// How to split the data into groups. Not including this param means data won't be split.
        #[clap(value_parser = parse_json::<models::PinsAnalyticsSplitFieldParameter>)]
        split_field: Option<models::PinsAnalyticsSplitFieldParameter>,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Delete Pin
    PinsSlashDelete {
        pin_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Get Pin
    PinsSlashGet {
        pin_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
        /// Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
        #[clap(short, long)]
        pin_metrics: Option<bool>,
    },
    /// Save Pin
    PinsSlashSave {
        /// Unique identifier of a Pin.
        pin_id: String,
        #[clap(value_parser = parse_json::<models::PinsSaveRequestCreate>)]
        pins_save_request_create: models::PinsSaveRequestCreate,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Update Pin
    PinsSlashUpdate {
        pin_id: String,
        #[clap(value_parser = parse_json::<models::PinUpdate>)]
        pin_update: models::PinUpdate,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Create product group promotions
    ProductGroupPromotionsSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::ProductGroupPromotionsCreate>)]
        product_group_promotions_create: models::ProductGroupPromotionsCreate,
    },
    /// Get product group promotions
    ProductGroupPromotionsSlashList {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
        /// The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
        #[clap(value_parser = parse_json::<models::PinterestLibPaginationOrder>)]
        order: Option<models::PinterestLibPaginationOrder>,
        /// List of Product group promotion Ids.
        #[clap(value_parser = parse_json::<Vec<models::PinterestLibIntegerFormatType>>, long)]
        product_group_promotion_ids: Option<Vec<models::PinterestLibIntegerFormatType>>,
        /// Entity status
        #[clap(value_parser = parse_json::<Vec<models::EntityStatus>>, long)]
        entity_statuses: Option<Vec<models::EntityStatus>>,
        /// Ad group Id.
        ad_group_id: Option<String>,
    },
    /// Update product group promotions
    ProductGroupPromotionsSlashUpdate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::ProductGroupPromotionsUpdateWithRequiredBody>)]
        product_group_promotions_update_with_required_body: models::ProductGroupPromotionsUpdateWithRequiredBody,
    },
    /// Get product group analytics
    ProductGroupsSlashAnalytics {
        /// Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
        start_date: chrono::naive::NaiveDate,
        /// Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
        end_date: chrono::naive::NaiveDate,
        /// List of Product group Ids to use to filter the results.
        #[clap(value_parser = parse_json::<Vec<models::ProductGroupIdType>>, long)]
        product_group_ids: Vec<models::ProductGroupIdType>,
        /// Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
        #[clap(value_parser = parse_json::<Vec<models::ReportingColumnSync>>, long)]
        columns: Vec<models::ReportingColumnSync>,
        ///   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
        #[clap(value_parser = parse_json::<models::Granularity>)]
        granularity: models::Granularity,
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsClickWindowDaysParameter>)]
        click_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        /// Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsClickWindowDaysParameter>)]
        engagement_window_days: Option<models::AdGroupsAnalyticsClickWindowDaysParameter>,
        /// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsViewWindowDaysParameter>)]
        view_window_days: Option<models::AdGroupsAnalyticsViewWindowDaysParameter>,
        /// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
        #[clap(value_parser = parse_json::<models::AdGroupsAnalyticsConversionReportTimeParameter>)]
        conversion_report_time: Option<models::AdGroupsAnalyticsConversionReportTimeParameter>,
        /// Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
        #[clap(value_parser = parse_json::<models::ReportingTimeZone>)]
        reporting_timezone: Option<models::ReportingTimeZone>,
    },
    /// Get a product group promotion by id
    ProductGroupPromotionsSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Unique identifier of a product group promotion
        product_group_promotion_id: String,
    },
    /// Add product tags to pin
    ProductTagsSlashBulkAdd {
        /// Unique identifier of the hero pin that will receive product tags.
        pin_id: String,
        #[clap(value_parser = parse_json::<models::ProductTagsBulkAddRequest>)]
        product_tags_bulk_add_request: models::ProductTagsBulkAddRequest,
    },
    /// Delete product tags from pin
    ProductTagsSlashBulkDelete {
        /// Unique identifier of the hero pin that will receive product tags.
        pin_id: String,
        #[clap(value_parser = parse_json::<models::ProductTagsBulkDeleteRequest>)]
        product_tags_bulk_delete_request: models::ProductTagsBulkDeleteRequest,
    },
    /// Get product tags for pin
    ProductTagsSlashList {
        /// Unique identifier of the hero pin that will receive product tags.
        pin_id: String,
    },
    /// Create promotions
    PromotionsSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::PromotionCreateBatch>)]
        promotion_create: models::PromotionCreateBatch,
    },
    /// Get promotions
    PromotionsSlashList {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
        /// The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
        #[clap(value_parser = parse_json::<models::PinterestLibPaginationOrder>)]
        order: Option<models::PinterestLibPaginationOrder>,
    },
    /// Update promotions
    PromotionsSlashUpdate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::PromotionUpdateBatch>)]
        promotion_batch_update: models::PromotionUpdateBatch,
    },
    /// Delete promotion by id
    PromotionsSlashDelete {
        /// Promotion ID
        promotion_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: String,
    },
    /// Get promotion by id
    PromotionsSlashGet {
        /// Promotion ID
        promotion_id: String,
        /// Unique identifier of an ad account.
        ad_account_id: String,
    },
    /// Get ad accounts countries
    AdAccountCountriesSlashGet {
    },
    /// Get available metrics' definitions
    DeliveryMetricsSlashGet {
        /// Report type.
        #[clap(value_parser = parse_json::<models::ReportType>)]
        report_type: Option<models::ReportType>,
    },
    /// Get lead form questions
    LeadFormQuestionsSlashGet {
    },
    /// Get metrics ready state
    MetricsReadyStateSlashGet {
        /// Analytics reports request date (UTC). Format: YYYY-MM-DD
        date: String,
    },
    /// Get interest details
    InterestTargetingOptionsSlashGet {
        /// Unique identifier of an interest.
        interest_id: String,
    },
    /// Get targeting options
    TargetingOptionsSlashGet {
        /// Public targeting type
        #[clap(value_parser = parse_json::<models::PublicTargetingType>)]
        targeting_type: models::PublicTargetingType,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
        /// Client ID
        client_id: Option<String>,
        /// Oauth signature
        oauth_signature: Option<String>,
        /// Timestamp.
        timestamp: Option<String>,
    },
    /// Create schedules
    SchedulesSlashCreate {
        ad_account_id: String,
        #[clap(value_parser = parse_json::<Vec<models::ScheduleCreate>>, long)]
        schedule_create: Vec<models::ScheduleCreate>,
    },
    /// Get Schedules
    SchedulesSlashList {
        ad_account_id: String,
        /// List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
        #[clap(value_parser = parse_json::<Vec<models::EntityId>>, long)]
        entity_ids: Vec<models::EntityId>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
        /// The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
        #[clap(value_parser = parse_json::<models::PinterestLibPaginationOrder>)]
        order: Option<models::PinterestLibPaginationOrder>,
        /// Filter schedules by status (one or more)
        #[clap(value_parser = parse_json::<Vec<models::ScheduleStatus>>, long)]
        schedule_statuses: Option<Vec<models::ScheduleStatus>>,
        /// Filter schedules by a type
        #[clap(value_parser = parse_json::<models::ScheduleType>)]
        schedule_type: Option<models::ScheduleType>,
    },
    /// Update schedules
    SchedulesSlashUpdate {
        ad_account_id: String,
        #[clap(value_parser = parse_json::<Vec<models::ScheduleBatchUpdate>>, long)]
        schedule_batch_update: Vec<models::ScheduleBatchUpdate>,
    },
    /// Search pins by a given search term
    SearchPartnerPins {
        /// Search term to look up pins.
        term: String,
        /// Two letter country code (ISO 3166-1 alpha-2)
        country_code: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Search locale.
        locale: Option<String>,
        /// Max search result size
        limit: Option<i32>,
    },
    /// Search user's boards
    SearchUserBoardsSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
        /// Search query. Can contain pin description keywords or comma-separated pin IDs.
        query: Option<String>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Search user's Pins
    SearchUserPinsSlashList {
        /// Search query. Can contain pin description keywords or comma-separated pin IDs.
        query: String,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
    },
    /// Create targeting templates
    TargetingTemplateSlashCreate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::TargetingTemplateCreate>)]
        targeting_template_create: models::TargetingTemplateCreate,
    },
    /// List targeting templates
    TargetingTemplateSlashList {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
        /// The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
        #[clap(value_parser = parse_json::<models::PinterestLibPaginationOrder>)]
        order: Option<models::PinterestLibPaginationOrder>,
        /// Include audience sizing in result or not
        #[clap(short, long)]
        include_sizing: Option<bool>,
        /// Search query. Can contain pin description keywords or comma-separated pin IDs.
        search_query: Option<String>,
    },
    /// Update targeting templates
    TargetingTemplateSlashUpdate {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        #[clap(value_parser = parse_json::<models::TargetingTemplateUpdateRequestReadOrUpdate>)]
        targeting_template_update_request_read_or_update: models::TargetingTemplateUpdateRequestReadOrUpdate,
    },
    /// List related terms
    TermsRelatedSlashList {
        /// List of input terms.
        #[clap(value_parser = parse_json::<Vec<String>>, long)]
        terms: Vec<String>,
    },
    /// List suggested terms
    TermsSuggestedSlashList {
        /// Input term.
        term: String,
        /// Max suggested terms to return.
        limit: Option<i32>,
    },
    /// Get terms of service
    TermsOfServiceSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: String,
        /// Return HTML in TOS text.
        #[clap(short, long)]
        include_html: Option<bool>,
        /// Request type.
        tos_type: Option<String>,
    },
    /// Returns editorial articles for a given region
    TrendsEditorialArticlesSlashList {
        ///      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
        #[clap(value_parser = parse_json::<models::ProductCategoryRegion>)]
        region: models::ProductCategoryRegion,
    },
    /// Get featured topics
    TrendsFeaturedTopicsSlashList {
        ///      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
        #[clap(value_parser = parse_json::<models::ProductCategoryRegion>)]
        region: models::ProductCategoryRegion,
        /// Interest to filter by
        #[clap(value_parser = parse_json::<models::InterestsEnum>)]
        interest: Option<models::InterestsEnum>,
    },
    /// Get product category details
    TrendsProductCategoriesDetailsSlashList {
        /// List of product categories
        #[clap(value_parser = parse_json::<Vec<models::ProductCategoryEnum>>, long)]
        product_categories: Vec<models::ProductCategoryEnum>,
        ///      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
        #[clap(value_parser = parse_json::<models::ProductCategoryRegion>)]
        region: models::ProductCategoryRegion,
        ///   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years)
        #[clap(value_parser = parse_json::<models::ProductCategoryDetailLookbackWindow>)]
        lookback_window: Option<models::ProductCategoryDetailLookbackWindow>,
        ///     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
        #[clap(value_parser = parse_json::<models::ProductCategoriesEngagementType>)]
        engagement_type: Option<models::ProductCategoriesEngagementType>,
    },
    /// Get a list of growing Shopping Product Categories
    TrendsProductCategoriesTrendingSlashList {
        ///      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
        #[clap(value_parser = parse_json::<models::ProductCategoryRegion>)]
        region: models::ProductCategoryRegion,
        /// List of verticals to filter by
        #[clap(value_parser = parse_json::<Vec<models::VerticalProductCategory>>, long)]
        verticals: Option<Vec<models::VerticalProductCategory>>,
        /// Age to filter by. If not provided, the results will be filtered by all ages.
        #[clap(value_parser = parse_json::<Vec<models::AgeTrendsBucket>>, long)]
        ages: Option<Vec<models::AgeTrendsBucket>>,
        /// Gender to filter by, If not provided, the results will be filtered by all genders.
        #[clap(value_parser = parse_json::<Vec<models::GenderBucket>>, long)]
        genders: Option<Vec<models::GenderBucket>>,
        ///     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves
        #[clap(value_parser = parse_json::<models::ProductCategoriesEngagementType>)]
        engagement_type: Option<models::ProductCategoriesEngagementType>,
    },
    /// List following boards
    BoardsUserFollowsSlashList {
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
        /// Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
        #[clap(short, long)]
        explicit_following: Option<bool>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// List followers
    FollowersSlashList {
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// List linked businesses
    LinkedBusinessAccountsSlashGet {
    },
    /// Unverify website
    UnverifyWebsiteSlashDelete {
        /// Website with path or domain only
        website: String,
    },
    /// Get user account analytics
    UserAccountSlashAnalytics {
        /// Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
        start_date: chrono::naive::NaiveDate,
        /// Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
        end_date: chrono::naive::NaiveDate,
        /// Filter on Pins that match your claimed domain.
        #[clap(value_parser = parse_json::<models::UserAccountAnalyticsFromClaimedContentParameter>)]
        from_claimed_content: Option<models::UserAccountAnalyticsFromClaimedContentParameter>,
        /// Pin formats to get data for, default is all.
        #[clap(value_parser = parse_json::<models::UserAccountAnalyticsPinFormatParameter>)]
        pin_format: Option<models::UserAccountAnalyticsPinFormatParameter>,
        /// Apps or devices to get data for, default is all.
        #[clap(value_parser = parse_json::<models::MultiPinsAnalyticsAppTypesParameter>)]
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        /// Filter to paid or organic data. Default is all.
        #[clap(value_parser = parse_json::<models::UserAccountAnalyticsContentTypeParameter>)]
        content_type: Option<models::UserAccountAnalyticsContentTypeParameter>,
        /// Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
        #[clap(value_parser = parse_json::<models::UserAccountAnalyticsSourceParameter>)]
        source: Option<models::UserAccountAnalyticsSourceParameter>,
        /// Metric types to get data for, default is all.
        #[clap(value_parser = parse_json::<Vec<models::QuerymetrictypesItems>>, long)]
        metric_types: Option<Vec<models::QuerymetrictypesItems>>,
        /// How to split the data into groups. Not including this param means data won't be split.
        #[clap(value_parser = parse_json::<models::UserAccountAnalyticsSplitFieldParameter>)]
        split_field: Option<models::UserAccountAnalyticsSplitFieldParameter>,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Get user account top pins analytics
    UserAccountSlashAnalyticsSlashTopPins {
        /// Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
        start_date: chrono::naive::NaiveDate,
        /// Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
        end_date: chrono::naive::NaiveDate,
        /// Specify sorting order for metrics
        #[clap(value_parser = parse_json::<models::TopPinsSortBy>)]
        sort_by: models::TopPinsSortBy,
        /// Filter on Pins that match your claimed domain.
        #[clap(value_parser = parse_json::<models::UserAccountAnalyticsFromClaimedContentParameter>)]
        from_claimed_content: Option<models::UserAccountAnalyticsFromClaimedContentParameter>,
        /// Pin formats to get data for, default is all.
        #[clap(value_parser = parse_json::<models::UserAccountAnalyticsPinFormatParameter>)]
        pin_format: Option<models::UserAccountAnalyticsPinFormatParameter>,
        /// Apps or devices to get data for, default is all.
        #[clap(value_parser = parse_json::<models::MultiPinsAnalyticsAppTypesParameter>)]
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        /// Filter to paid or organic data. Default is all.
        #[clap(value_parser = parse_json::<models::UserAccountAnalyticsContentTypeParameter>)]
        content_type: Option<models::UserAccountAnalyticsContentTypeParameter>,
        /// Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
        #[clap(value_parser = parse_json::<models::UserAccountAnalyticsSourceParameter>)]
        source: Option<models::UserAccountAnalyticsSourceParameter>,
        /// Metric types to get data for, default is all.
        #[clap(value_parser = parse_json::<Vec<models::QuerymetrictypesItems>>, long)]
        metric_types: Option<Vec<models::QuerymetrictypesItems>>,
        /// Number of pins to include, default is 10. Max is 50.
        num_of_pins: Option<i32>,
        /// Get metrics for pins created in the last \"n\" days.
        #[clap(value_parser = parse_json::<models::UserAccountAnalyticsTopPinsCreatedInLastNDaysParameter>)]
        created_in_last_n_days: Option<models::UserAccountAnalyticsTopPinsCreatedInLastNDaysParameter>,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Get user account top video pins analytics
    UserAccountSlashAnalyticsSlashTopVideoPins {
        /// Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
        start_date: chrono::naive::NaiveDate,
        /// Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
        end_date: chrono::naive::NaiveDate,
        /// Specify sorting order for video metrics
        #[clap(value_parser = parse_json::<models::TopVideoPinsSortBy>)]
        sort_by: models::TopVideoPinsSortBy,
        /// Filter on Pins that match your claimed domain.
        #[clap(value_parser = parse_json::<models::UserAccountAnalyticsFromClaimedContentParameter>)]
        from_claimed_content: Option<models::UserAccountAnalyticsFromClaimedContentParameter>,
        /// Pin formats to get data for, default is all.
        #[clap(value_parser = parse_json::<models::UserAccountAnalyticsPinFormatParameter>)]
        pin_format: Option<models::UserAccountAnalyticsPinFormatParameter>,
        /// Apps or devices to get data for, default is all.
        #[clap(value_parser = parse_json::<models::MultiPinsAnalyticsAppTypesParameter>)]
        app_types: Option<models::MultiPinsAnalyticsAppTypesParameter>,
        /// Filter to paid or organic data. Default is all.
        #[clap(value_parser = parse_json::<models::UserAccountAnalyticsContentTypeParameter>)]
        content_type: Option<models::UserAccountAnalyticsContentTypeParameter>,
        /// Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
        #[clap(value_parser = parse_json::<models::UserAccountAnalyticsSourceParameter>)]
        source: Option<models::UserAccountAnalyticsSourceParameter>,
        /// Metric types to get video data for, default is all.
        #[clap(value_parser = parse_json::<Vec<models::QueryvideopinmetrictypesItems>>, long)]
        metric_types: Option<Vec<models::QueryvideopinmetrictypesItems>>,
        /// Number of pins to include, default is 10. Max is 50.
        num_of_pins: Option<i32>,
        /// Get metrics for pins created in the last \"n\" days.
        #[clap(value_parser = parse_json::<models::UserAccountAnalyticsTopPinsCreatedInLastNDaysParameter>)]
        created_in_last_n_days: Option<models::UserAccountAnalyticsTopPinsCreatedInLastNDaysParameter>,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Get user account
    UserAccountSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// List following
    UserFollowingSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
        /// Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
        #[clap(short, long)]
        explicit_following: Option<bool>,
        /// Thrift param specifying what type of followees will be kept. Default to include all followees.
        #[clap(value_parser = parse_json::<models::UserFollowingFeedType>)]
        feed_type: Option<models::UserFollowingFeedType>,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Get user websites
    UserWebsitesSlashGet {
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
    /// Verify website
    VerifyWebsiteSlashUpdate {
        #[clap(value_parser = parse_json::<models::UserWebsiteCreate>)]
        user_website_create: models::UserWebsiteCreate,
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Get user verification code for website claiming
    WebsiteVerificationSlashGet {
        /// Unique identifier of an ad account.
        ad_account_id: Option<String>,
    },
    /// Follow user
    FollowUserSlashUpdate {
        /// A valid username
        username: String,
        #[clap(value_parser = parse_json::<models::FollowUserCreate>)]
        follow_user_create: models::FollowUserCreate,
    },
    /// List following interests
    UserAccountSlashFollowedInterests {
        /// A valid username
        username: String,
        /// Cursor used to fetch the next page of items
        bookmark: Option<String>,
        /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        page_size: Option<i32>,
    },
}

// On Linux/Unix with OpenSSL (client-tls feature), support certificate pinning and mutual TLS
#[cfg(all(feature = "client-tls", not(any(target_os = "macos", target_os = "windows", target_os = "ios"))))]
fn create_client(args: &Cli, context: ClientContext) -> Result<Box<dyn ApiNoContext<ClientContext>>> {
    if args.client_certificate.is_some() {
        debug!("Using mutual TLS");
        let client = Client::try_new_https_mutual(
            &args.server_address,
            args.server_certificate.clone().unwrap(),
            args.client_key.clone().unwrap(),
            args.client_certificate.clone().unwrap(),
        )
        .context("Failed to create HTTPS client")?;
        Ok(Box::new(client.with_context(context)))
    } else if args.server_certificate.is_some() {
        debug!("Using TLS with pinned server certificate");
        let client =
            Client::try_new_https_pinned(&args.server_address, args.server_certificate.clone().unwrap())
                .context("Failed to create HTTPS client")?;
        Ok(Box::new(client.with_context(context)))
    } else {
        debug!("Using client without certificates");
        let client =
            Client::try_new(&args.server_address).context("Failed to create HTTP(S) client")?;
        Ok(Box::new(client.with_context(context)))
    }
}

// On macOS/Windows/iOS or without client-tls feature, use simple client (no cert pinning/mutual TLS)
#[cfg(any(
    not(feature = "client-tls"),
    all(feature = "client-tls", any(target_os = "macos", target_os = "windows", target_os = "ios"))
))]
fn create_client(args: &Cli, context: ClientContext) -> Result<Box<dyn ApiNoContext<ClientContext>>> {
    // Client::try_new() automatically detects the URL scheme (http:// or https://)
    // and creates the appropriate client.
    // Note: Certificate pinning and mutual TLS are only available on Linux/Unix with OpenSSL
    let client =
        Client::try_new(&args.server_address).context("Failed to create HTTP(S) client")?;
    Ok(Box::new(client.with_context(context)))
}

#[tokio::main]
async fn main() -> Result<()> {
    let args = Cli::parse();
    if let Some(log_level) = args.verbosity.log_level() {
        SimpleLogger::new().with_level(log_level.to_level_filter()).init()?;
    }

    debug!("Arguments: {:?}", &args);

    let mut auth_data: Option<AuthData> = None;

    if let Some(ref bearer_token) = args.bearer_token {
        debug!("Using bearer token");
        auth_data = AuthData::bearer(bearer_token);
    }

    #[allow(trivial_casts)]
    let context = swagger::make_context!(
        ContextBuilder,
        EmptyContext,
        auth_data,
        XSpanIdString::default()
    );

    let client = create_client(&args, context)?;

    let result = match args.operation {
        Operation::AdAccountsSlashCreate {
            ad_account_create,
        } => {
            info!("Performing a AdAccountsSlashCreate request");

            let result = client.ad_accounts_slash_create(
                ad_account_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdAccountsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdAccountsSlashList {
            include_shared_accounts,
            bookmark,
            page_size,
        } => {
            info!("Performing a AdAccountsSlashList request");

            let result = client.ad_accounts_slash_list(
                include_shared_accounts,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdAccountsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdAccountSlashAnalytics {
            start_date,
            end_date,
            columns,
            granularity,
            ad_account_id,
            click_window_days,
            engagement_window_days,
            view_window_days,
            conversion_report_time,
            reporting_timezone,
        } => {
            info!("Performing a AdAccountSlashAnalytics request on {:?}", (
                &ad_account_id
            ));

            let result = client.ad_account_slash_analytics(
                start_date,
                end_date,
                columns.as_ref(),
                granularity,
                ad_account_id,
                click_window_days,
                engagement_window_days,
                view_window_days,
                conversion_report_time,
                reporting_timezone,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdAccountSlashAnalyticsResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountSlashAnalyticsResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountSlashAnalyticsResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountSlashAnalyticsResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountSlashAnalyticsResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountSlashAnalyticsResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountSlashAnalyticsResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdAccountTargetingAnalyticsSlashGet {
            ad_account_id,
            start_date,
            end_date,
            targeting_types,
            columns,
            granularity,
            click_window_days,
            engagement_window_days,
            view_window_days,
            conversion_report_time,
            attribution_types,
            reporting_timezone,
        } => {
            info!("Performing a AdAccountTargetingAnalyticsSlashGet request on {:?}", (
                &ad_account_id
            ));

            let result = client.ad_account_targeting_analytics_slash_get(
                ad_account_id,
                start_date,
                end_date,
                targeting_types.as_ref(),
                columns.as_ref(),
                granularity,
                click_window_days,
                engagement_window_days,
                view_window_days,
                conversion_report_time,
                attribution_types.as_ref(),
                reporting_timezone,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdAccountTargetingAnalyticsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountTargetingAnalyticsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountTargetingAnalyticsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountTargetingAnalyticsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountTargetingAnalyticsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountTargetingAnalyticsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountTargetingAnalyticsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdAccountsSlashGet {
            ad_account_id,
        } => {
            info!("Performing a AdAccountsSlashGet request on {:?}", (
                &ad_account_id
            ));

            let result = client.ad_accounts_slash_get(
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdAccountsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AnalyticsSlashCreateConversionProductReport {
            ad_account_id,
            conversion_product_report_create,
        } => {
            info!("Performing a AnalyticsSlashCreateConversionProductReport request on {:?}", (
                &ad_account_id
            ));

            let result = client.analytics_slash_create_conversion_product_report(
                ad_account_id,
                conversion_product_report_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AnalyticsSlashCreateConversionProductReportResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateConversionProductReportResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateConversionProductReportResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateConversionProductReportResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateConversionProductReportResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateConversionProductReportResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateConversionProductReportResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateConversionProductReportResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AnalyticsSlashCreateMmmReport {
            ad_account_id,
            mmm_report_create,
        } => {
            info!("Performing a AnalyticsSlashCreateMmmReport request on {:?}", (
                &ad_account_id
            ));

            let result = client.analytics_slash_create_mmm_report(
                ad_account_id,
                mmm_report_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AnalyticsSlashCreateMmmReportResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateMmmReportResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateMmmReportResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateMmmReportResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateMmmReportResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateMmmReportResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateMmmReportResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateMmmReportResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AnalyticsSlashCreateReport {
            ad_account_id,
            ads_analytics_create_async_request,
        } => {
            info!("Performing a AnalyticsSlashCreateReport request on {:?}", (
                &ad_account_id
            ));

            let result = client.analytics_slash_create_report(
                ad_account_id,
                ads_analytics_create_async_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AnalyticsSlashCreateReportResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateReportResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateReportResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateReportResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateReportResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateReportResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateReportResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AnalyticsSlashGetConversionProductReport {
            ad_account_id,
            token,
        } => {
            info!("Performing a AnalyticsSlashGetConversionProductReport request on {:?}", (
                &ad_account_id
            ));

            let result = client.analytics_slash_get_conversion_product_report(
                ad_account_id,
                token,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AnalyticsSlashGetConversionProductReportResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashGetConversionProductReportResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashGetConversionProductReportResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashGetConversionProductReportResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashGetConversionProductReportResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashGetConversionProductReportResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashGetConversionProductReportResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AnalyticsSlashGetMmmReport {
            ad_account_id,
            token,
        } => {
            info!("Performing a AnalyticsSlashGetMmmReport request on {:?}", (
                &ad_account_id
            ));

            let result = client.analytics_slash_get_mmm_report(
                ad_account_id,
                token,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AnalyticsSlashGetMmmReportResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashGetMmmReportResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashGetMmmReportResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashGetMmmReportResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashGetMmmReportResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashGetMmmReportResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashGetMmmReportResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AnalyticsSlashGetReport {
            ad_account_id,
            token,
        } => {
            info!("Performing a AnalyticsSlashGetReport request on {:?}", (
                &ad_account_id
            ));

            let result = client.analytics_slash_get_report(
                ad_account_id,
                token,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AnalyticsSlashGetReportResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashGetReportResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashGetReportResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashGetReportResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashGetReportResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashGetReportResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashGetReportResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::SandboxSlashDelete {
            ad_account_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a SandboxSlashDelete request on {:?}", (
                &ad_account_id
            ));

            let result = client.sandbox_slash_delete(
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SandboxSlashDeleteResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SandboxSlashDeleteResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SandboxSlashDeleteResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SandboxSlashDeleteResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SandboxSlashDeleteResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SandboxSlashDeleteResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SandboxSlashDeleteResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::TemplatesSlashList {
            ad_account_id,
            bookmark,
            page_size,
            order,
        } => {
            info!("Performing a TemplatesSlashList request on {:?}", (
                &ad_account_id
            ));

            let result = client.templates_slash_list(
                ad_account_id,
                bookmark,
                page_size,
                order,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                TemplatesSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TemplatesSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TemplatesSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TemplatesSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TemplatesSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TemplatesSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TemplatesSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AnalyticsSlashCreateTemplateReport {
            ad_account_id,
            template_id,
            start_date,
            end_date,
            granularity,
        } => {
            info!("Performing a AnalyticsSlashCreateTemplateReport request on {:?}", (
                &ad_account_id,
                &template_id
            ));

            let result = client.analytics_slash_create_template_report(
                ad_account_id,
                template_id,
                start_date,
                end_date,
                granularity,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AnalyticsSlashCreateTemplateReportResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateTemplateReportResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateTemplateReportResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateTemplateReportResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateTemplateReportResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateTemplateReportResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateTemplateReportResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AnalyticsSlashCreateTemplateReportResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdGroupsBidFloorSlashGet {
            ad_account_id,
            bid_floor_create,
        } => {
            info!("Performing a AdGroupsBidFloorSlashGet request on {:?}", (
                &ad_account_id
            ));

            let result = client.ad_groups_bid_floor_slash_get(
                ad_account_id,
                bid_floor_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdGroupsBidFloorSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsBidFloorSlashGetResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsBidFloorSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsBidFloorSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsBidFloorSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsBidFloorSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsBidFloorSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsBidFloorSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdGroupsSlashAnalytics {
            start_date,
            end_date,
            ad_group_ids,
            columns,
            granularity,
            ad_account_id,
            click_window_days,
            engagement_window_days,
            view_window_days,
            conversion_report_time,
            aggregate_report_rows,
            reporting_timezone,
        } => {
            info!("Performing a AdGroupsSlashAnalytics request on {:?}", (
                &ad_account_id
            ));

            let result = client.ad_groups_slash_analytics(
                start_date,
                end_date,
                ad_group_ids.as_ref(),
                columns.as_ref(),
                granularity,
                ad_account_id,
                click_window_days,
                engagement_window_days,
                view_window_days,
                conversion_report_time,
                aggregate_report_rows,
                reporting_timezone,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdGroupsSlashAnalyticsResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashAnalyticsResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashAnalyticsResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashAnalyticsResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashAnalyticsResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashAnalyticsResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashAnalyticsResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdGroupsSlashAudienceSizing {
            ad_account_id,
            ad_group_audience_sizing_create,
        } => {
            info!("Performing a AdGroupsSlashAudienceSizing request on {:?}", (
                &ad_account_id
            ));

            let result = client.ad_groups_slash_audience_sizing(
                ad_account_id,
                ad_group_audience_sizing_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdGroupsSlashAudienceSizingResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashAudienceSizingResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashAudienceSizingResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashAudienceSizingResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashAudienceSizingResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashAudienceSizingResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashAudienceSizingResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashAudienceSizingResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdGroupsSlashCreate {
            ad_account_id,
            ad_group_create_create,
        } => {
            info!("Performing a AdGroupsSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.ad_groups_slash_create(
                ad_account_id,
                ad_group_create_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdGroupsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdGroupsSlashList {
            ad_account_id,
            bookmark,
            page_size,
            order,
            campaign_ids,
            ad_group_ids,
            entity_statuses,
            translate_interests_to_names,
        } => {
            info!("Performing a AdGroupsSlashList request on {:?}", (
                &ad_account_id
            ));

            let result = client.ad_groups_slash_list(
                ad_account_id,
                bookmark,
                page_size,
                order,
                campaign_ids.as_ref(),
                ad_group_ids.as_ref(),
                entity_statuses.as_ref(),
                translate_interests_to_names,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdGroupsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdGroupsSlashUpdate {
            ad_account_id,
            ad_group_update_batch_update,
        } => {
            info!("Performing a AdGroupsSlashUpdate request on {:?}", (
                &ad_account_id
            ));

            let result = client.ad_groups_slash_update(
                ad_account_id,
                ad_group_update_batch_update,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdGroupsSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdGroupsTargetingAnalyticsSlashGet {
            ad_account_id,
            ad_group_ids,
            start_date,
            end_date,
            targeting_types,
            columns,
            granularity,
            click_window_days,
            engagement_window_days,
            view_window_days,
            conversion_report_time,
            attribution_types,
            reporting_timezone,
            sort_columns,
            sort_ascending,
        } => {
            info!("Performing a AdGroupsTargetingAnalyticsSlashGet request on {:?}", (
                &ad_account_id
            ));

            let result = client.ad_groups_targeting_analytics_slash_get(
                ad_account_id,
                ad_group_ids.as_ref(),
                start_date,
                end_date,
                targeting_types.as_ref(),
                columns.as_ref(),
                granularity,
                click_window_days,
                engagement_window_days,
                view_window_days,
                conversion_report_time,
                attribution_types.as_ref(),
                reporting_timezone,
                sort_columns.as_ref(),
                sort_ascending,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdGroupsTargetingAnalyticsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsTargetingAnalyticsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsTargetingAnalyticsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsTargetingAnalyticsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsTargetingAnalyticsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsTargetingAnalyticsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsTargetingAnalyticsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetAdGroupsByPromotionIdsSlashList {
            ad_account_id,
            promotion_ids,
            bookmark,
            page_size,
            order,
        } => {
            info!("Performing a GetAdGroupsByPromotionIdsSlashList request on {:?}", (
                &ad_account_id
            ));

            let result = client.get_ad_groups_by_promotion_ids_slash_list(
                ad_account_id,
                promotion_ids.as_ref(),
                bookmark,
                page_size,
                order,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetAdGroupsByPromotionIdsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetAdGroupsByPromotionIdsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetAdGroupsByPromotionIdsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetAdGroupsByPromotionIdsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetAdGroupsByPromotionIdsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetAdGroupsByPromotionIdsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetAdGroupsByPromotionIdsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdGroupsDynamicTitlesSlashDownloadCsv {
            ad_account_id,
            ad_group_id,
        } => {
            info!("Performing a AdGroupsDynamicTitlesSlashDownloadCsv request on {:?}", (
                &ad_account_id,
                &ad_group_id
            ));

            let result = client.ad_groups_dynamic_titles_slash_download_csv(
                ad_account_id,
                ad_group_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdGroupsDynamicTitlesSlashDownloadCsvResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashDownloadCsvResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashDownloadCsvResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashDownloadCsvResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashDownloadCsvResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashDownloadCsvResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashDownloadCsvResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdGroupsDynamicTitlesSlashGetStatus {
            ad_account_id,
            ad_group_id,
        } => {
            info!("Performing a AdGroupsDynamicTitlesSlashGetStatus request on {:?}", (
                &ad_account_id,
                &ad_group_id
            ));

            let result = client.ad_groups_dynamic_titles_slash_get_status(
                ad_account_id,
                ad_group_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdGroupsDynamicTitlesSlashGetStatusResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashGetStatusResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashGetStatusResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashGetStatusResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashGetStatusResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashGetStatusResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashGetStatusResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdGroupsDynamicTitlesSlashGetUploadUrl {
            ad_account_id,
            ad_group_id,
        } => {
            info!("Performing a AdGroupsDynamicTitlesSlashGetUploadUrl request on {:?}", (
                &ad_account_id,
                &ad_group_id
            ));

            let result = client.ad_groups_dynamic_titles_slash_get_upload_url(
                ad_account_id,
                ad_group_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdGroupsDynamicTitlesSlashGetUploadUrlResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashGetUploadUrlResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashGetUploadUrlResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashGetUploadUrlResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashGetUploadUrlResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashGetUploadUrlResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashGetUploadUrlResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdGroupsDynamicTitlesSlashProcessCsv {
            ad_account_id,
            ad_group_id,
            dynamic_titles_process_csv_create,
        } => {
            info!("Performing a AdGroupsDynamicTitlesSlashProcessCsv request on {:?}", (
                &ad_account_id,
                &ad_group_id
            ));

            let result = client.ad_groups_dynamic_titles_slash_process_csv(
                ad_account_id,
                ad_group_id,
                dynamic_titles_process_csv_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdGroupsDynamicTitlesSlashProcessCsvResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashProcessCsvResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashProcessCsvResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashProcessCsvResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashProcessCsvResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashProcessCsvResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashProcessCsvResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsDynamicTitlesSlashProcessCsvResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdGroupsSlashGet {
            ad_group_id,
            ad_account_id,
        } => {
            info!("Performing a AdGroupsSlashGet request on {:?}", (
                &ad_group_id,
                &ad_account_id
            ));

            let result = client.ad_groups_slash_get(
                ad_group_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdGroupsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdGroupsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdPreviewsSlashCreate {
            ad_account_id,
            ad_preview_request,
        } => {
            info!("Performing a AdPreviewsSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.ad_previews_slash_create(
                ad_account_id,
                ad_preview_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdPreviewsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdPreviewsSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdPreviewsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdPreviewsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdPreviewsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdPreviewsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdPreviewsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdPreviewsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdTargetingAnalyticsSlashGet {
            ad_account_id,
            ad_ids,
            start_date,
            end_date,
            targeting_types,
            columns,
            granularity,
            click_window_days,
            engagement_window_days,
            view_window_days,
            conversion_report_time,
            attribution_types,
            reporting_timezone,
            sort_columns,
            sort_ascending,
        } => {
            info!("Performing a AdTargetingAnalyticsSlashGet request on {:?}", (
                &ad_account_id
            ));

            let result = client.ad_targeting_analytics_slash_get(
                ad_account_id,
                ad_ids.as_ref(),
                start_date,
                end_date,
                targeting_types.as_ref(),
                columns.as_ref(),
                granularity,
                click_window_days,
                engagement_window_days,
                view_window_days,
                conversion_report_time,
                attribution_types.as_ref(),
                reporting_timezone,
                sort_columns.as_ref(),
                sort_ascending,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdTargetingAnalyticsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdTargetingAnalyticsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdTargetingAnalyticsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdTargetingAnalyticsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdTargetingAnalyticsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdTargetingAnalyticsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdTargetingAnalyticsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdsSlashAnalytics {
            start_date,
            end_date,
            columns,
            granularity,
            ad_account_id,
            pin_ids,
            ad_ids,
            click_window_days,
            engagement_window_days,
            view_window_days,
            conversion_report_time,
            campaign_ids,
            reporting_timezone,
        } => {
            info!("Performing a AdsSlashAnalytics request on {:?}", (
                &ad_account_id
            ));

            let result = client.ads_slash_analytics(
                start_date,
                end_date,
                columns.as_ref(),
                granularity,
                ad_account_id,
                pin_ids.as_ref(),
                ad_ids.as_ref(),
                click_window_days,
                engagement_window_days,
                view_window_days,
                conversion_report_time,
                campaign_ids.as_ref(),
                reporting_timezone,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdsSlashAnalyticsResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashAnalyticsResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashAnalyticsResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashAnalyticsResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashAnalyticsResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashAnalyticsResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashAnalyticsResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdsSlashCreate {
            ad_account_id,
            ad_create,
        } => {
            info!("Performing a AdsSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.ads_slash_create(
                ad_account_id,
                ad_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdsSlashList {
            ad_account_id,
            bookmark,
            page_size,
            order,
            campaign_ids,
            ad_group_ids,
            ad_ids,
            entity_statuses,
        } => {
            info!("Performing a AdsSlashList request on {:?}", (
                &ad_account_id
            ));

            let result = client.ads_slash_list(
                ad_account_id,
                bookmark,
                page_size,
                order,
                campaign_ids.as_ref(),
                ad_group_ids.as_ref(),
                ad_ids.as_ref(),
                entity_statuses.as_ref(),
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdsSlashUpdate {
            ad_account_id,
            ad_batch_update,
        } => {
            info!("Performing a AdsSlashUpdate request on {:?}", (
                &ad_account_id
            ));

            let result = client.ads_slash_update(
                ad_account_id,
                ad_batch_update,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdsSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CampaignAdPreviewSlashCreate {
            ad_account_id,
            campaign_ad_preview_create,
        } => {
            info!("Performing a CampaignAdPreviewSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.campaign_ad_preview_slash_create(
                ad_account_id,
                campaign_ad_preview_create.as_ref(),
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CampaignAdPreviewSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignAdPreviewSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignAdPreviewSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignAdPreviewSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignAdPreviewSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignAdPreviewSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignAdPreviewSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignAdPreviewSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CampaignAdPreviewSlashDelete {
            ad_group_ids,
            ad_account_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a CampaignAdPreviewSlashDelete request on {:?}", (
                &ad_account_id
            ));

            let result = client.campaign_ad_preview_slash_delete(
                ad_group_ids.as_ref(),
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CampaignAdPreviewSlashDeleteResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignAdPreviewSlashDeleteResponse::ResourceDeletedSuccessfully
                => "ResourceDeletedSuccessfully\n".to_string()
                    ,
                CampaignAdPreviewSlashDeleteResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignAdPreviewSlashDeleteResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignAdPreviewSlashDeleteResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignAdPreviewSlashDeleteResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignAdPreviewSlashDeleteResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignAdPreviewSlashDeleteResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CampaignAdPreviewSlashRead {
            ad_group_ids,
            ad_account_id,
        } => {
            info!("Performing a CampaignAdPreviewSlashRead request on {:?}", (
                &ad_account_id
            ));

            let result = client.campaign_ad_preview_slash_read(
                ad_group_ids.as_ref(),
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CampaignAdPreviewSlashReadResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignAdPreviewSlashReadResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignAdPreviewSlashReadResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignAdPreviewSlashReadResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignAdPreviewSlashReadResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignAdPreviewSlashReadResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignAdPreviewSlashReadResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdsSlashGet {
            ad_id,
            ad_account_id,
        } => {
            info!("Performing a AdsSlashGet request on {:?}", (
                &ad_id,
                &ad_account_id
            ));

            let result = client.ads_slash_get(
                ad_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdvancedAuctionItemsGetSlashPost {
            advanced_auction_items_get_request,
            ad_account_id,
        } => {
            info!("Performing a AdvancedAuctionItemsGetSlashPost request");

            let result = client.advanced_auction_items_get_slash_post(
                advanced_auction_items_get_request,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdvancedAuctionItemsGetSlashPostResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvancedAuctionItemsGetSlashPostResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvancedAuctionItemsGetSlashPostResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvancedAuctionItemsGetSlashPostResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvancedAuctionItemsGetSlashPostResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvancedAuctionItemsGetSlashPostResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvancedAuctionItemsGetSlashPostResponse::TheServerEncounteredAnUnexpectedConditionThatPreventedItFromFulfillingTheRequest
                (body)
                => "TheServerEncounteredAnUnexpectedConditionThatPreventedItFromFulfillingTheRequest\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvancedAuctionItemsGetSlashPostResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdvancedAuctionItemsSubmitSlashPost {
            advanced_auction_items_submit_request,
            ad_account_id,
        } => {
            info!("Performing a AdvancedAuctionItemsSubmitSlashPost request");

            let result = client.advanced_auction_items_submit_slash_post(
                advanced_auction_items_submit_request,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdvancedAuctionItemsSubmitSlashPostResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvancedAuctionItemsSubmitSlashPostResponse::Successful
                (body)
                => "Successful\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvancedAuctionItemsSubmitSlashPostResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvancedAuctionItemsSubmitSlashPostResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvancedAuctionItemsSubmitSlashPostResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvancedAuctionItemsSubmitSlashPostResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvancedAuctionItemsSubmitSlashPostResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvancedAuctionItemsSubmitSlashPostResponse::TheServerEncounteredAnUnexpectedConditionThatPreventedItFromFulfillingTheRequest
                (body)
                => "TheServerEncounteredAnUnexpectedConditionThatPreventedItFromFulfillingTheRequest\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvancedAuctionItemsSubmitSlashPostResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AudienceInsightsScopeAndTypeSlashGet {
            ad_account_id,
        } => {
            info!("Performing a AudienceInsightsScopeAndTypeSlashGet request on {:?}", (
                &ad_account_id
            ));

            let result = client.audience_insights_scope_and_type_slash_get(
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AudienceInsightsScopeAndTypeSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudienceInsightsScopeAndTypeSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudienceInsightsScopeAndTypeSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudienceInsightsScopeAndTypeSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudienceInsightsScopeAndTypeSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudienceInsightsScopeAndTypeSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudienceInsightsScopeAndTypeSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AudienceInsightsSlashGet {
            ad_account_id,
            audience_insight_type,
        } => {
            info!("Performing a AudienceInsightsSlashGet request on {:?}", (
                &ad_account_id
            ));

            let result = client.audience_insights_slash_get(
                ad_account_id,
                audience_insight_type,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AudienceInsightsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudienceInsightsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudienceInsightsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudienceInsightsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudienceInsightsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudienceInsightsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudienceInsightsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdAccountsAudiencesSharedAccountsSlashList {
            audience_id,
            account_type,
            ad_account_id,
            bookmark,
            page_size,
        } => {
            info!("Performing a AdAccountsAudiencesSharedAccountsSlashList request on {:?}", (
                &ad_account_id
            ));

            let result = client.ad_accounts_audiences_shared_accounts_slash_list(
                audience_id,
                account_type,
                ad_account_id,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdAccountsAudiencesSharedAccountsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsAudiencesSharedAccountsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsAudiencesSharedAccountsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsAudiencesSharedAccountsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsAudiencesSharedAccountsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsAudiencesSharedAccountsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsAudiencesSharedAccountsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BusinessAccountAudiencesSharedAccountsSlashList {
            business_id,
            audience_id,
            account_type,
            bookmark,
            page_size,
        } => {
            info!("Performing a BusinessAccountAudiencesSharedAccountsSlashList request on {:?}", (
                &business_id
            ));

            let result = client.business_account_audiences_shared_accounts_slash_list(
                business_id,
                audience_id,
                account_type,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BusinessAccountAudiencesSharedAccountsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAccountAudiencesSharedAccountsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAccountAudiencesSharedAccountsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAccountAudiencesSharedAccountsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAccountAudiencesSharedAccountsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAccountAudiencesSharedAccountsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAccountAudiencesSharedAccountsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::SharedAudiencesForBusinessSlashList {
            business_id,
            order,
            bookmark,
            page_size,
        } => {
            info!("Performing a SharedAudiencesForBusinessSlashList request on {:?}", (
                &business_id
            ));

            let result = client.shared_audiences_for_business_slash_list(
                business_id,
                order,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SharedAudiencesForBusinessSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SharedAudiencesForBusinessSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SharedAudiencesForBusinessSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SharedAudiencesForBusinessSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SharedAudiencesForBusinessSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SharedAudiencesForBusinessSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SharedAudiencesForBusinessSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UpdateAdAccountToAdAccountSharedAudience {
            ad_account_id,
            ad_account_to_ad_account_shared_audience_update_with_required_body,
        } => {
            info!("Performing a UpdateAdAccountToAdAccountSharedAudience request on {:?}", (
                &ad_account_id
            ));

            let result = client.update_ad_account_to_ad_account_shared_audience(
                ad_account_id,
                ad_account_to_ad_account_shared_audience_update_with_required_body,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UpdateAdAccountToAdAccountSharedAudienceResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateAdAccountToAdAccountSharedAudienceResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateAdAccountToAdAccountSharedAudienceResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateAdAccountToAdAccountSharedAudienceResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateAdAccountToAdAccountSharedAudienceResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateAdAccountToAdAccountSharedAudienceResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateAdAccountToAdAccountSharedAudienceResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UpdateAdAccountToBusinessSharedAudience {
            ad_account_id,
            ad_account_to_business_shared_audience_update_with_required_body,
        } => {
            info!("Performing a UpdateAdAccountToBusinessSharedAudience request on {:?}", (
                &ad_account_id
            ));

            let result = client.update_ad_account_to_business_shared_audience(
                ad_account_id,
                ad_account_to_business_shared_audience_update_with_required_body,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UpdateAdAccountToBusinessSharedAudienceResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateAdAccountToBusinessSharedAudienceResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateAdAccountToBusinessSharedAudienceResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateAdAccountToBusinessSharedAudienceResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateAdAccountToBusinessSharedAudienceResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateAdAccountToBusinessSharedAudienceResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateAdAccountToBusinessSharedAudienceResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UpdateBusinessToAdAccountSharedAudience {
            business_id,
            business_to_ad_account_shared_audience_update_with_required_body,
        } => {
            info!("Performing a UpdateBusinessToAdAccountSharedAudience request on {:?}", (
                &business_id
            ));

            let result = client.update_business_to_ad_account_shared_audience(
                business_id,
                business_to_ad_account_shared_audience_update_with_required_body,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UpdateBusinessToAdAccountSharedAudienceResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateBusinessToAdAccountSharedAudienceResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateBusinessToAdAccountSharedAudienceResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateBusinessToAdAccountSharedAudienceResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateBusinessToAdAccountSharedAudienceResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateBusinessToAdAccountSharedAudienceResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateBusinessToAdAccountSharedAudienceResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UpdateBusinessToBusinessSharedAudience {
            business_id,
            business_to_business_shared_audience_update_with_required_body,
        } => {
            info!("Performing a UpdateBusinessToBusinessSharedAudience request on {:?}", (
                &business_id
            ));

            let result = client.update_business_to_business_shared_audience(
                business_id,
                business_to_business_shared_audience_update_with_required_body,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UpdateBusinessToBusinessSharedAudienceResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateBusinessToBusinessSharedAudienceResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateBusinessToBusinessSharedAudienceResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateBusinessToBusinessSharedAudienceResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateBusinessToBusinessSharedAudienceResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateBusinessToBusinessSharedAudienceResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateBusinessToBusinessSharedAudienceResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AudiencesSlashCreate {
            ad_account_id,
            ad_accounts_audience_create,
        } => {
            info!("Performing a AudiencesSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.audiences_slash_create(
                ad_account_id,
                ad_accounts_audience_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AudiencesSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AudiencesSlashList {
            ad_account_id,
            bookmark,
            page_size,
            order,
            ownership_type,
            exclude_nca,
        } => {
            info!("Performing a AudiencesSlashList request on {:?}", (
                &ad_account_id
            ));

            let result = client.audiences_slash_list(
                ad_account_id,
                bookmark,
                page_size,
                order,
                ownership_type,
                exclude_nca,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AudiencesSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AudiencesSlashGet {
            audience_id,
            ad_account_id,
        } => {
            info!("Performing a AudiencesSlashGet request on {:?}", (
                &audience_id,
                &ad_account_id
            ));

            let result = client.audiences_slash_get(
                audience_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AudiencesSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AudiencesSlashUpdate {
            audience_id,
            ad_account_id,
            ad_accounts_audience_update,
        } => {
            info!("Performing a AudiencesSlashUpdate request on {:?}", (
                &audience_id,
                &ad_account_id
            ));

            let result = client.audiences_slash_update(
                audience_id,
                ad_account_id,
                ad_accounts_audience_update,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AudiencesSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AudiencesSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdsCreditSlashRedeem {
            ad_account_id,
            ads_credit_redeem_create,
        } => {
            info!("Performing a AdsCreditSlashRedeem request on {:?}", (
                &ad_account_id
            ));

            let result = client.ads_credit_slash_redeem(
                ad_account_id,
                ads_credit_redeem_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdsCreditSlashRedeemResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsCreditSlashRedeemResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsCreditSlashRedeemResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsCreditSlashRedeemResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsCreditSlashRedeemResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsCreditSlashRedeemResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsCreditSlashRedeemResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsCreditSlashRedeemResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdsCreditsDiscountsSlashGet {
            ad_account_id,
            bookmark,
            page_size,
        } => {
            info!("Performing a AdsCreditsDiscountsSlashGet request on {:?}", (
                &ad_account_id
            ));

            let result = client.ads_credits_discounts_slash_get(
                ad_account_id,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdsCreditsDiscountsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsCreditsDiscountsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsCreditsDiscountsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsCreditsDiscountsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsCreditsDiscountsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsCreditsDiscountsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdsCreditsDiscountsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BillingInvoicesSlashGet {
            ad_account_id,
            bookmark,
            page_size,
            order,
            sort,
            status,
            document_type,
            start_due_date,
            end_due_date,
        } => {
            info!("Performing a BillingInvoicesSlashGet request on {:?}", (
                &ad_account_id
            ));

            let result = client.billing_invoices_slash_get(
                ad_account_id,
                bookmark,
                page_size,
                order,
                sort,
                status,
                document_type,
                start_due_date,
                end_due_date,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BillingInvoicesSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BillingInvoicesSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BillingInvoicesSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BillingInvoicesSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BillingInvoicesSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BillingInvoicesSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BillingInvoicesSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BillingProfilesSlashGet {
            is_active,
            ad_account_id,
            bookmark,
            page_size,
        } => {
            info!("Performing a BillingProfilesSlashGet request on {:?}", (
                &ad_account_id
            ));

            let result = client.billing_profiles_slash_get(
                is_active,
                ad_account_id,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BillingProfilesSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BillingProfilesSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BillingProfilesSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BillingProfilesSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BillingProfilesSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BillingProfilesSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BillingProfilesSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::SsioAccountsSlashGet {
            ad_account_id,
        } => {
            info!("Performing a SsioAccountsSlashGet request on {:?}", (
                &ad_account_id
            ));

            let result = client.ssio_accounts_slash_get(
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SsioAccountsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioAccountsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioAccountsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioAccountsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioAccountsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioAccountsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioAccountsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::SsioInsertionOrderSlashCreate {
            ad_account_id,
            ssio_insertion_order_create,
        } => {
            info!("Performing a SsioInsertionOrderSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.ssio_insertion_order_slash_create(
                ad_account_id,
                ssio_insertion_order_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SsioInsertionOrderSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrderSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrderSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrderSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrderSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrderSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrderSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrderSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::SsioInsertionOrderSlashEdit {
            ad_account_id,
            ssio_insertion_order_update,
        } => {
            info!("Performing a SsioInsertionOrderSlashEdit request on {:?}", (
                &ad_account_id
            ));

            let result = client.ssio_insertion_order_slash_edit(
                ad_account_id,
                ssio_insertion_order_update,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SsioInsertionOrderSlashEditResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrderSlashEditResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrderSlashEditResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrderSlashEditResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrderSlashEditResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrderSlashEditResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrderSlashEditResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::SsioInsertionOrdersStatusSlashGetByAdAccount {
            ad_account_id,
            bookmark,
            page_size,
        } => {
            info!("Performing a SsioInsertionOrdersStatusSlashGetByAdAccount request on {:?}", (
                &ad_account_id
            ));

            let result = client.ssio_insertion_orders_status_slash_get_by_ad_account(
                ad_account_id,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SsioInsertionOrdersStatusSlashGetByAdAccountResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrdersStatusSlashGetByAdAccountResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrdersStatusSlashGetByAdAccountResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrdersStatusSlashGetByAdAccountResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrdersStatusSlashGetByAdAccountResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrdersStatusSlashGetByAdAccountResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrdersStatusSlashGetByAdAccountResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::SsioOrderLinesSlashGetByAdAccount {
            ad_account_id,
            pin_order_id,
            bookmark,
            page_size,
        } => {
            info!("Performing a SsioOrderLinesSlashGetByAdAccount request on {:?}", (
                &ad_account_id
            ));

            let result = client.ssio_order_lines_slash_get_by_ad_account(
                ad_account_id,
                pin_order_id,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SsioOrderLinesSlashGetByAdAccountResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioOrderLinesSlashGetByAdAccountResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioOrderLinesSlashGetByAdAccountResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioOrderLinesSlashGetByAdAccountResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioOrderLinesSlashGetByAdAccountResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioOrderLinesSlashGetByAdAccountResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioOrderLinesSlashGetByAdAccountResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BillingInvoiceDownloadSlashGet {
            ad_account_id,
            billing_invoice_id,
        } => {
            info!("Performing a BillingInvoiceDownloadSlashGet request on {:?}", (
                &ad_account_id,
                &billing_invoice_id
            ));

            let result = client.billing_invoice_download_slash_get(
                ad_account_id,
                billing_invoice_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BillingInvoiceDownloadSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BillingInvoiceDownloadSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BillingInvoiceDownloadSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BillingInvoiceDownloadSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BillingInvoiceDownloadSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BillingInvoiceDownloadSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BillingInvoiceDownloadSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::SsioInsertionOrdersStatusSlashGetByPinOrderId {
            ad_account_id,
            pin_order_id,
        } => {
            info!("Performing a SsioInsertionOrdersStatusSlashGetByPinOrderId request on {:?}", (
                &ad_account_id,
                &pin_order_id
            ));

            let result = client.ssio_insertion_orders_status_slash_get_by_pin_order_id(
                ad_account_id,
                pin_order_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SsioInsertionOrdersStatusSlashGetByPinOrderIdResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BoardsSlashCreate {
            board_create,
            ad_account_id,
        } => {
            info!("Performing a BoardsSlashCreate request");

            let result = client.boards_slash_create(
                board_create,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BoardsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BoardsSlashList {
            ad_account_id,
            privacy,
            bookmark,
            page_size,
        } => {
            info!("Performing a BoardsSlashList request");

            let result = client.boards_slash_list(
                ad_account_id,
                privacy,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BoardsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BoardSectionsSlashCreate {
            board_id,
            board_section_create,
            ad_account_id,
        } => {
            info!("Performing a BoardSectionsSlashCreate request on {:?}", (
                &board_id
            ));

            let result = client.board_sections_slash_create(
                board_id,
                board_section_create,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BoardSectionsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BoardSectionsSlashList {
            board_id,
            ad_account_id,
            bookmark,
            page_size,
        } => {
            info!("Performing a BoardSectionsSlashList request on {:?}", (
                &board_id
            ));

            let result = client.board_sections_slash_list(
                board_id,
                ad_account_id,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BoardSectionsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BoardsSlashDelete {
            board_id,
            ad_account_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a BoardsSlashDelete request on {:?}", (
                &board_id
            ));

            let result = client.boards_slash_delete(
                board_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BoardsSlashDeleteResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashDeleteResponse::ResourceDeletedSuccessfully
                => "ResourceDeletedSuccessfully\n".to_string()
                    ,
                BoardsSlashDeleteResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashDeleteResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashDeleteResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashDeleteResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashDeleteResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashDeleteResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BoardsSlashGet {
            board_id,
            ad_account_id,
        } => {
            info!("Performing a BoardsSlashGet request on {:?}", (
                &board_id
            ));

            let result = client.boards_slash_get(
                board_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BoardsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BoardsSlashListPins {
            board_id,
            creative_types,
            ad_account_id,
            pin_metrics,
            bookmark,
            page_size,
        } => {
            info!("Performing a BoardsSlashListPins request on {:?}", (
                &board_id
            ));

            let result = client.boards_slash_list_pins(
                board_id,
                creative_types.as_ref(),
                ad_account_id,
                pin_metrics,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BoardsSlashListPinsResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashListPinsResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashListPinsResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashListPinsResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashListPinsResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashListPinsResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashListPinsResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BoardsSlashUpdate {
            board_id,
            board_with_update_privacy_update,
            ad_account_id,
        } => {
            info!("Performing a BoardsSlashUpdate request on {:?}", (
                &board_id
            ));

            let result = client.boards_slash_update(
                board_id,
                board_with_update_privacy_update,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BoardsSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BoardSectionsSlashDelete {
            board_id,
            section_id,
            ad_account_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a BoardSectionsSlashDelete request on {:?}", (
                &board_id,
                &section_id
            ));

            let result = client.board_sections_slash_delete(
                board_id,
                section_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BoardSectionsSlashDeleteResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashDeleteResponse::ResourceDeletedSuccessfully
                => "ResourceDeletedSuccessfully\n".to_string()
                    ,
                BoardSectionsSlashDeleteResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashDeleteResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashDeleteResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashDeleteResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashDeleteResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashDeleteResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BoardSectionsSlashListPins {
            board_id,
            section_id,
            ad_account_id,
            bookmark,
            page_size,
        } => {
            info!("Performing a BoardSectionsSlashListPins request on {:?}", (
                &board_id,
                &section_id
            ));

            let result = client.board_sections_slash_list_pins(
                board_id,
                section_id,
                ad_account_id,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BoardSectionsSlashListPinsResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashListPinsResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashListPinsResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashListPinsResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashListPinsResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashListPinsResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashListPinsResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BoardSectionsSlashUpdate {
            board_id,
            section_id,
            board_section_update_with_required_body,
            ad_account_id,
        } => {
            info!("Performing a BoardSectionsSlashUpdate request on {:?}", (
                &board_id,
                &section_id
            ));

            let result = client.board_sections_slash_update(
                board_id,
                section_id,
                board_section_update_with_required_body,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BoardSectionsSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardSectionsSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BulkDownloadSlashCreate {
            ad_account_id,
            bulk_download_create,
        } => {
            info!("Performing a BulkDownloadSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.bulk_download_slash_create(
                ad_account_id,
                bulk_download_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BulkDownloadSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BulkDownloadSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BulkDownloadSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BulkDownloadSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BulkDownloadSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BulkDownloadSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BulkDownloadSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BulkDownloadSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BulkUpsertSlashCreate {
            ad_account_id,
            bulk_upsert_request,
        } => {
            info!("Performing a BulkUpsertSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.bulk_upsert_slash_create(
                ad_account_id,
                bulk_upsert_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BulkUpsertSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BulkUpsertSlashCreateResponse::UnexpectedError
                (body)
                => "UnexpectedError\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BulkRequestSlashGet {
            ad_account_id,
            bulk_request_id,
            include_details,
        } => {
            info!("Performing a BulkRequestSlashGet request on {:?}", (
                &ad_account_id,
                &bulk_request_id
            ));

            let result = client.bulk_request_slash_get(
                ad_account_id,
                bulk_request_id,
                include_details,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BulkRequestSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BulkRequestSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BulkRequestSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BulkRequestSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BulkRequestSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BulkRequestSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BulkRequestSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AssetGroupSlashCreate {
            business_id,
            asset_group_input_create,
        } => {
            info!("Performing a AssetGroupSlashCreate request on {:?}", (
                &business_id
            ));

            let result = client.asset_group_slash_create(
                business_id,
                asset_group_input_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AssetGroupSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetGroupSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetGroupSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetGroupSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetGroupSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetGroupSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetGroupSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetGroupSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AssetGroupSlashDelete {
            business_id,
            asset_group_deletion_delete,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a AssetGroupSlashDelete request on {:?}", (
                &business_id
            ));

            let result = client.asset_group_slash_delete(
                business_id,
                asset_group_deletion_delete,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AssetGroupSlashDeleteResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetGroupSlashDeleteResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AssetGroupSlashUpdate {
            business_id,
            asset_group_modification_read_or_update,
        } => {
            info!("Performing a AssetGroupSlashUpdate request on {:?}", (
                &business_id
            ));

            let result = client.asset_group_slash_update(
                business_id,
                asset_group_modification_read_or_update,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AssetGroupSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetGroupSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetGroupSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetGroupSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetGroupSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetGroupSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetGroupSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BusinessAssetsSlashGet {
            business_id,
            permissions,
            child_asset_id,
            asset_group_id,
            asset_type,
            start_index,
            bookmark,
            page_size,
        } => {
            info!("Performing a BusinessAssetsSlashGet request on {:?}", (
                &business_id
            ));

            let result = client.business_assets_slash_get(
                business_id,
                permissions.as_ref(),
                child_asset_id,
                asset_group_id,
                asset_type,
                start_index,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BusinessAssetsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAssetsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAssetsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAssetsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAssetsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAssetsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAssetsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BusinessMembersAssetAccessSlashDelete {
            business_id,
            business_members_asset_access_delete_body,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a BusinessMembersAssetAccessSlashDelete request on {:?}", (
                &business_id
            ));

            let result = client.business_members_asset_access_slash_delete(
                business_id,
                business_members_asset_access_delete_body,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BusinessMembersAssetAccessSlashDeleteResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessMembersAssetAccessSlashDeleteResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BusinessMembersAssetAccessSlashUpdate {
            business_id,
            update_member_asset_access_body,
        } => {
            info!("Performing a BusinessMembersAssetAccessSlashUpdate request on {:?}", (
                &business_id
            ));

            let result = client.business_members_asset_access_slash_update(
                business_id,
                update_member_asset_access_body,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BusinessMembersAssetAccessSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessMembersAssetAccessSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessMembersAssetAccessSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessMembersAssetAccessSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessMembersAssetAccessSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessMembersAssetAccessSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessMembersAssetAccessSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::DeletePartnerAssetAccessHandlerImpl {
            business_id,
            delete_partner_asset_access_body,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a DeletePartnerAssetAccessHandlerImpl request on {:?}", (
                &business_id
            ));

            let result = client.delete_partner_asset_access_handler_impl(
                business_id,
                delete_partner_asset_access_body,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                DeletePartnerAssetAccessHandlerImplResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                DeletePartnerAssetAccessHandlerImplResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UpdatePartnerAssetAccessHandlerImpl {
            business_id,
            update_partner_asset_access_body,
        } => {
            info!("Performing a UpdatePartnerAssetAccessHandlerImpl request on {:?}", (
                &business_id
            ));

            let result = client.update_partner_asset_access_handler_impl(
                business_id,
                update_partner_asset_access_body,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UpdatePartnerAssetAccessHandlerImplResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdatePartnerAssetAccessHandlerImplResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdatePartnerAssetAccessHandlerImplResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdatePartnerAssetAccessHandlerImplResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdatePartnerAssetAccessHandlerImplResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdatePartnerAssetAccessHandlerImplResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdatePartnerAssetAccessHandlerImplResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BusinessAssetMembersSlashGet {
            business_id,
            asset_id,
            start_index,
            fetch_system_users,
            bookmark,
            page_size,
        } => {
            info!("Performing a BusinessAssetMembersSlashGet request on {:?}", (
                &business_id,
                &asset_id
            ));

            let result = client.business_asset_members_slash_get(
                business_id,
                asset_id,
                start_index,
                fetch_system_users,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BusinessAssetMembersSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAssetMembersSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAssetMembersSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAssetMembersSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAssetMembersSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAssetMembersSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAssetMembersSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BusinessAssetPartnersSlashGet {
            business_id,
            asset_id,
            start_index,
            bookmark,
            page_size,
        } => {
            info!("Performing a BusinessAssetPartnersSlashGet request on {:?}", (
                &business_id,
                &asset_id
            ));

            let result = client.business_asset_partners_slash_get(
                business_id,
                asset_id,
                start_index,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BusinessAssetPartnersSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAssetPartnersSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAssetPartnersSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAssetPartnersSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAssetPartnersSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAssetPartnersSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessAssetPartnersSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BusinessMemberAssetsSlashGet {
            business_id,
            member_id,
            asset_type,
            start_index,
            sort_by,
            sort_ascending,
            search_by,
            search_value,
            asset_permission_type,
            ad_account_statuses,
            bookmark,
            page_size,
        } => {
            info!("Performing a BusinessMemberAssetsSlashGet request on {:?}", (
                &business_id,
                &member_id
            ));

            let result = client.business_member_assets_slash_get(
                business_id,
                member_id,
                asset_type,
                start_index,
                sort_by,
                sort_ascending,
                search_by,
                search_value,
                asset_permission_type,
                ad_account_statuses.as_ref(),
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BusinessMemberAssetsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessMemberAssetsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessMemberAssetsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessMemberAssetsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessMemberAssetsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessMemberAssetsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessMemberAssetsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BusinessPartnerAssetAccessSlashGet {
            business_id,
            partner_id,
            partner_type,
            asset_type,
            start_index,
            sort_by,
            sort_ascending,
            search_by,
            search_value,
            bookmark,
            page_size,
        } => {
            info!("Performing a BusinessPartnerAssetAccessSlashGet request on {:?}", (
                &business_id,
                &partner_id
            ));

            let result = client.business_partner_asset_access_slash_get(
                business_id,
                partner_id,
                partner_type,
                asset_type,
                start_index,
                sort_by,
                sort_ascending,
                search_by,
                search_value,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BusinessPartnerAssetAccessSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessPartnerAssetAccessSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessPartnerAssetAccessSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessPartnerAssetAccessSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessPartnerAssetAccessSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessPartnerAssetAccessSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BusinessPartnerAssetAccessSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::RespondBusinessAccessInvites {
            auth_respond_invites_body,
        } => {
            info!("Performing a RespondBusinessAccessInvites request");

            let result = client.respond_business_access_invites(
                auth_respond_invites_body,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                RespondBusinessAccessInvitesResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                RespondBusinessAccessInvitesResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                RespondBusinessAccessInvitesResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                RespondBusinessAccessInvitesResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                RespondBusinessAccessInvitesResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                RespondBusinessAccessInvitesResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                RespondBusinessAccessInvitesResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AssetAccessRequestsSlashCreate {
            business_id,
            create_asset_access_request_body,
        } => {
            info!("Performing a AssetAccessRequestsSlashCreate request on {:?}", (
                &business_id
            ));

            let result = client.asset_access_requests_slash_create(
                business_id,
                create_asset_access_request_body,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AssetAccessRequestsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetAccessRequestsSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetAccessRequestsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetAccessRequestsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetAccessRequestsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetAccessRequestsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetAccessRequestsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AssetAccessRequestsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CancelInvitesOrRequests {
            business_id,
            cancel_invites_request,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a CancelInvitesOrRequests request on {:?}", (
                &business_id
            ));

            let result = client.cancel_invites_or_requests(
                business_id,
                cancel_invites_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CancelInvitesOrRequestsResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CancelInvitesOrRequestsResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateAssetInvites {
            business_id,
            create_asset_invites_request,
        } => {
            info!("Performing a CreateAssetInvites request on {:?}", (
                &business_id
            ));

            let result = client.create_asset_invites(
                business_id,
                create_asset_invites_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateAssetInvitesResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CreateAssetInvitesResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CreateAssetInvitesResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CreateAssetInvitesResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CreateAssetInvitesResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CreateAssetInvitesResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CreateAssetInvitesResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CreateAssetInvitesResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CreateMembershipOrPartnershipInvites {
            business_id,
            create_membership_or_partnership_invites_body,
        } => {
            info!("Performing a CreateMembershipOrPartnershipInvites request on {:?}", (
                &business_id
            ));

            let result = client.create_membership_or_partnership_invites(
                business_id,
                create_membership_or_partnership_invites_body,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CreateMembershipOrPartnershipInvitesResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CreateMembershipOrPartnershipInvitesResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CreateMembershipOrPartnershipInvitesResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CreateMembershipOrPartnershipInvitesResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CreateMembershipOrPartnershipInvitesResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CreateMembershipOrPartnershipInvitesResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CreateMembershipOrPartnershipInvitesResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CreateMembershipOrPartnershipInvitesResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetSlashInvites {
            business_id,
            is_member,
            invite_status,
            invite_type,
            bookmark,
            page_size,
        } => {
            info!("Performing a GetSlashInvites request on {:?}", (
                &business_id
            ));

            let result = client.get_slash_invites(
                business_id,
                is_member,
                invite_status.as_ref(),
                invite_type,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetSlashInvitesResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashInvitesResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashInvitesResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashInvitesResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashInvitesResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashInvitesResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashInvitesResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetSlashBusinessEmployers {
            assets_summary,
            bookmark,
            page_size,
        } => {
            info!("Performing a GetSlashBusinessEmployers request");

            let result = client.get_slash_business_employers(
                assets_summary,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetSlashBusinessEmployersResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashBusinessEmployersResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashBusinessEmployersResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashBusinessEmployersResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashBusinessEmployersResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashBusinessEmployersResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashBusinessEmployersResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BrandAccountsSlashCreate {
            business_hierarchy_id,
            brand_account_create,
        } => {
            info!("Performing a BrandAccountsSlashCreate request on {:?}", (
                &business_hierarchy_id
            ));

            let result = client.brand_accounts_slash_create(
                business_hierarchy_id,
                brand_account_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BrandAccountsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BrandAccountsSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BrandAccountsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BrandAccountsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BrandAccountsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BrandAccountsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BrandAccountsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BrandAccountsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::DeleteBusinessMembership {
            business_id,
            delete_business_membership_body,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a DeleteBusinessMembership request on {:?}", (
                &business_id
            ));

            let result = client.delete_business_membership(
                business_id,
                delete_business_membership_body,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                DeleteBusinessMembershipResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                DeleteBusinessMembershipResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::DeleteBusinessPartners {
            business_id,
            delete_business_partners_delete,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a DeleteBusinessPartners request on {:?}", (
                &business_id
            ));

            let result = client.delete_business_partners(
                business_id,
                delete_business_partners_delete,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                DeleteBusinessPartnersResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                DeleteBusinessPartnersResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                DeleteBusinessPartnersResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetSlashBusinessMembers {
            business_id,
            fetch_system_users,
            assets_summary,
            business_roles,
            member_ids,
            start_index,
            bookmark,
            page_size,
        } => {
            info!("Performing a GetSlashBusinessMembers request on {:?}", (
                &business_id
            ));

            let result = client.get_slash_business_members(
                business_id,
                fetch_system_users,
                assets_summary,
                business_roles.as_ref(),
                member_ids,
                start_index,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetSlashBusinessMembersResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashBusinessMembersResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashBusinessMembersResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashBusinessMembersResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashBusinessMembersResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashBusinessMembersResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashBusinessMembersResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetSlashBusinessPartners {
            business_id,
            assets_summary,
            partner_type,
            partner_ids,
            start_index,
            sort_ascending,
            bookmark,
            page_size,
        } => {
            info!("Performing a GetSlashBusinessPartners request on {:?}", (
                &business_id
            ));

            let result = client.get_slash_business_partners(
                business_id,
                assets_summary,
                partner_type,
                partner_ids,
                start_index,
                sort_ascending,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetSlashBusinessPartnersResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashBusinessPartnersResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashBusinessPartnersResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashBusinessPartnersResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashBusinessPartnersResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashBusinessPartnersResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetSlashBusinessPartnersResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UpdateSlashBusinessMemberships {
            business_id,
            business_membership_member,
        } => {
            info!("Performing a UpdateSlashBusinessMemberships request on {:?}", (
                &business_id
            ));

            let result = client.update_slash_business_memberships(
                business_id,
                business_membership_member,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UpdateSlashBusinessMembershipsResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateSlashBusinessMembershipsResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateSlashBusinessMembershipsResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateSlashBusinessMembershipsResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateSlashBusinessMembershipsResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateSlashBusinessMembershipsResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UpdateSlashBusinessMembershipsResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BrandAccountsSlashUpdate {
            brand_account_id,
            business_hierarchy_id,
            brand_account_update,
        } => {
            info!("Performing a BrandAccountsSlashUpdate request on {:?}", (
                &brand_account_id,
                &business_hierarchy_id
            ));

            let result = client.brand_accounts_slash_update(
                brand_account_id,
                business_hierarchy_id,
                brand_account_update,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BrandAccountsSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BrandAccountsSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BrandAccountsSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BrandAccountsSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BrandAccountsSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BrandAccountsSlashUpdateResponse::TheRequestCouldNotBeProcessedBecauseOfAConflictInTheCurrentStateOfTheResource
                (body)
                => "TheRequestCouldNotBeProcessedBecauseOfAConflictInTheCurrentStateOfTheResource\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BrandAccountsSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BrandAccountsSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::SystemUserSlashUpdate {
            business_id,
            system_user_id,
            system_user_update_with_required_body,
        } => {
            info!("Performing a SystemUserSlashUpdate request on {:?}", (
                &business_id,
                &system_user_id
            ));

            let result = client.system_user_slash_update(
                business_id,
                system_user_id,
                system_user_update_with_required_body,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SystemUserSlashUpdateResponse::TheRequestHasSucceeded
                => "TheRequestHasSucceeded\n".to_string()
                    ,
                SystemUserSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SystemUserSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SystemUserSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SystemUserSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SystemUserSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SystemUserSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdPinsSlashAnalytics {
            campaign_id,
            pin_ids,
            start_date,
            end_date,
            columns,
            granularity,
            ad_account_id,
            click_window_days,
            engagement_window_days,
            view_window_days,
            conversion_report_time,
        } => {
            info!("Performing a AdPinsSlashAnalytics request on {:?}", (
                &ad_account_id
            ));

            let result = client.ad_pins_slash_analytics(
                campaign_id,
                pin_ids.as_ref(),
                start_date,
                end_date,
                columns.as_ref(),
                granularity,
                ad_account_id,
                click_window_days,
                engagement_window_days,
                view_window_days,
                conversion_report_time,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdPinsSlashAnalyticsResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdPinsSlashAnalyticsResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdPinsSlashAnalyticsResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdPinsSlashAnalyticsResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdPinsSlashAnalyticsResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdPinsSlashAnalyticsResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdPinsSlashAnalyticsResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CampaignTargetingAnalyticsSlashGet {
            ad_account_id,
            campaign_ids,
            start_date,
            end_date,
            targeting_types,
            columns,
            granularity,
            click_window_days,
            engagement_window_days,
            view_window_days,
            conversion_report_time,
            attribution_types,
            reporting_timezone,
        } => {
            info!("Performing a CampaignTargetingAnalyticsSlashGet request on {:?}", (
                &ad_account_id
            ));

            let result = client.campaign_targeting_analytics_slash_get(
                ad_account_id,
                campaign_ids.as_ref(),
                start_date,
                end_date,
                targeting_types.as_ref(),
                columns.as_ref(),
                granularity,
                click_window_days,
                engagement_window_days,
                view_window_days,
                conversion_report_time,
                attribution_types.as_ref(),
                reporting_timezone,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CampaignTargetingAnalyticsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignTargetingAnalyticsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignTargetingAnalyticsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignTargetingAnalyticsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignTargetingAnalyticsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignTargetingAnalyticsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignTargetingAnalyticsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CampaignsSlashAnalytics {
            start_date,
            end_date,
            campaign_ids,
            columns,
            granularity,
            ad_account_id,
            click_window_days,
            engagement_window_days,
            view_window_days,
            conversion_report_time,
            aggregate_report_rows,
            reporting_timezone,
        } => {
            info!("Performing a CampaignsSlashAnalytics request on {:?}", (
                &ad_account_id
            ));

            let result = client.campaigns_slash_analytics(
                start_date,
                end_date,
                campaign_ids.as_ref(),
                columns.as_ref(),
                granularity,
                ad_account_id,
                click_window_days,
                engagement_window_days,
                view_window_days,
                conversion_report_time,
                aggregate_report_rows,
                reporting_timezone,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CampaignsSlashAnalyticsResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashAnalyticsResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashAnalyticsResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashAnalyticsResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashAnalyticsResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashAnalyticsResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashAnalyticsResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CampaignsSlashCreate {
            ad_account_id,
            campaign_create_item,
        } => {
            info!("Performing a CampaignsSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.campaigns_slash_create(
                ad_account_id,
                campaign_create_item,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CampaignsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CampaignsSlashList {
            ad_account_id,
            bookmark,
            page_size,
            order,
            campaign_ids,
            entity_statuses,
        } => {
            info!("Performing a CampaignsSlashList request on {:?}", (
                &ad_account_id
            ));

            let result = client.campaigns_slash_list(
                ad_account_id,
                bookmark,
                page_size,
                order,
                campaign_ids.as_ref(),
                entity_statuses.as_ref(),
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CampaignsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CampaignsSlashUpdate {
            ad_account_id,
            campaign_batch_update_item,
        } => {
            info!("Performing a CampaignsSlashUpdate request on {:?}", (
                &ad_account_id
            ));

            let result = client.campaigns_slash_update(
                ad_account_id,
                campaign_batch_update_item,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CampaignsSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetCampaignDeliveryEstimates {
            ad_account_id,
            campaign_delivery_estimates_campaign,
        } => {
            info!("Performing a GetCampaignDeliveryEstimates request on {:?}", (
                &ad_account_id
            ));

            let result = client.get_campaign_delivery_estimates(
                ad_account_id,
                campaign_delivery_estimates_campaign,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetCampaignDeliveryEstimatesResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetCampaignDeliveryEstimatesResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetCampaignDeliveryEstimatesResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetCampaignDeliveryEstimatesResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetCampaignDeliveryEstimatesResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetCampaignDeliveryEstimatesResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetCampaignDeliveryEstimatesResponse::TheServiceIsTemporarilyUnavailable
                (body)
                => "TheServiceIsTemporarilyUnavailable\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                GetCampaignDeliveryEstimatesResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CampaignsSlashGet {
            campaign_id,
            ad_account_id,
        } => {
            info!("Performing a CampaignsSlashGet request on {:?}", (
                &campaign_id,
                &ad_account_id
            ));

            let result = client.campaigns_slash_get(
                campaign_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CampaignsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CampaignsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::FeedsSlashCreate {
            catalogs_feed_create_request_schema,
            ad_account_id,
        } => {
            info!("Performing a FeedsSlashCreate request");

            let result = client.feeds_slash_create(
                catalogs_feed_create_request_schema,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                FeedsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::FeedsSlashList {
            catalog_id,
            ad_account_id,
            bookmark,
            page_size,
        } => {
            info!("Performing a FeedsSlashList request");

            let result = client.feeds_slash_list(
                catalog_id,
                ad_account_id,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                FeedsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::FeedProcessingResultsSlashList {
            feed_id,
            ad_account_id,
            bookmark,
            page_size,
        } => {
            info!("Performing a FeedProcessingResultsSlashList request on {:?}", (
                &feed_id
            ));

            let result = client.feed_processing_results_slash_list(
                feed_id,
                ad_account_id,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                FeedProcessingResultsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedProcessingResultsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedProcessingResultsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedProcessingResultsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedProcessingResultsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedProcessingResultsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedProcessingResultsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::FeedsSlashDelete {
            feed_id,
            ad_account_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a FeedsSlashDelete request on {:?}", (
                &feed_id
            ));

            let result = client.feeds_slash_delete(
                feed_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                FeedsSlashDeleteResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashDeleteResponse::ResourceDeletedSuccessfully
                => "ResourceDeletedSuccessfully\n".to_string()
                    ,
                FeedsSlashDeleteResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashDeleteResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashDeleteResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashDeleteResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashDeleteResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashDeleteResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::FeedsSlashGet {
            feed_id,
            ad_account_id,
        } => {
            info!("Performing a FeedsSlashGet request on {:?}", (
                &feed_id
            ));

            let result = client.feeds_slash_get(
                feed_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                FeedsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::FeedsSlashIngest {
            feed_id,
            ad_account_id,
        } => {
            info!("Performing a FeedsSlashIngest request on {:?}", (
                &feed_id
            ));

            let result = client.feeds_slash_ingest(
                feed_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                FeedsSlashIngestResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashIngestResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashIngestResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashIngestResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashIngestResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashIngestResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashIngestResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::FeedsSlashUpdate {
            feed_id,
            catalogs_feed_update_request_schema,
            ad_account_id,
        } => {
            info!("Performing a FeedsSlashUpdate request on {:?}", (
                &feed_id
            ));

            let result = client.feeds_slash_update(
                feed_id,
                catalogs_feed_update_request_schema,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                FeedsSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FeedsSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemsIssuesSlashList {
            processing_result_id,
            item_numbers,
            item_validation_issue,
            ad_account_id,
            bookmark,
            page_size,
        } => {
            info!("Performing a ItemsIssuesSlashList request on {:?}", (
                &processing_result_id
            ));

            let result = client.items_issues_slash_list(
                processing_result_id,
                item_numbers.as_ref(),
                item_validation_issue,
                ad_account_id,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemsIssuesSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsIssuesSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsIssuesSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsIssuesSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsIssuesSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsIssuesSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsIssuesSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemsBatchSlashPost {
            catalogs_items_batch_post_request,
            ad_account_id,
        } => {
            info!("Performing a ItemsBatchSlashPost request");

            let result = client.items_batch_slash_post(
                catalogs_items_batch_post_request,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemsBatchSlashPostResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsBatchSlashPostResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsBatchSlashPostResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsBatchSlashPostResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsBatchSlashPostResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsBatchSlashPostResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsBatchSlashPostResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemsSlashPost {
            catalogs_items_request,
            ad_account_id,
        } => {
            info!("Performing a ItemsSlashPost request");

            let result = client.items_slash_post(
                catalogs_items_request,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemsSlashPostResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsSlashPostResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsSlashPostResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsSlashPostResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsSlashPostResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsSlashPostResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsSlashPostResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ItemsBatchSlashGet {
            batch_id,
            ad_account_id,
        } => {
            info!("Performing a ItemsBatchSlashGet request on {:?}", (
                &batch_id
            ));

            let result = client.items_batch_slash_get(
                batch_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ItemsBatchSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsBatchSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsBatchSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsBatchSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsBatchSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsBatchSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ItemsBatchSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CatalogsProductGroupsSlashCreate {
            catalogs_product_groups_create_request_schema,
            ad_account_id,
        } => {
            info!("Performing a CatalogsProductGroupsSlashCreate request");

            let result = client.catalogs_product_groups_slash_create(
                catalogs_product_groups_create_request_schema,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CatalogsProductGroupsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CatalogsProductGroupsSlashCreateMany {
            catalogs_product_groups_create_many_request_items,
            ad_account_id,
        } => {
            info!("Performing a CatalogsProductGroupsSlashCreateMany request");

            let result = client.catalogs_product_groups_slash_create_many(
                catalogs_product_groups_create_many_request_items,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CatalogsProductGroupsSlashCreateManyResponse::TheRequestHasSucceededAndANewResourceHasBeenCreatedAsAResult
                (body)
                => "TheRequestHasSucceededAndANewResourceHasBeenCreatedAsAResult\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashCreateManyResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashCreateManyResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashCreateManyResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashCreateManyResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashCreateManyResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashCreateManyResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CatalogsProductGroupsSlashDeleteMany {
            id,
            ad_account_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a CatalogsProductGroupsSlashDeleteMany request");

            let result = client.catalogs_product_groups_slash_delete_many(
                id.as_ref(),
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CatalogsProductGroupsSlashDeleteManyResponse::ResourceDeletedSuccessfully
                => "ResourceDeletedSuccessfully\n".to_string()
                    ,
                CatalogsProductGroupsSlashDeleteManyResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashDeleteManyResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashDeleteManyResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashDeleteManyResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashDeleteManyResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashDeleteManyResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CatalogsProductGroupsSlashList {
            id,
            feed_id,
            catalog_id,
            ad_account_id,
            bookmark,
            page_size,
        } => {
            info!("Performing a CatalogsProductGroupsSlashList request");

            let result = client.catalogs_product_groups_slash_list(
                id.as_ref(),
                feed_id,
                catalog_id,
                ad_account_id,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CatalogsProductGroupsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ProductsByProductGroupFilterSlashList {
            catalogs_list_products_by_filter_request,
            bookmark,
            page_size,
            ad_account_id,
            pin_metrics,
        } => {
            info!("Performing a ProductsByProductGroupFilterSlashList request");

            let result = client.products_by_product_group_filter_slash_list(
                catalogs_list_products_by_filter_request,
                bookmark,
                page_size,
                ad_account_id,
                pin_metrics,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ProductsByProductGroupFilterSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductsByProductGroupFilterSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductsByProductGroupFilterSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductsByProductGroupFilterSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductsByProductGroupFilterSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductsByProductGroupFilterSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductsByProductGroupFilterSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CatalogsProductGroupPinsSlashList {
            product_group_id,
            ad_account_id,
            pin_metrics,
            bookmark,
            page_size,
        } => {
            info!("Performing a CatalogsProductGroupPinsSlashList request on {:?}", (
                &product_group_id
            ));

            let result = client.catalogs_product_group_pins_slash_list(
                product_group_id,
                ad_account_id,
                pin_metrics,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CatalogsProductGroupPinsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupPinsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupPinsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupPinsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupPinsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupPinsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupPinsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CatalogsProductGroupsSlashDelete {
            product_group_id,
            ad_account_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a CatalogsProductGroupsSlashDelete request on {:?}", (
                &product_group_id
            ));

            let result = client.catalogs_product_groups_slash_delete(
                product_group_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CatalogsProductGroupsSlashDeleteResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashDeleteResponse::ResourceDeletedSuccessfully
                => "ResourceDeletedSuccessfully\n".to_string()
                    ,
                CatalogsProductGroupsSlashDeleteResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashDeleteResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashDeleteResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashDeleteResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashDeleteResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashDeleteResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CatalogsProductGroupsSlashGet {
            product_group_id,
            ad_account_id,
        } => {
            info!("Performing a CatalogsProductGroupsSlashGet request on {:?}", (
                &product_group_id
            ));

            let result = client.catalogs_product_groups_slash_get(
                product_group_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CatalogsProductGroupsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CatalogsProductGroupsSlashProductCountsGet {
            product_group_id,
            ad_account_id,
        } => {
            info!("Performing a CatalogsProductGroupsSlashProductCountsGet request on {:?}", (
                &product_group_id
            ));

            let result = client.catalogs_product_groups_slash_product_counts_get(
                product_group_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CatalogsProductGroupsSlashProductCountsGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashProductCountsGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashProductCountsGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashProductCountsGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashProductCountsGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashProductCountsGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashProductCountsGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CatalogsProductGroupsSlashUpdate {
            product_group_id,
            catalogs_product_groups_update_request_schema,
            ad_account_id,
        } => {
            info!("Performing a CatalogsProductGroupsSlashUpdate request on {:?}", (
                &product_group_id
            ));

            let result = client.catalogs_product_groups_slash_update(
                product_group_id,
                catalogs_product_groups_update_request_schema,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CatalogsProductGroupsSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsProductGroupsSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ReportsSlashCreate {
            catalogs_report_parameters,
            ad_account_id,
        } => {
            info!("Performing a ReportsSlashCreate request");

            let result = client.reports_slash_create(
                catalogs_report_parameters,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ReportsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ReportsSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ReportsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ReportsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ReportsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ReportsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ReportsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ReportsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ReportsSlashGet {
            token,
            ad_account_id,
        } => {
            info!("Performing a ReportsSlashGet request");

            let result = client.reports_slash_get(
                token,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ReportsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ReportsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ReportsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ReportsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ReportsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ReportsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ReportsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ReportsSlashStats {
            parameters,
            ad_account_id,
            bookmark,
            page_size,
        } => {
            info!("Performing a ReportsSlashStats request");

            let result = client.reports_slash_stats(
                parameters,
                ad_account_id,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ReportsSlashStatsResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ReportsSlashStatsResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ReportsSlashStatsResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ReportsSlashStatsResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ReportsSlashStatsResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ReportsSlashStatsResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ReportsSlashStatsResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CatalogsLocalInventoryItemsBatchSlashOperate {
            catalog_id,
            local_inventory_items_batch_create,
            ad_account_id,
        } => {
            info!("Performing a CatalogsLocalInventoryItemsBatchSlashOperate request on {:?}", (
                &catalog_id
            ));

            let result = client.catalogs_local_inventory_items_batch_slash_operate(
                catalog_id,
                local_inventory_items_batch_create,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CatalogsLocalInventoryItemsBatchSlashOperateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalInventoryItemsBatchSlashOperateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalInventoryItemsBatchSlashOperateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalInventoryItemsBatchSlashOperateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalInventoryItemsBatchSlashOperateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalInventoryItemsBatchSlashOperateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalInventoryItemsBatchSlashOperateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalInventoryItemsBatchSlashOperateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CatalogsLocalInventoryItemsSlashPost {
            catalog_id,
            local_inventory_items_get_create,
            ad_account_id,
        } => {
            info!("Performing a CatalogsLocalInventoryItemsSlashPost request on {:?}", (
                &catalog_id
            ));

            let result = client.catalogs_local_inventory_items_slash_post(
                catalog_id,
                local_inventory_items_get_create,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CatalogsLocalInventoryItemsSlashPostResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalInventoryItemsSlashPostResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalInventoryItemsSlashPostResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalInventoryItemsSlashPostResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalInventoryItemsSlashPostResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalInventoryItemsSlashPostResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalInventoryItemsSlashPostResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalInventoryItemsSlashPostResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CatalogsLocalStoresSlashCreate {
            catalog_id,
            local_store_create,
            ad_account_id,
        } => {
            info!("Performing a CatalogsLocalStoresSlashCreate request on {:?}", (
                &catalog_id
            ));

            let result = client.catalogs_local_stores_slash_create(
                catalog_id,
                local_store_create.as_ref(),
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CatalogsLocalStoresSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CatalogsLocalStoresSlashDelete {
            catalog_id,
            ids,
            ad_account_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a CatalogsLocalStoresSlashDelete request on {:?}", (
                &catalog_id
            ));

            let result = client.catalogs_local_stores_slash_delete(
                catalog_id,
                ids.as_ref(),
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CatalogsLocalStoresSlashDeleteResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashDeleteResponse::ResourceDeletedSuccessfully
                => "ResourceDeletedSuccessfully\n".to_string()
                    ,
                CatalogsLocalStoresSlashDeleteResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashDeleteResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashDeleteResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashDeleteResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashDeleteResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashDeleteResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CatalogsLocalStoresSlashList {
            catalog_id,
            ids,
            ad_account_id,
            bookmark,
            page_size,
        } => {
            info!("Performing a CatalogsLocalStoresSlashList request on {:?}", (
                &catalog_id
            ));

            let result = client.catalogs_local_stores_slash_list(
                catalog_id,
                ids.as_ref(),
                ad_account_id,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CatalogsLocalStoresSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CatalogsLocalStoresSlashUpdate {
            catalog_id,
            local_store_batch_update,
            ad_account_id,
        } => {
            info!("Performing a CatalogsLocalStoresSlashUpdate request on {:?}", (
                &catalog_id
            ));

            let result = client.catalogs_local_stores_slash_update(
                catalog_id,
                local_store_batch_update.as_ref(),
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CatalogsLocalStoresSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsLocalStoresSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CatalogsSupplementalItemsBatchSlashGet {
            catalog_id,
            batch_id,
            ad_account_id,
        } => {
            info!("Performing a CatalogsSupplementalItemsBatchSlashGet request on {:?}", (
                &catalog_id,
                &batch_id
            ));

            let result = client.catalogs_supplemental_items_batch_slash_get(
                catalog_id,
                batch_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CatalogsSupplementalItemsBatchSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSupplementalItemsBatchSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSupplementalItemsBatchSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSupplementalItemsBatchSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSupplementalItemsBatchSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSupplementalItemsBatchSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSupplementalItemsBatchSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CatalogsSlashAvailableFilterValues {
            catalog_id,
            feed_id,
            country,
            language,
            ad_account_id,
        } => {
            info!("Performing a CatalogsSlashAvailableFilterValues request");

            let result = client.catalogs_slash_available_filter_values(
                catalog_id,
                feed_id,
                country,
                language,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CatalogsSlashAvailableFilterValuesResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSlashAvailableFilterValuesResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSlashAvailableFilterValuesResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSlashAvailableFilterValuesResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSlashAvailableFilterValuesResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSlashAvailableFilterValuesResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSlashAvailableFilterValuesResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CatalogsSlashCreate {
            catalog_create,
            ad_account_id,
        } => {
            info!("Performing a CatalogsSlashCreate request");

            let result = client.catalogs_slash_create(
                catalog_create,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CatalogsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CatalogsSlashList {
            ad_account_id,
            bookmark,
            page_size,
        } => {
            info!("Performing a CatalogsSlashList request");

            let result = client.catalogs_slash_list(
                ad_account_id,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CatalogsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CatalogsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ConversionDeletionRequestSlashCreate {
            ad_account_id,
            conversion_deletion_request_create,
        } => {
            info!("Performing a ConversionDeletionRequestSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.conversion_deletion_request_slash_create(
                ad_account_id,
                conversion_deletion_request_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ConversionDeletionRequestSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ConversionDeletionRequestSlashList {
            ad_account_id,
            bookmark,
            page_size,
            order,
        } => {
            info!("Performing a ConversionDeletionRequestSlashList request on {:?}", (
                &ad_account_id
            ));

            let result = client.conversion_deletion_request_slash_list(
                ad_account_id,
                bookmark,
                page_size,
                order,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ConversionDeletionRequestSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ConversionDeletionRequestSlashDelete {
            request_id,
            ad_account_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a ConversionDeletionRequestSlashDelete request on {:?}", (
                &request_id,
                &ad_account_id
            ));

            let result = client.conversion_deletion_request_slash_delete(
                request_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ConversionDeletionRequestSlashDeleteResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashDeleteResponse::ResourceDeletedSuccessfully
                => "ResourceDeletedSuccessfully\n".to_string()
                    ,
                ConversionDeletionRequestSlashDeleteResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashDeleteResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashDeleteResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashDeleteResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashDeleteResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashDeleteResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ConversionDeletionRequestSlashGet {
            request_id,
            ad_account_id,
        } => {
            info!("Performing a ConversionDeletionRequestSlashGet request on {:?}", (
                &request_id,
                &ad_account_id
            ));

            let result = client.conversion_deletion_request_slash_get(
                request_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ConversionDeletionRequestSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionDeletionRequestSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ConversionEqsSlashList {
            lookback_period,
            ad_account_id,
            source_platform,
            ingestion_source,
        } => {
            info!("Performing a ConversionEqsSlashList request on {:?}", (
                &ad_account_id
            ));

            let result = client.conversion_eqs_slash_list(
                lookback_period,
                ad_account_id,
                source_platform,
                ingestion_source,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ConversionEqsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionEqsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionEqsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionEqsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionEqsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionEqsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionEqsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::EventsSlashCreate {
            ad_account_id,
            conversion_events_create,
            test,
        } => {
            info!("Performing a EventsSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.events_slash_create(
                ad_account_id,
                conversion_events_create,
                test,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                EventsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                EventsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                EventsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                EventsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                EventsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                EventsSlashCreateResponse::TheRequestWasWell
                (body)
                => "TheRequestWasWell\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                EventsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                EventsSlashCreateResponse::TheServerIsCurrentlyUnableToHandleTheRequestDueToATemporaryOverloadOrScheduledMaintenance
                (body)
                => "TheServerIsCurrentlyUnableToHandleTheRequestDueToATemporaryOverloadOrScheduledMaintenance\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                EventsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ConversionTagsSlashCreate {
            ad_account_id,
            conversion_tag_create,
        } => {
            info!("Performing a ConversionTagsSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.conversion_tags_slash_create(
                ad_account_id,
                conversion_tag_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ConversionTagsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionTagsSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionTagsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionTagsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionTagsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionTagsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionTagsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionTagsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ConversionTagsSlashList {
            ad_account_id,
            filter_deleted,
        } => {
            info!("Performing a ConversionTagsSlashList request on {:?}", (
                &ad_account_id
            ));

            let result = client.conversion_tags_slash_list(
                ad_account_id,
                filter_deleted,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ConversionTagsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionTagsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionTagsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionTagsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionTagsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionTagsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionTagsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::OcpmEligibleConversionTagsSlashGet {
            ad_account_id,
        } => {
            info!("Performing a OcpmEligibleConversionTagsSlashGet request on {:?}", (
                &ad_account_id
            ));

            let result = client.ocpm_eligible_conversion_tags_slash_get(
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                OcpmEligibleConversionTagsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OcpmEligibleConversionTagsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OcpmEligibleConversionTagsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OcpmEligibleConversionTagsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OcpmEligibleConversionTagsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OcpmEligibleConversionTagsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OcpmEligibleConversionTagsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PageVisitConversionTagsSlashGet {
            ad_account_id,
            bookmark,
            page_size,
            order,
        } => {
            info!("Performing a PageVisitConversionTagsSlashGet request on {:?}", (
                &ad_account_id
            ));

            let result = client.page_visit_conversion_tags_slash_get(
                ad_account_id,
                bookmark,
                page_size,
                order,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PageVisitConversionTagsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PageVisitConversionTagsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PageVisitConversionTagsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PageVisitConversionTagsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PageVisitConversionTagsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PageVisitConversionTagsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PageVisitConversionTagsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ConversionTagsSlashGet {
            ad_account_id,
            conversion_tag_id,
        } => {
            info!("Performing a ConversionTagsSlashGet request on {:?}", (
                &ad_account_id,
                &conversion_tag_id
            ));

            let result = client.conversion_tags_slash_get(
                ad_account_id,
                conversion_tag_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ConversionTagsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionTagsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionTagsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionTagsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionTagsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionTagsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ConversionTagsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdvertiserDefinedEventsSlashCreate {
            ad_account_id,
            advertiser_defined_events_create_request,
        } => {
            info!("Performing a AdvertiserDefinedEventsSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.advertiser_defined_events_slash_create(
                ad_account_id,
                advertiser_defined_events_create_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdvertiserDefinedEventsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdvertiserDefinedEventsSlashDelete {
            ad_account_id,
            event_names,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a AdvertiserDefinedEventsSlashDelete request on {:?}", (
                &ad_account_id
            ));

            let result = client.advertiser_defined_events_slash_delete(
                ad_account_id,
                event_names.as_ref(),
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdvertiserDefinedEventsSlashDeleteResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashDeleteResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashDeleteResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashDeleteResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashDeleteResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashDeleteResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashDeleteResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdvertiserDefinedEventsSlashGet {
            ad_account_id,
        } => {
            info!("Performing a AdvertiserDefinedEventsSlashGet request on {:?}", (
                &ad_account_id
            ));

            let result = client.advertiser_defined_events_slash_get(
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdvertiserDefinedEventsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdvertiserDefinedEventsSlashUpdate {
            ad_account_id,
            advertiser_defined_events_create_request,
        } => {
            info!("Performing a AdvertiserDefinedEventsSlashUpdate request on {:?}", (
                &ad_account_id
            ));

            let result = client.advertiser_defined_events_slash_update(
                ad_account_id,
                advertiser_defined_events_create_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdvertiserDefinedEventsSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdvertiserDefinedEventsSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CustomerListUploadsSlashCreate {
            ad_account_id,
            customer_list_id,
            customer_list_upload_create_request,
        } => {
            info!("Performing a CustomerListUploadsSlashCreate request on {:?}", (
                &ad_account_id,
                &customer_list_id
            ));

            let result = client.customer_list_uploads_slash_create(
                ad_account_id,
                customer_list_id,
                customer_list_upload_create_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CustomerListUploadsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListUploadsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListUploadsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListUploadsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListUploadsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListUploadsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListUploadsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CustomerListUploadsSlashGet {
            ad_account_id,
            customer_list_id,
            customer_list_upload_id,
        } => {
            info!("Performing a CustomerListUploadsSlashGet request on {:?}", (
                &ad_account_id,
                &customer_list_id,
                &customer_list_upload_id
            ));

            let result = client.customer_list_uploads_slash_get(
                ad_account_id,
                customer_list_id,
                customer_list_upload_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CustomerListUploadsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListUploadsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListUploadsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListUploadsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListUploadsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListUploadsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListUploadsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CustomerListUploadsSlashRun {
            ad_account_id,
            customer_list_id,
            customer_list_upload_id,
        } => {
            info!("Performing a CustomerListUploadsSlashRun request on {:?}", (
                &ad_account_id,
                &customer_list_id,
                &customer_list_upload_id
            ));

            let result = client.customer_list_uploads_slash_run(
                ad_account_id,
                customer_list_id,
                customer_list_upload_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CustomerListUploadsSlashRunResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListUploadsSlashRunResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListUploadsSlashRunResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListUploadsSlashRunResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListUploadsSlashRunResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListUploadsSlashRunResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListUploadsSlashRunResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CustomerListsSlashCreate {
            ad_account_id,
            customer_list_create,
        } => {
            info!("Performing a CustomerListsSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.customer_lists_slash_create(
                ad_account_id,
                customer_list_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CustomerListsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CustomerListsSlashList {
            ad_account_id,
            bookmark,
            page_size,
            order,
            exclude_nca,
        } => {
            info!("Performing a CustomerListsSlashList request on {:?}", (
                &ad_account_id
            ));

            let result = client.customer_lists_slash_list(
                ad_account_id,
                bookmark,
                page_size,
                order,
                exclude_nca,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CustomerListsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CustomerListsSlashGet {
            ad_account_id,
            customer_list_id,
        } => {
            info!("Performing a CustomerListsSlashGet request on {:?}", (
                &ad_account_id,
                &customer_list_id
            ));

            let result = client.customer_lists_slash_get(
                ad_account_id,
                customer_list_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CustomerListsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CustomerListsSlashUpdate {
            ad_account_id,
            customer_list_id,
            customer_list_update_with_required_body,
        } => {
            info!("Performing a CustomerListsSlashUpdate request on {:?}", (
                &ad_account_id,
                &customer_list_id
            ));

            let result = client.customer_lists_slash_update(
                ad_account_id,
                customer_list_id,
                customer_list_update_with_required_body,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CustomerListsSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerListsSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CustomerSegmentSlashCreate {
            ad_account_id,
            customer_segment_create,
        } => {
            info!("Performing a CustomerSegmentSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.customer_segment_slash_create(
                ad_account_id,
                customer_segment_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CustomerSegmentSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerSegmentSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerSegmentSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerSegmentSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerSegmentSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerSegmentSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerSegmentSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerSegmentSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CustomerSegmentSlashList {
            ad_account_id,
            bookmark,
            page_size,
            order,
            include_sizing,
            search_query,
        } => {
            info!("Performing a CustomerSegmentSlashList request on {:?}", (
                &ad_account_id
            ));

            let result = client.customer_segment_slash_list(
                ad_account_id,
                bookmark,
                page_size,
                order,
                include_sizing,
                search_query,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CustomerSegmentSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerSegmentSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerSegmentSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerSegmentSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerSegmentSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerSegmentSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerSegmentSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CustomerSegmentSlashUpdate {
            ad_account_id,
            customer_segment_update_request_update_with_required_body,
        } => {
            info!("Performing a CustomerSegmentSlashUpdate request on {:?}", (
                &ad_account_id
            ));

            let result = client.customer_segment_slash_update(
                ad_account_id,
                customer_segment_update_request_update_with_required_body,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CustomerSegmentSlashUpdateResponse::TheRequestHasSucceeded
                => "TheRequestHasSucceeded\n".to_string()
                    ,
                CustomerSegmentSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerSegmentSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerSegmentSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerSegmentSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerSegmentSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CustomerSegmentSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::IntegrationsCommerceSlashPost {
            integration_metadata_create,
        } => {
            info!("Performing a IntegrationsCommerceSlashPost request");

            let result = client.integrations_commerce_slash_post(
                integration_metadata_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                IntegrationsCommerceSlashPostResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashPostResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashPostResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashPostResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashPostResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashPostResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashPostResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashPostResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::IntegrationsLogsSlashPost {
            integration_logs_request_create,
        } => {
            info!("Performing a IntegrationsLogsSlashPost request");

            let result = client.integrations_logs_slash_post(
                integration_logs_request_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                IntegrationsLogsSlashPostResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsLogsSlashPostResponse::TheServerCouldNotUnderstandTheRequestDueToInvalidSyntax
                (body)
                => "TheServerCouldNotUnderstandTheRequestDueToInvalidSyntax\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsLogsSlashPostResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsLogsSlashPostResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsLogsSlashPostResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsLogsSlashPostResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsLogsSlashPostResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::IntegrationsSlashGetList {
            bookmark,
            page_size,
        } => {
            info!("Performing a IntegrationsSlashGetList request");

            let result = client.integrations_slash_get_list(
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                IntegrationsSlashGetListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsSlashGetListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsSlashGetListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsSlashGetListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsSlashGetListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsSlashGetListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsSlashGetListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::IntegrationsCommerceSlashDel {
            external_business_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a IntegrationsCommerceSlashDel request on {:?}", (
                &external_business_id
            ));

            let result = client.integrations_commerce_slash_del(
                external_business_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                IntegrationsCommerceSlashDelResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashDelResponse::ResourceDeletedSuccessfully
                => "ResourceDeletedSuccessfully\n".to_string()
                    ,
                IntegrationsCommerceSlashDelResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashDelResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashDelResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashDelResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashDelResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashDelResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::IntegrationsCommerceSlashGet {
            external_business_id,
        } => {
            info!("Performing a IntegrationsCommerceSlashGet request on {:?}", (
                &external_business_id
            ));

            let result = client.integrations_commerce_slash_get(
                external_business_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                IntegrationsCommerceSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::IntegrationsCommerceSlashPatch {
            external_business_id,
            integration_metadata_update,
        } => {
            info!("Performing a IntegrationsCommerceSlashPatch request on {:?}", (
                &external_business_id
            ));

            let result = client.integrations_commerce_slash_patch(
                external_business_id,
                integration_metadata_update,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                IntegrationsCommerceSlashPatchResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashPatchResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashPatchResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashPatchResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashPatchResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashPatchResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsCommerceSlashPatchResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::IntegrationsSlashGetById {
            id,
        } => {
            info!("Performing a IntegrationsSlashGetById request on {:?}", (
                &id
            ));

            let result = client.integrations_slash_get_by_id(
                id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                IntegrationsSlashGetByIdResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsSlashGetByIdResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsSlashGetByIdResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsSlashGetByIdResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsSlashGetByIdResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsSlashGetByIdResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                IntegrationsSlashGetByIdResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::CountryKeywordsMetricsSlashGet {
            ad_account_id,
            country_code,
            keywords,
        } => {
            info!("Performing a CountryKeywordsMetricsSlashGet request on {:?}", (
                &ad_account_id
            ));

            let result = client.country_keywords_metrics_slash_get(
                ad_account_id,
                country_code,
                keywords.as_ref(),
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                CountryKeywordsMetricsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CountryKeywordsMetricsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CountryKeywordsMetricsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CountryKeywordsMetricsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CountryKeywordsMetricsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CountryKeywordsMetricsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                CountryKeywordsMetricsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::KeywordsSlashCreate {
            ad_account_id,
            keywords_create,
        } => {
            info!("Performing a KeywordsSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.keywords_slash_create(
                ad_account_id,
                keywords_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                KeywordsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                KeywordsSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                KeywordsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                KeywordsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                KeywordsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                KeywordsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                KeywordsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                KeywordsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::KeywordsSlashGet {
            ad_account_id,
            campaign_id,
            ad_group_id,
            ad_group_ids,
            match_types,
            bookmark,
            page_size,
        } => {
            info!("Performing a KeywordsSlashGet request on {:?}", (
                &ad_account_id
            ));

            let result = client.keywords_slash_get(
                ad_account_id,
                campaign_id,
                ad_group_id,
                ad_group_ids.as_ref(),
                match_types.as_ref(),
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                KeywordsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                KeywordsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                KeywordsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                KeywordsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                KeywordsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                KeywordsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                KeywordsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::KeywordsSlashUpdate {
            ad_account_id,
            keywords_update,
        } => {
            info!("Performing a KeywordsSlashUpdate request on {:?}", (
                &ad_account_id
            ));

            let result = client.keywords_slash_update(
                ad_account_id,
                keywords_update,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                KeywordsSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                KeywordsSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                KeywordsSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                KeywordsSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                KeywordsSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                KeywordsSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                KeywordsSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::TrendingKeywordsSlashList {
            region,
            trend_type,
            interests,
            genders,
            ages,
            include_keywords,
            normalize_against_group,
            limit,
            include_demographics,
        } => {
            info!("Performing a TrendingKeywordsSlashList request on {:?}", (
                &region,
                &trend_type
            ));

            let result = client.trending_keywords_slash_list(
                region,
                trend_type,
                interests.as_ref(),
                genders.as_ref(),
                ages.as_ref(),
                include_keywords.as_ref(),
                normalize_against_group,
                limit,
                include_demographics,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                TrendingKeywordsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendingKeywordsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendingKeywordsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendingKeywordsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendingKeywordsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendingKeywordsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendingKeywordsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LabelsSlashCreate {
            ad_account_id,
            label_create_request,
        } => {
            info!("Performing a LabelsSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.labels_slash_create(
                ad_account_id,
                label_create_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LabelsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LabelsSlashList {
            ad_account_id,
            campaign_ids,
            label_ids,
            entity_statuses,
            label_types,
            bookmark,
            page_size,
        } => {
            info!("Performing a LabelsSlashList request on {:?}", (
                &ad_account_id
            ));

            let result = client.labels_slash_list(
                ad_account_id,
                campaign_ids.as_ref(),
                label_ids.as_ref(),
                entity_statuses.as_ref(),
                label_types.as_ref(),
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LabelsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LabelsSlashUpdate {
            ad_account_id,
            label_update_request,
        } => {
            info!("Performing a LabelsSlashUpdate request on {:?}", (
                &ad_account_id
            ));

            let result = client.labels_slash_update(
                ad_account_id,
                label_update_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LabelsSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LabelsSlashApply {
            ad_account_id,
            label_id,
            labeled_entities_create,
        } => {
            info!("Performing a LabelsSlashApply request on {:?}", (
                &ad_account_id,
                &label_id
            ));

            let result = client.labels_slash_apply(
                ad_account_id,
                label_id,
                labeled_entities_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LabelsSlashApplyResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashApplyResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashApplyResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashApplyResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashApplyResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashApplyResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashApplyResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashApplyResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LabelsSlashRemove {
            ad_account_id,
            label_id,
            labeled_entities_create,
        } => {
            info!("Performing a LabelsSlashRemove request on {:?}", (
                &ad_account_id,
                &label_id
            ));

            let result = client.labels_slash_remove(
                ad_account_id,
                label_id,
                labeled_entities_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LabelsSlashRemoveResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashRemoveResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashRemoveResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashRemoveResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashRemoveResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashRemoveResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashRemoveResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LabelsSlashRemoveResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdAccountsSubscriptionsSlashGetList {
            ad_account_id,
            bookmark,
            page_size,
        } => {
            info!("Performing a AdAccountsSubscriptionsSlashGetList request on {:?}", (
                &ad_account_id
            ));

            let result = client.ad_accounts_subscriptions_slash_get_list(
                ad_account_id,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdAccountsSubscriptionsSlashGetListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashGetListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashGetListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashGetListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashGetListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashGetListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashGetListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdAccountsSubscriptionsSlashPost {
            ad_account_id,
            lead_subscription_post_params_create,
        } => {
            info!("Performing a AdAccountsSubscriptionsSlashPost request on {:?}", (
                &ad_account_id
            ));

            let result = client.ad_accounts_subscriptions_slash_post(
                ad_account_id,
                lead_subscription_post_params_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdAccountsSubscriptionsSlashPostResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashPostResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashPostResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashPostResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdAccountsSubscriptionsSlashDelById {
            ad_account_id,
            subscription_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a AdAccountsSubscriptionsSlashDelById request on {:?}", (
                &ad_account_id,
                &subscription_id
            ));

            let result = client.ad_accounts_subscriptions_slash_del_by_id(
                ad_account_id,
                subscription_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdAccountsSubscriptionsSlashDelByIdResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashDelByIdResponse::ResourceDeletedSuccessfully
                => "ResourceDeletedSuccessfully\n".to_string()
                    ,
                AdAccountsSubscriptionsSlashDelByIdResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashDelByIdResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashDelByIdResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashDelByIdResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashDelByIdResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashDelByIdResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdAccountsSubscriptionsSlashGetById {
            ad_account_id,
            subscription_id,
        } => {
            info!("Performing a AdAccountsSubscriptionsSlashGetById request on {:?}", (
                &ad_account_id,
                &subscription_id
            ));

            let result = client.ad_accounts_subscriptions_slash_get_by_id(
                ad_account_id,
                subscription_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdAccountsSubscriptionsSlashGetByIdResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashGetByIdResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashGetByIdResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashGetByIdResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashGetByIdResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashGetByIdResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountsSubscriptionsSlashGetByIdResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LeadFormsSlashCreate {
            ad_account_id,
            lead_form_create,
        } => {
            info!("Performing a LeadFormsSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.lead_forms_slash_create(
                ad_account_id,
                lead_form_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LeadFormsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LeadFormsSlashList {
            ad_account_id,
            bookmark,
            page_size,
            order,
        } => {
            info!("Performing a LeadFormsSlashList request on {:?}", (
                &ad_account_id
            ));

            let result = client.lead_forms_slash_list(
                ad_account_id,
                bookmark,
                page_size,
                order,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LeadFormsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LeadFormsSlashUpdate {
            ad_account_id,
            lead_form_batch_update,
        } => {
            info!("Performing a LeadFormsSlashUpdate request on {:?}", (
                &ad_account_id
            ));

            let result = client.lead_forms_slash_update(
                ad_account_id,
                lead_form_batch_update,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LeadFormsSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormsSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormsSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormsSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormsSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormsSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormsSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LeadFormSlashGet {
            lead_form_id,
            ad_account_id,
        } => {
            info!("Performing a LeadFormSlashGet request on {:?}", (
                &lead_form_id,
                &ad_account_id
            ));

            let result = client.lead_form_slash_get(
                lead_form_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LeadFormSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LeadFormTestSlashCreate {
            ad_account_id,
            lead_form_id,
            lead_form_test_create,
        } => {
            info!("Performing a LeadFormTestSlashCreate request on {:?}", (
                &ad_account_id,
                &lead_form_id
            ));

            let result = client.lead_form_test_slash_create(
                ad_account_id,
                lead_form_id,
                lead_form_test_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LeadFormTestSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormTestSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormTestSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormTestSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LeadsExportSlashCreate {
            ad_account_id,
            leads_exports_create,
        } => {
            info!("Performing a LeadsExportSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.leads_export_slash_create(
                ad_account_id,
                leads_exports_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LeadsExportSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadsExportSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadsExportSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadsExportSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadsExportSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadsExportSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadsExportSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadsExportSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LeadsExportSlashGet {
            ad_account_id,
            leads_export_id,
        } => {
            info!("Performing a LeadsExportSlashGet request on {:?}", (
                &ad_account_id,
                &leads_export_id
            ));

            let result = client.leads_export_slash_get(
                ad_account_id,
                leads_export_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LeadsExportSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadsExportSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadsExportSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadsExportSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadsExportSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadsExportSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadsExportSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MediaSlashCreate {
            media_upload_create,
        } => {
            info!("Performing a MediaSlashCreate request");

            let result = client.media_slash_create(
                media_upload_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MediaSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MediaSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MediaSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MediaSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MediaSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MediaSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MediaSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MediaSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MediaSlashList {
            bookmark,
            page_size,
        } => {
            info!("Performing a MediaSlashList request");

            let result = client.media_slash_list(
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MediaSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MediaSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MediaSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MediaSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MediaSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MediaSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MediaSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MediaSlashGet {
            media_id,
        } => {
            info!("Performing a MediaSlashGet request on {:?}", (
                &media_id
            ));

            let result = client.media_slash_get(
                media_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MediaSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MediaSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MediaSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MediaSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MediaSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MediaSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MediaSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MsotEventsSlashCreate {
            ad_account_id,
            conversion_msot_events_create,
        } => {
            info!("Performing a MsotEventsSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.msot_events_slash_create(
                ad_account_id,
                conversion_msot_events_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MsotEventsSlashCreateResponse::TheRequestHasSucceeded
                => "TheRequestHasSucceeded\n".to_string()
                    ,
                MsotEventsSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MsotEventsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MsotEventsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MsotEventsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MsotEventsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MsotEventsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MsotEventsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::NotificationSlashPost {
            notification_post_request,
        } => {
            info!("Performing a NotificationSlashPost request");

            let result = client.notification_slash_post(
                notification_post_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                NotificationSlashPostResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                NotificationSlashPostResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                NotificationSlashPostResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::OauthSlashConversionToken {
        } => {
            info!("Performing a OauthSlashConversionToken request");

            let result = client.oauth_slash_conversion_token(
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                OauthSlashConversionTokenResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OauthSlashConversionTokenResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OauthSlashConversionTokenResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OauthSlashConversionTokenResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OauthSlashConversionTokenResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OauthSlashConversionTokenResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OauthSlashConversionTokenResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::OauthSlashToken {
            grant_type,
            code,
            continuous_refresh,
            redirect_uri,
            refresh_token,
            scope,
        } => {
            info!("Performing a OauthSlashToken request");

            let result = client.oauth_slash_token(
                grant_type,
                code,
                continuous_refresh,
                redirect_uri,
                refresh_token,
                scope,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                OauthSlashTokenResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OauthSlashTokenResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OauthSlashTokenResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OauthSlashTokenResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OauthSlashTokenResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OauthSlashTokenResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OauthSlashTokenResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OauthSlashTokenResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::TokenSlashRevoke {
            token,
            token_type_hint,
        } => {
            info!("Performing a TokenSlashRevoke request");

            let result = client.token_slash_revoke(
                token,
                token_type_hint,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                TokenSlashRevokeResponse::TheRequestHasSucceeded
                => "TheRequestHasSucceeded\n".to_string()
                    ,
                TokenSlashRevokeResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TokenSlashRevokeResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TokenSlashRevokeResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::OrderLinesSlashList {
            ad_account_id,
            bookmark,
            page_size,
            order,
        } => {
            info!("Performing a OrderLinesSlashList request on {:?}", (
                &ad_account_id
            ));

            let result = client.order_lines_slash_list(
                ad_account_id,
                bookmark,
                page_size,
                order,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                OrderLinesSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OrderLinesSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OrderLinesSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OrderLinesSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OrderLinesSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OrderLinesSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OrderLinesSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::OrderLinesSlashGet {
            order_line_id,
            ad_account_id,
        } => {
            info!("Performing a OrderLinesSlashGet request on {:?}", (
                &order_line_id,
                &ad_account_id
            ));

            let result = client.order_lines_slash_get(
                order_line_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                OrderLinesSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OrderLinesSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OrderLinesSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OrderLinesSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OrderLinesSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OrderLinesSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                OrderLinesSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MultiPinsSlashAnalytics {
            pin_ids,
            start_date,
            end_date,
            metric_types,
            app_types,
            ad_account_id,
        } => {
            info!("Performing a MultiPinsSlashAnalytics request");

            let result = client.multi_pins_slash_analytics(
                pin_ids.as_ref(),
                start_date,
                end_date,
                metric_types.as_ref(),
                app_types,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MultiPinsSlashAnalyticsResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MultiPinsSlashAnalyticsResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MultiPinsSlashAnalyticsResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MultiPinsSlashAnalyticsResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MultiPinsSlashAnalyticsResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MultiPinsSlashAnalyticsResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MultiPinsSlashAnalyticsResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PinsSlashCreate {
            pin_create,
            ad_account_id,
        } => {
            info!("Performing a PinsSlashCreate request");

            let result = client.pins_slash_create(
                pin_create,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PinsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PinsSlashList {
            pin_filter,
            pin_metrics,
            include_protected_pins,
            pin_type,
            creative_types,
            ad_account_id,
            domain,
            domains,
            include_product_tag_obj,
            bookmark,
            page_size,
        } => {
            info!("Performing a PinsSlashList request");

            let result = client.pins_slash_list(
                pin_filter,
                pin_metrics,
                include_protected_pins,
                pin_type,
                creative_types.as_ref(),
                ad_account_id,
                domain,
                domains.as_ref(),
                include_product_tag_obj,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PinsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PinsSlashAnalytics {
            pin_id,
            start_date,
            end_date,
            metric_types,
            app_types,
            split_field,
            ad_account_id,
        } => {
            info!("Performing a PinsSlashAnalytics request on {:?}", (
                &pin_id
            ));

            let result = client.pins_slash_analytics(
                pin_id,
                start_date,
                end_date,
                metric_types.as_ref(),
                app_types,
                split_field,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PinsSlashAnalyticsResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashAnalyticsResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashAnalyticsResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashAnalyticsResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashAnalyticsResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashAnalyticsResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashAnalyticsResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PinsSlashDelete {
            pin_id,
            ad_account_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a PinsSlashDelete request on {:?}", (
                &pin_id
            ));

            let result = client.pins_slash_delete(
                pin_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PinsSlashDeleteResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashDeleteResponse::ResourceDeletedSuccessfully
                => "ResourceDeletedSuccessfully\n".to_string()
                    ,
                PinsSlashDeleteResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashDeleteResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashDeleteResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashDeleteResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashDeleteResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashDeleteResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PinsSlashGet {
            pin_id,
            ad_account_id,
            pin_metrics,
        } => {
            info!("Performing a PinsSlashGet request on {:?}", (
                &pin_id
            ));

            let result = client.pins_slash_get(
                pin_id,
                ad_account_id,
                pin_metrics,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PinsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PinsSlashSave {
            pin_id,
            pins_save_request_create,
            ad_account_id,
        } => {
            info!("Performing a PinsSlashSave request on {:?}", (
                &pin_id
            ));

            let result = client.pins_slash_save(
                pin_id,
                pins_save_request_create,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PinsSlashSaveResponse::TheRequestHasSucceededAndANewResourceHasBeenCreatedAsAResult
                (body)
                => "TheRequestHasSucceededAndANewResourceHasBeenCreatedAsAResult\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashSaveResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashSaveResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashSaveResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashSaveResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashSaveResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashSaveResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PinsSlashUpdate {
            pin_id,
            pin_update,
            ad_account_id,
        } => {
            info!("Performing a PinsSlashUpdate request on {:?}", (
                &pin_id
            ));

            let result = client.pins_slash_update(
                pin_id,
                pin_update,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PinsSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PinsSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ProductGroupPromotionsSlashCreate {
            ad_account_id,
            product_group_promotions_create,
        } => {
            info!("Performing a ProductGroupPromotionsSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.product_group_promotions_slash_create(
                ad_account_id,
                product_group_promotions_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ProductGroupPromotionsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ProductGroupPromotionsSlashList {
            ad_account_id,
            bookmark,
            page_size,
            order,
            product_group_promotion_ids,
            entity_statuses,
            ad_group_id,
        } => {
            info!("Performing a ProductGroupPromotionsSlashList request on {:?}", (
                &ad_account_id
            ));

            let result = client.product_group_promotions_slash_list(
                ad_account_id,
                bookmark,
                page_size,
                order,
                product_group_promotion_ids.as_ref(),
                entity_statuses.as_ref(),
                ad_group_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ProductGroupPromotionsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ProductGroupPromotionsSlashUpdate {
            ad_account_id,
            product_group_promotions_update_with_required_body,
        } => {
            info!("Performing a ProductGroupPromotionsSlashUpdate request on {:?}", (
                &ad_account_id
            ));

            let result = client.product_group_promotions_slash_update(
                ad_account_id,
                product_group_promotions_update_with_required_body,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ProductGroupPromotionsSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ProductGroupsSlashAnalytics {
            start_date,
            end_date,
            product_group_ids,
            columns,
            granularity,
            ad_account_id,
            click_window_days,
            engagement_window_days,
            view_window_days,
            conversion_report_time,
            reporting_timezone,
        } => {
            info!("Performing a ProductGroupsSlashAnalytics request on {:?}", (
                &ad_account_id
            ));

            let result = client.product_groups_slash_analytics(
                start_date,
                end_date,
                product_group_ids.as_ref(),
                columns.as_ref(),
                granularity,
                ad_account_id,
                click_window_days,
                engagement_window_days,
                view_window_days,
                conversion_report_time,
                reporting_timezone,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ProductGroupsSlashAnalyticsResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupsSlashAnalyticsResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupsSlashAnalyticsResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupsSlashAnalyticsResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupsSlashAnalyticsResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupsSlashAnalyticsResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupsSlashAnalyticsResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ProductGroupPromotionsSlashGet {
            ad_account_id,
            product_group_promotion_id,
        } => {
            info!("Performing a ProductGroupPromotionsSlashGet request on {:?}", (
                &ad_account_id,
                &product_group_promotion_id
            ));

            let result = client.product_group_promotions_slash_get(
                ad_account_id,
                product_group_promotion_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ProductGroupPromotionsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductGroupPromotionsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ProductTagsSlashBulkAdd {
            pin_id,
            product_tags_bulk_add_request,
        } => {
            info!("Performing a ProductTagsSlashBulkAdd request on {:?}", (
                &pin_id
            ));

            let result = client.product_tags_slash_bulk_add(
                pin_id,
                product_tags_bulk_add_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ProductTagsSlashBulkAddResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductTagsSlashBulkAddResponse::TheRequestContainsIneligibleProductTags
                (body)
                => "TheRequestContainsIneligibleProductTags\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductTagsSlashBulkAddResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductTagsSlashBulkAddResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductTagsSlashBulkAddResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductTagsSlashBulkAddResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ProductTagsSlashBulkDelete {
            pin_id,
            product_tags_bulk_delete_request,
        } => {
            info!("Performing a ProductTagsSlashBulkDelete request on {:?}", (
                &pin_id
            ));

            let result = client.product_tags_slash_bulk_delete(
                pin_id,
                product_tags_bulk_delete_request,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ProductTagsSlashBulkDeleteResponse::ResourceDeletedSuccessfully
                => "ResourceDeletedSuccessfully\n".to_string()
                    ,
                ProductTagsSlashBulkDeleteResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductTagsSlashBulkDeleteResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductTagsSlashBulkDeleteResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductTagsSlashBulkDeleteResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductTagsSlashBulkDeleteResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductTagsSlashBulkDeleteResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::ProductTagsSlashList {
            pin_id,
        } => {
            info!("Performing a ProductTagsSlashList request on {:?}", (
                &pin_id
            ));

            let result = client.product_tags_slash_list(
                pin_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                ProductTagsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductTagsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductTagsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductTagsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductTagsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductTagsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                ProductTagsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PromotionsSlashCreate {
            ad_account_id,
            promotion_create,
        } => {
            info!("Performing a PromotionsSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.promotions_slash_create(
                ad_account_id,
                promotion_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PromotionsSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PromotionsSlashList {
            ad_account_id,
            bookmark,
            page_size,
            order,
        } => {
            info!("Performing a PromotionsSlashList request on {:?}", (
                &ad_account_id
            ));

            let result = client.promotions_slash_list(
                ad_account_id,
                bookmark,
                page_size,
                order,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PromotionsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PromotionsSlashUpdate {
            ad_account_id,
            promotion_batch_update,
        } => {
            info!("Performing a PromotionsSlashUpdate request on {:?}", (
                &ad_account_id
            ));

            let result = client.promotions_slash_update(
                ad_account_id,
                promotion_batch_update,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PromotionsSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PromotionsSlashDelete {
            promotion_id,
            ad_account_id,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a PromotionsSlashDelete request on {:?}", (
                &promotion_id,
                &ad_account_id
            ));

            let result = client.promotions_slash_delete(
                promotion_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PromotionsSlashDeleteResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashDeleteResponse::ResourceDeletedSuccessfully
                => "ResourceDeletedSuccessfully\n".to_string()
                    ,
                PromotionsSlashDeleteResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashDeleteResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashDeleteResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashDeleteResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashDeleteResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashDeleteResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::PromotionsSlashGet {
            promotion_id,
            ad_account_id,
        } => {
            info!("Performing a PromotionsSlashGet request on {:?}", (
                &promotion_id,
                &ad_account_id
            ));

            let result = client.promotions_slash_get(
                promotion_id,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                PromotionsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                PromotionsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::AdAccountCountriesSlashGet {
        } => {
            info!("Performing a AdAccountCountriesSlashGet request");

            let result = client.ad_account_countries_slash_get(
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                AdAccountCountriesSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountCountriesSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountCountriesSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountCountriesSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountCountriesSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountCountriesSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                AdAccountCountriesSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::DeliveryMetricsSlashGet {
            report_type,
        } => {
            info!("Performing a DeliveryMetricsSlashGet request");

            let result = client.delivery_metrics_slash_get(
                report_type,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                DeliveryMetricsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                DeliveryMetricsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                DeliveryMetricsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                DeliveryMetricsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                DeliveryMetricsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                DeliveryMetricsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                DeliveryMetricsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LeadFormQuestionsSlashGet {
        } => {
            info!("Performing a LeadFormQuestionsSlashGet request");

            let result = client.lead_form_questions_slash_get(
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LeadFormQuestionsSlashGetResponse::TheRequestHasSucceeded
                => "TheRequestHasSucceeded\n".to_string()
                    ,
                LeadFormQuestionsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormQuestionsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormQuestionsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormQuestionsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormQuestionsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LeadFormQuestionsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::MetricsReadyStateSlashGet {
            date,
        } => {
            info!("Performing a MetricsReadyStateSlashGet request");

            let result = client.metrics_ready_state_slash_get(
                date,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                MetricsReadyStateSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MetricsReadyStateSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MetricsReadyStateSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MetricsReadyStateSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MetricsReadyStateSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MetricsReadyStateSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                MetricsReadyStateSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::InterestTargetingOptionsSlashGet {
            interest_id,
        } => {
            info!("Performing a InterestTargetingOptionsSlashGet request on {:?}", (
                &interest_id
            ));

            let result = client.interest_targeting_options_slash_get(
                interest_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                InterestTargetingOptionsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                InterestTargetingOptionsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                InterestTargetingOptionsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                InterestTargetingOptionsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                InterestTargetingOptionsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                InterestTargetingOptionsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                InterestTargetingOptionsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::TargetingOptionsSlashGet {
            targeting_type,
            ad_account_id,
            client_id,
            oauth_signature,
            timestamp,
        } => {
            info!("Performing a TargetingOptionsSlashGet request on {:?}", (
                &targeting_type
            ));

            let result = client.targeting_options_slash_get(
                targeting_type,
                ad_account_id,
                client_id,
                oauth_signature,
                timestamp,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                TargetingOptionsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingOptionsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingOptionsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingOptionsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingOptionsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingOptionsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingOptionsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::SchedulesSlashCreate {
            ad_account_id,
            schedule_create,
        } => {
            info!("Performing a SchedulesSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.schedules_slash_create(
                ad_account_id,
                schedule_create.as_ref(),
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SchedulesSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SchedulesSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SchedulesSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SchedulesSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SchedulesSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SchedulesSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SchedulesSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SchedulesSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::SchedulesSlashList {
            ad_account_id,
            entity_ids,
            bookmark,
            page_size,
            order,
            schedule_statuses,
            schedule_type,
        } => {
            info!("Performing a SchedulesSlashList request on {:?}", (
                &ad_account_id
            ));

            let result = client.schedules_slash_list(
                ad_account_id,
                entity_ids.as_ref(),
                bookmark,
                page_size,
                order,
                schedule_statuses.as_ref(),
                schedule_type,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SchedulesSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SchedulesSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SchedulesSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SchedulesSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SchedulesSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SchedulesSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SchedulesSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::SchedulesSlashUpdate {
            ad_account_id,
            schedule_batch_update,
        } => {
            info!("Performing a SchedulesSlashUpdate request on {:?}", (
                &ad_account_id
            ));

            let result = client.schedules_slash_update(
                ad_account_id,
                schedule_batch_update.as_ref(),
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SchedulesSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SchedulesSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SchedulesSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SchedulesSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SchedulesSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SchedulesSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SchedulesSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::SearchPartnerPins {
            term,
            country_code,
            bookmark,
            locale,
            limit,
        } => {
            info!("Performing a SearchPartnerPins request");

            let result = client.search_partner_pins(
                term,
                country_code,
                bookmark,
                locale,
                limit,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SearchPartnerPinsResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SearchPartnerPinsResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SearchPartnerPinsResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SearchPartnerPinsResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SearchPartnerPinsResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SearchPartnerPinsResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SearchPartnerPinsResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::SearchUserBoardsSlashGet {
            ad_account_id,
            query,
            bookmark,
            page_size,
        } => {
            info!("Performing a SearchUserBoardsSlashGet request");

            let result = client.search_user_boards_slash_get(
                ad_account_id,
                query,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SearchUserBoardsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SearchUserBoardsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SearchUserBoardsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SearchUserBoardsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SearchUserBoardsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SearchUserBoardsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SearchUserBoardsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::SearchUserPinsSlashList {
            query,
            ad_account_id,
            bookmark,
        } => {
            info!("Performing a SearchUserPinsSlashList request");

            let result = client.search_user_pins_slash_list(
                query,
                ad_account_id,
                bookmark,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                SearchUserPinsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SearchUserPinsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SearchUserPinsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SearchUserPinsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SearchUserPinsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SearchUserPinsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                SearchUserPinsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::TargetingTemplateSlashCreate {
            ad_account_id,
            targeting_template_create,
        } => {
            info!("Performing a TargetingTemplateSlashCreate request on {:?}", (
                &ad_account_id
            ));

            let result = client.targeting_template_slash_create(
                ad_account_id,
                targeting_template_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                TargetingTemplateSlashCreateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingTemplateSlashCreateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingTemplateSlashCreateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingTemplateSlashCreateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingTemplateSlashCreateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingTemplateSlashCreateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingTemplateSlashCreateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingTemplateSlashCreateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::TargetingTemplateSlashList {
            ad_account_id,
            bookmark,
            page_size,
            order,
            include_sizing,
            search_query,
        } => {
            info!("Performing a TargetingTemplateSlashList request on {:?}", (
                &ad_account_id
            ));

            let result = client.targeting_template_slash_list(
                ad_account_id,
                bookmark,
                page_size,
                order,
                include_sizing,
                search_query,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                TargetingTemplateSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingTemplateSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingTemplateSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingTemplateSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingTemplateSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingTemplateSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingTemplateSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::TargetingTemplateSlashUpdate {
            ad_account_id,
            targeting_template_update_request_read_or_update,
        } => {
            info!("Performing a TargetingTemplateSlashUpdate request on {:?}", (
                &ad_account_id
            ));

            let result = client.targeting_template_slash_update(
                ad_account_id,
                targeting_template_update_request_read_or_update,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                TargetingTemplateSlashUpdateResponse::TheRequestHasSucceeded
                => "TheRequestHasSucceeded\n".to_string()
                    ,
                TargetingTemplateSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingTemplateSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingTemplateSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingTemplateSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingTemplateSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TargetingTemplateSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::TermsRelatedSlashList {
            terms,
        } => {
            info!("Performing a TermsRelatedSlashList request");

            let result = client.terms_related_slash_list(
                terms.as_ref(),
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                TermsRelatedSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TermsRelatedSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TermsRelatedSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TermsRelatedSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TermsRelatedSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TermsRelatedSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TermsRelatedSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::TermsSuggestedSlashList {
            term,
            limit,
        } => {
            info!("Performing a TermsSuggestedSlashList request");

            let result = client.terms_suggested_slash_list(
                term,
                limit,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                TermsSuggestedSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TermsSuggestedSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TermsSuggestedSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TermsSuggestedSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TermsSuggestedSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TermsSuggestedSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TermsSuggestedSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::TermsOfServiceSlashGet {
            ad_account_id,
            include_html,
            tos_type,
        } => {
            info!("Performing a TermsOfServiceSlashGet request on {:?}", (
                &ad_account_id
            ));

            let result = client.terms_of_service_slash_get(
                ad_account_id,
                include_html,
                tos_type,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                TermsOfServiceSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TermsOfServiceSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TermsOfServiceSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TermsOfServiceSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TermsOfServiceSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TermsOfServiceSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TermsOfServiceSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::TrendsEditorialArticlesSlashList {
            region,
        } => {
            info!("Performing a TrendsEditorialArticlesSlashList request");

            let result = client.trends_editorial_articles_slash_list(
                region,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                TrendsEditorialArticlesSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsEditorialArticlesSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsEditorialArticlesSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsEditorialArticlesSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsEditorialArticlesSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsEditorialArticlesSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsEditorialArticlesSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::TrendsFeaturedTopicsSlashList {
            region,
            interest,
        } => {
            info!("Performing a TrendsFeaturedTopicsSlashList request");

            let result = client.trends_featured_topics_slash_list(
                region,
                interest,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                TrendsFeaturedTopicsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsFeaturedTopicsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsFeaturedTopicsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsFeaturedTopicsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsFeaturedTopicsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsFeaturedTopicsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsFeaturedTopicsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::TrendsProductCategoriesDetailsSlashList {
            product_categories,
            region,
            lookback_window,
            engagement_type,
        } => {
            info!("Performing a TrendsProductCategoriesDetailsSlashList request");

            let result = client.trends_product_categories_details_slash_list(
                product_categories.as_ref(),
                region,
                lookback_window,
                engagement_type,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                TrendsProductCategoriesDetailsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsProductCategoriesDetailsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsProductCategoriesDetailsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsProductCategoriesDetailsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsProductCategoriesDetailsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsProductCategoriesDetailsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsProductCategoriesDetailsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::TrendsProductCategoriesTrendingSlashList {
            region,
            verticals,
            ages,
            genders,
            engagement_type,
        } => {
            info!("Performing a TrendsProductCategoriesTrendingSlashList request");

            let result = client.trends_product_categories_trending_slash_list(
                region,
                verticals.as_ref(),
                ages.as_ref(),
                genders.as_ref(),
                engagement_type,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                TrendsProductCategoriesTrendingSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsProductCategoriesTrendingSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsProductCategoriesTrendingSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsProductCategoriesTrendingSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsProductCategoriesTrendingSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsProductCategoriesTrendingSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                TrendsProductCategoriesTrendingSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::BoardsUserFollowsSlashList {
            ad_account_id,
            explicit_following,
            bookmark,
            page_size,
        } => {
            info!("Performing a BoardsUserFollowsSlashList request");

            let result = client.boards_user_follows_slash_list(
                ad_account_id,
                explicit_following,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                BoardsUserFollowsSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsUserFollowsSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsUserFollowsSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsUserFollowsSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsUserFollowsSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsUserFollowsSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                BoardsUserFollowsSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::FollowersSlashList {
            bookmark,
            page_size,
        } => {
            info!("Performing a FollowersSlashList request");

            let result = client.followers_slash_list(
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                FollowersSlashListResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FollowersSlashListResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FollowersSlashListResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FollowersSlashListResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FollowersSlashListResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FollowersSlashListResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FollowersSlashListResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::LinkedBusinessAccountsSlashGet {
        } => {
            info!("Performing a LinkedBusinessAccountsSlashGet request");

            let result = client.linked_business_accounts_slash_get(
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                LinkedBusinessAccountsSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LinkedBusinessAccountsSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LinkedBusinessAccountsSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LinkedBusinessAccountsSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LinkedBusinessAccountsSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LinkedBusinessAccountsSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                LinkedBusinessAccountsSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UnverifyWebsiteSlashDelete {
            website,
        } => {
            prompt(args.force, "This will delete the given entry, are you sure?")?;
            info!("Performing a UnverifyWebsiteSlashDelete request");

            let result = client.unverify_website_slash_delete(
                website,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UnverifyWebsiteSlashDeleteResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UnverifyWebsiteSlashDeleteResponse::ResourceDeletedSuccessfully
                => "ResourceDeletedSuccessfully\n".to_string()
                    ,
                UnverifyWebsiteSlashDeleteResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UnverifyWebsiteSlashDeleteResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UnverifyWebsiteSlashDeleteResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UnverifyWebsiteSlashDeleteResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UnverifyWebsiteSlashDeleteResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UnverifyWebsiteSlashDeleteResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UserAccountSlashAnalytics {
            start_date,
            end_date,
            from_claimed_content,
            pin_format,
            app_types,
            content_type,
            source,
            metric_types,
            split_field,
            ad_account_id,
        } => {
            info!("Performing a UserAccountSlashAnalytics request");

            let result = client.user_account_slash_analytics(
                start_date,
                end_date,
                from_claimed_content,
                pin_format,
                app_types,
                content_type,
                source,
                metric_types.as_ref(),
                split_field,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UserAccountSlashAnalyticsResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashAnalyticsResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashAnalyticsResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashAnalyticsResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashAnalyticsResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashAnalyticsResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashAnalyticsResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UserAccountSlashAnalyticsSlashTopPins {
            start_date,
            end_date,
            sort_by,
            from_claimed_content,
            pin_format,
            app_types,
            content_type,
            source,
            metric_types,
            num_of_pins,
            created_in_last_n_days,
            ad_account_id,
        } => {
            info!("Performing a UserAccountSlashAnalyticsSlashTopPins request");

            let result = client.user_account_slash_analytics_slash_top_pins(
                start_date,
                end_date,
                sort_by,
                from_claimed_content,
                pin_format,
                app_types,
                content_type,
                source,
                metric_types.as_ref(),
                num_of_pins,
                created_in_last_n_days,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UserAccountSlashAnalyticsSlashTopPinsResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashAnalyticsSlashTopPinsResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashAnalyticsSlashTopPinsResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashAnalyticsSlashTopPinsResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashAnalyticsSlashTopPinsResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashAnalyticsSlashTopPinsResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashAnalyticsSlashTopPinsResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UserAccountSlashAnalyticsSlashTopVideoPins {
            start_date,
            end_date,
            sort_by,
            from_claimed_content,
            pin_format,
            app_types,
            content_type,
            source,
            metric_types,
            num_of_pins,
            created_in_last_n_days,
            ad_account_id,
        } => {
            info!("Performing a UserAccountSlashAnalyticsSlashTopVideoPins request");

            let result = client.user_account_slash_analytics_slash_top_video_pins(
                start_date,
                end_date,
                sort_by,
                from_claimed_content,
                pin_format,
                app_types,
                content_type,
                source,
                metric_types.as_ref(),
                num_of_pins,
                created_in_last_n_days,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UserAccountSlashAnalyticsSlashTopVideoPinsResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashAnalyticsSlashTopVideoPinsResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashAnalyticsSlashTopVideoPinsResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashAnalyticsSlashTopVideoPinsResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashAnalyticsSlashTopVideoPinsResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashAnalyticsSlashTopVideoPinsResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashAnalyticsSlashTopVideoPinsResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UserAccountSlashGet {
            ad_account_id,
        } => {
            info!("Performing a UserAccountSlashGet request");

            let result = client.user_account_slash_get(
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UserAccountSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UserFollowingSlashGet {
            ad_account_id,
            explicit_following,
            feed_type,
            bookmark,
            page_size,
        } => {
            info!("Performing a UserFollowingSlashGet request");

            let result = client.user_following_slash_get(
                ad_account_id,
                explicit_following,
                feed_type,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UserFollowingSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserFollowingSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserFollowingSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserFollowingSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserFollowingSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserFollowingSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserFollowingSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UserWebsitesSlashGet {
            bookmark,
            page_size,
        } => {
            info!("Performing a UserWebsitesSlashGet request");

            let result = client.user_websites_slash_get(
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UserWebsitesSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserWebsitesSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserWebsitesSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserWebsitesSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserWebsitesSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserWebsitesSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserWebsitesSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::VerifyWebsiteSlashUpdate {
            user_website_create,
            ad_account_id,
        } => {
            info!("Performing a VerifyWebsiteSlashUpdate request");

            let result = client.verify_website_slash_update(
                user_website_create,
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                VerifyWebsiteSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                VerifyWebsiteSlashUpdateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                VerifyWebsiteSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                VerifyWebsiteSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                VerifyWebsiteSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                VerifyWebsiteSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                VerifyWebsiteSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                VerifyWebsiteSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::WebsiteVerificationSlashGet {
            ad_account_id,
        } => {
            info!("Performing a WebsiteVerificationSlashGet request");

            let result = client.website_verification_slash_get(
                ad_account_id,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                WebsiteVerificationSlashGetResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                WebsiteVerificationSlashGetResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                WebsiteVerificationSlashGetResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                WebsiteVerificationSlashGetResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                WebsiteVerificationSlashGetResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                WebsiteVerificationSlashGetResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                WebsiteVerificationSlashGetResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::FollowUserSlashUpdate {
            username,
            follow_user_create,
        } => {
            info!("Performing a FollowUserSlashUpdate request on {:?}", (
                &username
            ));

            let result = client.follow_user_slash_update(
                username,
                follow_user_create,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                FollowUserSlashUpdateResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FollowUserSlashUpdateResponse::ResourceCreateOperationCompletedSuccessfully
                (body)
                => "ResourceCreateOperationCompletedSuccessfully\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FollowUserSlashUpdateResponse::TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
                (body)
                => "TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FollowUserSlashUpdateResponse::AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
                (body)
                => "AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FollowUserSlashUpdateResponse::TheRequestWasValid
                (body)
                => "TheRequestWasValid\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FollowUserSlashUpdateResponse::TheRequestedResourceCouldNotBeFoundOnThisServer
                (body)
                => "TheRequestedResourceCouldNotBeFoundOnThisServer\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FollowUserSlashUpdateResponse::TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
                (body)
                => "TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                FollowUserSlashUpdateResponse::AnUnexpectedErrorResponse
                (body)
                => "AnUnexpectedErrorResponse\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::UserAccountSlashFollowedInterests {
            username,
            bookmark,
            page_size,
        } => {
            info!("Performing a UserAccountSlashFollowedInterests request on {:?}", (
                &username
            ));

            let result = client.user_account_slash_followed_interests(
                username,
                bookmark,
                page_size,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                UserAccountSlashFollowedInterestsResponse::TheRequestHasSucceeded
                (body)
                => "TheRequestHasSucceeded\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashFollowedInterestsResponse::TheServerCouldNotUnderstandTheRequestDueToInvalidSyntax
                (body)
                => "TheServerCouldNotUnderstandTheRequestDueToInvalidSyntax\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashFollowedInterestsResponse::AccessIsUnauthorized
                (body)
                => "AccessIsUnauthorized\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashFollowedInterestsResponse::TheServerCannotFindTheRequestedResource
                (body)
                => "TheServerCannotFindTheRequestedResource\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                UserAccountSlashFollowedInterestsResponse::UnexpectedError
                (body)
                => "UnexpectedError\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
    };

    if let Some(output_file) = args.output_file {
        std::fs::write(output_file, result)?
    } else {
        println!("{}", result);
    }
    Ok(())
}

fn prompt(force: bool, text: &str) -> Result<()> {
    if force || Confirm::new().with_prompt(text).interact()? {
        Ok(())
    } else {
        Err(anyhow!("Aborting"))
    }
}

// May be unused if all inputs are primitive types
#[allow(dead_code)]
fn parse_json<T: serde::de::DeserializeOwned>(json_string: &str) -> Result<T> {
    serde_json::from_str(json_string).map_err(|err| anyhow!("Error parsing input: {}", err))
}
