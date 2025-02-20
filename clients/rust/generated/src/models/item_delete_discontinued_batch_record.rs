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

/// ItemDeleteDiscontinuedBatchRecord : Object describing an item batch record to discontinue items
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ItemDeleteDiscontinuedBatchRecord {
    /// The catalog item id in the merchant namespace
    #[serde(rename = "item_id", skip_serializing_if = "Option::is_none")]
    pub item_id: Option<String>,
}

impl ItemDeleteDiscontinuedBatchRecord {
    /// Object describing an item batch record to discontinue items
    pub fn new() -> ItemDeleteDiscontinuedBatchRecord {
        ItemDeleteDiscontinuedBatchRecord {
            item_id: None,
        }
    }
}

