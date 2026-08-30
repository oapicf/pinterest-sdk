package models

// CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest - Request object to list products for a given creative assets catalog_id and product group filter.
type CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest struct {

	// Catalog ID pertaining to the product group.
	CatalogId string `json:"catalog_id" validate:"regexp=^\\d+$"`

	CatalogType string `json:"catalog_type"`

	Filters CatalogsCreativeAssetsProductGroupFilters `json:"filters"`
}
