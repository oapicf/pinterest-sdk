package models

type BusinessSharedAudience struct {

	// Unique identifier of an audience
	AudienceId string `json:"audience_id" validate:"regexp=^\\\\d+$"`

	OperationType OperationType `json:"operation_type"`

	// List of business IDs to share with or revoke from.
	RecipientBusinessIds []string `json:"recipient_business_ids"`
}
