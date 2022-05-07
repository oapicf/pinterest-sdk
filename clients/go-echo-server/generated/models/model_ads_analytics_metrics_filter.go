package models

type AdsAnalyticsMetricsFilter struct {

	Field AdsAnalyticsFilterColumn `json:"field,omitempty"`

	Operator AdsAnalyticsFilterOperator `json:"operator,omitempty"`

	// List of values for filtering
	Values []float32 `json:"values,omitempty"`
}
