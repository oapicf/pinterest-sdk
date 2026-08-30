package models

type TargetingSpecOperationAgeBucket struct {

	Field string `json:"field"`

	Operation string `json:"operation"`

	Values []TargetingSpecAgeBucket `json:"values"`
}
