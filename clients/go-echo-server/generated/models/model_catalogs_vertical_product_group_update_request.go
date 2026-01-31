package models

// CatalogsVerticalProductGroupUpdateRequest - Request object for updating a catalog based product group.
type CatalogsVerticalProductGroupUpdateRequest struct {

	CatalogType string `json:"catalog_type,omitempty"`

	Country Country `json:"country,omitempty"`

	Description *string `json:"description,omitempty"`

	Filters CatalogsCreativeAssetsProductGroupFilters `json:"filters,omitempty"`

	Locale CatalogsLocale `json:"locale,omitempty"`

	Name string `json:"name,omitempty"`
}
