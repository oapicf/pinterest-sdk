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
pub struct KeywordsMetricsArrayResponse {
    #[serde(rename = "data", skip_serializing_if = "Option::is_none")]
    pub data: Option<Vec<models::KeywordMetricsResponse>>,
}

impl KeywordsMetricsArrayResponse {
    pub fn new() -> KeywordsMetricsArrayResponse {
        KeywordsMetricsArrayResponse {
            data: None,
        }
    }
}

