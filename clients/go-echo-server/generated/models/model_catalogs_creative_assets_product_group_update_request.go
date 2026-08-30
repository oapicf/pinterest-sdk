package models

// CatalogsCreativeAssetsProductGroupUpdateRequest - Request object for updating a creative assets product group.
type CatalogsCreativeAssetsProductGroupUpdateRequest struct {

	CatalogType string `json:"catalog_type,omitempty"`

	Description *string `json:"description,omitempty"`

	Filters CatalogsCreativeAssetsProductGroupFilters `json:"filters,omitempty"`

	// Name of catalog product group
	Name string `json:"name,omitempty"`
}
