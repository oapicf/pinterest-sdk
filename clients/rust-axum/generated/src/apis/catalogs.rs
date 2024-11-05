use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Multipart};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupPinsSlashListResponse {
    /// Success
    Status200_Success
    (models::CatalogsProductGroupPinsList200Response)
    ,
    /// Invalid parameters.
    Status400_InvalidParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Catalogs product group not found.
    Status404_CatalogsProductGroupNotFound
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashCreateResponse {
    /// Success
    Status201_Success
    (models::CatalogsVerticalProductGroup)
    ,
    /// Invalid body.
    Status400_InvalidBody
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Conflict. Can't create this catalogs product group with this value.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashCreateManyResponse {
    /// Success
    Status201_Success
    (Vec<String>)
    ,
    /// Invalid body.
    Status400_InvalidBody
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Conflict. Can't create this catalogs product group with this value.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashDeleteResponse {
    /// Catalogs Product Group deleted successfully.
    Status204_CatalogsProductGroupDeletedSuccessfully
    ,
    /// Invalid catalogs product group id parameters.
    Status400_InvalidCatalogsProductGroupIdParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Catalogs product group not found.
    Status404_CatalogsProductGroupNotFound
    (models::Error)
    ,
    /// Conflict. Can't delete this catalogs product group.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashDeleteManyResponse {
    /// Catalogs Product Groups deleted successfully.
    Status204_CatalogsProductGroupsDeletedSuccessfully
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Catalogs product group not found.
    Status404_CatalogsProductGroupNotFound
    (models::Error)
    ,
    /// Conflict. Can't delete this catalogs product group.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashGetResponse {
    /// Success
    Status200_Success
    (models::CatalogsVerticalProductGroup)
    ,
    /// Invalid catalogs product group id parameters.
    Status400_InvalidCatalogsProductGroupIdParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Catalogs product group not found.
    Status404_CatalogsProductGroupNotFound
    (models::Error)
    ,
    /// Conflict. Can't get a catalogs product group without an existing catalog.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashListResponse {
    /// Success
    Status200_Success
    (models::CatalogsProductGroupsList200Response)
    ,
    /// Invalid feed parameters.
    Status400_InvalidFeedParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Data feed not found.
    Status404_DataFeedNotFound
    (models::Error)
    ,
    /// Conflict. Can't create this catalogs product group with this value.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashProductCountsGetResponse {
    /// Success
    Status200_Success
    (models::CatalogsProductGroupProductCountsVertical)
    ,
    /// Product Group Not Found.
    Status404_ProductGroupNotFound
    (models::Error)
    ,
    /// Can't access this feature without an existing catalog.
    Status409_Can
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::CatalogsVerticalProductGroup)
    ,
    /// Invalid parameters.
    Status400_InvalidParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Catalogs product group not found.
    Status404_CatalogsProductGroupNotFound
    (models::Error)
    ,
    /// Conflict. Can't update this catalogs product group to this value.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::Catalog)
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
pub enum CatalogsSlashListResponse {
    /// Success
    Status200_Success
    (models::CatalogsList200Response)
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
pub enum ItemsBatchSlashGetResponse {
    /// Response containing the requested catalogs items batch
    Status200_ResponseContainingTheRequestedCatalogsItemsBatch
    (models::CatalogsItemsBatch)
    ,
    /// Not authenticated to access catalogs items batch
    Status401_NotAuthenticatedToAccessCatalogsItemsBatch
    (models::Error)
    ,
    /// Not authorized to access catalogs items batch
    Status403_NotAuthorizedToAccessCatalogsItemsBatch
    (models::Error)
    ,
    /// Catalogs items batch not found
    Status404_CatalogsItemsBatchNotFound
    (models::Error)
    ,
    /// Method Not Allowed.
    Status405_MethodNotAllowed
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemsBatchSlashPostResponse {
    /// Response containing the requested catalogs items batch
    Status200_ResponseContainingTheRequestedCatalogsItemsBatch
    (models::CatalogsItemsBatch)
    ,
    /// Invalid request parameters.
    Status400_InvalidRequestParameters
    (models::Error)
    ,
    /// Not authenticated to post catalogs items
    Status401_NotAuthenticatedToPostCatalogsItems
    (models::Error)
    ,
    /// Not authorized to post catalogs items
    Status403_NotAuthorizedToPostCatalogsItems
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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemsSlashGetResponse {
    /// Response containing the requested catalogs items
    Status200_ResponseContainingTheRequestedCatalogsItems
    (models::CatalogsItems)
    ,
    /// Invalid request parameters.
    Status400_InvalidRequestParameters
    (models::Error)
    ,
    /// Not authorized to access catalogs items
    Status401_NotAuthorizedToAccessCatalogsItems
    (models::Error)
    ,
    /// Not authorized to access catalogs items
    Status403_NotAuthorizedToAccessCatalogsItems
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemsSlashPostResponse {
    /// Response containing the requested catalogs items
    Status200_ResponseContainingTheRequestedCatalogsItems
    (models::CatalogsItems)
    ,
    /// Invalid request
    Status400_InvalidRequest
    (models::Error)
    ,
    /// Not authorized to access catalogs items
    Status401_NotAuthorizedToAccessCatalogsItems
    (models::Error)
    ,
    /// Not authorized to access catalogs items
    Status403_NotAuthorizedToAccessCatalogsItems
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ProductsByProductGroupFilterSlashListResponse {
    /// Success
    Status200_Success
    (models::CatalogsProductGroupPinsList200Response)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Conflict. Can't get products.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ReportsSlashCreateResponse {
    /// Response containing the report token
    Status200_ResponseContainingTheReportToken
    (models::CatalogsCreateReportResponse)
    ,
    /// Entity (e.g., catalog, feed or processing_result) not found
    Status404_Entity
    (models::Error)
    ,
    /// Can't access this feature without an existing catalog.
    Status409_Can
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ReportsSlashGetResponse {
    /// Response that contains a link to download the report
    Status200_ResponseThatContainsALinkToDownloadTheReport
    (models::CatalogsReport)
    ,
    /// The token you provided is not valid or has expired.
    Status400_TheTokenYouProvidedIsNotValidOrHasExpired
    (models::Error)
    ,
    /// Can't access this feature without an existing catalog.
    Status409_Can
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ReportsSlashStatsResponse {
    /// Response containing the diagnostics aggregated counters
    Status200_ResponseContainingTheDiagnosticsAggregatedCounters
    (models::ReportsStats200Response)
    ,
    /// Not authorized to access catalogs
    Status401_NotAuthorizedToAccessCatalogs
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// Catalogs
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Catalogs {
    /// List products by product group.
    ///
    /// CatalogsProductGroupPinsSlashList - GET /v5/catalogs/product_groups/{product_group_id}/products
    async fn catalogs_product_group_pins_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CatalogsProductGroupPinsSlashListPathParams,
      query_params: models::CatalogsProductGroupPinsSlashListQueryParams,
    ) -> Result<CatalogsProductGroupPinsSlashListResponse, String>;

    /// Create product group.
    ///
    /// CatalogsProductGroupsSlashCreate - POST /v5/catalogs/product_groups
    async fn catalogs_product_groups_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::CatalogsProductGroupsSlashCreateQueryParams,
            body: models::MultipleProductGroupsInner,
    ) -> Result<CatalogsProductGroupsSlashCreateResponse, String>;

    /// Create product groups.
    ///
    /// CatalogsProductGroupsSlashCreateMany - POST /v5/catalogs/product_groups/multiple
    async fn catalogs_product_groups_slash_create_many(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::CatalogsProductGroupsSlashCreateManyQueryParams,
            body: Vec<models::MultipleProductGroupsInner>,
    ) -> Result<CatalogsProductGroupsSlashCreateManyResponse, String>;

    /// Delete product group.
    ///
    /// CatalogsProductGroupsSlashDelete - DELETE /v5/catalogs/product_groups/{product_group_id}
    async fn catalogs_product_groups_slash_delete(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CatalogsProductGroupsSlashDeletePathParams,
      query_params: models::CatalogsProductGroupsSlashDeleteQueryParams,
    ) -> Result<CatalogsProductGroupsSlashDeleteResponse, String>;

    /// Delete product groups.
    ///
    /// CatalogsProductGroupsSlashDeleteMany - DELETE /v5/catalogs/product_groups/multiple
    async fn catalogs_product_groups_slash_delete_many(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::CatalogsProductGroupsSlashDeleteManyQueryParams,
    ) -> Result<CatalogsProductGroupsSlashDeleteManyResponse, String>;

    /// Get product group.
    ///
    /// CatalogsProductGroupsSlashGet - GET /v5/catalogs/product_groups/{product_group_id}
    async fn catalogs_product_groups_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CatalogsProductGroupsSlashGetPathParams,
      query_params: models::CatalogsProductGroupsSlashGetQueryParams,
    ) -> Result<CatalogsProductGroupsSlashGetResponse, String>;

    /// List product groups.
    ///
    /// CatalogsProductGroupsSlashList - GET /v5/catalogs/product_groups
    async fn catalogs_product_groups_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::CatalogsProductGroupsSlashListQueryParams,
    ) -> Result<CatalogsProductGroupsSlashListResponse, String>;

    /// Get product counts.
    ///
    /// CatalogsProductGroupsSlashProductCountsGet - GET /v5/catalogs/product_groups/{product_group_id}/product_counts
    async fn catalogs_product_groups_slash_product_counts_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CatalogsProductGroupsSlashProductCountsGetPathParams,
      query_params: models::CatalogsProductGroupsSlashProductCountsGetQueryParams,
    ) -> Result<CatalogsProductGroupsSlashProductCountsGetResponse, String>;

    /// Update single product group.
    ///
    /// CatalogsProductGroupsSlashUpdate - PATCH /v5/catalogs/product_groups/{product_group_id}
    async fn catalogs_product_groups_slash_update(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CatalogsProductGroupsSlashUpdatePathParams,
      query_params: models::CatalogsProductGroupsSlashUpdateQueryParams,
            body: models::CatalogsProductGroupsUpdateRequest,
    ) -> Result<CatalogsProductGroupsSlashUpdateResponse, String>;

    /// Create catalog.
    ///
    /// CatalogsSlashCreate - POST /v5/catalogs
    async fn catalogs_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::CatalogsSlashCreateQueryParams,
            body: models::CatalogsCreateRequest,
    ) -> Result<CatalogsSlashCreateResponse, String>;

    /// List catalogs.
    ///
    /// CatalogsSlashList - GET /v5/catalogs
    async fn catalogs_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::CatalogsSlashListQueryParams,
    ) -> Result<CatalogsSlashListResponse, String>;

    /// List feed processing results.
    ///
    /// FeedProcessingResultsSlashList - GET /v5/catalogs/feeds/{feed_id}/processing_results
    async fn feed_processing_results_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::FeedProcessingResultsSlashListPathParams,
      query_params: models::FeedProcessingResultsSlashListQueryParams,
    ) -> Result<FeedProcessingResultsSlashListResponse, String>;

    /// Create feed.
    ///
    /// FeedsSlashCreate - POST /v5/catalogs/feeds
    async fn feeds_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::FeedsSlashCreateQueryParams,
            body: models::FeedsCreateRequest,
    ) -> Result<FeedsSlashCreateResponse, String>;

    /// Delete feed.
    ///
    /// FeedsSlashDelete - DELETE /v5/catalogs/feeds/{feed_id}
    async fn feeds_slash_delete(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::FeedsSlashDeletePathParams,
      query_params: models::FeedsSlashDeleteQueryParams,
    ) -> Result<FeedsSlashDeleteResponse, String>;

    /// Get feed.
    ///
    /// FeedsSlashGet - GET /v5/catalogs/feeds/{feed_id}
    async fn feeds_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::FeedsSlashGetPathParams,
      query_params: models::FeedsSlashGetQueryParams,
    ) -> Result<FeedsSlashGetResponse, String>;

    /// Ingest feed items.
    ///
    /// FeedsSlashIngest - POST /v5/catalogs/feeds/{feed_id}/ingest
    async fn feeds_slash_ingest(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::FeedsSlashIngestPathParams,
      query_params: models::FeedsSlashIngestQueryParams,
    ) -> Result<FeedsSlashIngestResponse, String>;

    /// List feeds.
    ///
    /// FeedsSlashList - GET /v5/catalogs/feeds
    async fn feeds_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::FeedsSlashListQueryParams,
    ) -> Result<FeedsSlashListResponse, String>;

    /// Update feed.
    ///
    /// FeedsSlashUpdate - PATCH /v5/catalogs/feeds/{feed_id}
    async fn feeds_slash_update(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::FeedsSlashUpdatePathParams,
      query_params: models::FeedsSlashUpdateQueryParams,
            body: models::FeedsUpdateRequest,
    ) -> Result<FeedsSlashUpdateResponse, String>;

    /// Get item batch status.
    ///
    /// ItemsBatchSlashGet - GET /v5/catalogs/items/batch/{batch_id}
    async fn items_batch_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::ItemsBatchSlashGetPathParams,
      query_params: models::ItemsBatchSlashGetQueryParams,
    ) -> Result<ItemsBatchSlashGetResponse, String>;

    /// Operate on item batch.
    ///
    /// ItemsBatchSlashPost - POST /v5/catalogs/items/batch
    async fn items_batch_slash_post(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::ItemsBatchSlashPostQueryParams,
            body: models::ItemsBatchPostRequest,
    ) -> Result<ItemsBatchSlashPostResponse, String>;

    /// List item issues.
    ///
    /// ItemsIssuesSlashList - GET /v5/catalogs/processing_results/{processing_result_id}/item_issues
    async fn items_issues_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::ItemsIssuesSlashListPathParams,
      query_params: models::ItemsIssuesSlashListQueryParams,
    ) -> Result<ItemsIssuesSlashListResponse, String>;

    /// Get catalogs items.
    ///
    /// ItemsSlashGet - GET /v5/catalogs/items
    async fn items_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::ItemsSlashGetQueryParams,
    ) -> Result<ItemsSlashGetResponse, String>;

    /// Get catalogs items (POST).
    ///
    /// ItemsSlashPost - POST /v5/catalogs/items
    async fn items_slash_post(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::ItemsSlashPostQueryParams,
            body: models::CatalogsItemsRequest,
    ) -> Result<ItemsSlashPostResponse, String>;

    /// List products by filter.
    ///
    /// ProductsByProductGroupFilterSlashList - POST /v5/catalogs/products/get_by_product_group_filters
    async fn products_by_product_group_filter_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::ProductsByProductGroupFilterSlashListQueryParams,
            body: models::CatalogsListProductsByFilterRequest,
    ) -> Result<ProductsByProductGroupFilterSlashListResponse, String>;

    /// Build catalogs report.
    ///
    /// ReportsSlashCreate - POST /v5/catalogs/reports
    async fn reports_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::ReportsSlashCreateQueryParams,
            body: models::CatalogsReportParameters,
    ) -> Result<ReportsSlashCreateResponse, String>;

    /// Get catalogs report.
    ///
    /// ReportsSlashGet - GET /v5/catalogs/reports
    async fn reports_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::ReportsSlashGetQueryParams,
    ) -> Result<ReportsSlashGetResponse, String>;

    /// List report stats.
    ///
    /// ReportsSlashStats - GET /v5/catalogs/reports/stats
    async fn reports_slash_stats(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::ReportsSlashStatsQueryParams,
    ) -> Result<ReportsSlashStatsResponse, String>;
}
