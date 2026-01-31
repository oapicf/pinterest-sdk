package models

type CatalogsProductGroupMultipleGenderCriteria struct {

	Negated bool `json:"negated,omitempty"`

	Values []Gender `json:"values"`
}
