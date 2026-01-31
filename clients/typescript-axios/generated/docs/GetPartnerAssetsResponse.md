# GetPartnerAssetsResponse

An object containing the permissions a you/your business partner has on the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] [default to undefined]
**asset_id** | **string** | Unique identifier of a business asset. | [optional] [default to undefined]
**asset_type** | **string** | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. | [optional] [default to undefined]
**permissions** | **Array&lt;string&gt;** | The permissions you or your partner has on the asset. If partner_type&#x3D;INTERNAL, the permission levels are for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the permission levels are for the access you have to the partner\&#39;s business asset. | [optional] [default to undefined]

## Example

```typescript
import { GetPartnerAssetsResponse } from './api';

const instance: GetPartnerAssetsResponse = {
    asset_group_info,
    asset_id,
    asset_type,
    permissions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
