# PinterestSdkClient::UpdateAssetGroupResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **exceptions** | [**Array&lt;UpdateAssetGroupResponseExceptionsInner&gt;**](UpdateAssetGroupResponseExceptionsInner.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional] |
| **updated_asset_groups** | [**Array&lt;AssetGroupBinding&gt;**](AssetGroupBinding.md) | A list of successfully edited asset groups. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UpdateAssetGroupResponse.new(
  exceptions: null,
  updated_asset_groups: null
)
```

