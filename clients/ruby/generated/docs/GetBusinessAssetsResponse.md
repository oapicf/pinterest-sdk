# PinterestSdkClient::GetBusinessAssetsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **asset_id** | **String** | Unique identifier of a business asset. | [optional] |
| **asset_type** | **String** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] |
| **asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::GetBusinessAssetsResponse.new(
  asset_id: 549755885175,
  asset_type: AD_ACCOUNT,
  asset_group_info: null
)
```

