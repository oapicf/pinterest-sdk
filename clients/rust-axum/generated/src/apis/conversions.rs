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
pub enum AdvertiserDefinedEventsSlashCreateResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::AdvertiserDefinedEventsCreate200Response)
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
pub enum AdvertiserDefinedEventsSlashDeleteResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::AdvertiserDefinedEventsCreate200Response)
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
pub enum AdvertiserDefinedEventsSlashGetResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::AdvertiserDefinedEventsGet200Response)
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
pub enum AdvertiserDefinedEventsSlashUpdateResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::AdvertiserDefinedEventsCreate200Response)
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




/// Conversions
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Conversions<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// Create advertiser defined events.
    ///
    /// AdvertiserDefinedEventsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/advertiser_defined_events
    async fn advertiser_defined_events_slash_create(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::AdvertiserDefinedEventsSlashCreatePathParams,
            body: &models::AdvertiserDefinedEventsCreateRequest,
    ) -> Result<AdvertiserDefinedEventsSlashCreateResponse, E>;

    /// Delete advertiser defined events.
    ///
    /// AdvertiserDefinedEventsSlashDelete - DELETE /v5/ad_accounts/{ad_account_id}/advertiser_defined_events
    async fn advertiser_defined_events_slash_delete(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::AdvertiserDefinedEventsSlashDeletePathParams,
      query_params: &models::AdvertiserDefinedEventsSlashDeleteQueryParams,
    ) -> Result<AdvertiserDefinedEventsSlashDeleteResponse, E>;

    /// Get advertiser defined events.
    ///
    /// AdvertiserDefinedEventsSlashGet - GET /v5/ad_accounts/{ad_account_id}/advertiser_defined_events
    async fn advertiser_defined_events_slash_get(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::AdvertiserDefinedEventsSlashGetPathParams,
    ) -> Result<AdvertiserDefinedEventsSlashGetResponse, E>;

    /// Update advertiser defined events.
    ///
    /// AdvertiserDefinedEventsSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/advertiser_defined_events
    async fn advertiser_defined_events_slash_update(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::AdvertiserDefinedEventsSlashUpdatePathParams,
            body: &models::AdvertiserDefinedEventsCreateRequest,
    ) -> Result<AdvertiserDefinedEventsSlashUpdateResponse, E>;
}
