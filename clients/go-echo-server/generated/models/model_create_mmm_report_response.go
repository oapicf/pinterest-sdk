package models

type CreateMmmReportResponse struct {

	Code float32 `json:"code,omitempty"`

	Data CreateMmmReportResponseData `json:"data,omitempty"`
}
