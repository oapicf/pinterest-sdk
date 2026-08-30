# UpdatePartnerAssetAccessItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **string** | Unique identifier of the business asset. | [default to undefined]
**partner_id** | **string** | Unique identifier of a business partner to update asset access to. | [default to undefined]
**permissions** | [**Array&lt;Permissions&gt;**](Permissions.md) | A non-empty array of permissions to assign to the partner. | [default to undefined]

## Example

```typescript
import { UpdatePartnerAssetAccessItem } from './api';

const instance: UpdatePartnerAssetAccessItem = {
    asset_id,
    partner_id,
    permissions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
