# OAIItemUpdateBatchRecord

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **NSString*** | The catalog item id in the merchant namespace | [optional] 
**attributes** | [**OAIUpdatableItemAttributes***](OAIUpdatableItemAttributes.md) |  | [optional] 
**updateMask** | [**NSArray&lt;OAIUpdateMaskFieldType&gt;***](OAIUpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


