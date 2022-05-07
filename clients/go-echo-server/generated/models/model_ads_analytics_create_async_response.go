package models

type AdsAnalyticsCreateAsyncResponse struct {

	ReportStatus string `json:"report_status,omitempty"`

	Token string `json:"token,omitempty"`

	Message *string `json:"message,omitempty"`
}
