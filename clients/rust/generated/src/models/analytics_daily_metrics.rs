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
pub struct AnalyticsDailyMetrics {
    #[serde(rename = "data_status", skip_serializing_if = "Option::is_none")]
    pub data_status: Option<models::DataStatus>,
    /// Metrics date (UTC): YYYY-MM-DD.
    #[serde(rename = "date", skip_serializing_if = "Option::is_none")]
    pub date: Option<String>,
    /// The metric name and daily value for each requested metric
    #[serde(rename = "metrics", skip_serializing_if = "Option::is_none")]
    pub metrics: Option<std::collections::HashMap<String, f64>>,
}

impl AnalyticsDailyMetrics {
    pub fn new() -> AnalyticsDailyMetrics {
        AnalyticsDailyMetrics {
            data_status: None,
            date: None,
            metrics: None,
        }
    }
}
