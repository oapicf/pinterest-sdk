package models

type CatalogsProductGroupMultipleMediaTypesCriteria struct {

	Values []MediaType `json:"values"`

	Negated bool `json:"negated,omitempty"`
}
