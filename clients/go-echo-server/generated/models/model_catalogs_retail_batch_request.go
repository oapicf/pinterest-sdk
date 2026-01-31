package models

// CatalogsRetailBatchRequest - A request object that can have multiple operations on a single retail batch
type CatalogsRetailBatchRequest struct {

	CatalogType string `json:"catalog_type"`

	Country Country `json:"country"`

	// We recommend using the CatalogsLocale values.
	Language string `json:"language"`

	// Array with catalogs item operations
	Items []CatalogsRetailBatchRequestItemsInner `json:"items"`
}
