

# BillingProfilesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Billing ID. |  [optional]
**cardType** | [**CardType**](#CardType) | Type of the card. |  [optional]
**status** | [**Status**](#Status) | Status of the billing. |  [optional]
**advertiserId** | **String** | Advertiser ID of the billing. |  [optional]
**paymentMethodBrand** | [**PaymentMethodBrand**](#PaymentMethodBrand) | Brand of the payment method. |  [optional]


## Enum: CardType
Allowed values: [UNKNOWN, VISA, MASTERCARD, AMERICAN_EXPRESS, DISCOVER, ELO]



## Enum: Status
Allowed values: [UNSPECIFIED, VALID, INVALID, PENDING, DELETED, SECONDARY, PENDING_SECONDARY]



## Enum: PaymentMethodBrand
Allowed values: [UNKNOWN, VISA, MASTERCARD, AMERICAN_EXPRESS, DISCOVER, SOFORT, DINERS_CLUB, ELO, CARTE_BANCAIRE]




