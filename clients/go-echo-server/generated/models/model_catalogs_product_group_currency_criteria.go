package models

type CatalogsProductGroupCurrencyCriteria struct {

	Values NonNullableCatalogsCurrency `json:"values"`

	Negated bool `json:"negated"`
}
