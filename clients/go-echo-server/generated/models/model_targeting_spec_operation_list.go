package models

type TargetingSpecOperationList struct {

	Field string `json:"field"`

	Operation string `json:"operation"`

	Values *[]string `json:"values"`
}
