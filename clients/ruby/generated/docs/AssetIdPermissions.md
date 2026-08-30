# PinterestSdkClient::AssetIdPermissions

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. | [optional] |
| **asset_id** | **String** | Unique identifier of a business asset. |  |
| **asset_type** | [**AssetTypeResponse**](AssetTypeResponse.md) |  |  |
| **permissions** | **Array&lt;String&gt;** | Permission levels member or partner has on an asset. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AssetIdPermissions.new(
  asset_group_info: null,
  asset_id: 549755885175,
  asset_type: null,
  permissions: [&quot;FINANCE_MANAGER&quot;,&quot;CATALOGS_MANAGER&quot;,&quot;AUDIENCE_MANAGER&quot;]
)
```

