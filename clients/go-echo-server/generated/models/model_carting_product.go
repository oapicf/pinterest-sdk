package models

type CartingProduct struct {

	// the internal Pinterest carting product id (different from industry product id)
	CartingProductId string `json:"carting_product_id" validate:"regexp=^\\d+$"`

	// Whether to display only the preferred retailers for the carting product
	DisplayPreferredRetailersOnly bool `json:"display_preferred_retailers_only,omitempty"`

	// Whether to display the price for the carting product
	DisplayProductPrice bool `json:"display_product_price,omitempty"`

	// A sorted array of preferred retailers for the carting product
	PreferredRetailers []CartingRetailer `json:"preferred_retailers,omitempty"`

	// Whether to randomize preferred retailers for the carting product
	RandomizePreferredRetailers bool `json:"randomize_preferred_retailers,omitempty"`
}
