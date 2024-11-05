package models

// AdAccountCreateSubscriptionRequestPartnerMetadata - Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
type AdAccountCreateSubscriptionRequestPartnerMetadata struct {

	// Text field value that uniquely identifies a subscriber.
	SubscriberKey string `json:"subscriber_key,omitempty"`
}
