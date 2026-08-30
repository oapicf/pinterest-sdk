
# Table `AdGroup`
(mapped from: AdGroup)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**billableEvent** | billable_event | long NOT NULL |  | [**ActionType**](ActionType.md) |  |  [foreignkey]
**campaignId** | campaign_id | text NOT NULL |  | **kotlin.String** | Campaign ID of the ad group. | 
**conversionLearningModeType** | conversion_learning_mode_type | long NOT NULL |  | [**ConversionLearningModeType**](ConversionLearningModeType.md) | oCPM learn mode |  [readonly] [foreignkey]
**createdTime** | created_time | int NOT NULL |  | **kotlin.Int** | Ad group creation time. Unix timestamp in seconds. |  [readonly]
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Ad group ID. | 
**name** | name | text NOT NULL |  | **kotlin.String** | Ad group name. | 
**summaryStatus** | summary_status | long NOT NULL |  | [**SummaryStatus**](SummaryStatus.md) |  |  [readonly] [foreignkey]
**type** | type | text NOT NULL |  | **kotlin.String** | Always \&quot;adgroup\&quot;. |  [readonly]
**updatedTime** | updated_time | int NOT NULL |  | **kotlin.Int** | Ad group last update time. Unix timestamp in seconds. |  [readonly]
**adAccountId** | ad_account_id | text |  | **kotlin.String** | Advertiser ID. |  [optional] [readonly]
**bidInMicroCurrency** | bid_in_micro_currency | int |  | **kotlin.Int** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. |  [optional]
**bidStrategyType** | bid_strategy_type | long |  | [**BidStrategyType**](BidStrategyType.md) |  |  [optional] [foreignkey]
**budgetInMicroCurrency** | budget_in_micro_currency | int |  | **kotlin.Int** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. |  [optional]
**customerSegmentId** | customer_segment_id | text |  | **kotlin.String** | Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;. |  [optional]
**dcaAssets** | dca_assets | blob |  | [**kotlin.Any**](.md) | [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. |  [optional] [readonly]
**endTime** | end_time | int |  | **kotlin.Int** | Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO. |  [optional]
**extFeatures** | ext_features | long |  | [**AdgroupTrackingFeatures**](AdgroupTrackingFeatures.md) |  |  [optional] [foreignkey]
**feedProfileId** | feed_profile_id | text |  | **kotlin.String** | Feed Profile ID associated to the adgroup. |  [optional]
**isCreativeOptimization** | is_creative_optimization | boolean |  | **kotlin.Boolean** | Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. |  [optional]
**isLocalInventory** | is_local_inventory | boolean |  | **kotlin.Boolean** | Indicates whether the ad group should use the local inventory. |  [optional]
**lifetimeFrequencyCap** | lifetime_frequency_cap | int |  | **kotlin.Int** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field. |  [optional]
**localInventoryRadiusInMiles** | local_inventory_radius_in_miles | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The targeting radius of the local inventory ads in miles. |  [optional]
**optimizationGoalMetadata** | optimization_goal_metadata | long |  | [**NullableOptimizationGoalMetadata**](NullableOptimizationGoalMetadata.md) | Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;. |  [optional] [foreignkey]
**performancePlusCampaignSettings** | performance_plus_campaign_settings | long |  | [**PerformancePlusCampaignSettings**](PerformancePlusCampaignSettings.md) | Pinterest Performance+ campaign settings. |  [optional] [foreignkey]
**placementGroup** | placement_group | long |  | [**PlacementGroupType**](PlacementGroupType.md) | [Placement group](https://help.pinterest.com/en/business/article/placement-groups). |  [optional] [foreignkey]
**placementTrafficType** | placement_traffic_type | long |  | [**PlacementTrafficType**](PlacementTrafficType.md) | A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both |  [optional] [foreignkey]
**promotionApplicationLevel** | promotion_application_level | long |  | [**PromotionApplicationLevel**](PromotionApplicationLevel.md) | Specify if the promotion is applied at ad group or item level |  [optional] [foreignkey]
**promotionId** | promotion_id | text |  | **kotlin.String** | Promotion ID. To clear this field, set to null. |  [optional]
**promotionIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Promotion IDs list. To clear this field, set to an empty array []. |  [optional]
**startTime** | start_time | int |  | **kotlin.Int** | Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. |  [optional]
**status** | status | long |  | [**EntityStatus**](EntityStatus.md) | Ad group/entity status. |  [optional] [foreignkey]
**targetingSpec** | targeting_spec | long |  | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  |  [optional] [foreignkey]
**targetingTemplateIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;]. |  [optional]
**trackingUrls** | tracking_urls | long |  | [**AdGroupTrackingURLs**](AdGroupTrackingURLs.md) |  |  [optional] [foreignkey]
**autoTargetingEnabled** | auto_targeting_enabled | boolean |  | **kotlin.Boolean** | Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting). |  [optional]
**bidMultiplier** | bid_multiplier | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns). |  [optional]
**budgetType** | budget_type | long |  | [**BudgetType**](BudgetType.md) |  |  [optional] [foreignkey]
**pacingDeliveryType** | pacing_delivery_type | long |  | [**PacingDeliveryType**](PacingDeliveryType.md) |  |  [optional] [foreignkey]






























# **Table `AdGroupPromotionIds`**
(mapped from: AdGroupPromotionIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroup | adGroup | long | | kotlin.Long | Primary Key | *one*
promotionIds | promotionIds | text | | kotlin.String | Foreign Key | *many*






# **Table `AdGroupTargetingTemplateIds`**
(mapped from: AdGroupTargetingTemplateIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adGroup | adGroup | long | | kotlin.Long | Primary Key | *one*
targetingTemplateIds | targetingTemplateIds | text | | kotlin.String | Foreign Key | *many*








