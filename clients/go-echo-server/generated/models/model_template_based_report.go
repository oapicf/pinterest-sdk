package models

type TemplateBasedReport struct {

	Message string `json:"message,omitempty"`

	ReportStatus BulkReportingJobStatus `json:"report_status"`

	// Unique identifier of a template.
	TemplateId string `json:"template_id"`

	Token string `json:"token,omitempty"`
}
