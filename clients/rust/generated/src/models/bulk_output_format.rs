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

/// BulkOutputFormat : Bulk file output format
/// Bulk file output format
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum BulkOutputFormat {
    #[serde(rename = "CSV")]
    Csv,
    #[serde(rename = "JSON")]
    Json,

}

impl std::fmt::Display for BulkOutputFormat {
    fn fmt(&self, f: &mut std::fmt::Formatter) -> std::fmt::Result {
        match self {
            Self::Csv => write!(f, "CSV"),
            Self::Json => write!(f, "JSON"),
        }
    }
}

impl Default for BulkOutputFormat {
    fn default() -> BulkOutputFormat {
        Self::Csv
    }
}

