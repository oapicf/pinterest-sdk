# openapi::ItemResponse

Object describing an item record

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [Enum: ] 
**item_id** | **character** | The catalog item id in the merchant namespace | [optional] 
**pins** | [**array[Pin]**](Pin.md) | The pins mapped to the item | [optional] [Max. items: 11] 
**attributes** | [**CatalogsHotelAttributes**](CatalogsHotelAttributes.md) |  | [optional] 
**hotel_id** | **character** | The catalog hotel id in the merchant namespace | [optional] 
**errors** | [**array[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the errors for the item id requested | [optional] 


