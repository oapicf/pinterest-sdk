package models

type TemplateResponseDateRange struct {

	DynamicDateRange *TemplateResponseDateRangeDynamicDateRange `json:"dynamic_date_range,omitempty"`

	RelativeDateRange *TemplateResponseDateRangeRelativeDateRange `json:"relative_date_range,omitempty"`

	AbsoluteDateRange *TemplateResponseDateRangeAbsoluteDateRange `json:"absolute_date_range,omitempty"`
}
