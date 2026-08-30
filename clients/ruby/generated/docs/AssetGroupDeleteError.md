# PinterestSdkClient::AssetGroupDeleteError

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **asset_group_id** | **String** | Asset group id of the exception. | [optional] |
| **code** | **Integer** | Error code associated with the error deleting asset group. | [optional] |
| **message** | **String** | Error message associated with the error deleting asset group. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AssetGroupDeleteError.new(
  asset_group_id: null,
  code: null,
  message: null
)
```

