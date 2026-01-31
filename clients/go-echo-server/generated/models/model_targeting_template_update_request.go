package models

type TargetingTemplateUpdateRequest struct {

	// Targeting template ID
	Id string `json:"id" validate:"regexp=^\\\\d+$"`

	OperationType string `json:"operation_type"`

	TargetingAttributes TargetingSpec `json:"targeting_attributes,omitempty"`
}
