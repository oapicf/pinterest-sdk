package models

type CustomConversionEventMetrics struct {

	CustomEventMetricsType AdeColumnType `json:"custom_event_metrics_type"`

	// Name of the advertiser-defined custom conversion event
	CustomEventName string `json:"custom_event_name"`
}
