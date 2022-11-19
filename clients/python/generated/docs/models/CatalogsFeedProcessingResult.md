# pinterestsdk.model.catalogs_feed_processing_result.CatalogsFeedProcessingResult

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[CatalogsDbItem](CatalogsDbItem.md) | [**CatalogsDbItem**](CatalogsDbItem.md) | [**CatalogsDbItem**](CatalogsDbItem.md) |  | 
[all_of_1](#all_of_1) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# all_of_1

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**product_counts** | [**CatalogsFeedProductCounts**](CatalogsFeedProductCounts.md) | [**CatalogsFeedProductCounts**](CatalogsFeedProductCounts.md) |  | 
**ingestion_details** | [**CatalogsFeedIngestionDetails**](CatalogsFeedIngestionDetails.md) | [**CatalogsFeedIngestionDetails**](CatalogsFeedIngestionDetails.md) |  | 
**validation_details** | [**CatalogsFeedValidationDetails**](CatalogsFeedValidationDetails.md) | [**CatalogsFeedValidationDetails**](CatalogsFeedValidationDetails.md) |  | 
**status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

