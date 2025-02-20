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
pub struct BusinessAssetMembersGet200Response {
    /// List of members with permissions to the asset.
    #[serde(rename = "items")]
    pub items: Vec<models::UserSingleAssetBinding>,
    #[serde(rename = "bookmark", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub bookmark: Option<Option<String>>,
}

impl BusinessAssetMembersGet200Response {
    pub fn new(items: Vec<models::UserSingleAssetBinding>) -> BusinessAssetMembersGet200Response {
        BusinessAssetMembersGet200Response {
            items,
            bookmark: None,
        }
    }
}

