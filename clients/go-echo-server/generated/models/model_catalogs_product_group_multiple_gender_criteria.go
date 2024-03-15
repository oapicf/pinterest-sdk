package models

type CatalogsProductGroupMultipleGenderCriteria struct {

	Values []Gender `json:"values"`

	Negated bool `json:"negated,omitempty"`
}
