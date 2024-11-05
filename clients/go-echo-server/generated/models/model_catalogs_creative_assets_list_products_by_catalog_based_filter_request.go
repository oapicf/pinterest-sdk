package models

// CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest - Request object to list products for a given creative assets catalog_id and product group filter.
type CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest struct {

	CatalogType string `json:"catalog_type"`

	// Catalog id pertaining to the creative assets product group.
	CatalogId string `json:"catalog_id" validate:"regexp=^\\\\d+$"`

	Filters CatalogsCreativeAssetsProductGroupFilters `json:"filters"`
}
