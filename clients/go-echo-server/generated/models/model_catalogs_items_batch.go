package models

// CatalogsItemsBatch - Object describing the catalogs items batch
type CatalogsItemsBatch struct {

	// Id of the catalogs items batch
	BatchId string `json:"batch_id,omitempty"`

	CatalogType string `json:"catalog_type"`

	// Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
	CompletedTime *time.Time `json:"completed_time,omitempty"`

	// Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
	CreatedTime time.Time `json:"created_time"`

	// Array with the catalogs items processing records part of the catalogs items batch
	Items []CreativeAssetsProcessingRecord `json:"items,omitempty"`

	Status BatchOperationStatus `json:"status,omitempty"`
}
