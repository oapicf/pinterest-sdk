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

/// IntegrationLogsSuccessResponse : Response when logs are successfully processed.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct IntegrationLogsSuccessResponse {
    #[serde(rename = "message", skip_serializing_if = "Option::is_none")]
    pub message: Option<String>,
}

impl IntegrationLogsSuccessResponse {
    /// Response when logs are successfully processed.
    pub fn new() -> IntegrationLogsSuccessResponse {
        IntegrationLogsSuccessResponse {
            message: None,
        }
    }
}
