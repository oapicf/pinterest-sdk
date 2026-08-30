package models

type PinAnalyticsDailyMetrics struct {

	DataStatus DataStatus `json:"data_status,omitempty"`

	// Metrics date (UTC): YYYY-MM-DD.
	Date string `json:"date,omitempty"`

	Metrics map[string]float32 `json:"metrics,omitempty"`
}
