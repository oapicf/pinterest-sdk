package models

// BulkJobData - Bulk request result data.
type BulkJobData struct {

	// Presigned s3 file url for the bulk request result.
	ResultUrl string `json:"result_url,omitempty"`

	Status BulkRequestStatus `json:"status"`

	// Bulk Workload Id.
	WorkloadId int32 `json:"workload_id,omitempty"`
}
