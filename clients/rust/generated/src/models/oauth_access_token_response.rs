/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;

/// OauthAccessTokenResponse : A successful OAuth access token response.
#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
#[serde(tag = "response_type")]
pub enum OauthAccessTokenResponse {
    #[serde(rename="authorization_code")]
    OauthAccessTokenResponseCode {
        #[serde(rename = "access_token")]
        access_token: String,
        #[serde(rename = "token_type")]
        token_type: String,
        #[serde(rename = "expires_in")]
        expires_in: i32,
        #[serde(rename = "scope")]
        scope: String,
    },
    #[serde(rename="everlasting_refresh")]
    OauthAccessTokenResponseEverlastingRefresh {
        #[serde(rename = "access_token")]
        access_token: String,
        #[serde(rename = "token_type")]
        token_type: String,
        #[serde(rename = "expires_in")]
        expires_in: i32,
        #[serde(rename = "scope")]
        scope: String,
    },
    #[serde(rename="integration_refresh")]
    OauthAccessTokenResponseIntegrationRefresh {
        #[serde(rename = "access_token")]
        access_token: String,
        #[serde(rename = "token_type")]
        token_type: String,
        #[serde(rename = "expires_in")]
        expires_in: i32,
        #[serde(rename = "scope")]
        scope: String,
    },
    #[serde(rename="refresh_token")]
    OauthAccessTokenResponseRefresh {
        #[serde(rename = "access_token")]
        access_token: String,
        #[serde(rename = "token_type")]
        token_type: String,
        #[serde(rename = "expires_in")]
        expires_in: i32,
        #[serde(rename = "scope")]
        scope: String,
    },
}

impl Default for OauthAccessTokenResponse {
    fn default() -> Self {
        Self::OauthAccessTokenResponseCode {
            access_token: Default::default(),
            token_type: Default::default(),
            expires_in: Default::default(),
            scope: Default::default(),
        }
        
    }
}

