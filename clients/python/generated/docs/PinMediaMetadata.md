# PinMediaMetadata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**images** | [**ImageSize**](ImageSize.md) |  | [optional] 
**item_type** | **str** |  | [optional] 
**link** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**cover_image_url** | **str** |  | [optional] 
**duration** | **float** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] 
**height** | **int** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**video_url** | **str** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] 
**width** | **int** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] 

## Example

```python
from pinterestsdk.models.pin_media_metadata import PinMediaMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of PinMediaMetadata from a JSON string
pin_media_metadata_instance = PinMediaMetadata.from_json(json)
# print the JSON string representation of the object
print(PinMediaMetadata.to_json())

# convert the object into a dict
pin_media_metadata_dict = pin_media_metadata_instance.to_dict()
# create an instance of PinMediaMetadata from a dict
pin_media_metadata_from_dict = PinMediaMetadata.from_dict(pin_media_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


