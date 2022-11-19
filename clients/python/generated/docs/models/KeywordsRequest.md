# pinterestsdk.model.keywords_request.KeywordsRequest

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[keywords](#keywords)** | list, tuple,  | tuple,  | Keyword JSON array. Each array element has 3 fields | 
**parent_id** | str,  | str,  | Keyword parent entity ID (advertiser, campaign, ad group). | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# keywords

Keyword JSON array. Each array element has 3 fields

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Keyword JSON array. Each array element has 3 fields | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**KeywordsCommon**](KeywordsCommon.md) | [**KeywordsCommon**](KeywordsCommon.md) | [**KeywordsCommon**](KeywordsCommon.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

