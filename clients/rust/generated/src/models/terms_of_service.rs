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
pub struct TermsOfService {
    /// The ID of the terms of service
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<String>,
    /// The terms of service content
    #[serde(rename = "html", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub html: Option<Option<String>>,
    /// Whether the ad account has accepted terms of service.
    #[serde(rename = "has_accepted", skip_serializing_if = "Option::is_none")]
    pub has_accepted: Option<bool>,
    /// The ID of the ad account.
    #[serde(rename = "ad_account_id", skip_serializing_if = "Option::is_none")]
    pub ad_account_id: Option<String>,
}

impl TermsOfService {
    pub fn new() -> TermsOfService {
        TermsOfService {
            id: None,
            html: None,
            has_accepted: None,
            ad_account_id: None,
        }
    }
}

