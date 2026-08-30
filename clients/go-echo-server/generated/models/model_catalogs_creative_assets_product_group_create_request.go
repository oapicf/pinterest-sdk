package models

// CatalogsCreativeAssetsProductGroupCreateRequest - Request object for creating a creative assets product group.
type CatalogsCreativeAssetsProductGroupCreateRequest struct {

	// Catalog ID pertaining to the product group.
	CatalogId string `json:"catalog_id" validate:"regexp=^\\d+$"`

	CatalogType string `json:"catalog_type"`

	Description *string `json:"description,omitempty"`

	Filters CatalogsCreativeAssetsProductGroupFilters `json:"filters"`

	Name string `json:"name"`
}
