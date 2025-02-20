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

/// UserWebsiteVerifyRequest : User website verification request
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct UserWebsiteVerifyRequest {
    #[serde(rename = "website", skip_serializing_if = "Option::is_none")]
    pub website: Option<String>,
    #[serde(rename = "verification_method", skip_serializing_if = "Option::is_none")]
    pub verification_method: Option<VerificationMethod>,
}

impl UserWebsiteVerifyRequest {
    /// User website verification request
    pub fn new() -> UserWebsiteVerifyRequest {
        UserWebsiteVerifyRequest {
            website: None,
            verification_method: None,
        }
    }
}
/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum VerificationMethod {
    #[serde(rename = "FILENAME")]
    Filename,
    #[serde(rename = "METATAG")]
    Metatag,
    #[serde(rename = "DNSTXT")]
    Dnstxt,
}

impl Default for VerificationMethod {
    fn default() -> VerificationMethod {
        Self::Filename
    }
}

