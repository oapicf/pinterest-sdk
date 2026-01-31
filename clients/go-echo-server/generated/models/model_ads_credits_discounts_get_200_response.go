package models

type AdsCreditsDiscountsGet200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []AdsCreditDiscountsResponse `json:"items"`
}
