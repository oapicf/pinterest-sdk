# AdAccountGetSubscriptionResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LeadFormId** | **String** | Lead form ID. | [optional] 
**WebhookUrl** | **String** | Standard HTTPS webhook URL. | [optional] 
**Id** | **String** | Subscription ID. | [optional] 
**UserAccountId** | **String** | User account used to subscribe lead data. | [optional] 
**AdAccountId** | **String** | The Ad Account ID that this lead form belongs to. | [optional] 
**ApiVersion** | **String** | API version. | [optional] 
**CryptographicKey** | **String** | Base64 encoded key for client to decrypt lead data. | [optional] 
**CryptographicAlgorithm** | **String** | Lead data encryption algorithm. | [optional] 
**CreatedTime** | **Int32** | Lead form creation time. Unix timestamp in milliseconds. | [optional] 

## Examples

- Prepare the resource
```powershell
$AdAccountGetSubscriptionResponse = Initialize-PSOpenAPIToolsAdAccountGetSubscriptionResponse  -LeadFormId 383791336903426390 `
 -WebhookUrl https://webhook.example.com/xyz `
 -Id 8078432025948590686 `
 -UserAccountId 549755885175 `
 -AdAccountId 549755885176 `
 -ApiVersion v5 `
 -CryptographicKey ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54 `
 -CryptographicAlgorithm AES-256-GCM `
 -CreatedTime 1699209842000
```

- Convert the resource to JSON
```powershell
$AdAccountGetSubscriptionResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

