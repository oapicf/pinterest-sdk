package models

type CatalogsFeedIngestionWarnings struct {

	// We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR int32 `json:"ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR,omitempty"`

	// Additional image files are unreadable. Please upload new files to continue.
	ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE int32 `json:"ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE,omitempty"`

	// Additional image files are unreadable. Please check your link and upload new files to continue.
	ADDITIONAL_IMAGE_MALFORMED_URL int32 `json:"ADDITIONAL_IMAGE_MALFORMED_URL,omitempty"`

	// Additional image files are unreadable. Please upload new files to continue.
	ADDITIONAL_IMAGE_FILE_NOT_FOUND int32 `json:"ADDITIONAL_IMAGE_FILE_NOT_FOUND,omitempty"`

	// Additional image files are unreadable. Please upload new files to continue.
	ADDITIONAL_IMAGE_INVALID_FILE int32 `json:"ADDITIONAL_IMAGE_INVALID_FILE,omitempty"`

	// price is not a supported column. Use base_price and sale_price instead.
	HOTEL_PRICE_HEADER_IS_PRESENT int32 `json:"HOTEL_PRICE_HEADER_IS_PRESENT,omitempty"`
}
