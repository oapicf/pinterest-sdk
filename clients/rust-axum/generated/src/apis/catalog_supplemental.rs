use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::CookieJar;
use bytes::Bytes;
use headers::Host;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsLocalInventoryItemsBatchSlashOperateResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::SupplementalItemsBatchResponse)
    ,
    /// Resource create operation completed successfully.
    Status201_ResourceCreateOperationCompletedSuccessfully
    (models::LocalInventoryItemsBatch)
    ,
    /// The request could not be understood by the server due to unexpected data.
    Status400_TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    Status401_AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    Status403_TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    Status404_TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    Status429_TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsLocalInventoryItemsSlashPostResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::LocalInventoryItemsGet)
    ,
    /// Resource create operation completed successfully.
    Status201_ResourceCreateOperationCompletedSuccessfully
    (models::LocalInventoryItemsGet)
    ,
    /// The request could not be understood by the server due to unexpected data.
    Status400_TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    Status401_AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    Status403_TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    Status404_TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    Status429_TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsLocalStoresSlashCreateResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (Vec<models::CatalogsLocalStoresCreate200ResponseInner>)
    ,
    /// Resource create operation completed successfully.
    Status201_ResourceCreateOperationCompletedSuccessfully
    (Vec<models::LocalStore>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    Status400_TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    Status401_AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    Status403_TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    Status404_TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    Status429_TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsLocalStoresSlashDeleteResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (Vec<models::CatalogsLocalStoresDelete200ResponseInner>)
    ,
    /// Resource deleted successfully.
    Status204_ResourceDeletedSuccessfully
    ,
    /// The request could not be understood by the server due to unexpected data.
    Status400_TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    Status401_AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    Status403_TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    Status404_TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    Status429_TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsLocalStoresSlashListResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::CatalogsLocalStoresList200Response)
    ,
    /// The request could not be understood by the server due to unexpected data.
    Status400_TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    Status401_AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    Status403_TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    Status404_TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    Status429_TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsLocalStoresSlashUpdateResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (Vec<models::CatalogsLocalStoresCreate200ResponseInner>)
    ,
    /// The request could not be understood by the server due to unexpected data.
    Status400_TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    Status401_AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    Status403_TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    Status404_TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    Status429_TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsSupplementalItemsBatchSlashGetResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::SupplementalItemsBatchResponse)
    ,
    /// The request could not be understood by the server due to unexpected data.
    Status400_TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// Authentication is required and has either failed or not been provided.
    Status401_AuthenticationIsRequiredAndHasEitherFailedOrNotBeenProvided
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    Status403_TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// The requested resource could not be found on this server.
    Status404_TheRequestedResourceCouldNotBeFoundOnThisServer
    (models::PinterestLibError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    Status429_TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}




/// CatalogSupplemental
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait CatalogSupplemental<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// Operate on local inventory item batch.
    ///
    /// CatalogsLocalInventoryItemsBatchSlashOperate - POST /v5/catalogs/{catalog_id}/local_inventory_items/batch
    async fn catalogs_local_inventory_items_batch_slash_operate(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::CatalogsLocalInventoryItemsBatchSlashOperatePathParams,
      query_params: &models::CatalogsLocalInventoryItemsBatchSlashOperateQueryParams,
            body: &models::LocalInventoryItemsBatchCreate,
    ) -> Result<CatalogsLocalInventoryItemsBatchSlashOperateResponse, E>;

    /// Get local inventory items (POST).
    ///
    /// CatalogsLocalInventoryItemsSlashPost - POST /v5/catalogs/{catalog_id}/local_inventory_items/query
    async fn catalogs_local_inventory_items_slash_post(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::CatalogsLocalInventoryItemsSlashPostPathParams,
      query_params: &models::CatalogsLocalInventoryItemsSlashPostQueryParams,
            body: &models::LocalInventoryItemsGetCreate,
    ) -> Result<CatalogsLocalInventoryItemsSlashPostResponse, E>;

    /// Create local stores.
    ///
    /// CatalogsLocalStoresSlashCreate - POST /v5/catalogs/{catalog_id}/local_stores
    async fn catalogs_local_stores_slash_create(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::CatalogsLocalStoresSlashCreatePathParams,
      query_params: &models::CatalogsLocalStoresSlashCreateQueryParams,
            body: &Vec<models::LocalStoreCreate>,
    ) -> Result<CatalogsLocalStoresSlashCreateResponse, E>;

    /// Delete local stores.
    ///
    /// CatalogsLocalStoresSlashDelete - DELETE /v5/catalogs/{catalog_id}/local_stores
    async fn catalogs_local_stores_slash_delete(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::CatalogsLocalStoresSlashDeletePathParams,
      query_params: &models::CatalogsLocalStoresSlashDeleteQueryParams,
    ) -> Result<CatalogsLocalStoresSlashDeleteResponse, E>;

    /// List local stores.
    ///
    /// CatalogsLocalStoresSlashList - GET /v5/catalogs/{catalog_id}/local_stores
    async fn catalogs_local_stores_slash_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::CatalogsLocalStoresSlashListPathParams,
      query_params: &models::CatalogsLocalStoresSlashListQueryParams,
    ) -> Result<CatalogsLocalStoresSlashListResponse, E>;

    /// Update local stores.
    ///
    /// CatalogsLocalStoresSlashUpdate - PATCH /v5/catalogs/{catalog_id}/local_stores
    async fn catalogs_local_stores_slash_update(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::CatalogsLocalStoresSlashUpdatePathParams,
      query_params: &models::CatalogsLocalStoresSlashUpdateQueryParams,
            body: &Vec<models::LocalStoreBatchUpdate>,
    ) -> Result<CatalogsLocalStoresSlashUpdateResponse, E>;

    /// Get supplemental items batch status.
    ///
    /// CatalogsSupplementalItemsBatchSlashGet - GET /v5/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}
    async fn catalogs_supplemental_items_batch_slash_get(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::CatalogsSupplementalItemsBatchSlashGetPathParams,
      query_params: &models::CatalogsSupplementalItemsBatchSlashGetQueryParams,
    ) -> Result<CatalogsSupplementalItemsBatchSlashGetResponse, E>;
}
