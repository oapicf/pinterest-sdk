package models

// CatalogsItemsBatchRequest - Request object of catalogs items batch
type CatalogsItemsBatchRequest struct {

	Country Country `json:"country"`

	// We recommend using the CatalogsLocale values.
	Language string `json:"language"`

	Operation BatchOperation `json:"operation"`

	// Array with catalogs items
	Items []ItemDeleteBatchRecord `json:"items"`
}
