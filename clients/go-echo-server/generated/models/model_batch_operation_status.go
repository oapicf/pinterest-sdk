package models
// BatchOperationStatus : The status of the operation performed by the batch
type BatchOperationStatus string

// List of BatchOperationStatus
const (
	PROCESSING BatchOperationStatus = "PROCESSING"
	COMPLETED BatchOperationStatus = "COMPLETED"
	FAILED BatchOperationStatus = "FAILED"
)
