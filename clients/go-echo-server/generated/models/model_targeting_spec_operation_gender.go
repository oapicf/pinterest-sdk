package models

type TargetingSpecOperationGender struct {

	Field string `json:"field"`

	Operation TargetingSpecListOperation `json:"operation"`

	Values []TargetingSpecGender `json:"values"`
}
