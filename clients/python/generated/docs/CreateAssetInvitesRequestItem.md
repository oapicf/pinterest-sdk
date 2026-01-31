# CreateAssetInvitesRequestItem

Object declaring an asset role update to an invite.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id_to_permissions** | **Dict[str, List[Permissions]]** | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  | 
**invite_id** | **str** | Unique identifier of an invite. | 
**invite_type** | [**InviteType**](InviteType.md) |  | 

## Example

```python
from pinterestsdk.models.create_asset_invites_request_item import CreateAssetInvitesRequestItem

# TODO update the JSON string below
json = "{}"
# create an instance of CreateAssetInvitesRequestItem from a JSON string
create_asset_invites_request_item_instance = CreateAssetInvitesRequestItem.from_json(json)
# print the JSON string representation of the object
print(CreateAssetInvitesRequestItem.to_json())

# convert the object into a dict
create_asset_invites_request_item_dict = create_asset_invites_request_item_instance.to_dict()
# create an instance of CreateAssetInvitesRequestItem from a dict
create_asset_invites_request_item_from_dict = CreateAssetInvitesRequestItem.from_dict(create_asset_invites_request_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


