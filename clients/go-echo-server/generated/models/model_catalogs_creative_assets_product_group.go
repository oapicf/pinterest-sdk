package models

type CatalogsCreativeAssetsProductGroup struct {

	CatalogType string `json:"catalog_type"`

	// ID of the creative assets product group.
	Id string `json:"id" validate:"regexp=^\\\\d+$"`

	// Name of creative assets product group
	Name string `json:"name,omitempty"`

	Description *string `json:"description,omitempty"`

	Filters CatalogsCreativeAssetsProductGroupFilters `json:"filters"`

	// Unix timestamp in seconds of when catalog product group was created.
	CreatedAt int32 `json:"created_at,omitempty"`

	// Unix timestamp in seconds of last time catalog product group was updated.
	UpdatedAt int32 `json:"updated_at,omitempty"`

	// Catalog id pertaining to the creative assets product group.
	CatalogId string `json:"catalog_id" validate:"regexp=^\\\\d+$"`
}
