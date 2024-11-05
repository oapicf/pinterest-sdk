
# CreateAssetInvitesRequestItem

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **inviteId** | **kotlin.String** | Unique identifier of an invite. |  |
| **inviteType** | [**InviteType**](InviteType.md) |  |  |
| **assetIdToPermissions** | **kotlin.collections.Map&lt;kotlin.String, kotlin.collections.List&lt;Permissions&gt;&gt;** | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  |  |



