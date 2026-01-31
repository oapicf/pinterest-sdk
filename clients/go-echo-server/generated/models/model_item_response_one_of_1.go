package models

// ItemResponseOneOf1 - Error item response
type ItemResponseOneOf1 struct {

	CatalogType CatalogsType `json:"catalog_type"`

	Errors []ItemValidationEvent `json:"errors"`

	// The catalog item id in the merchant namespace
	ItemId string `json:"item_id,omitempty"`

	// The catalog hotel id in the merchant namespace
	HotelId string `json:"hotel_id,omitempty"`

	// The catalog creative assets id in the merchant namespace
	CreativeAssetsId string `json:"creative_assets_id,omitempty"`
}
