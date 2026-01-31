package models

// TopPinsAnalyticsResponsePinsInner - Array with metrics, status, and pin id for the requested metric
type TopPinsAnalyticsResponsePinsInner struct {

	DataStatus map[string]DataStatus `json:"data_status,omitempty"`

	// The metric name and daily value for each requested metric
	Metrics map[string]float32 `json:"metrics,omitempty"`

	// The pin id
	PinId string `json:"pin_id,omitempty"`
}
