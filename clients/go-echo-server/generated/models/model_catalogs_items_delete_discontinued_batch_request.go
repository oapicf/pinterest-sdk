package models

// CatalogsItemsDeleteDiscontinuedBatchRequest - Request object to discontinue catalogs items
type CatalogsItemsDeleteDiscontinuedBatchRequest struct {

	Country Country `json:"country"`

	Language CatalogsItemsRequestLanguage `json:"language"`

	Operation BatchOperation `json:"operation"`

	// Array with catalogs items
	Items []ItemDeleteDiscontinuedBatchRecord `json:"items"`
}
