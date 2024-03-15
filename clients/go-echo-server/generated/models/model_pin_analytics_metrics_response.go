package models

type PinAnalyticsMetricsResponse struct {

	// The lifetime metric name and value.
	LifetimeMetrics map[string]int32 `json:"lifetime_metrics,omitempty"`

	// Array with the requested daily metric records
	DailyMetrics []PinAnalyticsMetricsResponseDailyMetricsInner `json:"daily_metrics,omitempty"`

	// The metric name and value over the requested period for each requested metric
	SummaryMetrics map[string]float32 `json:"summary_metrics,omitempty"`
}
