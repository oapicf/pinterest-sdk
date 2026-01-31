package models

type AdGroupResponse struct {

	// Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
	AutoTargetingEnabled *bool `json:"auto_targeting_enabled,omitempty"`

	// Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.
	BidInMicroCurrency *int32 `json:"bid_in_micro_currency,omitempty"`

	// Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
	BidStrategyType *string `json:"bid_strategy_type,omitempty"`

	BillableEvent ActionType `json:"billable_event,omitempty"`

	// Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
	BudgetInMicroCurrency *int32 `json:"budget_in_micro_currency,omitempty"`

	BudgetType BudgetType `json:"budget_type,omitempty"`

	// Campaign ID of the ad group.
	CampaignId string `json:"campaign_id,omitempty" validate:"regexp=^[C]?\\\\d+$"`

	// Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
	EndTime *int32 `json:"end_time,omitempty"`

	// Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
	IsCreativeOptimization *bool `json:"is_creative_optimization,omitempty"`

	// Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
	LifetimeFrequencyCap int32 `json:"lifetime_frequency_cap,omitempty"`

	// Ad group name.
	Name string `json:"name,omitempty"`

	// Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
	OptimizationGoalMetadata *OptimizationGoalMetadata `json:"optimization_goal_metadata,omitempty"`

	PacingDeliveryType PacingDeliveryType `json:"pacing_delivery_type,omitempty"`

	// <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
	PlacementGroup PlacementGroupType `json:"placement_group,omitempty"`

	// Specify if the promotion is applied at ad group or item level
	PromotionApplicationLevel *string `json:"promotion_application_level,omitempty"`

	// Promotion ID. To clear this field, set to null.
	PromotionId *string `json:"promotion_id,omitempty" validate:"regexp=^\\\\d+$"`

	// Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
	StartTime *int32 `json:"start_time,omitempty"`

	// Ad group/entity status.
	Status EntityStatus `json:"status,omitempty"`

	TargetingSpec TargetingSpec `json:"targeting_spec,omitempty"`

	// Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
	TargetingTemplateIds *[]string `json:"targeting_template_ids,omitempty"`

	// Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
	TrackingUrls *TrackingUrls `json:"tracking_urls,omitempty"`

	// Advertiser ID.
	AdAccountId string `json:"ad_account_id,omitempty" validate:"regexp=^\\\\d+$"`

	// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
	BidMultiplier *float32 `json:"bid_multiplier,omitempty"`

	// oCPM learn mode
	ConversionLearningModeType *string `json:"conversion_learning_mode_type,omitempty"`

	// Ad group creation time. Unix timestamp in seconds.
	CreatedTime int32 `json:"created_time,omitempty"`

	// [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
	DcaAssets *interface{} `json:"dca_assets,omitempty"`

	// Feed Profile ID associated to the adgroup.
	FeedProfileId string `json:"feed_profile_id,omitempty"`

	// Ad group ID.
	Id string `json:"id,omitempty" validate:"regexp=^\\\\d+$"`

	// Ad group summary status.
	SummaryStatus AdGroupSummaryStatus `json:"summary_status,omitempty"`

	// Always \"adgroup\".
	Type string `json:"type,omitempty"`

	// Ad group last update time. Unix timestamp in seconds.
	UpdatedTime int32 `json:"updated_time,omitempty"`
}
