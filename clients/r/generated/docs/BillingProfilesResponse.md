# openapi::BillingProfilesResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_id** | **character** | Advertiser ID of the billing. | [optional] [Pattern: ^\\d+$] 
**billing_type** | **character** | Billing type of the advertiser | [optional] [Enum: [CREDIT_CARD, INVOICE, INTERNAL, RECURRING, PREPAID]] 
**card_type** | **character** | Type of the card. | [optional] [Enum: [UNKNOWN, VISA, MASTERCARD, AMERICAN_EXPRESS, DISCOVER, ELO]] 
**id** | **character** | Billing ID. | [optional] [Pattern: ^\\d+$] 
**payment_method_brand** | **character** | Brand of the payment method. | [optional] [Enum: [UNKNOWN, VISA, MASTERCARD, AMERICAN_EXPRESS, DISCOVER, SOFORT, DINERS_CLUB, ELO, CARTE_BANCAIRE]] 
**status** | **character** | Status of the billing. | [optional] [Enum: [UNSPECIFIED, VALID, INVALID, PENDING, DELETED, SECONDARY, PENDING_SECONDARY]] 


