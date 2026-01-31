package models

type CreateMmmReportResponseData struct {

	Message *string `json:"message,omitempty"`

	ReportStatus BulkReportingJobStatus `json:"report_status,omitempty"`

	Status string `json:"status,omitempty"`

	Token string `json:"token,omitempty"`
}
