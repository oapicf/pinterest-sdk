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

/// CatalogsRetailBatchRequest : A request object that can have multiple operations on a single retail batch
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CatalogsRetailBatchRequest {
    #[serde(rename = "catalog_type")]
    pub catalog_type: CatalogType,
    #[serde(rename = "country")]
    pub country: models::Country,
    #[serde(rename = "language")]
    pub language: Box<models::CatalogsItemsRequestLanguage>,
    /// Array with catalogs item operations
    #[serde(rename = "items")]
    pub items: Vec<models::CatalogsRetailBatchRequestItemsInner>,
}

impl CatalogsRetailBatchRequest {
    /// A request object that can have multiple operations on a single retail batch
    pub fn new(catalog_type: CatalogType, country: models::Country, language: models::CatalogsItemsRequestLanguage, items: Vec<models::CatalogsRetailBatchRequestItemsInner>) -> CatalogsRetailBatchRequest {
        CatalogsRetailBatchRequest {
            catalog_type,
            country,
            language: Box::new(language),
            items,
        }
    }
}
/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum CatalogType {
    #[serde(rename = "RETAIL")]
    Retail,
}

impl Default for CatalogType {
    fn default() -> CatalogType {
        Self::Retail
    }
}

