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

/// ItemProcessingStatus : The status of the item processing record
/// The status of the item processing record
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum ItemProcessingStatus {
    #[serde(rename = "SUCCESS")]
    Success,
    #[serde(rename = "FAILURE")]
    Failure,
    #[serde(rename = "PROCESSING")]
    Processing,

}

impl std::fmt::Display for ItemProcessingStatus {
    fn fmt(&self, f: &mut std::fmt::Formatter) -> std::fmt::Result {
        match self {
            Self::Success => write!(f, "SUCCESS"),
            Self::Failure => write!(f, "FAILURE"),
            Self::Processing => write!(f, "PROCESSING"),
        }
    }
}

impl Default for ItemProcessingStatus {
    fn default() -> ItemProcessingStatus {
        Self::Success
    }
}

