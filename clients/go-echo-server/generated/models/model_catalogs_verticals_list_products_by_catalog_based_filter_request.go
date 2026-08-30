package models

// CatalogsVerticalsListProductsByCatalogBasedFilterRequest - Request object to list products for a given catalog_id and product group filter.
type CatalogsVerticalsListProductsByCatalogBasedFilterRequest struct {

	// Catalog ID pertaining to the product group.
	CatalogId string `json:"catalog_id"`

	CatalogType string `json:"catalog_type"`

	Country Country `json:"country"`

	Filters CatalogsCreativeAssetsProductGroupFilters `json:"filters"`

	Locale CatalogsLocale `json:"locale"`
}
