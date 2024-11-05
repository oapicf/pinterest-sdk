

# CreateAssetInvitesRequestItem

Object declaring an asset role update to an invite.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inviteId** | **String** | Unique identifier of an invite. | 
**inviteType** | **InviteType** |  | 
**assetIdToPermissions** | **Map&lt;String, Seq[Permissions]&gt;** | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  | 



