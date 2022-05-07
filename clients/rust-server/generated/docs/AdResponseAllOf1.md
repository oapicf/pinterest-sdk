# AdResponseAllOf1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **String** | The ID of the advertiser that this ad belongs to. | [optional] [default to None]
**campaign_id** | **String** | ID of the ad campaign that contains this ad. | [optional] [default to None]
**collection_items_destination_url_template** | **String** | Destination URL template for all items within a collections drawer. | [optional] [default to None]
**created_time** | **isize** | Pin creation time. Unix timestamp in seconds. | [optional] [default to None]
**id** | **String** | The ID of this ad. | [optional] [default to None]
**rejected_reasons** | **Vec<String>** | Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". | [optional] [default to None]
**rejection_labels** | **Vec<String>** | Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". | [optional] [default to None]
**review_status** | **String** | Ad review status | [optional] [default to None]
**type_** | **String** | Always \"ad\". | [optional] [default to None]
**updated_time** | **isize** | Last update time. Unix timestamp in seconds. | [optional] [default to None]
**summary_status** | [***PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md) | Ad summary status | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


