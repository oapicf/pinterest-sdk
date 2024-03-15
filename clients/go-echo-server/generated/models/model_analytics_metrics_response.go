package models

type AnalyticsMetricsResponse struct {

	// The metric name and value over the requested period for each requested metric
	SummaryMetrics map[string]float32 `json:"summary_metrics,omitempty"`

	// Array with the requested daily metric records
	DailyMetrics []AnalyticsDailyMetrics `json:"daily_metrics,omitempty"`
}
