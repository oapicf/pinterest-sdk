# openapi::BillingProfilesResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | **character** | Advertiser ID of the billing. | [optional] [Pattern: ^\\d+$] 
**billing_type** | [**BillingType**](BillingType.md) | Billing type of the advertiser | [optional] [Enum: ] 
**card_type** | [**BillingProfileCardType**](BillingProfileCardType.md) | Type of the card. | [optional] [Enum: ] 
**id** | **character** | Billing ID. | [optional] [Pattern: ^\\d+$] 
**payment_method_brand** | [**BillingProfilePaymentMethodBrand**](BillingProfilePaymentMethodBrand.md) | Brand of the payment method. | [optional] [Enum: ] 
**status** | [**BillingProfileStatus**](BillingProfileStatus.md) | Status of the billing. | [optional] [Enum: ] 


