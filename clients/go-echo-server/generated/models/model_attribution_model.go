package models
// AttributionModel : Attribution model used to attribute the conversion event.
type AttributionModel string

// List of AttributionModel
const (
	FIRST_TOUCH AttributionModel = "first_touch"
	LAST_TOUCH AttributionModel = "last_touch"
	MULTI_TOUCH AttributionModel = "multi_touch"
	MMM AttributionModel = "mmm"
)
