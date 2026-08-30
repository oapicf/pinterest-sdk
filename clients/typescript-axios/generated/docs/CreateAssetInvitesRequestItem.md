# CreateAssetInvitesRequestItem

Object declaring an asset role update to an invite.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id_to_permissions** | **{ [key: string]: Array&lt;Permissions&gt;; }** | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. | [default to undefined]
**invite_id** | **string** | Unique identifier of an invite. | [default to undefined]
**invite_type** | [**InviteType**](InviteType.md) |  | [default to undefined]

## Example

```typescript
import { CreateAssetInvitesRequestItem } from './api';

const instance: CreateAssetInvitesRequestItem = {
    asset_id_to_permissions,
    invite_id,
    invite_type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
