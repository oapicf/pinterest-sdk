# CancelInvitesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[CancelInviteResultItem]**](CancelInviteResultItem.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.cancel_invites_response import CancelInvitesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CancelInvitesResponse from a JSON string
cancel_invites_response_instance = CancelInvitesResponse.from_json(json)
# print the JSON string representation of the object
print(CancelInvitesResponse.to_json())

# convert the object into a dict
cancel_invites_response_dict = cancel_invites_response_instance.to_dict()
# create an instance of CancelInvitesResponse from a dict
cancel_invites_response_from_dict = CancelInvitesResponse.from_dict(cancel_invites_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


