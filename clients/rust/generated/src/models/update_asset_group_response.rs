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
pub struct UpdateAssetGroupResponse {
    /// A list of successfully edited asset groups.
    #[serde(rename = "updated_asset_groups", skip_serializing_if = "Option::is_none")]
    pub updated_asset_groups: Option<Vec<models::AssetGroupBinding>>,
    /// A list of errors associated with the asset groups. Will be returned if there is an error.
    #[serde(rename = "exceptions", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub exceptions: Option<Option<Vec<models::UpdateAssetGroupResponseExceptionsInner>>>,
}

impl UpdateAssetGroupResponse {
    pub fn new() -> UpdateAssetGroupResponse {
        UpdateAssetGroupResponse {
            updated_asset_groups: None,
            exceptions: None,
        }
    }
}

