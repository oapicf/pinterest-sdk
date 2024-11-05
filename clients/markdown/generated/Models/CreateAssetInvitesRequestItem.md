# CreateAssetInvitesRequestItem
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **invite\_id** | **String** | Unique identifier of an invite. | [default to null] |
| **invite\_type** | [**InviteType**](InviteType.md) |  | [default to null] |
| **asset\_id\_to\_permissions** | [**Map**](array.md) | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

