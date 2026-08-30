package models

type CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 struct {

	Description *string `json:"description,omitempty"`

	Filters CatalogsProductGroupFiltersRequest `json:"filters,omitempty"`

	// boolean indicator of whether the product group is being featured or not
	// Deprecated
	IsFeatured bool `json:"is_featured,omitempty"`

	Name string `json:"name,omitempty"`

	// ID of the product group.
	Id string `json:"id" validate:"regexp=^\\d+$"`
}
