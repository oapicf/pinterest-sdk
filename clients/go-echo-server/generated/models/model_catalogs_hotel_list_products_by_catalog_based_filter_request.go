package models

// CatalogsHotelListProductsByCatalogBasedFilterRequest - Request object to list products for a given hotel catalog_id and product group filter.
type CatalogsHotelListProductsByCatalogBasedFilterRequest struct {

	CatalogType string `json:"catalog_type"`

	// Catalog id pertaining to the hotel product group.
	CatalogId string `json:"catalog_id" validate:"regexp=^\\\\d+$"`

	Filters CatalogsHotelProductGroupFilters `json:"filters"`
}
