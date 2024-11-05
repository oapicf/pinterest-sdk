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
pub enum CountryKeywordsMetricsSlashGetResponse {
    /// Success
    Status200_Success
    (models::KeywordsMetricsArrayResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum KeywordsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::KeywordsResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum KeywordsSlashGetResponse {
    /// Success
    Status200_Success
    (models::KeywordsGet200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum KeywordsSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::KeywordsResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum TrendingKeywordsSlashListResponse {
    /// Success
    Status200_Success
    (models::TrendingKeywordsResponse)
    ,
    /// Invalid trending keywords request parameters
    Status400_InvalidTrendingKeywordsRequestParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// Keywords
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Keywords {
    /// Get country's keyword metrics.
    ///
    /// CountryKeywordsMetricsSlashGet - GET /v5/ad_accounts/{ad_account_id}/keywords/metrics
    async fn country_keywords_metrics_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CountryKeywordsMetricsSlashGetPathParams,
      query_params: models::CountryKeywordsMetricsSlashGetQueryParams,
    ) -> Result<CountryKeywordsMetricsSlashGetResponse, String>;

    /// Create keywords.
    ///
    /// KeywordsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/keywords
    async fn keywords_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::KeywordsSlashCreatePathParams,
            body: models::KeywordsRequest,
    ) -> Result<KeywordsSlashCreateResponse, String>;

    /// Get keywords.
    ///
    /// KeywordsSlashGet - GET /v5/ad_accounts/{ad_account_id}/keywords
    async fn keywords_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::KeywordsSlashGetPathParams,
      query_params: models::KeywordsSlashGetQueryParams,
    ) -> Result<KeywordsSlashGetResponse, String>;

    /// Update keywords.
    ///
    /// KeywordsSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/keywords
    async fn keywords_slash_update(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::KeywordsSlashUpdatePathParams,
            body: models::KeywordUpdateBody,
    ) -> Result<KeywordsSlashUpdateResponse, String>;

    /// List trending keywords.
    ///
    /// TrendingKeywordsSlashList - GET /v5/trends/keywords/{region}/top/{trend_type}
    async fn trending_keywords_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::TrendingKeywordsSlashListPathParams,
      query_params: models::TrendingKeywordsSlashListQueryParams,
    ) -> Result<TrendingKeywordsSlashListResponse, String>;
}
