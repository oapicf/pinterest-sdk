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

/// CatalogsHotelBatchRequest : Request object to update catalogs hotel items
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CatalogsHotelBatchRequest {
    #[serde(rename = "catalog_type")]
    pub catalog_type: CatalogType,
    #[serde(rename = "country")]
    pub country: models::Country,
    #[serde(rename = "language")]
    pub language: Box<models::CatalogsItemsRequestLanguage>,
    /// Array with catalogs item operations
    #[serde(rename = "items")]
    pub items: Vec<models::CatalogsHotelBatchItem>,
    /// Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
    #[serde(rename = "catalog_id", skip_serializing_if = "Option::is_none")]
    pub catalog_id: Option<String>,
}

impl CatalogsHotelBatchRequest {
    /// Request object to update catalogs hotel items
    pub fn new(catalog_type: CatalogType, country: models::Country, language: models::CatalogsItemsRequestLanguage, items: Vec<models::CatalogsHotelBatchItem>) -> CatalogsHotelBatchRequest {
        CatalogsHotelBatchRequest {
            catalog_type,
            country,
            language: Box::new(language),
            items,
            catalog_id: None,
        }
    }
}
/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum CatalogType {
    #[serde(rename = "HOTEL")]
    Hotel,
}

impl Default for CatalogType {
    fn default() -> CatalogType {
        Self::Hotel
    }
}

