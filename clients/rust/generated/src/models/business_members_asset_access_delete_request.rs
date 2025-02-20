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
pub struct BusinessMembersAssetAccessDeleteRequest {
    /// List of members asset access to be deleted
    #[serde(rename = "accesses")]
    pub accesses: Vec<models::BusinessMembersAssetAccessDeleteRequestAccessesInner>,
}

impl BusinessMembersAssetAccessDeleteRequest {
    pub fn new(accesses: Vec<models::BusinessMembersAssetAccessDeleteRequestAccessesInner>) -> BusinessMembersAssetAccessDeleteRequest {
        BusinessMembersAssetAccessDeleteRequest {
            accesses,
        }
    }
}

