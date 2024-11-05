# WWW::OpenAPIClient::Object::CatalogsHotelReportParametersReport

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CatalogsHotelReportParametersReport;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_type** | **string** |  | [optional] 
**feed_id** | **string** | ID of the feed entity. | 
**processing_result_id** | **string** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. | [optional] 
**catalog_id** | **string** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


