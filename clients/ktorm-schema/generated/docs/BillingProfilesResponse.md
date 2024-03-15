
# Table `BillingProfilesResponse`
(mapped from: BillingProfilesResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Billing ID. |  [optional]
**cardType** | card_type | text |  | [**card_type**](#CardType) | Type of the card. |  [optional]
**status** | status | text |  | [**status**](#Status) | Status of the billing. |  [optional]
**advertiserId** | advertiser_id | text |  | **kotlin.String** | Advertiser ID of the billing. |  [optional]
**paymentMethodBrand** | payment_method_brand | text |  | [**payment_method_brand**](#PaymentMethodBrand) | Brand of the payment method. |  [optional]







