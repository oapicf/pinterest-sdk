package models

type PinAnalyticsMetricsResponseDailyMetricsInner struct {

	DataStatus DataStatus `json:"data_status,omitempty"`

	// Metrics date (UTC): YYYY-MM-DD.
	Date string `json:"date,omitempty"`

	// The metric name and daily value for each requested metric
	Metrics map[string]float32 `json:"metrics,omitempty"`
}
