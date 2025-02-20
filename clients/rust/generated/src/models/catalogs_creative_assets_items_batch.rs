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

/// CatalogsCreativeAssetsItemsBatch : Object describing the catalogs creative assets items batch
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CatalogsCreativeAssetsItemsBatch {
    /// Id of the catalogs items batch
    #[serde(rename = "batch_id", skip_serializing_if = "Option::is_none")]
    pub batch_id: Option<String>,
    /// Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
    #[serde(rename = "created_time", skip_serializing_if = "Option::is_none")]
    pub created_time: Option<String>,
    /// Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
    #[serde(rename = "completed_time", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub completed_time: Option<Option<String>>,
    #[serde(rename = "status", skip_serializing_if = "Option::is_none")]
    pub status: Option<models::BatchOperationStatus>,
    #[serde(rename = "catalog_type")]
    pub catalog_type: models::CatalogsType,
    /// Array with the catalogs items processing records part of the catalogs items batch
    #[serde(rename = "items", skip_serializing_if = "Option::is_none")]
    pub items: Option<Vec<models::CreativeAssetsProcessingRecord>>,
}

impl CatalogsCreativeAssetsItemsBatch {
    /// Object describing the catalogs creative assets items batch
    pub fn new(catalog_type: models::CatalogsType) -> CatalogsCreativeAssetsItemsBatch {
        CatalogsCreativeAssetsItemsBatch {
            batch_id: None,
            created_time: None,
            completed_time: None,
            status: None,
            catalog_type,
            items: None,
        }
    }
}

