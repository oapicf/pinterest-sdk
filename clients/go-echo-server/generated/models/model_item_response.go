package models

// ItemResponse - Object describing an item record
type ItemResponse struct {

	CatalogType CatalogsType `json:"catalog_type"`

	// The catalog item id in the merchant namespace
	ItemId string `json:"item_id,omitempty"`

	// Array with the errors for the item id requested
	Errors []ItemValidationEvent `json:"errors,omitempty"`

	// The catalog hotel id in the merchant namespace
	HotelId string `json:"hotel_id,omitempty"`
}
