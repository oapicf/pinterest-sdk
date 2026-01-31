package models

type PromotionTemplateValue struct {

	// Numeric value.
	Amount float32 `json:"amount,omitempty"`

	CurrencyCode Currency `json:"currency_code,omitempty"`

	// Custom text.
	CustomText string `json:"custom_text,omitempty"`

	// Percent value.
	Percent float32 `json:"percent,omitempty"`
}
