package models

type TargetingSpecOperationMinMaxAge struct {

	Field string `json:"field"`

	Operation string `json:"operation"`

	Value *string `json:"value" validate:"regexp=^\\\\d+\\\\+?$"`
}
