# openapi::AdAccountGetSubscriptionResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lead_form_id** | **character** | Lead form ID. | [optional] [Pattern: ^\\d+$] 
**webhook_url** | **character** | Standard HTTPS webhook URL. | [optional] 
**id** | **character** | Subscription ID. | [optional] [Pattern: ^\\d+$] 
**user_account_id** | **character** | User account used to subscribe lead data. | [optional] [Pattern: ^\\d+$] 
**ad_account_id** | **character** | The Ad Account ID that this lead form belongs to. | [optional] [Pattern: ^\\d+$] 
**api_version** | **character** | API version. | [optional] 
**cryptographic_key** | **character** | Base64 encoded key for client to decrypt lead data. | [optional] 
**cryptographic_algorithm** | **character** | Lead data encryption algorithm. | [optional] 
**created_time** | **integer** | Lead form creation time. Unix timestamp in milliseconds. | [optional] 


