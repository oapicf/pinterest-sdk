# UpdateMemberBusinessRoleBody

Single instance of a business member to have its role updated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_role** | [**BusinessRoleForMembers**](BusinessRoleForMembers.md) |  | 
**member_id** | **str** | Unique identifier of the member | 

## Example

```python
from pinterestsdk.models.update_member_business_role_body import UpdateMemberBusinessRoleBody

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateMemberBusinessRoleBody from a JSON string
update_member_business_role_body_instance = UpdateMemberBusinessRoleBody.from_json(json)
# print the JSON string representation of the object
print(UpdateMemberBusinessRoleBody.to_json())

# convert the object into a dict
update_member_business_role_body_dict = update_member_business_role_body_instance.to_dict()
# create an instance of UpdateMemberBusinessRoleBody from a dict
update_member_business_role_body_from_dict = UpdateMemberBusinessRoleBody.from_dict(update_member_business_role_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


