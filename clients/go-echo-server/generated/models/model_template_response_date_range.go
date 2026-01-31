package models

type TemplateResponseDateRange struct {

	AbsoluteDateRange *TemplateResponseDateRangeAbsoluteDateRange `json:"absolute_date_range,omitempty"`

	DynamicDateRange *TemplateResponseDateRangeDynamicDateRange `json:"dynamic_date_range,omitempty"`

	RelativeDateRange *TemplateResponseDateRangeRelativeDateRange `json:"relative_date_range,omitempty"`
}
