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
pub enum CatalogsSlashAvailableFilterValuesResponse {
    /// Success
    Status200_Success
    (models::CatalogsAvailableFilterValues)
    ,
    /// Invalid parameters.
    Status400_InvalidParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Forbidden. Account not authorized to access available filter values.
    Status403_Forbidden
    (models::Error)
    ,
    /// Data feed not found.
    Status404_DataFeedNotFound
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
pub enum CatalogsSlashCreateResponse {
    /// Success
    Status200_Success
    (models::Catalog)
    ,
    /// Invalid parameters.
    Status400_InvalidParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CatalogsSlashListResponse {
    /// Success
    Status200_Success
    (models::CatalogsList200Response)
    ,
    /// Invalid parameters.
    Status400_InvalidParameters
    (models::Error)
    ,
    /// Unauthorized access.
    Status401_UnauthorizedAccess
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}




/// Catalogs
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Catalogs<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// List available filter values.
    ///
    /// CatalogsSlashAvailableFilterValues - GET /v5/catalogs/available_filter_values
    async fn catalogs_slash_available_filter_values(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::CatalogsSlashAvailableFilterValuesQueryParams,
    ) -> Result<CatalogsSlashAvailableFilterValuesResponse, E>;

    /// Create catalog.
    ///
    /// CatalogsSlashCreate - POST /v5/catalogs
    async fn catalogs_slash_create(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::CatalogsSlashCreateQueryParams,
            body: &models::CatalogsCreateRequest,
    ) -> Result<CatalogsSlashCreateResponse, E>;

    /// List catalogs.
    ///
    /// CatalogsSlashList - GET /v5/catalogs
    async fn catalogs_slash_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      query_params: &models::CatalogsSlashListQueryParams,
    ) -> Result<CatalogsSlashListResponse, E>;
}
