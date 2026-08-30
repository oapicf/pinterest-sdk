package models

// MmmReportCreate - Resource create operation model.
type MmmReportCreate struct {

	// Advertiser IDs for multi-advertiser report
	AdvertiserIds []string `json:"advertiser_ids,omitempty"`

	// Metric and entity columns
	Columns []MmmReportingColumn `json:"columns"`

	// A List of countries for filtering
	Countries []TargetingAdvertiserCountry `json:"countries,omitempty"`

	// List of custom column IDs
	CustomColumnIds []string `json:"custom_column_ids,omitempty"`

	// Metric report end date (UTC). Format: YYYY-MM-DD
	EndDate string `json:"end_date" validate:"regexp=^\\d{4}-\\d{2}-\\d{2}$"`

	//   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
	Granularity MmmReportGranularity `json:"granularity"`

	// Level of the report
	Level MmmReportLevel `json:"level"`

	// Name of the Marketing Mix Modeling (MMM) report
	ReportName string `json:"report_name"`

	// Metric report start date (UTC). Format: YYYY-MM-DD
	StartDate string `json:"start_date" validate:"regexp=^\\d{4}-\\d{2}-\\d{2}$"`

	// List of targeting types
	TargetingTypes []MmmReportingTargetingType `json:"targeting_types"`
}
