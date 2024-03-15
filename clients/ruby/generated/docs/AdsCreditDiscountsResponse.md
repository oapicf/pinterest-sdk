# PinterestSdkClient::AdsCreditDiscountsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **active** | **Boolean** | True if the offer code is currently active. | [optional] |
| **advertiser_id** | **String** | Advertiser ID the offer was applied to. | [optional] |
| **discount_type** | **String** | The type of discount of this credit | [optional] |
| **discount_in_micro_currency** | **Float** | The discount applied in the offer’s currency value. | [optional] |
| **discount_currency** | **String** | Currency value for the discount. | [optional] |
| **title** | **String** | Human readable title of the offer code. | [optional] |
| **remaining_discount_in_micro_currency** | **Float** | The credits left to spend. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdsCreditDiscountsResponse.new(
  active: true,
  advertiser_id: 12312451231,
  discount_type: null,
  discount_in_micro_currency: 125000000,
  discount_currency: USD,
  title: Ads Credits,
  remaining_discount_in_micro_currency: 125000000
)
```

