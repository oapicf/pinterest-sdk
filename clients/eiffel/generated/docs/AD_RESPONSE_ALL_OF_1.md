# AD_RESPONSE_ALL_OF_1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | [**STRING_32**](STRING_32.md) | The ID of the advertiser that this ad belongs to. | [optional] [default to null]
**campaign_id** | [**STRING_32**](STRING_32.md) | ID of the ad campaign that contains this ad. | [optional] [default to null]
**collection_items_destination_url_template** | [**STRING_32**](STRING_32.md) | Destination URL template for all items within a collections drawer. | [optional] [default to null]
**created_time** | **INTEGER_32** | Pin creation time. Unix timestamp in seconds. | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | The ID of this ad. | [optional] [default to null]
**rejected_reasons** | [**LIST [STRING_32]**](STRING_32.md) | Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] [default to null]
**rejection_labels** | [**LIST [STRING_32]**](STRING_32.md) | Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;. | [optional] [default to null]
**review_status** | [**STRING_32**](STRING_32.md) | Ad review status | [optional] [default to null]
**type** | [**STRING_32**](STRING_32.md) | Always \&quot;ad\&quot;. | [optional] [default to null]
**updated_time** | **INTEGER_32** | Last update time. Unix timestamp in seconds. | [optional] [default to null]
**summary_status** | [**PIN_PROMOTION_SUMMARY_STATUS**](PinPromotionSummaryStatus.md) | Ad summary status | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


