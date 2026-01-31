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
pub enum PromotionsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::PromotionsResponse)
    ,
    /// Invalid create promotions request parameters.
    Status400_InvalidCreatePromotionsRequestParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PromotionsSlashDeleteResponse {
    /// Promotion deleted successfully
    Status204_PromotionDeletedSuccessfully
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PromotionsSlashGetResponse {
    /// Success
    Status200_Success
    (models::PromotionResponse)
    ,
    /// The promotion ID for the given ad account ID was not found.
    Status404_ThePromotionIDForTheGivenAdAccountIDWasNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PromotionsSlashListResponse {
    /// Success
    Status200_Success
    (models::PromotionsList200Response)
    ,
    /// Invalid ad account promotions parameters.
    Status400_InvalidAdAccountPromotionsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum PromotionsSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::PromotionsResponse)
    ,
    /// Invalid create promotions request parameters.
    Status400_InvalidCreatePromotionsRequestParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}




/// Promotions
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Promotions<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// Create promotions.
    ///
    /// PromotionsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/promotions
    async fn promotions_slash_create(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::PromotionsSlashCreatePathParams,
            body: &Vec<models::PromotionCreateRequest>,
    ) -> Result<PromotionsSlashCreateResponse, E>;

    /// Delete promotion by id.
    ///
    /// PromotionsSlashDelete - DELETE /v5/ad_accounts/{ad_account_id}/promotions/{promotion_id}
    async fn promotions_slash_delete(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::PromotionsSlashDeletePathParams,
    ) -> Result<PromotionsSlashDeleteResponse, E>;

    /// Get promotion by id.
    ///
    /// PromotionsSlashGet - GET /v5/ad_accounts/{ad_account_id}/promotions/{promotion_id}
    async fn promotions_slash_get(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::PromotionsSlashGetPathParams,
    ) -> Result<PromotionsSlashGetResponse, E>;

    /// Get promotions.
    ///
    /// PromotionsSlashList - GET /v5/ad_accounts/{ad_account_id}/promotions
    async fn promotions_slash_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::PromotionsSlashListPathParams,
      query_params: &models::PromotionsSlashListQueryParams,
    ) -> Result<PromotionsSlashListResponse, E>;

    /// Update promotions.
    ///
    /// PromotionsSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/promotions
    async fn promotions_slash_update(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::PromotionsSlashUpdatePathParams,
            body: &Vec<models::PromotionUpdateRequest>,
    ) -> Result<PromotionsSlashUpdateResponse, E>;
}
