# PinMediaWithVideo

Pin with video.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cover_image_url** | **str** |  | [optional] 
**duration** | **float** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] 
**height** | **int** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**images** | [**ImageSize**](ImageSize.md) |  | [optional] 
**media_type** | **str** |  | 
**video_url** | **str** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] 
**width** | **int** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] 

## Example

```python
from pinterestsdk.models.pin_media_with_video import PinMediaWithVideo

# TODO update the JSON string below
json = "{}"
# create an instance of PinMediaWithVideo from a JSON string
pin_media_with_video_instance = PinMediaWithVideo.from_json(json)
# print the JSON string representation of the object
print(PinMediaWithVideo.to_json())

# convert the object into a dict
pin_media_with_video_dict = pin_media_with_video_instance.to_dict()
# create an instance of PinMediaWithVideo from a dict
pin_media_with_video_from_dict = PinMediaWithVideo.from_dict(pin_media_with_video_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


