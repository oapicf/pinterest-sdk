package models

type TopPinsAnalyticsResponseDateAvailability struct {

	LatestAvailableTimestamp float32 `json:"latest_available_timestamp,omitempty"`

	IsRealtime bool `json:"is_realtime,omitempty"`
}
