package models

type CatalogsRetailProductGroup struct {

	CatalogType string `json:"catalog_type"`

	// ID of the catalog product group.
	Id string `json:"id" validate:"regexp=^\\\\d+$"`

	// Name of catalog product group
	Name string `json:"name,omitempty"`

	Description *string `json:"description,omitempty"`

	Filters CatalogsProductGroupFilters `json:"filters"`

	// boolean indicator of whether the product group is being featured or not
	// Deprecated
	IsFeatured bool `json:"is_featured,omitempty"`

	Type CatalogsProductGroupType `json:"type,omitempty"`

	Status CatalogsProductGroupStatus `json:"status,omitempty"`

	// Unix timestamp in seconds of when catalog product group was created.
	CreatedAt int32 `json:"created_at,omitempty"`

	// Unix timestamp in seconds of last time catalog product group was updated.
	UpdatedAt int32 `json:"updated_at,omitempty"`

	// Catalog id pertaining to the retail product group.
	CatalogId string `json:"catalog_id" validate:"regexp=^\\\\d+$"`

	// id of the catalogs feed belonging to this catalog product group
	FeedId *string `json:"feed_id" validate:"regexp=^\\\\d+$"`

	Country *string `json:"country,omitempty"`

	Locale *string `json:"locale,omitempty"`
}
