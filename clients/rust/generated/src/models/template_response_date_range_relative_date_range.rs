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

/// TemplateResponseDateRangeRelativeDateRange : The relative date range of the template
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct TemplateResponseDateRangeRelativeDateRange {
    /// The date range type
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub r#type: Option<String>,
    /// The start date of the date range
    #[serde(rename = "start_days_in_past", skip_serializing_if = "Option::is_none")]
    pub start_days_in_past: Option<f64>,
    /// The end date of the date range
    #[serde(rename = "end_days_in_past", skip_serializing_if = "Option::is_none")]
    pub end_days_in_past: Option<f64>,
}

impl TemplateResponseDateRangeRelativeDateRange {
    /// The relative date range of the template
    pub fn new() -> TemplateResponseDateRangeRelativeDateRange {
        TemplateResponseDateRangeRelativeDateRange {
            r#type: None,
            start_days_in_past: None,
            end_days_in_past: None,
        }
    }
}
