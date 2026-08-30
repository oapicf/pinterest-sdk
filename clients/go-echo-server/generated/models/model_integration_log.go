package models

// IntegrationLog - Schema for log sent from an integration application.
type IntegrationLog struct {

	AdvertiserId *string `json:"advertiser_id,omitempty"`

	// Version number of the integration application.
	AppVersionNumber string `json:"app_version_number,omitempty"`

	// Timestamp in milliseconds of when the log was executed at the client.
	ClientTimestamp int32 `json:"client_timestamp"`

	Error IntegrationLogClientError `json:"error,omitempty"`

	// Log event type
	EventType IntegrationLogEventType `json:"event_type"`

	ExternalBusinessId *string `json:"external_business_id,omitempty"`

	FeedProfileId *string `json:"feed_profile_id,omitempty"`

	// Log level type
	LogLevel IntegrationLogLevel `json:"log_level"`

	MerchantId *string `json:"merchant_id,omitempty"`

	// Explanation of the event that occured.
	Message string `json:"message,omitempty"`

	// Version number of the platform the integration application is running on.
	PlatformVersionNumber string `json:"platform_version_number,omitempty"`

	Request IntegrationLogClientRequest `json:"request,omitempty"`

	TagId *string `json:"tag_id,omitempty"`
}
