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

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum AudienceShareType {
    #[serde(rename = "SHARED")]
    Shared,
    #[serde(rename = "RECEIVED")]
    Received,

}

impl std::fmt::Display for AudienceShareType {
    fn fmt(&self, f: &mut std::fmt::Formatter) -> std::fmt::Result {
        match self {
            Self::Shared => write!(f, "SHARED"),
            Self::Received => write!(f, "RECEIVED"),
        }
    }
}

impl Default for AudienceShareType {
    fn default() -> AudienceShareType {
        Self::Shared
    }
}

