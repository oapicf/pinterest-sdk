package models

type TermsOfService struct {

	// The ID of the terms of service
	Id string `json:"id,omitempty"`

	// The terms of service content
	Html *string `json:"html,omitempty"`

	// Whether the ad account has accepted terms of service.
	HasAccepted bool `json:"has_accepted,omitempty"`

	// The ID of the ad account.
	AdAccountId string `json:"ad_account_id,omitempty"`
}
