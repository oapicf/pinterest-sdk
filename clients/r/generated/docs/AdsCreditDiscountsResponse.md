# openapi::AdsCreditDiscountsResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **character** | True if the offer code is currently active. | [optional] 
**advertiser_id** | **character** | Advertiser ID the offer was applied to. | [optional] [Pattern: ^\\d+$] 
**discountCurrency** | **character** | Currency value for the discount. | [optional] 
**discountInMicroCurrency** | **numeric** | The discount applied in the offer&#39;s currency value. | [optional] 
**discountType** | [**AdsCreditDiscountType**](AdsCreditDiscountType.md) | The type of discount of this credit | [optional] [Enum: ] 
**remainingDiscountInMicroCurrency** | **numeric** | The credits left to spend. | [optional] 
**title** | **character** | Human readable title of the offer code. | [optional] 


