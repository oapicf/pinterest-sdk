
# LeadSubscriptionPostParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **kotlin.String** | The Ad Account ID that this lead form belongs to. |  [optional]
**apiVersion** | **kotlin.String** | API version. |  [optional]
**createdTime** | **kotlin.Int** | Subscription creation time. Unix timestamp in milliseconds. |  [optional]
**cryptographicAlgorithm** | **kotlin.String** | Lead data encryption algorithm. |  [optional]
**cryptographicKey** | **kotlin.String** | Base64 encoded key for client to decrypt lead data. |  [optional]
**id** | **kotlin.String** | Subscription ID. |  [optional]
**leadFormId** | **kotlin.String** | Lead form ID. |  [optional]
**userAccountId** | **kotlin.String** | User account used to subscribe lead data. |  [optional]
**webhookUrl** | **kotlin.String** | Standard HTTPS webhook URL. |  [optional]
**partnerAccessToken** | **kotlin.String** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. |  [optional]
**partnerMetadata** | [**PartnerMetadata**](PartnerMetadata.md) | Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. |  [optional]
**partnerRefreshToken** | **kotlin.String** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. |  [optional]



