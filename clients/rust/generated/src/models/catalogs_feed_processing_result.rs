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
pub struct CatalogsFeedProcessingResult {
    #[serde(rename = "created_at")]
    pub created_at: String,
    #[serde(rename = "id")]
    pub id: String,
    #[serde(rename = "updated_at")]
    pub updated_at: String,
    #[serde(rename = "ingestion_details")]
    pub ingestion_details: Box<models::CatalogsFeedIngestionDetails>,
    #[serde(rename = "status")]
    pub status: models::CatalogsFeedProcessingStatus,
    #[serde(rename = "product_counts", deserialize_with = "Option::deserialize")]
    pub product_counts: Option<Box<models::CatalogsFeedProductCounts>>,
    #[serde(rename = "validation_details")]
    pub validation_details: Box<models::CatalogsFeedValidationDetails>,
}

impl CatalogsFeedProcessingResult {
    pub fn new(created_at: String, id: String, updated_at: String, ingestion_details: models::CatalogsFeedIngestionDetails, status: models::CatalogsFeedProcessingStatus, product_counts: Option<models::CatalogsFeedProductCounts>, validation_details: models::CatalogsFeedValidationDetails) -> CatalogsFeedProcessingResult {
        CatalogsFeedProcessingResult {
            created_at,
            id,
            updated_at,
            ingestion_details: Box::new(ingestion_details),
            status,
            product_counts: if let Some(x) = product_counts {Some(Box::new(x))} else {None},
            validation_details: Box::new(validation_details),
        }
    }
}

