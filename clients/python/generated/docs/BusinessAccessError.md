# BusinessAccessError


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **int** |  | 
**message** | **str** |  | 

## Example

```python
from pinterestsdk.models.business_access_error import BusinessAccessError

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessAccessError from a JSON string
business_access_error_instance = BusinessAccessError.from_json(json)
# print the JSON string representation of the object
print(BusinessAccessError.to_json())

# convert the object into a dict
business_access_error_dict = business_access_error_instance.to_dict()
# create an instance of BusinessAccessError from a dict
business_access_error_from_dict = BusinessAccessError.from_dict(business_access_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


