package models

// CampaignDeliveryEstimatesCampaign - Campaign configuration for delivery estimates.
type CampaignDeliveryEstimatesCampaign struct {

	AdGroups []AdGroupDeliveryEstimates `json:"ad_groups"`

	// Duration type of the budget
	BudgetDurationType BudgetDurationType `json:"budget_duration_type"`

	// Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
	DailySpendCap int32 `json:"daily_spend_cap,omitempty"`

	// End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
	EndDate string `json:"end_date,omitempty" validate:"regexp=^\\d{4}-\\d{2}-\\d{2}$"`

	// Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
	LifetimeSpendCap int32 `json:"lifetime_spend_cap,omitempty"`

	ObjectiveType DeliveryEstimateObjectiveType `json:"objective_type"`

	// Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
	StartDate string `json:"start_date" validate:"regexp=^\\d{4}-\\d{2}-\\d{2}$"`
}
