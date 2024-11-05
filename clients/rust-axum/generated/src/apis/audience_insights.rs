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
pub enum AudienceInsightsScopeAndTypeSlashGetResponse {
    /// Success
    Status200_Success
    (models::AudienceDefinitionResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AudienceInsightsSlashGetResponse {
    /// Success
    Status200_Success
    (models::AudienceInsightsResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// AudienceInsights
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait AudienceInsights {
    /// Get audience insights scope and type.
    ///
    /// AudienceInsightsScopeAndTypeSlashGet - GET /v5/ad_accounts/{ad_account_id}/insights/audiences
    async fn audience_insights_scope_and_type_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AudienceInsightsScopeAndTypeSlashGetPathParams,
    ) -> Result<AudienceInsightsScopeAndTypeSlashGetResponse, String>;

    /// Get audience insights.
    ///
    /// AudienceInsightsSlashGet - GET /v5/ad_accounts/{ad_account_id}/audience_insights
    async fn audience_insights_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::AudienceInsightsSlashGetPathParams,
      query_params: models::AudienceInsightsSlashGetQueryParams,
    ) -> Result<AudienceInsightsSlashGetResponse, String>;
}
