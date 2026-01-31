# openapi::LeadSubscriptionPostParamsCreate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lead_form_id** | **character** | Lead form ID. | [optional] [Pattern: ^\\d+$] 
**webhook_url** | **character** | Standard HTTPS webhook URL. | 
**partner_access_token** | **character** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 
**partner_metadata** | [**LeadSubscriptionPostParamsCreateAllOfPartnerMetadata**](LeadSubscriptionPostParamsCreate_allOf_partner_metadata.md) |  | [optional] 
**partner_refresh_token** | **character** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 


