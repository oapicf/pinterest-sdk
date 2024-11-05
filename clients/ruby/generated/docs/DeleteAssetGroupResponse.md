# PinterestSdkClient::DeleteAssetGroupResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **deleted_asset_groups** | **Array&lt;String&gt;** | A list of ids of successfully deleted asset groups. | [optional] |
| **exceptions** | [**Array&lt;DeleteAssetGroupResponseExceptionsInner&gt;**](DeleteAssetGroupResponseExceptionsInner.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::DeleteAssetGroupResponse.new(
  deleted_asset_groups: null,
  exceptions: null
)
```

