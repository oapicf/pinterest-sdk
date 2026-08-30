# CatalogsUpdateRetailItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`attributes`** | [**`*UpdatableItemAttributes`**](UpdatableItemAttributes.md) |  | [default to nothing]
**`item_id`** | **`String`** | The catalog item id in the merchant namespace | [default to nothing]
**`operation`** | **`String`** |  | [default to nothing]
**`update_mask`** | [**`Vector{UpdateMaskFieldType}`**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


