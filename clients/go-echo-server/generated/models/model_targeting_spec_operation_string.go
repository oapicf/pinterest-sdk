package models

type TargetingSpecOperationString struct {

	Field string `json:"field"`

	Operation string `json:"operation"`

	Value *string `json:"value"`
}
