package models

type OptimizationGoalMetadata struct {

	ConversionTagV3GoalMetadata OptimizationGoalMetadataConversionTagV3GoalMetadata `json:"conversion_tag_v3_goal_metadata,omitempty"`

	FrequencyGoalMetadata OptimizationGoalMetadataFrequencyGoalMetadata `json:"frequency_goal_metadata,omitempty"`

	ScrollupGoalMetadata OptimizationGoalMetadataScrollupGoalMetadata `json:"scrollup_goal_metadata,omitempty"`
}
