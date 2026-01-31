
# BillingProfilesResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **advertiserId** | **kotlin.String** | Advertiser ID of the billing. |  [optional] |
| **billingType** | [**inline**](#BillingType) | Billing type of the advertiser |  [optional] |
| **cardType** | [**inline**](#CardType) | Type of the card. |  [optional] |
| **id** | **kotlin.String** | Billing ID. |  [optional] |
| **paymentMethodBrand** | [**inline**](#PaymentMethodBrand) | Brand of the payment method. |  [optional] |
| **status** | [**inline**](#Status) | Status of the billing. |  [optional] |


<a id="BillingType"></a>
## Enum: billing_type
| Name | Value |
| ---- | ----- |
| billingType | CREDIT_CARD, INVOICE, INTERNAL, RECURRING, PREPAID |


<a id="CardType"></a>
## Enum: card_type
| Name | Value |
| ---- | ----- |
| cardType | UNKNOWN, VISA, MASTERCARD, AMERICAN_EXPRESS, DISCOVER, ELO |


<a id="PaymentMethodBrand"></a>
## Enum: payment_method_brand
| Name | Value |
| ---- | ----- |
| paymentMethodBrand | UNKNOWN, VISA, MASTERCARD, AMERICAN_EXPRESS, DISCOVER, SOFORT, DINERS_CLUB, ELO, CARTE_BANCAIRE |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | UNSPECIFIED, VALID, INVALID, PENDING, DELETED, SECONDARY, PENDING_SECONDARY |



