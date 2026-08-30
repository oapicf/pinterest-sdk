# UpdateBusinessMembershipsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[BusinessMembershipMember]**](BusinessMembershipMember.md) | List of members with updated business access role. | [optional] 

## Example

```python
from pinterestsdk.models.update_business_memberships_response import UpdateBusinessMembershipsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateBusinessMembershipsResponse from a JSON string
update_business_memberships_response_instance = UpdateBusinessMembershipsResponse.from_json(json)
# print the JSON string representation of the object
print(UpdateBusinessMembershipsResponse.to_json())

# convert the object into a dict
update_business_memberships_response_dict = update_business_memberships_response_instance.to_dict()
# create an instance of UpdateBusinessMembershipsResponse from a dict
update_business_memberships_response_from_dict = UpdateBusinessMembershipsResponse.from_dict(update_business_memberships_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


