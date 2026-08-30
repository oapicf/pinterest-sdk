package models

type PriceFilterPrice struct {

	Currency NonNullableCatalogsCurrency `json:"currency"`

	Negated bool `json:"negated,omitempty"`

	Operator NumericFilterOperatorType `json:"operator"`

	Value float32 `json:"value"`
}
