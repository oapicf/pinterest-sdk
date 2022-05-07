package models

// CatalogsItemsBatchRequest - Request object of catalogs items batch
type CatalogsItemsBatchRequest struct {

	Country Country `json:"country,omitempty"`

	Language Language `json:"language,omitempty"`

	Operation BatchOperation `json:"operation,omitempty"`

	// Array with catalogs items
	Items []ItemBatchRecord `json:"items,omitempty"`
}
