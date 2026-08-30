package models

type CatalogsVerticalProductGroup struct {

	// Catalog ID pertaining to the product group.
	CatalogId string `json:"catalog_id"`

	CatalogType string `json:"catalog_type"`

	Country *string `json:"country,omitempty"`

	// Unix timestamp in seconds of when catalog product group was created.
	CreatedAt int32 `json:"created_at,omitempty"`

	Description *string `json:"description,omitempty"`

	// id of the catalogs feed belonging to this catalog product group
	FeedId *string `json:"feed_id"`

	Filters CatalogsCreativeAssetsProductGroupFilters `json:"filters"`

	// ID of the catalog product group.
	Id string `json:"id"`

	// boolean indicator of whether the product group is being featured or not
	// Deprecated
	IsFeatured bool `json:"is_featured,omitempty"`

	Locale *string `json:"locale,omitempty"`

	// Name of catalog product group
	Name string `json:"name,omitempty"`

	Status CatalogsProductGroupStatus `json:"status,omitempty"`

	Type CatalogsHotelProductGroupType `json:"type"`

	// Unix timestamp in seconds of last time catalog product group was updated.
	UpdatedAt int32 `json:"updated_at,omitempty"`
}
