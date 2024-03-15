#![allow(missing_docs, unused_variables, trivial_casts)]


#[allow(unused_imports)]
use futures::{future, Stream, stream};
#[allow(unused_imports)]
use openapi_client::{Api, ApiNoContext, Client, ContextWrapperExt, models,
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
use clap::{App, Arg};

#[allow(unused_imports)]
use log::info;

// swagger::Has may be unused if there are no examples
#[allow(unused_imports)]
use swagger::{AuthData, ContextBuilder, EmptyContext, Has, Push, XSpanIdString};

type ClientContext = swagger::make_context_ty!(ContextBuilder, EmptyContext, Option<AuthData>, XSpanIdString);

// rt may be unused if there are no examples
#[allow(unused_mut)]
fn main() {
    env_logger::init();

    let matches = App::new("client")
        .arg(Arg::with_name("operation")
            .help("Sets the operation to run")
            .possible_values(&[
                "AdAccountSlashAnalytics",
                "AdAccountTargetingAnalyticsSlashGet",
                "AdAccountsSlashGet",
                "AdAccountsSlashList",
                "AnalyticsSlashCreateTemplateReport",
                "AnalyticsSlashGetMmmReport",
                "AnalyticsSlashGetReport",
                "SandboxSlashDelete",
                "TemplatesSlashList",
                "AdGroupsSlashAnalytics",
                "AdGroupsSlashAudienceSizing",
                "AdGroupsSlashCreate",
                "AdGroupsSlashGet",
                "AdGroupsSlashList",
                "AdGroupsSlashUpdate",
                "AdGroupsTargetingAnalyticsSlashGet",
                "AdTargetingAnalyticsSlashGet",
                "AdsSlashAnalytics",
                "AdsSlashCreate",
                "AdsSlashGet",
                "AdsSlashList",
                "AdsSlashUpdate",
                "AudienceInsightsScopeAndTypeSlashGet",
                "AudiencesSlashGet",
                "AudiencesSlashList",
                "AudiencesSlashUpdate",
                "AdsCreditsDiscountsSlashGet",
                "BillingProfilesSlashGet",
                "SsioAccountsSlashGet",
                "SsioInsertionOrdersStatusSlashGetByAdAccount",
                "SsioInsertionOrdersStatusSlashGetByPinOrderId",
                "SsioOrderLinesSlashGetByAdAccount",
                "BoardSectionsSlashDelete",
                "BoardSectionsSlashList",
                "BoardSectionsSlashListPins",
                "BoardsSlashDelete",
                "BoardsSlashGet",
                "BoardsSlashList",
                "BoardsSlashListPins",
                "BulkRequestSlashGet",
                "CampaignTargetingAnalyticsSlashGet",
                "CampaignsSlashAnalytics",
                "CampaignsSlashCreate",
                "CampaignsSlashGet",
                "CampaignsSlashList",
                "CampaignsSlashUpdate",
                "CatalogsProductGroupPinsSlashList",
                "CatalogsProductGroupsSlashCreate",
                "CatalogsProductGroupsSlashDelete",
                "CatalogsProductGroupsSlashGet",
                "CatalogsProductGroupsSlashList",
                "CatalogsProductGroupsSlashProductCountsGet",
                "CatalogsSlashList",
                "FeedProcessingResultsSlashList",
                "FeedsSlashDelete",
                "FeedsSlashGet",
                "FeedsSlashList",
                "ItemsBatchSlashGet",
                "ItemsIssuesSlashList",
                "ItemsSlashGet",
                "ConversionTagsSlashGet",
                "ConversionTagsSlashList",
                "OcpmEligibleConversionTagsSlashGet",
                "PageVisitConversionTagsSlashGet",
                "CustomerListsSlashGet",
                "CustomerListsSlashList",
                "IntegrationsCommerceSlashDel",
                "IntegrationsCommerceSlashGet",
                "IntegrationsCommerceSlashPatch",
                "IntegrationsCommerceSlashPost",
                "IntegrationsSlashGetById",
                "IntegrationsSlashGetList",
                "CountryKeywordsMetricsSlashGet",
                "KeywordsSlashGet",
                "AdAccountsSubscriptionsSlashDelById",
                "AdAccountsSubscriptionsSlashGetById",
                "AdAccountsSubscriptionsSlashGetList",
                "LeadFormSlashGet",
                "LeadFormsSlashList",
                "MediaSlashGet",
                "MediaSlashList",
                "OauthSlashToken",
                "OrderLinesSlashGet",
                "OrderLinesSlashList",
                "PinsSlashAnalytics",
                "PinsSlashDelete",
                "PinsSlashGet",
                "PinsSlashList",
                "ProductGroupPromotionsSlashGet",
                "ProductGroupPromotionsSlashList",
                "ProductGroupsSlashAnalytics",
                "AdAccountsCatalogsProductGroupsSlashList",
                "AdAccountCountriesSlashGet",
                "DeliveryMetricsSlashGet",
                "InterestTargetingOptionsSlashGet",
                "LeadFormQuestionsSlashGet",
                "MetricsReadyStateSlashGet",
                "TargetingOptionsSlashGet",
                "SearchPartnerPins",
                "SearchUserBoardsSlashGet",
                "SearchUserPinsSlashList",
                "TermsRelatedSlashList",
                "TermsSuggestedSlashList",
                "TermsOfServiceSlashGet",
                "BoardsUserFollowsSlashList",
                "FollowersSlashList",
                "LinkedBusinessAccountsSlashGet",
                "UnverifyWebsiteSlashDelete",
                "UserAccountSlashAnalytics",
                "UserAccountSlashAnalyticsSlashTopPins",
                "UserAccountSlashAnalyticsSlashTopVideoPins",
                "UserAccountSlashFollowedInterests",
                "UserAccountSlashGet",
                "UserFollowingSlashGet",
                "UserWebsitesSlashGet",
                "WebsiteVerificationSlashGet",
            ])
            .required(true)
            .index(1))
        .arg(Arg::with_name("https")
            .long("https")
            .help("Whether to use HTTPS or not"))
        .arg(Arg::with_name("host")
            .long("host")
            .takes_value(true)
            .default_value("api.pinterest.com")
            .help("Hostname to contact"))
        .arg(Arg::with_name("port")
            .long("port")
            .takes_value(true)
            .default_value("8080")
            .help("Port to contact"))
        .get_matches();

    let is_https = matches.is_present("https");
    let base_url = format!("{}://{}:{}",
                           if is_https { "https" } else { "http" },
                           matches.value_of("host").unwrap(),
                           matches.value_of("port").unwrap());

    let context: ClientContext =
        swagger::make_context!(ContextBuilder, EmptyContext, None as Option<AuthData>, XSpanIdString::default());

    let mut client : Box<dyn ApiNoContext<ClientContext>> = if matches.is_present("https") {
        // Using Simple HTTPS
        let client = Box::new(Client::try_new_https(&base_url)
            .expect("Failed to create HTTPS client"));
        Box::new(client.with_context(context))
    } else {
        // Using HTTP
        let client = Box::new(Client::try_new_http(
            &base_url)
            .expect("Failed to create HTTP client"));
        Box::new(client.with_context(context))
    };

    let mut rt = tokio::runtime::Runtime::new().unwrap();

    match matches.value_of("operation") {
        Some("AdAccountSlashAnalytics") => {
            let result = rt.block_on(client.ad_account_slash_analytics(
                  "ad_account_id_example".to_string(),
                  2013-10-20,
                  2013-10-20,
                  &Vec::new(),
                  serde_json::from_str::<models::Granularity>(r#"DAY"#).expect("Failed to parse JSON example"),
                  Some(1),
                  Some(56),
                  Some(56),
                  Some("TIME_OF_AD_ACTION".to_string())
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
                  serde_json::from_str::<models::Granularity>(r#"DAY"#).expect("Failed to parse JSON example"),
                  Some(1),
                  Some(56),
                  Some(56),
                  Some("TIME_OF_AD_ACTION".to_string()),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("AdAccountsSlashCreate") => {
            let result = rt.block_on(client.ad_accounts_slash_create(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AdAccountsSlashGet") => {
            let result = rt.block_on(client.ad_accounts_slash_get(
                  "ad_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdAccountsSlashList") => {
            let result = rt.block_on(client.ad_accounts_slash_list(
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
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
        Some("AnalyticsSlashCreateTemplateReport") => {
            let result = rt.block_on(client.analytics_slash_create_template_report(
                  "ad_account_id_example".to_string(),
                  "template_id_example".to_string(),
                  None,
                  None,
                  Some(serde_json::from_str::<models::Granularity>(r#"DAY"#).expect("Failed to parse JSON example"))
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
                  Some(56),
                  Some("ASCENDING".to_string()),
                  Some("bookmark_example".to_string())
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
                  "ad_account_id_example".to_string(),
                  2013-10-20,
                  2013-10-20,
                  &Vec::new(),
                  &Vec::new(),
                  serde_json::from_str::<models::Granularity>(r#"DAY"#).expect("Failed to parse JSON example"),
                  Some(1),
                  Some(56),
                  Some(56),
                  Some("TIME_OF_AD_ACTION".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdGroupsSlashAudienceSizing") => {
            let result = rt.block_on(client.ad_groups_slash_audience_sizing(
                  "ad_account_id_example".to_string(),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdGroupsSlashCreate") => {
            let result = rt.block_on(client.ad_groups_slash_create(
                  "ad_account_id_example".to_string(),
                  &Vec::new()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdGroupsSlashGet") => {
            let result = rt.block_on(client.ad_groups_slash_get(
                  "ad_account_id_example".to_string(),
                  "ad_group_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdGroupsSlashList") => {
            let result = rt.block_on(client.ad_groups_slash_list(
                  "ad_account_id_example".to_string(),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(56),
                  Some("ASCENDING".to_string()),
                  Some("bookmark_example".to_string()),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdGroupsSlashUpdate") => {
            let result = rt.block_on(client.ad_groups_slash_update(
                  "ad_account_id_example".to_string(),
                  &Vec::new()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdGroupsTargetingAnalyticsSlashGet") => {
            let result = rt.block_on(client.ad_groups_targeting_analytics_slash_get(
                  "ad_account_id_example".to_string(),
                  &Vec::new(),
                  2013-10-20,
                  2013-10-20,
                  &Vec::new(),
                  &Vec::new(),
                  serde_json::from_str::<models::Granularity>(r#"DAY"#).expect("Failed to parse JSON example"),
                  Some(1),
                  Some(56),
                  Some(56),
                  Some("TIME_OF_AD_ACTION".to_string()),
                  None
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
                  serde_json::from_str::<models::Granularity>(r#"DAY"#).expect("Failed to parse JSON example"),
                  Some(1),
                  Some(56),
                  Some(56),
                  Some("TIME_OF_AD_ACTION".to_string()),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdsSlashAnalytics") => {
            let result = rt.block_on(client.ads_slash_analytics(
                  "ad_account_id_example".to_string(),
                  2013-10-20,
                  2013-10-20,
                  &Vec::new(),
                  &Vec::new(),
                  serde_json::from_str::<models::Granularity>(r#"DAY"#).expect("Failed to parse JSON example"),
                  Some(1),
                  Some(56),
                  Some(56),
                  Some("TIME_OF_AD_ACTION".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdsSlashCreate") => {
            let result = rt.block_on(client.ads_slash_create(
                  "ad_account_id_example".to_string(),
                  &Vec::new()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdsSlashGet") => {
            let result = rt.block_on(client.ads_slash_get(
                  "ad_account_id_example".to_string(),
                  "ad_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdsSlashList") => {
            let result = rt.block_on(client.ads_slash_list(
                  "ad_account_id_example".to_string(),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(56),
                  Some("ASCENDING".to_string()),
                  Some("bookmark_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdsSlashUpdate") => {
            let result = rt.block_on(client.ads_slash_update(
                  "ad_account_id_example".to_string(),
                  &Vec::new()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AudienceInsightsScopeAndTypeSlashGet") => {
            let result = rt.block_on(client.audience_insights_scope_and_type_slash_get(
                  "ad_account_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("AudienceInsightsSlashGet") => {
            let result = rt.block_on(client.audience_insights_slash_get(
                  "ad_account_id_example".to_string(),
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
        /* Disabled because there's no example.
        Some("AudiencesSlashCreateCustom") => {
            let result = rt.block_on(client.audiences_slash_create_custom(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AudiencesSlashGet") => {
            let result = rt.block_on(client.audiences_slash_get(
                  "ad_account_id_example".to_string(),
                  "audience_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AudiencesSlashList") => {
            let result = rt.block_on(client.audiences_slash_list(
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some("ASCENDING".to_string()),
                  Some(56),
                  Some("OWNED".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AudiencesSlashUpdate") => {
            let result = rt.block_on(client.audiences_slash_update(
                  "ad_account_id_example".to_string(),
                  "audience_id_example".to_string(),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
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
        Some("BillingProfilesSlashGet") => {
            let result = rt.block_on(client.billing_profiles_slash_get(
                  "ad_account_id_example".to_string(),
                  true,
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
        Some("SsioInsertionOrdersStatusSlashGetByPinOrderId") => {
            let result = rt.block_on(client.ssio_insertion_orders_status_slash_get_by_pin_order_id(
                  "ad_account_id_example".to_string(),
                  "0Q01N0000015hekSVDFDC".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SsioOrderLinesSlashGetByAdAccount") => {
            let result = rt.block_on(client.ssio_order_lines_slash_get_by_ad_account(
                  "ad_account_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some("0Q01N0000015hekSVDFDC".to_string())
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
        Some("BoardSectionsSlashDelete") => {
            let result = rt.block_on(client.board_sections_slash_delete(
                  "board_id_example".to_string(),
                  "section_id_example".to_string(),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BoardSectionsSlashList") => {
            let result = rt.block_on(client.board_sections_slash_list(
                  "board_id_example".to_string(),
                  Some("ad_account_id_example".to_string()),
                  Some("bookmark_example".to_string()),
                  Some(56)
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
        Some("BoardsSlashCreate") => {
            let result = rt.block_on(client.boards_slash_create(
                  ???,
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
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
        Some("BoardsSlashList") => {
            let result = rt.block_on(client.boards_slash_list(
                  Some("ad_account_id_example".to_string()),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some("privacy_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BoardsSlashListPins") => {
            let result = rt.block_on(client.boards_slash_list_pins(
                  "board_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(&Vec::new()),
                  Some("ad_account_id_example".to_string()),
                  Some(true)
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
        /* Disabled because there's no example.
        Some("BulkDownloadSlashCreate") => {
            let result = rt.block_on(client.bulk_download_slash_create(
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
        Some("BulkUpsertSlashCreate") => {
            let result = rt.block_on(client.bulk_upsert_slash_create(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("CampaignTargetingAnalyticsSlashGet") => {
            let result = rt.block_on(client.campaign_targeting_analytics_slash_get(
                  "ad_account_id_example".to_string(),
                  &Vec::new(),
                  2013-10-20,
                  2013-10-20,
                  &Vec::new(),
                  &Vec::new(),
                  serde_json::from_str::<models::Granularity>(r#"DAY"#).expect("Failed to parse JSON example"),
                  Some(1),
                  Some(56),
                  Some(56),
                  Some("TIME_OF_AD_ACTION".to_string()),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CampaignsSlashAnalytics") => {
            let result = rt.block_on(client.campaigns_slash_analytics(
                  "ad_account_id_example".to_string(),
                  2013-10-20,
                  2013-10-20,
                  &Vec::new(),
                  &Vec::new(),
                  serde_json::from_str::<models::Granularity>(r#"DAY"#).expect("Failed to parse JSON example"),
                  Some(1),
                  Some(56),
                  Some(56),
                  Some("TIME_OF_AD_ACTION".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CampaignsSlashCreate") => {
            let result = rt.block_on(client.campaigns_slash_create(
                  "ad_account_id_example".to_string(),
                  &Vec::new()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CampaignsSlashGet") => {
            let result = rt.block_on(client.campaigns_slash_get(
                  "ad_account_id_example".to_string(),
                  "campaign_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CampaignsSlashList") => {
            let result = rt.block_on(client.campaigns_slash_list(
                  "ad_account_id_example".to_string(),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(56),
                  Some("ASCENDING".to_string()),
                  Some("bookmark_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CampaignsSlashUpdate") => {
            let result = rt.block_on(client.campaigns_slash_update(
                  "ad_account_id_example".to_string(),
                  &Vec::new()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CatalogsProductGroupPinsSlashList") => {
            let result = rt.block_on(client.catalogs_product_group_pins_slash_list(
                  "product_group_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CatalogsProductGroupsSlashCreate") => {
            let result = rt.block_on(client.catalogs_product_groups_slash_create(
                  serde_json::from_str::<models::CatalogsProductGroupsCreateRequest>(r#"{"name":"Few Filters using \"all_of\"","feed_id":"2680059592705","featured":false,"filters":{"all_of":[{"MIN_PRICE":{"values":999.99,"inclusion":true}},{"CURRENCY":{"values":"USD"}},{"CUSTOM_LABEL_0":{"values":["Luxury Items"]}}]}}"#).expect("Failed to parse JSON example"),
                  Some("ad_account_id_example".to_string())
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
        Some("CatalogsProductGroupsSlashList") => {
            let result = rt.block_on(client.catalogs_product_groups_slash_list(
                  Some("feed_id_example".to_string()),
                  Some("catalog_id_example".to_string()),
                  Some("bookmark_example".to_string()),
                  Some(56),
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
        Some("CatalogsSlashList") => {
            let result = rt.block_on(client.catalogs_slash_list(
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("FeedProcessingResultsSlashList") => {
            let result = rt.block_on(client.feed_processing_results_slash_list(
                  "feed_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some("ad_account_id_example".to_string())
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
        Some("FeedsSlashList") => {
            let result = rt.block_on(client.feeds_slash_list(
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some("catalog_id_example".to_string()),
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
        Some("ItemsBatchSlashGet") => {
            let result = rt.block_on(client.items_batch_slash_get(
                  "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e".to_string(),
                  Some("ad_account_id_example".to_string())
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
        Some("ItemsIssuesSlashList") => {
            let result = rt.block_on(client.items_issues_slash_list(
                  "5224831246441439241".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some([1,5]),
                  Some(serde_json::from_str::<models::CatalogsItemValidationIssue>(r#"TITLE_MISSING"#).expect("Failed to parse JSON example")),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ItemsSlashGet") => {
            let result = rt.block_on(client.items_slash_get(
                  "US".to_string(),
                  "EN".to_string(),
                  Some("ad_account_id_example".to_string()),
                  Some(["CR123"]),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("ProductsByProductGroupFilterSlashList") => {
            let result = rt.block_on(client.products_by_product_group_filter_slash_list(
                  ???,
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
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
        Some("ConversionTagsSlashGet") => {
            let result = rt.block_on(client.conversion_tags_slash_get(
                  "ad_account_id_example".to_string(),
                  "2617998078212".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
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
                  Some(56),
                  Some("ASCENDING".to_string()),
                  Some("bookmark_example".to_string())
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
        Some("CustomerListsSlashGet") => {
            let result = rt.block_on(client.customer_lists_slash_get(
                  "ad_account_id_example".to_string(),
                  "customer_list_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CustomerListsSlashList") => {
            let result = rt.block_on(client.customer_lists_slash_list(
                  "ad_account_id_example".to_string(),
                  Some(56),
                  Some("ASCENDING".to_string()),
                  Some("bookmark_example".to_string())
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
        Some("IntegrationsCommerceSlashPatch") => {
            let result = rt.block_on(client.integrations_commerce_slash_patch(
                  "external_business_id_example".to_string(),
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("IntegrationsCommerceSlashPost") => {
            let result = rt.block_on(client.integrations_commerce_slash_post(
                  None
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("IntegrationsLogsSlashPost") => {
            let result = rt.block_on(client.integrations_logs_slash_post(
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
        Some("IntegrationsSlashGetList") => {
            let result = rt.block_on(client.integrations_slash_get_list(
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CountryKeywordsMetricsSlashGet") => {
            let result = rt.block_on(client.country_keywords_metrics_slash_get(
                  "ad_account_id_example".to_string(),
                  "US".to_string(),
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
                  Some("123123123".to_string()),
                  Some(&Vec::new()),
                  Some(56),
                  Some("bookmark_example".to_string())
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
        /* Disabled because there's no example.
        Some("TrendingKeywordsSlashList") => {
            let result = rt.block_on(client.trending_keywords_slash_list(
                  ???,
                  ???,
                  Some(["beauty","womens_fashion"]),
                  Some(["female","unknown"]),
                  Some(["35-44","50-54"]),
                  Some(true),
                  Some(25)
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
        Some("AdAccountsSubscriptionsSlashGetList") => {
            let result = rt.block_on(client.ad_accounts_subscriptions_slash_get_list(
                  "ad_account_id_example".to_string(),
                  Some(56),
                  Some("bookmark_example".to_string())
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
        Some("LeadFormSlashGet") => {
            let result = rt.block_on(client.lead_form_slash_get(
                  "ad_account_id_example".to_string(),
                  "1234567890123".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("LeadFormTestSlashCreate") => {
            let result = rt.block_on(client.lead_form_test_slash_create(
                  "ad_account_id_example".to_string(),
                  "1234567890123".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("LeadFormsSlashList") => {
            let result = rt.block_on(client.lead_forms_slash_list(
                  "ad_account_id_example".to_string(),
                  Some(56),
                  Some("ASCENDING".to_string()),
                  Some("bookmark_example".to_string())
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
        Some("MediaSlashGet") => {
            let result = rt.block_on(client.media_slash_get(
                  "media_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MediaSlashList") => {
            let result = rt.block_on(client.media_slash_list(
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("OauthSlashToken") => {
            let result = rt.block_on(client.oauth_slash_token(
                  "grant_type_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("OrderLinesSlashGet") => {
            let result = rt.block_on(client.order_lines_slash_get(
                  "ad_account_id_example".to_string(),
                  "order_line_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("OrderLinesSlashList") => {
            let result = rt.block_on(client.order_lines_slash_list(
                  "ad_account_id_example".to_string(),
                  Some(56),
                  Some("ASCENDING".to_string()),
                  Some("bookmark_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PinsSlashAnalytics") => {
            let result = rt.block_on(client.pins_slash_analytics(
                  "pin_id_example".to_string(),
                  2013-10-20,
                  2013-10-20,
                  &Vec::new(),
                  Some("app_types_example".to_string()),
                  Some("split_field_example".to_string()),
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
                  Some(true),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PinsSlashList") => {
            let result = rt.block_on(client.pins_slash_list(
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some("pin_filter_example".to_string()),
                  Some(true),
                  Some("pin_type_example".to_string()),
                  Some(&Vec::new()),
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
        Some("ProductGroupPromotionsSlashGet") => {
            let result = rt.block_on(client.product_group_promotions_slash_get(
                  "ad_account_id_example".to_string(),
                  "product_group_promotion_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ProductGroupPromotionsSlashList") => {
            let result = rt.block_on(client.product_group_promotions_slash_list(
                  "ad_account_id_example".to_string(),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some("123123123".to_string()),
                  Some(56),
                  Some("ASCENDING".to_string()),
                  Some("bookmark_example".to_string())
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
                  "ad_account_id_example".to_string(),
                  2013-10-20,
                  2013-10-20,
                  &Vec::new(),
                  &Vec::new(),
                  serde_json::from_str::<models::Granularity>(r#"DAY"#).expect("Failed to parse JSON example"),
                  Some(1),
                  Some(56),
                  Some(56),
                  Some("TIME_OF_AD_ACTION".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdAccountsCatalogsProductGroupsSlashList") => {
            let result = rt.block_on(client.ad_accounts_catalogs_product_groups_slash_list(
                  "ad_account_id_example".to_string(),
                  Some("feed_profile_id_example".to_string())
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
                  Some("report_type_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("InterestTargetingOptionsSlashGet") => {
            let result = rt.block_on(client.interest_targeting_options_slash_get(
                  "interest_id_example".to_string()
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
                  "2022-07-13".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("TargetingOptionsSlashGet") => {
            let result = rt.block_on(client.targeting_options_slash_get(
                  "APPTYPE".to_string(),
                  Some("1094834".to_string()),
                  Some("8209f".to_string()),
                  Some("1618338184277".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchPartnerPins") => {
            let result = rt.block_on(client.search_partner_pins(
                  "term_example".to_string(),
                  "US".to_string(),
                  Some("bookmark_example".to_string()),
                  Some("locale_example".to_string()),
                  Some(4)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchUserBoardsSlashGet") => {
            let result = rt.block_on(client.search_user_boards_slash_get(
                  Some("ad_account_id_example".to_string()),
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some("query_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("SearchUserPinsSlashList") => {
            let result = rt.block_on(client.search_user_pins_slash_list(
                  "Plants".to_string(),
                  Some("ad_account_id_example".to_string()),
                  Some("bookmark_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("TermsRelatedSlashList") => {
            let result = rt.block_on(client.terms_related_slash_list(
                  &Vec::new()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("TermsSuggestedSlashList") => {
            let result = rt.block_on(client.terms_suggested_slash_list(
                  "sports".to_string(),
                  Some(4)
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
        Some("BoardsUserFollowsSlashList") => {
            let result = rt.block_on(client.boards_user_follows_slash_list(
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(true),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("FollowUserSlashUpdate") => {
            let result = rt.block_on(client.follow_user_slash_update(
                  "username".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
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
                  "mysite.test".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UserAccountSlashAnalytics") => {
            let result = rt.block_on(client.user_account_slash_analytics(
                  2013-10-20,
                  2013-10-20,
                  Some("from_claimed_content_example".to_string()),
                  Some("pin_format_example".to_string()),
                  Some("app_types_example".to_string()),
                  Some("content_type_example".to_string()),
                  Some("source_example".to_string()),
                  Some(&Vec::new()),
                  Some("split_field_example".to_string()),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UserAccountSlashAnalyticsSlashTopPins") => {
            let result = rt.block_on(client.user_account_slash_analytics_slash_top_pins(
                  2013-10-20,
                  2013-10-20,
                  "sort_by_example".to_string(),
                  Some("from_claimed_content_example".to_string()),
                  Some("pin_format_example".to_string()),
                  Some("app_types_example".to_string()),
                  Some("content_type_example".to_string()),
                  Some("source_example".to_string()),
                  Some(&Vec::new()),
                  Some(25),
                  Some(30),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UserAccountSlashAnalyticsSlashTopVideoPins") => {
            let result = rt.block_on(client.user_account_slash_analytics_slash_top_video_pins(
                  2013-10-20,
                  2013-10-20,
                  "sort_by_example".to_string(),
                  Some("from_claimed_content_example".to_string()),
                  Some("pin_format_example".to_string()),
                  Some("app_types_example".to_string()),
                  Some("content_type_example".to_string()),
                  Some("source_example".to_string()),
                  Some(&Vec::new()),
                  Some(25),
                  Some(30),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UserAccountSlashFollowedInterests") => {
            let result = rt.block_on(client.user_account_slash_followed_interests(
                  "username".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56)
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
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some("feed_type_example".to_string()),
                  Some(true),
                  Some("ad_account_id_example".to_string())
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
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("WebsiteVerificationSlashGet") => {
            let result = rt.block_on(client.website_verification_slash_get(
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        _ => {
            panic!("Invalid operation provided")
        }
    }
}
