# openapi::CatalogsUpdateRetailItem

An item to be updated

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | **character** | The catalog item id in the merchant namespace | 
**operation** | **character** |  | [Enum: [CREATE, UPDATE, UPSERT, DELETE]] 
**attributes** | [**UpdatableItemAttributes**](UpdatableItemAttributes.md) |  | 
**update_mask** | [**array[UpdateMaskFieldType]**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] 


