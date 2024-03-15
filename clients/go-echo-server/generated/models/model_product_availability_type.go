package models
// ProductAvailabilityType : Default availability for products in a feed.
type ProductAvailabilityType string

// List of ProductAvailabilityType
const (
	IN_STOCK ProductAvailabilityType = "IN_STOCK"
	OUT_OF_STOCK ProductAvailabilityType = "OUT_OF_STOCK"
	PREORDER ProductAvailabilityType = "PREORDER"
	NULL ProductAvailabilityType = "null"
)
