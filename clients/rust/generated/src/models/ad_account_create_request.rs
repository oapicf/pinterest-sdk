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

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct AdAccountCreateRequest {
    #[serde(rename = "country", skip_serializing_if = "Option::is_none")]
    pub country: Option<models::Country>,
    /// Ad Account name.
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// Advertiser's owning user ID.
    #[serde(rename = "owner_user_id", skip_serializing_if = "Option::is_none")]
    pub owner_user_id: Option<String>,
}

impl AdAccountCreateRequest {
    pub fn new() -> AdAccountCreateRequest {
        AdAccountCreateRequest {
            country: None,
            name: None,
            owner_user_id: None,
        }
    }
}
