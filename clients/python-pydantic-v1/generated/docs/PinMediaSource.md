# PinMediaSource

Pin media source that can be an image, video, or a mix of both passed in as a request.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | [**ContentType**](ContentType.md) |  | 
**data** | **str** |  | 
**is_standard** | **bool** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to True]
**source_type** | **str** |  | 
**url** | **str** |  | 
**cover_image_content_type** | [**ContentType**](ContentType.md) | Content type for cover image Base64. | [optional] 
**cover_image_data** | **str** | Cover image Base64. | [optional] 
**cover_image_key_frame_time** | **int** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional] 
**cover_image_url** | **str** | Cover image URL. | [optional] 
**media_id** | **str** |  | 
**index** | **int** |  | [optional] 
**items** | [**List[PinMediaSourceImagesURLItem]**](PinMediaSourceImagesURLItem.md) | Array with image objects. | 
**is_affiliate_link** | **bool** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to False]

## Example

```python
from openapi_client.models.pin_media_source import PinMediaSource

# TODO update the JSON string below
json = "{}"
# create an instance of PinMediaSource from a JSON string
pin_media_source_instance = PinMediaSource.from_json(json)
# print the JSON string representation of the object
print PinMediaSource.to_json()

# convert the object into a dict
pin_media_source_dict = pin_media_source_instance.to_dict()
# create an instance of PinMediaSource from a dict
pin_media_source_from_dict = PinMediaSource.from_dict(pin_media_source_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


