package models

type PromotionArrayElement struct {

	Data Promotion `json:"data,omitempty"`

	Exception Exception `json:"exception,omitempty"`
}
