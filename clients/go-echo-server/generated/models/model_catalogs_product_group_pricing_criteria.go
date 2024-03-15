package models

type CatalogsProductGroupPricingCriteria struct {

	Inclusion bool `json:"inclusion,omitempty"`

	Values float32 `json:"values"`

	Negated bool `json:"negated,omitempty"`
}
