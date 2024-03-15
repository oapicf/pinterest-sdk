package models

// TemplateResponseDateRangeRelativeDateRange - The relative date range of the template
type TemplateResponseDateRangeRelativeDateRange struct {

	// The date range type
	Type string `json:"type,omitempty"`

	// The start date of the date range
	StartDaysInPast float32 `json:"start_days_in_past,omitempty"`

	// The end date of the date range
	EndDaysInPast float32 `json:"end_days_in_past,omitempty"`
}
