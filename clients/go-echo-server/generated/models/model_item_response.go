package models

// ItemResponse - Object describing an item record or error. Discriminated by `item_response_kind` (one unique value per leaf).
type ItemResponse struct {

	Attributes CatalogsCreativeAssetsAttributes `json:"attributes,omitempty"`

	CatalogType string `json:"catalog_type"`

	// The catalog item id in the merchant namespace
	ItemId string `json:"item_id,omitempty"`

	// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
	ItemResponseKind string `json:"item_response_kind"`

	// The pins mapped to the item
	Pins *[]Pin `json:"pins,omitempty"`

	// The catalog hotel id in the merchant namespace
	HotelId string `json:"hotel_id,omitempty"`

	// The catalog creative assets id in the merchant namespace
	CreativeAssetsId string `json:"creative_assets_id,omitempty"`

	// Array with the errors for the item id requested
	Errors []ItemValidationEvent `json:"errors"`
}
