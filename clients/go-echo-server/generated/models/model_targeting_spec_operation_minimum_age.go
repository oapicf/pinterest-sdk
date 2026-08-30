package models

type TargetingSpecOperationMinimumAge struct {

	Field string `json:"field"`

	Operation string `json:"operation"`

	Value *string `json:"value" validate:"regexp=^\\d+\\+?$"`
}
