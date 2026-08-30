package models

// CatalogBinding - Information about a catalog asset.
type CatalogBinding struct {

	// Catalog type
	CatalogType string `json:"catalog_type,omitempty"`

	// Catalog ID.
	Id string `json:"id,omitempty" validate:"regexp=^\\d+$"`

	// Catalog name
	Name string `json:"name,omitempty"`
}
