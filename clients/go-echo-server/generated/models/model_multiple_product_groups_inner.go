package models

import (
	"gopkg.in/validator.v2"
)

type MultipleProductGroupsInner struct {

	Name string `json:"name"`

	Description *string `json:"description,omitempty"`

	// boolean indicator of whether the product group is being featured or not
	// Deprecated
	IsFeatured bool `json:"is_featured,omitempty"`

	Filters CatalogsProductGroupFiltersRequest `json:"filters"`

	// Catalog Feed id pertaining to the catalog product group.
	FeedId string `json:"feed_id"`
}
