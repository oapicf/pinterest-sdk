package models

type ProductGroupPromotionResponseItem struct {

	Data ProductGroupPromotion `json:"data,omitempty"`

	Exceptions *[]Exception `json:"exceptions,omitempty"`
}
