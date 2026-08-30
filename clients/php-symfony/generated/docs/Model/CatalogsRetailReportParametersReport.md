# CatalogsRetailReportParametersReport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedId** | **string** | ID of the feed entity. | 
**processingResultId** | **string** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. | [optional] 
**reportType** | **string** |  | 
**catalogId** | **string** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] 
**productGroupId** | **string** | Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


