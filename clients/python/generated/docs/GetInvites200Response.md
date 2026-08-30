# GetInvites200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[InviteResponse]**](InviteResponse.md) |  | 

## Example

```python
from pinterestsdk.models.get_invites200_response import GetInvites200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GetInvites200Response from a JSON string
get_invites200_response_instance = GetInvites200Response.from_json(json)
# print the JSON string representation of the object
print(GetInvites200Response.to_json())

# convert the object into a dict
get_invites200_response_dict = get_invites200_response_instance.to_dict()
# create an instance of GetInvites200Response from a dict
get_invites200_response_from_dict = GetInvites200Response.from_dict(get_invites200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


