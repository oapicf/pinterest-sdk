# AuthRespondInvitesBodyInvitesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**AuthRespondInvitesBodyInvitesInnerAction**](AuthRespondInvitesBodyInvitesInnerAction.md) |  | 
**invite_id** | **str** | Unique identifier of an invite. | 

## Example

```python
from pinterestsdk.models.auth_respond_invites_body_invites_inner import AuthRespondInvitesBodyInvitesInner

# TODO update the JSON string below
json = "{}"
# create an instance of AuthRespondInvitesBodyInvitesInner from a JSON string
auth_respond_invites_body_invites_inner_instance = AuthRespondInvitesBodyInvitesInner.from_json(json)
# print the JSON string representation of the object
print(AuthRespondInvitesBodyInvitesInner.to_json())

# convert the object into a dict
auth_respond_invites_body_invites_inner_dict = auth_respond_invites_body_invites_inner_instance.to_dict()
# create an instance of AuthRespondInvitesBodyInvitesInner from a dict
auth_respond_invites_body_invites_inner_from_dict = AuthRespondInvitesBodyInvitesInner.from_dict(auth_respond_invites_body_invites_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


