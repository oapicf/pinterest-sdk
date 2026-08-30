package models

type TargetingTemplateUpdateRequestReadOrUpdate struct {

	// Targeting template ID
	Id string `json:"id" validate:"regexp=^\\d+$"`

	OperationType AudienceUpdateOperationType `json:"operation_type"`

	// targeting profile attributes
	TargetingAttributes TargetingSpecOptimal `json:"targeting_attributes,omitempty"`
}
