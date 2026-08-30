package models

// CatalogsProductGroupCreateRequest - Request object for creating a product group.
type CatalogsProductGroupCreateRequest struct {

	Description *string `json:"description,omitempty"`

	// Catalog Feed id pertaining to the catalog product group.
	FeedId string `json:"feed_id" validate:"regexp=^\\d+$"`

	Filters CatalogsProductGroupFiltersRequest `json:"filters"`

	// boolean indicator of whether the product group is being featured or not
	// Deprecated
	IsFeatured bool `json:"is_featured,omitempty"`

	Name string `json:"name"`
}
