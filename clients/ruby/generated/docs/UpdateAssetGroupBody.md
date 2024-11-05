# PinterestSdkClient::UpdateAssetGroupBody

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **asset_groups_to_update** | [**Array&lt;UpdateAssetGroupBodyAssetGroupsToUpdateInner&gt;**](UpdateAssetGroupBodyAssetGroupsToUpdateInner.md) | A list of asset groups and the data that will be used to update them. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UpdateAssetGroupBody.new(
  asset_groups_to_update: null
)
```

