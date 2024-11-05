# openapi::CreateAssetInvitesRequestItem

Object declaring an asset role update to an invite.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invite_id** | **character** | Unique identifier of an invite. | [Pattern: ^\\d+$] 
**invite_type** | [**InviteType**](InviteType.md) |  | [Enum: ] 
**asset_id_to_permissions** | [**map(array[Permissions])**](array.md) | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  | [Min. items: 1] 


