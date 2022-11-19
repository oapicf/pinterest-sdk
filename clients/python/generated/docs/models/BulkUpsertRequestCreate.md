# pinterestsdk.model.bulk_upsert_request_create.BulkUpsertRequestCreate

Request for creation of entities in bulk.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Request for creation of entities in bulk. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[campaigns](#campaigns)** | list, tuple,  | tuple,  |  | [optional] 
**[ad_groups](#ad_groups)** | list, tuple,  | tuple,  |  | [optional] 
**[ads](#ads)** | list, tuple,  | tuple,  |  | [optional] 
**[product_groups](#product_groups)** | list, tuple,  | tuple,  |  | [optional] 
**[keywords](#keywords)** | list, tuple,  | tuple,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# campaigns

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**CampaignCreateRequest**](CampaignCreateRequest.md) | [**CampaignCreateRequest**](CampaignCreateRequest.md) | [**CampaignCreateRequest**](CampaignCreateRequest.md) |  | 

# ad_groups

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**AdGroupCreateRequest**](AdGroupCreateRequest.md) | [**AdGroupCreateRequest**](AdGroupCreateRequest.md) | [**AdGroupCreateRequest**](AdGroupCreateRequest.md) |  | 

# ads

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**AdCreateRequest**](AdCreateRequest.md) | [**AdCreateRequest**](AdCreateRequest.md) | [**AdCreateRequest**](AdCreateRequest.md) |  | 

# product_groups

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**ProductGroupPromotionCreateRequest**](ProductGroupPromotionCreateRequest.md) | [**ProductGroupPromotionCreateRequest**](ProductGroupPromotionCreateRequest.md) | [**ProductGroupPromotionCreateRequest**](ProductGroupPromotionCreateRequest.md) |  | 

# keywords

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**KeywordsRequest**](KeywordsRequest.md) | [**KeywordsRequest**](KeywordsRequest.md) | [**KeywordsRequest**](KeywordsRequest.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

