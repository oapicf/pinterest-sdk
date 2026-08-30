# PinterestSdkClient::AssetGroupModificationReadOrUpdate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **asset_groups_to_update** | [**Array&lt;AssetGroupUpdateItemReadOrUpdateItem&gt;**](AssetGroupUpdateItemReadOrUpdateItem.md) | A list of asset groups and the data that will be used to update them. | [optional] |
| **exceptions** | [**Array&lt;AssetGroupUpdateError&gt;**](AssetGroupUpdateError.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional][readonly] |
| **updated_asset_groups** | [**Array&lt;AssetGroupBinding&gt;**](AssetGroupBinding.md) | A list of successfully edited asset groups. | [optional][readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AssetGroupModificationReadOrUpdate.new(
  asset_groups_to_update: null,
  exceptions: null,
  updated_asset_groups: null
)
```

