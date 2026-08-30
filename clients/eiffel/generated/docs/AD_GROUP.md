# AD_GROUP

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | [**STRING_32**](STRING_32.md) | Advertiser ID. | [optional] [readonly] [default to null]
**bid_in_micro_currency** | **INTEGER_32** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] [default to null]
**bid_strategy_type** | [**BID_STRATEGY_TYPE**](BidStrategyType.md) |  | [optional] [default to null]
**billable_event** | [**ACTION_TYPE**](ActionType.md) |  | [default to null]
**budget_in_micro_currency** | **INTEGER_32** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] [default to null]
**campaign_id** | [**STRING_32**](STRING_32.md) | Campaign ID of the ad group. | [default to null]
**conversion_learning_mode_type** | [**CONVERSION_LEARNING_MODE_TYPE**](ConversionLearningModeType.md) | oCPM learn mode | [readonly] [default to null]
**created_time** | **INTEGER_32** | Ad group creation time. Unix timestamp in seconds. | [readonly] [default to null]
**customer_segment_id** | [**STRING_32**](STRING_32.md) | Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;. | [optional] [default to null]
**dca_assets** | [**ANY**](.md) | [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. | [optional] [readonly] [default to null]
**end_time** | **INTEGER_32** | Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO. | [optional] [default to null]
**ext_features** | [**ADGROUP_TRACKING_FEATURES**](AdgroupTrackingFeatures.md) |  | [optional] [default to null]
**feed_profile_id** | [**STRING_32**](STRING_32.md) | Feed Profile ID associated to the adgroup. | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | Ad group ID. | [default to null]
**is_creative_optimization** | **BOOLEAN** | Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. | [optional] [default to null]
**is_local_inventory** | **BOOLEAN** | Indicates whether the ad group should use the local inventory. | [optional] [default to null]
**lifetime_frequency_cap** | **INTEGER_32** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] [default to null]
**local_inventory_radius_in_miles** | **REAL_32** | The targeting radius of the local inventory ads in miles. | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | Ad group name. | [default to null]
**optimization_goal_metadata** | [**NULLABLE_OPTIMIZATION_GOAL_METADATA**](NullableOptimizationGoalMetadata.md) | Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;. | [optional] [default to null]
**performance_plus_campaign_settings** | [**PERFORMANCE_PLUS_CAMPAIGN_SETTINGS**](PerformancePlusCampaignSettings.md) | Pinterest Performance+ campaign settings. | [optional] [default to null]
**placement_group** | [**PLACEMENT_GROUP_TYPE**](PlacementGroupType.md) | [Placement group](https://help.pinterest.com/en/business/article/placement-groups). | [optional] [default to null]
**placement_traffic_type** | [**PLACEMENT_TRAFFIC_TYPE**](PlacementTrafficType.md) | A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both | [optional] [default to null]
**promotion_application_level** | [**PROMOTION_APPLICATION_LEVEL**](PromotionApplicationLevel.md) | Specify if the promotion is applied at ad group or item level | [optional] [default to null]
**promotion_id** | [**STRING_32**](STRING_32.md) | Promotion ID. To clear this field, set to null. | [optional] [default to 0]
**promotion_ids** | [**LIST [STRING_32]**](STRING_32.md) | Promotion IDs list. To clear this field, set to an empty array []. | [optional] [default to null]
**start_time** | **INTEGER_32** | Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. | [optional] [default to null]
**status** | [**ENTITY_STATUS**](EntityStatus.md) | Ad group/entity status. | [optional] [default to null]
**summary_status** | [**SUMMARY_STATUS**](SummaryStatus.md) |  | [readonly] [default to null]
**targeting_spec** | [**TARGETING_SPEC_OPTIMAL**](TargetingSpecOptimal.md) |  | [optional] [default to null]
**targeting_template_ids** | [**LIST [STRING_32]**](STRING_32.md) | Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;]. | [optional] [default to null]
**tracking_urls** | [**AD_GROUP_TRACKING_URLS**](AdGroupTrackingURLs.md) |  | [optional] [default to null]
**type** | [**STRING_32**](STRING_32.md) | Always \&quot;adgroup\&quot;. | [readonly] [default to adgroup]
**updated_time** | **INTEGER_32** | Ad group last update time. Unix timestamp in seconds. | [readonly] [default to null]
**auto_targeting_enabled** | **BOOLEAN** | Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting). | [optional] [default to null]
**bid_multiplier** | **REAL_32** | [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns). | [optional] [default to null]
**budget_type** | [**BUDGET_TYPE**](BudgetType.md) |  | [optional] [default to null]
**pacing_delivery_type** | [**PACING_DELIVERY_TYPE**](PacingDeliveryType.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


