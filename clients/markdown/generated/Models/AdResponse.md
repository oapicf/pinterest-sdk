# AdResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad\_group\_id** | **String** | ID of the ad group that contains the ad. | [optional] [default to null]
**android\_deep\_link** | **String** | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] [default to null]
**carousel\_android\_deep\_links** | **List** | Comma-separated deep links for the carousel pin on Android. | [optional] [default to null]
**carousel\_destination\_urls** | **List** | Comma-separated destination URLs for the carousel pin to promote. | [optional] [default to null]
**carousel\_ios\_deep\_links** | **List** | Comma-separated deep links for the carousel pin on iOS. | [optional] [default to null]
**click\_tracking\_url** | **String** | Tracking url for the ad clicks. | [optional] [default to null]
**creative\_type** | **String** | Ad creative type enum | [optional] [default to null]
**destination\_url** | **String** | Destination URL. | [optional] [default to null]
**ios\_deep\_link** | **String** | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] [default to null]
**is\_pin\_deleted** | **Boolean** | Is original pin deleted? | [optional] [default to null]
**is\_removable** | **Boolean** | Is pin repinnable? | [optional] [default to null]
**name** | **String** | Name of the ad - 255 chars max. | [optional] [default to null]
**pin\_id** | **String** | Pin ID. | [optional] [default to null]
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to null]
**tracking\_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] [default to null]
**view\_tracking\_url** | **String** | Tracking URL for ad impressions. | [optional] [default to null]
**ad\_account\_id** | **String** | The ID of the advertiser that this ad belongs to. | [optional] [default to null]
**campaign\_id** | **String** | ID of the ad campaign that contains this ad. | [optional] [default to null]
**collection\_items\_destination\_url\_template** | **String** | Destination URL template for all items within a collections drawer. | [optional] [default to null]
**created\_time** | **Integer** | Pin creation time. Unix timestamp in seconds. | [optional] [default to null]
**id** | **String** | The ID of this ad. | [optional] [default to null]
**rejected\_reasons** | **List** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] [default to null]
**rejection\_labels** | **List** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] [default to null]
**review\_status** | **String** | Ad review status | [optional] [default to null]
**type** | **String** | Always \&quot;ad\&quot;. | [optional] [default to null]
**updated\_time** | **Integer** | Last update time. Unix timestamp in seconds. | [optional] [default to null]
**summary\_status** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

