package models
// PinPromotionSummaryStatus : Summary status for pin promotions
type PinPromotionSummaryStatus string

// List of PinPromotionSummaryStatus
const (
	APPROVED PinPromotionSummaryStatus = "APPROVED"
	PAUSED PinPromotionSummaryStatus = "PAUSED"
	PENDING PinPromotionSummaryStatus = "PENDING"
	REJECTED PinPromotionSummaryStatus = "REJECTED"
	ADVERTISER_DISABLED PinPromotionSummaryStatus = "ADVERTISER_DISABLED"
	ARCHIVED PinPromotionSummaryStatus = "ARCHIVED"
)
