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
pub enum OrderLinesSlashGetResponse {
    /// Success
    Status200_Success
    (models::OrderLine)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrderLinesSlashListResponse {
    /// Success
    Status200_Success
    (models::OrderLinesList200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// OrderLines
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait OrderLines {
    /// Get order line.
    ///
    /// OrderLinesSlashGet - GET /v5/ad_accounts/{ad_account_id}/order_lines/{order_line_id}
    async fn order_lines_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::OrderLinesSlashGetPathParams,
    ) -> Result<OrderLinesSlashGetResponse, String>;

    /// Get order lines.
    ///
    /// OrderLinesSlashList - GET /v5/ad_accounts/{ad_account_id}/order_lines
    async fn order_lines_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::OrderLinesSlashListPathParams,
      query_params: models::OrderLinesSlashListQueryParams,
    ) -> Result<OrderLinesSlashListResponse, String>;
}
