# pinterestsdk.model.catalogs_feed_ingestion_errors.CatalogsFeedIngestionErrors

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**IMAGE_DOWNLOAD_ERROR** | decimal.Decimal, int,  | decimal.Decimal,  | Some items include images that can&#x27;t be found. | [optional] 
**LINE_LEVEL_INTERNAL_ERROR** | decimal.Decimal, int,  | decimal.Decimal,  | We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. | [optional] 
**LARGE_PRODUCT_COUNT_DECREASE** | decimal.Decimal, int,  | decimal.Decimal,  | The product count has decreased by more than 99% compared to the last successful ingestion. | [optional] must be one of [1, ] 
**ACCOUNT_FLAGGED** | decimal.Decimal, int,  | decimal.Decimal,  | We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

