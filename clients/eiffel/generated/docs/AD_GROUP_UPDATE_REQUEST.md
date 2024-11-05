# AD_GROUP_UPDATE_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**STRING_32**](STRING_32.md) | Ad group name. | [optional] [default to null]
**status** | [**ENTITY_STATUS**](EntityStatus.md) | Ad group/entity status. | [optional] [default to null]
**budget_in_micro_currency** | **INTEGER_32** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] [default to null]
**bid_in_micro_currency** | **INTEGER_32** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] [default to null]
**optimization_goal_metadata** | [**OPTIMIZATION_GOAL_METADATA**](OptimizationGoalMetadata.md) | Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;. | [optional] [default to null]
**budget_type** | [**BUDGET_TYPE**](BudgetType.md) |  | [optional] [default to null]
**start_time** | **INTEGER_32** | Ad group start time. Unix timestamp in seconds. Defaults to current time. | [optional] [default to null]
**end_time** | **INTEGER_32** | Ad group end time. Unix timestamp in seconds. | [optional] [default to null]
**targeting_spec** | [**TARGETING_SPEC**](TargetingSpec.md) |  | [optional] [default to null]
**lifetime_frequency_cap** | **INTEGER_32** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] [default to null]
**tracking_urls** | [**TRACKING_URLS**](TrackingUrls.md) | Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;. | [optional] [default to null]
**auto_targeting_enabled** | **BOOLEAN** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to null]
**placement_group** | [**PLACEMENT_GROUP_TYPE**](PlacementGroupType.md) | &lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. | [optional] [default to null]
**pacing_delivery_type** | [**PACING_DELIVERY_TYPE**](PacingDeliveryType.md) |  | [optional] [default to null]
**campaign_id** | [**STRING_32**](STRING_32.md) | Campaign ID of the ad group. | [optional] [default to null]
**billable_event** | [**ACTION_TYPE**](ActionType.md) |  | [optional] [default to null]
**bid_strategy_type** | [**STRING_32**](STRING_32.md) | Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID. | [optional] [default to null]
**targeting_template_ids** | [**LIST [STRING_32]**](STRING_32.md) | Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;]. | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | Ad group ID. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


