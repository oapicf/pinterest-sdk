# PinMediaWithImages

Pin with multiple images.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[ImageMetadata]**](ImageMetadata.md) |  | [optional] 
**media_type** | **str** |  | 

## Example

```python
from pinterestsdk.models.pin_media_with_images import PinMediaWithImages

# TODO update the JSON string below
json = "{}"
# create an instance of PinMediaWithImages from a JSON string
pin_media_with_images_instance = PinMediaWithImages.from_json(json)
# print the JSON string representation of the object
print(PinMediaWithImages.to_json())

# convert the object into a dict
pin_media_with_images_dict = pin_media_with_images_instance.to_dict()
# create an instance of PinMediaWithImages from a dict
pin_media_with_images_from_dict = PinMediaWithImages.from_dict(pin_media_with_images_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


