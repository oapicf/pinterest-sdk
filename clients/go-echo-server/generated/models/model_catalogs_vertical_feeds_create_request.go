package models

// CatalogsVerticalFeedsCreateRequest - Request object for creating a feed.
type CatalogsVerticalFeedsCreateRequest struct {

	DefaultCurrency *NullableCurrency `json:"default_currency,omitempty"`

	// A human-friendly name associated to a given feed.
	Name string `json:"name"`

	Format CatalogsFormat `json:"format"`

	DefaultLocale CatalogsFeedsCreateRequestDefaultLocale `json:"default_locale"`

	Credentials *CatalogsFeedCredentials `json:"credentials,omitempty"`

	// The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
	Location string `json:"location"`

	PreferredProcessingSchedule *CatalogsFeedProcessingSchedule `json:"preferred_processing_schedule,omitempty"`

	CatalogType CatalogsType `json:"catalog_type"`

	DefaultCountry Country `json:"default_country"`

	DefaultAvailability *ProductAvailabilityType `json:"default_availability,omitempty"`

	// Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.
	CatalogId *string `json:"catalog_id,omitempty"`
}