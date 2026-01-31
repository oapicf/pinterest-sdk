# SystemUserUpdateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | New system user name | 

## Example

```python
from pinterestsdk.models.system_user_update_request import SystemUserUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SystemUserUpdateRequest from a JSON string
system_user_update_request_instance = SystemUserUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(SystemUserUpdateRequest.to_json())

# convert the object into a dict
system_user_update_request_dict = system_user_update_request_instance.to_dict()
# create an instance of SystemUserUpdateRequest from a dict
system_user_update_request_from_dict = SystemUserUpdateRequest.from_dict(system_user_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


