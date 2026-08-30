package models

type ScrollupGoalMetadata struct {

	ScrollupGoalValueInMicroCurrency *string `json:"scrollup_goal_value_in_micro_currency,omitempty" validate:"regexp=^\\d+$"`
}
