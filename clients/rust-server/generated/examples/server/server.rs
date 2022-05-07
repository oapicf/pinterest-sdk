//! Main library entry point for openapi_client implementation.

#![allow(unused_imports)]

use async_trait::async_trait;
use futures::{future, Stream, StreamExt, TryFutureExt, TryStreamExt};
use hyper::server::conn::Http;
use hyper::service::Service;
use log::info;
#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
use openssl::ssl::SslAcceptorBuilder;
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
use openssl::ssl::{SslAcceptor, SslFiletype, SslMethod};

use openapi_client::models;

/// Builds an SSL implementation for Simple HTTPS from some hard-coded file names
pub async fn create(addr: &str, https: bool) {
    let addr = addr.parse().expect("Failed to parse bind address");

    let server = Server::new();

    let service = MakeService::new(server);

    let service = MakeAllowAllAuthenticator::new(service, "cosmo");

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

            let tls_acceptor = Arc::new(ssl.build());
            let mut tcp_listener = TcpListener::bind(&addr).await.unwrap();
            let mut incoming = tcp_listener.incoming();

            while let (Some(tcp), rest) = incoming.into_future().await {
                if let Ok(tcp) = tcp {
                    let addr = tcp.peer_addr().expect("Unable to get remote address");
                    let service = service.call(addr);
                    let tls_acceptor = Arc::clone(&tls_acceptor);

                    tokio::spawn(async move {
                        let tls = tokio_openssl::accept(&*tls_acceptor, tcp).await.map_err(|_| ())?;

                        let service = service.await.map_err(|_| ())?;

                        Http::new().serve_connection(tls, service).await.map_err(|_| ())
                    });
                }

                incoming = rest;
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
use openapi_client::server::MakeService;
use std::error::Error;
use swagger::ApiError;

#[async_trait]
impl<C> Api<C> for Server<C> where C: Has<XSpanIdString> + Send + Sync
{
    /// Get ad account analytics
    async fn ad_account_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        context: &C) -> Result<AdAccountAnalyticsResponse, ApiError>
    {
        let context = context.clone();
        info!("ad_account_analytics(\"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, start_date, end_date, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// List ad accounts
    async fn ad_accounts_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        include_shared_accounts: Option<bool>,
        context: &C) -> Result<AdAccountsListResponse, ApiError>
    {
        let context = context.clone();
        info!("ad_accounts_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", bookmark, page_size, include_shared_accounts, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Get ad group analytics
    async fn ad_groups_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        ad_group_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        context: &C) -> Result<AdGroupsAnalyticsResponse, ApiError>
    {
        let context = context.clone();
        info!("ad_groups_analytics(\"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, start_date, end_date, ad_group_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// List ad groups
    async fn ad_groups_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        ad_group_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        translate_interests_to_names: Option<bool>,
        context: &C) -> Result<AdGroupsListResponse, ApiError>
    {
        let context = context.clone();
        info!("ad_groups_list(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, campaign_ids, ad_group_ids, entity_statuses, page_size, order, bookmark, translate_interests_to_names, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Get ad analytics
    async fn ads_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        ad_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        context: &C) -> Result<AdsAnalyticsResponse, ApiError>
    {
        let context = context.clone();
        info!("ads_analytics(\"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, start_date, end_date, ad_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// List ads
    async fn ads_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        ad_group_ids: Option<&Vec<String>>,
        ad_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<AdsListResponse, ApiError>
    {
        let context = context.clone();
        info!("ads_list(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, campaign_ids, ad_group_ids, ad_ids, entity_statuses, page_size, order, bookmark, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Create async request for an account analytics report
    async fn analytics_create_report(
        &self,
        ad_account_id: String,
        ads_analytics_create_async_request: models::AdsAnalyticsCreateAsyncRequest,
        context: &C) -> Result<AnalyticsCreateReportResponse, ApiError>
    {
        let context = context.clone();
        info!("analytics_create_report(\"{}\", {:?}) - X-Span-ID: {:?}", ad_account_id, ads_analytics_create_async_request, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Get the account analytics report created by the async call
    async fn analytics_get_report(
        &self,
        ad_account_id: String,
        token: String,
        context: &C) -> Result<AnalyticsGetReportResponse, ApiError>
    {
        let context = context.clone();
        info!("analytics_get_report(\"{}\", \"{}\") - X-Span-ID: {:?}", ad_account_id, token, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Get campaign analytics
    async fn campaigns_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        campaign_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        context: &C) -> Result<CampaignsAnalyticsResponse, ApiError>
    {
        let context = context.clone();
        info!("campaigns_analytics(\"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, start_date, end_date, campaign_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// List campaigns
    async fn campaigns_list(
        &self,
        ad_account_id: String,
        campaign_ids: Option<&Vec<String>>,
        entity_statuses: Option<&Vec<String>>,
        page_size: Option<i32>,
        order: Option<String>,
        bookmark: Option<String>,
        context: &C) -> Result<CampaignsListResponse, ApiError>
    {
        let context = context.clone();
        info!("campaigns_list(\"{}\", {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, campaign_ids, entity_statuses, page_size, order, bookmark, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Get product group analytics
    async fn product_groups_analytics(
        &self,
        ad_account_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        product_group_ids: &Vec<String>,
        columns: &Vec<String>,
        granularity: models::Granularity,
        click_window_days: Option<i32>,
        engagement_window_days: Option<i32>,
        view_window_days: Option<i32>,
        conversion_report_time: Option<String>,
        context: &C) -> Result<ProductGroupsAnalyticsResponse, ApiError>
    {
        let context = context.clone();
        info!("product_groups_analytics(\"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", ad_account_id, start_date, end_date, product_group_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Create board section
    async fn board_sections_create(
        &self,
        board_id: String,
        board_section: models::BoardSection,
        context: &C) -> Result<BoardSectionsCreateResponse, ApiError>
    {
        let context = context.clone();
        info!("board_sections_create(\"{}\", {:?}) - X-Span-ID: {:?}", board_id, board_section, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Delete board section
    async fn board_sections_delete(
        &self,
        board_id: String,
        section_id: String,
        context: &C) -> Result<BoardSectionsDeleteResponse, ApiError>
    {
        let context = context.clone();
        info!("board_sections_delete(\"{}\", \"{}\") - X-Span-ID: {:?}", board_id, section_id, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// List board sections
    async fn board_sections_list(
        &self,
        board_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BoardSectionsListResponse, ApiError>
    {
        let context = context.clone();
        info!("board_sections_list(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", board_id, bookmark, page_size, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// List Pins on board section
    async fn board_sections_list_pins(
        &self,
        board_id: String,
        section_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BoardSectionsListPinsResponse, ApiError>
    {
        let context = context.clone();
        info!("board_sections_list_pins(\"{}\", \"{}\", {:?}, {:?}) - X-Span-ID: {:?}", board_id, section_id, bookmark, page_size, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Update board section
    async fn board_sections_update(
        &self,
        board_id: String,
        section_id: String,
        board_section: models::BoardSection,
        context: &C) -> Result<BoardSectionsUpdateResponse, ApiError>
    {
        let context = context.clone();
        info!("board_sections_update(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", board_id, section_id, board_section, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Create board
    async fn boards_create(
        &self,
        board: models::Board,
        context: &C) -> Result<BoardsCreateResponse, ApiError>
    {
        let context = context.clone();
        info!("boards_create({:?}) - X-Span-ID: {:?}", board, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Delete board
    async fn boards_delete(
        &self,
        board_id: String,
        context: &C) -> Result<BoardsDeleteResponse, ApiError>
    {
        let context = context.clone();
        info!("boards_delete(\"{}\") - X-Span-ID: {:?}", board_id, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Get board
    async fn boards_get(
        &self,
        board_id: String,
        context: &C) -> Result<BoardsGetResponse, ApiError>
    {
        let context = context.clone();
        info!("boards_get(\"{}\") - X-Span-ID: {:?}", board_id, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// List boards
    async fn boards_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        privacy: Option<String>,
        context: &C) -> Result<BoardsListResponse, ApiError>
    {
        let context = context.clone();
        info!("boards_list({:?}, {:?}, {:?}) - X-Span-ID: {:?}", bookmark, page_size, privacy, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// List Pins on board
    async fn boards_list_pins(
        &self,
        board_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<BoardsListPinsResponse, ApiError>
    {
        let context = context.clone();
        info!("boards_list_pins(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", board_id, bookmark, page_size, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Update board
    async fn boards_update(
        &self,
        board_id: String,
        board_update: models::BoardUpdate,
        context: &C) -> Result<BoardsUpdateResponse, ApiError>
    {
        let context = context.clone();
        info!("boards_update(\"{}\", {:?}) - X-Span-ID: {:?}", board_id, board_update, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Create product group
    async fn catalogs_product_groups_create(
        &self,
        catalogs_product_group_create_request: models::CatalogsProductGroupCreateRequest,
        context: &C) -> Result<CatalogsProductGroupsCreateResponse, ApiError>
    {
        let context = context.clone();
        info!("catalogs_product_groups_create({:?}) - X-Span-ID: {:?}", catalogs_product_group_create_request, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Delete product group
    async fn catalogs_product_groups_delete(
        &self,
        product_group_id: String,
        context: &C) -> Result<CatalogsProductGroupsDeleteResponse, ApiError>
    {
        let context = context.clone();
        info!("catalogs_product_groups_delete(\"{}\") - X-Span-ID: {:?}", product_group_id, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Get product groups list
    async fn catalogs_product_groups_list(
        &self,
        feed_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<CatalogsProductGroupsListResponse, ApiError>
    {
        let context = context.clone();
        info!("catalogs_product_groups_list(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", feed_id, bookmark, page_size, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Update product group
    async fn catalogs_product_groups_update(
        &self,
        product_group_id: String,
        catalogs_product_group_update_request: models::CatalogsProductGroupUpdateRequest,
        context: &C) -> Result<CatalogsProductGroupsUpdateResponse, ApiError>
    {
        let context = context.clone();
        info!("catalogs_product_groups_update(\"{}\", {:?}) - X-Span-ID: {:?}", product_group_id, catalogs_product_group_update_request, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// List processing results for a given feed
    async fn feed_processing_results_list(
        &self,
        feed_id: String,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<FeedProcessingResultsListResponse, ApiError>
    {
        let context = context.clone();
        info!("feed_processing_results_list(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", feed_id, bookmark, page_size, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Create feed
    async fn feeds_create(
        &self,
        catalogs_feeds_create_request: models::CatalogsFeedsCreateRequest,
        context: &C) -> Result<FeedsCreateResponse, ApiError>
    {
        let context = context.clone();
        info!("feeds_create({:?}) - X-Span-ID: {:?}", catalogs_feeds_create_request, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Delete feed
    async fn feeds_delete(
        &self,
        feed_id: String,
        context: &C) -> Result<FeedsDeleteResponse, ApiError>
    {
        let context = context.clone();
        info!("feeds_delete(\"{}\") - X-Span-ID: {:?}", feed_id, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Get feed
    async fn feeds_get(
        &self,
        feed_id: String,
        context: &C) -> Result<FeedsGetResponse, ApiError>
    {
        let context = context.clone();
        info!("feeds_get(\"{}\") - X-Span-ID: {:?}", feed_id, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// List feeds
    async fn feeds_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<FeedsListResponse, ApiError>
    {
        let context = context.clone();
        info!("feeds_list({:?}, {:?}) - X-Span-ID: {:?}", bookmark, page_size, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Update feed
    async fn feeds_update(
        &self,
        feed_id: String,
        catalogs_feeds_update_request: models::CatalogsFeedsUpdateRequest,
        context: &C) -> Result<FeedsUpdateResponse, ApiError>
    {
        let context = context.clone();
        info!("feeds_update(\"{}\", {:?}) - X-Span-ID: {:?}", feed_id, catalogs_feeds_update_request, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Get catalogs items batch
    async fn items_batch_get(
        &self,
        batch_id: String,
        context: &C) -> Result<ItemsBatchGetResponse, ApiError>
    {
        let context = context.clone();
        info!("items_batch_get(\"{}\") - X-Span-ID: {:?}", batch_id, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Perform an operation on an item batch
    async fn items_batch_post(
        &self,
        catalogs_items_batch_request: models::CatalogsItemsBatchRequest,
        context: &C) -> Result<ItemsBatchPostResponse, ApiError>
    {
        let context = context.clone();
        info!("items_batch_post({:?}) - X-Span-ID: {:?}", catalogs_items_batch_request, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Get catalogs items
    async fn items_get(
        &self,
        country: String,
        item_ids: &Vec<String>,
        language: String,
        context: &C) -> Result<ItemsGetResponse, ApiError>
    {
        let context = context.clone();
        info!("items_get(\"{}\", {:?}, \"{}\") - X-Span-ID: {:?}", country, item_ids, language, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Register media upload
    async fn media_create(
        &self,
        media_upload_request: models::MediaUploadRequest,
        context: &C) -> Result<MediaCreateResponse, ApiError>
    {
        let context = context.clone();
        info!("media_create({:?}) - X-Span-ID: {:?}", media_upload_request, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Get media upload details
    async fn media_get(
        &self,
        media_id: String,
        context: &C) -> Result<MediaGetResponse, ApiError>
    {
        let context = context.clone();
        info!("media_get(\"{}\") - X-Span-ID: {:?}", media_id, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// List media uploads
    async fn media_list(
        &self,
        bookmark: Option<String>,
        page_size: Option<i32>,
        context: &C) -> Result<MediaListResponse, ApiError>
    {
        let context = context.clone();
        info!("media_list({:?}, {:?}) - X-Span-ID: {:?}", bookmark, page_size, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Generate OAuth access token
    async fn oauth_token(
        &self,
        grant_type: String,
        context: &C) -> Result<OauthTokenResponse, ApiError>
    {
        let context = context.clone();
        info!("oauth_token(\"{}\") - X-Span-ID: {:?}", grant_type, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Get Pin analytics
    async fn pins_analytics(
        &self,
        pin_id: String,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        metric_types: &Vec<String>,
        app_types: Option<String>,
        split_field: Option<String>,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsAnalyticsResponse, ApiError>
    {
        let context = context.clone();
        info!("pins_analytics(\"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", pin_id, start_date, end_date, metric_types, app_types, split_field, ad_account_id, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Create Pin
    async fn pins_create(
        &self,
        pin: models::Pin,
        context: &C) -> Result<PinsCreateResponse, ApiError>
    {
        let context = context.clone();
        info!("pins_create({:?}) - X-Span-ID: {:?}", pin, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Delete Pin
    async fn pins_delete(
        &self,
        pin_id: String,
        context: &C) -> Result<PinsDeleteResponse, ApiError>
    {
        let context = context.clone();
        info!("pins_delete(\"{}\") - X-Span-ID: {:?}", pin_id, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Get Pin
    async fn pins_get(
        &self,
        pin_id: String,
        ad_account_id: Option<String>,
        context: &C) -> Result<PinsGetResponse, ApiError>
    {
        let context = context.clone();
        info!("pins_get(\"{}\", {:?}) - X-Span-ID: {:?}", pin_id, ad_account_id, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Get user account analytics
    async fn user_account_analytics(
        &self,
        start_date: chrono::DateTime::<chrono::Utc>,
        end_date: chrono::DateTime::<chrono::Utc>,
        from_claimed_content: Option<String>,
        pin_format: Option<String>,
        app_types: Option<String>,
        metric_types: Option<&Vec<String>>,
        split_field: Option<String>,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountAnalyticsResponse, ApiError>
    {
        let context = context.clone();
        info!("user_account_analytics({}, {}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", start_date, end_date, from_claimed_content, pin_format, app_types, metric_types, split_field, ad_account_id, context.get().0.clone());
        Err("Generic failure".into())
    }

    /// Get user account
    async fn user_account_get(
        &self,
        ad_account_id: Option<String>,
        context: &C) -> Result<UserAccountGetResponse, ApiError>
    {
        let context = context.clone();
        info!("user_account_get({:?}) - X-Span-ID: {:?}", ad_account_id, context.get().0.clone());
        Err("Generic failure".into())
    }

}
