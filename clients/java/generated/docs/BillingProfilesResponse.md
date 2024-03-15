

# BillingProfilesResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Billing ID. |  [optional] |
|**cardType** | [**CardTypeEnum**](#CardTypeEnum) | Type of the card. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the billing. |  [optional] |
|**advertiserId** | **String** | Advertiser ID of the billing. |  [optional] |
|**paymentMethodBrand** | [**PaymentMethodBrandEnum**](#PaymentMethodBrandEnum) | Brand of the payment method. |  [optional] |



## Enum: CardTypeEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;UNKNOWN&quot; |
| VISA | &quot;VISA&quot; |
| MASTERCARD | &quot;MASTERCARD&quot; |
| AMERICAN_EXPRESS | &quot;AMERICAN_EXPRESS&quot; |
| DISCOVER | &quot;DISCOVER&quot; |
| ELO | &quot;ELO&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNSPECIFIED | &quot;UNSPECIFIED&quot; |
| VALID | &quot;VALID&quot; |
| INVALID | &quot;INVALID&quot; |
| PENDING | &quot;PENDING&quot; |
| DELETED | &quot;DELETED&quot; |
| SECONDARY | &quot;SECONDARY&quot; |
| PENDING_SECONDARY | &quot;PENDING_SECONDARY&quot; |



## Enum: PaymentMethodBrandEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;UNKNOWN&quot; |
| VISA | &quot;VISA&quot; |
| MASTERCARD | &quot;MASTERCARD&quot; |
| AMERICAN_EXPRESS | &quot;AMERICAN_EXPRESS&quot; |
| DISCOVER | &quot;DISCOVER&quot; |
| SOFORT | &quot;SOFORT&quot; |
| DINERS_CLUB | &quot;DINERS_CLUB&quot; |
| ELO | &quot;ELO&quot; |
| CARTE_BANCAIRE | &quot;CARTE_BANCAIRE&quot; |



