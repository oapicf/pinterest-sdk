# PinterestSdkClient::AdAccountsCountryResponseData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code** | [**AdCountry**](AdCountry.md) |  | [optional] |
| **currency** | **String** | Country currency. | [optional] |
| **index** | **Float** | Country index | [optional] |
| **name** | **String** | Country name | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdAccountsCountryResponseData.new(
  code: null,
  currency: Dollars,
  index: 1,
  name: United States of America
)
```

