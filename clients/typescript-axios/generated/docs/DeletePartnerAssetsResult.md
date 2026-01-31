# DeletePartnerAssetsResult

The terminated asset access.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **string** | Unique identifier of a business asset. | [optional] [default to undefined]
**asset_type** | **string** | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. | [optional] [default to undefined]
**is_shared_partner** | **boolean** | If is_shared_partner&#x3D;FALSE, you terminated a partner\&#39;s asset access to your business asset.&lt;br&gt; If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner\&#39;s business asset. | [optional] [default to undefined]
**partner_id** | **string** | Unique identifier of a business partner. | [optional] [default to undefined]
**permissions** | **Array&lt;string&gt;** | Permission levels member or partner has on an asset. | [optional] [default to undefined]

## Example

```typescript
import { DeletePartnerAssetsResult } from './api';

const instance: DeletePartnerAssetsResult = {
    asset_id,
    asset_type,
    is_shared_partner,
    partner_id,
    permissions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
