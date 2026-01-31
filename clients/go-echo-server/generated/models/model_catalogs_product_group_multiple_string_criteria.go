package models

type CatalogsProductGroupMultipleStringCriteria struct {

	Negated bool `json:"negated,omitempty"`

	Values []string `json:"values"`
}
