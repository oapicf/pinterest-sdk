package models

import (
	"time"
)

type CatalogsFeedIngestion struct {

	CreatedAt time.Time `json:"created_at"`

	FeedId string `json:"feed_id"`

	Id string `json:"id"`

	Status CatalogsFeedProcessingStatus `json:"status"`
}
