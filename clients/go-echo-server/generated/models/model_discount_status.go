package models
// DiscountStatus : Discount status based on the current time and start and end time of discount
type DiscountStatus string

// List of DiscountStatus
const (
	OTHER DiscountStatus = "OTHER"
	ACTIVE DiscountStatus = "ACTIVE"
	PAUSED DiscountStatus = "PAUSED"
	SCHEDULED DiscountStatus = "SCHEDULED"
	EXPIRED DiscountStatus = "EXPIRED"
)
