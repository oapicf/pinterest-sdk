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
pub enum ItemsBatchSlashGetResponse {
    /// Response containing the requested catalogs items batch
    Status200_ResponseContainingTheRequestedCatalogsItemsBatch
    (models::CatalogsItemsBatch)
    ,
    /// Not authenticated to access catalogs items batch
    Status401_NotAuthenticatedToAccessCatalogsItemsBatch
    (models::Error)
    ,
    /// Not authorized to access catalogs items batch
    Status403_NotAuthorizedToAccessCatalogsItemsBatch
    (models::Error)
    ,
    /// Catalogs items batch not found
    Status404_CatalogsItemsBatchNotFound
    (models::Error)
    ,
    /// Method Not Allowed.
    Status405_MethodNotAllowed
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemsBatchSlashPostResponse {
    /// Response containing the requested catalogs items batch
    Status200_ResponseContainingTheRequestedCatalogsItemsBatch
    (models::CatalogsItemsBatch)
    ,
    /// Invalid request parameters.
    Status400_InvalidRequestParameters
    (models::Error)
    ,
    /// Not authenticated to post catalogs items
    Status401_NotAuthenticatedToPostCatalogsItems
    (models::Error)
    ,
    /// Not authorized to post catalogs items
    Status403_NotAuthorizedToPostCatalogsItems
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ItemsSlashPostResponse {
    /// Response containing the requested catalogs items
    Status200_ResponseContainingTheRequestedCatalogsItems
    (models::CatalogsItems)
    ,
    /// Invalid request
    Status400_InvalidRequest
    (models::Error)
    ,
    /// Not authorized to access catalogs items
    Status401_NotAuthorizedToAccessCatalogsItems
    (models::Error)
    ,
    /// Not authorized to access catalogs items
    Status403_NotAuthorizedToAccessCatalogsItems
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}




/// CatalogItems
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait CatalogItems<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// Get item batch status.
    ///
    /// ItemsBatchSlashGet - GET /v5/catalogs/items/batch/{batch_id}
    async fn items_batch_slash_get(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::ItemsBatchSlashGetPathParams,
      query_params: &models::ItemsBatchSlashGetQueryParams,
    ) -> Result<ItemsBatchSlashGetResponse, E>;

    /// Operate on item batch.
    ///
    /// ItemsBatchSlashPost - POST /v5/catalogs/items/batch
    async fn items_batch_slash_post(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::ItemsBatchSlashPostQueryParams,
            body: &models::ItemsBatchPostRequest,
    ) -> Result<ItemsBatchSlashPostResponse, E>;

    /// Get catalogs items (POST).
    ///
    /// ItemsSlashPost - POST /v5/catalogs/items
    async fn items_slash_post(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::ItemsSlashPostQueryParams,
            body: &models::CatalogsItemsRequest,
    ) -> Result<ItemsSlashPostResponse, E>;
}
