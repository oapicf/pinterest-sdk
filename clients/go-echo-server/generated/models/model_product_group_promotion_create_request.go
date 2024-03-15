package models

type ProductGroupPromotionCreateRequest struct {

	// ID of the Ad Group the Product Group Promotion belongs to.
	AdGroupId string `json:"ad_group_id"`

	ProductGroupPromotion []ProductGroupPromotion `json:"product_group_promotion"`
}
