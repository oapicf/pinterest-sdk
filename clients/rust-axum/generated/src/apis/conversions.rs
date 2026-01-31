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
pub enum AdvertiserDefinedEventsSlashGetResponse {
    /// Success
    Status200_Success
    (models::AdvertiserDefinedEventsResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}




/// Conversions
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Conversions<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
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
}
