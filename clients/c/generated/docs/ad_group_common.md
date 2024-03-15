# ad_group_common_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **char \*** | Ad group name. | [optional] 
**status** | **entity_status_t \*** | Ad group/entity status. | [optional] 
**budget_in_micro_currency** | **int** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] 
**bid_in_micro_currency** | **int** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] 
**optimization_goal_metadata** | [**ad_group_common_optimization_goal_metadata_t**](ad_group_common_optimization_goal_metadata.md) \* |  | [optional] 
**budget_type** | **budget_type_t \*** |  | [optional] 
**start_time** | **int** | Ad group start time. Unix timestamp in seconds. Defaults to current time. | [optional] 
**end_time** | **int** | Ad group end time. Unix timestamp in seconds. | [optional] 
**targeting_spec** | [**targeting_spec_t**](targeting_spec.md) \* |  | [optional] 
**lifetime_frequency_cap** | **int** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] 
**tracking_urls** | [**ad_group_common_tracking_urls_t**](ad_group_common_tracking_urls.md) \* |  | [optional] 
**auto_targeting_enabled** | **int** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] 
**placement_group** | **placement_group_type_t \*** | &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. | [optional] 
**pacing_delivery_type** | **pacing_delivery_type_t \*** |  | [optional] 
**campaign_id** | **char \*** | Campaign ID of the ad group. | [optional] 
**billable_event** | **action_type_t \*** |  | [optional] 
**bid_strategy_type** | **pinterest_rest_api_ad_group_common_BIDSTRATEGYTYPE_e** | Bid strategy type | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


