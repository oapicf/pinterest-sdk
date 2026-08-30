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
pub enum EventsSlashCreateResponse {
    /// The request has succeeded.
    Status200_TheRequestHasSucceeded
    (models::ConversionEvents)
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
    /// The request was well-formed but was unable to be followed due to semantic errors.
    Status422_TheRequestWasWell
    (models::DetailedError)
    ,
    /// The user has sent too many requests in a given amount of time and is being rate limited.
    Status429_TheUserHasSentTooManyRequestsInAGivenAmountOfTimeAndIsBeingRateLimited
    (models::PinterestLibError)
    ,
    /// The server is currently unable to handle the request due to a temporary overload or scheduled maintenance.
    Status503_TheServerIsCurrentlyUnableToHandleTheRequestDueToATemporaryOverloadOrScheduledMaintenance
    (models::PinterestLibError)
    ,
    /// An unexpected error response.
    Status0_AnUnexpectedErrorResponse
    (models::PinterestLibError)
}




/// ConversionEvents
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait ConversionEvents<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// Send conversions.
    ///
    /// EventsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/events
    async fn events_slash_create(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::EventsSlashCreatePathParams,
      query_params: &models::EventsSlashCreateQueryParams,
            body: &models::ConversionEventsCreate,
    ) -> Result<EventsSlashCreateResponse, E>;
}
