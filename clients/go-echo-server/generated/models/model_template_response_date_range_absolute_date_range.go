package models

// TemplateResponseDateRangeAbsoluteDateRange - The absolute date range of the template
type TemplateResponseDateRangeAbsoluteDateRange struct {

	// The date range type
	Type string `json:"type,omitempty"`

	// The start date of the date range
	StartDate float32 `json:"start_date,omitempty"`

	// The end date of the date range
	EndDate float32 `json:"end_date,omitempty"`
}
