# AssetIdPermissions

An object containing the permissions a business member has on the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **string** | Unique identifier of a business asset. | [optional] [default to undefined]
**asset_type** | **string** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] [default to undefined]
**permissions** | **Array&lt;string&gt;** | Permission levels member or partner has on an asset. | [optional] [default to undefined]
**asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] [default to undefined]

## Example

```typescript
import { AssetIdPermissions } from './api';

const instance: AssetIdPermissions = {
    asset_id,
    asset_type,
    permissions,
    asset_group_info,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
