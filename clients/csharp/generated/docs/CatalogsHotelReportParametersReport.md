# Org.OpenAPITools.Model.CatalogsHotelReportParametersReport

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportType** | **string** |  | [optional] 
**FeedId** | **string** | ID of the feed entity. | 
**ProcessingResultId** | **string** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. | [optional] 
**CatalogId** | **string** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

