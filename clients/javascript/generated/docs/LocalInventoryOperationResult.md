# PinterestSdk.LocalInventoryOperationResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**[SupplementalItemValidationEvent]**](SupplementalItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**itemId** | **String** | Catalog item id in the merchant namespace | 
**status** | [**SupplementalItemProcessingStatus**](SupplementalItemProcessingStatus.md) | Status of the item processing record | 
**storeCode** | **String** | Store code for the local inventory item | 
**supplementalType** | **String** |  | 
**warnings** | [**[SupplementalItemValidationEvent]**](SupplementalItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 



## Enum: SupplementalTypeEnum


* `LOCAL_INVENTORY` (value: `"LOCAL_INVENTORY"`)




