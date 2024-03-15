package models

type AdsCreditsDiscountsGet200Response struct {

	Items []AdsCreditDiscountsResponse `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
