package models

type CatalogsProductGroupMultipleStringListCriteria struct {

	Negated bool `json:"negated,omitempty"`

	Values [][]string `json:"values"`
}
