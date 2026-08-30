# SystemUserUpdateWithRequiredBody

Resource create or update operation model with required body fields (no OptionalProperties).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | New system user name | 

## Example

```python
from openapi_client.models.system_user_update_with_required_body import SystemUserUpdateWithRequiredBody

# TODO update the JSON string below
json = "{}"
# create an instance of SystemUserUpdateWithRequiredBody from a JSON string
system_user_update_with_required_body_instance = SystemUserUpdateWithRequiredBody.from_json(json)
# print the JSON string representation of the object
print SystemUserUpdateWithRequiredBody.to_json()

# convert the object into a dict
system_user_update_with_required_body_dict = system_user_update_with_required_body_instance.to_dict()
# create an instance of SystemUserUpdateWithRequiredBody from a dict
system_user_update_with_required_body_from_dict = SystemUserUpdateWithRequiredBody.from_dict(system_user_update_with_required_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


