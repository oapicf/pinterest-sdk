# openapi::CatalogsRetailItemErrorResponse

Object describing a retail item error

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [Enum: ] 
**item_id** | **character** | The catalog item id in the merchant namespace | [optional] 
**errors** | [**array[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the errors for the item id requested | [optional] 


