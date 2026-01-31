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
pub enum CatalogsProductGroupPinsSlashListResponse {
    /// Success
    Status200_Success
    (models::CatalogsProductGroupPinsList200Response)
    ,
    /// Invalid parameters.
    Status400_InvalidParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Catalogs product group not found.
    Status404_CatalogsProductGroupNotFound
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashCreateResponse {
    /// Success
    Status201_Success
    (models::CatalogsVerticalProductGroup)
    ,
    /// Invalid body.
    Status400_InvalidBody
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Conflict. Can't create this catalogs product group with this value.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashCreateManyResponse {
    /// Success
    Status201_Success
    (Vec<String>)
    ,
    /// Invalid body.
    Status400_InvalidBody
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Conflict. Can't create this catalogs product group with this value.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashDeleteResponse {
    /// Catalogs Product Group deleted successfully.
    Status204_CatalogsProductGroupDeletedSuccessfully
    ,
    /// Invalid catalogs product group id parameters.
    Status400_InvalidCatalogsProductGroupIdParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Catalogs product group not found.
    Status404_CatalogsProductGroupNotFound
    (models::Error)
    ,
    /// Conflict. Can't delete this catalogs product group.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashDeleteManyResponse {
    /// Catalogs Product Groups deleted successfully.
    Status204_CatalogsProductGroupsDeletedSuccessfully
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Catalogs product group not found.
    Status404_CatalogsProductGroupNotFound
    (models::Error)
    ,
    /// Conflict. Can't delete this catalogs product group.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashGetResponse {
    /// Success
    Status200_Success
    (models::CatalogsVerticalProductGroup)
    ,
    /// Invalid catalogs product group id parameters.
    Status400_InvalidCatalogsProductGroupIdParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Catalogs product group not found.
    Status404_CatalogsProductGroupNotFound
    (models::Error)
    ,
    /// Conflict. Can't get a catalogs product group without an existing catalog.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashListResponse {
    /// Success
    Status200_Success
    (models::CatalogsProductGroupsList200Response)
    ,
    /// Invalid feed parameters.
    Status400_InvalidFeedParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Data feed not found.
    Status404_DataFeedNotFound
    (models::Error)
    ,
    /// Conflict. Can't create this catalogs product group with this value.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashProductCountsGetResponse {
    /// Success
    Status200_Success
    (models::CatalogsProductGroupProductCountsVertical)
    ,
    /// Product Group Not Found.
    Status404_ProductGroupNotFound
    (models::Error)
    ,
    /// Can't access this feature without an existing catalog.
    Status409_Can
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsProductGroupsSlashUpdateResponse {
    /// Success
    Status200_Success
    (models::CatalogsVerticalProductGroup)
    ,
    /// Invalid parameters.
    Status400_InvalidParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not approved for catalog product group mutations yet.
    Status403_Forbidden
    (models::Error)
    ,
    /// Catalogs product group not found.
    Status404_CatalogsProductGroupNotFound
    (models::Error)
    ,
    /// Conflict. Can't update this catalogs product group to this value.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ProductsByProductGroupFilterSlashListResponse {
    /// Success
    Status200_Success
    (models::CatalogsProductGroupPinsList200Response)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Conflict. Can't get products.
    Status409_Conflict
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}




/// CatalogProductGroups
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait CatalogProductGroups<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// List products by product group.
    ///
    /// CatalogsProductGroupPinsSlashList - GET /v5/catalogs/product_groups/{product_group_id}/products
    async fn catalogs_product_group_pins_slash_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::CatalogsProductGroupPinsSlashListPathParams,
      query_params: &models::CatalogsProductGroupPinsSlashListQueryParams,
    ) -> Result<CatalogsProductGroupPinsSlashListResponse, E>;

    /// Create product group.
    ///
    /// CatalogsProductGroupsSlashCreate - POST /v5/catalogs/product_groups
    async fn catalogs_product_groups_slash_create(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::CatalogsProductGroupsSlashCreateQueryParams,
            body: &models::MultipleProductGroupsInner,
    ) -> Result<CatalogsProductGroupsSlashCreateResponse, E>;

    /// Create product groups.
    ///
    /// CatalogsProductGroupsSlashCreateMany - POST /v5/catalogs/product_groups/multiple
    async fn catalogs_product_groups_slash_create_many(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::CatalogsProductGroupsSlashCreateManyQueryParams,
            body: &Vec<models::MultipleProductGroupsInner>,
    ) -> Result<CatalogsProductGroupsSlashCreateManyResponse, E>;

    /// Delete product group.
    ///
    /// CatalogsProductGroupsSlashDelete - DELETE /v5/catalogs/product_groups/{product_group_id}
    async fn catalogs_product_groups_slash_delete(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::CatalogsProductGroupsSlashDeletePathParams,
      query_params: &models::CatalogsProductGroupsSlashDeleteQueryParams,
    ) -> Result<CatalogsProductGroupsSlashDeleteResponse, E>;

    /// Delete product groups.
    ///
    /// CatalogsProductGroupsSlashDeleteMany - DELETE /v5/catalogs/product_groups/multiple
    async fn catalogs_product_groups_slash_delete_many(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::CatalogsProductGroupsSlashDeleteManyQueryParams,
    ) -> Result<CatalogsProductGroupsSlashDeleteManyResponse, E>;

    /// Get product group.
    ///
    /// CatalogsProductGroupsSlashGet - GET /v5/catalogs/product_groups/{product_group_id}
    async fn catalogs_product_groups_slash_get(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::CatalogsProductGroupsSlashGetPathParams,
      query_params: &models::CatalogsProductGroupsSlashGetQueryParams,
    ) -> Result<CatalogsProductGroupsSlashGetResponse, E>;

    /// List product groups.
    ///
    /// CatalogsProductGroupsSlashList - GET /v5/catalogs/product_groups
    async fn catalogs_product_groups_slash_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::CatalogsProductGroupsSlashListQueryParams,
    ) -> Result<CatalogsProductGroupsSlashListResponse, E>;

    /// Get product counts.
    ///
    /// CatalogsProductGroupsSlashProductCountsGet - GET /v5/catalogs/product_groups/{product_group_id}/product_counts
    async fn catalogs_product_groups_slash_product_counts_get(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::CatalogsProductGroupsSlashProductCountsGetPathParams,
      query_params: &models::CatalogsProductGroupsSlashProductCountsGetQueryParams,
    ) -> Result<CatalogsProductGroupsSlashProductCountsGetResponse, E>;

    /// Update single product group.
    ///
    /// CatalogsProductGroupsSlashUpdate - PATCH /v5/catalogs/product_groups/{product_group_id}
    async fn catalogs_product_groups_slash_update(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::CatalogsProductGroupsSlashUpdatePathParams,
      query_params: &models::CatalogsProductGroupsSlashUpdateQueryParams,
            body: &models::CatalogsProductGroupsUpdateRequest,
    ) -> Result<CatalogsProductGroupsSlashUpdateResponse, E>;

    /// List products by filter.
    ///
    /// ProductsByProductGroupFilterSlashList - POST /v5/catalogs/products/get_by_product_group_filters
    async fn products_by_product_group_filter_slash_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::ProductsByProductGroupFilterSlashListQueryParams,
            body: &models::CatalogsListProductsByFilterRequest,
    ) -> Result<ProductsByProductGroupFilterSlashListResponse, E>;
}
