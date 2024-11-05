package models

// CatalogsListProductsByFeedBasedFilter - Request object to list products for a given feed_id and product group filter.
type CatalogsListProductsByFeedBasedFilter struct {

	// Catalog Feed id pertaining to the catalog product group filter.
	FeedId string `json:"feed_id" validate:"regexp=^\\\\d+$"`

	Filters CatalogsProductGroupFilters `json:"filters"`
}
