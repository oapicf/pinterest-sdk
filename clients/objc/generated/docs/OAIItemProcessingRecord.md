# OAIItemProcessingRecord

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **NSString*** | The catalog item id in the merchant namespace | [optional] 
**errors** | [**NSArray&lt;OAIItemValidationEvent&gt;***](OAIItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**warnings** | [**NSArray&lt;OAIItemValidationEvent&gt;***](OAIItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 
**status** | [**OAIItemProcessingStatus***](OAIItemProcessingStatus.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


