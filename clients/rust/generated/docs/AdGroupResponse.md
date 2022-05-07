# AdGroupResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | Option<**String**> | Ad group name. | [optional]
**status** | Option<[**crate::models::EntityStatus**](EntityStatus.md)> | Ad group/entity status. | [optional]
**budget_in_micro_currency** | Option<**i32**> | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional]
**bid_in_micro_currency** | Option<**i32**> | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional]
**budget_type** | Option<**String**> | Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. | [optional]
**start_time** | Option<**i32**> | Ad group start time. Unix timestamp in seconds. Defaults to current time. | [optional]
**end_time** | Option<**i32**> | Ad group end time. Unix timestamp in seconds. | [optional]
**targeting_spec** | Option<[**::std::collections::HashMap<String, Vec<String>>**](array.md)> | Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}' | [optional]
**lifetime_frequency_cap** | Option<**i32**> | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field. | [optional]
**tracking_urls** | Option<[**crate::models::TrackingUrls**](TrackingUrls.md)> | Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>. | [optional]
**auto_targeting_enabled** | Option<**bool**> | Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. | [optional]
**placement_group** | Option<[**crate::models::PlacementGroupType**](PlacementGroupType.md)> | <a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>. | [optional]
**pacing_delivery_type** | Option<[**crate::models::PacingDeliveryType**](PacingDeliveryType.md)> | Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. | [optional]
**conversion_learning_mode_type** | Option<**String**> | oCPM learn mode | [optional]
**summary_status** | Option<[**crate::models::AdGroupSummaryStatus**](AdGroupSummaryStatus.md)> | Ad group summary status. | [optional]
**feed_profile_id** | Option<**String**> | Feed Profile ID associated to the adgroup. | [optional]
**campaign_id** | Option<**String**> | Campaign ID of the ad group. | [optional]
**billable_event** | Option<[**crate::models::ActionType**](ActionType.md)> |  | [optional]
**id** | Option<**String**> | Ad group ID. | [optional]
**_type** | Option<**String**> | Always \"adgroup\". | [optional]
**ad_account_id** | Option<**String**> | Advertiser ID. | [optional]
**created_time** | Option<**i32**> | Ad group creation time. Unix timestamp in seconds. | [optional]
**updated_time** | Option<**i32**> | Ad group last update time. Unix timestamp in seconds. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


