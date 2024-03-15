
# AdsCreditDiscountsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **kotlin.Boolean** | True if the offer code is currently active. |  [optional]
**advertiserId** | **kotlin.String** | Advertiser ID the offer was applied to. |  [optional]
**discountType** | [**inline**](#DiscountType) | The type of discount of this credit |  [optional]
**discountInMicroCurrency** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The discount applied in the offer’s currency value. |  [optional]
**discountCurrency** | **kotlin.String** | Currency value for the discount. |  [optional]
**title** | **kotlin.String** | Human readable title of the offer code. |  [optional]
**remainingDiscountInMicroCurrency** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The credits left to spend. |  [optional]


<a id="DiscountType"></a>
## Enum: discountType
Name | Value
---- | -----
discountType | COUPON, CREDIT, COUPON_APPLIED, CREDIT_APPLIED, MARKETING_OFFER_CREDIT, MARKETING_OFFER_CREDIT_APPLIED, GOODWILL_CREDIT, GOODWILL_CREDIT_APPLIED, INTERNAL_CREDIT, INTERNAL_CREDIT_APPLIED, PREPAID_CREDIT, PREPAID_CREDIT_APPLIED, SALES_INCENTIVE_CREDIT, SALES_INCENTIVE_CREDIT_APPLIED, CREDIT_EXPIRED, FUTURE_CREDIT, REFERRAL_CREDIT, INVOICE_SALES_INCENTIVE_CREDIT, INVOICE_SALES_INCENTIVE_CREDIT_APPLIED, PREPAID_CREDIT_REFUND, 



