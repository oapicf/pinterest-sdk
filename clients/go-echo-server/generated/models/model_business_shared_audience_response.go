package models

type BusinessSharedAudienceResponse struct {

	// Audience ID that was shared
	AudienceId string `json:"audience_id,omitempty"`

	Permissions []Role `json:"permissions,omitempty"`

	// Business IDs that received the audience
	RecipientBusinessIds []string `json:"recipient_business_ids,omitempty"`
}
