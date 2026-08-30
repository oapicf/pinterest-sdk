package models

// ProductGroupPromotions - Wrapper model for ProductGroupPromotion.
type ProductGroupPromotions struct {

	// Response-only: created or updated product group promotions, or exceptions.
	Items []ProductGroupPromotionResponseItem `json:"items,omitempty"`
}
