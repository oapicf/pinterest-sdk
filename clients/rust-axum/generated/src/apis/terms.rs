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
pub enum TermsRelatedSlashListResponse {
    /// Success
    Status200_Success
    (models::RelatedTerms)
    ,
    /// Invalid terms related parameters.
    Status400_InvalidTermsRelatedParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum TermsSuggestedSlashListResponse {
    /// Success
    Status200_Success
    (Vec<String>)
    ,
    /// Invalid terms suggested parameters.
    Status400_InvalidTermsSuggestedParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// Terms
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Terms {
    /// List related terms.
    ///
    /// TermsRelatedSlashList - GET /v5/terms/related
    async fn terms_related_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::TermsRelatedSlashListQueryParams,
    ) -> Result<TermsRelatedSlashListResponse, String>;

    /// List suggested terms.
    ///
    /// TermsSuggestedSlashList - GET /v5/terms/suggested
    async fn terms_suggested_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::TermsSuggestedSlashListQueryParams,
    ) -> Result<TermsSuggestedSlashListResponse, String>;
}
