package models

import (
	"time"
)

// CatalogsCreativeAssetsFeed - Catalogs Creative Asset Feed object
type CatalogsCreativeAssetsFeed struct {

	// Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
	CatalogId string `json:"catalog_id" validate:"regexp=^\\d+$"`

	CatalogType string `json:"catalog_type"`

	CreatedAt time.Time `json:"created_at"`

	Credentials *CatalogsFeedCredentials `json:"credentials,omitempty"`

	DefaultCountry Country `json:"default_country"`

	DefaultCurrency *NullableCurrency `json:"default_currency,omitempty"`

	// The locale used within a feed for product descriptions.
	DefaultLocale string `json:"default_locale"`

	Format CatalogsFormat `json:"format"`

	// ID of the feed entity.
	Id string `json:"id" validate:"regexp=^\\d+$"`

	// The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
	Location string `json:"location" validate:"regexp=^(http|https|ftp|sftp)://"`

	// A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
	Name *string `json:"name"`

	PreferredProcessingSchedule *CatalogsFeedProcessingSchedule `json:"preferred_processing_schedule,omitempty"`

	Status CatalogsStatus `json:"status"`

	UpdatedAt time.Time `json:"updated_at"`
}
