package models

type AdsAnalyticsGetAsyncResponse struct {

	ReportStatus BulkReportingJobStatus `json:"report_status,omitempty"`

	Url *string `json:"url,omitempty"`

	Size *float32 `json:"size,omitempty"`
}
