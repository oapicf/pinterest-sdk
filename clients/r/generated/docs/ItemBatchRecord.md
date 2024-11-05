# openapi::ItemBatchRecord

Object describing an item batch record

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | **character** | The catalog item id in the merchant namespace | [optional] 
**attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | [optional] 
**update_mask** | [**array[UpdateMaskFieldType]**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] 


