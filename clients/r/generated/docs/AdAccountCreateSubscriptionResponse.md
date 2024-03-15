# openapi::AdAccountCreateSubscriptionResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | Subscription ID. | [optional] [Pattern: ^\\d+$] 
**cryptographic_key** | **character** | Base64 encoded key for client to decrypt lead data. | [optional] 
**cryptographic_algorithm** | **character** | Lead data encryption algorithm. | [optional] 
**created_time** | **integer** | Subscription creation time. Unix timestamp in milliseconds. | [optional] 


