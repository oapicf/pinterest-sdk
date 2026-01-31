package models

type CatalogsProductGroupPricingCurrencyCriteria struct {

	Currency NonNullableCatalogsCurrency `json:"currency"`

	Negated bool `json:"negated,omitempty"`

	Operator string `json:"operator"`

	Value float32 `json:"value"`
}
