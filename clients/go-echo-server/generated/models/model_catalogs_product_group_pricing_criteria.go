package models

type CatalogsProductGroupPricingCriteria struct {

	Inclusion bool `json:"inclusion"`

	Values float32 `json:"values"`

	Negated bool `json:"negated"`
}
