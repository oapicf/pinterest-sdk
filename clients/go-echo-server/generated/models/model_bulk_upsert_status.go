package models

type BulkUpsertStatus string

// List of BulkUpsertStatus
const (
	RUNNING BulkUpsertStatus = "RUNNING"
	SUCCEEDED BulkUpsertStatus = "SUCCEEDED"
	FAILED BulkUpsertStatus = "FAILED"
)
