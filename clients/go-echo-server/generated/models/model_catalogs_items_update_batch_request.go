package models

// CatalogsItemsUpdateBatchRequest - Request object to update catalogs items
type CatalogsItemsUpdateBatchRequest struct {

	Country Country `json:"country"`

	Language CatalogsItemsRequestLanguage `json:"language"`

	Operation BatchOperation `json:"operation"`

	// Array with catalogs items
	Items []ItemUpdateBatchRecord `json:"items"`
}
