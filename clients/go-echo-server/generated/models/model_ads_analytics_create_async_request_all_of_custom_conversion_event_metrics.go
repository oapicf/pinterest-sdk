package models

type AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics struct {

	// Metrics for custom defined conversion event.
	CustomEventMetricsType string `json:"custom_event_metrics_type"`

	// Name of the advertiser-defined custom conversion event
	CustomEventName string `json:"custom_event_name"`
}
