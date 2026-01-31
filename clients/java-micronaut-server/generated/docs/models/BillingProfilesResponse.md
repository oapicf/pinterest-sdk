

# BillingProfilesResponse

The class is defined in **[BillingProfilesResponse.java](../../src/main/java/org/openapitools/model/BillingProfilesResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiserId** | `String` | Advertiser ID of the billing. |  [optional property]
**billingType** | [**BillingTypeEnum**](#BillingTypeEnum) | Billing type of the advertiser |  [optional property]
**cardType** | [**CardTypeEnum**](#CardTypeEnum) | Type of the card. |  [optional property]
**id** | `String` | Billing ID. |  [optional property]
**paymentMethodBrand** | [**PaymentMethodBrandEnum**](#PaymentMethodBrandEnum) | Brand of the payment method. |  [optional property]
**status** | [**StatusEnum**](#StatusEnum) | Status of the billing. |  [optional property]


## BillingTypeEnum

Name | Value
---- | -----
CREDIT_CARD | `"CREDIT_CARD"`
INVOICE | `"INVOICE"`
INTERNAL | `"INTERNAL"`
RECURRING | `"RECURRING"`
PREPAID | `"PREPAID"`

## CardTypeEnum

Name | Value
---- | -----
UNKNOWN | `"UNKNOWN"`
VISA | `"VISA"`
MASTERCARD | `"MASTERCARD"`
AMERICAN_EXPRESS | `"AMERICAN_EXPRESS"`
DISCOVER | `"DISCOVER"`
ELO | `"ELO"`


## PaymentMethodBrandEnum

Name | Value
---- | -----
UNKNOWN | `"UNKNOWN"`
VISA | `"VISA"`
MASTERCARD | `"MASTERCARD"`
AMERICAN_EXPRESS | `"AMERICAN_EXPRESS"`
DISCOVER | `"DISCOVER"`
SOFORT | `"SOFORT"`
DINERS_CLUB | `"DINERS_CLUB"`
ELO | `"ELO"`
CARTE_BANCAIRE | `"CARTE_BANCAIRE"`

## StatusEnum

Name | Value
---- | -----
UNSPECIFIED | `"UNSPECIFIED"`
VALID | `"VALID"`
INVALID | `"INVALID"`
PENDING | `"PENDING"`
DELETED | `"DELETED"`
SECONDARY | `"SECONDARY"`
PENDING_SECONDARY | `"PENDING_SECONDARY"`


