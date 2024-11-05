package models

type TargetingTemplateUpdateRequest struct {

	OperationType string `json:"operation_type"`

	// Targeting template ID
	Id string `json:"id" validate:"regexp=^\\\\d+$"`
}
