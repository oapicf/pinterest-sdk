package models

type CampaignCreateRequest struct {

	// Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
	AdAccountId string `json:"ad_account_id"`

	// Campaign name.
	Name string `json:"name"`

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

	// Determine if a campaign has flexible daily budgets setup.
	IsFlexibleDailyBudgets bool `json:"is_flexible_daily_budgets,omitempty"`

	// When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
	DefaultAdGroupBudgetInMicroCurrency *int32 `json:"default_ad_group_budget_in_micro_currency,omitempty"`

	// Specifies whether the campaign was created in the automated campaign flow
	IsAutomatedCampaign bool `json:"is_automated_campaign,omitempty"`

	ObjectiveType ObjectiveType `json:"objective_type"`
}
