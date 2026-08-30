# MediaUploadCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**media_type** | [**MediaUploadType**](MediaUploadType.md) |  | 

## Example

```python
from openapi_client.models.media_upload_create import MediaUploadCreate

# TODO update the JSON string below
json = "{}"
# create an instance of MediaUploadCreate from a JSON string
media_upload_create_instance = MediaUploadCreate.from_json(json)
# print the JSON string representation of the object
print MediaUploadCreate.to_json()

# convert the object into a dict
media_upload_create_dict = media_upload_create_instance.to_dict()
# create an instance of MediaUploadCreate from a dict
media_upload_create_from_dict = MediaUploadCreate.from_dict(media_upload_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


