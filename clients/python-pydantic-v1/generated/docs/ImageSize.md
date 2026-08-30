# ImageSize


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_1200x** | [**ImageDetails**](ImageDetails.md) |  | [optional] 
**var_150x150** | [**ImageDetails**](ImageDetails.md) |  | [optional] 
**var_400x300** | [**ImageDetails**](ImageDetails.md) |  | [optional] 
**var_600x** | [**ImageDetails**](ImageDetails.md) |  | [optional] 

## Example

```python
from openapi_client.models.image_size import ImageSize

# TODO update the JSON string below
json = "{}"
# create an instance of ImageSize from a JSON string
image_size_instance = ImageSize.from_json(json)
# print the JSON string representation of the object
print ImageSize.to_json()

# convert the object into a dict
image_size_dict = image_size_instance.to_dict()
# create an instance of ImageSize from a dict
image_size_from_dict = ImageSize.from_dict(image_size_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


