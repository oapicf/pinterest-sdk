package models

// CatalogsProductGroupUpdateRequest - Request object for updating a product group.
type CatalogsProductGroupUpdateRequest struct {

	Description *string `json:"description,omitempty"`

	Filters CatalogsProductGroupFiltersRequest `json:"filters,omitempty"`

	// boolean indicator of whether the product group is being featured or not
	// Deprecated
	IsFeatured bool `json:"is_featured,omitempty"`

	Name string `json:"name,omitempty"`
}
