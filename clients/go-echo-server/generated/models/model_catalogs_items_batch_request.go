package models

// CatalogsItemsBatchRequest - Request object of catalogs items batch
type CatalogsItemsBatchRequest struct {

	Country Country `json:"country"`

	// Array with catalogs items
	Items []ItemDeleteBatchRecord `json:"items"`

	// We recommend using the CatalogsLocale values.
	Language string `json:"language"`

	Operation BatchOperation `json:"operation"`
}
