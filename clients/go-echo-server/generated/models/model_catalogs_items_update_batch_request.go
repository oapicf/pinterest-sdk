package models

// CatalogsItemsUpdateBatchRequest - Request object to update catalogs items
type CatalogsItemsUpdateBatchRequest struct {

	Country Country `json:"country"`

	// Array with catalogs items
	Items []ItemUpdateBatchRecord `json:"items"`

	// We recommend using the CatalogsLocale values.
	Language string `json:"language"`

	Operation string `json:"operation"`
}
