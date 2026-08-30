# openapi::ItemResponse

Object describing an item record or error. Discriminated by `item_response_kind` (one unique value per leaf).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] 
**catalog_type** | **character** |  | [Enum: [CREATIVE_ASSETS]] 
**item_id** | **character** | The catalog item id in the merchant namespace | [optional] 
**item_response_kind** | **character** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | [Enum: [creative_assets_item_error]] 
**pins** | [**array[Pin]**](Pin.md) | The pins mapped to the item | [optional] [Max. items: 11] 
**hotel_id** | **character** | The catalog hotel id in the merchant namespace | [optional] 
**creative_assets_id** | **character** | The catalog creative assets id in the merchant namespace | [optional] 
**errors** | [**array[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the errors for the item id requested | 


