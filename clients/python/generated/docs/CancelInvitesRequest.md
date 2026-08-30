# CancelInvitesRequest

An object with the list of invite/request ids to cancel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invite_ids** | **List[str]** | A list of invite/request ids to cancel. | 

## Example

```python
from pinterestsdk.models.cancel_invites_request import CancelInvitesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CancelInvitesRequest from a JSON string
cancel_invites_request_instance = CancelInvitesRequest.from_json(json)
# print the JSON string representation of the object
print(CancelInvitesRequest.to_json())

# convert the object into a dict
cancel_invites_request_dict = cancel_invites_request_instance.to_dict()
# create an instance of CancelInvitesRequest from a dict
cancel_invites_request_from_dict = CancelInvitesRequest.from_dict(cancel_invites_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


