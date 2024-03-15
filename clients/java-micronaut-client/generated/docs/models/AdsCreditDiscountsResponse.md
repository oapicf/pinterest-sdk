

# AdsCreditDiscountsResponse

The class is defined in **[AdsCreditDiscountsResponse.java](../../src/main/java/org/openapitools/model/AdsCreditDiscountsResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | `Boolean` | True if the offer code is currently active. |  [optional property]
**advertiserId** | `String` | Advertiser ID the offer was applied to. |  [optional property]
**discountType** | [**DiscountTypeEnum**](#DiscountTypeEnum) | The type of discount of this credit |  [optional property]
**discountInMicroCurrency** | `BigDecimal` | The discount applied in the offer’s currency value. |  [optional property]
**discountCurrency** | `String` | Currency value for the discount. |  [optional property]
**title** | `String` | Human readable title of the offer code. |  [optional property]
**remainingDiscountInMicroCurrency** | `BigDecimal` | The credits left to spend. |  [optional property]



## DiscountTypeEnum

Name | Value
---- | -----
COUPON | `"COUPON"`
CREDIT | `"CREDIT"`
COUPON_APPLIED | `"COUPON_APPLIED"`
CREDIT_APPLIED | `"CREDIT_APPLIED"`
MARKETING_OFFER_CREDIT | `"MARKETING_OFFER_CREDIT"`
MARKETING_OFFER_CREDIT_APPLIED | `"MARKETING_OFFER_CREDIT_APPLIED"`
GOODWILL_CREDIT | `"GOODWILL_CREDIT"`
GOODWILL_CREDIT_APPLIED | `"GOODWILL_CREDIT_APPLIED"`
INTERNAL_CREDIT | `"INTERNAL_CREDIT"`
INTERNAL_CREDIT_APPLIED | `"INTERNAL_CREDIT_APPLIED"`
PREPAID_CREDIT | `"PREPAID_CREDIT"`
PREPAID_CREDIT_APPLIED | `"PREPAID_CREDIT_APPLIED"`
SALES_INCENTIVE_CREDIT | `"SALES_INCENTIVE_CREDIT"`
SALES_INCENTIVE_CREDIT_APPLIED | `"SALES_INCENTIVE_CREDIT_APPLIED"`
CREDIT_EXPIRED | `"CREDIT_EXPIRED"`
FUTURE_CREDIT | `"FUTURE_CREDIT"`
REFERRAL_CREDIT | `"REFERRAL_CREDIT"`
INVOICE_SALES_INCENTIVE_CREDIT | `"INVOICE_SALES_INCENTIVE_CREDIT"`
INVOICE_SALES_INCENTIVE_CREDIT_APPLIED | `"INVOICE_SALES_INCENTIVE_CREDIT_APPLIED"`
PREPAID_CREDIT_REFUND | `"PREPAID_CREDIT_REFUND"`
NULL | `"null"`






