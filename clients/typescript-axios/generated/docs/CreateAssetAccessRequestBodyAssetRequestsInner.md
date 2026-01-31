# CreateAssetAccessRequestBodyAssetRequestsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id_to_permissions** | **{ [key: string]: Array&lt;Permissions&gt;; }** | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  | [default to undefined]
**partner_id** | **string** | Unique identifier of a business partner to request asset access to. | [default to undefined]

## Example

```typescript
import { CreateAssetAccessRequestBodyAssetRequestsInner } from './api';

const instance: CreateAssetAccessRequestBodyAssetRequestsInner = {
    asset_id_to_permissions,
    partner_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
