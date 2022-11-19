# pinterestsdk.model.item_processing_record.ItemProcessingRecord

Object describing an item processing record

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Object describing an item processing record | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**item_id** | str,  | str,  | The catalog item id in the merchant namespace | [optional] 
**[errors](#errors)** | list, tuple,  | tuple,  | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**[warnings](#warnings)** | list, tuple,  | tuple,  | Array with the validation warnings for the item processing record | [optional] 
**status** | [**ItemProcessingStatus**](ItemProcessingStatus.md) | [**ItemProcessingStatus**](ItemProcessingStatus.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# errors

Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**ItemValidationEvent**](ItemValidationEvent.md) | [**ItemValidationEvent**](ItemValidationEvent.md) | [**ItemValidationEvent**](ItemValidationEvent.md) |  | 

# warnings

Array with the validation warnings for the item processing record

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Array with the validation warnings for the item processing record | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**ItemValidationEvent**](ItemValidationEvent.md) | [**ItemValidationEvent**](ItemValidationEvent.md) | [**ItemValidationEvent**](ItemValidationEvent.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

