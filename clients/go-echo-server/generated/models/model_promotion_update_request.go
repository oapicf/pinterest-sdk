package models

type PromotionUpdateRequest struct {

	// Discount status based on the current time and start and end time of discount
	DiscountStatus string `json:"discount_status,omitempty"`

	// Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
	EndTime int32 `json:"end_time,omitempty"`

	// Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
	ExternalId string `json:"external_id,omitempty"`

	// The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
	PlatformType string `json:"platform_type,omitempty"`

	// Code that can be used to redeem a promotion.
	PromotionCode string `json:"promotion_code,omitempty"`

	// An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
	PromotionCustomId string `json:"promotion_custom_id,omitempty"`

	// Internal name for the promotion.
	PromotionTitle string `json:"promotion_title,omitempty"`

	PromotionType PromotionType `json:"promotion_type,omitempty"`

	// Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
	StartTime int32 `json:"start_time,omitempty"`

	// List of values to be inserted in the promotion type-specific template.
	TemplateValues []PromotionTemplateValue `json:"template_values,omitempty"`

	// Promotion ID
	Id string `json:"id" validate:"regexp=^\\\\d+$"`

	Status EntityStatus `json:"status,omitempty"`
}
