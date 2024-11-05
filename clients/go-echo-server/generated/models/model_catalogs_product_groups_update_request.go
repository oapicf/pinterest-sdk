package models

import (
	"gopkg.in/validator.v2"
)

type CatalogsProductGroupsUpdateRequest struct {

	Name string `json:"name,omitempty"`

	Description *string `json:"description,omitempty"`

	// boolean indicator of whether the product group is being featured or not
	// Deprecated
	IsFeatured bool `json:"is_featured,omitempty"`

	Filters CatalogsProductGroupFiltersRequest `json:"filters,omitempty"`
}
