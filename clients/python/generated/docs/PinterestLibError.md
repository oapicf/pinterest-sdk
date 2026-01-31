# PinterestLibError

Default error response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **int** |  | 
**message** | **str** |  | 

## Example

```python
from pinterestsdk.models.pinterest_lib_error import PinterestLibError

# TODO update the JSON string below
json = "{}"
# create an instance of PinterestLibError from a JSON string
pinterest_lib_error_instance = PinterestLibError.from_json(json)
# print the JSON string representation of the object
print(PinterestLibError.to_json())

# convert the object into a dict
pinterest_lib_error_dict = pinterest_lib_error_instance.to_dict()
# create an instance of PinterestLibError from a dict
pinterest_lib_error_from_dict = PinterestLibError.from_dict(pinterest_lib_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


