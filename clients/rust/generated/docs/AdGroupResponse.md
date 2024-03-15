# AdGroupResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | Option<**String**> | Ad group name. | [optional]
**status** | Option<[**models::EntityStatus**](EntityStatus.md)> | Ad group/entity status. | [optional]
**budget_in_micro_currency** | Option<**i32**> | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional]
**bid_in_micro_currency** | Option<**i32**> | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional]
**optimization_goal_metadata** | Option<[**models::AdGroupCommonOptimizationGoalMetadata**](AdGroupCommon_optimization_goal_metadata.md)> |  | [optional]
**budget_type** | Option<[**models::BudgetType**](BudgetType.md)> |  | [optional]
**start_time** | Option<**i32**> | Ad group start time. Unix timestamp in seconds. Defaults to current time. | [optional]
**end_time** | Option<**i32**> | Ad group end time. Unix timestamp in seconds. | [optional]
**targeting_spec** | Option<[**models::TargetingSpec**](TargetingSpec.md)> |  | [optional]
**lifetime_frequency_cap** | Option<**i32**> | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. | [optional]
**tracking_urls** | Option<[**models::AdGroupCommonTrackingUrls**](AdGroupCommon_tracking_urls.md)> |  | [optional]
**auto_targeting_enabled** | Option<**bool**> | Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. | [optional]
**placement_group** | Option<[**models::PlacementGroupType**](PlacementGroupType.md)> | <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>. | [optional]
**pacing_delivery_type** | Option<[**models::PacingDeliveryType**](PacingDeliveryType.md)> |  | [optional]
**campaign_id** | Option<**String**> | Campaign ID of the ad group. | [optional]
**billable_event** | Option<[**models::ActionType**](ActionType.md)> |  | [optional]
**bid_strategy_type** | Option<**String**> | Bid strategy type | [optional]
**id** | Option<**String**> | Ad group ID. | [optional]
**ad_account_id** | Option<**String**> | Advertiser ID. | [optional]
**created_time** | Option<**i32**> | Ad group creation time. Unix timestamp in seconds. | [optional]
**updated_time** | Option<**i32**> | Ad group last update time. Unix timestamp in seconds. | [optional]
**r#type** | Option<**String**> | Always \"adgroup\". | [optional][default to adgroup]
**conversion_learning_mode_type** | Option<**String**> | oCPM learn mode | [optional]
**summary_status** | Option<[**models::AdGroupSummaryStatus**](AdGroupSummaryStatus.md)> | Ad group summary status. | [optional]
**feed_profile_id** | Option<**String**> | Feed Profile ID associated to the adgroup. | [optional]
**dca_assets** | Option<[**serde_json::Value**](.md)> | [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


