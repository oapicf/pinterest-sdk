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
pub enum MediaSlashCreateResponse {
    /// response
    Status201_Response
    (models::MediaUpload)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MediaSlashGetResponse {
    /// response
    Status200_Response
    (models::MediaUploadDetails)
    ,
    /// Media upload not found
    Status404_MediaUploadNotFound
    (models::Error)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MediaSlashListResponse {
    /// response
    Status200_Response
    (models::MediaList200Response)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// Media
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Media {
    /// Register media upload.
    ///
    /// MediaSlashCreate - POST /v5/media
    async fn media_slash_create(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
            body: models::MediaUploadRequest,
    ) -> Result<MediaSlashCreateResponse, String>;

    /// Get media upload details.
    ///
    /// MediaSlashGet - GET /v5/media/{media_id}
    async fn media_slash_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::MediaSlashGetPathParams,
    ) -> Result<MediaSlashGetResponse, String>;

    /// List media uploads.
    ///
    /// MediaSlashList - GET /v5/media
    async fn media_slash_list(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::MediaSlashListQueryParams,
    ) -> Result<MediaSlashListResponse, String>;
}
