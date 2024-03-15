

# BillingProfilesResponse

The class is defined in **[BillingProfilesResponse.java](../../src/main/java/org/openapitools/model/BillingProfilesResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | Billing ID. |  [optional property]
**cardType** | [**CardTypeEnum**](#CardTypeEnum) | Type of the card. |  [optional property]
**status** | [**StatusEnum**](#StatusEnum) | Status of the billing. |  [optional property]
**advertiserId** | `String` | Advertiser ID of the billing. |  [optional property]
**paymentMethodBrand** | [**PaymentMethodBrandEnum**](#PaymentMethodBrandEnum) | Brand of the payment method. |  [optional property]


## CardTypeEnum

Name | Value
---- | -----
UNKNOWN | `"UNKNOWN"`
VISA | `"VISA"`
MASTERCARD | `"MASTERCARD"`
AMERICAN_EXPRESS | `"AMERICAN_EXPRESS"`
DISCOVER | `"DISCOVER"`
ELO | `"ELO"`

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


