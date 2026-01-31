package models

type ItemsBatchPostRequest struct {

	CatalogType string `json:"catalog_type"`

	Country Country `json:"country"`

	// We recommend using the CatalogsLocale values.
	Language string `json:"language"`

	// Array with catalogs items
	Items []ItemDeleteBatchRecord `json:"items"`

	// Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
	CatalogId string `json:"catalog_id,omitempty"`

	Operation BatchOperation `json:"operation"`
}
