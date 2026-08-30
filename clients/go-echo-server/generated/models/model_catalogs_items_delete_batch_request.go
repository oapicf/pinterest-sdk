package models

// CatalogsItemsDeleteBatchRequest - Request object to delete catalogs items
type CatalogsItemsDeleteBatchRequest struct {

	Country Country `json:"country"`

	// Array with catalogs items
	Items []ItemDeleteBatchRecord `json:"items"`

	// We recommend using the CatalogsLocale values.
	Language string `json:"language"`

	Operation string `json:"operation"`
}
