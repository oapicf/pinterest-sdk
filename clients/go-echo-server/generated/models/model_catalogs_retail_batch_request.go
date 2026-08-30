package models

// CatalogsRetailBatchRequest - A request object that can have multiple operations on a single retail batch
type CatalogsRetailBatchRequest struct {

	// Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
	CatalogId string `json:"catalog_id,omitempty" validate:"regexp=^\\d+$"`

	CatalogType string `json:"catalog_type"`

	Country Country `json:"country"`

	// Array with catalogs item operations
	Items []CatalogsRetailBatchRequestItemsItems `json:"items"`

	// We recommend using the CatalogsLocale values.
	Language string `json:"language"`
}
