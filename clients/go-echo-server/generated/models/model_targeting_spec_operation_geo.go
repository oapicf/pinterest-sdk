package models

type TargetingSpecOperationGeo struct {

	Field string `json:"field"`

	Operation TargetingSpecListOperation `json:"operation"`

	Values []string `json:"values"`
}
