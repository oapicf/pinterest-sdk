package models

type AdsAnalyticsCreateAsyncResponse struct {

	Message *string `json:"message,omitempty"`

	ReportStatus BulkReportingJobStatus `json:"report_status,omitempty"`

	Token string `json:"token,omitempty"`
}
