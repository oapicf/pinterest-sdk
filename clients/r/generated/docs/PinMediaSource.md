# openapi::PinMediaSource

Pin media source.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_type** | **character** |  | [Enum: [pin_url]] 
**content_type** | **character** |  | [Enum: [image/jpeg, image/png]] 
**data** | **character** |  | [Pattern: [a-zA-Z0-9+/&#x3D;]+] 
**is_standard** | **character** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to TRUE] 
**url** | **character** |  | 
**cover_image_url** | **character** | Cover image url. | [optional] 
**cover_image_content_type** | **character** | Content type for cover image Base64. | [optional] [Enum: [image/jpeg, image/png]] 
**cover_image_data** | **character** | Cover image Base64. | [optional] 
**media_id** | **character** |  | [Pattern: ^\\d+$] 
**items** | [**array[PinMediaSourceImagesURLItemsInner]**](PinMediaSourceImagesURL_items_inner.md) | Array with image objects. | [Max. items: 5] [Min. items: 2] 
**index** | **integer** |  | [optional] [Min: 0] 
**is_affiliate_link** | **character** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to FALSE] 


