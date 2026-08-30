package models
// ItemAvailability : Availability of the item
type ItemAvailability string

// List of ItemAvailability
const (
	IN_STOCK ItemAvailability = "in stock"
	OUT_OF_STOCK ItemAvailability = "out of stock"
	PREORDER ItemAvailability = "preorder"
)
