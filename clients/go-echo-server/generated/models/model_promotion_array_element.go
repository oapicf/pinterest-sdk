package models

type PromotionArrayElement struct {

	Data PromotionResponse `json:"data,omitempty"`

	Exception Exception `json:"exception,omitempty"`
}
