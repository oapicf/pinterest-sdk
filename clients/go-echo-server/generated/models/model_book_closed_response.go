package models

// BookClosedResponse - Creation fields
type BookClosedResponse struct {

	// Are conversion metrics ready?
	ConversionMetricsReady bool `json:"conversion_metrics_ready,omitempty"`

	// Are non-conversion metrics ready?
	NonConversionMetricsReady bool `json:"non_conversion_metrics_ready,omitempty"`
}
