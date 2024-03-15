package models

// CatalogsProductGroupCurrencyCriteria - A currency filter. This filter cannot be negated
type CatalogsProductGroupCurrencyCriteria struct {

	Values NonNullableCatalogsCurrency `json:"values"`

	Negated bool `json:"negated,omitempty"`
}
