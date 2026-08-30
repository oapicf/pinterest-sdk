# InviteBusinessRoleBinding

An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_by_business_id** | **str** | Unique identifier for the business that created the invite/request. | [optional] 
**created_by_user_id** | **str** | Unique identifier for the user that created the invite/request. | [optional] 
**id** | **str** | Unique identifier of the invite/request. | [optional] 
**invite_data** | [**InviteDataResponse**](InviteDataResponse.md) |  | [optional] 
**is_received_invite** | **bool** | Indicates whether the invite/request was received. | [optional] 
**user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] 

## Example

```python
from openapi_client.models.invite_business_role_binding import InviteBusinessRoleBinding

# TODO update the JSON string below
json = "{}"
# create an instance of InviteBusinessRoleBinding from a JSON string
invite_business_role_binding_instance = InviteBusinessRoleBinding.from_json(json)
# print the JSON string representation of the object
print InviteBusinessRoleBinding.to_json()

# convert the object into a dict
invite_business_role_binding_dict = invite_business_role_binding_instance.to_dict()
# create an instance of InviteBusinessRoleBinding from a dict
invite_business_role_binding_from_dict = InviteBusinessRoleBinding.from_dict(invite_business_role_binding_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


