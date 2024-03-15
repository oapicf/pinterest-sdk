package models

// CatalogsHotelProductGroupUpdateRequest - Request object for updating a hotel product group.
type CatalogsHotelProductGroupUpdateRequest struct {

	CatalogType string `json:"catalog_type,omitempty"`

	Name string `json:"name,omitempty"`

	Description *string `json:"description,omitempty"`

	Filters CatalogsHotelProductGroupFilters `json:"filters,omitempty"`
}
