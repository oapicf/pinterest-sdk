# DetailedError

Used for including extra details to a base error

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **int** |  | 
**details** | **object** |  | 
**message** | **str** |  | 

## Example

```python
from openapi_client.models.detailed_error import DetailedError

# TODO update the JSON string below
json = "{}"
# create an instance of DetailedError from a JSON string
detailed_error_instance = DetailedError.from_json(json)
# print the JSON string representation of the object
print DetailedError.to_json()

# convert the object into a dict
detailed_error_dict = detailed_error_instance.to_dict()
# create an instance of DetailedError from a dict
detailed_error_from_dict = DetailedError.from_dict(detailed_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


