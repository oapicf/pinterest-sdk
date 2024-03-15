# openapi::PinMediaSourceImageBase64

Base64-encoded image media source

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_type** | **character** |  | [Enum: [image_base64]] 
**content_type** | **character** |  | [Enum: [image/jpeg, image/png]] 
**data** | **character** |  | [Pattern: [a-zA-Z0-9+/&#x3D;]+] 
**is_standard** | **character** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to TRUE] 


