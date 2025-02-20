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

/// QuizPinData : This field includes all quiz data including questions, options, and results.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct QuizPinData {
    #[serde(rename = "questions", skip_serializing_if = "Option::is_none")]
    pub questions: Option<Vec<models::QuizPinQuestion>>,
    #[serde(rename = "results", skip_serializing_if = "Option::is_none")]
    pub results: Option<Vec<models::QuizPinResult>>,
    /// Quiz ad tie breaker type, default is RANDOM
    #[serde(rename = "tie_breaker_type", skip_serializing_if = "Option::is_none")]
    pub tie_breaker_type: Option<TieBreakerType>,
    #[serde(rename = "tie_breaker_custom_result", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub tie_breaker_custom_result: Option<Option<Box<models::QuizPinResult>>>,
}

impl QuizPinData {
    /// This field includes all quiz data including questions, options, and results.
    pub fn new() -> QuizPinData {
        QuizPinData {
            questions: None,
            results: None,
            tie_breaker_type: None,
            tie_breaker_custom_result: None,
        }
    }
}
/// Quiz ad tie breaker type, default is RANDOM
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum TieBreakerType {
    #[serde(rename = "RANDOM")]
    Random,
    #[serde(rename = "CUSTOM")]
    Custom,
}

impl Default for TieBreakerType {
    fn default() -> TieBreakerType {
        Self::Random
    }
}

