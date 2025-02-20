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

/// CatalogsFeed : Catalogs Feed object
#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
#[serde(tag = "catalog_type")]
pub enum CatalogsFeed {
    #[serde(rename="RETAIL")]
    Retail(Box<models::CatalogsRetailFeed>),
    #[serde(rename="HOTEL")]
    Hotel(Box<models::CatalogsHotelFeed>),
    #[serde(rename="CREATIVE_ASSETS")]
    CreativeAssets(Box<models::CatalogsCreativeAssetsFeed>),
}

impl Default for CatalogsFeed {
    fn default() -> Self {
        Self::Retail(Default::default())
    }
}


