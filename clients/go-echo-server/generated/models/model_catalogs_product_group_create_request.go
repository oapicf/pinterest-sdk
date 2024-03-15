package models

// CatalogsProductGroupCreateRequest - Request object for creating a product group.
type CatalogsProductGroupCreateRequest struct {

	Name string `json:"name"`

	Description *string `json:"description,omitempty"`

	// boolean indicator of whether the product group is being featured or not
	IsFeatured bool `json:"is_featured,omitempty"`

	Filters CatalogsProductGroupFiltersRequest `json:"filters"`

	// Catalog Feed id pertaining to the catalog product group.
	FeedId string `json:"feed_id"`
}
