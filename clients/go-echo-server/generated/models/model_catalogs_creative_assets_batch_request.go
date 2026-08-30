package models

// CatalogsCreativeAssetsBatchRequest - Request object to update catalogs creative assets items
type CatalogsCreativeAssetsBatchRequest struct {

	// Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	CatalogId string `json:"catalog_id,omitempty" validate:"regexp=^\\d+$"`

	CatalogType string `json:"catalog_type"`

	Country Country `json:"country"`

	// Array with creative assets item operations
	Items []CatalogsCreativeAssetsBatchItem `json:"items"`

	// We recommend using the CatalogsLocale values.
	Language string `json:"language"`
}
