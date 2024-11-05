# ItemUpdateBatchRecord

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **String!** | The catalog item id in the merchant namespace | [optional] [default to null]
**attributes** | [***UpdatableItemAttributes**](UpdatableItemAttributes.md) |  | [optional] [default to null]
**updateMask** | [**UpdateMaskFieldType**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


