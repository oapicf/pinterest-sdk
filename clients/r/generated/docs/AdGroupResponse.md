# openapi::AdGroupResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **character** | Ad group name. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) | Ad group/entity status. | [optional] [Enum: ] 
**budget_in_micro_currency** | **integer** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] 
**bid_in_micro_currency** | **integer** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] 
**optimization_goal_metadata** | [**AdGroupCommonOptimizationGoalMetadata**](AdGroupCommon_optimization_goal_metadata.md) |  | [optional] 
**budget_type** | [**BudgetType**](BudgetType.md) |  | [optional] [Enum: ] 
**start_time** | **integer** | Ad group start time. Unix timestamp in seconds. Defaults to current time. | [optional] 
**end_time** | **integer** | Ad group end time. Unix timestamp in seconds. | [optional] 
**targeting_spec** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**lifetime_frequency_cap** | **integer** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] 
**tracking_urls** | [**AdGroupCommonTrackingUrls**](AdGroupCommon_tracking_urls.md) |  | [optional] 
**auto_targeting_enabled** | **character** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] 
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) | &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. | [optional] [Enum: ] 
**pacing_delivery_type** | [**PacingDeliveryType**](PacingDeliveryType.md) |  | [optional] [Enum: ] 
**campaign_id** | **character** | Campaign ID of the ad group. | [optional] [Pattern: ^[C]?\\d+$] 
**billable_event** | [**ActionType**](ActionType.md) |  | [optional] [Enum: ] 
**bid_strategy_type** | **character** | Bid strategy type | [optional] [Enum: [AUTOMATIC_BID, MAX_BID, TARGET_AVG, null]] 
**id** | **character** | Ad group ID. | [optional] [Pattern: ^\\d+$] 
**ad_account_id** | **character** | Advertiser ID. | [optional] [Pattern: ^\\d+$] 
**created_time** | **integer** | Ad group creation time. Unix timestamp in seconds. | [optional] 
**updated_time** | **integer** | Ad group last update time. Unix timestamp in seconds. | [optional] 
**type** | **character** | Always \&quot;adgroup\&quot;. | [optional] [default to &quot;adgroup&quot;] 
**conversion_learning_mode_type** | **character** | oCPM learn mode | [optional] [Enum: [NOT_ACTIVE, ACTIVE, null]] 
**summary_status** | [**AdGroupSummaryStatus**](AdGroupSummaryStatus.md) | Ad group summary status. | [optional] [Enum: ] 
**feed_profile_id** | **character** | Feed Profile ID associated to the adgroup. | [optional] 
**dca_assets** | [**AnyType**](.md) | [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. | [optional] 


