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
pub enum AdPreviewsSlashCreateResponse {
    /// Successful ad preview creation.
    Status200_SuccessfulAdPreviewCreation
    (models::AdPreviewUrlResponse)
    ,
    /// Invalid Pin parameters response
    Status400_InvalidPinParametersResponse
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdTargetingAnalyticsSlashGetResponse {
    /// Success
    Status200_Success
    (models::MetricsResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdsSlashAnalyticsResponse {
    /// Success
    Status200_Success
    (Vec<models::AdsAnalyticsResponseInner>)
    ,
    /// Invalid ad account ads analytics parameters.
    Status400_InvalidAdAccountAdsAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::AdArrayResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdsSlashGetResponse {
    /// Success
    Status200_Success
    (models::AdResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdsSlashListResponse {
    /// Success
    Status200_Success
    (models::AdsList200Response)
    ,
    /// Invalid ad account ads parameters.
    Status400_InvalidAdAccountAdsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdsSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::AdArrayResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// Ads
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Ads {
    /// Create ad preview with pin or image.
    ///
    /// AdPreviewsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/ad_previews
    async fn ad_previews_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdPreviewsSlashCreatePathParams,
            body: models::AdPreviewRequest,
    ) -> Result<AdPreviewsSlashCreateResponse, String>;

    /// Get targeting analytics for ads.
    ///
    /// AdTargetingAnalyticsSlashGet - GET /v5/ad_accounts/{ad_account_id}/ads/targeting_analytics
    async fn ad_targeting_analytics_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdTargetingAnalyticsSlashGetPathParams,
      query_params: models::AdTargetingAnalyticsSlashGetQueryParams,
    ) -> Result<AdTargetingAnalyticsSlashGetResponse, String>;

    /// Get ad analytics.
    ///
    /// AdsSlashAnalytics - GET /v5/ad_accounts/{ad_account_id}/ads/analytics
    async fn ads_slash_analytics(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdsSlashAnalyticsPathParams,
      query_params: models::AdsSlashAnalyticsQueryParams,
    ) -> Result<AdsSlashAnalyticsResponse, String>;

    /// Create ads.
    ///
    /// AdsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/ads
    async fn ads_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdsSlashCreatePathParams,
            body: Vec<models::AdCreateRequest>,
    ) -> Result<AdsSlashCreateResponse, String>;

    /// Get ad.
    ///
    /// AdsSlashGet - GET /v5/ad_accounts/{ad_account_id}/ads/{ad_id}
    async fn ads_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdsSlashGetPathParams,
    ) -> Result<AdsSlashGetResponse, String>;

    /// List ads.
    ///
    /// AdsSlashList - GET /v5/ad_accounts/{ad_account_id}/ads
    async fn ads_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdsSlashListPathParams,
      query_params: models::AdsSlashListQueryParams,
    ) -> Result<AdsSlashListResponse, String>;

    /// Update ads.
    ///
    /// AdsSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/ads
    async fn ads_slash_update(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AdsSlashUpdatePathParams,
            body: Vec<models::AdUpdateRequest>,
    ) -> Result<AdsSlashUpdateResponse, String>;
}
