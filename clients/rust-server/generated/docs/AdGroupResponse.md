# AdGroupResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Ad group name. | [optional] [default to None]
**status** | [***models::EntityStatus**](EntityStatus.md) | Ad group/entity status. | [optional] [default to None]
**budget_in_micro_currency** | **i32** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] [default to None]
**bid_in_micro_currency** | **i32** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] [default to None]
**optimization_goal_metadata** | [***models::AdGroupCommonOptimizationGoalMetadata**](AdGroupCommon_optimization_goal_metadata.md) |  | [optional] [default to None]
**budget_type** | [***models::BudgetType**](BudgetType.md) |  | [optional] [default to None]
**start_time** | **i32** | Ad group start time. Unix timestamp in seconds. Defaults to current time. | [optional] [default to None]
**end_time** | **i32** | Ad group end time. Unix timestamp in seconds. | [optional] [default to None]
**targeting_spec** | [***models::TargetingSpec**](TargetingSpec.md) |  | [optional] [default to None]
**lifetime_frequency_cap** | **i32** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. | [optional] [default to None]
**tracking_urls** | [***models::AdGroupCommonTrackingUrls**](AdGroupCommon_tracking_urls.md) |  | [optional] [default to None]
**auto_targeting_enabled** | **bool** | Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. | [optional] [default to None]
**placement_group** | [***models::PlacementGroupType**](PlacementGroupType.md) | <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>. | [optional] [default to None]
**pacing_delivery_type** | [***models::PacingDeliveryType**](PacingDeliveryType.md) |  | [optional] [default to None]
**campaign_id** | **String** | Campaign ID of the ad group. | [optional] [default to None]
**billable_event** | [***models::ActionType**](ActionType.md) |  | [optional] [default to None]
**bid_strategy_type** | **String** | Bid strategy type | [optional] [default to None]
**id** | **String** | Ad group ID. | [optional] [default to None]
**ad_account_id** | **String** | Advertiser ID. | [optional] [default to None]
**created_time** | **i32** | Ad group creation time. Unix timestamp in seconds. | [optional] [default to None]
**updated_time** | **i32** | Ad group last update time. Unix timestamp in seconds. | [optional] [default to None]
**r#type** | **String** | Always \"adgroup\". | [optional] [default to Some("adgroup".to_string())]
**conversion_learning_mode_type** | **String** | oCPM learn mode | [optional] [default to None]
**summary_status** | [***models::AdGroupSummaryStatus**](AdGroupSummaryStatus.md) | Ad group summary status. | [optional] [default to None]
**feed_profile_id** | **String** | Feed Profile ID associated to the adgroup. | [optional] [default to None]
**dca_assets** | [***serde_json::Value**](.md) | [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


