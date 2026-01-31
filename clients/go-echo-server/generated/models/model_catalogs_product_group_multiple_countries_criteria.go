package models

type CatalogsProductGroupMultipleCountriesCriteria struct {

	Negated bool `json:"negated,omitempty"`

	Values []Country `json:"values"`
}
