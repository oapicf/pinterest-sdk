package models
// ProductAvailability : Product availability.
type ProductAvailability string

// List of ProductAvailability
const (
	IN_STOCK ProductAvailability = "IN_STOCK"
	OUT_OF_STOCK ProductAvailability = "OUT_OF_STOCK"
	PREORDER ProductAvailability = "PREORDER"
)
