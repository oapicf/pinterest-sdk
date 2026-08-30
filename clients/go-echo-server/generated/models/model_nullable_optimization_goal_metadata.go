package models

type NullableOptimizationGoalMetadata struct {

	ConversionTagV3GoalMetadata ConversionTagV3GoalMetadata `json:"conversion_tag_v3_goal_metadata,omitempty"`

	FrequencyGoalMetadata FrequencyGoalMetadata `json:"frequency_goal_metadata,omitempty"`

	ScrollupGoalMetadata ScrollupGoalMetadata `json:"scrollup_goal_metadata,omitempty"`
}
