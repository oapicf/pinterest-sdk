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

/// AdvancedAuctionProcessedItems : Response object containing the results of an operation on an item bid option
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct AdvancedAuctionProcessedItems {
    /// Catalog id pertaining to all items
    #[serde(rename = "catalog_id", skip_serializing_if = "Option::is_none")]
    pub catalog_id: Option<String>,
    /// Array of advanced auction processed items
    #[serde(rename = "items", skip_serializing_if = "Option::is_none")]
    pub items: Option<Vec<models::AdvancedAuctionProcessedItem>>,
}

impl AdvancedAuctionProcessedItems {
    /// Response object containing the results of an operation on an item bid option
    pub fn new() -> AdvancedAuctionProcessedItems {
        AdvancedAuctionProcessedItems {
            catalog_id: None,
            items: None,
        }
    }
}

