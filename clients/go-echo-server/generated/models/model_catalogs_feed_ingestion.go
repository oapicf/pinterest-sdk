package models

import (
	"time"
)

type CatalogsFeedIngestion struct {

	// Timestamp of the feed ingestion.
	CreatedAt time.Time `json:"created_at"`

	// Catalog Feed id pertaining to the feed ingestion.
	FeedId string `json:"feed_id" validate:"regexp=^\\d+$"`

	// Unique identifier of a feed ingestion.
	Id string `json:"id" validate:"regexp=^\\d+$"`

	// Status of the feed ingestion.
	Status CatalogsFeedProcessingStatus `json:"status"`
}
