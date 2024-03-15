

# AdsCreditDiscountsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | True if the offer code is currently active. |  [optional]
**advertiserId** | **String** | Advertiser ID the offer was applied to. |  [optional]
**discountType** | [**DiscountType**](#DiscountType) | The type of discount of this credit |  [optional]
**discountInMicroCurrency** | **BigDecimal** | The discount applied in the offer’s currency value. |  [optional]
**discountCurrency** | **String** | Currency value for the discount. |  [optional]
**title** | **String** | Human readable title of the offer code. |  [optional]
**remainingDiscountInMicroCurrency** | **BigDecimal** | The credits left to spend. |  [optional]


## Enum: DiscountType
Allowed values: [COUPON, CREDIT, COUPON_APPLIED, CREDIT_APPLIED, MARKETING_OFFER_CREDIT, MARKETING_OFFER_CREDIT_APPLIED, GOODWILL_CREDIT, GOODWILL_CREDIT_APPLIED, INTERNAL_CREDIT, INTERNAL_CREDIT_APPLIED, PREPAID_CREDIT, PREPAID_CREDIT_APPLIED, SALES_INCENTIVE_CREDIT, SALES_INCENTIVE_CREDIT_APPLIED, CREDIT_EXPIRED, FUTURE_CREDIT, REFERRAL_CREDIT, INVOICE_SALES_INCENTIVE_CREDIT, INVOICE_SALES_INCENTIVE_CREDIT_APPLIED, PREPAID_CREDIT_REFUND, ]




