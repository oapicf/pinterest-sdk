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
pub struct KeywordError {
    #[serde(rename = "data", skip_serializing_if = "Option::is_none")]
    pub data: Option<Box<models::Keyword>>,
    #[serde(rename = "error_messages", skip_serializing_if = "Option::is_none")]
    pub error_messages: Option<Vec<String>>,
}

impl KeywordError {
    pub fn new() -> KeywordError {
        KeywordError {
            data: None,
            error_messages: None,
        }
    }
}

