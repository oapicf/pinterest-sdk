package models
// ConversionProductReportGranularity : Report granularity for time-based aggregation: - TOTAL: Metrics are aggregated over the specified date range - WEEK: Metrics are broken down weekly - MONTH: Metrics are broken down monthly
type ConversionProductReportGranularity string

// List of ConversionProductReportGranularity
const (
	TOTAL ConversionProductReportGranularity = "TOTAL"
	WEEK ConversionProductReportGranularity = "WEEK"
	MONTH ConversionProductReportGranularity = "MONTH"
)
