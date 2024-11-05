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
pub enum MultiPinsSlashAnalyticsResponse {
    /// response
    Status200_Response
    (std::collections::HashMap<String, models::PinAnalyticsResponse>)
    ,
    /// Invalid pins analytics parameters.
    Status400_InvalidPinsAnalyticsParameters
    (models::Error)
    ,
    /// Not authorized to access board or Pin.
    Status401_NotAuthorizedToAccessBoardOrPin
    (models::Error)
    ,
    /// Pin not found.
    Status404_PinNotFound
    (models::Error)
    ,
    /// This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.
    Status429_ThisRequestExceededARateLimit
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PinsSlashAnalyticsResponse {
    /// response
    Status200_Response
    (std::collections::HashMap<String, models::PinAnalyticsMetricsResponse>)
    ,
    /// Invalid pins analytics parameters.
    Status400_InvalidPinsAnalyticsParameters
    (models::Error)
    ,
    /// Not authorized to access board or Pin.
    Status403_NotAuthorizedToAccessBoardOrPin
    (models::Error)
    ,
    /// Pin not found.
    Status404_PinNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PinsSlashCreateResponse {
    /// Successful pin creation.
    Status201_SuccessfulPinCreation
    (models::Pin)
    ,
    /// Invalid Pin parameters response
    Status400_InvalidPinParametersResponse
    (models::Error)
    ,
    /// The Pin's image is too small, too large or is broken
    Status403_ThePin
    (models::Error)
    ,
    /// Board or section not found
    Status404_BoardOrSectionNotFound
    (models::Error)
    ,
    /// This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.
    Status429_ThisRequestExceededARateLimit
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PinsSlashDeleteResponse {
    /// Successfully deleted Pin
    Status204_SuccessfullyDeletedPin
    ,
    /// Not authorized to access board or Pin.
    Status403_NotAuthorizedToAccessBoardOrPin
    (models::Error)
    ,
    /// Pin not found.
    Status404_PinNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PinsSlashGetResponse {
    /// response
    Status200_Response
    (models::Pin)
    ,
    /// Not authorized to access board or Pin.
    Status403_NotAuthorizedToAccessBoardOrPin
    (models::Error)
    ,
    /// Pin not found.
    Status404_PinNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PinsSlashListResponse {
    /// Success
    Status200_Success
    (models::PinsList200Response)
    ,
    /// Invalid pin filter value
    Status400_InvalidPinFilterValue
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PinsSlashSaveResponse {
    /// Successfully saved pin.
    Status201_SuccessfullySavedPin
    (models::Pin)
    ,
    /// Not authorized to access Board or Pin.
    Status403_NotAuthorizedToAccessBoardOrPin
    (models::Error)
    ,
    /// Board or Pin not found.
    Status404_BoardOrPinNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PinsSlashUpdateResponse {
    /// response
    Status200_Response
    (models::Pin)
    ,
    /// Not authorized to update Pin.
    Status403_NotAuthorizedToUpdatePin
    (models::Error)
    ,
    /// Pin not found.
    Status404_PinNotFound
    (models::Error)
    ,
    /// This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.
    Status429_ThisRequestExceededARateLimit
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// Pins
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Pins {
    /// Get multiple Pin analytics.
    ///
    /// MultiPinsSlashAnalytics - GET /v5/pins/analytics
    async fn multi_pins_slash_analytics(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::MultiPinsSlashAnalyticsQueryParams,
    ) -> Result<MultiPinsSlashAnalyticsResponse, String>;

    /// Get Pin analytics.
    ///
    /// PinsSlashAnalytics - GET /v5/pins/{pin_id}/analytics
    async fn pins_slash_analytics(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::PinsSlashAnalyticsPathParams,
      query_params: models::PinsSlashAnalyticsQueryParams,
    ) -> Result<PinsSlashAnalyticsResponse, String>;

    /// Create Pin.
    ///
    /// PinsSlashCreate - POST /v5/pins
    async fn pins_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::PinsSlashCreateQueryParams,
            body: models::PinCreate,
    ) -> Result<PinsSlashCreateResponse, String>;

    /// Delete Pin.
    ///
    /// PinsSlashDelete - DELETE /v5/pins/{pin_id}
    async fn pins_slash_delete(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::PinsSlashDeletePathParams,
      query_params: models::PinsSlashDeleteQueryParams,
    ) -> Result<PinsSlashDeleteResponse, String>;

    /// Get Pin.
    ///
    /// PinsSlashGet - GET /v5/pins/{pin_id}
    async fn pins_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::PinsSlashGetPathParams,
      query_params: models::PinsSlashGetQueryParams,
    ) -> Result<PinsSlashGetResponse, String>;

    /// List Pins.
    ///
    /// PinsSlashList - GET /v5/pins
    async fn pins_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::PinsSlashListQueryParams,
    ) -> Result<PinsSlashListResponse, String>;

    /// Save Pin.
    ///
    /// PinsSlashSave - POST /v5/pins/{pin_id}/save
    async fn pins_slash_save(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::PinsSlashSavePathParams,
      query_params: models::PinsSlashSaveQueryParams,
            body: models::PinsSaveRequest,
    ) -> Result<PinsSlashSaveResponse, String>;

    /// Update Pin.
    ///
    /// PinsSlashUpdate - PATCH /v5/pins/{pin_id}
    async fn pins_slash_update(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::PinsSlashUpdatePathParams,
      query_params: models::PinsSlashUpdateQueryParams,
            body: models::PinUpdate,
    ) -> Result<PinsSlashUpdateResponse, String>;
}
