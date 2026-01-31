# PinMediaWithVideos

Pin with multiple videos.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[VideoMetadataWithItemType]**](VideoMetadataWithItemType.md) |  | [optional] 
**media_type** | **str** |  | 

## Example

```python
from pinterestsdk.models.pin_media_with_videos import PinMediaWithVideos

# TODO update the JSON string below
json = "{}"
# create an instance of PinMediaWithVideos from a JSON string
pin_media_with_videos_instance = PinMediaWithVideos.from_json(json)
# print the JSON string representation of the object
print(PinMediaWithVideos.to_json())

# convert the object into a dict
pin_media_with_videos_dict = pin_media_with_videos_instance.to_dict()
# create an instance of PinMediaWithVideos from a dict
pin_media_with_videos_from_dict = PinMediaWithVideos.from_dict(pin_media_with_videos_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


