# AdGroupBase

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | Option<**String**> | Advertiser ID. | [optional][readonly]
**bid_in_micro_currency** | Option<**i32**> | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional]
**bid_strategy_type** | Option<[**models::BidStrategyType**](BidStrategyType.md)> |  | [optional]
**billable_event** | [**models::ActionType**](ActionType.md) |  | 
**budget_in_micro_currency** | Option<**i32**> | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional]
**campaign_id** | **String** | Campaign ID of the ad group. | 
**conversion_learning_mode_type** | Option<[**models::ConversionLearningModeType**](ConversionLearningModeType.md)> | oCPM learn mode | [readonly]
**created_time** | **i32** | Ad group creation time. Unix timestamp in seconds. | [readonly]
**customer_segment_id** | Option<**String**> | Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'. | [optional]
**dca_assets** | Option<**serde_json::Value**> | [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. | [optional][readonly]
**end_time** | Option<**i32**> | Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO. | [optional]
**ext_features** | Option<[**models::AdgroupTrackingFeatures**](AdgroupTrackingFeatures.md)> |  | [optional]
**feed_profile_id** | Option<**String**> | Feed Profile ID associated to the adgroup. | [optional]
**id** | **String** | Ad group ID. | 
**is_creative_optimization** | Option<**bool**> | Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. | [optional]
**is_local_inventory** | Option<**bool**> | Indicates whether the ad group should use the local inventory. | [optional]
**lifetime_frequency_cap** | Option<**i32**> | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field. | [optional]
**local_inventory_radius_in_miles** | Option<**f64**> | The targeting radius of the local inventory ads in miles. | [optional]
**name** | **String** | Ad group name. | 
**optimization_goal_metadata** | Option<[**models::NullableOptimizationGoalMetadata**](NullableOptimizationGoalMetadata.md)> | Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`. | [optional]
**performance_plus_campaign_settings** | Option<[**models::PerformancePlusCampaignSettings**](PerformancePlusCampaignSettings.md)> | Pinterest Performance+ campaign settings. | [optional]
**placement_group** | Option<[**models::PlacementGroupType**](PlacementGroupType.md)> | [Placement group](https://help.pinterest.com/en/business/article/placement-groups). | [optional]
**placement_traffic_type** | Option<[**models::PlacementTrafficType**](PlacementTrafficType.md)> | A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both | [optional]
**promotion_application_level** | Option<[**models::PromotionApplicationLevel**](PromotionApplicationLevel.md)> | Specify if the promotion is applied at ad group or item level | [optional]
**promotion_id** | Option<**String**> | Promotion ID. To clear this field, set to null. | [optional][default to 0]
**promotion_ids** | Option<**Vec<String>**> | Promotion IDs list. To clear this field, set to an empty array []. | [optional]
**start_time** | Option<**i32**> | Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. | [optional]
**status** | Option<[**models::EntityStatus**](EntityStatus.md)> | Ad group/entity status. | [optional]
**summary_status** | [**models::SummaryStatus**](SummaryStatus.md) |  | [readonly]
**targeting_spec** | Option<[**models::TargetingSpecOptimal**](TargetingSpecOptimal.md)> |  | [optional]
**targeting_template_ids** | Option<**Vec<String>**> | Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0']. | [optional]
**tracking_urls** | Option<[**models::AdGroupTrackingUrls**](AdGroupTrackingURLs.md)> |  | [optional]
**r#type** | **String** | Always \"adgroup\". | [readonly][default to adgroup]
**updated_time** | **i32** | Ad group last update time. Unix timestamp in seconds. | [readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


