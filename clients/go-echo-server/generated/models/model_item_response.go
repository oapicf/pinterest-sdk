package models

// ItemResponse - Object describing an item record or error
type ItemResponse struct {

	CatalogType CatalogsType `json:"catalog_type"`

	Attributes CatalogsCreativeAssetsAttributes `json:"attributes,omitempty"`

	// The catalog item id in the merchant namespace
	ItemId string `json:"item_id,omitempty"`

	// The pins mapped to the item
	Pins *[]Pin `json:"pins,omitempty"`

	// The catalog hotel id in the merchant namespace
	HotelId string `json:"hotel_id,omitempty"`

	// The catalog creative assets id in the merchant namespace
	CreativeAssetsId string `json:"creative_assets_id,omitempty"`

	// Array with the errors for the item id requested
	Errors []ItemValidationEvent `json:"errors"`
}
