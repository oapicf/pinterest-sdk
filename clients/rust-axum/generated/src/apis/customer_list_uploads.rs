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
pub enum CustomerListUploadsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::CustomerListUploadCreateResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CustomerListUploadsSlashGetResponse {
    /// Success
    Status200_Success
    (models::CustomerListUploadResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CustomerListUploadsSlashRunResponse {
    /// Success
    Status200_Success
    (models::CustomerListUploadResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}




/// CustomerListUploads
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait CustomerListUploads<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// Create customer list upload.
    ///
    /// CustomerListUploadsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads
    async fn customer_list_uploads_slash_create(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::CustomerListUploadsSlashCreatePathParams,
            body: &models::CustomerListUploadCreateRequest,
    ) -> Result<CustomerListUploadsSlashCreateResponse, E>;

    /// Get customer list upload.
    ///
    /// CustomerListUploadsSlashGet - GET /v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}
    async fn customer_list_uploads_slash_get(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::CustomerListUploadsSlashGetPathParams,
    ) -> Result<CustomerListUploadsSlashGetResponse, E>;

    /// Run customer list upload.
    ///
    /// CustomerListUploadsSlashRun - POST /v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run
    async fn customer_list_uploads_slash_run(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::CustomerListUploadsSlashRunPathParams,
    ) -> Result<CustomerListUploadsSlashRunResponse, E>;
}
