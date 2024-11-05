# Org.OpenAPITools.Model.CreateAssetInvitesRequestItem
Object declaring an asset role update to an invite.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InviteId** | **string** | Unique identifier of an invite. | 
**InviteType** | **InviteType** |  | 
**AssetIdToPermissions** | **Dictionary&lt;string, List&lt;Permissions&gt;&gt;** | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

