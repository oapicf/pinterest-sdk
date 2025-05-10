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
pub enum OauthSlashTokenResponse {
    /// response
    Status200_Response
    (models::OauthAccessTokenResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}


/// Oauth
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Oauth<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// Generate OAuth access token.
    ///
    /// OauthSlashToken - POST /v5/oauth/token
    async fn oauth_slash_token(
    &self,
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
            body: &models::OauthAccessTokenRequest,
    ) -> Result<OauthSlashTokenResponse, E>;
}
