# UpdateMemberAssetAccessBodyAccessesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **string** | Id of the asset to update. | [default to undefined]
**member_id** | **string** | Unique identifier of the member on which to perform the update | [default to undefined]
**permissions** | [**Array&lt;Permissions&gt;**](Permissions.md) | A non-empty array of permissions to assign to the member. | [default to undefined]

## Example

```typescript
import { UpdateMemberAssetAccessBodyAccessesInner } from './api';

const instance: UpdateMemberAssetAccessBodyAccessesInner = {
    asset_id,
    member_id,
    permissions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
