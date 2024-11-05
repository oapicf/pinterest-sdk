package models

type AdsCreditDiscountsResponse struct {

	// True if the offer code is currently active.
	Active bool `json:"active,omitempty"`

	// Advertiser ID the offer was applied to.
	AdvertiserId string `json:"advertiser_id,omitempty" validate:"regexp=^\\\\d+$"`

	// The type of discount of this credit
	DiscountType *string `json:"discountType,omitempty"`

	// The discount applied in the offer’s currency value.
	DiscountInMicroCurrency *float32 `json:"discountInMicroCurrency,omitempty"`

	// Currency value for the discount.
	DiscountCurrency *string `json:"discountCurrency,omitempty"`

	// Human readable title of the offer code.
	Title *string `json:"title,omitempty"`

	// The credits left to spend.
	RemainingDiscountInMicroCurrency *float32 `json:"remainingDiscountInMicroCurrency,omitempty"`
}
