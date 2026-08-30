package models

// AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody - Resource create or update operation model with required body fields (no OptionalProperties).
type AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody struct {

	// Unique identifier of an audience
	AudienceId string `json:"audience_id" validate:"regexp=^\\d+$"`

	OperationType OperationType `json:"operation_type"`

	// Ad account IDs to share with or revoke from (request) / that received the audience (response).
	RecipientAccountIds []string `json:"recipient_account_ids"`
}
