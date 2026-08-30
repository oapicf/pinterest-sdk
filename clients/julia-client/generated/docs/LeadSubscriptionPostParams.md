# LeadSubscriptionPostParams


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`ad_account_id`** | **`String`** | The Ad Account ID that this lead form belongs to. | [optional] [default to nothing]
**`api_version`** | **`String`** | API version. | [optional] [default to nothing]
**`created_time`** | **`Int64`** | Subscription creation time. Unix timestamp in milliseconds. | [optional] [default to nothing]
**`cryptographic_algorithm`** | **`String`** | Lead data encryption algorithm. | [optional] [default to nothing]
**`cryptographic_key`** | **`String`** | Base64 encoded key for client to decrypt lead data. | [optional] [default to nothing]
**`id`** | **`String`** | Subscription ID. | [optional] [default to nothing]
**`lead_form_id`** | **`String`** | Lead form ID. | [optional] [default to nothing]
**`user_account_id`** | **`String`** | User account used to subscribe lead data. | [optional] [default to nothing]
**`webhook_url`** | **`String`** | Standard HTTPS webhook URL. | [optional] [default to nothing]
**`partner_access_token`** | **`String`** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] [default to nothing]
**`partner_metadata`** | [**`*PartnerMetadata`**](PartnerMetadata.md) | Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. | [optional] [default to nothing]
**`partner_refresh_token`** | **`String`** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


