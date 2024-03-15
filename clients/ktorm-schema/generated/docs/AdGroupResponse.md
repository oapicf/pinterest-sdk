
# Table `AdGroupResponse`
(mapped from: AdGroupResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**name** | name | text |  | **kotlin.String** | Ad group name. |  [optional]
**status** | status | long |  | [**EntityStatus**](EntityStatus.md) | Ad group/entity status. |  [optional] [foreignkey]
**budgetInMicroCurrency** | budget_in_micro_currency | int |  | **kotlin.Int** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. |  [optional]
**bidInMicroCurrency** | bid_in_micro_currency | int |  | **kotlin.Int** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. |  [optional]
**optimizationGoalMetadata** | optimization_goal_metadata | long |  | [**AdGroupCommonOptimizationGoalMetadata**](AdGroupCommonOptimizationGoalMetadata.md) |  |  [optional] [foreignkey]
**budgetType** | budget_type | long |  | [**BudgetType**](BudgetType.md) |  |  [optional] [foreignkey]
**startTime** | start_time | int |  | **kotlin.Int** | Ad group start time. Unix timestamp in seconds. Defaults to current time. |  [optional]
**endTime** | end_time | int |  | **kotlin.Int** | Ad group end time. Unix timestamp in seconds. |  [optional]
**targetingSpec** | targeting_spec | long |  | [**TargetingSpec**](TargetingSpec.md) |  |  [optional] [foreignkey]
**lifetimeFrequencyCap** | lifetime_frequency_cap | int |  | **kotlin.Int** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. |  [optional]
**trackingUrls** | tracking_urls | long |  | [**AdGroupCommonTrackingUrls**](AdGroupCommonTrackingUrls.md) |  |  [optional] [foreignkey]
**autoTargetingEnabled** | auto_targeting_enabled | boolean |  | **kotlin.Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. |  [optional]
**placementGroup** | placement_group | long |  | [**PlacementGroupType**](PlacementGroupType.md) | &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. |  [optional] [foreignkey]
**pacingDeliveryType** | pacing_delivery_type | long |  | [**PacingDeliveryType**](PacingDeliveryType.md) |  |  [optional] [foreignkey]
**campaignId** | campaign_id | text |  | **kotlin.String** | Campaign ID of the ad group. |  [optional]
**billableEvent** | billable_event | long |  | [**ActionType**](ActionType.md) |  |  [optional] [foreignkey]
**bidStrategyType** | bid_strategy_type | text |  | [**bid_strategy_type**](#BidStrategyType) | Bid strategy type |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Ad group ID. |  [optional]
**adAccountId** | ad_account_id | text |  | **kotlin.String** | Advertiser ID. |  [optional]
**createdTime** | created_time | int |  | **kotlin.Int** | Ad group creation time. Unix timestamp in seconds. |  [optional]
**updatedTime** | updated_time | int |  | **kotlin.Int** | Ad group last update time. Unix timestamp in seconds. |  [optional]
**type** | type | text |  | **kotlin.String** | Always \&quot;adgroup\&quot;. |  [optional]
**conversionLearningModeType** | conversion_learning_mode_type | text |  | [**conversion_learning_mode_type**](#ConversionLearningModeType) | oCPM learn mode |  [optional]
**summaryStatus** | summary_status | long |  | [**AdGroupSummaryStatus**](AdGroupSummaryStatus.md) | Ad group summary status. |  [optional] [foreignkey]
**feedProfileId** | feed_profile_id | text |  | **kotlin.String** | Feed Profile ID associated to the adgroup. |  [optional]
**dcaAssets** | dca_assets | blob |  | [**kotlin.Any**](.md) | [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. |  [optional]




























