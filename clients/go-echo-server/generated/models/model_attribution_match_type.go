package models
// AttributionMatchType : Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable.
type AttributionMatchType string

// List of AttributionMatchType
const (
	P AttributionMatchType = "P"
	D AttributionMatchType = "D"
	NA AttributionMatchType = "NA"
)
