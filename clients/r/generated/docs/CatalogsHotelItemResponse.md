# openapi::CatalogsHotelItemResponse

Object describing a hotel record

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsHotelAttributes**](CatalogsHotelAttributes.md) |  | [optional] 
**catalog_type** | **character** |  | [Enum: [HOTEL]] 
**hotel_id** | **character** | The catalog hotel id in the merchant namespace | [optional] 
**item_response_kind** | **character** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | [Enum: [hotel_item]] 
**pins** | [**array[Pin]**](Pin.md) | The pins mapped to the item | [optional] [Max. items: 11] 


