package models
// LeadsExportStatus : Status of a leads export job
type LeadsExportStatus string

// List of LeadsExportStatus
const (
	IN_PROGRESS LeadsExportStatus = "IN_PROGRESS"
	FINISHED LeadsExportStatus = "FINISHED"
	FAILED LeadsExportStatus = "FAILED"
)
