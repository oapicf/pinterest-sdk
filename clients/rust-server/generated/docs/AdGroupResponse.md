# AdGroupResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Ad group name. | [optional] [default to None]
**status** | [***EntityStatus**](EntityStatus.md) | Ad group/entity status. | [optional] [default to None]
**budget_in_micro_currency** | **isize** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] [default to None]
**bid_in_micro_currency** | **isize** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] [default to None]
**budget_type** | **String** | Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. | [optional] [default to None]
**start_time** | **isize** | Ad group start time. Unix timestamp in seconds. Defaults to current time. | [optional] [default to None]
**end_time** | **isize** | Ad group end time. Unix timestamp in seconds. | [optional] [default to None]
**targeting_spec** | [**std::collections::HashMap<String, Vec<String>>**](array.md) | Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}' | [optional] [default to None]
**lifetime_frequency_cap** | **isize** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\\\"/docs/redoc/#section/Billable-event\\\">billable_event</a> value. This field **REQUIRES** the `end_time` field. | [optional] [default to None]
**tracking_urls** | [***TrackingUrls**](TrackingUrls.md) | Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>. | [optional] [default to None]
**auto_targeting_enabled** | **bool** | Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. | [optional] [default to None]
**placement_group** | [***PlacementGroupType**](PlacementGroupType.md) | <a href=\\\"/docs/redoc/#section/Placement-group\\\">Placement group</a>. | [optional] [default to None]
**pacing_delivery_type** | [***PacingDeliveryType**](PacingDeliveryType.md) | Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. | [optional] [default to None]
**conversion_learning_mode_type** | **String** | oCPM learn mode | [optional] [default to None]
**summary_status** | [***AdGroupSummaryStatus**](AdGroupSummaryStatus.md) | Ad group summary status. | [optional] [default to None]
**feed_profile_id** | **String** | Feed Profile ID associated to the adgroup. | [optional] [default to None]
**campaign_id** | **String** | Campaign ID of the ad group. | [optional] [default to None]
**billable_event** | [***models::ActionType**](ActionType.md) |  | [optional] [default to None]
**id** | **String** | Ad group ID. | [optional] [default to None]
**type_** | **String** | Always \"adgroup\". | [optional] [default to None]
**ad_account_id** | **String** | Advertiser ID. | [optional] [default to None]
**created_time** | **isize** | Ad group creation time. Unix timestamp in seconds. | [optional] [default to None]
**updated_time** | **isize** | Ad group last update time. Unix timestamp in seconds. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


