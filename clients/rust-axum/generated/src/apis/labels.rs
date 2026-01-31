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
pub enum LabelsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::LabelsResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LabelsSlashListResponse {
    /// Success
    Status200_Success
    (models::LabelsList200Response)
    ,
    /// Invalid ad account ads parameters.
    Status400_InvalidAdAccountAdsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum LabelsSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::LabelsResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}




/// Labels
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Labels<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// Create labels.
    ///
    /// LabelsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/labels
    async fn labels_slash_create(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::LabelsSlashCreatePathParams,
            body: &models::LabelCreateRequest,
    ) -> Result<LabelsSlashCreateResponse, E>;

    /// List labels.
    ///
    /// LabelsSlashList - GET /v5/ad_accounts/{ad_account_id}/labels
    async fn labels_slash_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::LabelsSlashListPathParams,
      query_params: &models::LabelsSlashListQueryParams,
    ) -> Result<LabelsSlashListResponse, E>;

    /// Update labels.
    ///
    /// LabelsSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/labels
    async fn labels_slash_update(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::LabelsSlashUpdatePathParams,
            body: &models::LabelUpdateRequest,
    ) -> Result<LabelsSlashUpdateResponse, E>;
}
