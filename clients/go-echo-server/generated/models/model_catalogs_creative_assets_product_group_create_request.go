package models

// CatalogsCreativeAssetsProductGroupCreateRequest - Request object for creating a creative assets product group.
type CatalogsCreativeAssetsProductGroupCreateRequest struct {

	CatalogType string `json:"catalog_type"`

	Name string `json:"name"`

	Description *string `json:"description,omitempty"`

	Filters CatalogsCreativeAssetsProductGroupFilters `json:"filters"`

	// Catalog id pertaining to the creative assets product group.
	CatalogId string `json:"catalog_id" validate:"regexp=^\\\\d+$"`
}
