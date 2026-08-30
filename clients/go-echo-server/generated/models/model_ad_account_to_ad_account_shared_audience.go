package models

type AdAccountToAdAccountSharedAudience struct {

	// Unique identifier of an audience
	AudienceId string `json:"audience_id" validate:"regexp=^\\d+$"`

	// Permissions granted to the recipients.
	Permissions []Role `json:"permissions,omitempty"`

	// Ad account IDs to share with or revoke from (request) / that received the audience (response).
	RecipientAccountIds []string `json:"recipient_account_ids"`
}
