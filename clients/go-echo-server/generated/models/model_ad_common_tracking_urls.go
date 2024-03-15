package models

type AdCommonTrackingUrls struct {

	Impression []string `json:"impression,omitempty"`

	Click []string `json:"click,omitempty"`

	Engagement []string `json:"engagement,omitempty"`

	BuyableButton []string `json:"buyable_button,omitempty"`

	AudienceVerification []string `json:"audience_verification,omitempty"`
}
