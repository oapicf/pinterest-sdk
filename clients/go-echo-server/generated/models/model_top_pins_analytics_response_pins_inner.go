package models

// TopPinsAnalyticsResponsePinsInner - Array with metrics, status, and pin id for the requested metric
type TopPinsAnalyticsResponsePinsInner struct {

	// The metric name and daily value for each requested metric
	Metrics map[string]float32 `json:"metrics,omitempty"`

	DataStatus map[string]DataStatus `json:"data_status,omitempty"`

	// The pin id
	PinId string `json:"pin_id,omitempty"`
}
