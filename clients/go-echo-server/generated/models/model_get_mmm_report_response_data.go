package models

type GetMmmReportResponseData struct {

	ReportStatus string `json:"report_status,omitempty"`

	Size *float32 `json:"size,omitempty"`

	Url *string `json:"url,omitempty"`
}
