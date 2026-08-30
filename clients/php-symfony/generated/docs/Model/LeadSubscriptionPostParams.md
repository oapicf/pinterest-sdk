# LeadSubscriptionPostParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **string** | The Ad Account ID that this lead form belongs to. | [optional] 
**apiVersion** | **string** | API version. | [optional] 
**createdTime** | **int** | Subscription creation time. Unix timestamp in milliseconds. | [optional] 
**cryptographicAlgorithm** | **string** | Lead data encryption algorithm. | [optional] 
**cryptographicKey** | **string** | Base64 encoded key for client to decrypt lead data. | [optional] 
**id** | **string** | Subscription ID. | [optional] 
**leadFormId** | **string** | Lead form ID. | [optional] 
**userAccountId** | **string** | User account used to subscribe lead data. | [optional] 
**webhookUrl** | **string** | Standard HTTPS webhook URL. | [optional] 
**partnerAccessToken** | **string** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 
**partnerMetadata** | [**OpenAPI\Server\Model\PartnerMetadata**](PartnerMetadata.md) | Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. | [optional] 
**partnerRefreshToken** | **string** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


