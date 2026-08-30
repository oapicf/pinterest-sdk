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
pub enum CatalogsProductGroupPinsSlashListResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::CatalogsProductGroupPinsList200Response)
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
pub enum CatalogsProductGroupsSlashCreateResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::CatalogsVerticalProductGroup)
    ,
    /// Resource create operation completed successfully.
    Status201_ResourceCreateOperationCompletedSuccessfully
    (models::CatalogsVerticalProductGroup)
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
pub enum CatalogsProductGroupsSlashCreateManyResponse {
    /// The request has succeeded and a new resource has been created as a result.
    Status201_TheRequestHasSucceededAndANewResourceHasBeenCreatedAsAResult
    (Vec<models::CatalogsProductGroupsCreateManyResponse201Items>)
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
pub enum CatalogsProductGroupsSlashDeleteResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::CatalogsVerticalProductGroup)
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
pub enum CatalogsProductGroupsSlashDeleteManyResponse {
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
pub enum CatalogsProductGroupsSlashGetResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::CatalogsVerticalProductGroup)
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
pub enum CatalogsProductGroupsSlashListResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::CatalogsProductGroupsList200Response)
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
pub enum CatalogsProductGroupsSlashProductCountsGetResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::CatalogsProductGroupProductCountsVertical)
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
pub enum CatalogsProductGroupsSlashUpdateResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::CatalogsVerticalProductGroup)
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
pub enum ProductsByProductGroupFilterSlashListResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::CatalogsProductGroupPinsList200Response)
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




/// CatalogProductGroups
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait CatalogProductGroups<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// List products by product group.
    ///
    /// CatalogsProductGroupPinsSlashList - GET /v5/catalogs/product_groups/{product_group_id}/products
    async fn catalogs_product_group_pins_slash_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::CatalogsProductGroupPinsSlashListPathParams,
      query_params: &models::CatalogsProductGroupPinsSlashListQueryParams,
    ) -> Result<CatalogsProductGroupPinsSlashListResponse, E>;

    /// Create product group.
    ///
    /// CatalogsProductGroupsSlashCreate - POST /v5/catalogs/product_groups
    async fn catalogs_product_groups_slash_create(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::CatalogsProductGroupsSlashCreateQueryParams,
            body: &models::CatalogsProductGroupsCreateRequestSchema,
    ) -> Result<CatalogsProductGroupsSlashCreateResponse, E>;

    /// Create product groups.
    ///
    /// CatalogsProductGroupsSlashCreateMany - POST /v5/catalogs/product_groups/multiple
    async fn catalogs_product_groups_slash_create_many(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::CatalogsProductGroupsSlashCreateManyQueryParams,
            body: &models::CatalogsProductGroupsCreateManyRequestSchema,
    ) -> Result<CatalogsProductGroupsSlashCreateManyResponse, E>;

    /// Delete product group.
    ///
    /// CatalogsProductGroupsSlashDelete - DELETE /v5/catalogs/product_groups/{product_group_id}
    async fn catalogs_product_groups_slash_delete(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::CatalogsProductGroupsSlashDeletePathParams,
      query_params: &models::CatalogsProductGroupsSlashDeleteQueryParams,
    ) -> Result<CatalogsProductGroupsSlashDeleteResponse, E>;

    /// Delete product groups.
    ///
    /// CatalogsProductGroupsSlashDeleteMany - DELETE /v5/catalogs/product_groups/multiple
    async fn catalogs_product_groups_slash_delete_many(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::CatalogsProductGroupsSlashDeleteManyQueryParams,
    ) -> Result<CatalogsProductGroupsSlashDeleteManyResponse, E>;

    /// Get product group.
    ///
    /// CatalogsProductGroupsSlashGet - GET /v5/catalogs/product_groups/{product_group_id}
    async fn catalogs_product_groups_slash_get(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::CatalogsProductGroupsSlashGetPathParams,
      query_params: &models::CatalogsProductGroupsSlashGetQueryParams,
    ) -> Result<CatalogsProductGroupsSlashGetResponse, E>;

    /// List product groups.
    ///
    /// CatalogsProductGroupsSlashList - GET /v5/catalogs/product_groups
    async fn catalogs_product_groups_slash_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::CatalogsProductGroupsSlashListQueryParams,
    ) -> Result<CatalogsProductGroupsSlashListResponse, E>;

    /// Get product counts.
    ///
    /// CatalogsProductGroupsSlashProductCountsGet - GET /v5/catalogs/product_groups/{product_group_id}/product_counts
    async fn catalogs_product_groups_slash_product_counts_get(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::CatalogsProductGroupsSlashProductCountsGetPathParams,
      query_params: &models::CatalogsProductGroupsSlashProductCountsGetQueryParams,
    ) -> Result<CatalogsProductGroupsSlashProductCountsGetResponse, E>;

    /// Update single product group.
    ///
    /// CatalogsProductGroupsSlashUpdate - PATCH /v5/catalogs/product_groups/{product_group_id}
    async fn catalogs_product_groups_slash_update(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::CatalogsProductGroupsSlashUpdatePathParams,
      query_params: &models::CatalogsProductGroupsSlashUpdateQueryParams,
            body: &models::CatalogsProductGroupsUpdateRequestSchema,
    ) -> Result<CatalogsProductGroupsSlashUpdateResponse, E>;

    /// List products by filter.
    ///
    /// ProductsByProductGroupFilterSlashList - POST /v5/catalogs/products/get_by_product_group_filters
    async fn products_by_product_group_filter_slash_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::ProductsByProductGroupFilterSlashListQueryParams,
            body: &models::CatalogsListProductsByFilterRequest,
    ) -> Result<ProductsByProductGroupFilterSlashListResponse, E>;
}
