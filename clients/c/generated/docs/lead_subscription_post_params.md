# lead_subscription_post_params_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **char \*** | The Ad Account ID that this lead form belongs to. | [optional] 
**api_version** | **char \*** | API version. | [optional] 
**created_time** | **int** | Subscription creation time. Unix timestamp in milliseconds. | [optional] 
**cryptographic_algorithm** | **char \*** | Lead data encryption algorithm. | [optional] 
**cryptographic_key** | **char \*** | Base64 encoded key for client to decrypt lead data. | [optional] 
**id** | **char \*** | Subscription ID. | [optional] 
**lead_form_id** | **char \*** | Lead form ID. | [optional] 
**user_account_id** | **char \*** | User account used to subscribe lead data. | [optional] 
**webhook_url** | **char \*** | Standard HTTPS webhook URL. | [optional] 
**partner_access_token** | **char \*** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 
**partner_metadata** | [**partner_metadata_t**](partner_metadata.md) \* | Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. | [optional] 
**partner_refresh_token** | **char \*** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


