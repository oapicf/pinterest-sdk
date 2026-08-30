package models

type AccountTemplate struct {

	// ID of the Ad Account that owns the template
	AdAccountId string `json:"ad_account_id,omitempty"`

	// IDs of the Ad Accounts that have access to this template
	AdAccountIds []string `json:"ad_account_ids,omitempty"`

	// A list of ADE columns
	AdeColumns []string `json:"ade_columns,omitempty"`

	// Attribution type for Brand/Category/SKU reports
	AttributionType *interface{} `json:"attribution_type,omitempty"`

	// The length of the sliding window over which click conversions will be attributed
	ClickWindowDays float32 `json:"click_window_days,omitempty"`

	// A list of columns to be included in the report
	Columns []ReportingColumn `json:"columns,omitempty"`

	// Conversion report time type
	ConversionReportTimeType ConversionReportTimeType `json:"conversion_report_time_type,omitempty"`

	// The surface used to create this template
	CreationSource CreationSource `json:"creation_source,omitempty"`

	// A list of custom column IDs
	CustomColumnIds *[]string `json:"custom_column_ids,omitempty"`

	// Additional metadata about this reporting template
	DisplayMetadata string `json:"display_metadata,omitempty"`

	// The length of the sliding window over which engagement conversions will be attributed
	EngagementWindowDays float32 `json:"engagement_window_days,omitempty"`

	// A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values
	FiltersJson *string `json:"filters_json,omitempty"`

	Granularity Granularity `json:"granularity,omitempty"`

	// Template ID
	Id string `json:"id"`

	// The filter on the conversion ingestion source method for conversion metrics
	IngestionSources *[]IngestionSource `json:"ingestion_sources,omitempty"`

	// A boolean representing if this is the default view that loads for this template type
	IsDefault bool `json:"is_default,omitempty"`

	// A boolean that indicates if the template has been deleted
	IsDeleted *bool `json:"is_deleted,omitempty"`

	// A boolean value that indicates if the user owns the template
	IsOwnedByUser bool `json:"is_owned_by_user,omitempty"`

	// A boolean value that indicates if this template has been used to create a scheduled report
	IsScheduled bool `json:"is_scheduled,omitempty"`

	// Template Name
	Name *string `json:"name,omitempty"`

	// The number of days prior to the day the report will be delivered at which the report will end
	ReportEndRelativeDaysInPast float32 `json:"report_end_relative_days_in_past,omitempty"`

	ReportFormat DataOutputFormat `json:"report_format,omitempty"`

	ReportLevel MetricsReportingLevel `json:"report_level,omitempty"`

	// The number of days prior to the day the report will be delivered at which the report will start
	ReportStartRelativeDaysInPast float32 `json:"report_start_relative_days_in_past,omitempty"`

	// Timezone for reporting data
	ReportingTimeZone ReportingTimeZone `json:"reporting_time_zone,omitempty"`

	// Unified metric sort configuration
	SortBy *interface{} `json:"sort_by,omitempty"`

	// Type of the template
	Type string `json:"type,omitempty"`

	// Time of last update in seconds since Unix epoch
	UpdatedTime float32 `json:"updated_time,omitempty"`

	// ID of the user who created the template
	UserId string `json:"user_id,omitempty"`

	// The length of the sliding window over which view conversions will be attributed
	ViewWindowDays float32 `json:"view_window_days,omitempty"`
}
