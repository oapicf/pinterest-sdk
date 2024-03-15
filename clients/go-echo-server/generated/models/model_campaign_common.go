package models

// CampaignCommon - Campaign Data
type CampaignCommon struct {

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
}
