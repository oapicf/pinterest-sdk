/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;

/// ItemProcessingRecord : Object describing an item processing record
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ItemProcessingRecord {
    /// The catalog item id in the merchant namespace
    #[serde(rename = "item_id", skip_serializing_if = "Option::is_none")]
    pub item_id: Option<String>,
    /// Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
    #[serde(rename = "errors", skip_serializing_if = "Option::is_none")]
    pub errors: Option<Vec<models::ItemValidationEvent>>,
    /// Array with the validation warnings for the item processing record
    #[serde(rename = "warnings", skip_serializing_if = "Option::is_none")]
    pub warnings: Option<Vec<models::ItemValidationEvent>>,
    #[serde(rename = "status", skip_serializing_if = "Option::is_none")]
    pub status: Option<models::ItemProcessingStatus>,
}

impl ItemProcessingRecord {
    /// Object describing an item processing record
    pub fn new() -> ItemProcessingRecord {
        ItemProcessingRecord {
            item_id: None,
            errors: None,
            warnings: None,
            status: None,
        }
    }
}
