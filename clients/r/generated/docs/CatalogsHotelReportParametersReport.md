# openapi::CatalogsHotelReportParametersReport


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feed_id** | **character** | ID of the feed entity. | [Pattern: ^\\d+$] 
**processing_result_id** | **character** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. | [optional] [Pattern: ^\\d+$] 
**report_type** | **character** |  | [Enum: [DISTRIBUTION_ISSUES]] 
**catalog_id** | **character** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] [Pattern: ^\\d+$] 


