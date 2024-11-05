package models

type ProductGroupPromotionUpdateRequest struct {

	// ID of the ad group the product group belongs to.
	AdGroupId string `json:"ad_group_id" validate:"regexp=^(AG)?\\\\d+$"`

	ProductGroupPromotion []ProductGroupPromotion `json:"product_group_promotion"`
}
