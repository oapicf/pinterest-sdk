package models

// CatalogsVerticalProductGroupCreateRequest - Request object for creating a hotel product group.
type CatalogsVerticalProductGroupCreateRequest struct {

	CatalogType string `json:"catalog_type"`

	Name string `json:"name"`

	Description *string `json:"description,omitempty"`

	Filters CatalogsHotelProductGroupFilters `json:"filters"`

	// Catalog id pertaining to the hotel product group.
	CatalogId string `json:"catalog_id"`
}
