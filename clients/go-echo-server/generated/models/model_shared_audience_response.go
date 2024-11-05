package models

type SharedAudienceResponse struct {

	// Audience ID that was shared
	AudienceId string `json:"audience_id,omitempty"`

	Permissions []Role `json:"permissions,omitempty"`

	// Account IDs that received the audience
	RecipientAccountIds []string `json:"recipient_account_ids,omitempty"`
}
