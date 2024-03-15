package models

// AdGroupCommonOptimizationGoalMetadata - Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
type AdGroupCommonOptimizationGoalMetadata struct {

	ConversionTagV3GoalMetadata OptimizationGoalMetadataConversionTagV3GoalMetadata `json:"conversion_tag_v3_goal_metadata,omitempty"`

	FrequencyGoalMetadata OptimizationGoalMetadataFrequencyGoalMetadata `json:"frequency_goal_metadata,omitempty"`

	ScrollupGoalMetadata OptimizationGoalMetadataScrollupGoalMetadata `json:"scrollup_goal_metadata,omitempty"`
}
