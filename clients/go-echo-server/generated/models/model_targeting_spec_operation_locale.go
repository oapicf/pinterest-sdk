package models

type TargetingSpecOperationLocale struct {

	Field string `json:"field"`

	Operation TargetingSpecListOperation `json:"operation"`

	Values []string `json:"values"`
}
