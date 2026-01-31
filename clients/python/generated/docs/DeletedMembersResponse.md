# DeletedMembersResponse

An object with a list of members that were deleted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleted_members** | **List[str]** | List of members whose business membership have been terminated. | [optional] 

## Example

```python
from pinterestsdk.models.deleted_members_response import DeletedMembersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeletedMembersResponse from a JSON string
deleted_members_response_instance = DeletedMembersResponse.from_json(json)
# print the JSON string representation of the object
print(DeletedMembersResponse.to_json())

# convert the object into a dict
deleted_members_response_dict = deleted_members_response_instance.to_dict()
# create an instance of DeletedMembersResponse from a dict
deleted_members_response_from_dict = DeletedMembersResponse.from_dict(deleted_members_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


