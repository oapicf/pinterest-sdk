# CatalogsRetailBatchRequestItemsInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | **String** | The catalog item id in the merchant namespace | 
**operation** | **String** |  | 
**attributes** | [***models::ItemAttributes**](ItemAttributes.md) |  | 
**update_mask** | [**Vec<models::UpdateMaskFieldType>**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


