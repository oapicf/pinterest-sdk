package models

type CatalogsProductGroupFilterOperatorTypeCriteria struct {

	FilterOperatorType FilterOperatorType `json:"filter_operator_type,omitempty"`

	Negated bool `json:"negated,omitempty"`

	Values []string `json:"values"`
}
