package models

type SharedAudience struct {

	// Unique identifier of an audience
	AudienceId string `json:"audience_id" validate:"regexp=^\\\\d+$"`

	OperationType OperationType `json:"operation_type"`

	// List of ad account IDs to share with or revoke from.
	RecipientAccountIds []string `json:"recipient_account_ids"`
}
