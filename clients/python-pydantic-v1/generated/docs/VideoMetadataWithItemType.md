# VideoMetadataWithItemType


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cover_image_url** | **str** |  | [optional] 
**duration** | **float** | Duration (in miliseconds). Field maybe null after creation due to video processing time. | [optional] 
**height** | **int** | Height (in pixels). Field maybe null after creation due to video processing time. | [optional] 
**item_type** | **str** | Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload. | 
**video_url** | **str** | Video url (720p).  **Note:** This field is limited and not available to all apps. | [optional] 
**video_url_hls** | **str** | Video url (HLS).  **Note:** This field is limited and not available to all apps. | [optional] 
**width** | **int** | Width (in pixels). Field maybe null after creation due to video processing time. | [optional] 

## Example

```python
from openapi_client.models.video_metadata_with_item_type import VideoMetadataWithItemType

# TODO update the JSON string below
json = "{}"
# create an instance of VideoMetadataWithItemType from a JSON string
video_metadata_with_item_type_instance = VideoMetadataWithItemType.from_json(json)
# print the JSON string representation of the object
print VideoMetadataWithItemType.to_json()

# convert the object into a dict
video_metadata_with_item_type_dict = video_metadata_with_item_type_instance.to_dict()
# create an instance of VideoMetadataWithItemType from a dict
video_metadata_with_item_type_from_dict = VideoMetadataWithItemType.from_dict(video_metadata_with_item_type_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


