

# BillingProfilesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiserId** | **String** | Advertiser ID of the billing. |  [optional]
**billingType** | [**BillingType**](#BillingType) | Billing type of the advertiser |  [optional]
**cardType** | [**CardType**](#CardType) | Type of the card. |  [optional]
**id** | **String** | Billing ID. |  [optional]
**paymentMethodBrand** | [**PaymentMethodBrand**](#PaymentMethodBrand) | Brand of the payment method. |  [optional]
**status** | [**Status**](#Status) | Status of the billing. |  [optional]


## Enum: BillingType
Allowed values: [CREDIT_CARD, INVOICE, INTERNAL, RECURRING, PREPAID]



## Enum: CardType
Allowed values: [UNKNOWN, VISA, MASTERCARD, AMERICAN_EXPRESS, DISCOVER, ELO]



## Enum: PaymentMethodBrand
Allowed values: [UNKNOWN, VISA, MASTERCARD, AMERICAN_EXPRESS, DISCOVER, SOFORT, DINERS_CLUB, ELO, CARTE_BANCAIRE]



## Enum: Status
Allowed values: [UNSPECIFIED, VALID, INVALID, PENDING, DELETED, SECONDARY, PENDING_SECONDARY]




