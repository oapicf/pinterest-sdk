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
pub enum AudiencesSlashCreateResponse {
    /// Success
    Status200_Success
    (models::Audience)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AudiencesSlashCreateCustomResponse {
    /// Success
    Status200_Success
    (models::Audience)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AudiencesSlashGetResponse {
    /// Success
    Status200_Success
    (models::Audience)
    ,
    /// Audience not found.
    Status404_AudienceNotFound
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AudiencesSlashListResponse {
    /// Success
    Status200_Success
    (models::AudiencesList200Response)
    ,
    /// Invalid ad account audience parameters.
    Status400_InvalidAdAccountAudienceParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AudiencesSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::Audience)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// Audiences
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Audiences {
    /// Create audience.
    ///
    /// AudiencesSlashCreate - POST /v5/ad_accounts/{ad_account_id}/audiences
    async fn audiences_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AudiencesSlashCreatePathParams,
            body: models::AudienceCreateRequest,
    ) -> Result<AudiencesSlashCreateResponse, String>;

    /// Create custom audience.
    ///
    /// AudiencesSlashCreateCustom - POST /v5/ad_accounts/{ad_account_id}/audiences/custom
    async fn audiences_slash_create_custom(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AudiencesSlashCreateCustomPathParams,
            body: models::AudienceCreateCustomRequest,
    ) -> Result<AudiencesSlashCreateCustomResponse, String>;

    /// Get audience.
    ///
    /// AudiencesSlashGet - GET /v5/ad_accounts/{ad_account_id}/audiences/{audience_id}
    async fn audiences_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AudiencesSlashGetPathParams,
    ) -> Result<AudiencesSlashGetResponse, String>;

    /// List audiences.
    ///
    /// AudiencesSlashList - GET /v5/ad_accounts/{ad_account_id}/audiences
    async fn audiences_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AudiencesSlashListPathParams,
      query_params: models::AudiencesSlashListQueryParams,
    ) -> Result<AudiencesSlashListResponse, String>;

    /// Update audience.
    ///
    /// AudiencesSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/audiences/{audience_id}
    async fn audiences_slash_update(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AudiencesSlashUpdatePathParams,
            body: Option<models::AudienceUpdateRequest>,
    ) -> Result<AudiencesSlashUpdateResponse, String>;
}
