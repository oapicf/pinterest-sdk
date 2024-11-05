# PinterestSdkClient::SharedAudienceAccount

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **account_id** | **String** | Account ID (ad account or business ID). |  |
| **account_name** | **String** | Account name. |  |
| **account_type** | **String** | account type |  |
| **shared_on_timestamp** | **Integer** | Epoch timestamp in seconds for the shared audience event |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SharedAudienceAccount.new(
  account_id: 549755885175,
  account_name: Home Depot USA,
  account_type: null,
  shared_on_timestamp: 1677003860
)
```

