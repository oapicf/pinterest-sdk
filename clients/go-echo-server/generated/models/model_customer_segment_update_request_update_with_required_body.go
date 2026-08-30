package models

// CustomerSegmentUpdateRequestUpdateWithRequiredBody - Resource create or update operation model with required body fields (no OptionalProperties).
type CustomerSegmentUpdateRequestUpdateWithRequiredBody struct {

	// Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
	AudienceIds []string `json:"audience_ids,omitempty"`

	// Customer segment ID.
	Id string `json:"id" validate:"regexp=^\\d+$"`

	OperationType AudienceUpdateOperationType `json:"operation_type"`
}
