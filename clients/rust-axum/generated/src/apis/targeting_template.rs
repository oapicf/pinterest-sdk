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
pub enum TargetingTemplateSlashCreateResponse {
    /// Success
    Status200_Success
    (models::TargetingTemplateGetResponseData)
    ,
    /// Invalid ad account id.
    Status400_InvalidAdAccountId
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum TargetingTemplateSlashListResponse {
    /// Success
    Status200_Success
    (models::TargetingTemplateList200Response)
    ,
    /// Invalid ad account id.
    Status400_InvalidAdAccountId
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum TargetingTemplateSlashUpdateResponse {
    /// Success
    Status200_Success
    ,
    /// Invalid ad account id.
    Status400_InvalidAdAccountId
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// TargetingTemplate
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait TargetingTemplate {
    /// Create targeting templates.
    ///
    /// TargetingTemplateSlashCreate - POST /v5/ad_accounts/{ad_account_id}/targeting_templates
    async fn targeting_template_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::TargetingTemplateSlashCreatePathParams,
            body: models::TargetingTemplateCreate,
    ) -> Result<TargetingTemplateSlashCreateResponse, String>;

    /// List targeting templates.
    ///
    /// TargetingTemplateSlashList - GET /v5/ad_accounts/{ad_account_id}/targeting_templates
    async fn targeting_template_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::TargetingTemplateSlashListPathParams,
      query_params: models::TargetingTemplateSlashListQueryParams,
    ) -> Result<TargetingTemplateSlashListResponse, String>;

    /// Update targeting templates.
    ///
    /// TargetingTemplateSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/targeting_templates
    async fn targeting_template_slash_update(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::TargetingTemplateSlashUpdatePathParams,
            body: models::TargetingTemplateUpdateRequest,
    ) -> Result<TargetingTemplateSlashUpdateResponse, String>;
}
