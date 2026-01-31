package models

type CatalogsHotelAvailableFilterValues struct {

	CatalogType string `json:"catalog_type"`

	FilterValues CatalogsHotelFilterValuesMap `json:"filter_values"`
}
