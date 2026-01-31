package models

type CatalogsRetailAvailableFilterValues struct {

	CatalogType string `json:"catalog_type"`

	FilterValues CatalogsRetailFilterValuesMap `json:"filter_values"`
}
