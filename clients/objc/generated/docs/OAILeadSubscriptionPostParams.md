# OAILeadSubscriptionPostParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **NSString*** | The Ad Account ID that this lead form belongs to. | [optional] 
**apiVersion** | **NSString*** | API version. | [optional] 
**createdTime** | **NSNumber*** | Subscription creation time. Unix timestamp in milliseconds. | [optional] 
**cryptographicAlgorithm** | **NSString*** | Lead data encryption algorithm. | [optional] 
**cryptographicKey** | **NSString*** | Base64 encoded key for client to decrypt lead data. | [optional] 
**_id** | **NSString*** | Subscription ID. | [optional] 
**leadFormId** | **NSString*** | Lead form ID. | [optional] 
**userAccountId** | **NSString*** | User account used to subscribe lead data. | [optional] 
**webhookUrl** | **NSString*** | Standard HTTPS webhook URL. | [optional] 
**partnerAccessToken** | **NSString*** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 
**partnerMetadata** | [**OAIPartnerMetadata***](OAIPartnerMetadata.md) | Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. | [optional] 
**partnerRefreshToken** | **NSString*** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


