package models
// AttributionScope : Ad event type used for attribution.
type AttributionScope string

// List of AttributionScope
const (
	VIEW AttributionScope = "view"
	ENGAGEMENT AttributionScope = "engagement"
	CLICK AttributionScope = "click"
)
