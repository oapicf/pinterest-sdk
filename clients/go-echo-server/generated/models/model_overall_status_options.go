package models
// OverallStatusOptions : Overall status of event quality score.
type OverallStatusOptions string

// List of OverallStatusOptions
const (
	NEEDS_IMPROVEMENT OverallStatusOptions = "NEEDS_IMPROVEMENT"
	FAIR OverallStatusOptions = "FAIR"
	GOOD OverallStatusOptions = "GOOD"
)
