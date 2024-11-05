package models

type ProductGroupPromotionResponseItem struct {

	Data ProductGroupPromotionResponseElement `json:"data,omitempty"`

	Exceptions *[]Exception `json:"exceptions,omitempty"`
}
