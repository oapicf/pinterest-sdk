# AdGroupUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **String** | Advertiser ID. | [optional] [readonly] [default to None]
**bid_in_micro_currency** | **i32** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] [default to None]
**bid_strategy_type** | [***swagger::Nullable<models::BidStrategyType>**](BidStrategyType.md) |  | [optional] [default to None]
**billable_event** | [***models::ActionType**](ActionType.md) |  | 
**budget_in_micro_currency** | **i32** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] [default to None]
**campaign_id** | **String** | Campaign ID of the ad group. | 
**conversion_learning_mode_type** | [***swagger::Nullable<models::ConversionLearningModeType>**](ConversionLearningModeType.md) | oCPM learn mode | [readonly] 
**created_time** | **i32** | Ad group creation time. Unix timestamp in seconds. | [readonly] 
**customer_segment_id** | **String** | Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'. | [optional] [default to None]
**dca_assets** | [***serde_json::Value**](.md) | [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. | [optional] [readonly] [default to None]
**end_time** | **i32** | Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO. | [optional] [default to None]
**ext_features** | [***swagger::Nullable<models::AdgroupTrackingFeatures>**](AdgroupTrackingFeatures.md) |  | [optional] [default to None]
**feed_profile_id** | **String** | Feed Profile ID associated to the adgroup. | [optional] [default to None]
**id** | **String** | Ad group ID. | 
**is_creative_optimization** | **swagger::Nullable<bool>** | Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. | [optional] [default to None]
**is_local_inventory** | **bool** | Indicates whether the ad group should use the local inventory. | [optional] [default to None]
**lifetime_frequency_cap** | **i32** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field. | [optional] [default to None]
**local_inventory_radius_in_miles** | **f64** | The targeting radius of the local inventory ads in miles. | [optional] [default to None]
**name** | **String** | Ad group name. | 
**optimization_goal_metadata** | [***swagger::Nullable<models::NullableOptimizationGoalMetadata>**](NullableOptimizationGoalMetadata.md) | Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`. | [optional] [default to None]
**performance_plus_campaign_settings** | [***swagger::Nullable<models::PerformancePlusCampaignSettings>**](PerformancePlusCampaignSettings.md) | Pinterest Performance+ campaign settings. | [optional] [default to None]
**placement_group** | [***models::PlacementGroupType**](PlacementGroupType.md) | [Placement group](https://help.pinterest.com/en/business/article/placement-groups). | [optional] [default to None]
**placement_traffic_type** | [***swagger::Nullable<models::PlacementTrafficType>**](PlacementTrafficType.md) | A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both | [optional] [default to None]
**promotion_application_level** | [***swagger::Nullable<models::PromotionApplicationLevel>**](PromotionApplicationLevel.md) | Specify if the promotion is applied at ad group or item level | [optional] [default to None]
**promotion_id** | **swagger::Nullable<String>** | Promotion ID. To clear this field, set to null. | [optional] [default to Some(swagger::Nullable::Present("0".to_string()))]
**promotion_ids** | **Vec<String>** | Promotion IDs list. To clear this field, set to an empty array []. | [optional] [default to None]
**start_time** | **i32** | Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. | [optional] [default to None]
**status** | [***models::EntityStatus**](EntityStatus.md) | Ad group/entity status. | [optional] [default to None]
**summary_status** | [***models::SummaryStatus**](SummaryStatus.md) |  | [readonly] 
**targeting_spec** | [***models::TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] [default to None]
**targeting_template_ids** | **swagger::Nullable<Vec<models::PinterestLibIntegerFormatType>>** | Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0']. | [optional] [default to None]
**tracking_urls** | [***swagger::Nullable<models::AdGroupTrackingUrls>**](AdGroupTrackingURLs.md) |  | [optional] [default to None]
**r#type** | **String** | Always \"adgroup\". | [readonly] [default to "adgroup".to_string()]
**updated_time** | **i32** | Ad group last update time. Unix timestamp in seconds. | [readonly] 
**auto_targeting_enabled** | **swagger::Nullable<bool>** | Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting). | [optional] [default to None]
**bid_multiplier** | **f64** | [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns). | [optional] [default to None]
**budget_type** | [***models::BudgetType**](BudgetType.md) |  | [optional] [default to None]
**pacing_delivery_type** | [***models::PacingDeliveryType**](PacingDeliveryType.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


