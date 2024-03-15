# PinterestSdkClient::BillingProfilesResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Billing ID. | [optional] |
| **card_type** | **String** | Type of the card. | [optional] |
| **status** | **String** | Status of the billing. | [optional] |
| **advertiser_id** | **String** | Advertiser ID of the billing. | [optional] |
| **payment_method_brand** | **String** | Brand of the payment method. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BillingProfilesResponse.new(
  id: 12312451231,
  card_type: VISA,
  status: INVALID,
  advertiser_id: 12312451231,
  payment_method_brand: VISA
)
```

