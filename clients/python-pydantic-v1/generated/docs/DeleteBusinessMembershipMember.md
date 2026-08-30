# DeleteBusinessMembershipMember

Single instance of a business member to be removed from the business.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_role** | [**BusinessRoleForMembers**](BusinessRoleForMembers.md) |  | 
**member_id** | **str** | Unique identifier of the member | 

## Example

```python
from openapi_client.models.delete_business_membership_member import DeleteBusinessMembershipMember

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteBusinessMembershipMember from a JSON string
delete_business_membership_member_instance = DeleteBusinessMembershipMember.from_json(json)
# print the JSON string representation of the object
print DeleteBusinessMembershipMember.to_json()

# convert the object into a dict
delete_business_membership_member_dict = delete_business_membership_member_instance.to_dict()
# create an instance of DeleteBusinessMembershipMember from a dict
delete_business_membership_member_from_dict = DeleteBusinessMembershipMember.from_dict(delete_business_membership_member_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


