# PinMediaSourceImagesBase64Item


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | [**ContentType**](ContentType.md) |  | 
**data** | **str** |  | 
**description** | **str** |  | [optional] 
**link** | **str** |  | [optional] 
**title** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.pin_media_source_images_base64_item import PinMediaSourceImagesBase64Item

# TODO update the JSON string below
json = "{}"
# create an instance of PinMediaSourceImagesBase64Item from a JSON string
pin_media_source_images_base64_item_instance = PinMediaSourceImagesBase64Item.from_json(json)
# print the JSON string representation of the object
print PinMediaSourceImagesBase64Item.to_json()

# convert the object into a dict
pin_media_source_images_base64_item_dict = pin_media_source_images_base64_item_instance.to_dict()
# create an instance of PinMediaSourceImagesBase64Item from a dict
pin_media_source_images_base64_item_from_dict = PinMediaSourceImagesBase64Item.from_dict(pin_media_source_images_base64_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


