package models

// GetBusinessAssetsResponseCatalogInfo - An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.
type GetBusinessAssetsResponseCatalogInfo struct {

	// Catalog type
	CatalogType string `json:"catalog_type,omitempty"`

	// Catalog ID.
	Id string `json:"id,omitempty" validate:"regexp=^\\\\d+$"`

	// Catalog name
	Name string `json:"name,omitempty"`
}
