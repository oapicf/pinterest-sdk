package models
// BulkReportingJobStatus : Possible status for a bulk reporting job
type BulkReportingJobStatus string

// List of BulkReportingJobStatus
const (
	DOES_NOT_EXIST BulkReportingJobStatus = "DOES_NOT_EXIST"
	FINISHED BulkReportingJobStatus = "FINISHED"
	IN_PROGRESS BulkReportingJobStatus = "IN_PROGRESS"
	EXPIRED BulkReportingJobStatus = "EXPIRED"
	FAILED BulkReportingJobStatus = "FAILED"
	CANCELLED BulkReportingJobStatus = "CANCELLED"
)
