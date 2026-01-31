package models

import (
	"time"
)

// CatalogsRetailFeed - Catalogs Retail Feed object
type CatalogsRetailFeed struct {

	CreatedAt time.Time `json:"created_at"`

	Id string `json:"id"`

	UpdatedAt time.Time `json:"updated_at"`

	CatalogType CatalogsType `json:"catalog_type"`

	Credentials *CatalogsFeedCredentials `json:"credentials"`

	DefaultAvailability *ProductAvailabilityType `json:"default_availability"`

	DefaultCountry Country `json:"default_country"`

	DefaultCurrency *NullableCurrency `json:"default_currency"`

	// The locale used within a feed for product descriptions.
	DefaultLocale string `json:"default_locale"`

	Format CatalogsFormat `json:"format"`

	// The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
	Location string `json:"location"`

	// A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
	Name *string `json:"name"`

	PreferredProcessingSchedule *CatalogsFeedProcessingSchedule `json:"preferred_processing_schedule"`

	Status CatalogsStatus `json:"status"`
}
