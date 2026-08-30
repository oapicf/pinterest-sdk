# PinMediaWithImage

Pin with image.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**images** | [**ImageSize**](ImageSize.md) |  | [optional] 
**media_type** | **str** |  | 

## Example

```python
from openapi_client.models.pin_media_with_image import PinMediaWithImage

# TODO update the JSON string below
json = "{}"
# create an instance of PinMediaWithImage from a JSON string
pin_media_with_image_instance = PinMediaWithImage.from_json(json)
# print the JSON string representation of the object
print PinMediaWithImage.to_json()

# convert the object into a dict
pin_media_with_image_dict = pin_media_with_image_instance.to_dict()
# create an instance of PinMediaWithImage from a dict
pin_media_with_image_from_dict = PinMediaWithImage.from_dict(pin_media_with_image_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


