# # CreateAssetInvitesRequestItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invite_id** | **string** | Unique identifier of an invite. |
**invite_type** | [**\OpenAPI\Client\Model\InviteType**](InviteType.md) |  |
**asset_id_to_permissions** | **array<string,\OpenAPI\Client\Model\Permissions[]>** | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
