# AdResponseAllOf1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | Option<**String**> | The ID of the advertiser that this ad belongs to. | [optional]
**campaign_id** | Option<**String**> | ID of the ad campaign that contains this ad. | [optional]
**collection_items_destination_url_template** | Option<**String**> | Destination URL template for all items within a collections drawer. | [optional]
**created_time** | Option<**i32**> | Pin creation time. Unix timestamp in seconds. | [optional]
**id** | Option<**String**> | The ID of this ad. | [optional]
**rejected_reasons** | Option<**Vec<String>**> | Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". | [optional]
**rejection_labels** | Option<**Vec<String>**> | Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". | [optional]
**review_status** | Option<**String**> | Ad review status | [optional]
**_type** | Option<**String**> | Always \"ad\". | [optional]
**updated_time** | Option<**i32**> | Last update time. Unix timestamp in seconds. | [optional]
**summary_status** | Option<[**crate::models::PinPromotionSummaryStatus**](PinPromotionSummaryStatus.md)> | Ad summary status | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


