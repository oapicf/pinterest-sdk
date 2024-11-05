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
pub enum IntegrationsCommerceSlashDelResponse {
    /// Commerce Integration deleted successfully
    Status204_CommerceIntegrationDeletedSuccessfully
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum IntegrationsCommerceSlashGetResponse {
    /// Success
    Status200_Success
    (models::IntegrationMetadata)
    ,
    /// Integration not found.
    Status404_IntegrationNotFound
    (models::Error)
    ,
    /// Can't access this integration metadata.
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
pub enum IntegrationsCommerceSlashPatchResponse {
    /// Success
    Status200_Success
    (models::IntegrationMetadata)
    ,
    /// Integration not found.
    Status404_IntegrationNotFound
    (models::Error)
    ,
    /// Can't access this integration metadata.
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
pub enum IntegrationsCommerceSlashPostResponse {
    /// Success
    Status200_Success
    (models::IntegrationMetadata)
    ,
    /// Integration not found.
    Status404_IntegrationNotFound
    (models::Error)
    ,
    /// Can't access this integration metadata.
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
pub enum IntegrationsLogsSlashPostResponse {
    /// Success.
    Status200_Success
    (models::IntegrationLogsSuccessResponse)
    ,
    /// Bad request.
    Status400_BadRequest
    (models::DetailedError)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum IntegrationsSlashGetByIdResponse {
    /// Success
    Status200_Success
    (models::IntegrationRecord)
    ,
    /// Integration not found.
    Status404_IntegrationNotFound
    (models::Error)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum IntegrationsSlashGetListResponse {
    /// Success
    Status200_Success
    (models::IntegrationsGetList200Response)
    ,
    /// Unexpected error.
    Status0_UnexpectedError
    (models::Error)
}


/// Integrations
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Integrations {
    /// Delete commerce integration.
    ///
    /// IntegrationsCommerceSlashDel - DELETE /v5/integrations/commerce/{external_business_id}
    async fn integrations_commerce_slash_del(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::IntegrationsCommerceSlashDelPathParams,
    ) -> Result<IntegrationsCommerceSlashDelResponse, String>;

    /// Get commerce integration.
    ///
    /// IntegrationsCommerceSlashGet - GET /v5/integrations/commerce/{external_business_id}
    async fn integrations_commerce_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::IntegrationsCommerceSlashGetPathParams,
    ) -> Result<IntegrationsCommerceSlashGetResponse, String>;

    /// Update commerce integration.
    ///
    /// IntegrationsCommerceSlashPatch - PATCH /v5/integrations/commerce/{external_business_id}
    async fn integrations_commerce_slash_patch(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::IntegrationsCommerceSlashPatchPathParams,
            body: Option<models::IntegrationRequestPatch>,
    ) -> Result<IntegrationsCommerceSlashPatchResponse, String>;

    /// Create commerce integration.
    ///
    /// IntegrationsCommerceSlashPost - POST /v5/integrations/commerce
    async fn integrations_commerce_slash_post(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
            body: Option<models::IntegrationRequest>,
    ) -> Result<IntegrationsCommerceSlashPostResponse, String>;

    /// Receives batched logs from integration applications..
    ///
    /// IntegrationsLogsSlashPost - POST /v5/integrations/logs
    async fn integrations_logs_slash_post(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
            body: models::IntegrationLogsRequest,
    ) -> Result<IntegrationsLogsSlashPostResponse, String>;

    /// Get integration metadata.
    ///
    /// IntegrationsSlashGetById - GET /v5/integrations/{id}
    async fn integrations_slash_get_by_id(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::IntegrationsSlashGetByIdPathParams,
    ) -> Result<IntegrationsSlashGetByIdResponse, String>;

    /// Get integration metadata list.
    ///
    /// IntegrationsSlashGetList - GET /v5/integrations
    async fn integrations_slash_get_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::IntegrationsSlashGetListQueryParams,
    ) -> Result<IntegrationsSlashGetListResponse, String>;
}
