package models

// TemplateBasedReportCreate - Resource create operation model.
type TemplateBasedReportCreate struct {

	Message string `json:"message,omitempty"`

	ReportStatus BulkReportingJobStatus `json:"report_status"`

	Token string `json:"token,omitempty"`
}
