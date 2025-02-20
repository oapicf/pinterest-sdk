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
pub struct SearchPartnerPins200Response {
    #[serde(rename = "items")]
    pub items: Vec<models::SummaryPin>,
    #[serde(rename = "bookmark", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub bookmark: Option<Option<String>>,
}

impl SearchPartnerPins200Response {
    pub fn new(items: Vec<models::SummaryPin>) -> SearchPartnerPins200Response {
        SearchPartnerPins200Response {
            items,
            bookmark: None,
        }
    }
}

