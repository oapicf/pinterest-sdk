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
pub enum TermsOfServiceSlashGetResponse {
    /// Success
    Status200_Success
    (models::TermsOfService)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// TermsOfService
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait TermsOfService {
    /// Get terms of service.
    ///
    /// TermsOfServiceSlashGet - GET /v5/ad_accounts/{ad_account_id}/terms_of_service
    async fn terms_of_service_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::TermsOfServiceSlashGetPathParams,
      query_params: models::TermsOfServiceSlashGetQueryParams,
    ) -> Result<TermsOfServiceSlashGetResponse, String>;
}
