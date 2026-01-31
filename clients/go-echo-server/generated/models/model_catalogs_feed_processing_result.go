package models

import (
	"time"
)

type CatalogsFeedProcessingResult struct {

	CreatedAt time.Time `json:"created_at"`

	Id string `json:"id"`

	UpdatedAt time.Time `json:"updated_at"`

	IngestionDetails CatalogsFeedIngestionDetails `json:"ingestion_details"`

	ProductCounts *CatalogsFeedProductCounts `json:"product_counts"`

	Status CatalogsFeedProcessingStatus `json:"status"`

	ValidationDetails CatalogsFeedValidationDetails `json:"validation_details"`

	VideoCounts CatalogsFeedVideoCounts `json:"video_counts,omitempty"`
}
