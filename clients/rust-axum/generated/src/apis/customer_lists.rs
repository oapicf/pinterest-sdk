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
pub enum CustomerListsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::CustomerList)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CustomerListsSlashGetResponse {
    /// Success
    Status200_Success
    (models::CustomerList)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CustomerListsSlashListResponse {
    /// Success
    Status200_Success
    (models::CustomerListsList200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CustomerListsSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::CustomerList)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// CustomerLists
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait CustomerLists {
    /// Create customer lists.
    ///
    /// CustomerListsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/customer_lists
    async fn customer_lists_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CustomerListsSlashCreatePathParams,
            body: models::CustomerListRequest,
    ) -> Result<CustomerListsSlashCreateResponse, String>;

    /// Get customer list.
    ///
    /// CustomerListsSlashGet - GET /v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}
    async fn customer_lists_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CustomerListsSlashGetPathParams,
    ) -> Result<CustomerListsSlashGetResponse, String>;

    /// Get customer lists.
    ///
    /// CustomerListsSlashList - GET /v5/ad_accounts/{ad_account_id}/customer_lists
    async fn customer_lists_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CustomerListsSlashListPathParams,
      query_params: models::CustomerListsSlashListQueryParams,
    ) -> Result<CustomerListsSlashListResponse, String>;

    /// Update customer list.
    ///
    /// CustomerListsSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}
    async fn customer_lists_slash_update(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::CustomerListsSlashUpdatePathParams,
            body: models::CustomerListUpdateRequest,
    ) -> Result<CustomerListsSlashUpdateResponse, String>;
}
