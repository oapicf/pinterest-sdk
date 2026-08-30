# LEAD_SUBSCRIPTION_POST_PARAMS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | [**STRING_32**](STRING_32.md) | The Ad Account ID that this lead form belongs to. | [optional] [default to null]
**api_version** | [**STRING_32**](STRING_32.md) | API version. | [optional] [default to null]
**created_time** | **INTEGER_32** | Subscription creation time. Unix timestamp in milliseconds. | [optional] [default to null]
**cryptographic_algorithm** | [**STRING_32**](STRING_32.md) | Lead data encryption algorithm. | [optional] [default to null]
**cryptographic_key** | [**STRING_32**](STRING_32.md) | Base64 encoded key for client to decrypt lead data. | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | Subscription ID. | [optional] [default to null]
**lead_form_id** | [**STRING_32**](STRING_32.md) | Lead form ID. | [optional] [default to null]
**user_account_id** | [**STRING_32**](STRING_32.md) | User account used to subscribe lead data. | [optional] [default to null]
**webhook_url** | [**STRING_32**](STRING_32.md) | Standard HTTPS webhook URL. | [optional] [default to null]
**partner_access_token** | [**STRING_32**](STRING_32.md) | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] [default to null]
**partner_metadata** | [**PARTNER_METADATA**](PartnerMetadata.md) | Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. | [optional] [default to null]
**partner_refresh_token** | [**STRING_32**](STRING_32.md) | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


