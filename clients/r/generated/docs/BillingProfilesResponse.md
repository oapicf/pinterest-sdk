# openapi::BillingProfilesResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | Billing ID. | [optional] [Pattern: ^\\d+$] 
**card_type** | **character** | Type of the card. | [optional] [Enum: [UNKNOWN, VISA, MASTERCARD, AMERICAN_EXPRESS, DISCOVER, ELO]] 
**status** | **character** | Status of the billing. | [optional] [Enum: [UNSPECIFIED, VALID, INVALID, PENDING, DELETED, SECONDARY, PENDING_SECONDARY]] 
**advertiser_id** | **character** | Advertiser ID of the billing. | [optional] [Pattern: ^\\d+$] 
**payment_method_brand** | **character** | Brand of the payment method. | [optional] [Enum: [UNKNOWN, VISA, MASTERCARD, AMERICAN_EXPRESS, DISCOVER, SOFORT, DINERS_CLUB, ELO, CARTE_BANCAIRE]] 


