# openapi::CatalogsRetailBatchRequestItemsInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | 
**item_id** | **character** | The catalog item id in the merchant namespace | 
**operation** | **character** |  | [Enum: [DELETE]] 
**update_mask** | [**array[UpdateMaskFieldType]**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] 
**last_updated_time** | **integer** | The millisecond timestamp when the item was lastly modified by the merchant. | [optional] 


