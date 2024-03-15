package models

type ItemsBatchPostRequest struct {

	Country Country `json:"country"`

	Language Language `json:"language"`

	Operation BatchOperation `json:"operation"`

	// Array with catalogs items
	Items []ItemDeleteBatchRecord `json:"items"`
}
