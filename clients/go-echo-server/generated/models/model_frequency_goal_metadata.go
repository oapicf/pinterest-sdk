package models

// FrequencyGoalMetadata - Frequency target can only be between 2 and 20
type FrequencyGoalMetadata struct {

	Frequency int32 `json:"frequency,omitempty"`

	Timerange FrequencyGoalMetadataTimerange `json:"timerange,omitempty"`
}
