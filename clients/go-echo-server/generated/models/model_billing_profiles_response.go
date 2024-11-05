package models

type BillingProfilesResponse struct {

	// Billing ID.
	Id string `json:"id,omitempty" validate:"regexp=^\\\\d+$"`

	// Type of the card.
	CardType string `json:"card_type,omitempty"`

	// Status of the billing.
	Status string `json:"status,omitempty"`

	// Advertiser ID of the billing.
	AdvertiserId string `json:"advertiser_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Brand of the payment method.
	PaymentMethodBrand string `json:"payment_method_brand,omitempty"`
}
