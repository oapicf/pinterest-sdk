# BillingProfilesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | **string** | Advertiser ID of the billing. | [optional] [default to undefined]
**billing_type** | [**BillingType**](BillingType.md) | Billing type of the advertiser | [optional] [default to undefined]
**card_type** | [**BillingProfileCardType**](BillingProfileCardType.md) | Type of the card. | [optional] [default to undefined]
**id** | **string** | Billing ID. | [optional] [default to undefined]
**payment_method_brand** | [**BillingProfilePaymentMethodBrand**](BillingProfilePaymentMethodBrand.md) | Brand of the payment method. | [optional] [default to undefined]
**status** | [**BillingProfileStatus**](BillingProfileStatus.md) | Status of the billing. | [optional] [default to undefined]

## Example

```typescript
import { BillingProfilesResponse } from './api';

const instance: BillingProfilesResponse = {
    advertiser_id,
    billing_type,
    card_type,
    id,
    payment_method_brand,
    status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
