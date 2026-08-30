# AssetIdPermissions

An object containing the permissions a business member has on the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals \&#39;ASSET_GROUP\&#39;. | [optional] [default to undefined]
**asset_id** | **string** | Unique identifier of a business asset. | [default to undefined]
**asset_type** | [**AssetTypeResponse**](AssetTypeResponse.md) |  | [default to undefined]
**permissions** | **Array&lt;string&gt;** | Permission levels member or partner has on an asset. | [default to undefined]

## Example

```typescript
import { AssetIdPermissions } from './api';

const instance: AssetIdPermissions = {
    asset_group_info,
    asset_id,
    asset_type,
    permissions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
