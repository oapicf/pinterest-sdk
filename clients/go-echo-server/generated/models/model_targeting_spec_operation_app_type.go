package models

type TargetingSpecOperationAppType struct {

	Field string `json:"field"`

	Operation TargetingSpecListOperation `json:"operation"`

	Values []TargetingSpecAppType `json:"values"`
}
