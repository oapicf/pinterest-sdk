# PinterestSdkClient::BillingProfilesResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **advertiser_id** | **String** | Advertiser ID of the billing. | [optional] |
| **billing_type** | [**BillingType**](BillingType.md) | Billing type of the advertiser | [optional] |
| **card_type** | [**BillingProfileCardType**](BillingProfileCardType.md) | Type of the card. | [optional] |
| **id** | **String** | Billing ID. | [optional] |
| **payment_method_brand** | [**BillingProfilePaymentMethodBrand**](BillingProfilePaymentMethodBrand.md) | Brand of the payment method. | [optional] |
| **status** | [**BillingProfileStatus**](BillingProfileStatus.md) | Status of the billing. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BillingProfilesResponse.new(
  advertiser_id: 12312451231,
  billing_type: CREDIT_CARD,
  card_type: VISA,
  id: 12312451231,
  payment_method_brand: VISA,
  status: INVALID
)
```

