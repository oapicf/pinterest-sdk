# PinterestSdkClient::AdAccountCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **country** | [**Country**](Country.md) |  | [optional] |
| **name** | **String** | Ad Account name. | [optional] |
| **owner_user_id** | **String** | Advertiser&#39;s owning user ID. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdAccountCreateRequest.new(
  country: null,
  name: ACME Tools,
  owner_user_id: 383791336903426391
)
```

