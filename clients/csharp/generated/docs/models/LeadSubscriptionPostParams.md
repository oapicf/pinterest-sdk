# Org.OpenAPITools.Model.LeadSubscriptionPostParams

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **string** | The Ad Account ID that this lead form belongs to. | [optional] 
**ApiVersion** | **string** | API version. | [optional] 
**CreatedTime** | **int** | Subscription creation time. Unix timestamp in milliseconds. | [optional] 
**CryptographicAlgorithm** | **string** | Lead data encryption algorithm. | [optional] 
**CryptographicKey** | **string** | Base64 encoded key for client to decrypt lead data. | [optional] 
**Id** | **string** | Subscription ID. | [optional] 
**LeadFormId** | **string** | Lead form ID. | [optional] 
**UserAccountId** | **string** | User account used to subscribe lead data. | [optional] 
**WebhookUrl** | **string** | Standard HTTPS webhook URL. | [optional] 
**PartnerAccessToken** | **string** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 
**PartnerMetadata** | [**PartnerMetadata**](PartnerMetadata.md) | Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. | [optional] 
**PartnerRefreshToken** | **string** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

