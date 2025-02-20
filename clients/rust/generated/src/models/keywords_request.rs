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
pub struct KeywordsRequest {
    /// Keyword JSON array. Each array element has 3 fields
    #[serde(rename = "keywords")]
    pub keywords: Vec<models::KeywordsCommon>,
    /// Keyword parent entity ID (advertiser, campaign, ad group).
    #[serde(rename = "parent_id")]
    pub parent_id: String,
}

impl KeywordsRequest {
    pub fn new(keywords: Vec<models::KeywordsCommon>, parent_id: String) -> KeywordsRequest {
        KeywordsRequest {
            keywords,
            parent_id,
        }
    }
}

