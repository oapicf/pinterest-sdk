package models

// AdAccountToBusinessSharedAudienceUpdateWithRequiredBody - Resource create or update operation model with required body fields (no OptionalProperties).
type AdAccountToBusinessSharedAudienceUpdateWithRequiredBody struct {

	// Unique identifier of an audience
	AudienceId string `json:"audience_id" validate:"regexp=^\\d+$"`

	OperationType OperationType `json:"operation_type"`

	// Business IDs to share with or revoke from (request) / that received the audience (response).
	RecipientBusinessIds []string `json:"recipient_business_ids"`
}
