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

/// CatalogsHotelProductGroupUpdateRequest : Request object for updating a hotel product group.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CatalogsHotelProductGroupUpdateRequest {
    #[serde(rename = "catalog_type", skip_serializing_if = "Option::is_none")]
    pub catalog_type: Option<CatalogType>,
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    #[serde(rename = "description", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub description: Option<Option<String>>,
    #[serde(rename = "filters", skip_serializing_if = "Option::is_none")]
    pub filters: Option<Box<models::CatalogsHotelProductGroupFilters>>,
}

impl CatalogsHotelProductGroupUpdateRequest {
    /// Request object for updating a hotel product group.
    pub fn new() -> CatalogsHotelProductGroupUpdateRequest {
        CatalogsHotelProductGroupUpdateRequest {
            catalog_type: None,
            name: None,
            description: None,
            filters: None,
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
