package models

// CatalogsProductGroupCreateRequest - Request object for creating a product group.
type CatalogsProductGroupCreateRequest struct {

	// Catalog Feed id pertaining to the catalog product group.
	FeedId string `json:"feed_id"`

	Name string `json:"name"`

	Description *string `json:"description,omitempty"`

	Filters CatalogsProductGroupFilters `json:"filters"`
}
