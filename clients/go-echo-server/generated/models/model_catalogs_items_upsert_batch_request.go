package models

// CatalogsItemsUpsertBatchRequest - Request object to upsert catalogs items
type CatalogsItemsUpsertBatchRequest struct {

	Country Country `json:"country"`

	Language Language `json:"language"`

	Operation BatchOperation `json:"operation"`

	// Array with catalogs items
	Items []ItemUpsertBatchRecord `json:"items"`
}
