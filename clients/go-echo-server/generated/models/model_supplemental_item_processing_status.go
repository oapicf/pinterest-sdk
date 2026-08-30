package models
// SupplementalItemProcessingStatus : The status of the item processing record
type SupplementalItemProcessingStatus string

// List of SupplementalItemProcessingStatus
const (
	SUCCESS SupplementalItemProcessingStatus = "SUCCESS"
	FAILURE SupplementalItemProcessingStatus = "FAILURE"
	PROCESSING SupplementalItemProcessingStatus = "PROCESSING"
)
