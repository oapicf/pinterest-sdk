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

/// ConversionApiResponse : Schema describing the object in the response, which contains information about the events that were received and processed.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ConversionApiResponse {
    /// Total number of events received in the request.
    #[serde(rename = "num_events_received")]
    pub num_events_received: i32,
    /// Number of events that were successfully processed from the events.
    #[serde(rename = "num_events_processed")]
    pub num_events_processed: i32,
    /// Specific messages for each event received. The order will match the order in which the events were received in the request.
    #[serde(rename = "events")]
    pub events: Vec<models::ConversionApiResponseEventsInner>,
}

impl ConversionApiResponse {
    /// Schema describing the object in the response, which contains information about the events that were received and processed.
    pub fn new(num_events_received: i32, num_events_processed: i32, events: Vec<models::ConversionApiResponseEventsInner>) -> ConversionApiResponse {
        ConversionApiResponse {
            num_events_received,
            num_events_processed,
            events,
        }
    }
}
