package models

type TargetingSpecOperationAppType struct {

	Field string `json:"field"`

	Operation string `json:"operation"`

	Values *[]TargetingSpecAppType `json:"values"`
}
