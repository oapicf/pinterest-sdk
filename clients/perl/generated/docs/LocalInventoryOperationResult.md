# WWW::OpenAPIClient::Object::LocalInventoryOperationResult

## Load the model package
```perl
use WWW::OpenAPIClient::Object::LocalInventoryOperationResult;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**ARRAY[SupplementalItemValidationEvent]**](SupplementalItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**item_id** | **string** | Catalog item id in the merchant namespace | 
**status** | [**SupplementalItemProcessingStatus**](SupplementalItemProcessingStatus.md) | Status of the item processing record | 
**store_code** | **string** | Store code for the local inventory item | 
**supplemental_type** | **string** |  | 
**warnings** | [**ARRAY[SupplementalItemValidationEvent]**](SupplementalItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


