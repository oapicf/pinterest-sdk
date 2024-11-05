

# CreateAssetInvitesRequestItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inviteId** | **String** | Unique identifier of an invite. | 
**inviteType** | [**InviteType**](InviteType.md) |  | 
**assetIdToPermissions** | [**Map&lt;String, List&lt;Permissions&gt;&gt;**](List.md) | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  | 




