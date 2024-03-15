package models

type CampaignResponse struct {

	// Campaign ID.
	Id string `json:"id,omitempty"`

	// Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
	AdAccountId string `json:"ad_account_id,omitempty"`

	// Campaign name.
	Name string `json:"name,omitempty"`

	Status EntityStatus `json:"status,omitempty"`

	// Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
	LifetimeSpendCap *int32 `json:"lifetime_spend_cap,omitempty"`

	// Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
	DailySpendCap *int32 `json:"daily_spend_cap,omitempty"`

	// Order line ID that appears on the invoice.
	OrderLineId *string `json:"order_line_id,omitempty"`

	TrackingUrls *AdCommonTrackingUrls `json:"tracking_urls,omitempty"`

	// Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
	StartTime *int32 `json:"start_time,omitempty"`

	// Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
	EndTime *int32 `json:"end_time,omitempty"`

	SummaryStatus CampaignSummaryStatus `json:"summary_status,omitempty"`

	ObjectiveType ObjectiveType `json:"objective_type,omitempty"`

	// Campaign creation time. Unix timestamp in seconds.
	CreatedTime int32 `json:"created_time,omitempty"`

	// UTC timestamp. Last update time.
	UpdatedTime int32 `json:"updated_time,omitempty"`

	// Always \"campaign\".
	Type string `json:"type,omitempty"`

	// Determines if a campaign has flexible daily budgets setup.
	IsFlexibleDailyBudgets *bool `json:"is_flexible_daily_budgets,omitempty"`

	// Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
	IsCampaignBudgetOptimization *bool `json:"is_campaign_budget_optimization,omitempty"`
}
