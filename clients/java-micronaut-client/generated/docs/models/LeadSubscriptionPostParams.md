

# LeadSubscriptionPostParams

The class is defined in **[LeadSubscriptionPostParams.java](../../src/main/java/org/openapitools/model/LeadSubscriptionPostParams.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | `String` | The Ad Account ID that this lead form belongs to. |  [optional property]
**apiVersion** | `String` | API version. |  [optional property]
**createdTime** | `Integer` | Subscription creation time. Unix timestamp in milliseconds. |  [optional property]
**cryptographicAlgorithm** | `String` | Lead data encryption algorithm. |  [optional property]
**cryptographicKey** | `String` | Base64 encoded key for client to decrypt lead data. |  [optional property]
**id** | `String` | Subscription ID. |  [optional property]
**leadFormId** | `String` | Lead form ID. |  [optional property]
**userAccountId** | `String` | User account used to subscribe lead data. |  [optional property]
**webhookUrl** | `String` | Standard HTTPS webhook URL. |  [optional property]
**partnerAccessToken** | `String` | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. |  [optional property]
**partnerMetadata** | [`PartnerMetadata`](PartnerMetadata.md) | Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. |  [optional property]
**partnerRefreshToken** | `String` | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. |  [optional property]














