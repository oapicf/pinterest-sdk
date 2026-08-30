package models

type BillingProfilesResponse struct {

	// Advertiser ID of the billing.
	AdvertiserId string `json:"advertiser_id,omitempty" validate:"regexp=^\\d+$"`

	// Billing type of the advertiser
	BillingType BillingType `json:"billing_type,omitempty"`

	// Type of the card.
	CardType BillingProfileCardType `json:"card_type,omitempty"`

	// Billing ID.
	Id string `json:"id,omitempty" validate:"regexp=^\\d+$"`

	// Brand of the payment method.
	PaymentMethodBrand BillingProfilePaymentMethodBrand `json:"payment_method_brand,omitempty"`

	// Status of the billing.
	Status BillingProfileStatus `json:"status,omitempty"`
}
