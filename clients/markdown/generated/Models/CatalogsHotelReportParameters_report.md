# CatalogsHotelReportParameters_report
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **report\_type** | **String** |  | [optional] [default to null] |
| **feed\_id** | **String** | ID of the feed entity. | [default to null] |
| **processing\_result\_id** | **String** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. | [optional] [default to null] |
| **catalog\_id** | **String** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

