# CATALOGS_HOTEL_REPORT_PARAMETERS_REPORT

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_type** | [**STRING_32**](STRING_32.md) |  | [optional] [default to null]
**feed_id** | [**STRING_32**](STRING_32.md) | ID of the feed entity. | [default to null]
**processing_result_id** | [**STRING_32**](STRING_32.md) | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. | [optional] [default to null]
**catalog_id** | [**STRING_32**](STRING_32.md) | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


