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

/// ConversionEvents : A list of events (one or more) encapsulated by a data object.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ConversionEvents {
    #[serde(rename = "data")]
    pub data: Vec<models::ConversionEventsDataInner>,
}

impl ConversionEvents {
    /// A list of events (one or more) encapsulated by a data object.
    pub fn new(data: Vec<models::ConversionEventsDataInner>) -> ConversionEvents {
        ConversionEvents {
            data,
        }
    }
}
