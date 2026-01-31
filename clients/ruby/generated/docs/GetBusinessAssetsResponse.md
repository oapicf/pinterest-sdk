# PinterestSdkClient::GetBusinessAssetsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] |
| **asset_id** | **String** | Unique identifier of a business asset. | [optional] |
| **asset_type** | **String** | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. | [optional] |
| **catalog_info** | [**GetBusinessAssetsResponseCatalogInfo**](GetBusinessAssetsResponseCatalogInfo.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::GetBusinessAssetsResponse.new(
  asset_group_info: null,
  asset_id: 549755885175,
  asset_type: AD_ACCOUNT,
  catalog_info: null
)
```

