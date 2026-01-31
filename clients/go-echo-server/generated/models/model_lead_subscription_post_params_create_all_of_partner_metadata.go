package models

// LeadSubscriptionPostParamsCreateAllOfPartnerMetadata - Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
type LeadSubscriptionPostParamsCreateAllOfPartnerMetadata struct {

	// Text field value that uniquely identifies a subscriber.
	SubscriberKey string `json:"subscriber_key,omitempty"`
}
