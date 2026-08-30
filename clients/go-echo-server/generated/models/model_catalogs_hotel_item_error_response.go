package models

// CatalogsHotelItemErrorResponse - Object describing a hotel item error
type CatalogsHotelItemErrorResponse struct {

	CatalogType string `json:"catalog_type"`

	// Array with the errors for the item id requested
	Errors []ItemValidationEvent `json:"errors"`

	// The catalog hotel id in the merchant namespace
	HotelId string `json:"hotel_id,omitempty"`

	// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
	ItemResponseKind string `json:"item_response_kind"`
}
