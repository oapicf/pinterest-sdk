# PinterestSdkClient::AssetGroupModification

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **exceptions** | [**Array&lt;AssetGroupUpdateError&gt;**](AssetGroupUpdateError.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional][readonly] |
| **updated_asset_groups** | [**Array&lt;AssetGroupBinding&gt;**](AssetGroupBinding.md) | A list of successfully edited asset groups. | [optional][readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AssetGroupModification.new(
  exceptions: null,
  updated_asset_groups: null
)
```

