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

/// BulkUpsertRequestUpdate : Request for creation of entities in bulk.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct BulkUpsertRequestUpdate {
    #[serde(rename = "campaigns", skip_serializing_if = "Option::is_none")]
    pub campaigns: Option<Vec<models::CampaignUpdateRequest>>,
    #[serde(rename = "ad_groups", skip_serializing_if = "Option::is_none")]
    pub ad_groups: Option<Vec<models::AdGroupUpdateRequest>>,
    #[serde(rename = "ads", skip_serializing_if = "Option::is_none")]
    pub ads: Option<Vec<models::AdUpdateRequest>>,
    #[serde(rename = "product_groups", skip_serializing_if = "Option::is_none")]
    pub product_groups: Option<Vec<models::ProductGroupPromotionUpdateRequest>>,
    #[serde(rename = "keywords", skip_serializing_if = "Option::is_none")]
    pub keywords: Option<Vec<models::KeywordUpdate>>,
}

impl BulkUpsertRequestUpdate {
    /// Request for creation of entities in bulk.
    pub fn new() -> BulkUpsertRequestUpdate {
        BulkUpsertRequestUpdate {
            campaigns: None,
            ad_groups: None,
            ads: None,
            product_groups: None,
            keywords: None,
        }
    }
}
