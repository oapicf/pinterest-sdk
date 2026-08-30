# LeadSubscriptionPostParams
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | The Ad Account ID that this lead form belongs to. | [optional] 
**ApiVersion** | **String** | API version. | [optional] 
**CreatedTime** | **Int32** | Subscription creation time. Unix timestamp in milliseconds. | [optional] 
**CryptographicAlgorithm** | **String** | Lead data encryption algorithm. | [optional] 
**CryptographicKey** | **String** | Base64 encoded key for client to decrypt lead data. | [optional] 
**Id** | **String** | Subscription ID. | [optional] 
**LeadFormId** | **String** | Lead form ID. | [optional] 
**UserAccountId** | **String** | User account used to subscribe lead data. | [optional] 
**WebhookUrl** | **String** | Standard HTTPS webhook URL. | [optional] 
**PartnerAccessToken** | **String** | Partner access token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 
**PartnerMetadata** | [**PartnerMetadata**](PartnerMetadata.md) | Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. | [optional] 
**PartnerRefreshToken** | **String** | Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. | [optional] 

## Examples

- Prepare the resource
```powershell
$LeadSubscriptionPostParams = Initialize-PSOpenAPIToolsLeadSubscriptionPostParams  -AdAccountId null `
 -ApiVersion null `
 -CreatedTime null `
 -CryptographicAlgorithm null `
 -CryptographicKey null `
 -Id null `
 -LeadFormId null `
 -UserAccountId null `
 -WebhookUrl null `
 -PartnerAccessToken null `
 -PartnerMetadata null `
 -PartnerRefreshToken null
```

- Convert the resource to JSON
```powershell
$LeadSubscriptionPostParams | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

