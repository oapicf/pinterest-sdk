# AuthRespondInvitesBodyItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**AuthRespondInviteAction**](AuthRespondInviteAction.md) |  | 
**invite_id** | **str** | Unique identifier of an invite. | 

## Example

```python
from openapi_client.models.auth_respond_invites_body_item import AuthRespondInvitesBodyItem

# TODO update the JSON string below
json = "{}"
# create an instance of AuthRespondInvitesBodyItem from a JSON string
auth_respond_invites_body_item_instance = AuthRespondInvitesBodyItem.from_json(json)
# print the JSON string representation of the object
print AuthRespondInvitesBodyItem.to_json()

# convert the object into a dict
auth_respond_invites_body_item_dict = auth_respond_invites_body_item_instance.to_dict()
# create an instance of AuthRespondInvitesBodyItem from a dict
auth_respond_invites_body_item_from_dict = AuthRespondInvitesBodyItem.from_dict(auth_respond_invites_body_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


