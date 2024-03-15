# ItemUpdateBatchRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | Option<**String**> | The catalog item id in the merchant namespace | [optional]
**attributes** | Option<[**models::UpdatableItemAttributes**](UpdatableItemAttributes.md)> |  | [optional]
**update_mask** | Option<[**Vec<models::UpdateMaskFieldType>**](UpdateMaskFieldType.md)> | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


