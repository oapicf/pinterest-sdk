
# Table `BillingProfilesResponse`
(mapped from: BillingProfilesResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**advertiserId** | advertiser_id | text |  | **kotlin.String** | Advertiser ID of the billing. |  [optional]
**billingType** | billing_type | long |  | [**BillingType**](BillingType.md) | Billing type of the advertiser |  [optional] [foreignkey]
**cardType** | card_type | long |  | [**BillingProfileCardType**](BillingProfileCardType.md) | Type of the card. |  [optional] [foreignkey]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Billing ID. |  [optional]
**paymentMethodBrand** | payment_method_brand | long |  | [**BillingProfilePaymentMethodBrand**](BillingProfilePaymentMethodBrand.md) | Brand of the payment method. |  [optional] [foreignkey]
**status** | status | long |  | [**BillingProfileStatus**](BillingProfileStatus.md) | Status of the billing. |  [optional] [foreignkey]








