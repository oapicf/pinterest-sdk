# ITEM_UPDATE_BATCH_RECORD

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | [**STRING_32**](STRING_32.md) | The catalog item id in the merchant namespace | [optional] [default to null]
**attributes** | [**UPDATABLE_ITEM_ATTRIBUTES**](UpdatableItemAttributes.md) |  | [optional] [default to null]
**update_mask** | [**LIST [UPDATE_MASK_FIELD_TYPE]**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


