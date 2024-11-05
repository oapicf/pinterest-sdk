package models

type OptimizationGoalMetadataConversionTagV3GoalMetadata struct {

	AttributionWindows OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows `json:"attribution_windows,omitempty"`

	ConversionEvent string `json:"conversion_event,omitempty"`

	ConversionTagId string `json:"conversion_tag_id,omitempty" validate:"regexp=^[0-9]+$"`

	CpaGoalValueInMicroCurrency string `json:"cpa_goal_value_in_micro_currency,omitempty" validate:"regexp=^[0-9]+$"`

	// ROAS optimization is not supported
	IsRoasOptimized *bool `json:"is_roas_optimized,omitempty"`

	// Conversion learning model type
	LearningModeType *string `json:"learning_mode_type,omitempty"`
}
