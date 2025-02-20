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

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct SharedAudienceResponse {
    /// Audience ID that was shared
    #[serde(rename = "audience_id", skip_serializing_if = "Option::is_none")]
    pub audience_id: Option<String>,
    #[serde(rename = "permissions", skip_serializing_if = "Option::is_none")]
    pub permissions: Option<Vec<models::Role>>,
    /// Account IDs that received the audience
    #[serde(rename = "recipient_account_ids", skip_serializing_if = "Option::is_none")]
    pub recipient_account_ids: Option<Vec<String>>,
}

impl SharedAudienceResponse {
    pub fn new() -> SharedAudienceResponse {
        SharedAudienceResponse {
            audience_id: None,
            permissions: None,
            recipient_account_ids: None,
        }
    }
}

