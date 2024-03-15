# AdGroupCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Ad group name. | 
**status** | Option<[**models::EntityStatus**](EntityStatus.md)> | Ad group/entity status. | [optional]
**budget_in_micro_currency** | Option<**i32**> | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional]
**bid_in_micro_currency** | Option<**i32**> | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional]
**optimization_goal_metadata** | Option<[**models::AdGroupCommonOptimizationGoalMetadata**](AdGroupCommon_optimization_goal_metadata.md)> |  | [optional]
**budget_type** | Option<[**models::BudgetType**](BudgetType.md)> |  | [optional][default to Daily]
**start_time** | Option<**i32**> | Ad group start time. Unix timestamp in seconds. Defaults to current time. | [optional]
**end_time** | Option<**i32**> | Ad group end time. Unix timestamp in seconds. | [optional]
**targeting_spec** | Option<[**models::TargetingSpec**](TargetingSpec.md)> |  | [optional]
**lifetime_frequency_cap** | Option<**i32**> | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. | [optional]
**tracking_urls** | Option<[**models::AdGroupCommonTrackingUrls**](AdGroupCommon_tracking_urls.md)> |  | [optional]
**auto_targeting_enabled** | Option<**bool**> | Enable auto-targeting for ad group.Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. | [optional]
**placement_group** | Option<[**models::PlacementGroupType**](PlacementGroupType.md)> | <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>. | [optional]
**pacing_delivery_type** | Option<[**models::PacingDeliveryType**](PacingDeliveryType.md)> |  | [optional][default to Standard]
**campaign_id** | **String** | Campaign ID of the ad group. | 
**billable_event** | [**models::ActionType**](ActionType.md) |  | 
**bid_strategy_type** | Option<**String**> | Bid strategy type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


