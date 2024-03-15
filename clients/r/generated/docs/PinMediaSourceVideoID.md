# openapi::PinMediaSourceVideoID

Video ID-based media source

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_type** | **character** |  | [Enum: [video_id]] 
**cover_image_url** | **character** | Cover image url. | [optional] 
**cover_image_content_type** | **character** | Content type for cover image Base64. | [optional] [Enum: [image/jpeg, image/png]] 
**cover_image_data** | **character** | Cover image Base64. | [optional] 
**media_id** | **character** |  | [Pattern: ^\\d+$] 
**is_standard** | **character** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to TRUE] 


