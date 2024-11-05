# catalogs_hotel_report_parameters_report_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_type** | **pinterest_rest_api_catalogs_hotel_report_parameters_report_REPORTTYPE_e** |  | [optional] 
**feed_id** | **char \*** | ID of the feed entity. | 
**processing_result_id** | **char \*** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. | [optional] 
**catalog_id** | **char \*** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


