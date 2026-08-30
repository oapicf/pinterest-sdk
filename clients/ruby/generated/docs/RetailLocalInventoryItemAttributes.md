# PinterestSdkClient::RetailLocalInventoryItemAttributes

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_link** | **String** | Ad link for the item | [optional] |
| **availability** | [**ItemAvailability**](ItemAvailability.md) | Availability status of the item |  |
| **price** | **String** | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. |  |
| **sale_price** | **String** | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::RetailLocalInventoryItemAttributes.new(
  ad_link: https://examplelink.com,
  availability: in stock,
  price: 49.99 USD,
  sale_price: 24.99 USD
)
```

