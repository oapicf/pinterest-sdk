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

/// CatalogsCreativeAssetsProductMetadata : Creative assets product metadata entity
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CatalogsCreativeAssetsProductMetadata {
    /// The user-created unique ID that represents the creative assets item.
    #[serde(rename = "creative_assets_id")]
    pub creative_assets_id: String,
    #[serde(rename = "visibility")]
    pub visibility: models::CreativeAssetsVisibilityType,
}

impl CatalogsCreativeAssetsProductMetadata {
    /// Creative assets product metadata entity
    pub fn new(creative_assets_id: String, visibility: models::CreativeAssetsVisibilityType) -> CatalogsCreativeAssetsProductMetadata {
        CatalogsCreativeAssetsProductMetadata {
            creative_assets_id,
            visibility,
        }
    }
}

