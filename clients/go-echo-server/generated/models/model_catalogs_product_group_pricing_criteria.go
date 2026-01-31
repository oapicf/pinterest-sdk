package models

type CatalogsProductGroupPricingCriteria struct {

	Inclusion bool `json:"inclusion,omitempty"`

	Negated bool `json:"negated,omitempty"`

	Values float32 `json:"values"`
}
