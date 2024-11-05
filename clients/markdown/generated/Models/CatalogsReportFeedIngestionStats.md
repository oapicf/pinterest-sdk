# CatalogsReportFeedIngestionStats
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **report\_type** | **String** |  | [optional] [default to null] |
| **catalog\_id** | **String** | ID of the catalog entity. | [optional] [default to null] |
| **code** | **Integer** | The event code that a diagnostics aggregated number references | [optional] [default to null] |
| **code\_label** | **String** | A human-friendly label for the event code (e.g, &#39;AVAILABILITY_INVALID&#39;) | [optional] [default to null] |
| **message** | **String** | Title message describing the diagnostic issue | [optional] [default to null] |
| **occurrences** | **Integer** | Number of occurrences of the issue | [optional] [default to null] |
| **severity** | **String** | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

