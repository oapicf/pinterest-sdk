# BusinessMembershipMember

A business member identified by `member_id` with their `business_role` in the business.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_role** | [**BusinessRoleForMembers**](BusinessRoleForMembers.md) |  | 
**member_id** | **str** | Unique identifier of the member. | 

## Example

```python
from pinterestsdk.models.business_membership_member import BusinessMembershipMember

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessMembershipMember from a JSON string
business_membership_member_instance = BusinessMembershipMember.from_json(json)
# print the JSON string representation of the object
print(BusinessMembershipMember.to_json())

# convert the object into a dict
business_membership_member_dict = business_membership_member_instance.to_dict()
# create an instance of BusinessMembershipMember from a dict
business_membership_member_from_dict = BusinessMembershipMember.from_dict(business_membership_member_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


