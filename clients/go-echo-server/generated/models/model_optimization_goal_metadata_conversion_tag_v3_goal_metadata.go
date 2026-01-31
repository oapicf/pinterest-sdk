package models

type OptimizationGoalMetadataConversionTagV3GoalMetadata struct {

	AttributionWindows OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows `json:"attribution_windows,omitempty"`

	ConversionEvent string `json:"conversion_event,omitempty"`

	ConversionTagId string `json:"conversion_tag_id,omitempty" validate:"regexp=^[0-9]+$"`

	CpaGoalValueInMicroCurrency string `json:"cpa_goal_value_in_micro_currency,omitempty" validate:"regexp=^[0-9]+$"`

	// Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. <br>This parameter is not enabled for all advertisers. <a href=\"https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\">Learn more</a>.
	IsRoasOptimized *bool `json:"is_roas_optimized,omitempty"`

	// Conversion learning model type
	LearningModeType *string `json:"learning_mode_type,omitempty"`

	// Event name for custom or standard events mapped to an oCPM model
	ReportingEvent string `json:"reporting_event,omitempty"`
}
