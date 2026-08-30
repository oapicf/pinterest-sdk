# PinterestSdkClient::BusinessAssets

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. | [optional] |
| **asset_id** | **String** | Unique identifier of a business asset. | [optional] |
| **asset_type** | [**AssetTypeResponse**](AssetTypeResponse.md) |  | [optional] |
| **permissions** | **Array&lt;String&gt;** | Permission levels the requesting business has on an asset. | [optional] |
| **catalog_info** | [**CatalogBinding**](CatalogBinding.md) | An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BusinessAssets.new(
  asset_group_info: null,
  asset_id: 549755885175,
  asset_type: null,
  permissions: [FINANCE_MANAGER, CATALOGS_MANAGER, AUDIENCE_MANAGER],
  catalog_info: null
)
```

