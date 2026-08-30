package models

// CatalogsItemsUpsertBatchRequest - Request object to upsert catalogs items
type CatalogsItemsUpsertBatchRequest struct {

	Country Country `json:"country"`

	// Array with catalogs items
	Items []ItemUpsertBatchRecord `json:"items"`

	// We recommend using the CatalogsLocale values.
	Language string `json:"language"`

	Operation string `json:"operation"`
}
