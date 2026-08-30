# LeadSubscriptionPostParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **String** | The Ad Account ID that this lead form belongs to. | [optional] [default to None]
**api_version** | **String** | API version. | [optional] [default to None]
**created_time** | **i32** | Subscription creation time. Unix timestamp in milliseconds. | [optional] [default to None]
**cryptographic_algorithm** | **swagger::Nullable<String>** | Lead data encryption algorithm. | [optional] [default to None]
**cryptographic_key** | **swagger::Nullable<String>** | Base64 encoded key for client to decrypt lead data. | [optional] [default to None]
**id** | **String** | Subscription ID. | [optional] [default to None]
**lead_form_id** | **swagger::Nullable<String>** | Lead form ID. | [optional] [default to None]
**user_account_id** | **String** | User account used to subscribe lead data. | [optional] [default to None]
**webhook_url** | **String** | Standard HTTPS webhook URL. | [optional] [default to None]
**partner_access_token** | **String** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] [default to None]
**partner_metadata** | [***models::PartnerMetadata**](PartnerMetadata.md) | Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. | [optional] [default to None]
**partner_refresh_token** | **String** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


