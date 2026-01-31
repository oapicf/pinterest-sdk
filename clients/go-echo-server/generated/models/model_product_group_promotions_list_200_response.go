package models

type ProductGroupPromotionsList200Response struct {

	Bookmark *string `json:"bookmark,omitempty"`

	Items []ProductGroupPromotion `json:"items"`
}
