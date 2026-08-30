package models

// RetailLocalInventoryItemAttributesOptional - Local inventory attributes for retail items (all fields optional for update/get)
type RetailLocalInventoryItemAttributesOptional struct {

	// Ad link for the item
	AdLink string `json:"ad_link,omitempty"`

	// Availability status of the item
	Availability ItemAvailability `json:"availability,omitempty"`

	// The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
	Price string `json:"price,omitempty"`

	// The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
	SalePrice string `json:"sale_price,omitempty"`
}
