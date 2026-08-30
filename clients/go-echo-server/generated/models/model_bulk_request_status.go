package models
// BulkRequestStatus : Bulk request status
type BulkRequestStatus string

// List of BulkRequestStatus
const (
	RUNNING BulkRequestStatus = "RUNNING"
	SUCCEEDED BulkRequestStatus = "SUCCEEDED"
	FAILED BulkRequestStatus = "FAILED"
)
