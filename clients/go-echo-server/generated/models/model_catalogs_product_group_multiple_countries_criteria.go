package models

type CatalogsProductGroupMultipleCountriesCriteria struct {

	Values []Country `json:"values"`

	Negated bool `json:"negated,omitempty"`
}
