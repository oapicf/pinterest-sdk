

# LeadSubscriptionPostParams

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String** | The Ad Account ID that this lead form belongs to. |  [optional]
**apiVersion** | **String** | API version. |  [optional]
**createdTime** | **Integer** | Subscription creation time. Unix timestamp in milliseconds. |  [optional]
**cryptographicAlgorithm** | **String** | Lead data encryption algorithm. |  [optional]
**cryptographicKey** | **String** | Base64 encoded key for client to decrypt lead data. |  [optional]
**id** | **String** | Subscription ID. |  [optional]
**leadFormId** | **String** | Lead form ID. |  [optional]
**userAccountId** | **String** | User account used to subscribe lead data. |  [optional]
**webhookUrl** | **String** | Standard HTTPS webhook URL. |  [optional]
**partnerAccessToken** | **String** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. |  [optional]
**partnerMetadata** | [**PartnerMetadata**](PartnerMetadata.md) | Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. |  [optional]
**partnerRefreshToken** | **String** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. |  [optional]




