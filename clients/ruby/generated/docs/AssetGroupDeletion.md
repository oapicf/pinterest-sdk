# PinterestSdkClient::AssetGroupDeletion

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **deleted_asset_groups** | **Array&lt;String&gt;** |  | [optional][readonly] |
| **exceptions** | [**Array&lt;AssetGroupDeleteError&gt;**](AssetGroupDeleteError.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AssetGroupDeletion.new(
  deleted_asset_groups: null,
  exceptions: null
)
```

