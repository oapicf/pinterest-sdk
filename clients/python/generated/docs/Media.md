# Media


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**media_id** | **str** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | [readonly] 
**media_type** | [**MediaUploadType**](MediaUploadType.md) |  | 
**status** | [**MediaUploadStatus**](MediaUploadStatus.md) |  | [optional] [readonly] 

## Example

```python
from pinterestsdk.models.media import Media

# TODO update the JSON string below
json = "{}"
# create an instance of Media from a JSON string
media_instance = Media.from_json(json)
# print the JSON string representation of the object
print(Media.to_json())

# convert the object into a dict
media_dict = media_instance.to_dict()
# create an instance of Media from a dict
media_from_dict = Media.from_dict(media_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


