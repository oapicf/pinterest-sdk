

# AdsCreditDiscountsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** | True if the offer code is currently active. |  [optional] |
|**advertiserId** | **String** | Advertiser ID the offer was applied to. |  [optional] |
|**discountType** | [**DiscountTypeEnum**](#DiscountTypeEnum) | The type of discount of this credit |  [optional] |
|**discountInMicroCurrency** | **BigDecimal** | The discount applied in the offer’s currency value. |  [optional] |
|**discountCurrency** | **String** | Currency value for the discount. |  [optional] |
|**title** | **String** | Human readable title of the offer code. |  [optional] |
|**remainingDiscountInMicroCurrency** | **BigDecimal** | The credits left to spend. |  [optional] |



## Enum: DiscountTypeEnum

| Name | Value |
|---- | -----|
| COUPON | &quot;COUPON&quot; |
| CREDIT | &quot;CREDIT&quot; |
| COUPON_APPLIED | &quot;COUPON_APPLIED&quot; |
| CREDIT_APPLIED | &quot;CREDIT_APPLIED&quot; |
| MARKETING_OFFER_CREDIT | &quot;MARKETING_OFFER_CREDIT&quot; |
| MARKETING_OFFER_CREDIT_APPLIED | &quot;MARKETING_OFFER_CREDIT_APPLIED&quot; |
| GOODWILL_CREDIT | &quot;GOODWILL_CREDIT&quot; |
| GOODWILL_CREDIT_APPLIED | &quot;GOODWILL_CREDIT_APPLIED&quot; |
| INTERNAL_CREDIT | &quot;INTERNAL_CREDIT&quot; |
| INTERNAL_CREDIT_APPLIED | &quot;INTERNAL_CREDIT_APPLIED&quot; |
| PREPAID_CREDIT | &quot;PREPAID_CREDIT&quot; |
| PREPAID_CREDIT_APPLIED | &quot;PREPAID_CREDIT_APPLIED&quot; |
| SALES_INCENTIVE_CREDIT | &quot;SALES_INCENTIVE_CREDIT&quot; |
| SALES_INCENTIVE_CREDIT_APPLIED | &quot;SALES_INCENTIVE_CREDIT_APPLIED&quot; |
| CREDIT_EXPIRED | &quot;CREDIT_EXPIRED&quot; |
| FUTURE_CREDIT | &quot;FUTURE_CREDIT&quot; |
| REFERRAL_CREDIT | &quot;REFERRAL_CREDIT&quot; |
| INVOICE_SALES_INCENTIVE_CREDIT | &quot;INVOICE_SALES_INCENTIVE_CREDIT&quot; |
| INVOICE_SALES_INCENTIVE_CREDIT_APPLIED | &quot;INVOICE_SALES_INCENTIVE_CREDIT_APPLIED&quot; |
| PREPAID_CREDIT_REFUND | &quot;PREPAID_CREDIT_REFUND&quot; |
| NULL | &quot;null&quot; |



