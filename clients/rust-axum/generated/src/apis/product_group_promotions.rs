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
pub enum ProductGroupPromotionsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::ProductGroupPromotionResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ProductGroupPromotionsSlashGetResponse {
    /// Success
    Status200_Success
    (models::ProductGroupPromotionResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ProductGroupPromotionsSlashListResponse {
    /// Success
    Status200_Success
    (models::ProductGroupPromotionsList200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ProductGroupPromotionsSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::ProductGroupPromotionResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ProductGroupsSlashAnalyticsResponse {
    /// Success
    Status200_Success
    (Vec<models::ProductGroupAnalyticsResponseInner>)
    ,
    /// Invalid ad account ads analytics parameters.
    Status400_InvalidAdAccountAdsAnalyticsParameters
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// ProductGroupPromotions
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait ProductGroupPromotions {
    /// Create product group promotions.
    ///
    /// ProductGroupPromotionsSlashCreate - POST /v5/ad_accounts/{ad_account_id}/product_group_promotions
    async fn product_group_promotions_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::ProductGroupPromotionsSlashCreatePathParams,
            body: models::ProductGroupPromotionCreateRequest,
    ) -> Result<ProductGroupPromotionsSlashCreateResponse, String>;

    /// Get a product group promotion by id.
    ///
    /// ProductGroupPromotionsSlashGet - GET /v5/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}
    async fn product_group_promotions_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::ProductGroupPromotionsSlashGetPathParams,
    ) -> Result<ProductGroupPromotionsSlashGetResponse, String>;

    /// Get product group promotions.
    ///
    /// ProductGroupPromotionsSlashList - GET /v5/ad_accounts/{ad_account_id}/product_group_promotions
    async fn product_group_promotions_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::ProductGroupPromotionsSlashListPathParams,
      query_params: models::ProductGroupPromotionsSlashListQueryParams,
    ) -> Result<ProductGroupPromotionsSlashListResponse, String>;

    /// Update product group promotions.
    ///
    /// ProductGroupPromotionsSlashUpdate - PATCH /v5/ad_accounts/{ad_account_id}/product_group_promotions
    async fn product_group_promotions_slash_update(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::ProductGroupPromotionsSlashUpdatePathParams,
            body: models::ProductGroupPromotionUpdateRequest,
    ) -> Result<ProductGroupPromotionsSlashUpdateResponse, String>;

    /// Get product group analytics.
    ///
    /// ProductGroupsSlashAnalytics - GET /v5/ad_accounts/{ad_account_id}/product_groups/analytics
    async fn product_groups_slash_analytics(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::ProductGroupsSlashAnalyticsPathParams,
      query_params: models::ProductGroupsSlashAnalyticsQueryParams,
    ) -> Result<ProductGroupsSlashAnalyticsResponse, String>;
}
