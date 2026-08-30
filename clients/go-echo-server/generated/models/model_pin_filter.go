package models

type PinFilter string

// List of PinFilter
const (
	EXCLUDE_NATIVE PinFilter = "exclude_native"
	EXCLUDE_REPINS PinFilter = "exclude_repins"
	HAS_BEEN_PROMOTED PinFilter = "has_been_promoted"
)
