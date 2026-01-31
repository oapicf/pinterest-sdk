# AdAccountCreateSubscriptionResponse
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

## Examples

- Prepare the resource
```powershell
$AdAccountCreateSubscriptionResponse = Initialize-PSOpenAPIToolsAdAccountCreateSubscriptionResponse  -AdAccountId 549755885176 `
 -ApiVersion v5 `
 -CreatedTime 1699209842000 `
 -CryptographicAlgorithm AES-256-GCM `
 -CryptographicKey ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54 `
 -Id 8078432025948590686 `
 -LeadFormId 383791336903426390 `
 -UserAccountId 549755885175 `
 -WebhookUrl https://webhook.example.com/xyz
```

- Convert the resource to JSON
```powershell
$AdAccountCreateSubscriptionResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

