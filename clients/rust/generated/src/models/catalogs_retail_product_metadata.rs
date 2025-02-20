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

/// CatalogsRetailProductMetadata : Retail product metadata entity
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CatalogsRetailProductMetadata {
    /// The user-created unique ID that represents the product.
    #[serde(rename = "item_id")]
    pub item_id: String,
    /// The parent ID of the product.
    #[serde(rename = "item_group_id", deserialize_with = "Option::deserialize")]
    pub item_group_id: Option<String>,
    #[serde(rename = "availability")]
    pub availability: models::NonNullableProductAvailabilityType,
    /// The price of the product.
    #[serde(rename = "price")]
    pub price: f64,
    /// The discounted price of the product.
    #[serde(rename = "sale_price", deserialize_with = "Option::deserialize")]
    pub sale_price: Option<f64>,
    #[serde(rename = "currency")]
    pub currency: models::NonNullableCatalogsCurrency,
}

impl CatalogsRetailProductMetadata {
    /// Retail product metadata entity
    pub fn new(item_id: String, item_group_id: Option<String>, availability: models::NonNullableProductAvailabilityType, price: f64, sale_price: Option<f64>, currency: models::NonNullableCatalogsCurrency) -> CatalogsRetailProductMetadata {
        CatalogsRetailProductMetadata {
            item_id,
            item_group_id,
            availability,
            price,
            sale_price,
            currency,
        }
    }
}

