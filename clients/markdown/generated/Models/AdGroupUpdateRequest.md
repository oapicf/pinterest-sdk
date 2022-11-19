# AdGroupUpdateRequest
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **name** | **String** | Ad group name. | [optional] [default to null] |
| **status** | [**EntityStatus**](EntityStatus.md) | Ad group/entity status. | [optional] [default to null] |
| **budget\_in\_micro\_currency** | **Integer** | Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. | [optional] [default to null] |
| **bid\_in\_micro\_currency** | **Integer** | Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. | [optional] [default to null] |
| **bid\_strategy\_type** | **String** |  | [optional] [default to null] |
| **budget\_type** | [**BudgetType**](BudgetType.md) |  | [optional] [default to null] |
| **start\_time** | **Integer** | Ad group start time. Unix timestamp in seconds. Defaults to current time. | [optional] [default to null] |
| **end\_time** | **Integer** | Ad group end time. Unix timestamp in seconds. | [optional] [default to null] |
| **targeting\_spec** | [**Map**](array.md) | Ad group targeting specification defining the ad group target audience. For example, &#39;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}&#39; | [optional] [default to null] |
| **lifetime\_frequency\_cap** | **Integer** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Billable-event\&quot;&gt;billable_event&lt;/a&gt; value. This field **REQUIRES** the &#x60;end_time&#x60; field. | [optional] [default to null] |
| **tracking\_urls** | [**AdGroupCommon_tracking_urls**](AdGroupCommon_tracking_urls.md) |  | [optional] [default to null] |
| **auto\_targeting\_enabled** | **Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to null] |
| **placement\_group** | [**PlacementGroupType**](PlacementGroupType.md) | &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/redoc/#section/Placement-group\&quot;&gt;Placement group&lt;/a&gt;. | [optional] [default to null] |
| **pacing\_delivery\_type** | [**PacingDeliveryType**](PacingDeliveryType.md) | Pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. | [optional] [default to null] |
| **campaign\_id** | **String** | Campaign ID of the ad group. | [optional] [default to null] |
| **billable\_event** | [**ActionType**](ActionType.md) |  | [optional] [default to null] |
| **id** | **String** | Ad group ID. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

