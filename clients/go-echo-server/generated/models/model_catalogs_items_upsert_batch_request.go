package models

// CatalogsItemsUpsertBatchRequest - Request object to upsert catalogs items
type CatalogsItemsUpsertBatchRequest struct {

	Country Country `json:"country"`

	// We recommend using the CatalogsLocale values.
	Language string `json:"language"`

	Operation BatchOperation `json:"operation"`

	// Array with catalogs items
	Items []ItemUpsertBatchRecord `json:"items"`
}
