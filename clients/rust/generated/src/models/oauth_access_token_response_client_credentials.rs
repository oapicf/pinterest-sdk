/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

/// OauthAccessTokenResponseClientCredentials : A successful OAuth client token response for the client token flow.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct OauthAccessTokenResponseClientCredentials {
    #[serde(rename = "response_type", skip_serializing_if = "Option::is_none")]
    pub response_type: Option<ResponseType>,
    #[serde(rename = "access_token")]
    pub access_token: String,
    #[serde(rename = "token_type")]
    pub token_type: String,
    #[serde(rename = "expires_in")]
    pub expires_in: i32,
    #[serde(rename = "scope")]
    pub scope: String,
}

impl OauthAccessTokenResponseClientCredentials {
    /// A successful OAuth client token response for the client token flow.
    pub fn new(access_token: String, token_type: String, expires_in: i32, scope: String) -> OauthAccessTokenResponseClientCredentials {
        OauthAccessTokenResponseClientCredentials {
            response_type: None,
            access_token,
            token_type,
            expires_in,
            scope,
        }
    }
}
/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum ResponseType {
    #[serde(rename = "authorization_code")]
    AuthorizationCode,
    #[serde(rename = "refresh_token")]
    RefreshToken,
    #[serde(rename = "client_credentials")]
    ClientCredentials,
}

impl Default for ResponseType {
    fn default() -> ResponseType {
        Self::AuthorizationCode
    }
}

