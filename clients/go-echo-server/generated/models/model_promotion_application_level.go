package models
// PromotionApplicationLevel : Specify if the promotion is applied at ad group or item level.
type PromotionApplicationLevel string

// List of PromotionApplicationLevel
const (
	NONE PromotionApplicationLevel = "NONE"
	ITEM PromotionApplicationLevel = "ITEM"
	AD_GROUP PromotionApplicationLevel = "AD_GROUP"
)
