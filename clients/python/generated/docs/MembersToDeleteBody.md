# MembersToDeleteBody


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**members** | [**List[MembersToDeleteBodyMembersInner]**](MembersToDeleteBodyMembersInner.md) |  | 

## Example

```python
from pinterestsdk.models.members_to_delete_body import MembersToDeleteBody

# TODO update the JSON string below
json = "{}"
# create an instance of MembersToDeleteBody from a JSON string
members_to_delete_body_instance = MembersToDeleteBody.from_json(json)
# print the JSON string representation of the object
print(MembersToDeleteBody.to_json())

# convert the object into a dict
members_to_delete_body_dict = members_to_delete_body_instance.to_dict()
# create an instance of MembersToDeleteBody from a dict
members_to_delete_body_from_dict = MembersToDeleteBody.from_dict(members_to_delete_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


