# CatalogsHotelReportParametersReport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feed_id** | **String** | ID of the feed entity. | 
**processing_result_id** | **String** | Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. | [optional] [default to None]
**report_type** | [***models::CatalogsReportDistributionIssueFilterReportType**](CatalogsReportDistributionIssueFilter_report_type.md) |  | 
**catalog_id** | **String** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


