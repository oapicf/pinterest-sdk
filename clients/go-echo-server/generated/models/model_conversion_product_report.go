package models

type ConversionProductReport struct {

	// Message returned from the create report request
	Message string `json:"message,omitempty"`

	// Async report status
	ReportStatus BulkReportingJobStatus `json:"report_status,omitempty"`

	// Size of the report in bytes
	Size float32 `json:"size,omitempty"`

	// Token returned from the create report request
	Token string `json:"token,omitempty"`

	// URL of the report
	Url string `json:"url,omitempty"`
}
