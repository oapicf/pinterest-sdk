package models

type CatalogsProductGroupMultipleMediaTypesCriteria struct {

	Negated bool `json:"negated,omitempty"`

	Values []MediaType `json:"values"`
}
