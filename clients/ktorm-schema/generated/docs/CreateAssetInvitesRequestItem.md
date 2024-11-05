
# Table `CreateAssetInvitesRequestItem`
(mapped from: CreateAssetInvitesRequestItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**inviteId** | invite_id | text NOT NULL |  | **kotlin.String** | Unique identifier of an invite. | 
**inviteType** | invite_type | long NOT NULL |  | [**InviteType**](InviteType.md) |  |  [foreignkey]
**assetIdToPermissions** | asset_id_to_permissions | blob NOT NULL |  | **kotlin.collections.Map&lt;kotlin.String, kotlin.Array&lt;Permissions&gt;&gt;** | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  | 





