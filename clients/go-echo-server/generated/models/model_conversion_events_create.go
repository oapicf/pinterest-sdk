package models

// ConversionEventsCreate - Conversion events.
type ConversionEventsCreate struct {

	// A list of events (one or more) encapsulated by a data object.
	Data []ConversionEventsDataItems `json:"data"`
}
