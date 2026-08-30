package models

type BulkUpsertRequestUpdateCatalogProductGroupsItems struct {

	Description *string `json:"description,omitempty"`

	Filters CatalogsProductGroupFiltersRequest `json:"filters,omitempty"`

	// boolean indicator of whether the product group is being featured or not
	// Deprecated
	IsFeatured bool `json:"is_featured,omitempty"`

	Name string `json:"name,omitempty"`
}
