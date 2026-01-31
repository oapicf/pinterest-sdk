# PinMediaSourceVideoID

Video ID-based media source.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cover_image_content_type** | [**ContentType**](ContentType.md) | Content type for cover image Base64. | [optional] 
**cover_image_data** | **str** | Cover image Base64. | [optional] 
**cover_image_key_frame_time** | **int** | Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. | [optional] 
**cover_image_url** | **str** | Cover image URL. | [optional] 
**is_standard** | **bool** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to True]
**media_id** | **str** |  | 
**source_type** | **str** |  | 

## Example

```python
from pinterestsdk.models.pin_media_source_video_id import PinMediaSourceVideoID

# TODO update the JSON string below
json = "{}"
# create an instance of PinMediaSourceVideoID from a JSON string
pin_media_source_video_id_instance = PinMediaSourceVideoID.from_json(json)
# print the JSON string representation of the object
print(PinMediaSourceVideoID.to_json())

# convert the object into a dict
pin_media_source_video_id_dict = pin_media_source_video_id_instance.to_dict()
# create an instance of PinMediaSourceVideoID from a dict
pin_media_source_video_id_from_dict = PinMediaSourceVideoID.from_dict(pin_media_source_video_id_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


