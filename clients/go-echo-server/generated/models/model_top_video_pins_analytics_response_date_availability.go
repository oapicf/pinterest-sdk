package models

type TopVideoPinsAnalyticsResponseDateAvailability struct {

	IsRealtime bool `json:"is_realtime,omitempty"`

	LatestAvailableTimestamp float32 `json:"latest_available_timestamp,omitempty"`
}
