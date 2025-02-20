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
pub struct AudienceInsightCategoryCommon {
    #[serde(rename = "key", skip_serializing_if = "Option::is_none")]
    pub key: Option<String>,
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    #[serde(rename = "ratio", skip_serializing_if = "Option::is_none")]
    pub ratio: Option<f64>,
    #[serde(rename = "index", skip_serializing_if = "Option::is_none")]
    pub index: Option<f64>,
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<String>,
}

impl AudienceInsightCategoryCommon {
    pub fn new() -> AudienceInsightCategoryCommon {
        AudienceInsightCategoryCommon {
            key: None,
            name: None,
            ratio: None,
            index: None,
            id: None,
        }
    }
}

