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
pub struct SearchUserBoardsGet200Response {
    /// items
    #[serde(rename = "items")]
    pub items: Vec<models::Board>,
    #[serde(rename = "bookmark", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub bookmark: Option<Option<String>>,
}

impl SearchUserBoardsGet200Response {
    pub fn new(items: Vec<models::Board>) -> SearchUserBoardsGet200Response {
        SearchUserBoardsGet200Response {
            items,
            bookmark: None,
        }
    }
}

