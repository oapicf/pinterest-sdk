package models

import (
	"gopkg.in/validator.v2"
)

type FeedsUpdateRequest struct {

	DefaultAvailability *ProductAvailabilityType `json:"default_availability,omitempty"`

	DefaultCurrency *NullableCurrency `json:"default_currency,omitempty"`

	// A human-friendly name associated to a given feed.
	Name string `json:"name,omitempty"`

	Format CatalogsFormat `json:"format,omitempty"`

	Credentials *CatalogsFeedCredentials `json:"credentials,omitempty"`

	// The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
	Location string `json:"location,omitempty"`

	PreferredProcessingSchedule *CatalogsFeedProcessingSchedule `json:"preferred_processing_schedule,omitempty"`

	Status CatalogsStatus `json:"status,omitempty"`
}
