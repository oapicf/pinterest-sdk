# MembersToDeleteBodyMembersInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_role** | [**BusinessRoleForMembers**](BusinessRoleForMembers.md) |  | 
**member_id** | **str** | Unique identifier of the member | 

## Example

```python
from pinterestsdk.models.members_to_delete_body_members_inner import MembersToDeleteBodyMembersInner

# TODO update the JSON string below
json = "{}"
# create an instance of MembersToDeleteBodyMembersInner from a JSON string
members_to_delete_body_members_inner_instance = MembersToDeleteBodyMembersInner.from_json(json)
# print the JSON string representation of the object
print(MembersToDeleteBodyMembersInner.to_json())

# convert the object into a dict
members_to_delete_body_members_inner_dict = members_to_delete_body_members_inner_instance.to_dict()
# create an instance of MembersToDeleteBodyMembersInner from a dict
members_to_delete_body_members_inner_from_dict = MembersToDeleteBodyMembersInner.from_dict(members_to_delete_body_members_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


