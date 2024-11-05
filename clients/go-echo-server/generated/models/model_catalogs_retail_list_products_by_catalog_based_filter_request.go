package models

// CatalogsRetailListProductsByCatalogBasedFilterRequest - Request object to list products for a given retail catalog_id and product group filter.
type CatalogsRetailListProductsByCatalogBasedFilterRequest struct {

	// Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
	CatalogType string `json:"catalog_type"`

	// Catalog id pertaining to the retail product group.
	CatalogId string `json:"catalog_id" validate:"regexp=^\\\\d+$"`

	Filters CatalogsProductGroupFilters `json:"filters"`

	Country Country `json:"country"`

	Locale CatalogsLocale `json:"locale"`
}
