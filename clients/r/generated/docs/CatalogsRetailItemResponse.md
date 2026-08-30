# openapi::CatalogsRetailItemResponse

Object describing a retail item record

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**ItemAttributes**](ItemAttributes.md) |  | [optional] 
**catalog_type** | **character** |  | [Enum: [RETAIL]] 
**item_id** | **character** | The catalog retail item id in the merchant namespace | [optional] 
**item_response_kind** | **character** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | [Enum: [retail_item]] 
**pins** | [**array[Pin]**](Pin.md) | The pins mapped to the item | [optional] [Max. items: 11] 


