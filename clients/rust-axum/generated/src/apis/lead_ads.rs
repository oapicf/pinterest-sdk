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
pub enum AdAccountsSubscriptionsSlashDelByIdResponse {
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
pub enum AdAccountsSubscriptionsSlashGetByIdResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::LeadSubscription)
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
pub enum AdAccountsSubscriptionsSlashGetListResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::AdAccountsSubscriptionsGetList200Response)
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
pub enum AdAccountsSubscriptionsSlashPostResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::LeadSubscription)
    ,
    /// The request could not be understood by the server due to unexpected data.
    Status400_TheRequestCouldNotBeUnderstoodByTheServerDueToUnexpectedData
    (models::PinterestLibError)
    ,
    /// The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.
    Status403_TheRequestWasValid
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}




/// LeadAds
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait LeadAds<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// Delete lead ads subscription.
    ///
    /// AdAccountsSubscriptionsSlashDelById - DELETE /v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}
    async fn ad_accounts_subscriptions_slash_del_by_id(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::AdAccountsSubscriptionsSlashDelByIdPathParams,
    ) -> Result<AdAccountsSubscriptionsSlashDelByIdResponse, E>;

    /// Get lead ads subscription by ID.
    ///
    /// AdAccountsSubscriptionsSlashGetById - GET /v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}
    async fn ad_accounts_subscriptions_slash_get_by_id(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::AdAccountsSubscriptionsSlashGetByIdPathParams,
    ) -> Result<AdAccountsSubscriptionsSlashGetByIdResponse, E>;

    /// Get lead ads subscriptions.
    ///
    /// AdAccountsSubscriptionsSlashGetList - GET /v5/ad_accounts/{ad_account_id}/leads/subscriptions
    async fn ad_accounts_subscriptions_slash_get_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::AdAccountsSubscriptionsSlashGetListPathParams,
      query_params: &models::AdAccountsSubscriptionsSlashGetListQueryParams,
    ) -> Result<AdAccountsSubscriptionsSlashGetListResponse, E>;

    /// Create lead ads subscription.
    ///
    /// AdAccountsSubscriptionsSlashPost - POST /v5/ad_accounts/{ad_account_id}/leads/subscriptions
    async fn ad_accounts_subscriptions_slash_post(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::AdAccountsSubscriptionsSlashPostPathParams,
            body: &models::LeadSubscriptionPostParamsCreate,
    ) -> Result<AdAccountsSubscriptionsSlashPostResponse, E>;
}
