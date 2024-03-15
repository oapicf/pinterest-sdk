package models

type ProductGroupPromotionsList200Response struct {

	Items []ProductGroupPromotionResponseItem `json:"items"`

	Bookmark *string `json:"bookmark,omitempty"`
}
