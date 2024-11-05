package models

import (
	"time"
)

type CatalogsFeedProcessingResult struct {

	CreatedAt time.Time `json:"created_at"`

	Id string `json:"id"`

	UpdatedAt time.Time `json:"updated_at"`

	IngestionDetails CatalogsFeedIngestionDetails `json:"ingestion_details"`

	Status CatalogsFeedProcessingStatus `json:"status"`

	ProductCounts *CatalogsFeedProductCounts `json:"product_counts"`

	ValidationDetails CatalogsFeedValidationDetails `json:"validation_details"`
}
