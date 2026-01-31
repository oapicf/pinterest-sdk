# CancelInvitesBody

Request body used to cancel invites

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invite_ids** | **List[str]** | List of invite/request ids to be cancelled | 

## Example

```python
from pinterestsdk.models.cancel_invites_body import CancelInvitesBody

# TODO update the JSON string below
json = "{}"
# create an instance of CancelInvitesBody from a JSON string
cancel_invites_body_instance = CancelInvitesBody.from_json(json)
# print the JSON string representation of the object
print(CancelInvitesBody.to_json())

# convert the object into a dict
cancel_invites_body_dict = cancel_invites_body_instance.to_dict()
# create an instance of CancelInvitesBody from a dict
cancel_invites_body_from_dict = CancelInvitesBody.from_dict(cancel_invites_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


