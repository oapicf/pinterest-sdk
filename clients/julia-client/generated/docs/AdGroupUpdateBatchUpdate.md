# AdGroupUpdateBatchUpdate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`auto_targeting_enabled`** | **`Bool`** | Enable auto-targeting for ad group. Default value is True. Also known as [\&quot;Performance+ targeting\&quot;](https://help.pinterest.com/en/business/article/performance-plus-targeting). | [optional] [default to nothing]
**`bid_in_micro_currency`** | **`Int64`** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] [default to nothing]
**`bid_multiplier`** | **`Float64`** | [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns). | [optional] [default to nothing]
**`bid_strategy_type`** | [**`*BidStrategyType`**](BidStrategyType.md) |  | [optional] [default to nothing]
**`billable_event`** | [**`*ActionType`**](ActionType.md) |  | [optional] [default to nothing]
**`budget_in_micro_currency`** | **`Int64`** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] [default to nothing]
**`budget_type`** | [**`*BudgetType`**](BudgetType.md) |  | [optional] [default to nothing]
**`campaign_id`** | **`String`** | Campaign ID of the ad group. | [optional] [default to nothing]
**`customer_segment_id`** | **`String`** | Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the &#x60;targeting_template_ids&#x60; field as well as the &#x60;AUDIENCE_INCLUDE&#x60; field of the &#x60;targeting_spec&#x60;. To clear the customer segment ID, set this field to &#39;0&#39;. | [optional] [default to nothing]
**`end_time`** | **`Int64`** | Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to &#x60;paused&#x60;. Cannot occur after &#x60;end_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO. | [optional] [default to nothing]
**`ext_features`** | [**`*AdgroupTrackingFeatures`**](AdgroupTrackingFeatures.md) |  | [optional] [default to nothing]
**`feed_profile_id`** | **`String`** | Feed Profile ID associated to the adgroup. | [optional] [default to nothing]
**`id`** | **`String`** | Ad group ID. | [default to nothing]
**`is_creative_optimization`** | **`Bool`** | Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. | [optional] [default to nothing]
**`is_local_inventory`** | **`Bool`** | Indicates whether the ad group should use the local inventory. | [optional] [default to nothing]
**`lifetime_frequency_cap`** | **`Int64`** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] [default to nothing]
**`local_inventory_radius_in_miles`** | **`Float64`** | The targeting radius of the local inventory ads in miles. | [optional] [default to nothing]
**`name`** | **`String`** | Ad group name. | [optional] [default to nothing]
**`optimization_goal_metadata`** | [**`*NullableOptimizationGoalMetadata`**](NullableOptimizationGoalMetadata.md) | Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;. | [optional] [default to nothing]
**`pacing_delivery_type`** | [**`*PacingDeliveryType`**](PacingDeliveryType.md) |  | [optional] [default to nothing]
**`performance_plus_campaign_settings`** | [**`*PerformancePlusCampaignSettings`**](PerformancePlusCampaignSettings.md) | Pinterest Performance+ campaign settings. | [optional] [default to nothing]
**`placement_group`** | [**`*PlacementGroupType`**](PlacementGroupType.md) | [Placement group](https://help.pinterest.com/en/business/article/placement-groups). | [optional] [default to nothing]
**`placement_traffic_type`** | [**`*PlacementTrafficType`**](PlacementTrafficType.md) | A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both | [optional] [default to nothing]
**`promotion_application_level`** | [**`*PromotionApplicationLevel`**](PromotionApplicationLevel.md) | Specify if the promotion is applied at ad group or item level | [optional] [default to nothing]
**`promotion_id`** | **`String`** | Promotion ID. To clear this field, set to null. | [optional] [default to "0"]
**`promotion_ids`** | **`Vector{String}`** | Promotion IDs list. To clear this field, set to an empty array []. | [optional] [default to nothing]
**`start_time`** | **`Int64`** | Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign&#39;s &#x60;start_time&#x60;. Cannot precede &#x60;start_time&#x60; for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. | [optional] [default to nothing]
**`status`** | [**`*EntityStatus`**](EntityStatus.md) | Ad group/entity status. | [optional] [default to nothing]
**`targeting_spec`** | [**`*TargetingSpecOptimal`**](TargetingSpecOptimal.md) |  | [optional] [default to nothing]
**`targeting_spec_operations`** | [**`Vector{TargetingSpecOperations}`**](TargetingSpecOperations.md) |  | [optional] [default to nothing]
**`targeting_template_ids`** | **`Vector{String}`** | Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;]. | [optional] [default to nothing]
**`tracking_urls`** | [**`*AdGroupTrackingURLs`**](AdGroupTrackingURLs.md) |  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


