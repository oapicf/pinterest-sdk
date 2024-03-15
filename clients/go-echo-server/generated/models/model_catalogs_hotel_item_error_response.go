package models

// CatalogsHotelItemErrorResponse - Object describing a hotel item error
type CatalogsHotelItemErrorResponse struct {

	CatalogType CatalogsType `json:"catalog_type"`

	// The catalog hotel id in the merchant namespace
	HotelId string `json:"hotel_id,omitempty"`

	// Array with the errors for the item id requested
	Errors []ItemValidationEvent `json:"errors,omitempty"`
}
