package models
// NonNullableProductAvailabilityType : Product availability.
type NonNullableProductAvailabilityType string

// List of NonNullableProductAvailabilityType
const (
	IN_STOCK NonNullableProductAvailabilityType = "IN_STOCK"
	OUT_OF_STOCK NonNullableProductAvailabilityType = "OUT_OF_STOCK"
	PREORDER NonNullableProductAvailabilityType = "PREORDER"
)
