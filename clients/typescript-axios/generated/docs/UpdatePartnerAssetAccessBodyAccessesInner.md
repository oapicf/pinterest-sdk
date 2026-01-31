# UpdatePartnerAssetAccessBodyAccessesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**partner_id** | **string** | Unique identifier of a business partner to update asset access to. | [default to undefined]
**asset_id** | **string** | Unique identifier of the business asset. | [default to undefined]
**permissions** | [**Array&lt;Permissions&gt;**](Permissions.md) | A non-empty array of permissions to assign to the partner. | [default to undefined]

## Example

```typescript
import { UpdatePartnerAssetAccessBodyAccessesInner } from './api';

const instance: UpdatePartnerAssetAccessBodyAccessesInner = {
    partner_id,
    asset_id,
    permissions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
