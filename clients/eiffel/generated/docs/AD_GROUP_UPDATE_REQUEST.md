# AD_GROUP_UPDATE_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**STRING_32**](STRING_32.md) | Ad group name. | [optional] [default to null]
**status** | [**ENTITY_STATUS**](EntityStatus.md) | Ad group/entity status. | [optional] [default to null]
**budget_in_micro_currency** | **INTEGER_32** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] [default to null]
**bid_in_micro_currency** | **INTEGER_32** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] [default to null]
**optimization_goal_metadata** | [**AD_GROUP_COMMON_OPTIMIZATION_GOAL_METADATA**](AdGroupCommon_optimization_goal_metadata.md) |  | [optional] [default to null]
**budget_type** | [**BUDGET_TYPE**](BudgetType.md) |  | [optional] [default to null]
**start_time** | **INTEGER_32** | Ad group start time. Unix timestamp in seconds. Defaults to current time. | [optional] [default to null]
**end_time** | **INTEGER_32** | Ad group end time. Unix timestamp in seconds. | [optional] [default to null]
**targeting_spec** | [**TARGETING_SPEC**](TargetingSpec.md) |  | [optional] [default to null]
**lifetime_frequency_cap** | **INTEGER_32** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] [default to null]
**tracking_urls** | [**AD_GROUP_COMMON_TRACKING_URLS**](AdGroupCommon_tracking_urls.md) |  | [optional] [default to null]
**auto_targeting_enabled** | **BOOLEAN** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to null]
**placement_group** | [**PLACEMENT_GROUP_TYPE**](PlacementGroupType.md) | &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. | [optional] [default to null]
**pacing_delivery_type** | [**PACING_DELIVERY_TYPE**](PacingDeliveryType.md) |  | [optional] [default to null]
**campaign_id** | [**STRING_32**](STRING_32.md) | Campaign ID of the ad group. | [optional] [default to null]
**billable_event** | [**ACTION_TYPE**](ActionType.md) |  | [optional] [default to null]
**bid_strategy_type** | [**STRING_32**](STRING_32.md) | Bid strategy type | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | Ad group ID. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


