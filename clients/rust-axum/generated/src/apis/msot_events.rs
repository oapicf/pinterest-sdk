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
pub enum MsotEventsSlashCreateResponse {
    /// Success
    Status200_Success
    ,
    /// The request was invalid
    Status400_TheRequestWasInvalid
    (models::Error)
    ,
    /// Not authorized to send MSOT conversion events
    Status401_NotAuthorizedToSendMSOTConversionEvents
    (models::Error)
    ,
    /// Unauthorized access
    Status403_UnauthorizedAccess
    (models::Error)
    ,
    /// This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window.
    Status429_ThisRequestExceededARateLimit
    (models::Error)
    ,
    /// Unexpected errors
    Status0_UnexpectedErrors
    (models::Error)
}




/// MsotEvents
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait MsotEvents<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// Send Measurement Source Of Truth (MSOT) attributed conversion events.
    ///
    /// MsotEventsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/msot/events
    async fn msot_events_slash_create(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::MsotEventsSlashCreatePathParams,
            body: &models::ConversionMsotEvents,
    ) -> Result<MsotEventsSlashCreateResponse, E>;
}
