# DeleteBusinessMembershipBody

List of members with role to delete.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**members** | [**List[DeleteBusinessMembershipMember]**](DeleteBusinessMembershipMember.md) |  | 

## Example

```python
from pinterestsdk.models.delete_business_membership_body import DeleteBusinessMembershipBody

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteBusinessMembershipBody from a JSON string
delete_business_membership_body_instance = DeleteBusinessMembershipBody.from_json(json)
# print the JSON string representation of the object
print(DeleteBusinessMembershipBody.to_json())

# convert the object into a dict
delete_business_membership_body_dict = delete_business_membership_body_instance.to_dict()
# create an instance of DeleteBusinessMembershipBody from a dict
delete_business_membership_body_from_dict = DeleteBusinessMembershipBody.from_dict(delete_business_membership_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


