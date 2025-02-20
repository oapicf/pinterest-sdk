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




// AdAccountCreateSubscriptionRequestPartnerMetadata - Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
type AdAccountCreateSubscriptionRequestPartnerMetadata struct {

	// Text field value that uniquely identifies a subscriber.
	SubscriberKey string `json:"subscriber_key,omitempty"`
}

// AssertAdAccountCreateSubscriptionRequestPartnerMetadataRequired checks if the required fields are not zero-ed
func AssertAdAccountCreateSubscriptionRequestPartnerMetadataRequired(obj AdAccountCreateSubscriptionRequestPartnerMetadata) error {
	return nil
}

// AssertAdAccountCreateSubscriptionRequestPartnerMetadataConstraints checks if the values respects the defined constraints
func AssertAdAccountCreateSubscriptionRequestPartnerMetadataConstraints(obj AdAccountCreateSubscriptionRequestPartnerMetadata) error {
	return nil
}
