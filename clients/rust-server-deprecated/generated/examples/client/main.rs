#![allow(missing_docs, unused_variables, trivial_casts)]


#[allow(unused_imports)]
use futures::{future, Stream, stream};
#[allow(unused_imports)]
use openapi_client::{Api, ApiNoContext, Claims, Client, ContextWrapperExt, models,
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
use clap::{Command, Arg};

// NOTE: Set environment variable RUST_LOG to the name of the executable (or "cargo run") to activate console logging for all loglevels.
//     See https://docs.rs/env_logger/latest/env_logger/  for more details

#[allow(unused_imports)]
use log::info;

// swagger::Has may be unused if there are no examples
#[allow(unused_imports)]
use swagger::{AuthData, ContextBuilder, EmptyContext, Has, Push, XSpanIdString};

type ClientContext = swagger::make_context_ty!(ContextBuilder, EmptyContext, Option<AuthData>, XSpanIdString);

mod client_auth;
use client_auth::build_token;


// rt may be unused if there are no examples
#[allow(unused_mut)]
fn main() {
    env_logger::init();

    let matches = Command::new("client")
        .arg(Arg::new("operation")
            .help("Sets the operation to run")
            .value_parser(Vec::<&str>::from([
                "AdAccountsSlashList",
                "AdAccountSlashAnalytics",
                "AdAccountTargetingAnalyticsSlashGet",
                "AdAccountsSlashGet",
                "AnalyticsSlashGetConversionProductReport",
                "AnalyticsSlashGetMmmReport",
                "AnalyticsSlashGetReport",
                "SandboxSlashDelete",
                "TemplatesSlashList",
                "AnalyticsSlashCreateTemplateReport",
                "AdGroupsSlashAnalytics",
                "AdGroupsSlashList",
                "AdGroupsTargetingAnalyticsSlashGet",
                "GetAdGroupsByPromotionIdsSlashList",
                "AdGroupsDynamicTitlesSlashDownloadCsv",
                "AdGroupsDynamicTitlesSlashGetStatus",
                "AdGroupsDynamicTitlesSlashGetUploadUrl",
                "AdGroupsSlashGet",
                "AdTargetingAnalyticsSlashGet",
                "AdsSlashAnalytics",
                "AdsSlashList",
                "CampaignAdPreviewSlashCreate",
                "CampaignAdPreviewSlashDelete",
                "CampaignAdPreviewSlashRead",
                "AdsSlashGet",
                "AudienceInsightsScopeAndTypeSlashGet",
                "AudienceInsightsSlashGet",
                "AdAccountsAudiencesSharedAccountsSlashList",
                "BusinessAccountAudiencesSharedAccountsSlashList",
                "SharedAudiencesForBusinessSlashList",
                "AudiencesSlashList",
                "AudiencesSlashGet",
                "AdsCreditsDiscountsSlashGet",
                "BillingInvoicesSlashGet",
                "BillingProfilesSlashGet",
                "SsioAccountsSlashGet",
                "SsioInsertionOrdersStatusSlashGetByAdAccount",
                "SsioOrderLinesSlashGetByAdAccount",
                "BillingInvoiceDownloadSlashGet",
                "SsioInsertionOrdersStatusSlashGetByPinOrderId",
                "BoardsSlashList",
                "BoardSectionsSlashList",
                "BoardsSlashDelete",
                "BoardsSlashGet",
                "BoardsSlashListPins",
                "BoardSectionsSlashDelete",
                "BoardSectionsSlashListPins",
                "BulkRequestSlashGet",
                "BusinessAssetsSlashGet",
                "BusinessAssetMembersSlashGet",
                "BusinessAssetPartnersSlashGet",
                "BusinessMemberAssetsSlashGet",
                "BusinessPartnerAssetAccessSlashGet",
                "GetSlashInvites",
                "GetSlashBusinessEmployers",
                "GetSlashBusinessMembers",
                "GetSlashBusinessPartners",
                "AdPinsSlashAnalytics",
                "CampaignTargetingAnalyticsSlashGet",
                "CampaignsSlashAnalytics",
                "CampaignsSlashList",
                "CampaignsSlashGet",
                "FeedsSlashList",
                "FeedProcessingResultsSlashList",
                "FeedsSlashDelete",
                "FeedsSlashGet",
                "FeedsSlashIngest",
                "ItemsIssuesSlashList",
                "ItemsBatchSlashGet",
                "CatalogsProductGroupsSlashDeleteMany",
                "CatalogsProductGroupsSlashList",
                "CatalogsProductGroupPinsSlashList",
                "CatalogsProductGroupsSlashDelete",
                "CatalogsProductGroupsSlashGet",
                "CatalogsProductGroupsSlashProductCountsGet",
                "ReportsSlashGet",
                "CatalogsLocalStoresSlashCreate",
                "CatalogsLocalStoresSlashDelete",
                "CatalogsLocalStoresSlashList",
                "CatalogsLocalStoresSlashUpdate",
                "CatalogsSupplementalItemsBatchSlashGet",
                "CatalogsSlashAvailableFilterValues",
                "CatalogsSlashList",
                "ConversionDeletionRequestSlashList",
                "ConversionDeletionRequestSlashDelete",
                "ConversionDeletionRequestSlashGet",
                "ConversionEqsSlashList",
                "ConversionTagsSlashList",
                "OcpmEligibleConversionTagsSlashGet",
                "PageVisitConversionTagsSlashGet",
                "ConversionTagsSlashGet",
                "AdvertiserDefinedEventsSlashDelete",
                "AdvertiserDefinedEventsSlashGet",
                "CustomerListUploadsSlashGet",
                "CustomerListUploadsSlashRun",
                "CustomerListsSlashList",
                "CustomerListsSlashGet",
                "CustomerSegmentSlashList",
                "IntegrationsSlashGetList",
                "IntegrationsCommerceSlashDel",
                "IntegrationsCommerceSlashGet",
                "IntegrationsSlashGetById",
                "CountryKeywordsMetricsSlashGet",
                "KeywordsSlashGet",
                "TrendingKeywordsSlashList",
                "LabelsSlashList",
                "AdAccountsSubscriptionsSlashGetList",
                "AdAccountsSubscriptionsSlashDelById",
                "AdAccountsSubscriptionsSlashGetById",
                "LeadFormsSlashList",
                "LeadFormSlashGet",
                "LeadsExportSlashGet",
                "MediaSlashList",
                "MediaSlashGet",
                "OauthSlashConversionToken",
                "OauthSlashToken",
                "TokenSlashRevoke",
                "OrderLinesSlashList",
                "OrderLinesSlashGet",
                "MultiPinsSlashAnalytics",
                "PinsSlashList",
                "PinsSlashAnalytics",
                "PinsSlashDelete",
                "PinsSlashGet",
                "ProductGroupPromotionsSlashList",
                "ProductGroupsSlashAnalytics",
                "ProductGroupPromotionsSlashGet",
                "ProductTagsSlashList",
                "PromotionsSlashList",
                "PromotionsSlashDelete",
                "PromotionsSlashGet",
                "AdAccountCountriesSlashGet",
                "DeliveryMetricsSlashGet",
                "LeadFormQuestionsSlashGet",
                "MetricsReadyStateSlashGet",
                "InterestTargetingOptionsSlashGet",
                "TargetingOptionsSlashGet",
                "SchedulesSlashCreate",
                "SchedulesSlashList",
                "SchedulesSlashUpdate",
                "SearchPartnerPins",
                "SearchUserBoardsSlashGet",
                "SearchUserPinsSlashList",
                "TargetingTemplateSlashList",
                "TermsRelatedSlashList",
                "TermsSuggestedSlashList",
                "TermsOfServiceSlashGet",
                "TrendsEditorialArticlesSlashList",
                "TrendsFeaturedTopicsSlashList",
                "TrendsProductCategoriesDetailsSlashList",
                "TrendsProductCategoriesTrendingSlashList",
                "BoardsUserFollowsSlashList",
                "FollowersSlashList",
                "LinkedBusinessAccountsSlashGet",
                "UnverifyWebsiteSlashDelete",
                "UserAccountSlashAnalytics",
                "UserAccountSlashAnalyticsSlashTopPins",
                "UserAccountSlashAnalyticsSlashTopVideoPins",
                "UserAccountSlashGet",
                "UserFollowingSlashGet",
                "UserWebsitesSlashGet",
                "WebsiteVerificationSlashGet",
                "UserAccountSlashFollowedInterests",
            ]))
            .required(true)
            .index(1))
        .arg(Arg::new("https")
            .long("https")
            .help("Whether to use HTTPS or not"))
        .arg(Arg::new("host")
            .long("host")
            .default_value("api.pinterest.com")
            .help("Hostname to contact"))
        .arg(Arg::new("port")
            .long("port")
            .default_value("8080")
            .help("Port to contact"))
        .get_matches();

    // Create Bearer-token with a fixed key (secret) for test purposes.
    // In a real (production) system this Bearer token should be obtained via an external Identity/Authentication-server
    // Ensure that you set the correct algorithm and encodingkey that matches what is used on the server side.
    // See https://github.com/Keats/jsonwebtoken for more information
    let auth_token = build_token(
            Claims {
                sub: "tester@acme.com".to_owned(),
                company: "ACME".to_owned(),
                iss: "my_identity_provider".to_owned(),
                // added a very long expiry time
                aud: "org.acme.Resource_Server".to_string(),
                exp: 10000000000,
                // In this example code all available Scopes are added, so the current Bearer Token gets fully authorization.
                scopes:
                  [
                            "ads:read",
                            "ads:write",
                            "billing:read",
                            "billing:write",
                            "biz_access:read",
                            "biz_access:write",
                            "boards:read",
                            "boards:read_secret",
                            "boards:write",
                            "boards:write_secret",
                            "catalogs:read",
                            "catalogs:write",
                            "msot:write",
                            "pins:read",
                            "pins:read_secret",
                            "pins:write",
                            "pins:write_secret",
                            "user_accounts:read",
                            "user_accounts:write",
                            "ads:read",
                            "ads:write",
                            "billing:read",
                            "billing:write",
                            "biz_access:read",
                            "biz_access:write",
                            "boards:read",
                            "boards:read_secret",
                            "boards:write",
                            "boards:write_secret",
                            "catalogs:read",
                            "catalogs:write",
                            "msot:write",
                            "pins:read",
                            "pins:read_secret",
                            "pins:write",
                            "pins:write_secret",
                            "user_accounts:read",
                            "user_accounts:write",
                  ].join::<&str>(", ")
            },
            b"secret").unwrap();

    let auth_data = if !auth_token.is_empty() {
        Some(AuthData::Bearer(auth_token))
    } else {
        // No Bearer-token available, so return None
        None
    };

    let is_https = matches.contains_id("https");
    let base_url = format!("{}://{}:{}",
        if is_https { "https" } else { "http" },
        matches.get_one::<String>("host").unwrap(),
        matches.get_one::<u16>("port").unwrap());

    let context: ClientContext =
        swagger::make_context!(ContextBuilder, EmptyContext, auth_data, XSpanIdString::default());

    let mut client : Box<dyn ApiNoContext<ClientContext>> = {
        #[cfg(feature = "client-tls")]
        {
            if is_https {
                // Using HTTPS with native-tls
                let client = Box::new(Client::try_new_https(&base_url)
                    .expect("Failed to create HTTPS client"));
                Box::new(client.with_context(context))
            } else {
                // Using HTTP
                let client = Box::new(Client::try_new_http(&base_url)
                    .expect("Failed to create HTTP client"));
                Box::new(client.with_context(context))
            }
        }

        #[cfg(not(feature = "client-tls"))]
        {
            if is_https {
                panic!("HTTPS requested but TLS support not enabled. \
                        Enable the 'client-tls' feature to use HTTPS.");
            }
            // Using HTTP only
            let client = Box::new(Client::try_new_http(&base_url)
                .expect("Failed to create HTTP client"));
            Box::new(client.with_context(context))
        }
    };

    let mut rt = tokio::runtime::Runtime::new().unwrap();

    match matches.get_one::<String>("operation").map(String::as_str) {
        /* Disabled because there's no example.
        Some("AdAccountsSlashCreate") => {
            let result = rt.block_on(client.ad_accounts_slash_create(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AdAccountsSlashList") => {
            let result = rt.block_on(client.ad_accounts_slash_list(
                  Some(true),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdAccountSlashAnalytics") => {
            let result = rt.block_on(client.ad_account_slash_analytics(
                  2013-10-20,
                  2013-10-20,
                  &Vec::new(),
                  models::Granularity::Total,
                  "ad_account_id_example".to_string(),
                  Some(models::AdGroupsAnalyticsClickWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsClickWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsViewWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsConversionReportTimeParameter::TimeOfAdAction),
                  Some(models::ReportingTimeZone::PinterestTimeZone)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdAccountTargetingAnalyticsSlashGet") => {
            let result = rt.block_on(client.ad_account_targeting_analytics_slash_get(
                  "ad_account_id_example".to_string(),
                  2013-10-20,
                  2013-10-20,
                  &Vec::new(),
                  &Vec::new(),
                  models::Granularity::Total,
                  Some(models::AdGroupsAnalyticsClickWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsClickWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsViewWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsConversionReportTimeParameter::TimeOfAdAction),
                  Some(&Vec::new()),
                  Some(models::ReportingTimeZone::PinterestTimeZone)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdAccountsSlashGet") => {
            let result = rt.block_on(client.ad_accounts_slash_get(
                  "ad_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("AnalyticsSlashCreateConversionProductReport") => {
            let result = rt.block_on(client.analytics_slash_create_conversion_product_report(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("AnalyticsSlashCreateMmmReport") => {
            let result = rt.block_on(client.analytics_slash_create_mmm_report(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("AnalyticsSlashCreateReport") => {
            let result = rt.block_on(client.analytics_slash_create_report(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AnalyticsSlashGetConversionProductReport") => {
            let result = rt.block_on(client.analytics_slash_get_conversion_product_report(
                  "ad_account_id_example".to_string(),
                  "token_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AnalyticsSlashGetMmmReport") => {
            let result = rt.block_on(client.analytics_slash_get_mmm_report(
                  "ad_account_id_example".to_string(),
                  "token_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AnalyticsSlashGetReport") => {
            let result = rt.block_on(client.analytics_slash_get_report(
                  "ad_account_id_example".to_string(),
                  "token_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SandboxSlashDelete") => {
            let result = rt.block_on(client.sandbox_slash_delete(
                  "ad_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("TemplatesSlashList") => {
            let result = rt.block_on(client.templates_slash_list(
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(models::PinterestLibPaginationOrder::Ascending)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AnalyticsSlashCreateTemplateReport") => {
            let result = rt.block_on(client.analytics_slash_create_template_report(
                  "ad_account_id_example".to_string(),
                  "template_id_example".to_string(),
                  None,
                  None,
                  Some(models::Granularity::Total)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("AdGroupsBidFloorSlashGet") => {
            let result = rt.block_on(client.ad_groups_bid_floor_slash_get(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AdGroupsSlashAnalytics") => {
            let result = rt.block_on(client.ad_groups_slash_analytics(
                  2013-10-20,
                  2013-10-20,
                  &Vec::new(),
                  &Vec::new(),
                  models::Granularity::Total,
                  "ad_account_id_example".to_string(),
                  Some(models::AdGroupsAnalyticsClickWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsClickWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsViewWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsConversionReportTimeParameter::TimeOfAdAction),
                  Some(true),
                  Some(models::ReportingTimeZone::PinterestTimeZone)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("AdGroupsSlashAudienceSizing") => {
            let result = rt.block_on(client.ad_groups_slash_audience_sizing(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("AdGroupsSlashCreate") => {
            let result = rt.block_on(client.ad_groups_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AdGroupsSlashList") => {
            let result = rt.block_on(client.ad_groups_slash_list(
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(models::PinterestLibPaginationOrder::Ascending),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("AdGroupsSlashUpdate") => {
            let result = rt.block_on(client.ad_groups_slash_update(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AdGroupsTargetingAnalyticsSlashGet") => {
            let result = rt.block_on(client.ad_groups_targeting_analytics_slash_get(
                  "ad_account_id_example".to_string(),
                  &Vec::new(),
                  2013-10-20,
                  2013-10-20,
                  &Vec::new(),
                  &Vec::new(),
                  models::Granularity::Total,
                  Some(models::AdGroupsAnalyticsClickWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsClickWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsViewWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsConversionReportTimeParameter::TimeOfAdAction),
                  Some(&Vec::new()),
                  Some(models::ReportingTimeZone::PinterestTimeZone),
                  Some(&Vec::new()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetAdGroupsByPromotionIdsSlashList") => {
            let result = rt.block_on(client.get_ad_groups_by_promotion_ids_slash_list(
                  "ad_account_id_example".to_string(),
                  &Vec::new(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(models::PinterestLibPaginationOrder::Ascending)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdGroupsDynamicTitlesSlashDownloadCsv") => {
            let result = rt.block_on(client.ad_groups_dynamic_titles_slash_download_csv(
                  "ad_account_id_example".to_string(),
                  "ad_group_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdGroupsDynamicTitlesSlashGetStatus") => {
            let result = rt.block_on(client.ad_groups_dynamic_titles_slash_get_status(
                  "ad_account_id_example".to_string(),
                  "ad_group_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdGroupsDynamicTitlesSlashGetUploadUrl") => {
            let result = rt.block_on(client.ad_groups_dynamic_titles_slash_get_upload_url(
                  "ad_account_id_example".to_string(),
                  "ad_group_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("AdGroupsDynamicTitlesSlashProcessCsv") => {
            let result = rt.block_on(client.ad_groups_dynamic_titles_slash_process_csv(
                  "ad_account_id_example".to_string(),
                  "ad_group_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AdGroupsSlashGet") => {
            let result = rt.block_on(client.ad_groups_slash_get(
                  "ad_group_id_example".to_string(),
                  "ad_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("AdPreviewsSlashCreate") => {
            let result = rt.block_on(client.ad_previews_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AdTargetingAnalyticsSlashGet") => {
            let result = rt.block_on(client.ad_targeting_analytics_slash_get(
                  "ad_account_id_example".to_string(),
                  &Vec::new(),
                  2013-10-20,
                  2013-10-20,
                  &Vec::new(),
                  &Vec::new(),
                  models::Granularity::Total,
                  Some(models::ConversionAttributionWindowDays::Variant0),
                  Some(models::ConversionAttributionWindowDays::Variant0),
                  Some(models::ConversionAttributionWindowDays::Variant0),
                  Some(models::ConversionReportTimeType::TimeOfAdAction),
                  Some(&Vec::new()),
                  Some(models::ReportingTimeZone::PinterestTimeZone),
                  Some(&Vec::new()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdsSlashAnalytics") => {
            let result = rt.block_on(client.ads_slash_analytics(
                  2013-10-20,
                  2013-10-20,
                  &Vec::new(),
                  models::Granularity::Total,
                  "ad_account_id_example".to_string(),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(models::AdGroupsAnalyticsClickWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsClickWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsViewWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsConversionReportTimeParameter::TimeOfAdAction),
                  Some(&Vec::new()),
                  Some(models::ReportingTimeZone::PinterestTimeZone)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("AdsSlashCreate") => {
            let result = rt.block_on(client.ads_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AdsSlashList") => {
            let result = rt.block_on(client.ads_slash_list(
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(models::PinterestLibPaginationOrder::Ascending),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("AdsSlashUpdate") => {
            let result = rt.block_on(client.ads_slash_update(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("CampaignAdPreviewSlashCreate") => {
            let result = rt.block_on(client.campaign_ad_preview_slash_create(
                  "ad_account_id_example".to_string(),
                  &Vec::new()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CampaignAdPreviewSlashDelete") => {
            let result = rt.block_on(client.campaign_ad_preview_slash_delete(
                  &Vec::new(),
                  "ad_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CampaignAdPreviewSlashRead") => {
            let result = rt.block_on(client.campaign_ad_preview_slash_read(
                  &Vec::new(),
                  "ad_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdsSlashGet") => {
            let result = rt.block_on(client.ads_slash_get(
                  "ad_id_example".to_string(),
                  "ad_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("AdvancedAuctionItemsGetSlashPost") => {
            let result = rt.block_on(client.advanced_auction_items_get_slash_post(
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("AdvancedAuctionItemsSubmitSlashPost") => {
            let result = rt.block_on(client.advanced_auction_items_submit_slash_post(
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AudienceInsightsScopeAndTypeSlashGet") => {
            let result = rt.block_on(client.audience_insights_scope_and_type_slash_get(
                  "ad_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AudienceInsightsSlashGet") => {
            let result = rt.block_on(client.audience_insights_slash_get(
                  "ad_account_id_example".to_string(),
                  models::AudienceInsightType::YourTotalAudience
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdAccountsAudiencesSharedAccountsSlashList") => {
            let result = rt.block_on(client.ad_accounts_audiences_shared_accounts_slash_list(
                  "audience_id_example".to_string(),
                  models::AudienceAccountType::AdAccount,
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BusinessAccountAudiencesSharedAccountsSlashList") => {
            let result = rt.block_on(client.business_account_audiences_shared_accounts_slash_list(
                  "business_id_example".to_string(),
                  "audience_id_example".to_string(),
                  models::AudienceAccountType::AdAccount,
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SharedAudiencesForBusinessSlashList") => {
            let result = rt.block_on(client.shared_audiences_for_business_slash_list(
                  "business_id_example".to_string(),
                  Some(models::Order::Ascending),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("UpdateAdAccountToAdAccountSharedAudience") => {
            let result = rt.block_on(client.update_ad_account_to_ad_account_shared_audience(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("UpdateAdAccountToBusinessSharedAudience") => {
            let result = rt.block_on(client.update_ad_account_to_business_shared_audience(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("UpdateBusinessToAdAccountSharedAudience") => {
            let result = rt.block_on(client.update_business_to_ad_account_shared_audience(
                  "business_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("UpdateBusinessToBusinessSharedAudience") => {
            let result = rt.block_on(client.update_business_to_business_shared_audience(
                  "business_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("AudiencesSlashCreate") => {
            let result = rt.block_on(client.audiences_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AudiencesSlashList") => {
            let result = rt.block_on(client.audiences_slash_list(
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(models::PinterestLibPaginationOrder::Ascending),
                  Some(models::AudienceOwnershipType::Owned),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AudiencesSlashGet") => {
            let result = rt.block_on(client.audiences_slash_get(
                  "audience_id_example".to_string(),
                  "ad_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("AudiencesSlashUpdate") => {
            let result = rt.block_on(client.audiences_slash_update(
                  "audience_id_example".to_string(),
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("AdsCreditSlashRedeem") => {
            let result = rt.block_on(client.ads_credit_slash_redeem(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AdsCreditsDiscountsSlashGet") => {
            let result = rt.block_on(client.ads_credits_discounts_slash_get(
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BillingInvoicesSlashGet") => {
            let result = rt.block_on(client.billing_invoices_slash_get(
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(models::PinterestLibPaginationOrder::Ascending),
                  Some(models::BillingInvoiceSortField::DueDate),
                  Some(models::BillingInvoiceStatus::Open),
                  Some(models::BillingInvoiceDocumentType::Invoice),
                  None,
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BillingProfilesSlashGet") => {
            let result = rt.block_on(client.billing_profiles_slash_get(
                  true,
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SsioAccountsSlashGet") => {
            let result = rt.block_on(client.ssio_accounts_slash_get(
                  "ad_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("SsioInsertionOrderSlashCreate") => {
            let result = rt.block_on(client.ssio_insertion_order_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("SsioInsertionOrderSlashEdit") => {
            let result = rt.block_on(client.ssio_insertion_order_slash_edit(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("SsioInsertionOrdersStatusSlashGetByAdAccount") => {
            let result = rt.block_on(client.ssio_insertion_orders_status_slash_get_by_ad_account(
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SsioOrderLinesSlashGetByAdAccount") => {
            let result = rt.block_on(client.ssio_order_lines_slash_get_by_ad_account(
                  "ad_account_id_example".to_string(),
                  Some("pin_order_id_example".to_string()),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BillingInvoiceDownloadSlashGet") => {
            let result = rt.block_on(client.billing_invoice_download_slash_get(
                  "ad_account_id_example".to_string(),
                  "billing_invoice_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SsioInsertionOrdersStatusSlashGetByPinOrderId") => {
            let result = rt.block_on(client.ssio_insertion_orders_status_slash_get_by_pin_order_id(
                  "ad_account_id_example".to_string(),
                  "pin_order_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("BoardsSlashCreate") => {
            let result = rt.block_on(client.boards_slash_create(
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("BoardsSlashList") => {
            let result = rt.block_on(client.boards_slash_list(
                  Some("ad_account_id_example".to_string()),
                  Some(models::BoardPrivacyFilter::All),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("BoardSectionsSlashCreate") => {
            let result = rt.block_on(client.board_sections_slash_create(
                  "board_id_example".to_string(),
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("BoardSectionsSlashList") => {
            let result = rt.block_on(client.board_sections_slash_list(
                  "board_id_example".to_string(),
                  Some("ad_account_id_example".to_string()),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BoardsSlashDelete") => {
            let result = rt.block_on(client.boards_slash_delete(
                  "board_id_example".to_string(),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BoardsSlashGet") => {
            let result = rt.block_on(client.boards_slash_get(
                  "board_id_example".to_string(),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BoardsSlashListPins") => {
            let result = rt.block_on(client.boards_slash_list_pins(
                  "board_id_example".to_string(),
                  Some(&Vec::new()),
                  Some("ad_account_id_example".to_string()),
                  Some(true),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("BoardsSlashUpdate") => {
            let result = rt.block_on(client.boards_slash_update(
                  "board_id_example".to_string(),
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("BoardSectionsSlashDelete") => {
            let result = rt.block_on(client.board_sections_slash_delete(
                  "board_id_example".to_string(),
                  "section_id_example".to_string(),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BoardSectionsSlashListPins") => {
            let result = rt.block_on(client.board_sections_slash_list_pins(
                  "board_id_example".to_string(),
                  "section_id_example".to_string(),
                  Some("ad_account_id_example".to_string()),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("BoardSectionsSlashUpdate") => {
            let result = rt.block_on(client.board_sections_slash_update(
                  "board_id_example".to_string(),
                  "section_id_example".to_string(),
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("BulkDownloadSlashCreate") => {
            let result = rt.block_on(client.bulk_download_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("BulkUpsertSlashCreate") => {
            let result = rt.block_on(client.bulk_upsert_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("BulkRequestSlashGet") => {
            let result = rt.block_on(client.bulk_request_slash_get(
                  "ad_account_id_example".to_string(),
                  "bulk_request_id_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("AssetGroupSlashCreate") => {
            let result = rt.block_on(client.asset_group_slash_create(
                  "business_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("AssetGroupSlashDelete") => {
            let result = rt.block_on(client.asset_group_slash_delete(
                  "business_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("AssetGroupSlashUpdate") => {
            let result = rt.block_on(client.asset_group_slash_update(
                  "business_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("BusinessAssetsSlashGet") => {
            let result = rt.block_on(client.business_assets_slash_get(
                  "business_id_example".to_string(),
                  Some(&Vec::new()),
                  Some("child_asset_id_example".to_string()),
                  Some("asset_group_id_example".to_string()),
                  Some(models::BusinessAssetsGetAssetTypeParameter::AdAccount),
                  Some(56),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("BusinessMembersAssetAccessSlashDelete") => {
            let result = rt.block_on(client.business_members_asset_access_slash_delete(
                  "business_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("BusinessMembersAssetAccessSlashUpdate") => {
            let result = rt.block_on(client.business_members_asset_access_slash_update(
                  "business_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("DeletePartnerAssetAccessHandlerImpl") => {
            let result = rt.block_on(client.delete_partner_asset_access_handler_impl(
                  "business_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("UpdatePartnerAssetAccessHandlerImpl") => {
            let result = rt.block_on(client.update_partner_asset_access_handler_impl(
                  "business_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("BusinessAssetMembersSlashGet") => {
            let result = rt.block_on(client.business_asset_members_slash_get(
                  "business_id_example".to_string(),
                  "asset_id_example".to_string(),
                  Some(56),
                  Some(true),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BusinessAssetPartnersSlashGet") => {
            let result = rt.block_on(client.business_asset_partners_slash_get(
                  "business_id_example".to_string(),
                  "asset_id_example".to_string(),
                  Some(56),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BusinessMemberAssetsSlashGet") => {
            let result = rt.block_on(client.business_member_assets_slash_get(
                  "business_id_example".to_string(),
                  "member_id_example".to_string(),
                  Some(models::BusinessMemberAssetsGetAssetTypeParameter::AdAccount),
                  Some(56),
                  Some(models::AssetSortBy::Name),
                  Some(true),
                  Some(models::AssetSearchBy::Name),
                  Some("search_value_example".to_string()),
                  Some(models::AssetPermissionType::AggregatedPermission),
                  Some(&Vec::new()),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BusinessPartnerAssetAccessSlashGet") => {
            let result = rt.block_on(client.business_partner_asset_access_slash_get(
                  "business_id_example".to_string(),
                  "partner_id_example".to_string(),
                  Some(models::BusinessPartnerAssetAccessGetPartnerTypeParameter::Internal),
                  Some(models::BusinessPartnerAssetAccessGetAssetTypeParameter::AdAccount),
                  Some(56),
                  Some(models::AssetSortBy::Name),
                  Some(true),
                  Some(models::AssetSearchBy::Name),
                  Some("search_value_example".to_string()),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("RespondBusinessAccessInvites") => {
            let result = rt.block_on(client.respond_business_access_invites(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("AssetAccessRequestsSlashCreate") => {
            let result = rt.block_on(client.asset_access_requests_slash_create(
                  "business_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CancelInvitesOrRequests") => {
            let result = rt.block_on(client.cancel_invites_or_requests(
                  "business_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CreateAssetInvites") => {
            let result = rt.block_on(client.create_asset_invites(
                  "business_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CreateMembershipOrPartnershipInvites") => {
            let result = rt.block_on(client.create_membership_or_partnership_invites(
                  "business_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetSlashInvites") => {
            let result = rt.block_on(client.get_slash_invites(
                  "business_id_example".to_string(),
                  Some(true),
                  Some(&Vec::new()),
                  Some(models::InviteType::MemberInvite),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetSlashBusinessEmployers") => {
            let result = rt.block_on(client.get_slash_business_employers(
                  Some(true),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("BrandAccountsSlashCreate") => {
            let result = rt.block_on(client.brand_accounts_slash_create(
                  "business_hierarchy_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("DeleteBusinessMembership") => {
            let result = rt.block_on(client.delete_business_membership(
                  "business_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("DeleteBusinessPartners") => {
            let result = rt.block_on(client.delete_business_partners(
                  "business_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("GetSlashBusinessMembers") => {
            let result = rt.block_on(client.get_slash_business_members(
                  "business_id_example".to_string(),
                  Some(true),
                  Some(true),
                  Some(&Vec::new()),
                  Some("member_ids_example".to_string()),
                  Some(56),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("GetSlashBusinessPartners") => {
            let result = rt.block_on(client.get_slash_business_partners(
                  "business_id_example".to_string(),
                  Some(true),
                  Some(models::PartnerType::Internal),
                  Some("partner_ids_example".to_string()),
                  Some(56),
                  Some(true),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("UpdateSlashBusinessMemberships") => {
            let result = rt.block_on(client.update_slash_business_memberships(
                  "business_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("BrandAccountsSlashUpdate") => {
            let result = rt.block_on(client.brand_accounts_slash_update(
                  "brand_account_id_example".to_string(),
                  "business_hierarchy_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("SystemUserSlashUpdate") => {
            let result = rt.block_on(client.system_user_slash_update(
                  "business_id_example".to_string(),
                  "system_user_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AdPinsSlashAnalytics") => {
            let result = rt.block_on(client.ad_pins_slash_analytics(
                  "campaign_id_example".to_string(),
                  &Vec::new(),
                  2013-10-20,
                  2013-10-20,
                  &Vec::new(),
                  models::Granularity::Total,
                  "ad_account_id_example".to_string(),
                  Some(models::AdGroupsAnalyticsClickWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsClickWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsViewWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsConversionReportTimeParameter::TimeOfAdAction)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CampaignTargetingAnalyticsSlashGet") => {
            let result = rt.block_on(client.campaign_targeting_analytics_slash_get(
                  "ad_account_id_example".to_string(),
                  &Vec::new(),
                  2013-10-20,
                  2013-10-20,
                  &Vec::new(),
                  &Vec::new(),
                  models::Granularity::Total,
                  Some(models::AdGroupsAnalyticsClickWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsClickWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsViewWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsConversionReportTimeParameter::TimeOfAdAction),
                  Some(&Vec::new()),
                  Some(models::ReportingTimeZone::PinterestTimeZone)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CampaignsSlashAnalytics") => {
            let result = rt.block_on(client.campaigns_slash_analytics(
                  2013-10-20,
                  2013-10-20,
                  &Vec::new(),
                  &Vec::new(),
                  models::Granularity::Total,
                  "ad_account_id_example".to_string(),
                  Some(models::AdGroupsAnalyticsClickWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsClickWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsViewWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsConversionReportTimeParameter::TimeOfAdAction),
                  Some(true),
                  Some(models::ReportingTimeZone::PinterestTimeZone)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CampaignsSlashCreate") => {
            let result = rt.block_on(client.campaigns_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("CampaignsSlashList") => {
            let result = rt.block_on(client.campaigns_slash_list(
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(models::PinterestLibPaginationOrder::Ascending),
                  Some(&Vec::new()),
                  Some(&Vec::new())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CampaignsSlashUpdate") => {
            let result = rt.block_on(client.campaigns_slash_update(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("GetCampaignDeliveryEstimates") => {
            let result = rt.block_on(client.get_campaign_delivery_estimates(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("CampaignsSlashGet") => {
            let result = rt.block_on(client.campaigns_slash_get(
                  "campaign_id_example".to_string(),
                  "ad_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("FeedsSlashCreate") => {
            let result = rt.block_on(client.feeds_slash_create(
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("FeedsSlashList") => {
            let result = rt.block_on(client.feeds_slash_list(
                  Some("catalog_id_example".to_string()),
                  Some("ad_account_id_example".to_string()),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("FeedProcessingResultsSlashList") => {
            let result = rt.block_on(client.feed_processing_results_slash_list(
                  "feed_id_example".to_string(),
                  Some("ad_account_id_example".to_string()),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("FeedsSlashDelete") => {
            let result = rt.block_on(client.feeds_slash_delete(
                  "feed_id_example".to_string(),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("FeedsSlashGet") => {
            let result = rt.block_on(client.feeds_slash_get(
                  "feed_id_example".to_string(),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("FeedsSlashIngest") => {
            let result = rt.block_on(client.feeds_slash_ingest(
                  "feed_id_example".to_string(),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("FeedsSlashUpdate") => {
            let result = rt.block_on(client.feeds_slash_update(
                  "feed_id_example".to_string(),
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ItemsIssuesSlashList") => {
            let result = rt.block_on(client.items_issues_slash_list(
                  "processing_result_id_example".to_string(),
                  Some(&Vec::new()),
                  Some(models::CatalogsItemValidationIssue::AdImage0LinkLengthTooLong),
                  Some("ad_account_id_example".to_string()),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("ItemsBatchSlashPost") => {
            let result = rt.block_on(client.items_batch_slash_post(
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("ItemsSlashPost") => {
            let result = rt.block_on(client.items_slash_post(
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ItemsBatchSlashGet") => {
            let result = rt.block_on(client.items_batch_slash_get(
                  "batch_id_example".to_string(),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CatalogsProductGroupsSlashCreate") => {
            let result = rt.block_on(client.catalogs_product_groups_slash_create(
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CatalogsProductGroupsSlashCreateMany") => {
            let result = rt.block_on(client.catalogs_product_groups_slash_create_many(
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("CatalogsProductGroupsSlashDeleteMany") => {
            let result = rt.block_on(client.catalogs_product_groups_slash_delete_many(
                  &Vec::new(),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CatalogsProductGroupsSlashList") => {
            let result = rt.block_on(client.catalogs_product_groups_slash_list(
                  Some(&Vec::new()),
                  Some("feed_id_example".to_string()),
                  Some("catalog_id_example".to_string()),
                  Some("ad_account_id_example".to_string()),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("ProductsByProductGroupFilterSlashList") => {
            let result = rt.block_on(client.products_by_product_group_filter_slash_list(
                  ???,
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some("ad_account_id_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("CatalogsProductGroupPinsSlashList") => {
            let result = rt.block_on(client.catalogs_product_group_pins_slash_list(
                  "product_group_id_example".to_string(),
                  Some("ad_account_id_example".to_string()),
                  Some(true),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CatalogsProductGroupsSlashDelete") => {
            let result = rt.block_on(client.catalogs_product_groups_slash_delete(
                  "product_group_id_example".to_string(),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CatalogsProductGroupsSlashGet") => {
            let result = rt.block_on(client.catalogs_product_groups_slash_get(
                  "product_group_id_example".to_string(),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CatalogsProductGroupsSlashProductCountsGet") => {
            let result = rt.block_on(client.catalogs_product_groups_slash_product_counts_get(
                  "product_group_id_example".to_string(),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CatalogsProductGroupsSlashUpdate") => {
            let result = rt.block_on(client.catalogs_product_groups_slash_update(
                  "product_group_id_example".to_string(),
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("ReportsSlashCreate") => {
            let result = rt.block_on(client.reports_slash_create(
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ReportsSlashGet") => {
            let result = rt.block_on(client.reports_slash_get(
                  "token_example".to_string(),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("ReportsSlashStats") => {
            let result = rt.block_on(client.reports_slash_stats(
                  ???,
                  Some("ad_account_id_example".to_string()),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CatalogsLocalInventoryItemsBatchSlashOperate") => {
            let result = rt.block_on(client.catalogs_local_inventory_items_batch_slash_operate(
                  "catalog_id_example".to_string(),
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CatalogsLocalInventoryItemsSlashPost") => {
            let result = rt.block_on(client.catalogs_local_inventory_items_slash_post(
                  "catalog_id_example".to_string(),
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("CatalogsLocalStoresSlashCreate") => {
            let result = rt.block_on(client.catalogs_local_stores_slash_create(
                  "catalog_id_example".to_string(),
                  &Vec::new(),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CatalogsLocalStoresSlashDelete") => {
            let result = rt.block_on(client.catalogs_local_stores_slash_delete(
                  "catalog_id_example".to_string(),
                  &Vec::new(),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CatalogsLocalStoresSlashList") => {
            let result = rt.block_on(client.catalogs_local_stores_slash_list(
                  "catalog_id_example".to_string(),
                  Some(&Vec::new()),
                  Some("ad_account_id_example".to_string()),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CatalogsLocalStoresSlashUpdate") => {
            let result = rt.block_on(client.catalogs_local_stores_slash_update(
                  "catalog_id_example".to_string(),
                  &Vec::new(),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CatalogsSupplementalItemsBatchSlashGet") => {
            let result = rt.block_on(client.catalogs_supplemental_items_batch_slash_get(
                  "catalog_id_example".to_string(),
                  "batch_id_example".to_string(),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CatalogsSlashAvailableFilterValues") => {
            let result = rt.block_on(client.catalogs_slash_available_filter_values(
                  "catalog_id_example".to_string(),
                  Some("feed_id_example".to_string()),
                  Some(models::Country::Ad),
                  Some(models::CatalogsLocale::AfZa),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CatalogsSlashCreate") => {
            let result = rt.block_on(client.catalogs_slash_create(
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("CatalogsSlashList") => {
            let result = rt.block_on(client.catalogs_slash_list(
                  Some("ad_account_id_example".to_string()),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("ConversionDeletionRequestSlashCreate") => {
            let result = rt.block_on(client.conversion_deletion_request_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ConversionDeletionRequestSlashList") => {
            let result = rt.block_on(client.conversion_deletion_request_slash_list(
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(models::PinterestLibPaginationOrder::Ascending)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ConversionDeletionRequestSlashDelete") => {
            let result = rt.block_on(client.conversion_deletion_request_slash_delete(
                  "request_id_example".to_string(),
                  "ad_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ConversionDeletionRequestSlashGet") => {
            let result = rt.block_on(client.conversion_deletion_request_slash_get(
                  "request_id_example".to_string(),
                  "ad_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ConversionEqsSlashList") => {
            let result = rt.block_on(client.conversion_eqs_slash_list(
                  models::LookbackPeriodOptions::Variant1d,
                  "ad_account_id_example".to_string(),
                  Some(models::SourcePlatformOptions::Web),
                  Some(models::IngestionSourceOptions::Tag)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("EventsSlashCreate") => {
            let result = rt.block_on(client.events_slash_create(
                  "ad_account_id_example".to_string(),
                  ???,
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("ConversionTagsSlashCreate") => {
            let result = rt.block_on(client.conversion_tags_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ConversionTagsSlashList") => {
            let result = rt.block_on(client.conversion_tags_slash_list(
                  "ad_account_id_example".to_string(),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("OcpmEligibleConversionTagsSlashGet") => {
            let result = rt.block_on(client.ocpm_eligible_conversion_tags_slash_get(
                  "ad_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PageVisitConversionTagsSlashGet") => {
            let result = rt.block_on(client.page_visit_conversion_tags_slash_get(
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(models::PinterestLibPaginationOrder::Ascending)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ConversionTagsSlashGet") => {
            let result = rt.block_on(client.conversion_tags_slash_get(
                  "ad_account_id_example".to_string(),
                  "conversion_tag_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("AdvertiserDefinedEventsSlashCreate") => {
            let result = rt.block_on(client.advertiser_defined_events_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AdvertiserDefinedEventsSlashDelete") => {
            let result = rt.block_on(client.advertiser_defined_events_slash_delete(
                  "ad_account_id_example".to_string(),
                  &Vec::new()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdvertiserDefinedEventsSlashGet") => {
            let result = rt.block_on(client.advertiser_defined_events_slash_get(
                  "ad_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("AdvertiserDefinedEventsSlashUpdate") => {
            let result = rt.block_on(client.advertiser_defined_events_slash_update(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CustomerListUploadsSlashCreate") => {
            let result = rt.block_on(client.customer_list_uploads_slash_create(
                  "ad_account_id_example".to_string(),
                  "customer_list_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("CustomerListUploadsSlashGet") => {
            let result = rt.block_on(client.customer_list_uploads_slash_get(
                  "ad_account_id_example".to_string(),
                  "customer_list_id_example".to_string(),
                  "customer_list_upload_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CustomerListUploadsSlashRun") => {
            let result = rt.block_on(client.customer_list_uploads_slash_run(
                  "ad_account_id_example".to_string(),
                  "customer_list_id_example".to_string(),
                  "customer_list_upload_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CustomerListsSlashCreate") => {
            let result = rt.block_on(client.customer_lists_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("CustomerListsSlashList") => {
            let result = rt.block_on(client.customer_lists_slash_list(
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(models::PinterestLibPaginationOrder::Ascending),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CustomerListsSlashGet") => {
            let result = rt.block_on(client.customer_lists_slash_get(
                  "ad_account_id_example".to_string(),
                  "customer_list_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CustomerListsSlashUpdate") => {
            let result = rt.block_on(client.customer_lists_slash_update(
                  "ad_account_id_example".to_string(),
                  "customer_list_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CustomerSegmentSlashCreate") => {
            let result = rt.block_on(client.customer_segment_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("CustomerSegmentSlashList") => {
            let result = rt.block_on(client.customer_segment_slash_list(
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(models::PinterestLibPaginationOrder::Ascending),
                  Some(true),
                  Some("search_query_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CustomerSegmentSlashUpdate") => {
            let result = rt.block_on(client.customer_segment_slash_update(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("IntegrationsCommerceSlashPost") => {
            let result = rt.block_on(client.integrations_commerce_slash_post(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("IntegrationsLogsSlashPost") => {
            let result = rt.block_on(client.integrations_logs_slash_post(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("IntegrationsSlashGetList") => {
            let result = rt.block_on(client.integrations_slash_get_list(
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("IntegrationsCommerceSlashDel") => {
            let result = rt.block_on(client.integrations_commerce_slash_del(
                  "external_business_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("IntegrationsCommerceSlashGet") => {
            let result = rt.block_on(client.integrations_commerce_slash_get(
                  "external_business_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("IntegrationsCommerceSlashPatch") => {
            let result = rt.block_on(client.integrations_commerce_slash_patch(
                  "external_business_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("IntegrationsSlashGetById") => {
            let result = rt.block_on(client.integrations_slash_get_by_id(
                  "id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CountryKeywordsMetricsSlashGet") => {
            let result = rt.block_on(client.country_keywords_metrics_slash_get(
                  "ad_account_id_example".to_string(),
                  "country_code_example".to_string(),
                  &Vec::new()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("KeywordsSlashCreate") => {
            let result = rt.block_on(client.keywords_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("KeywordsSlashGet") => {
            let result = rt.block_on(client.keywords_slash_get(
                  "ad_account_id_example".to_string(),
                  Some("campaign_id_example".to_string()),
                  Some("ad_group_id_example".to_string()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("KeywordsSlashUpdate") => {
            let result = rt.block_on(client.keywords_slash_update(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("TrendingKeywordsSlashList") => {
            let result = rt.block_on(client.trending_keywords_slash_list(
                  models::TrendsSupportedRegion::Us,
                  models::TrendType::Growing,
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(true),
                  Some(56),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("LabelsSlashCreate") => {
            let result = rt.block_on(client.labels_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("LabelsSlashList") => {
            let result = rt.block_on(client.labels_slash_list(
                  "ad_account_id_example".to_string(),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("LabelsSlashUpdate") => {
            let result = rt.block_on(client.labels_slash_update(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("LabelsSlashApply") => {
            let result = rt.block_on(client.labels_slash_apply(
                  "ad_account_id_example".to_string(),
                  "label_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("LabelsSlashRemove") => {
            let result = rt.block_on(client.labels_slash_remove(
                  "ad_account_id_example".to_string(),
                  "label_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AdAccountsSubscriptionsSlashGetList") => {
            let result = rt.block_on(client.ad_accounts_subscriptions_slash_get_list(
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("AdAccountsSubscriptionsSlashPost") => {
            let result = rt.block_on(client.ad_accounts_subscriptions_slash_post(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AdAccountsSubscriptionsSlashDelById") => {
            let result = rt.block_on(client.ad_accounts_subscriptions_slash_del_by_id(
                  "ad_account_id_example".to_string(),
                  "subscription_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdAccountsSubscriptionsSlashGetById") => {
            let result = rt.block_on(client.ad_accounts_subscriptions_slash_get_by_id(
                  "ad_account_id_example".to_string(),
                  "subscription_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("LeadFormsSlashCreate") => {
            let result = rt.block_on(client.lead_forms_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("LeadFormsSlashList") => {
            let result = rt.block_on(client.lead_forms_slash_list(
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(models::PinterestLibPaginationOrder::Ascending)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("LeadFormsSlashUpdate") => {
            let result = rt.block_on(client.lead_forms_slash_update(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("LeadFormSlashGet") => {
            let result = rt.block_on(client.lead_form_slash_get(
                  "lead_form_id_example".to_string(),
                  "ad_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("LeadFormTestSlashCreate") => {
            let result = rt.block_on(client.lead_form_test_slash_create(
                  "ad_account_id_example".to_string(),
                  "lead_form_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("LeadsExportSlashCreate") => {
            let result = rt.block_on(client.leads_export_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("LeadsExportSlashGet") => {
            let result = rt.block_on(client.leads_export_slash_get(
                  "ad_account_id_example".to_string(),
                  "leads_export_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("MediaSlashCreate") => {
            let result = rt.block_on(client.media_slash_create(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("MediaSlashList") => {
            let result = rt.block_on(client.media_slash_list(
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MediaSlashGet") => {
            let result = rt.block_on(client.media_slash_get(
                  "media_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("MsotEventsSlashCreate") => {
            let result = rt.block_on(client.msot_events_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("NotificationSlashPost") => {
            let result = rt.block_on(client.notification_slash_post(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("OauthSlashConversionToken") => {
            let result = rt.block_on(client.oauth_slash_conversion_token(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("OauthSlashToken") => {
            let result = rt.block_on(client.oauth_slash_token(
                  models::TokenGrantType::AuthorizationCode,
                  Some("code_example".to_string()),
                  Some("continuous_refresh_example".to_string()),
                  Some("redirect_uri_example".to_string()),
                  Some("refresh_token_example".to_string()),
                  Some("scope_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("TokenSlashRevoke") => {
            let result = rt.block_on(client.token_slash_revoke(
                  "token_example".to_string(),
                  Some(models::TokenTypeHint::AccessToken)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("OrderLinesSlashList") => {
            let result = rt.block_on(client.order_lines_slash_list(
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(models::PinterestLibPaginationOrder::Ascending)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("OrderLinesSlashGet") => {
            let result = rt.block_on(client.order_lines_slash_get(
                  "order_line_id_example".to_string(),
                  "ad_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MultiPinsSlashAnalytics") => {
            let result = rt.block_on(client.multi_pins_slash_analytics(
                  &Vec::new(),
                  2013-10-20,
                  2013-10-20,
                  &Vec::new(),
                  Some(models::MultiPinsAnalyticsAppTypesParameter::All),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("PinsSlashCreate") => {
            let result = rt.block_on(client.pins_slash_create(
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("PinsSlashList") => {
            let result = rt.block_on(client.pins_slash_list(
                  Some(models::PinFilter::ExcludeNative),
                  Some(true),
                  Some(true),
                  Some(models::PinType::Private),
                  Some(&Vec::new()),
                  Some("ad_account_id_example".to_string()),
                  Some("domain_example".to_string()),
                  Some(&Vec::new()),
                  Some(true),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PinsSlashAnalytics") => {
            let result = rt.block_on(client.pins_slash_analytics(
                  "pin_id_example".to_string(),
                  2013-10-20,
                  2013-10-20,
                  &Vec::new(),
                  Some(models::MultiPinsAnalyticsAppTypesParameter::All),
                  Some(models::PinsAnalyticsSplitFieldParameter::NoSplit),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PinsSlashDelete") => {
            let result = rt.block_on(client.pins_slash_delete(
                  "pin_id_example".to_string(),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PinsSlashGet") => {
            let result = rt.block_on(client.pins_slash_get(
                  "pin_id_example".to_string(),
                  Some("ad_account_id_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("PinsSlashSave") => {
            let result = rt.block_on(client.pins_slash_save(
                  "pin_id_example".to_string(),
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("PinsSlashUpdate") => {
            let result = rt.block_on(client.pins_slash_update(
                  "pin_id_example".to_string(),
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("ProductGroupPromotionsSlashCreate") => {
            let result = rt.block_on(client.product_group_promotions_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ProductGroupPromotionsSlashList") => {
            let result = rt.block_on(client.product_group_promotions_slash_list(
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(models::PinterestLibPaginationOrder::Ascending),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some("ad_group_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("ProductGroupPromotionsSlashUpdate") => {
            let result = rt.block_on(client.product_group_promotions_slash_update(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ProductGroupsSlashAnalytics") => {
            let result = rt.block_on(client.product_groups_slash_analytics(
                  2013-10-20,
                  2013-10-20,
                  &Vec::new(),
                  &Vec::new(),
                  models::Granularity::Total,
                  "ad_account_id_example".to_string(),
                  Some(models::AdGroupsAnalyticsClickWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsClickWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsViewWindowDaysParameter::Variant0),
                  Some(models::AdGroupsAnalyticsConversionReportTimeParameter::TimeOfAdAction),
                  Some(models::ReportingTimeZone::PinterestTimeZone)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ProductGroupPromotionsSlashGet") => {
            let result = rt.block_on(client.product_group_promotions_slash_get(
                  "ad_account_id_example".to_string(),
                  "product_group_promotion_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("ProductTagsSlashBulkAdd") => {
            let result = rt.block_on(client.product_tags_slash_bulk_add(
                  "pin_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("ProductTagsSlashBulkDelete") => {
            let result = rt.block_on(client.product_tags_slash_bulk_delete(
                  "pin_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ProductTagsSlashList") => {
            let result = rt.block_on(client.product_tags_slash_list(
                  "pin_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("PromotionsSlashCreate") => {
            let result = rt.block_on(client.promotions_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("PromotionsSlashList") => {
            let result = rt.block_on(client.promotions_slash_list(
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(models::PinterestLibPaginationOrder::Ascending)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("PromotionsSlashUpdate") => {
            let result = rt.block_on(client.promotions_slash_update(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("PromotionsSlashDelete") => {
            let result = rt.block_on(client.promotions_slash_delete(
                  "promotion_id_example".to_string(),
                  "ad_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PromotionsSlashGet") => {
            let result = rt.block_on(client.promotions_slash_get(
                  "promotion_id_example".to_string(),
                  "ad_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdAccountCountriesSlashGet") => {
            let result = rt.block_on(client.ad_account_countries_slash_get(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("DeliveryMetricsSlashGet") => {
            let result = rt.block_on(client.delivery_metrics_slash_get(
                  Some(models::ReportType::Sync)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("LeadFormQuestionsSlashGet") => {
            let result = rt.block_on(client.lead_form_questions_slash_get(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MetricsReadyStateSlashGet") => {
            let result = rt.block_on(client.metrics_ready_state_slash_get(
                  "date_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("InterestTargetingOptionsSlashGet") => {
            let result = rt.block_on(client.interest_targeting_options_slash_get(
                  "interest_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("TargetingOptionsSlashGet") => {
            let result = rt.block_on(client.targeting_options_slash_get(
                  models::PublicTargetingType::Apptype,
                  Some("ad_account_id_example".to_string()),
                  Some("client_id_example".to_string()),
                  Some("oauth_signature_example".to_string()),
                  Some("timestamp_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SchedulesSlashCreate") => {
            let result = rt.block_on(client.schedules_slash_create(
                  "ad_account_id_example".to_string(),
                  &Vec::new()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SchedulesSlashList") => {
            let result = rt.block_on(client.schedules_slash_list(
                  "ad_account_id_example".to_string(),
                  &Vec::new(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(models::PinterestLibPaginationOrder::Ascending),
                  Some(&Vec::new()),
                  Some(models::ScheduleType::CampaignBudgetChange)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SchedulesSlashUpdate") => {
            let result = rt.block_on(client.schedules_slash_update(
                  "ad_account_id_example".to_string(),
                  &Vec::new()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchPartnerPins") => {
            let result = rt.block_on(client.search_partner_pins(
                  "term_example".to_string(),
                  "country_code_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some("locale_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchUserBoardsSlashGet") => {
            let result = rt.block_on(client.search_user_boards_slash_get(
                  Some("ad_account_id_example".to_string()),
                  Some("query_example".to_string()),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchUserPinsSlashList") => {
            let result = rt.block_on(client.search_user_pins_slash_list(
                  "query_example".to_string(),
                  Some("ad_account_id_example".to_string()),
                  Some("bookmark_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("TargetingTemplateSlashCreate") => {
            let result = rt.block_on(client.targeting_template_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("TargetingTemplateSlashList") => {
            let result = rt.block_on(client.targeting_template_slash_list(
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(models::PinterestLibPaginationOrder::Ascending),
                  Some(true),
                  Some("search_query_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("TargetingTemplateSlashUpdate") => {
            let result = rt.block_on(client.targeting_template_slash_update(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("TermsRelatedSlashList") => {
            let result = rt.block_on(client.terms_related_slash_list(
                  &Vec::new()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("TermsSuggestedSlashList") => {
            let result = rt.block_on(client.terms_suggested_slash_list(
                  "term_example".to_string(),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("TermsOfServiceSlashGet") => {
            let result = rt.block_on(client.terms_of_service_slash_get(
                  "ad_account_id_example".to_string(),
                  Some(true),
                  Some("tos_type_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("TrendsEditorialArticlesSlashList") => {
            let result = rt.block_on(client.trends_editorial_articles_slash_list(
                  models::ProductCategoryRegion::Us
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("TrendsFeaturedTopicsSlashList") => {
            let result = rt.block_on(client.trends_featured_topics_slash_list(
                  models::ProductCategoryRegion::Us,
                  Some(models::InterestsEnum::All)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("TrendsProductCategoriesDetailsSlashList") => {
            let result = rt.block_on(client.trends_product_categories_details_slash_list(
                  &Vec::new(),
                  models::ProductCategoryRegion::Us,
                  Some(models::ProductCategoryDetailLookbackWindow::Variant90),
                  Some(models::ProductCategoriesEngagementType::Engagement)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("TrendsProductCategoriesTrendingSlashList") => {
            let result = rt.block_on(client.trends_product_categories_trending_slash_list(
                  models::ProductCategoryRegion::Us,
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(models::ProductCategoriesEngagementType::Engagement)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BoardsUserFollowsSlashList") => {
            let result = rt.block_on(client.boards_user_follows_slash_list(
                  Some("ad_account_id_example".to_string()),
                  Some(true),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("FollowersSlashList") => {
            let result = rt.block_on(client.followers_slash_list(
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("LinkedBusinessAccountsSlashGet") => {
            let result = rt.block_on(client.linked_business_accounts_slash_get(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UnverifyWebsiteSlashDelete") => {
            let result = rt.block_on(client.unverify_website_slash_delete(
                  "website_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UserAccountSlashAnalytics") => {
            let result = rt.block_on(client.user_account_slash_analytics(
                  2013-10-20,
                  2013-10-20,
                  Some(models::UserAccountAnalyticsFromClaimedContentParameter::Other),
                  Some(models::UserAccountAnalyticsPinFormatParameter::All),
                  Some(models::MultiPinsAnalyticsAppTypesParameter::All),
                  Some(models::UserAccountAnalyticsContentTypeParameter::All),
                  Some(models::UserAccountAnalyticsSourceParameter::All),
                  Some(&Vec::new()),
                  Some(models::UserAccountAnalyticsSplitFieldParameter::NoSplit),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UserAccountSlashAnalyticsSlashTopPins") => {
            let result = rt.block_on(client.user_account_slash_analytics_slash_top_pins(
                  2013-10-20,
                  2013-10-20,
                  models::TopPinsSortBy::Engagement,
                  Some(models::UserAccountAnalyticsFromClaimedContentParameter::Other),
                  Some(models::UserAccountAnalyticsPinFormatParameter::All),
                  Some(models::MultiPinsAnalyticsAppTypesParameter::All),
                  Some(models::UserAccountAnalyticsContentTypeParameter::All),
                  Some(models::UserAccountAnalyticsSourceParameter::All),
                  Some(&Vec::new()),
                  Some(56),
                  Some(models::UserAccountAnalyticsTopPinsCreatedInLastNDaysParameter::Variant30),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UserAccountSlashAnalyticsSlashTopVideoPins") => {
            let result = rt.block_on(client.user_account_slash_analytics_slash_top_video_pins(
                  2013-10-20,
                  2013-10-20,
                  models::TopVideoPinsSortBy::Save,
                  Some(models::UserAccountAnalyticsFromClaimedContentParameter::Other),
                  Some(models::UserAccountAnalyticsPinFormatParameter::All),
                  Some(models::MultiPinsAnalyticsAppTypesParameter::All),
                  Some(models::UserAccountAnalyticsContentTypeParameter::All),
                  Some(models::UserAccountAnalyticsSourceParameter::All),
                  Some(&Vec::new()),
                  Some(56),
                  Some(models::UserAccountAnalyticsTopPinsCreatedInLastNDaysParameter::Variant30),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UserAccountSlashGet") => {
            let result = rt.block_on(client.user_account_slash_get(
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UserFollowingSlashGet") => {
            let result = rt.block_on(client.user_following_slash_get(
                  Some("ad_account_id_example".to_string()),
                  Some(true),
                  Some(models::UserFollowingFeedType::All),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UserWebsitesSlashGet") => {
            let result = rt.block_on(client.user_websites_slash_get(
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("VerifyWebsiteSlashUpdate") => {
            let result = rt.block_on(client.verify_website_slash_update(
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("WebsiteVerificationSlashGet") => {
            let result = rt.block_on(client.website_verification_slash_get(
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("FollowUserSlashUpdate") => {
            let result = rt.block_on(client.follow_user_slash_update(
                  "username_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("UserAccountSlashFollowedInterests") => {
            let result = rt.block_on(client.user_account_slash_followed_interests(
                  "username_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        _ => {
            panic!("Invalid operation provided")
        }
    }
}
