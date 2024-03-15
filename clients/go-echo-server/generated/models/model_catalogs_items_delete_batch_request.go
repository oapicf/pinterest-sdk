package models

// CatalogsItemsDeleteBatchRequest - Request object to delete catalogs items
type CatalogsItemsDeleteBatchRequest struct {

	Country Country `json:"country"`

	Language Language `json:"language"`

	Operation BatchOperation `json:"operation"`

	// Array with catalogs items
	Items []ItemDeleteBatchRecord `json:"items"`
}
