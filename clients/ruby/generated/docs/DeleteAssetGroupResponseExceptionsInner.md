# PinterestSdkClient::DeleteAssetGroupResponseExceptionsInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code** | **Integer** | Error code associated with the error deleting asset group. | [optional] |
| **message** | **String** | Error message associated with the error deleting asset group. | [optional] |
| **asset_group_id** | **String** | Asset group id of the exception. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::DeleteAssetGroupResponseExceptionsInner.new(
  code: 29,
  message: You are not permitted to access that resource.,
  asset_group_id: 666791336903426391
)
```

