# PinterestSdkClient::AdAccountCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **country** | [**Country**](Country.md) |  | [optional] |
| **currency** | [**Currency**](Currency.md) |  | [optional] |
| **name** | **String** | Ad account name. | [optional] |
| **owner_user_id** | **String** | Advertiser&#39;s owning user ID. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdAccountCreate.new(
  country: null,
  currency: null,
  name: null,
  owner_user_id: null
)
```

