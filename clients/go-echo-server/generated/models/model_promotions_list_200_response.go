package models

type PromotionsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []Promotion `json:"items"`
}
