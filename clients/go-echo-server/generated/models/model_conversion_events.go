package models

// ConversionEvents - Conversion events.
type ConversionEvents struct {

	// Specific messages for each event received. The order will match the order in which the events were received in the request.
	Events []ConversionApiResponseEventsItems `json:"events"`

	// Number of events that were successfully processed from the events.
	NumEventsProcessed int32 `json:"num_events_processed"`

	// Total number of events received in the request.
	NumEventsReceived int32 `json:"num_events_received"`
}
