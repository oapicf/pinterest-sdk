package models

// CatalogsHotelProductGroupCreateRequest - Request object for creating a hotel product group.
type CatalogsHotelProductGroupCreateRequest struct {

	// Catalog id pertaining to the hotel product group.
	CatalogId string `json:"catalog_id" validate:"regexp=^\\\\d+$"`

	CatalogType string `json:"catalog_type"`

	Description *string `json:"description,omitempty"`

	Filters CatalogsHotelProductGroupFilters `json:"filters"`

	Name string `json:"name"`
}
