package models

type AnalyticsMetricsResponse struct {

	// Array with the requested daily metric records
	DailyMetrics []AnalyticsMetricsResponseDailyMetrics `json:"daily_metrics,omitempty"`

	// The metric name and value over the requested period for each requested metric
	SummaryMetrics map[string]float32 `json:"summary_metrics,omitempty"`
}
