# ad_group_response_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **char \*** | Ad group name. | [optional] 
**status** | **entity_status_t \*** | Ad group/entity status. | [optional] 
**budget_in_micro_currency** | **int** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] 
**bid_in_micro_currency** | **int** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] 
**optimization_goal_metadata** | [**optimization_goal_metadata_t**](optimization_goal_metadata.md) \* | Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign&#39;s &#x60;objective_type&#x60; is set to &#x60;\&quot;WEB_CONVERSION\&quot;&#x60;. | [optional] 
**budget_type** | **budget_type_t \*** |  | [optional] 
**start_time** | **int** | Ad group start time. Unix timestamp in seconds. Defaults to current time. | [optional] 
**end_time** | **int** | Ad group end time. Unix timestamp in seconds. | [optional] 
**targeting_spec** | [**targeting_spec_t**](targeting_spec.md) \* |  | [optional] 
**lifetime_frequency_cap** | **int** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] 
**tracking_urls** | [**tracking_urls_t**](tracking_urls.md) \* | Third-party tracking URLs.&lt;br&gt; JSON object with the format: {\&quot;&lt;a href&#x3D;\&quot;/docs/redoc/#section/Tracking-URL-event\&quot;&gt;Tracking event enum&lt;/a&gt;\&quot;:[URL string array],...}&lt;br&gt; For example: {\&quot;impression\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;], \&quot;click\&quot;: [\&quot;URL1\&quot;, \&quot;URL2\&quot;, \&quot;URL3\&quot;]}.&lt;br&gt;Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.&lt;br&gt;&lt;br&gt; For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Third-party and dynamic tracking&lt;/a&gt;. | [optional] 
**auto_targeting_enabled** | **int** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] 
**placement_group** | **placement_group_type_t \*** | &lt;a href&#x3D;\&quot;/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. | [optional] 
**pacing_delivery_type** | **pacing_delivery_type_t \*** |  | [optional] 
**campaign_id** | **char \*** | Campaign ID of the ad group. | [optional] 
**billable_event** | **action_type_t \*** |  | [optional] 
**bid_strategy_type** | **pinterest_rest_api_ad_group_response_BIDSTRATEGYTYPE_e** | Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID. | [optional] 
**targeting_template_ids** | **list_t \*** | Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to [&#39;0&#39;]. | [optional] 
**id** | **char \*** | Ad group ID. | [optional] 
**ad_account_id** | **char \*** | Advertiser ID. | [optional] 
**created_time** | **int** | Ad group creation time. Unix timestamp in seconds. | [optional] 
**updated_time** | **int** | Ad group last update time. Unix timestamp in seconds. | [optional] 
**type** | **char \*** | Always \&quot;adgroup\&quot;. | [optional] [default to 'adgroup']
**conversion_learning_mode_type** | **pinterest_rest_api_ad_group_response_CONVERSIONLEARNINGMODETYPE_e** | oCPM learn mode | [optional] 
**summary_status** | **ad_group_summary_status_t \*** | Ad group summary status. | [optional] 
**feed_profile_id** | **char \*** | Feed Profile ID associated to the adgroup. | [optional] 
**dca_assets** | **any_type_t \*** | [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


