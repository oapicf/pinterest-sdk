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

/// AudienceDataParty : Whether the data is owned by the partner (1p) or by the data provider (3p)
/// Whether the data is owned by the partner (1p) or by the data provider (3p)
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum AudienceDataParty {
    #[serde(rename = "1p")]
    Variant1p,
    #[serde(rename = "3p")]
    Variant3p,

}

impl std::fmt::Display for AudienceDataParty {
    fn fmt(&self, f: &mut std::fmt::Formatter) -> std::fmt::Result {
        match self {
            Self::Variant1p => write!(f, "1p"),
            Self::Variant3p => write!(f, "3p"),
        }
    }
}

impl Default for AudienceDataParty {
    fn default() -> AudienceDataParty {
        Self::Variant1p
    }
}

