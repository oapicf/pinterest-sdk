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
pub enum ConversionTagsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::ConversionTagResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ConversionTagsSlashGetResponse {
    /// Success
    Status200_Success
    (models::ConversionTagResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ConversionTagsSlashListResponse {
    /// Success
    Status200_Success
    (models::ConversionTagListResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OcpmEligibleConversionTagsSlashGetResponse {
    /// Success
    Status200_Success
    (std::collections::HashMap<String, Vec<models::ConversionEventResponse>>)
    ,
    /// Unexpected errors
    Status0_UnexpectedErrors
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PageVisitConversionTagsSlashGetResponse {
    /// Success
    Status200_Success
    (models::PageVisitConversionTagsGet200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// ConversionTags
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait ConversionTags {
    /// Create conversion tag.
    ///
    /// ConversionTagsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/conversion_tags
    async fn conversion_tags_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::ConversionTagsSlashCreatePathParams,
            body: models::ConversionTagCreate,
    ) -> Result<ConversionTagsSlashCreateResponse, String>;

    /// Get conversion tag.
    ///
    /// ConversionTagsSlashGet - GET /v5/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}
    async fn conversion_tags_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::ConversionTagsSlashGetPathParams,
    ) -> Result<ConversionTagsSlashGetResponse, String>;

    /// Get conversion tags.
    ///
    /// ConversionTagsSlashList - GET /v5/ad_accounts/{ad_account_id}/conversion_tags
    async fn conversion_tags_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::ConversionTagsSlashListPathParams,
      query_params: models::ConversionTagsSlashListQueryParams,
    ) -> Result<ConversionTagsSlashListResponse, String>;

    /// Get Ocpm eligible conversion tags.
    ///
    /// OcpmEligibleConversionTagsSlashGet - GET /v5/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible
    async fn ocpm_eligible_conversion_tags_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::OcpmEligibleConversionTagsSlashGetPathParams,
    ) -> Result<OcpmEligibleConversionTagsSlashGetResponse, String>;

    /// Get page visit conversion tags.
    ///
    /// PageVisitConversionTagsSlashGet - GET /v5/ad_accounts/{ad_account_id}/conversion_tags/page_visit
    async fn page_visit_conversion_tags_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::PageVisitConversionTagsSlashGetPathParams,
      query_params: models::PageVisitConversionTagsSlashGetQueryParams,
    ) -> Result<PageVisitConversionTagsSlashGetResponse, String>;
}
