# openapi::PinMediaSourceImageBase64

Image Base64-based media source.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | [**ContentType**](ContentType.md) |  | [Enum: ] 
**data** | **character** |  | [Pattern: ^[a-zA-Z0-9+/&#x3D;]+$] 
**is_standard** | **character** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to TRUE] 
**source_type** | **character** | The source type of the media. | [Enum: [image_base64]] 


