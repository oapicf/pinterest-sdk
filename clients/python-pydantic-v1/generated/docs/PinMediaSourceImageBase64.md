# PinMediaSourceImageBase64

Image Base64-based media source.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | [**ContentType**](ContentType.md) |  | 
**data** | **str** |  | 
**is_standard** | **bool** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to True]
**source_type** | **str** | The source type of the media. | 

## Example

```python
from openapi_client.models.pin_media_source_image_base64 import PinMediaSourceImageBase64

# TODO update the JSON string below
json = "{}"
# create an instance of PinMediaSourceImageBase64 from a JSON string
pin_media_source_image_base64_instance = PinMediaSourceImageBase64.from_json(json)
# print the JSON string representation of the object
print PinMediaSourceImageBase64.to_json()

# convert the object into a dict
pin_media_source_image_base64_dict = pin_media_source_image_base64_instance.to_dict()
# create an instance of PinMediaSourceImageBase64 from a dict
pin_media_source_image_base64_from_dict = PinMediaSourceImageBase64.from_dict(pin_media_source_image_base64_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


