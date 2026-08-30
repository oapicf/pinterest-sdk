package models
// EventProcessingStatus : Status of a single event in the response.
type EventProcessingStatus string

// List of EventProcessingStatus
const (
	FAILED EventProcessingStatus = "failed"
	PROCESSED EventProcessingStatus = "processed"
)
