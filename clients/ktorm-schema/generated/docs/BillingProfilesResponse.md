
# Table `BillingProfilesResponse`
(mapped from: BillingProfilesResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**advertiserId** | advertiser_id | text |  | **kotlin.String** | Advertiser ID of the billing. |  [optional]
**billingType** | billing_type | text |  | [**billing_type**](#BillingType) | Billing type of the advertiser |  [optional]
**cardType** | card_type | text |  | [**card_type**](#CardType) | Type of the card. |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Billing ID. |  [optional]
**paymentMethodBrand** | payment_method_brand | text |  | [**payment_method_brand**](#PaymentMethodBrand) | Brand of the payment method. |  [optional]
**status** | status | text |  | [**status**](#Status) | Status of the billing. |  [optional]








