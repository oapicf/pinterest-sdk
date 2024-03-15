# PinterestSdk.AdsCreditDiscountsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | True if the offer code is currently active. | [optional] 
**advertiserId** | **String** | Advertiser ID the offer was applied to. | [optional] 
**discountType** | **String** | The type of discount of this credit | [optional] 
**discountInMicroCurrency** | **Number** | The discount applied in the offer’s currency value. | [optional] 
**discountCurrency** | **String** | Currency value for the discount. | [optional] 
**title** | **String** | Human readable title of the offer code. | [optional] 
**remainingDiscountInMicroCurrency** | **Number** | The credits left to spend. | [optional] 



## Enum: DiscountTypeEnum


* `COUPON` (value: `"COUPON"`)

* `CREDIT` (value: `"CREDIT"`)

* `COUPON_APPLIED` (value: `"COUPON_APPLIED"`)

* `CREDIT_APPLIED` (value: `"CREDIT_APPLIED"`)

* `MARKETING_OFFER_CREDIT` (value: `"MARKETING_OFFER_CREDIT"`)

* `MARKETING_OFFER_CREDIT_APPLIED` (value: `"MARKETING_OFFER_CREDIT_APPLIED"`)

* `GOODWILL_CREDIT` (value: `"GOODWILL_CREDIT"`)

* `GOODWILL_CREDIT_APPLIED` (value: `"GOODWILL_CREDIT_APPLIED"`)

* `INTERNAL_CREDIT` (value: `"INTERNAL_CREDIT"`)

* `INTERNAL_CREDIT_APPLIED` (value: `"INTERNAL_CREDIT_APPLIED"`)

* `PREPAID_CREDIT` (value: `"PREPAID_CREDIT"`)

* `PREPAID_CREDIT_APPLIED` (value: `"PREPAID_CREDIT_APPLIED"`)

* `SALES_INCENTIVE_CREDIT` (value: `"SALES_INCENTIVE_CREDIT"`)

* `SALES_INCENTIVE_CREDIT_APPLIED` (value: `"SALES_INCENTIVE_CREDIT_APPLIED"`)

* `CREDIT_EXPIRED` (value: `"CREDIT_EXPIRED"`)

* `FUTURE_CREDIT` (value: `"FUTURE_CREDIT"`)

* `REFERRAL_CREDIT` (value: `"REFERRAL_CREDIT"`)

* `INVOICE_SALES_INCENTIVE_CREDIT` (value: `"INVOICE_SALES_INCENTIVE_CREDIT"`)

* `INVOICE_SALES_INCENTIVE_CREDIT_APPLIED` (value: `"INVOICE_SALES_INCENTIVE_CREDIT_APPLIED"`)

* `PREPAID_CREDIT_REFUND` (value: `"PREPAID_CREDIT_REFUND"`)

* `null` (value: `"null"`)




