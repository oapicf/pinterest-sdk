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
pub enum PromotionsSlashCreateResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::PromotionsResponse)
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
pub enum PromotionsSlashDeleteResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::Promotion)
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
pub enum PromotionsSlashGetResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::Promotion)
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
pub enum PromotionsSlashListResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::PromotionsList200Response)
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
pub enum PromotionsSlashUpdateResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::PromotionsResponse)
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




/// Promotions
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Promotions<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// Create promotions.
    ///
    /// PromotionsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/promotions
    async fn promotions_slash_create(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::PromotionsSlashCreatePathParams,
            body: &models::PromotionCreateBatch,
    ) -> Result<PromotionsSlashCreateResponse, E>;

    /// Delete promotion by id.
    ///
    /// PromotionsSlashDelete - DELETE /v5/ad_accounts/{ad_account_id}/promotions/{promotion_id}
    async fn promotions_slash_delete(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::PromotionsSlashDeletePathParams,
    ) -> Result<PromotionsSlashDeleteResponse, E>;

    /// Get promotion by id.
    ///
    /// PromotionsSlashGet - GET /v5/ad_accounts/{ad_account_id}/promotions/{promotion_id}
    async fn promotions_slash_get(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::PromotionsSlashGetPathParams,
    ) -> Result<PromotionsSlashGetResponse, E>;

    /// Get promotions.
    ///
    /// PromotionsSlashList - GET /v5/ad_accounts/{ad_account_id}/promotions
    async fn promotions_slash_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::PromotionsSlashListPathParams,
      query_params: &models::PromotionsSlashListQueryParams,
    ) -> Result<PromotionsSlashListResponse, E>;

    /// Update promotions.
    ///
    /// PromotionsSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/promotions
    async fn promotions_slash_update(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::PromotionsSlashUpdatePathParams,
            body: &models::PromotionUpdateBatch,
    ) -> Result<PromotionsSlashUpdateResponse, E>;
}
