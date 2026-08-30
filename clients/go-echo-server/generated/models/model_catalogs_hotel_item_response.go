package models

// CatalogsHotelItemResponse - Object describing a hotel record
type CatalogsHotelItemResponse struct {

	Attributes CatalogsHotelAttributes `json:"attributes,omitempty"`

	CatalogType string `json:"catalog_type"`

	// The catalog hotel id in the merchant namespace
	HotelId string `json:"hotel_id,omitempty"`

	// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
	ItemResponseKind string `json:"item_response_kind"`

	// The pins mapped to the item
	Pins *[]Pin `json:"pins,omitempty"`
}
