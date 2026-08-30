# AuthRespondInvitesBody

An object with a list of all the invites the user would like to respond to and the action to take.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invites** | [**List[AuthRespondInvitesBodyItem]**](AuthRespondInvitesBodyItem.md) |  | 

## Example

```python
from openapi_client.models.auth_respond_invites_body import AuthRespondInvitesBody

# TODO update the JSON string below
json = "{}"
# create an instance of AuthRespondInvitesBody from a JSON string
auth_respond_invites_body_instance = AuthRespondInvitesBody.from_json(json)
# print the JSON string representation of the object
print AuthRespondInvitesBody.to_json()

# convert the object into a dict
auth_respond_invites_body_dict = auth_respond_invites_body_instance.to_dict()
# create an instance of AuthRespondInvitesBody from a dict
auth_respond_invites_body_from_dict = AuthRespondInvitesBody.from_dict(auth_respond_invites_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


