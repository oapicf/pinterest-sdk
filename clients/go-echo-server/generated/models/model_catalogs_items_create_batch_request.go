package models

// CatalogsItemsCreateBatchRequest - Request object to create catalogs items
type CatalogsItemsCreateBatchRequest struct {

	Country Country `json:"country"`

	// Array with catalogs items
	Items []ItemCreateBatchRecord `json:"items"`

	// We recommend using the CatalogsLocale values.
	Language string `json:"language"`

	Operation BatchOperation `json:"operation"`
}
