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

/// IntegrationLogsRequest : Batch of logs sent from an integration application.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct IntegrationLogsRequest {
    #[serde(rename = "logs")]
    pub logs: Vec<models::IntegrationLog>,
}

impl IntegrationLogsRequest {
    /// Batch of logs sent from an integration application.
    pub fn new(logs: Vec<models::IntegrationLog>) -> IntegrationLogsRequest {
        IntegrationLogsRequest {
            logs,
        }
    }
}
