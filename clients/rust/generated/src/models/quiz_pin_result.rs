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

/// QuizPinResult : The result, and link out, based on the user’s choice.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct QuizPinResult {
    #[serde(rename = "organic_pin_id", skip_serializing_if = "Option::is_none")]
    pub organic_pin_id: Option<String>,
    #[serde(rename = "android_deep_link", skip_serializing_if = "Option::is_none")]
    pub android_deep_link: Option<String>,
    #[serde(rename = "ios_deep_link", skip_serializing_if = "Option::is_none")]
    pub ios_deep_link: Option<String>,
    #[serde(rename = "destination_url", skip_serializing_if = "Option::is_none")]
    pub destination_url: Option<String>,
    #[serde(rename = "result_id", skip_serializing_if = "Option::is_none")]
    pub result_id: Option<f64>,
}

impl QuizPinResult {
    /// The result, and link out, based on the user’s choice.
    pub fn new() -> QuizPinResult {
        QuizPinResult {
            organic_pin_id: None,
            android_deep_link: None,
            ios_deep_link: None,
            destination_url: None,
            result_id: None,
        }
    }
}

