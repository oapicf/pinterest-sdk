# # AdResponseAllOf1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | The ID of the advertiser that this ad belongs to. | [optional]
**campaign_id** | **string** | ID of the ad campaign that contains this ad. | [optional]
**collection_items_destination_url_template** | **string** | Destination URL template for all items within a collections drawer. | [optional]
**created_time** | **int** | Pin creation time. Unix timestamp in seconds. | [optional]
**id** | **string** | The ID of this ad. | [optional]
**rejected_reasons** | **string[]** | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional]
**rejection_labels** | **string[]** | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional]
**review_status** | **string** | Ad review status | [optional]
**type** | **string** | Always \&quot;ad\&quot;. | [optional]
**updated_time** | **int** | Last update time. Unix timestamp in seconds. | [optional]
**summary_status** | [**PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
