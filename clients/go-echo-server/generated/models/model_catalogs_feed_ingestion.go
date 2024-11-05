package models

import (
	"time"
)

type CatalogsFeedIngestion struct {

	Id string `json:"id"`

	FeedId string `json:"feed_id"`

	CreatedAt time.Time `json:"created_at"`

	Status CatalogsFeedProcessingStatus `json:"status"`
}
