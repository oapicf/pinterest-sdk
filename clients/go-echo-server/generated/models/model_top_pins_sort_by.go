package models
// TopPinsSortBy : Sort metric for top pins analytics.
type TopPinsSortBy string

// List of TopPinsSortBy
const (
	ENGAGEMENT TopPinsSortBy = "ENGAGEMENT"
	SAVE TopPinsSortBy = "SAVE"
	IMPRESSION TopPinsSortBy = "IMPRESSION"
	OUTBOUND_CLICK TopPinsSortBy = "OUTBOUND_CLICK"
	PIN_CLICK TopPinsSortBy = "PIN_CLICK"
)
