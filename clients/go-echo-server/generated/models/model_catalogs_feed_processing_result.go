package models

import (
	"time"
)

type CatalogsFeedProcessingResult struct {

	CreatedAt time.Time `json:"created_at"`

	// ID of the feed processing result.
	Id string `json:"id" validate:"regexp=^\\d+$"`

	IngestionDetails CatalogsFeedIngestionDetails `json:"ingestion_details"`

	ProductCounts *CatalogsFeedProductCounts `json:"product_counts"`

	Status CatalogsFeedProcessingStatus `json:"status"`

	UpdatedAt time.Time `json:"updated_at"`

	ValidationDetails CatalogsFeedValidationDetails `json:"validation_details"`

	VideoCounts CatalogsFeedVideoCounts `json:"video_counts,omitempty"`
}
