// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi




// IntegrationLog - Schema for log sent from an integration application.
type IntegrationLog struct {

	// Timestamp in milliseconds of when the log was executed at the client.
	ClientTimestamp int32 `json:"client_timestamp"`

	// Log event type
	EventType string `json:"event_type"`

	// Log level type
	LogLevel string `json:"log_level"`

	ExternalBusinessId *string `json:"external_business_id,omitempty"`

	AdvertiserId *string `json:"advertiser_id,omitempty"`

	MerchantId *string `json:"merchant_id,omitempty"`

	TagId *string `json:"tag_id,omitempty"`

	FeedProfileId *string `json:"feed_profile_id,omitempty"`

	// Explanation of the event that occured.
	Message string `json:"message,omitempty"`

	// Version number of the integration application.
	AppVersionNumber string `json:"app_version_number,omitempty"`

	// Version number of the platform the integration application is running on.
	PlatformVersionNumber string `json:"platform_version_number,omitempty"`

	Error IntegrationLogClientError `json:"error,omitempty"`

	Request IntegrationLogClientRequest `json:"request,omitempty"`
}

// AssertIntegrationLogRequired checks if the required fields are not zero-ed
func AssertIntegrationLogRequired(obj IntegrationLog) error {
	elements := map[string]interface{}{
		"client_timestamp": obj.ClientTimestamp,
		"event_type": obj.EventType,
		"log_level": obj.LogLevel,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertIntegrationLogClientErrorRequired(obj.Error); err != nil {
		return err
	}
	if err := AssertIntegrationLogClientRequestRequired(obj.Request); err != nil {
		return err
	}
	return nil
}

// AssertIntegrationLogConstraints checks if the values respects the defined constraints
func AssertIntegrationLogConstraints(obj IntegrationLog) error {
	if err := AssertIntegrationLogClientErrorConstraints(obj.Error); err != nil {
		return err
	}
	if err := AssertIntegrationLogClientRequestConstraints(obj.Request); err != nil {
		return err
	}
	return nil
}
