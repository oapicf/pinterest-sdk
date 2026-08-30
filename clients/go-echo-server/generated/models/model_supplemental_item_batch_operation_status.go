package models
// SupplementalItemBatchOperationStatus : The status of the batch operation
type SupplementalItemBatchOperationStatus string

// List of SupplementalItemBatchOperationStatus
const (
	PROCESSING SupplementalItemBatchOperationStatus = "PROCESSING"
	COMPLETED SupplementalItemBatchOperationStatus = "COMPLETED"
	FAILED SupplementalItemBatchOperationStatus = "FAILED"
)
