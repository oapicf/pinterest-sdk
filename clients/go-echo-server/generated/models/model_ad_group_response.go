package models

type AdGroupResponse struct {

	// Ad group name.
	Name string `json:"name,omitempty"`

	// Ad group/entity status.
	Status EntityStatus `json:"status,omitempty"`

	// Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
	BudgetInMicroCurrency *int32 `json:"budget_in_micro_currency,omitempty"`

	// Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
	BidInMicroCurrency *int32 `json:"bid_in_micro_currency,omitempty"`

	OptimizationGoalMetadata *AdGroupCommonOptimizationGoalMetadata `json:"optimization_goal_metadata,omitempty"`

	BudgetType BudgetType `json:"budget_type,omitempty"`

	// Ad group start time. Unix timestamp in seconds. Defaults to current time.
	StartTime *int32 `json:"start_time,omitempty"`

	// Ad group end time. Unix timestamp in seconds.
	EndTime *int32 `json:"end_time,omitempty"`

	TargetingSpec TargetingSpec `json:"targeting_spec,omitempty"`

	// Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
	LifetimeFrequencyCap int32 `json:"lifetime_frequency_cap,omitempty"`

	TrackingUrls *AdGroupCommonTrackingUrls `json:"tracking_urls,omitempty"`

	// Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
	AutoTargetingEnabled *bool `json:"auto_targeting_enabled,omitempty"`

	// <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
	PlacementGroup PlacementGroupType `json:"placement_group,omitempty"`

	PacingDeliveryType PacingDeliveryType `json:"pacing_delivery_type,omitempty"`

	// Campaign ID of the ad group.
	CampaignId string `json:"campaign_id,omitempty"`

	BillableEvent ActionType `json:"billable_event,omitempty"`

	// Bid strategy type
	BidStrategyType *string `json:"bid_strategy_type,omitempty"`

	// Ad group ID.
	Id string `json:"id,omitempty"`

	// Advertiser ID.
	AdAccountId string `json:"ad_account_id,omitempty"`

	// Ad group creation time. Unix timestamp in seconds.
	CreatedTime int32 `json:"created_time,omitempty"`

	// Ad group last update time. Unix timestamp in seconds.
	UpdatedTime int32 `json:"updated_time,omitempty"`

	// Always \"adgroup\".
	Type string `json:"type,omitempty"`

	// oCPM learn mode
	ConversionLearningModeType *string `json:"conversion_learning_mode_type,omitempty"`

	// Ad group summary status.
	SummaryStatus AdGroupSummaryStatus `json:"summary_status,omitempty"`

	// Feed Profile ID associated to the adgroup.
	FeedProfileId string `json:"feed_profile_id,omitempty"`

	// [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
	DcaAssets *interface{} `json:"dca_assets,omitempty"`
}
