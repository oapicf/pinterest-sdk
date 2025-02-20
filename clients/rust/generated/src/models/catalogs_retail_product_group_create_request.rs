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

/// CatalogsRetailProductGroupCreateRequest : Request object for creating a product group.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CatalogsRetailProductGroupCreateRequest {
    /// Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
    #[serde(rename = "catalog_type")]
    pub catalog_type: CatalogType,
    #[serde(rename = "name")]
    pub name: String,
    #[serde(rename = "description", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub description: Option<Option<String>>,
    #[serde(rename = "filters")]
    pub filters: Box<models::CatalogsProductGroupFiltersRequest>,
    /// Catalog id pertaining to the retail product group.
    #[serde(rename = "catalog_id")]
    pub catalog_id: String,
    #[serde(rename = "country")]
    pub country: models::Country,
    #[serde(rename = "locale")]
    pub locale: models::CatalogsLocale,
}

impl CatalogsRetailProductGroupCreateRequest {
    /// Request object for creating a product group.
    pub fn new(catalog_type: CatalogType, name: String, filters: models::CatalogsProductGroupFiltersRequest, catalog_id: String, country: models::Country, locale: models::CatalogsLocale) -> CatalogsRetailProductGroupCreateRequest {
        CatalogsRetailProductGroupCreateRequest {
            catalog_type,
            name,
            description: None,
            filters: Box::new(filters),
            catalog_id,
            country,
            locale,
        }
    }
}
/// Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
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

