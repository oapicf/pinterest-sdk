package models

type CreateMmmReportRequest struct {

	// Name of the Marketing Mix Modeling (MMM) report
	ReportName string `json:"report_name"`

	// Metric report start date (UTC). Format: YYYY-MM-DD
	StartDate string `json:"start_date" validate:"regexp=^(\\\\d{4})-(\\\\d{2})-(\\\\d{2})$"`

	// Metric report end date (UTC). Format: YYYY-MM-DD
	EndDate string `json:"end_date" validate:"regexp=^(\\\\d{4})-(\\\\d{2})-(\\\\d{2})$"`

	// DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
	Granularity string `json:"granularity"`

	// Level of the report
	Level string `json:"level"`

	// List of targeting types
	TargetingTypes []MmmReportingTargetingType `json:"targeting_types"`

	// Metric and entity columns
	Columns []MmmReportingColumn `json:"columns"`

	// A List of countries for filtering
	Countries []TargetingAdvertiserCountry `json:"countries,omitempty"`
}
