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
pub enum OauthSlashConversionTokenResponse {
    /// response
    Status200_Response
    (models::ConversionAccessTokenResponse)
    ,
    /// Unexpected error
    Status0_UnexpectedError
    (models::Error)
}

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

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum TokenSlashRevokeResponse {
    /// Successful token revocation. No content is returned.
    Status200_SuccessfulTokenRevocation
    ,
    /// Client authentication error.
    Status401_ClientAuthenticationError
    (models::Error)
    ,
    /// Client is not allowed to revoke token.
    Status403_ClientIsNotAllowedToRevokeToken
    (models::Error)
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

    /// Generate OAuth access token for conversion API.
    ///
    /// OauthSlashConversionToken - POST /v5/oauth/conversion_token
    async fn oauth_slash_conversion_token(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
    ) -> Result<OauthSlashConversionTokenResponse, E>;

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

    /// Revoke a token.
    ///
    /// TokenSlashRevoke - POST /v5/oauth/token/revoke
    async fn token_slash_revoke(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
            body: &models::TokenRevocationRequest,
    ) -> Result<TokenSlashRevokeResponse, E>;
}
