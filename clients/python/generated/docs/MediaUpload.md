# MediaUpload

Media upload that has been registered but not uploaded/processed yet.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**media_id** | **str** | Unique identifier for this media upload. Used to track status and for attaching during Pin creation. | [readonly] 
**media_type** | [**MediaUploadType**](MediaUploadType.md) |  | 
**upload_parameters** | [**MediaUploadParameters**](MediaUploadParameters.md) | The list of parameter key/value pairs you will need to send with your POST request to upload your media file. | [optional] [readonly] 
**upload_url** | **str** | The URL where you will POST your media file. | [optional] [readonly] 

## Example

```python
from pinterestsdk.models.media_upload import MediaUpload

# TODO update the JSON string below
json = "{}"
# create an instance of MediaUpload from a JSON string
media_upload_instance = MediaUpload.from_json(json)
# print the JSON string representation of the object
print(MediaUpload.to_json())

# convert the object into a dict
media_upload_dict = media_upload_instance.to_dict()
# create an instance of MediaUpload from a dict
media_upload_from_dict = MediaUpload.from_dict(media_upload_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


