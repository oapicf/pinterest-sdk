
# BillingProfilesResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | Billing ID. |  [optional] |
| **cardType** | [**inline**](#CardType) | Type of the card. |  [optional] |
| **status** | [**inline**](#Status) | Status of the billing. |  [optional] |
| **advertiserId** | **kotlin.String** | Advertiser ID of the billing. |  [optional] |
| **paymentMethodBrand** | [**inline**](#PaymentMethodBrand) | Brand of the payment method. |  [optional] |


<a id="CardType"></a>
## Enum: card_type
| Name | Value |
| ---- | ----- |
| cardType | UNKNOWN, VISA, MASTERCARD, AMERICAN_EXPRESS, DISCOVER, ELO |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | UNSPECIFIED, VALID, INVALID, PENDING, DELETED, SECONDARY, PENDING_SECONDARY |


<a id="PaymentMethodBrand"></a>
## Enum: payment_method_brand
| Name | Value |
| ---- | ----- |
| paymentMethodBrand | UNKNOWN, VISA, MASTERCARD, AMERICAN_EXPRESS, DISCOVER, SOFORT, DINERS_CLUB, ELO, CARTE_BANCAIRE |



