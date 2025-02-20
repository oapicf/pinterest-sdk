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
pub struct AdsAnalyticsMetricsFilter {
    #[serde(rename = "field")]
    pub field: models::AdsAnalyticsFilterColumn,
    #[serde(rename = "operator")]
    pub operator: models::AdsAnalyticsFilterOperator,
    /// List of values for filtering
    #[serde(rename = "values")]
    pub values: Vec<f64>,
}

impl AdsAnalyticsMetricsFilter {
    pub fn new(field: models::AdsAnalyticsFilterColumn, operator: models::AdsAnalyticsFilterOperator, values: Vec<f64>) -> AdsAnalyticsMetricsFilter {
        AdsAnalyticsMetricsFilter {
            field,
            operator,
            values,
        }
    }
}

