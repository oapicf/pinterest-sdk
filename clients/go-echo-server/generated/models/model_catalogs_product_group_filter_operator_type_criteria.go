package models

type CatalogsProductGroupFilterOperatorTypeCriteria struct {

	FilterOperatorType string `json:"filter_operator_type,omitempty"`

	Negated bool `json:"negated,omitempty"`

	Values []string `json:"values"`
}
