package models

import (
	"time"
)

// SupplementalItemsBatchResponse - Response model for supplemental items batch operation
type SupplementalItemsBatchResponse struct {

	// Id of the batch operation
	BatchId string `json:"batch_id"`

	// Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
	CompletedTime time.Time `json:"completed_time,omitempty"`

	// Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
	CreatedTime time.Time `json:"created_time"`

	// Array of operation results
	OperationResults []SupplementalOperationResult `json:"operation_results"`

	// Status of the batch: PROCESSING, COMPLETED, FAILED
	Status SupplementalItemBatchOperationStatus `json:"status"`
}
