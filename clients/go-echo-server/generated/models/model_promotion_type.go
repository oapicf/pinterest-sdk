package models
// PromotionType : Determines the displayed promotion text along with what parameters (if any) are needed to complete the template.
type PromotionType string

// List of PromotionType
const (
	VARIABLE PromotionType = "VARIABLE"
	SITEWIDE PromotionType = "SITEWIDE"
	CHECKOUT PromotionType = "CHECKOUT"
	SAVE_X_ON_Y PromotionType = "SAVE_X_ON_Y"
	BUY_X_GET_Y PromotionType = "BUY_X_GET_Y"
	SPEND_X_SAVE_Y PromotionType = "SPEND_X_SAVE_Y"
	FREE_SHIPPING PromotionType = "FREE_SHIPPING"
	FREE_SHIPPING_MINIMUM PromotionType = "FREE_SHIPPING_MINIMUM"
	FREE_SHIPPING_WITH_DISCOUNT PromotionType = "FREE_SHIPPING_WITH_DISCOUNT"
	SITEWIDE_IN_STORES PromotionType = "SITEWIDE_IN_STORES"
	EXTRA_PERCENT_OFF PromotionType = "EXTRA_PERCENT_OFF"
	GIFT_WITH_PURCHASE PromotionType = "GIFT_WITH_PURCHASE"
	GIFT_WITH_PURCHASE_MINIMUM PromotionType = "GIFT_WITH_PURCHASE_MINIMUM"
	FIXED PromotionType = "FIXED"
	PERCENT_OFF_CLEARANCE PromotionType = "PERCENT_OFF_CLEARANCE"
	X_OFF_Y PromotionType = "X_OFF_Y"
	GIFT_WITH_FIRST_PURCHASE PromotionType = "GIFT_WITH_FIRST_PURCHASE"
	BUY_X_GET_ONE_FREE PromotionType = "BUY_X_GET_ONE_FREE"
	CASH_BACK PromotionType = "CASH_BACK"
	POINTS_ON_ALL_PURCHASES PromotionType = "POINTS_ON_ALL_PURCHASES"
	BONUS PromotionType = "BONUS"
	POINTS_WITH_PURCHASE PromotionType = "POINTS_WITH_PURCHASE"
	CUSTOM PromotionType = "CUSTOM"
)
