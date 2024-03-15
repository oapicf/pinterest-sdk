package models

type AdsAnalyticsMetricsFilter struct {

	Field AdsAnalyticsFilterColumn `json:"field"`

	Operator AdsAnalyticsFilterOperator `json:"operator"`

	// List of values for filtering
	Values []float32 `json:"values"`
}
