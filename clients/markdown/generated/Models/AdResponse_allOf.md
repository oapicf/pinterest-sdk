# AdResponse_allOf
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String** | The ID of the advertiser that this ad belongs to. | [optional] [default to null] |
| **campaign\_id** | **String** | ID of the ad campaign that contains this ad. | [optional] [default to null] |
| **collection\_items\_destination\_url\_template** | **String** | Destination URL template for all items within a collections drawer. | [optional] [default to null] |
| **created\_time** | **Integer** | Pin creation time. Unix timestamp in seconds. | [optional] [default to null] |
| **id** | **String** | The ID of this ad. | [optional] [default to null] |
| **rejected\_reasons** | **List** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] [default to null] |
| **rejection\_labels** | **List** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] [default to null] |
| **review\_status** | **String** | Ad review status | [optional] [default to null] |
| **type** | **String** | Always \&quot;ad\&quot;. | [optional] [default to null] |
| **updated\_time** | **Integer** | Last update time. Unix timestamp in seconds. | [optional] [default to null] |
| **summary\_status** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

