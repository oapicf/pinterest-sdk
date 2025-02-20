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
pub struct TopPinsAnalyticsResponseDateAvailability {
    #[serde(rename = "latest_available_timestamp", skip_serializing_if = "Option::is_none")]
    pub latest_available_timestamp: Option<f64>,
    #[serde(rename = "is_realtime", skip_serializing_if = "Option::is_none")]
    pub is_realtime: Option<bool>,
}

impl TopPinsAnalyticsResponseDateAvailability {
    pub fn new() -> TopPinsAnalyticsResponseDateAvailability {
        TopPinsAnalyticsResponseDateAvailability {
            latest_available_timestamp: None,
            is_realtime: None,
        }
    }
}

