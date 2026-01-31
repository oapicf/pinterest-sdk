# PinterestSdkClient::PromotionTemplateValue

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **amount** | **Float** | Numeric value. | [optional] |
| **currency_code** | [**Currency**](Currency.md) |  | [optional] |
| **custom_text** | **String** | Custom text. | [optional] |
| **percent** | **Float** | Percent value. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::PromotionTemplateValue.new(
  amount: 100,
  currency_code: null,
  custom_text: My promotion,
  percent: 10
)
```

