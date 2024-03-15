package models

// CatalogsListProductsByFilterRequest - Request object to list products for a given product group filter.
type CatalogsListProductsByFilterRequest struct {

	// Catalog Feed id pertaining to the catalog product group filter.
	FeedId string `json:"feed_id"`

	Filters CatalogsProductGroupFilters `json:"filters"`
}
