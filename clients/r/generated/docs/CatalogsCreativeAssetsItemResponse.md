# openapi::CatalogsCreativeAssetsItemResponse

Object describing a creative assets item record

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] 
**catalog_type** | **character** |  | [Enum: [CREATIVE_ASSETS]] 
**creative_assets_id** | **character** | The catalog creative assets id in the merchant namespace | [optional] 
**item_response_kind** | **character** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | [Enum: [creative_assets_item]] 
**pins** | [**array[Pin]**](Pin.md) | The pins mapped to the item | [optional] [Max. items: 11] 


