package models

// CatalogsProductGroupCurrencyCriteria - A currency filter. This filter cannot be negated
type CatalogsProductGroupCurrencyCriteria struct {

	Negated bool `json:"negated,omitempty"`

	Values NonNullableCatalogsCurrency `json:"values"`
}
