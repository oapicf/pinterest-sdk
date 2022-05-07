package models

type CatalogsFeedProcessingResultFields struct {

	IngestionDetails CatalogsFeedIngestionDetails `json:"ingestion_details"`

	Status CatalogsFeedProcessingStatus `json:"status"`

	ProductCounts *CatalogsFeedProductCounts `json:"product_counts"`

	ValidationDetails CatalogsFeedValidationDetails `json:"validation_details"`
}
