package models

type CatalogsProductGroupPricingCurrencyCriteria struct {

	Operator string `json:"operator"`

	Value float32 `json:"value"`

	Currency NonNullableCatalogsCurrency `json:"currency"`

	Negated bool `json:"negated,omitempty"`
}
