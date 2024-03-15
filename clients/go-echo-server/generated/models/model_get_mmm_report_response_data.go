package models

type GetMmmReportResponseData struct {

	ReportStatus string `json:"report_status,omitempty"`

	Url *string `json:"url,omitempty"`

	Size *float32 `json:"size,omitempty"`
}
