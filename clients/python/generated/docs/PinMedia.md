# PinMedia

Pin media that can be an image, video, or a mix of both.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**images** | [**ImageSize**](ImageSize.md) |  | [optional] 
**media_type** | **str** |  | 
**cover_image_url** | **str** |  | [optional] 
**duration** | **float** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] 
**height** | **int** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**video_url** | **str** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] 
**width** | **int** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**items** | [**List[PinMediaMetadata]**](PinMediaMetadata.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.pin_media import PinMedia

# TODO update the JSON string below
json = "{}"
# create an instance of PinMedia from a JSON string
pin_media_instance = PinMedia.from_json(json)
# print the JSON string representation of the object
print(PinMedia.to_json())

# convert the object into a dict
pin_media_dict = pin_media_instance.to_dict()
# create an instance of PinMedia from a dict
pin_media_from_dict = PinMedia.from_dict(pin_media_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


