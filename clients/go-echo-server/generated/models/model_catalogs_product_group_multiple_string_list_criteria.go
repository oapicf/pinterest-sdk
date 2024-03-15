package models

type CatalogsProductGroupMultipleStringListCriteria struct {

	Values [][]string `json:"values"`

	Negated bool `json:"negated,omitempty"`
}
