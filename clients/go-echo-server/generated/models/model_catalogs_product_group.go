package models

// CatalogsProductGroup - catalog product group entity
type CatalogsProductGroup struct {

	// ID of the catalog product group.
	Id string `json:"id"`

	// Name of catalog product group
	Name string `json:"name,omitempty"`

	Description *string `json:"description,omitempty"`

	Filters CatalogsProductGroupFilters `json:"filters"`

	Type CatalogsProductGroupType `json:"type,omitempty"`

	Status CatalogsProductGroupStatus `json:"status,omitempty"`

	// id of the catalogs feed belonging to this catalog product group
	FeedId string `json:"feed_id,omitempty"`

	// Unix timestamp in seconds of when catalog product group was created.
	CreatedAt int32 `json:"created_at,omitempty"`

	// Unix timestamp in seconds of last time catalog product group was updated.
	UpdatedAt int32 `json:"updated_at,omitempty"`
}
