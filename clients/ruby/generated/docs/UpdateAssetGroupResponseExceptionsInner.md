# PinterestSdkClient::UpdateAssetGroupResponseExceptionsInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **asset_group_id** | **String** | Asset group id of the exception. | [optional] |
| **code** | **Integer** | Error code associated with the error editing asset group. | [optional] |
| **message** | **String** | Error message associated with the error editing asset group. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UpdateAssetGroupResponseExceptionsInner.new(
  asset_group_id: 666791336903426391,
  code: 29,
  message: You are not permitted to access that resource.
)
```

