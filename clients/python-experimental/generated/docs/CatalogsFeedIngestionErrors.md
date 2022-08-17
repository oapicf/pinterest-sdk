# CatalogsFeedIngestionErrors

#### Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IMAGE_DOWNLOAD_ERROR** | **int** | Some items include images that can&#x27;t be found. | [optional] 
**LINE_LEVEL_INTERNAL_ERROR** | **int** | We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. | [optional] 
**LARGE_PRODUCT_COUNT_DECREASE** | **int** | The product count has decreased by more than 99% compared to the last successful ingestion. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

