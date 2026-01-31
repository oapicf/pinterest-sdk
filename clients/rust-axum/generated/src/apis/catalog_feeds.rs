use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Host};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum FeedProcessingResultsSlashListResponse {
    /// Success
    Status200_Success
    (models::FeedProcessingResultsList200Response)
    ,
    /// Invalid parameters.
    Status400_InvalidParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Feed not found.
    Status404_FeedNotFound
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum FeedsSlashCreateResponse {
    /// Success
    Status201_Success
    (models::CatalogsFeed)
    ,
    /// Invalid feed parameters.
    Status400_InvalidFeedParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Business account required.
    Status403_BusinessAccountRequired
    (models::Error)
    ,
    /// User website required.
    Status409_UserWebsiteRequired
    (models::Error)
    ,
    /// Unique feed name is required.
    Status422_UniqueFeedNameIsRequired
    (models::Error)
    ,
    /// Not implemented (absent \"default_country\" or \"default_locale\").
    Status501_NotImplemented
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum FeedsSlashDeleteResponse {
    /// Feed deleted successfully.
    Status204_FeedDeletedSuccessfully
    ,
    /// Invalid feed parameters.
    Status400_InvalidFeedParameters
    (models::Error)
    ,
    /// Forbidden. Account not approved for feed mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Data feed not found.
    Status404_DataFeedNotFound
    (models::Error)
    ,
    /// Conflict. Can't delete a feed with active promotions.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum FeedsSlashGetResponse {
    /// Success
    Status200_Success
    (models::CatalogsFeed)
    ,
    /// Invalid feed parameters.
    Status400_InvalidFeedParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Data feed not found.
    Status404_DataFeedNotFound
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum FeedsSlashIngestResponse {
    /// The ingestion process was successfully started.
    Status200_TheIngestionProcessWasSuccessfullyStarted
    (models::CatalogsFeedIngestion)
    ,
    /// Invalid feed parameters.
    Status400_InvalidFeedParameters
    (models::Error)
    ,
    /// Forbidden. Account not approved for feed mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Data feed not found.
    Status404_DataFeedNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum FeedsSlashListResponse {
    /// Success
    Status200_Success
    (models::FeedsList200Response)
    ,
    /// Invalid parameters.
    Status400_InvalidParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum FeedsSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::CatalogsFeed)
    ,
    /// Invalid feed parameters.
    Status400_InvalidFeedParameters
    (models::Error)
    ,
    /// Forbidden. Account not approved for feed mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Data feed not found.
    Status404_DataFeedNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemsIssuesSlashListResponse {
    /// Success
    Status200_Success
    (models::ItemsIssuesList200Response)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Processing Result not found.
    Status404_ProcessingResultNotFound
    (models::Error)
    ,
    /// Not implemented.
    Status501_NotImplemented
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}




/// CatalogFeeds
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait CatalogFeeds<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// List feed processing results.
    ///
    /// FeedProcessingResultsSlashList - GET /v5/catalogs/feeds/{feed_id}/processing_results
    async fn feed_processing_results_slash_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::FeedProcessingResultsSlashListPathParams,
      query_params: &models::FeedProcessingResultsSlashListQueryParams,
    ) -> Result<FeedProcessingResultsSlashListResponse, E>;

    /// Create feed.
    ///
    /// FeedsSlashCreate - POST /v5/catalogs/feeds
    async fn feeds_slash_create(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::FeedsSlashCreateQueryParams,
            body: &models::FeedsCreateRequest,
    ) -> Result<FeedsSlashCreateResponse, E>;

    /// Delete feed.
    ///
    /// FeedsSlashDelete - DELETE /v5/catalogs/feeds/{feed_id}
    async fn feeds_slash_delete(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::FeedsSlashDeletePathParams,
      query_params: &models::FeedsSlashDeleteQueryParams,
    ) -> Result<FeedsSlashDeleteResponse, E>;

    /// Get feed.
    ///
    /// FeedsSlashGet - GET /v5/catalogs/feeds/{feed_id}
    async fn feeds_slash_get(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::FeedsSlashGetPathParams,
      query_params: &models::FeedsSlashGetQueryParams,
    ) -> Result<FeedsSlashGetResponse, E>;

    /// Ingest feed items.
    ///
    /// FeedsSlashIngest - POST /v5/catalogs/feeds/{feed_id}/ingest
    async fn feeds_slash_ingest(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::FeedsSlashIngestPathParams,
      query_params: &models::FeedsSlashIngestQueryParams,
    ) -> Result<FeedsSlashIngestResponse, E>;

    /// List feeds.
    ///
    /// FeedsSlashList - GET /v5/catalogs/feeds
    async fn feeds_slash_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::FeedsSlashListQueryParams,
    ) -> Result<FeedsSlashListResponse, E>;

    /// Update feed.
    ///
    /// FeedsSlashUpdate - PATCH /v5/catalogs/feeds/{feed_id}
    async fn feeds_slash_update(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::FeedsSlashUpdatePathParams,
      query_params: &models::FeedsSlashUpdateQueryParams,
            body: &models::FeedsUpdateRequest,
    ) -> Result<FeedsSlashUpdateResponse, E>;

    /// List item issues.
    ///
    /// ItemsIssuesSlashList - GET /v5/catalogs/processing_results/{processing_result_id}/item_issues
    async fn items_issues_slash_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::ItemsIssuesSlashListPathParams,
      query_params: &models::ItemsIssuesSlashListQueryParams,
    ) -> Result<ItemsIssuesSlashListResponse, E>;
}
