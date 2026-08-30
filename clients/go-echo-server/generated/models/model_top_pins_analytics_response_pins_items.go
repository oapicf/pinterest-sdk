package models

// TopPinsAnalyticsResponsePinsItems - Array with metrics, status, and pin id for the requested metric
type TopPinsAnalyticsResponsePinsItems struct {

	DataStatus map[string]DataStatus `json:"data_status,omitempty"`

	Metrics map[string]float32 `json:"metrics,omitempty"`

	// The pin id
	PinId string `json:"pin_id,omitempty"`
}
