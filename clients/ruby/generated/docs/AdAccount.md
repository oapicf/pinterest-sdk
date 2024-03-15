# PinterestSdkClient::AdAccount

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  | [optional] |
| **name** | **String** |  | [optional] |
| **owner** | [**AdAccountOwner**](AdAccountOwner.md) |  | [optional] |
| **country** | [**Country**](Country.md) |  | [optional] |
| **currency** | [**Currency**](Currency.md) |  | [optional] |
| **permissions** | [**Array&lt;BusinessAccessRole&gt;**](BusinessAccessRole.md) |  | [optional] |
| **created_time** | **Integer** | Creation time. Unix timestamp in seconds. | [optional] |
| **updated_time** | **Integer** | Last update time. Unix timestamp in seconds. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdAccount.new(
  id: null,
  name: null,
  owner: null,
  country: null,
  currency: null,
  permissions: null,
  created_time: 1451431341,
  updated_time: 1451431341
)
```

