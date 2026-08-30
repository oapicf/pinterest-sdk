
# Table `LeadSubscriptionPostParams`
(mapped from: LeadSubscriptionPostParams)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccountId** | ad_account_id | text |  | **kotlin.String** | The Ad Account ID that this lead form belongs to. |  [optional]
**apiVersion** | api_version | text |  | **kotlin.String** | API version. |  [optional]
**createdTime** | created_time | int |  | **kotlin.Int** | Subscription creation time. Unix timestamp in milliseconds. |  [optional]
**cryptographicAlgorithm** | cryptographic_algorithm | text |  | **kotlin.String** | Lead data encryption algorithm. |  [optional]
**cryptographicKey** | cryptographic_key | text |  | **kotlin.String** | Base64 encoded key for client to decrypt lead data. |  [optional]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Subscription ID. |  [optional]
**leadFormId** | lead_form_id | text |  | **kotlin.String** | Lead form ID. |  [optional]
**userAccountId** | user_account_id | text |  | **kotlin.String** | User account used to subscribe lead data. |  [optional]
**webhookUrl** | webhook_url | text |  | **kotlin.String** | Standard HTTPS webhook URL. |  [optional]
**partnerAccessToken** | partner_access_token | text |  | **kotlin.String** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. |  [optional]
**partnerMetadata** | partner_metadata | long |  | [**PartnerMetadata**](PartnerMetadata.md) | Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. |  [optional] [foreignkey]
**partnerRefreshToken** | partner_refresh_token | text |  | **kotlin.String** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. |  [optional]














