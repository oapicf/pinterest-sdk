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

/// ItemResponse : Object describing an item record
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ItemResponse {
    #[serde(rename = "catalog_type")]
    pub catalog_type: models::CatalogsType,
    /// The catalog item id in the merchant namespace
    #[serde(rename = "item_id", skip_serializing_if = "Option::is_none")]
    pub item_id: Option<String>,
    /// The pins mapped to the item
    #[serde(rename = "pins", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub pins: Option<Option<Vec<models::Pin>>>,
    #[serde(rename = "attributes", skip_serializing_if = "Option::is_none")]
    pub attributes: Option<Box<models::CatalogsHotelAttributes>>,
    /// The catalog hotel id in the merchant namespace
    #[serde(rename = "hotel_id", skip_serializing_if = "Option::is_none")]
    pub hotel_id: Option<String>,
    /// Array with the errors for the item id requested
    #[serde(rename = "errors", skip_serializing_if = "Option::is_none")]
    pub errors: Option<Vec<models::ItemValidationEvent>>,
}

impl ItemResponse {
    /// Object describing an item record
    pub fn new(catalog_type: models::CatalogsType) -> ItemResponse {
        ItemResponse {
            catalog_type,
            item_id: None,
            pins: None,
            attributes: None,
            hotel_id: None,
            errors: None,
        }
    }
}
