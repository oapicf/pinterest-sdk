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

/// QuizPinOption :  This field contains multiple options to a quiz question.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct QuizPinOption {
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<f64>,
    #[serde(rename = "text", skip_serializing_if = "Option::is_none")]
    pub text: Option<String>,
}

impl QuizPinOption {
    ///  This field contains multiple options to a quiz question.
    pub fn new() -> QuizPinOption {
        QuizPinOption {
            id: None,
            text: None,
        }
    }
}

