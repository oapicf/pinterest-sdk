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
pub struct AdPreviewCreateFromPin {
    /// Pin ID.
    #[serde(rename = "pin_id")]
    pub pin_id: String,
}

impl AdPreviewCreateFromPin {
    pub fn new(pin_id: String) -> AdPreviewCreateFromPin {
        AdPreviewCreateFromPin {
            pin_id,
        }
    }
}

