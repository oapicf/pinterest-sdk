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
pub enum EventsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::ConversionApiResponse)
    ,
    /// The request was invalid.
    Status400_TheRequestWasInvalid
    (models::Error)
    ,
    /// Not authorized to send conversion events
    Status401_NotAuthorizedToSendConversionEvents
    (models::Error)
    ,
    /// Unauthorized access.
    Status403_UnauthorizedAccess
    (models::Error)
    ,
    /// Not all events were successfully processed.
    Status422_NotAllEventsWereSuccessfullyProcessed
    (models::DetailedError)
    ,
    /// This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window.
    Status429_ThisRequestExceededARateLimit
    (models::Error)
    ,
    /// The endpoint has been ramped down and is currently not accepting any traffic.
    Status503_TheEndpointHasBeenRampedDownAndIsCurrentlyNotAcceptingAnyTraffic
    (models::Error)
    ,
    /// Unexpected errors
    Status0_UnexpectedErrors
    (models::Error)
}


/// ConversionEvents
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait ConversionEvents {
    /// Send conversions.
    ///
    /// EventsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/events
    async fn events_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::EventsSlashCreatePathParams,
      query_params: models::EventsSlashCreateQueryParams,
            body: models::ConversionEvents,
    ) -> Result<EventsSlashCreateResponse, String>;
}
