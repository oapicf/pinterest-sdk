package models
// BulkOutputFormat : Bulk file output format
type BulkOutputFormat string

// List of BulkOutputFormat
const (
	CSV BulkOutputFormat = "CSV"
	JSON BulkOutputFormat = "JSON"
)
