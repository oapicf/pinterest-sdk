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

/// CatalogsVerticalBatchRequest : A request object that can have multiple operations on a single batch
#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
#[serde(tag = "catalog_type")]
pub enum CatalogsVerticalBatchRequest {
    #[serde(rename="RETAIL")]
    Retail(Box<models::CatalogsRetailBatchRequest>),
    #[serde(rename="HOTEL")]
    Hotel(Box<models::CatalogsHotelBatchRequest>),
    #[serde(rename="CREATIVE_ASSETS")]
    CreativeAssets(Box<models::CatalogsCreativeAssetsBatchRequest>),
}

impl Default for CatalogsVerticalBatchRequest {
    fn default() -> Self {
        Self::Retail(Default::default())
    }
}


