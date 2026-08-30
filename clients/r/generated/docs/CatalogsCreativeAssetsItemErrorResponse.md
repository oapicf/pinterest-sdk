# openapi::CatalogsCreativeAssetsItemErrorResponse

Object describing a creative assets item error

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **character** |  | [Enum: [CREATIVE_ASSETS]] 
**creative_assets_id** | **character** | The catalog creative assets id in the merchant namespace | [optional] 
**errors** | [**array[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the errors for the item id requested | 
**item_response_kind** | **character** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | [Enum: [creative_assets_item_error]] 


