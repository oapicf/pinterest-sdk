package models

type CreateMmmReportResponseData struct {

	ReportStatus BulkReportingJobStatus `json:"report_status,omitempty"`

	Token string `json:"token,omitempty"`

	Message *string `json:"message,omitempty"`

	Status string `json:"status,omitempty"`
}
