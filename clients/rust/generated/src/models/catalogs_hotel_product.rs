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
pub struct CatalogsHotelProduct {
    #[serde(rename = "catalog_type")]
    pub catalog_type: CatalogType,
    #[serde(rename = "metadata")]
    pub metadata: Box<models::CatalogsHotelProductMetadata>,
    #[serde(rename = "pin", deserialize_with = "Option::deserialize")]
    pub pin: Option<Box<models::Pin>>,
}

impl CatalogsHotelProduct {
    pub fn new(catalog_type: CatalogType, metadata: models::CatalogsHotelProductMetadata, pin: Option<models::Pin>) -> CatalogsHotelProduct {
        CatalogsHotelProduct {
            catalog_type,
            metadata: Box::new(metadata),
            pin: if let Some(x) = pin {Some(Box::new(x))} else {None},
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

