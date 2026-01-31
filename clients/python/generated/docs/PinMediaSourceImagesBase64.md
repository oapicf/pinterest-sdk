# PinMediaSourceImagesBase64

Multiple Base64-based images media source

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** |  | [optional] 
**items** | [**List[PinMediaSourceImagesBase64Item]**](PinMediaSourceImagesBase64Item.md) | Array with image objects. | 
**source_type** | **str** | The source type of the media. | 

## Example

```python
from pinterestsdk.models.pin_media_source_images_base64 import PinMediaSourceImagesBase64

# TODO update the JSON string below
json = "{}"
# create an instance of PinMediaSourceImagesBase64 from a JSON string
pin_media_source_images_base64_instance = PinMediaSourceImagesBase64.from_json(json)
# print the JSON string representation of the object
print(PinMediaSourceImagesBase64.to_json())

# convert the object into a dict
pin_media_source_images_base64_dict = pin_media_source_images_base64_instance.to_dict()
# create an instance of PinMediaSourceImagesBase64 from a dict
pin_media_source_images_base64_from_dict = PinMediaSourceImagesBase64.from_dict(pin_media_source_images_base64_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


