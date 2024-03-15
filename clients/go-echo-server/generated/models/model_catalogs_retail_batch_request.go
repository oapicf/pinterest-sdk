package models

// CatalogsRetailBatchRequest - A request object that can have multiple operations on a single retail batch
type CatalogsRetailBatchRequest struct {

	CatalogType CatalogsType `json:"catalog_type"`

	Country Country `json:"country"`

	Language Language `json:"language"`

	// Array with catalogs item operations
	Items []CatalogsRetailBatchRequestItemsInner `json:"items"`
}
