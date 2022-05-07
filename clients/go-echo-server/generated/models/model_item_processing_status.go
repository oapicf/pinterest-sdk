package models
// ItemProcessingStatus : The status of the item processing record
type ItemProcessingStatus string

// List of ItemProcessingStatus
const (
	SUCCESS ItemProcessingStatus = "SUCCESS"
	FAILURE ItemProcessingStatus = "FAILURE"
	PROCESSING ItemProcessingStatus = "PROCESSING"
)
