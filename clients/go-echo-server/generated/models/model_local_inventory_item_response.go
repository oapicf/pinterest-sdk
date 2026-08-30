package models

// LocalInventoryItemResponse - Local inventory item response
type LocalInventoryItemResponse struct {

	// Ad link for the item
	AdLink string `json:"ad_link,omitempty"`

	// Availability status of the item
	Availability ItemAvailability `json:"availability,omitempty"`

	// The millisecond timestamp when the local inventory item was created
	CreatedAt int64 `json:"created_at"`

	// The catalog item id in the merchant namespace
	ItemId string `json:"item_id"`

	// The millisecond timestamp when the local inventory item was lastly modified by the merchant.
	LastUpdatedTime int64 `json:"last_updated_time"`

	// The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
	Price string `json:"price,omitempty"`

	// The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
	SalePrice string `json:"sale_price,omitempty"`

	// Store metadata for this local inventory item
	StoreMetadata StoreMetadata `json:"store_metadata"`
}
