# openapi::CatalogsRetailItemResponse

Object describing a retail item record

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [Enum: ] 
**item_id** | **character** | The catalog retail item id in the merchant namespace | [optional] 
**pins** | [**array[Pin]**](Pin.md) | The pins mapped to the item | [optional] [Max. items: 11] 
**attributes** | [**ItemAttributes**](ItemAttributes.md) |  | [optional] 


