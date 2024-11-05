package models

type SharedAudienceCommon struct {

	// Unique identifier of an audience
	AudienceId string `json:"audience_id,omitempty" validate:"regexp=^\\\\d+$"`

	OperationType OperationType `json:"operation_type,omitempty"`
}
