# openapi::CatalogsHotelItemErrorResponse

Object describing a hotel item error

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | [Enum: ] 
**hotel_id** | **character** | The catalog hotel id in the merchant namespace | [optional] 
**errors** | [**array[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the errors for the item id requested | [optional] 


