package models

type BusinessToBusinessSharedAudience struct {

	// Unique identifier of an audience
	AudienceId string `json:"audience_id" validate:"regexp=^\\d+$"`

	// Permissions granted to the recipients.
	Permissions []Role `json:"permissions,omitempty"`

	// Business IDs to share with or revoke from (request) / that received the audience (response).
	RecipientBusinessIds []string `json:"recipient_business_ids"`
}
