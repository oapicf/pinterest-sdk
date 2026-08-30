package models

type BookClosed struct {

	// Are conversion metrics ready?
	ConversionMetricsReady bool `json:"conversion_metrics_ready"`

	// Are non-conversion metrics ready?
	NonConversionMetricsReady bool `json:"non_conversion_metrics_ready"`
}
