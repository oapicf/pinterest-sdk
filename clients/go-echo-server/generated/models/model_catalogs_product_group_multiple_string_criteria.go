package models

type CatalogsProductGroupMultipleStringCriteria struct {

	Values []string `json:"values"`

	Negated bool `json:"negated,omitempty"`
}
