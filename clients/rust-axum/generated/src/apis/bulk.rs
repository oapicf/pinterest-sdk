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
pub enum BulkDownloadSlashCreateResponse {
    /// Success
    Status200_Success
    (models::BulkDownloadResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BulkRequestSlashGetResponse {
    /// Success
    Status200_Success
    (models::BulkUpsertStatusResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum BulkUpsertSlashCreateResponse {
    /// Success
    Status200_Success
    (models::BulkUpsertResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// Bulk
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Bulk<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// Get advertiser entities in bulk.
    ///
    /// BulkDownloadSlashCreate - POST /v5/ad_accounts/{ad_account_id}/bulk/download
    async fn bulk_download_slash_create(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::BulkDownloadSlashCreatePathParams,
            body: &models::BulkDownloadRequest,
    ) -> Result<BulkDownloadSlashCreateResponse, E>;

    /// Download advertiser entities in bulk.
    ///
    /// BulkRequestSlashGet - GET /v5/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}
    async fn bulk_request_slash_get(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::BulkRequestSlashGetPathParams,
      query_params: &models::BulkRequestSlashGetQueryParams,
    ) -> Result<BulkRequestSlashGetResponse, E>;

    /// Create/update ad entities in bulk.
    ///
    /// BulkUpsertSlashCreate - POST /v5/ad_accounts/{ad_account_id}/bulk/upsert
    async fn bulk_upsert_slash_create(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::BulkUpsertSlashCreatePathParams,
            body: &models::BulkUpsertRequest,
    ) -> Result<BulkUpsertSlashCreateResponse, E>;
}
