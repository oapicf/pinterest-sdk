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
pub struct Audience {
    /// Ad account ID.
    #[serde(rename = "ad_account_id", skip_serializing_if = "Option::is_none")]
    pub ad_account_id: Option<String>,
    /// Audience ID.
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<String>,
    /// Audience name.
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
    #[serde(rename = "audience_type", skip_serializing_if = "Option::is_none")]
    pub audience_type: Option<String>,
    /// Audience description.
    #[serde(rename = "description", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub description: Option<Option<String>>,
    #[serde(rename = "rule", skip_serializing_if = "Option::is_none")]
    pub rule: Option<Box<models::AudienceRule>>,
    /// Audience size.
    #[serde(rename = "size", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub size: Option<Option<i32>>,
    /// Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
    #[serde(rename = "status", skip_serializing_if = "Option::is_none")]
    pub status: Option<String>,
    /// Always \"audience\".
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub r#type: Option<String>,
    /// Creation time. Unix timestamp in seconds.
    #[serde(rename = "created_timestamp", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub created_timestamp: Option<Option<i32>>,
    /// Last update time. Unix timestamp in seconds.
    #[serde(rename = "updated_timestamp", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub updated_timestamp: Option<Option<i32>>,
}

impl Audience {
    pub fn new() -> Audience {
        Audience {
            ad_account_id: None,
            id: None,
            name: None,
            audience_type: None,
            description: None,
            rule: None,
            size: None,
            status: None,
            r#type: None,
            created_timestamp: None,
            updated_timestamp: None,
        }
    }
}
