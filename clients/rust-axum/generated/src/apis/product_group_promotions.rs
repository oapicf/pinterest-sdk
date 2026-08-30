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
pub enum ProductGroupPromotionsSlashCreateResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::ProductGroupPromotions)
    ,
    /// Resource create operation completed successfully.
    Status201_ResourceCreateOperationCompletedSuccessfully
    (models::ProductGroupPromotions)
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
pub enum ProductGroupPromotionsSlashGetResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::ProductGroupPromotion)
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
pub enum ProductGroupPromotionsSlashListResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::ProductGroupPromotionsList200Response)
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
pub enum ProductGroupPromotionsSlashUpdateResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::ProductGroupPromotions)
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
pub enum ProductGroupsSlashAnalyticsResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (Vec<models::ProductGroupAnalyticsItems>)
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




/// ProductGroupPromotions
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait ProductGroupPromotions<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// Create product group promotions.
    ///
    /// ProductGroupPromotionsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/product_group_promotions
    async fn product_group_promotions_slash_create(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::ProductGroupPromotionsSlashCreatePathParams,
            body: &models::ProductGroupPromotionsCreate,
    ) -> Result<ProductGroupPromotionsSlashCreateResponse, E>;

    /// Get a product group promotion by id.
    ///
    /// ProductGroupPromotionsSlashGet - GET /v5/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}
    async fn product_group_promotions_slash_get(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::ProductGroupPromotionsSlashGetPathParams,
    ) -> Result<ProductGroupPromotionsSlashGetResponse, E>;

    /// Get product group promotions.
    ///
    /// ProductGroupPromotionsSlashList - GET /v5/ad_accounts/{ad_account_id}/product_group_promotions
    async fn product_group_promotions_slash_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::ProductGroupPromotionsSlashListPathParams,
      query_params: &models::ProductGroupPromotionsSlashListQueryParams,
    ) -> Result<ProductGroupPromotionsSlashListResponse, E>;

    /// Update product group promotions.
    ///
    /// ProductGroupPromotionsSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/product_group_promotions
    async fn product_group_promotions_slash_update(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::ProductGroupPromotionsSlashUpdatePathParams,
            body: &models::ProductGroupPromotionsUpdateWithRequiredBody,
    ) -> Result<ProductGroupPromotionsSlashUpdateResponse, E>;

    /// Get product group analytics.
    ///
    /// ProductGroupsSlashAnalytics - GET /v5/ad_accounts/{ad_account_id}/product_groups/analytics
    async fn product_groups_slash_analytics(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::ProductGroupsSlashAnalyticsPathParams,
      query_params: &models::ProductGroupsSlashAnalyticsQueryParams,
    ) -> Result<ProductGroupsSlashAnalyticsResponse, E>;
}
