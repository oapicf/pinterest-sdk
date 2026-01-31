package models

// CatalogsVerticalProductGroupCreateRequest - Request object for creating a catalog based product group.
type CatalogsVerticalProductGroupCreateRequest struct {

	// Catalog id pertaining to the creative assets product group.
	CatalogId string `json:"catalog_id"`

	CatalogType string `json:"catalog_type"`

	Country Country `json:"country,omitempty"`

	Description *string `json:"description,omitempty"`

	Filters CatalogsCreativeAssetsProductGroupFilters `json:"filters"`

	Locale CatalogsLocale `json:"locale,omitempty"`

	Name string `json:"name"`
}
