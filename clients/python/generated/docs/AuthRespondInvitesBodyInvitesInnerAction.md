# AuthRespondInvitesBodyInvitesInnerAction


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accept_invite** | **bool** | Whether the invite/request is accepted. | 
**asset_id_to_permissions** | **Dict[str, List[Permissions]]** | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  | [optional] 

## Example

```python
from pinterestsdk.models.auth_respond_invites_body_invites_inner_action import AuthRespondInvitesBodyInvitesInnerAction

# TODO update the JSON string below
json = "{}"
# create an instance of AuthRespondInvitesBodyInvitesInnerAction from a JSON string
auth_respond_invites_body_invites_inner_action_instance = AuthRespondInvitesBodyInvitesInnerAction.from_json(json)
# print the JSON string representation of the object
print(AuthRespondInvitesBodyInvitesInnerAction.to_json())

# convert the object into a dict
auth_respond_invites_body_invites_inner_action_dict = auth_respond_invites_body_invites_inner_action_instance.to_dict()
# create an instance of AuthRespondInvitesBodyInvitesInnerAction from a dict
auth_respond_invites_body_invites_inner_action_from_dict = AuthRespondInvitesBodyInvitesInnerAction.from_dict(auth_respond_invites_body_invites_inner_action_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


