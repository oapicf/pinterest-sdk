# PinterestSdkClient::AdAccount

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **country** | [**Country**](Country.md) |  | [optional] |
| **created_time** | **Integer** |  Creation time. Unix timestamp in seconds. | [optional][readonly] |
| **currency** | [**Currency**](Currency.md) |  | [optional] |
| **id** | **String** |  |  |
| **name** | **String** | Ad account name. | [optional] |
| **owner** | [**AdAccountOwner**](AdAccountOwner.md) | Ad account owner | [optional][readonly] |
| **permissions** | [**Array&lt;BusinessAccessRole&gt;**](BusinessAccessRole.md) |  | [optional][readonly] |
| **updated_time** | **Integer** |  | [optional][readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdAccount.new(
  country: null,
  created_time: null,
  currency: null,
  id: null,
  name: null,
  owner: null,
  permissions: null,
  updated_time: null
)
```

