# openapi::AdGroupCreateRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **character** | Ad group name. | 
**status** | [**EntityStatus**](EntityStatus.md) | Ad group/entity status. | [optional] [Enum: ] 
**budget_in_micro_currency** | **integer** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] 
**bid_in_micro_currency** | **integer** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] 
**optimization_goal_metadata** | [**AdGroupCommonOptimizationGoalMetadata**](AdGroupCommon_optimization_goal_metadata.md) |  | [optional] 
**budget_type** | [**BudgetType**](BudgetType.md) |  | [optional] [default to &quot;DAILY&quot;] [Enum: ] 
**start_time** | **integer** | Ad group start time. Unix timestamp in seconds. Defaults to current time. | [optional] 
**end_time** | **integer** | Ad group end time. Unix timestamp in seconds. | [optional] 
**targeting_spec** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**lifetime_frequency_cap** | **integer** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] 
**tracking_urls** | [**AdGroupCommonTrackingUrls**](AdGroupCommon_tracking_urls.md) |  | [optional] 
**auto_targeting_enabled** | **character** | Enable auto-targeting for ad group.Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] 
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) | &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. | [optional] [Enum: ] 
**pacing_delivery_type** | [**PacingDeliveryType**](PacingDeliveryType.md) |  | [optional] [default to &quot;STANDARD&quot;] [Enum: ] 
**campaign_id** | **character** | Campaign ID of the ad group. | [Pattern: ^[C]?\\d+$] 
**billable_event** | [**ActionType**](ActionType.md) |  | [Enum: ] 
**bid_strategy_type** | **character** | Bid strategy type | [optional] [Enum: [AUTOMATIC_BID, MAX_BID, TARGET_AVG, null]] 


