package models

type CatalogsItemsBatchPostRequest struct {

	// Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	CatalogId string `json:"catalog_id,omitempty"`

	CatalogType string `json:"catalog_type"`

	Country Country `json:"country"`

	// Array with catalogs items
	Items []ItemDeleteBatchRecord `json:"items"`

	// We recommend using the CatalogsLocale values.
	Language string `json:"language"`

	Operation string `json:"operation"`
}
