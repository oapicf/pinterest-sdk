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

/// LeadFormTestResponse : Response for lead data test API.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct LeadFormTestResponse {
    /// Subscription ID.
    #[serde(rename = "subscription_id", skip_serializing_if = "Option::is_none")]
    pub subscription_id: Option<String>,
}

impl LeadFormTestResponse {
    /// Response for lead data test API.
    pub fn new() -> LeadFormTestResponse {
        LeadFormTestResponse {
            subscription_id: None,
        }
    }
}

