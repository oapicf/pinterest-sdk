package models

type OptimizationGoalMetadataFrequencyGoalMetadata struct {

	// Frequency target can only be between 2 and 20
	Frequency int32 `json:"frequency,omitempty"`

	// User entity counts time range
	Timerange string `json:"timerange,omitempty"`
}
