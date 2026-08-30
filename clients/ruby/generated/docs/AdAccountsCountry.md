# PinterestSdkClient::AdAccountsCountry

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code** | [**Country**](Country.md) |  |  |
| **currency** | **String** | Country currency. |  |
| **index** | **Float** | Country index |  |
| **name** | **String** | Country name |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdAccountsCountry.new(
  code: US,
  currency: Dollars,
  index: 1,
  name: United States of America
)
```

