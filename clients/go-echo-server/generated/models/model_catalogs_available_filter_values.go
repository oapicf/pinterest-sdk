package models

// CatalogsAvailableFilterValues - Object holding available filter values for each filter key
type CatalogsAvailableFilterValues struct {

	CatalogType string `json:"catalog_type"`

	FilterValues CatalogsCreativeAssetsFilterValuesMap `json:"filter_values"`
}
