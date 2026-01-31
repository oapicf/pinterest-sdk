# ImageBase64

Base64-encoded image media source

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | **str** |  | 
**data** | **str** |  | 

## Example

```python
from pinterestsdk.models.image_base64 import ImageBase64

# TODO update the JSON string below
json = "{}"
# create an instance of ImageBase64 from a JSON string
image_base64_instance = ImageBase64.from_json(json)
# print the JSON string representation of the object
print(ImageBase64.to_json())

# convert the object into a dict
image_base64_dict = image_base64_instance.to_dict()
# create an instance of ImageBase64 from a dict
image_base64_from_dict = ImageBase64.from_dict(image_base64_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


