# WWW::OpenAPIClient::Object::LeadSubscriptionPostParams

## Load the model package
```perl
use WWW::OpenAPIClient::Object::LeadSubscriptionPostParams;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | The Ad Account ID that this lead form belongs to. | [optional] 
**api_version** | **string** | API version. | [optional] 
**created_time** | **int** | Subscription creation time. Unix timestamp in milliseconds. | [optional] 
**cryptographic_algorithm** | **string** | Lead data encryption algorithm. | [optional] 
**cryptographic_key** | **string** | Base64 encoded key for client to decrypt lead data. | [optional] 
**id** | **string** | Subscription ID. | [optional] 
**lead_form_id** | **string** | Lead form ID. | [optional] 
**user_account_id** | **string** | User account used to subscribe lead data. | [optional] 
**webhook_url** | **string** | Standard HTTPS webhook URL. | [optional] 
**partner_access_token** | **string** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 
**partner_metadata** | [**PartnerMetadata**](PartnerMetadata.md) | Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. | [optional] 
**partner_refresh_token** | **string** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


