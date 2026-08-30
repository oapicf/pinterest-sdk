package models

type ConversionTagV3GoalMetadata struct {

	AttributionWindows AttributionWindows `json:"attribution_windows,omitempty"`

	ConversionEvent ConversionEvent `json:"conversion_event,omitempty"`

	ConversionTagId string `json:"conversion_tag_id,omitempty" validate:"regexp=^\\d+$"`

	CpaGoalValueInMicroCurrency string `json:"cpa_goal_value_in_micro_currency,omitempty" validate:"regexp=^\\d+$"`

	// Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).
	IsRoasOptimized *bool `json:"is_roas_optimized,omitempty"`

	// Event name for custom or standard events mapped to an oCPM model
	ReportingEvent string `json:"reporting_event,omitempty"`
}
