package models

type TargetingSpecOperationGender struct {

	Field string `json:"field"`

	Operation string `json:"operation"`

	Values *[]TargetingSpecGender `json:"values"`
}
