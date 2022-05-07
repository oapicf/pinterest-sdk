package models

type AdsAnalyticsCreateAsyncRequestAllOf1 struct {

	// Metric and entity columns
	Columns []ReportingColumnAsync `json:"columns"`

	// Level of the report
	Level MetricsReportingLevel `json:"level"`

	// Specification for formatting report data
	ReportFormat DataOutputFormat `json:"report_format,omitempty"`
}
