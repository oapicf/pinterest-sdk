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
pub struct UpdateMemberResult {
    /// The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
    #[serde(rename = "business_role", skip_serializing_if = "Option::is_none")]
    pub business_role: Option<String>,
    /// Unique identifier of the business member.
    #[serde(rename = "member_id", skip_serializing_if = "Option::is_none")]
    pub member_id: Option<String>,
}

impl UpdateMemberResult {
    pub fn new() -> UpdateMemberResult {
        UpdateMemberResult {
            business_role: None,
            member_id: None,
        }
    }
}

