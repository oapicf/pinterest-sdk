package models

// CatalogsItemsDeleteBatchRequest - Request object to delete catalogs items
type CatalogsItemsDeleteBatchRequest struct {

	Country Country `json:"country"`

	// We recommend using the CatalogsLocale values.
	Language string `json:"language"`

	Operation BatchOperation `json:"operation"`

	// Array with catalogs items
	Items []ItemDeleteBatchRecord `json:"items"`
}
