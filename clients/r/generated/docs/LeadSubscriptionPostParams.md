# openapi::LeadSubscriptionPostParams


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **character** | The Ad Account ID that this lead form belongs to. | [optional] [Pattern: ^\\d+$] 
**api_version** | **character** | API version. | [optional] 
**created_time** | **integer** | Subscription creation time. Unix timestamp in milliseconds. | [optional] 
**cryptographic_algorithm** | **character** | Lead data encryption algorithm. | [optional] 
**cryptographic_key** | **character** | Base64 encoded key for client to decrypt lead data. | [optional] 
**id** | **character** | Subscription ID. | [optional] [Pattern: ^\\d+$] 
**lead_form_id** | **character** | Lead form ID. | [optional] [Pattern: ^\\d+$] 
**user_account_id** | **character** | User account used to subscribe lead data. | [optional] [Pattern: ^\\d+$] 
**webhook_url** | **character** | Standard HTTPS webhook URL. | [optional] 
**partner_access_token** | **character** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 
**partner_metadata** | [**PartnerMetadata**](PartnerMetadata.md) | Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. | [optional] 
**partner_refresh_token** | **character** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 


