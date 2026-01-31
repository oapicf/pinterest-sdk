# GetBusinessAssetsResponse

An object containing the permissions a business has on the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **string** | Unique identifier of a business asset. | [optional] [default to undefined]
**asset_type** | **string** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] [default to undefined]
**asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] [default to undefined]

## Example

```typescript
import { GetBusinessAssetsResponse } from './api';

const instance: GetBusinessAssetsResponse = {
    asset_id,
    asset_type,
    asset_group_info,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
