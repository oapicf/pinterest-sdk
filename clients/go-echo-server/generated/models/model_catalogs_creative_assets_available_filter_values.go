package models

type CatalogsCreativeAssetsAvailableFilterValues struct {

	CatalogType string `json:"catalog_type"`

	FilterValues CatalogsCreativeAssetsFilterValuesMap `json:"filter_values"`
}
