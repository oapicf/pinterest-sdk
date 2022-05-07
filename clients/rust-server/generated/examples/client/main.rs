#![allow(missing_docs, unused_variables, trivial_casts)]


#[allow(unused_imports)]
use futures::{future, Stream, stream};
#[allow(unused_imports)]
use openapi_client::{Api, ApiNoContext, Client, ContextWrapperExt, models,
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
                      UserAccountGetResponse,
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
                "AdAccountAnalytics",
                "AdAccountsList",
                "AdGroupsAnalytics",
                "AdGroupsList",
                "AdsAnalytics",
                "AdsList",
                "AnalyticsGetReport",
                "CampaignsAnalytics",
                "CampaignsList",
                "ProductGroupsAnalytics",
                "BoardSectionsDelete",
                "BoardSectionsList",
                "BoardSectionsListPins",
                "BoardsDelete",
                "BoardsGet",
                "BoardsList",
                "BoardsListPins",
                "CatalogsProductGroupsDelete",
                "CatalogsProductGroupsList",
                "FeedProcessingResultsList",
                "FeedsDelete",
                "FeedsGet",
                "FeedsList",
                "ItemsBatchGet",
                "ItemsGet",
                "MediaGet",
                "MediaList",
                "OauthToken",
                "PinsAnalytics",
                "PinsDelete",
                "PinsGet",
                "UserAccountAnalytics",
                "UserAccountGet",
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
        Some("AdAccountAnalytics") => {
            let result = rt.block_on(client.ad_account_analytics(
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
        Some("AdAccountsList") => {
            let result = rt.block_on(client.ad_accounts_list(
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some(true)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("AdGroupsAnalytics") => {
            let result = rt.block_on(client.ad_groups_analytics(
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
        Some("AdGroupsList") => {
            let result = rt.block_on(client.ad_groups_list(
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
        Some("AdsAnalytics") => {
            let result = rt.block_on(client.ads_analytics(
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
        Some("AdsList") => {
            let result = rt.block_on(client.ads_list(
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
        /* Disabled because there's no example.
        Some("AnalyticsCreateReport") => {
            let result = rt.block_on(client.analytics_create_report(
                  "ad_account_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("AnalyticsGetReport") => {
            let result = rt.block_on(client.analytics_get_report(
                  "ad_account_id_example".to_string(),
                  "token_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CampaignsAnalytics") => {
            let result = rt.block_on(client.campaigns_analytics(
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
        Some("CampaignsList") => {
            let result = rt.block_on(client.campaigns_list(
                  "ad_account_id_example".to_string(),
                  Some(&Vec::new()),
                  Some(&Vec::new()),
                  Some(56),
                  Some("ASCENDING".to_string()),
                  Some("bookmark_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("ProductGroupsAnalytics") => {
            let result = rt.block_on(client.product_groups_analytics(
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
        /* Disabled because there's no example.
        Some("BoardSectionsCreate") => {
            let result = rt.block_on(client.board_sections_create(
                  "board_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("BoardSectionsDelete") => {
            let result = rt.block_on(client.board_sections_delete(
                  "board_id_example".to_string(),
                  "section_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BoardSectionsList") => {
            let result = rt.block_on(client.board_sections_list(
                  "board_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BoardSectionsListPins") => {
            let result = rt.block_on(client.board_sections_list_pins(
                  "board_id_example".to_string(),
                  "section_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("BoardSectionsUpdate") => {
            let result = rt.block_on(client.board_sections_update(
                  "board_id_example".to_string(),
                  "section_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("BoardsCreate") => {
            let result = rt.block_on(client.boards_create(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("BoardsDelete") => {
            let result = rt.block_on(client.boards_delete(
                  "board_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BoardsGet") => {
            let result = rt.block_on(client.boards_get(
                  "board_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BoardsList") => {
            let result = rt.block_on(client.boards_list(
                  Some("bookmark_example".to_string()),
                  Some(56),
                  Some("privacy_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("BoardsListPins") => {
            let result = rt.block_on(client.boards_list_pins(
                  "board_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("BoardsUpdate") => {
            let result = rt.block_on(client.boards_update(
                  "board_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        /* Disabled because there's no example.
        Some("CatalogsProductGroupsCreate") => {
            let result = rt.block_on(client.catalogs_product_groups_create(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("CatalogsProductGroupsDelete") => {
            let result = rt.block_on(client.catalogs_product_groups_delete(
                  "product_group_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("CatalogsProductGroupsList") => {
            let result = rt.block_on(client.catalogs_product_groups_list(
                  "feed_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("CatalogsProductGroupsUpdate") => {
            let result = rt.block_on(client.catalogs_product_groups_update(
                  "product_group_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("FeedProcessingResultsList") => {
            let result = rt.block_on(client.feed_processing_results_list(
                  "feed_id_example".to_string(),
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("FeedsCreate") => {
            let result = rt.block_on(client.feeds_create(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("FeedsDelete") => {
            let result = rt.block_on(client.feeds_delete(
                  "feed_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("FeedsGet") => {
            let result = rt.block_on(client.feeds_get(
                  "feed_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("FeedsList") => {
            let result = rt.block_on(client.feeds_list(
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("FeedsUpdate") => {
            let result = rt.block_on(client.feeds_update(
                  "feed_id_example".to_string(),
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ItemsBatchGet") => {
            let result = rt.block_on(client.items_batch_get(
                  "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("ItemsBatchPost") => {
            let result = rt.block_on(client.items_batch_post(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("ItemsGet") => {
            let result = rt.block_on(client.items_get(
                  "US".to_string(),
                  CR123,
                  "EN".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        /* Disabled because there's no example.
        Some("MediaCreate") => {
            let result = rt.block_on(client.media_create(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("MediaGet") => {
            let result = rt.block_on(client.media_get(
                  "media_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("MediaList") => {
            let result = rt.block_on(client.media_list(
                  Some("bookmark_example".to_string()),
                  Some(56)
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("OauthToken") => {
            let result = rt.block_on(client.oauth_token(
                  "grant_type_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PinsAnalytics") => {
            let result = rt.block_on(client.pins_analytics(
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
        Some("PinsCreate") => {
            let result = rt.block_on(client.pins_create(
                  ???
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        */
        Some("PinsDelete") => {
            let result = rt.block_on(client.pins_delete(
                  "pin_id_example".to_string()
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("PinsGet") => {
            let result = rt.block_on(client.pins_get(
                  "pin_id_example".to_string(),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UserAccountAnalytics") => {
            let result = rt.block_on(client.user_account_analytics(
                  2013-10-20,
                  2013-10-20,
                  Some("from_claimed_content_example".to_string()),
                  Some("pin_format_example".to_string()),
                  Some("app_types_example".to_string()),
                  Some(&Vec::new()),
                  Some("split_field_example".to_string()),
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        Some("UserAccountGet") => {
            let result = rt.block_on(client.user_account_get(
                  Some("ad_account_id_example".to_string())
            ));
            info!("{:?} (X-Span-ID: {:?})", result, (client.context() as &dyn Has<XSpanIdString>).get().clone());
        },
        _ => {
            panic!("Invalid operation provided")
        }
    }
}
