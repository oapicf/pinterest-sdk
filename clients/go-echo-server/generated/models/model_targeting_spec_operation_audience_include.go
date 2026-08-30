package models

type TargetingSpecOperationAudienceInclude struct {

	Field string `json:"field"`

	Operation TargetingSpecListOperation `json:"operation"`

	Values []string `json:"values"`
}
