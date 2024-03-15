package models

// ConversionEvents - A list of events (one or more) encapsulated by a data object.
type ConversionEvents struct {

	Data []ConversionEventsDataInner `json:"data"`
}
