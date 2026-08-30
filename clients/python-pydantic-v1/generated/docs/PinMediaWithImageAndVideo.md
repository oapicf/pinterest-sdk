# PinMediaWithImageAndVideo

Pin with a mix of images and videos.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[PinMediaMetadata]**](PinMediaMetadata.md) |  | [optional] 
**media_type** | **str** |  | 

## Example

```python
from openapi_client.models.pin_media_with_image_and_video import PinMediaWithImageAndVideo

# TODO update the JSON string below
json = "{}"
# create an instance of PinMediaWithImageAndVideo from a JSON string
pin_media_with_image_and_video_instance = PinMediaWithImageAndVideo.from_json(json)
# print the JSON string representation of the object
print PinMediaWithImageAndVideo.to_json()

# convert the object into a dict
pin_media_with_image_and_video_dict = pin_media_with_image_and_video_instance.to_dict()
# create an instance of PinMediaWithImageAndVideo from a dict
pin_media_with_image_and_video_from_dict = PinMediaWithImageAndVideo.from_dict(pin_media_with_image_and_video_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


