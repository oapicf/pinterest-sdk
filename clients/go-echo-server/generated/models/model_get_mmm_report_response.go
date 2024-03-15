package models

type GetMmmReportResponse struct {

	Code float32 `json:"code,omitempty"`

	Data GetMmmReportResponseData `json:"data,omitempty"`

	Message string `json:"message,omitempty"`

	Status string `json:"status,omitempty"`
}
