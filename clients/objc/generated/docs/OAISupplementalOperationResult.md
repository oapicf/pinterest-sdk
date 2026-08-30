# OAISupplementalOperationResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**NSArray&lt;OAISupplementalItemValidationEvent&gt;***](OAISupplementalItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**itemId** | **NSString*** | Catalog item id in the merchant namespace | 
**status** | [**OAISupplementalItemProcessingStatus***](OAISupplementalItemProcessingStatus.md) | Status of the item processing record | 
**storeCode** | **NSString*** | Store code for the local inventory item | 
**supplementalType** | **NSString*** |  | 
**warnings** | [**NSArray&lt;OAISupplementalItemValidationEvent&gt;***](OAISupplementalItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


