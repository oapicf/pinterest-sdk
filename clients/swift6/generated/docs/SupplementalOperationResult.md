# SupplementalOperationResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [SupplementalItemValidationEvent] | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**itemId** | **String** | Catalog item id in the merchant namespace | 
**status** | [**SupplementalItemProcessingStatus**](SupplementalItemProcessingStatus.md) | Status of the item processing record | 
**storeCode** | **String** | Store code for the local inventory item | 
**supplementalType** | **String** |  | 
**warnings** | [SupplementalItemValidationEvent] | Array with the validation warnings for the item processing record | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


