# openapi::AdsCreditDiscountsResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **character** | True if the offer code is currently active. | [optional] 
**advertiser_id** | **character** | Advertiser ID the offer was applied to. | [optional] [Pattern: ^\\d+$] 
**discountType** | **character** | The type of discount of this credit | [optional] [Enum: [COUPON, CREDIT, COUPON_APPLIED, CREDIT_APPLIED, MARKETING_OFFER_CREDIT, MARKETING_OFFER_CREDIT_APPLIED, GOODWILL_CREDIT, GOODWILL_CREDIT_APPLIED, INTERNAL_CREDIT, INTERNAL_CREDIT_APPLIED, PREPAID_CREDIT, PREPAID_CREDIT_APPLIED, SALES_INCENTIVE_CREDIT, SALES_INCENTIVE_CREDIT_APPLIED, CREDIT_EXPIRED, FUTURE_CREDIT, REFERRAL_CREDIT, INVOICE_SALES_INCENTIVE_CREDIT, INVOICE_SALES_INCENTIVE_CREDIT_APPLIED, PREPAID_CREDIT_REFUND]] 
**discountInMicroCurrency** | **numeric** | The discount applied in the offer’s currency value. | [optional] 
**discountCurrency** | **character** | Currency value for the discount. | [optional] 
**title** | **character** | Human readable title of the offer code. | [optional] 
**remainingDiscountInMicroCurrency** | **numeric** | The credits left to spend. | [optional] 


